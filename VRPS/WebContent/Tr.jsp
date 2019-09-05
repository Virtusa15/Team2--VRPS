<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><b><font color="blue">Technical Evaluation Form:</font></b></h2></br>
<form method="post" action="Technical"/>
Candidate Name: <span style="margin:29px"><input type="text" name="candidate_name"/></br></br>
Interviewed by: <span style="margin:37px"><input type="text" name="tr_name"/></br></br>
Job Role: <span style="margin:74px"><input type="text" name="role"/></br></br>
<h4><b><font color="red">Performance</font></b></h4>

C/Java:</br></br><span style="margin:29px"><input type="checkbox" name="java_performance" value="poor"/>Poor <span style="margin:29px">
<input type="checkbox" name="java_performance" value="avg"/>average <span style="margin:29px">
<input type="checkbox" name="java_performance" value="good"/>Good <span style="margin:29px">
<input type="checkbox" name="java_performance" value="best"/>Best</br></br>
SQL/PLSQL:</br></br><span style="margin:29px"><input type="checkbox" name="sql_performance" value="poor"/>Poor <span style="margin:29px">
<input type="checkbox" name="sql_performance" value="avg"/>average <span style="margin:29px">
<input type="checkbox" name="sql_performance" value="good"/>Good <span style="margin:29px">
<input type="checkbox" name="sql_performance" value="best"/>Best</br></br>
SE/CN:</br></br><span style="margin:29px"><input type="checkbox" name="se_performance" value="poor"/>Poor <span style="margin:29px">
<input type="checkbox" name="se_performance" value="avg"/>average <span style="margin:29px">
<input type="checkbox" name="se_performance" value="good"/>Good <span style="margin:29px">
<input type="checkbox" name="se_performance" value="best"/>Best</br></br>

<h4><b><font color="red">Ratings</font></b></h4>
<span style="margin:170px">1
<span style="margin:31px">2
<span style="margin:29px">3
<span style="margin:29px">4</br>
Subject Knowledge:<span style="margin:34px"><input type="checkbox" name="subject_knowledge" value="1"/><span style="margin:17px">
<input type="checkbox" name="subject_knowledge" value="2"/> <span style="margin:17px">
<input type="checkbox" name="subject_knowledge" value="3"/><span style="margin:17px">
<input type="checkbox" name="subject_knowledge" value="4"/></br></br>

Presentation Skills:<span style="margin:39px"><input type="checkbox" name="presentation_skills" value="1"/><span style="margin:18px">
<input type="checkbox" name="presentation_skills" value="2"/> <span style="margin:16px">
<input type="checkbox" name="presentation_skills" value="3"/><span style="margin:16px">
<input type="checkbox" name="presentation_skills" value="4"/></br></br>

Overall Score:<span style="margin:70px"><input type="checkbox" name="overall_score" value="1"/><span style="margin:18px">
<input type="checkbox" name="overall_score" value="2"/> <span style="margin:17px">
<input type="checkbox" name="overall_score" value="3"/><span style="margin:15px">
<input type="checkbox" name="overall_score" value="4"/></br></br>

Average Rating:<span style="margin:57px"><input type="checkbox" name="average_rating" value="1"/><span style="margin:17px">
<input type="checkbox" name="average_rating" value="2"/> <span style="margin:18px">
<input type="checkbox" name="average_rating" value="3"/><span style="margin:16px">
<input type="checkbox" name="average_rating" value="4"/></br></br></br>

Reasons for recommending</br> or not Recommending:<span style="margin:28px"><input type="text" name="reasons"/></br></br>
<input type="submit" value="submit"/></span>
</form>
</body>
</html>