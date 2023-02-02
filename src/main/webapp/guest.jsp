<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%
ArrayList<String[]> list = (ArrayList<String[]>) request.getAttribute("guests");
%>

<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<title>카드연체시스템 검색화면</title>
<link rel="stylesheet" href="style.css">
<script src="jquery-3.4.1.js"></script>
<script type="text/javascript">
	window.onbeforeunload = function() {
	};

	function disp() {

		radio = document.getElementsByName("radiobutton");
		var idx;
		for (i = 0; i < radio.length; i++) {
			if (radio[i].checked) {
				idx = i;
				break;
			}
		}
		alert(idx);
	}
</script>
</head>
<body>
	<div class="background">
		<form method="post" action="./Search.do">
			<section class="login-form">
				<div class="table_header">
					<h2 style="color: #fff;">
						<a onClick="window.load()" style="cursor: pointer;">카드연체시스템</a>
					</h2>
					<div class="cardnum">
						<div class="btn-style">
							<input type="text" name="cardNum" placeholder="카드번호">
							<button type="submit">Search</button>
						</div>
					</div>
				</div>
		</form>
		<div class="table_header">
			<form method="post" action="./Edit.do">
					<div class="table_section">
						<table>
							<thead>
								<tr>
									<th scope="col">선택</th>
									<th scope="col">카드번호</th>
									<th scope="col">이름</th>
									<th scope="col">가타카나</th>
									<th scope="col">성별</th>
									<th scope="col">주소</th>
									<th scope="col">생일</th>
									<th scope="col">메일주소</th>
									<th scope="col">주소확인</th>
									<th scope="col">발생금액</th>
									<th scope="col">발생일</th>
								</tr>
								<%
								for (int i = 0; i < list.size(); i++) {
								%>
								<%
								String[] data = list.get(i);
								out.print("<tr><td>");
								out.print("<input type='radio' name='radiobutton' value='" + i + "'>");
								out.print("<td>" + data[0] + "</td>");
								out.print("<td>" + data[1] + "</td>");
								out.print("<td>" + data[2] + "</td>");
								out.print("<td>" + data[3] + "</td>");
								out.print("<td>" + data[4] + "</td>");
								out.print("<td>" + data[5] + "</td>");
								out.print("<td>" + data[6] + "</td>");
								out.print("<td>" + data[7] + "</td>");
								out.print("<td>" + data[8] + "</td>");
								out.print("<td>" + data[9] + "</td></tr>");

								out.print("<input type='hidden' name='cardnum" + i + "'           value='" + data[0] + "'>");
								out.print("<input type='hidden' name='name" + i + "'                  value='" + data[1] + "'>");
								out.print("<input type='hidden' name='katakana" + i + "''            value='" + data[2] + "'>");
								out.print("<input type='hidden' name='seibetu" + i + "'                value='" + data[3] + "'>");
								out.print("<input type='hidden' name='address" + i + "'                value='" + data[4] + "'>");
								out.print("<input type='hidden' name='birth" + i + "''          value='" + data[5] + "'>");
								out.print("<input type='hidden' name='mailaddr" + i + "'             value='" + data[6] + "'>");
								out.print("<input type='hidden' name='adoresukakguin" + i + "'   value='" + data[7] + "'>");
								out.print("<input type='hidden' name='gigaku" + i + "'                  value='" + data[8] + "'>");
								out.print("<input type='hidden' name='haeshituke" + i + "'                  value='" + data[9] + "'>");

								}
								%>
								</tr>
							</thead>
						</table>
						<div class="edit_btn">
							<button type="submit" onClick="disp()">수정</button>
						</div>
						</div>	
					</div>
				</section>
			</form>
	</div>
	<!--  		<div class="pagination">
				<div><<</div>
				<div><</div>
				<div>1</div>
				<div>2</div>
				<div>></div>
				<div>>></div>
		</div>
-->
</body>
</html>