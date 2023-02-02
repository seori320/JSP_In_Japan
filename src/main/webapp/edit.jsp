<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
	
	<% 

	String cardNum = (String) request.getAttribute("cardNum");
	String name = (String) request.getAttribute("name");
	String katakana =  (String) request.getAttribute("katakana");
	String seibetu = (String) request.getAttribute("seibetu");
	String address = (String) request.getAttribute("address");
	String birth =(String) request.getAttribute("birth");
	String mailAddr =(String) request.getAttribute("mailAddr");
	String adoresuKakguin = (String) request.getAttribute("adoresuKakguin");
	String gigaku = (String) request.getAttribute("gigaku");
	String haeshituke =(String) request.getAttribute("haeshituke");
	%>
<html lang="ko">
	<head>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8"/>
		   <title>고객 정보 등록</title>
		   <link rel="stylesheet" href="edit_style.css">
			<script src="jquery-3.4.1.js"></script>
		    <style type="text/css">
		    </style>
	</head>
	<body style="width:1330px; height:600px;">
			<h2 style="margin-top : 50px; color: #fff;">고객 정보 등록</h2>
			<div class="edit">
			<span style="position:absolute; top:149px; left:164px; font-size: 18px;">
				카드 번호
			</span>
			<span style="position:absolute; top:139px; left:305px; 	font-size: 18px;  ">
				<p><input type="text" name="cardNum" value=<%=cardNum%> size=""></p>
			</span>								
			<span style="position:absolute; top:207px; left:176px; 	font-size: 18px; ">
				이름
			</span>
			<span style="position:absolute; top:197px; left:305px; ">
				<p><input type="text" name="name" value=<%=name%> size=""></p>
			</span>
			<span style="position:absolute; top:264px; left:176px; 	font-size: 18px; ">
				성별
			</span>
			<div >
			<span style="position:absolute; top:254px; left:176px; ">
				<input  type="radio"name="gender" value="man" size="">남
	   			<input  type="radio"name="gender" value="woman" size="">여
			</span>
			</div>
			<span style="position:absolute; top:302px; left:305px; 	font-size: 18px; ">
				<p><input type="text" name="address" value=<%=address%> size=""></p>
			</span>
			<span style="position:absolute; top:312px; left:176px; 	font-size: 18px; ">
				거주지
			</span>
			<span style="position:absolute; top:369px; left:148px; 	font-size: 18px; ">
				이메일 주소
			</span>
			<span style="position:absolute; top:359px; left:305px; ">
				<p><input type="text" name="mailAddr" value=<%=mailAddr%> size=""></p>
			</span>
			<span style="position:absolute; top:149px; left:722px;  font-size: 18px; ">
				생년월일
			</span>
			<span style="position:absolute; top:139px; left:857px; ">
				<p><input type="text" name="birth" value=<%=birth%> size=""></p>
			</span>
			<span style="position:absolute; top:207px; left:729px; 	font-size: 18px;">
				가타카나
			</span>
			<span style="position:absolute; top:197px; left:857px; ">
				<p><input type="text" name="katakana" value=<%=katakana%> size=""></p>
			</span>
			<span style="position:absolute; top:264px; left:726px; 	font-size: 18px;">
				발생일
			</span>
			<span style="position:absolute; top:254px; left:857px;">
				<p><input type="text" name="haeshituke" value=<%=haeshituke%> size=""></p>
			</span>
			<span style="position:absolute; top:312px; left:722px; 	font-size: 18px;">
				발생금액
			</span>
			<span style="position:absolute; top:312px; left:857px;">
				<p><input type="text" name="gigaku" value=<%=gigaku%> size=""></p>
			</span>
			<span style="position:absolute; top:379px; left:713px; 	font-size: 18px;">
				주소 확인
			</span>
			<span style="position:absolute; top:369px; left:857px;">
					<p><input type="text" name="AdoresuKakguin" value=<%=adoresuKakguin%> size=""></p>
			</span>
			<div class="btn_signup" style="position:absolute; top:440px; right:220px;">
				<button type="submit">등록</button>
			</div>
	</div>
	</body>
</html>
