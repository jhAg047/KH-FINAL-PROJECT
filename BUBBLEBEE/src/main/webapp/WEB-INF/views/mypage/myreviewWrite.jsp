<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>후기</title>
</head>
<style>
#main_hr{margin-top: 40px;margin-bottom: 40px;border: 0;border-top: 1px solid #eee;}
#content{display: flex;align-items: flex-start;}
section>nav{-webkit-box-flex: 0;flex-grow: 0;flex-shrink: 0;flex-basis: 18%;max-width: 130px;}
#c_body{flex-grow: 2;margin-left: 30px;width: 900px;}
.c_list{display: inline;margin-right: 50px;font-size: 20px;}
.c_list a{color: black;}
.c_list a:hover{text-decoration: none;color: black;cursor: pointer;}

#review a, #l_review a{font-weight: bold;color: gold;}
#review_all{margin-top: 30px;}
#review_wrap{display: flex;border: 1px solid #eee;padding:20px 10px;margin-bottom: 20px;}
.per_review{display: flex;width: 95%;}
.per_info{display: flex;flex-direction: column;margin:auto 10px;flex-grow: 1;font-size: 15px;}
.agreeBtn{border:none; border-radius:5px; font-weight:bold; width:80px; height:35px;font-size:15px; background-color: #f39c12;}
#btnbox{margin-left:83%;}
</style>
<body>
   <header id="header">
     <c:import url="../layout/header.jsp"/>   
      </header>
   <section style="padding-top: 115px; padding-left: 20%; width: 78%;">
    <header>
     <c:import url="../layout/mypage_header.jsp"/> 
     </header>
   	<hr id="main_hr">
    <div id="content">
	 	<nav>
	   		<c:import url="../layout/mypage_nav.jsp"/> 
	   </nav>
	    <div id="c_body">
			<div id="content_list">
          	 <form action="reviewInsert.mg" id="frm" method="post">
<%--           		 <input name="bno" hidden value="${review.qno }"> --%>
	             <input type="text" id="title" name="title" placeholder="제목" style="height: 40px;" size="50">
	             <br><br>
	             <textarea id="content" name="content" rows="20" cols="" style="width: 100%; resize: none;"></textarea><br>
	             <div id="btnbox">
		             <button class="agreeBtn" type="button" id="cancel" onclick="history.go(-1)">취소</button>&nbsp;&nbsp;
		             <button class="agreeBtn" id="save" type="button">작성</button>
	             </div>
             </form>
          </div>
		    
		 </div>
	</div>
          
	</section>
   
   <footer id="footer" style="padding-top: 115px;">
     <c:import url="../layout/footer.jsp"/>
   </footer>
   
</body>
</html>