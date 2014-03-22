<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="../css/style.css" type="text/css" />
<title>Error!</title>
</head>
<body>
<div id="page" align="center">
  <div id="content" style="width: 800px; font-size: 13px;">
    <div id="header-container">
      <jsp:include page="site-header.jsp"/>
    </div>
    <br/>
    <div id="contenttext">
      <div style="padding:50px"> <span class="titletext">OBS Account Locked!</span> </div>
      <div class="bodytext">
        <h3 align="left">Dear OBS Customer:</h3>
        <p class="smallgraytext" align="left">For your security, access to online banking system has been locked due to the number of incorrect login attempts. </p>
        <p class="smallgraytext" align="left">At OBS we care about your security so, for your protection we are proativity notifying this activity.</p>
        <p class="smallgraytext" align="left">Please contact us at <span style="background-color:#FF0"><a
			href="mailto:obs.inse620@gmail.com?Subject=Need%20Help" target="_top">obs.inse620@gmail.com</a></span> to unlock your account.</p>
      </div>
    </div>
    <div id="leftpanel">
      <div align="justify" class="graypanel"> <span class="smalltitle">Remember!</span><br />
        <br />
        <span> You can try to <a href="login.jsp">login</a> <strong>THREE</strong> times before you account being locked.</span><br />
      </div>
      <div align="justify" class="graypanel"> <span class="smalltitle">Login Information</span><br />
        <br />
        <span>Your last logged in to Online Banking System :</span><br/>
        <span class="smallredtext" style="font-size:10px">#########</span> </div>
    </div>
    <div id="footer-container"> <jsp:include page="site-footer.jsp"/></div>
  </div>
</div>
</body>
</html>