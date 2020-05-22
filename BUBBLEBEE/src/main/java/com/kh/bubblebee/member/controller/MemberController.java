package com.kh.bubblebee.member.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kh.bubblebee.member.model.service.MemberService;
import com.kh.bubblebee.member.model.vo.Member;

@SessionAttributes("loginUser")
@Controller
public class MemberController {

	@Autowired
	private MemberService mService;
	
	@RequestMapping("loginView.me")
	public String enrollView() {
		return "login";
	}
	
	@RequestMapping("emailLoginView.me")
	public String emailLoginView() {
		return "emailLogin";
	}
	
	@RequestMapping("findPwdView.me")
	public String findPwdView() {
		return "findPwd";
	}
	
	@RequestMapping("signUpView.me")
	public String signUpView() {
		return "signUp";
	}
	
	@RequestMapping(value="callbackView.me", method=RequestMethod.GET)
	public ModelAndView callbackView(@RequestParam(value="code", required = false) String code, @RequestParam(value="state", required = false) String state, ModelAndView mv) {
		mv.addObject("state", state);
		mv.addObject("code",code);
		mv.setViewName("callback");
		return mv;
	}
	
	@RequestMapping("naver.me")
	public ModelAndView naverLogin(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelAndView mv) {
		session = request.getSession();
		
        String token = (String)session.getAttribute("access_token");// 네이버 로그인 접근 토큰;
        String header = "Bearer " + token; // Bearer 다음에 공백 추가
        try {
            String apiURL = "https://openapi.naver.com/v1/nid/me";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", header);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer res = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
            	res.append(inputLine);
            }
            br.close();
            
            JSONParser parser = new JSONParser();
            JSONObject result = (JSONObject)parser.parse(res.toString());
            
            // 이름, 프로필, 이메일
            String id = (String)((JSONObject)result.get("response")).get("id");
            String email = (String)((JSONObject)result.get("response")).get("email");         
            String name = (String)((JSONObject)result.get("response")).get("name");
            String profileimage = (String)((JSONObject)result.get("response")).get("profileimage");
            
            System.out.println(id);
            System.out.println(email);
            System.out.println(name);
            System.out.println(profileimage);
            Member loginUser = mService.checkMember(id);
            if(loginUser != null) {
    			session.setAttribute("loginUser", loginUser);
    			session.setMaxInactiveInterval(6000);
    			mv.setViewName("redirect:home.do");
            } else {
            	mv.addObject("id",id);
            	mv.addObject("email",email);
            	mv.addObject("name",name);
            	mv.addObject("profileimage",profileimage);
            	mv.setViewName("signUp");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return mv;
	}
}
