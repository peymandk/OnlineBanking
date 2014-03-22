<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome to OBS!</title>
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
        <h3 align="left" style="color:#CC0000"><strong>My Account Summary</strong></h3>
        <ul>
          <li style="float:left">Bank Accounts</li>
          <br />
          <table rules="rows" style="border-collapse:collapse" border="1px">
            <tr>
              <th width="250px">Account Type</th>
              <th width="250px">Account#</th>
              <th width="250px">Totals</th>
            </tr>
            <tr>
              <td><a href="accountDetail.jsp">###</a></td>
              <td align="center">###</td>
              <td align="center">###</td>
            </tr>
            <tr>
              <td><a href="accountDetail.jsp">###</a></td>
                 <td align="center">###</td>
              <td align="center">###</td>
         </tr>
          </table><br />
          <li style="float:left">Investments</li>
          <br />
          <table rules="rows" style="border-collapse:collapse" border="1px">
            <tr>
              <th>Investment Type</th>
              <th width="250px">Account#</th>
              <th width="250px">Totals</th>
            </tr>
            <tr>
              <td><a href="investmentDetail.jsp">###</a></td>
              <td align="center">###</td>
              <td align="center">###</td>
            </tr>
            <tr>
              <td><a href="investmentDetail.jsp">###</a></td>
              <td align="center">###</td>
              <td align="center">###</td>
            </tr>
          </table>
        </ul>
      </div>
    </div>
<div id="leftpannel-container">
<jsp:include page="site-leftpanel.jsp"/>
</div>
<div id="footer-container">
<jsp:include page="site-footer.jsp"/>
</div>
  </div>
</div>
</body>
</html>