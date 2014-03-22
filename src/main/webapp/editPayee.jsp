<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Edit a Payee</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="page" align="center">
  <div id="content" style="width: 800px; font-size: 13px;">
    <div id="header-container">
      <jsp:include page="site-header.jsp"/>
    </div>
    <div id="contenttext">
      <div class="bodytext" style="padding:20px;">
        <h3 align="left" style="color:#CC0000"><strong>Edit an existing Payee</strong></h3>
        <p align="left">Update payee nickname or account numer. Please not that when you change the payee account number, the change will be reflected in the future-dated bill payments associated with the payee</p>
        <br />
        <form name="appPayee" action="#" method="post">
          <fieldset style="text-align:left">
            <table align="center">
              <tr>
                <th align="left">Payee Name:</th>
                <td><input type="text" size="15"></td>
              </tr>
              <tr>
                <th align="left">Account Number:</th>
                <td><input type="text" size="15"></td>
              </tr>
              <tr>
                <th align="left">Nickname:</th>
                <td><input type="text" size="15"></td>
              </tr>
              <tr>
                <td></td>
                <td><button class="btn btn-large btn-primary" type="submit" name="submit" onclick="#">OK</button>
                  &nbsp;&nbsp;&nbsp;&nbsp;
                  <button class="btn btn-large btn-primary" type="reset" name="reset">Reset</button></td>
              </tr>
            </table>
          </fieldset>
        </form>
        <p align="left"><a href="#">Delete this Payee From Your Payee List</a></p>
      </div>
    </div>
    <div id="leftpanel-container">
      <jsp:include page="site-leftpanel.jsp"/>
    </div>
    <div id="footer-container">
      <jsp:include page="site-footer.jsp"/>
    </div>
  </div>
</div>
</body>
</html>