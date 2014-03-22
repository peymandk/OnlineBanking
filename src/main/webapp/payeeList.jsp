<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Manage Payee List</title>
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
        <h3 align="left" style="color:#CC0000"><strong>Manage Payee List</strong></h3>
        <p align="left">Update the companies(payees) you want to be able to pay using Online Banking System. To make changes to a payee, such as an account number or nickname, click the link of each payee.</p>
        <br />
        <form name="payeeList" action="editPayee.jsp" method="post">
          <table rules="rows" style="border-collapse:collapse" border="1px">
            <tr>
              <th width="250px">Payee</th>
              <th width="250px">Account#</th>
              <th width="250px">Nickname</th>
            </tr>
            <tr>
              <td><a href="editPayee.jsp">###</a></td>
              <td align="center">###</td>
              <td align="center">###</td>
            </tr>
            <tr>
              <td><a href="editPayee.jsp">###</a></td>
              <td align="center">###</td>
              <td align="center">###</td>
            </tr>
          </table>
        </form>
        <a href="addPayee.jsp" style="text-decoration:none">
        <h5 align="left" style="color:#CC0000">Add a New Payee?</h5>
        </a> </div>
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