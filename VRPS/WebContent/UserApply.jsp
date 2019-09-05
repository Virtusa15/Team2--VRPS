<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<style>
body{
border: 50px;
padding: 40px;
}
</style>
</head>
<body >
<h3><b><font color="blue">Application Form:</font></b></h3>
<form  method="post"  action="UserRegister">
<h5><b><font color="red">Perasonal Details:</font></b></h5>
Name: <span style="margin:29px"></span> 
<select name="dan" > 
<option value="mr,ms">select</option><option value="Mr.">Mr.</option> <option value="Ms.">Ms.</option>
</select> <span style="margin:20px"></span>
<input type="text" placeholder="FirstName" name="fname" required/> <span style="margin:20px"></span>
<input type="text" placeholder="MiddleName" name="mname"/><span style="margin:20px"></span>
<input type="text" placeholder="LastName" name="lname" required/><span style="margin:25px"></span></br><br>




Father'sName: <span style="margin:4px"></span>
<select name="cha"> 
<option value="fmr,fms">selcet</option><option value="Mr.">Mr.</option> <option value="Ms.">Ms.</option><span style="margin:20px"></span>
</select><span style="margin:20px"></span>
<input type="text" placeholder="FirstName" name="ffname"/><span style="margin:20px"></span>
<input type="text" placeholder="MiddleName" name="fmname"/><span style="margin:20px"></span>
<input type="text" placeholder="LastName" name="flname"/><span style="margin:25px"></span></br><br>


 <br><br>




Gender:<span style="margin:25px"></span> <input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female"> Female<br>



   <h5><b><font color="red">Address:</font></b></h5>
  House No/Apartment  <input type="text" name=hname  /><br><br>
  
  
Road/Street: <span style="margin:40px"></span>
  <input type="text" name="street" />
  <span style="margin:42px"></span>
 State:<span style="margin:15px"></span>
 <input type="text" name="tc" /><br><br>
  


 Country: <span style="margin:52px"></span>
	<select name="country"><option value="-1">select</option>
	<option value="AU">Australia</option>
	<option value="CO">Colombiayhhtfhdegh</option>
	<option value="GR">Greece</option>
	<option value="GL">Greenland</option>	
	<option value="IN">India</option>	
	<option value="OM">Oman</option>
	<option value="CH">Switzerland</option>
	<option value="UK">United Kingdom</option>
	<option value="US">United States</option>
	<option value="ZM">Zambia</option>
	<option value="zim">Zimbabwe</option>
</select><br><br>
City:<span style="margin:66px"></span><input type="text" name="city"/><span style="margin:41px"></span>
Pincode:<span style="margin:7px"></span><input type="text" name="pin" size="18"/><br><br>



<h5><b><font color="red">Contact Details:</font></b></h5>


Email id:<span style="margin:37px"></span><input type="text" name="email" size="25" /><span style="margin:25px"></span>
Mobile Number:<span style="margin:7px"></span><input type="number" name="num1" placeholder="91+" size="1"/><input type="number" name="num" size="15"/>







<h5><b><font color="red">Educational Details:</font></b></h5>
Highest Qualification:<span style="margin:7px"></span><select name="ck"><option value="-1">select</option><option value="B">Btech/BA</option>
	<option value="Mtech">Mtech</option>
	<option value="mba">MBA</option>
	<option value="degree">Degree</option>
	</select><span style="margin:12px"></span>
Year Of Passing:<span style="margin:7px"></span><select name="n"><option value="-1">select</option>
	<option value="20">2020</option>
	<option value="19">2019</option>
	<option value="18">2018</option>
	<option value="17">2017</option></select><span style="margin:12px"></span>
	Academic %:<span style="margin:5px"></span><input type="text" name="nu" size="5"/><br><br>
	Specilization :<span style="margin:33px"></span><select name="h"><option value="-1">select</option><option value="cse">CSE</option>
	<option value="ece">ECE</option>
	<option value="eee">EEE</option>
	<option value="it">IT</option></select><span style="margin:23px"></span>
	Languages known:<span style="margin:5px"></span><input  type="text" name="lang"/><br><br>
	
	
	
	
	Experience:
<span style="margin:39px"></span><select name="Experience"><option value="-1">select</option>
	<option value="0">0</option>
	<option value="1">1</option>
	<option value="2">2</option></select></br><br>
	


<input type="submit" value="submit">
</body>
</html>