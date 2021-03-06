<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet"  href= "<%= request.getContextPath() %>/resources/css/PurchaseConfirm.css" type = "text/css">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap" rel="stylesheet">
<title>버블비</title>
<link rel = "shortcut icon" href = "<%= request.getContextPath() %>/resources/images/꿀벌.png" type = "image/x-icon">
<style>
#header{
	position: fixed;
	width : 100%;
}
</style>
</head>
<body>
	<header id="header">
		<%@ include file = "../layout/header.jsp" %> 	
		
	</header>
	
		<form id = "submitForm"  action = "mypaid.mg" method = "post" >
			<section id = "submitFormSection">
				<div id = "submitFormSectionMain">
					<h3 id = "submitFormSectionMainH">
						결제가 완료되었습니다!
					</h3>
					<div class = "submitFormSectionMainD">
						<hr id = "submitFormSectionMainDH">
					</div>
					<div id = "submitFormSectionMainProduct">
						<!-- <img id = "submitFormSectionMainImg" src = "">  -->
						<img id="submitFormSectionMainImg" width="100%" height="200" class="logoImg" src="${contextPath }/resources/buploadFiles/${ b.renamefilename }" />
						<input class = "submitFormSectionMainProductInput" type = "text" readonly value = "${b.small_title }">
						<input class = "submitFormSectionMainProductInput" type = "text" style = "font-weight : 600;" readonly value = "${b.ftitle }">
						<input class = "submitFormSectionMainProductInput" type = "text" readonly value = "${c.price }원">
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : 20px;">
						<hr id = "submitFormSectionMainDH">
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : -30px;">
						<input class = "submitFormSectionMainIntro" type = "text" value = "선택옵션" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = " ${c.oname }" readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "수량" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.ocode } 개" readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "옵션합계" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = " ${ p.ocode * c.price }원" readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "할인금액" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.ocode * c.price - p.gpay} 포인트 " readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "최종금액" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gpay } 원" readonly>
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : 60px;">
						<hr id = "submitFormSectionMainDH">
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : -20px;">
						<input class = "submitFormSectionMainIntro" type = "text" value = "수신자명" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gname }" readonly>
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : 40px;" >
						<input class = "submitFormSectionMainIntro" type = "text" value = "전화번호" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gphone }" readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "결제 금액" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gpay } 원" readonly>
					</div>
					<div class = "submitFormSectionMainD">
						<input class = "submitFormSectionMainIntro" type = "text" value = "메세지" readonly>
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gmsg }" readonly>
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : 60px;">
						<hr id = "submitFormSectionMainDH">
					</div>
					<div class = "submitFormSectionMainD" style = "margin-top : -40px;">
						<input class = "submitFormSectionMainIntro" type = "text" value = "배송지"readonly style = "margin-top : 10px;">
						<input class = "submitFormSectionMainData" type = "text" value = "${p.gaddress }"readonly style = "width : 90%; margin-top : 10px;">
						<input class = "submitFormSectionMainIntro" type = "text" value = "잔여포인트 " style = "margin-top : 46px;">
						<input class = "submitFormSectionMainData" type = "text" value = "${pp } 포인트" style = "margin-top : 46px;" readonly>
					</div>
					<div>
						<input  class = "submitBtn" type = "submit" value = "결제내역 보기" style = "background-color : #F39C12; color : white;">
					</div>
				</div>
			</section>
		</form>
</body>
</html>