<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<link rel="stylesheet" href="../css/style.css" type="text/css" />
	<title>Login to OBS!</title>
</head>
<body>
	<div id="page" align="center">
		<div id="content" style="width: 800px; font-size: 13px;">
			<div id="logo">
				<div style="margin-top: 50px; color: #FFF;" pxclass="whitetitle">
				  <h1><strong>Online </strong><strong>Banking </strong></h1>
				  <h1><strong>System</strong></h1>
				</div>
		  </div>
			<div id="topheader">
				<div align="left" class="bodytext">
					<br />                  
                    <table>
                    <tr><th align="left">Authors:</th></tr>
					<tr>
                    <td>Peyman Kavian</td> 
                    <td>6516033</td>
                    </tr>
					<tr>
                    <td>Hongrui Guan</td>
                    <td>6555195</td>
                    </tr>
                    </table>
				</div>
				<div id="toplinks" class="smallgraytext">
					<a href="login.jsp">Home</a> | <a href="#">Sitemap</a> | <a href="mailto:obs.inse620@gmail.com?Subject=Need%20Help" target="_top">
Contact Us</a>
				</div>
			</div>
			<div id="menu">

			</div>
			<div id="contenttext">
				<div style="padding:10px">
					<span class="titletext">Welcome to OBS!</span>
					</div>
					<div class="bodytext" style="padding:100px;">
                    <form method="post" name="frmLogin" action="mainPage.jsp">
                    <table>
                    <tr>
                    <th>Account:  </th>                  
			<td><input name="loginid" type="text" required="required" autocomplete="off"
				class="input-block-level" placeholder="Username"></td>
                <td width="100px"><a href="register.jsp">rigister a new service?</a></td>
                </tr>
                   <tr>
                   <th>Password:</th>
            <td><input name="password" type="password" required="required" autocomplete="off" 
				class="input-block-level" placeholder="Password"></td></tr>
            </table><br>
              <label class="checkbox"> <input type="checkbox" value="remember-me">Remember account</label>
			 <button class="btn btn-large btn-primary" type="submit" name="submit" onclick="return validateLogin()">Login</button>&nbsp;
              <button class="btn btn-large btn-primary" type="reset" name="reset">Reset</button>
		</form>
				</div>
			</div>
		<script language="javascript">
        function validateLogin(){
			}
        </script>
			<div id="footer" class="smallgraytext">
				<a href="login.jsp">Home</a> | <a href="#">About Us</a> | <a href="mailto:obs.inse620@gmail.com?Subject=Need%20Help" target="_top">
Contact Us</a> | INSE6260
				&copy; 2014 | <a href="http://users.encs.concordia.ca/~dssouli/teaching.html" target="_blank">Software Quality Assurance</a> 
			</div>
		</div>
</div>
</body>
</html>