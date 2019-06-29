<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>

 <head>

      <title> 회원가입 </title>
<script language="javascript" src="Join_Function.js" >
    
  </script>
 </head>
<form name = "soin"  onsubmit="return enroll();" action="JoinCheck.jsp" method="post" enctype="text/plain">
<body>
 
<table width="700" height="50" bordercolor="#4B8A08" 
border="1" align="center" cellpading="5" cellspacing="1">
<tr>
<td Colspan="4" align="center" Bgcolor="#B4045F" ><BIG><B>회원 기본 정보</B></BIG></td>
</tr>

<tr>
<td align="center"><B>아이디:</B>
<td Colspan="3">
<input type = "text" name="id" size="20" minilength = "4" maxlength = "12" id = "idd">&nbsp;4~12자의 영문 대소문자와 숫자로만 입력
</tr>

<tr>
<td align="center"><B>비밀번호:</B>
<td Colspan="3">
<input type = "password" id="pw1" name="pw1" size="20">&nbsp;4~12자의 영문 대소문자와 숫자로만 입력
</tr>

<tr>
<td align="center"><B>비밀번호확인:</B>
<td Colspan="3">
<input type = "password" id="pw2" name="pw2" size="20">&nbsp;
</tr>

<tr>
<td align="center"><B>메일주소:</B>
<td Colspan="3">
<input type = "text" id="email" name="email" size="25">&nbsp;예) id@domain.com
</tr>

<tr>
<td align="center"><B>이름:</B>
<td Colspan="3">
<input type = "text" name="name" size="25">
</tr>

<tr>
<td Colspan="4" align="center" Bgcolor="#B4045F" ><BIG><B>개인 신상 정보</B></BIG></td>
</tr>

<tr>
<td align="center"><B>주민등록번호:</B>
<td Colspan="3">
<input type = "text" id="num1" maxlength="6" name="num1" size="10"> - <input type = "password" id="num2" maxlength="7" name="num2" size="15">&nbsp;예) 123456-1234567
</tr>

<tr>
<td align="center"><B>생일:</B>
<td Colspan="3">
<input type = "text" id="year"name="year" size="7">년
<select id = "month" name="month" >
<option value="01">1</option>
<option value="02">2</option>
<option value="03">3</option>
<option value="04">4</option>
<option value="05">5</option>
<option value="06">6</option>
<option value="07">7</option>
<option value="08">8</option>
<option value="09">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>월
<select id="day" name="day" >
<option value="01">1</option>
<option value="02">2</option>
<option value="03">3</option>
<option value="04">4</option>
<option value="05">5</option>
<option value="06">6</option>
<option value="07">7</option>
<option value="08">8</option>
<option value="09">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>

</select>일
</tr>

<tr>
<td align="center"><B>관심분야:</B>
<td Colspan="3">
<input type="checkbox" name="inter" value="computer">컴퓨터
<input type="checkbox" name="inter"  value="internet">인터넷
<input type="checkbox" name="inter"  value="travel">여행
<input type="checkbox" name="inter"  value="movie">영화감상
<input type="checkbox" name="inter"  value="music">음악감상
</tr>

<tr>
<td align="center"><B>자기소개:</B>
<td Colspan="3">
<textarea id="intro" name="intro" cols="75" rows="5"></textarea>
</tr>
</table><br>


<center>
<input type="submit" value="회원가입"  >
<input type="reset" value="다시입력">

</center>
</form>

</body>

</html>