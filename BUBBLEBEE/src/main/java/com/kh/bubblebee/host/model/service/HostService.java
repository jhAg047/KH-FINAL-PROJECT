package com.kh.bubblebee.host.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.bubblebee.board.model.vo.Board;
import com.kh.bubblebee.board.model.vo.Reply;
import com.kh.bubblebee.board.model.vo.Review;
import com.kh.bubblebee.common.PageInfo;
import com.kh.bubblebee.host.model.vo.Aclist;
import com.kh.bubblebee.host.model.vo.Arlist;
import com.kh.bubblebee.host.model.vo.Host;
import com.kh.bubblebee.member.model.vo.Member;

public interface HostService {

	// 호스트 등록시에 입력한 정보로 업데이트
	int updateMemberInfo(Member m);

	// 호스트 정보 추가하기
	int enrollHost(Host h);

	// 호스트 정보 가져오기
	Host selectHost(String hostId);
	
	// 해당 호스트가 작성한 게시글 개수 가져오기
	int getListCount(String hostId);

	// 해당 호스트가 작성한 게시글 가져오기
	ArrayList<Board> selectBoard(PageInfo pi, String hostId);

	// 문의글 작성
	int insertHostQnA(Review r);

	// QnA 개수 
	int selectQnACount(int fno);

	// QnA 목록
	ArrayList<Review> selectQnAList(PageInfo pi, int fno);

	// QnA 삭제
	int deleteQnA(int qno);

	// 문의에 답변 달기 
	int insertHostReply(Reply r);

	// 해당 답변 가져오기
	Reply selectHostReply(Reply r);

	// 답변 목록 가져오기
	ArrayList<Reply> selectReplyList(String hostId);

	// 문의 개수
	int selectQ(String hostId);

	// 답변 개수
	int selectA(String hostId);

	// 호스트 페이지에서 이름,닉네임,전화번호,이메일 업데이트
	int updateMemberProfile(Member m);

	// 호스트 페이지에서 호스트 정보 업데이트
	int updateHostInfo(Host h);

	// 호스트 좋아요 체크
	int hostLikeCheck(HashMap<String, String> map);

	// 호스트 좋아요 삭제
	int deleteHostLike(HashMap<String, String> map);

	// 호스트 좋아요 추가
	int insertHostLike(HashMap<String, String> map);

	// 호스트 개설 보드 개수 카운트
	int getBListCount(HashMap<String, Object> map);

	// 호스트 개설 보드 전체
	ArrayList<Board> hostBoardAll(PageInfo pi, HashMap<String, Object> map);

	// 호스트 프로필에서 좋아요 총 수
	int likeCount(String hostId);

	// 정산 페이징
	int getAclistCount(String hostId);

	// 정산 목록
	ArrayList<Aclist> selectAcList(PageInfo pi, String hostId);

	// 리뷰 개수
	int getArListCount(String hostId);

	// 호스트별 리뷰
	ArrayList<Arlist> selectArList(PageInfo pi, String hostId);

	// 업데이트 하기
	int updateBuyAccount(Aclist list);

	// account 테이블에 추가하기
	int insertAcount(Aclist list);

	// 좋아요 목록 받아오기
	ArrayList<Integer> selectLikeBoard(String userId);


	

	
}
