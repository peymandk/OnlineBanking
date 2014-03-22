<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Make Payments</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="page" align="center">
  <div id="content" style="width: 800px; font-size: 13px;">
    <div id="header-container">
      <jsp:include page="site-header.jsp"/>
    </div>
    <div id="contenttext">
      <div class="bodytext" style="padding:50px;">
        <form name="payment" action="#" method="post">
          <fieldset style="text-align:left">
            <legend>
            <h2 style="color:#CC0000">Make A Payment</h2>
            </legend>
            <table align="center">
              <tr>
                <th align="left">From:</th>
                <td><select>
                    <option value="" disabled="disabled" selected="selected">- Select Account -</option>
                    <option value="Chequing">Chequing</option>
                    <option value="Savings">Savings</option>
                    <option value="Master Card">MasterCard</option>
                  </select></td>
              </tr>
              <tr>
                <th align="left">To:</th>
                <td><select>
                    <option value="" disabled="disabled" selected="selected">- Select Payee -</option>
                    <option value="Chequing">Chequing</option>
                    <option value="Savings">Savings</option>
                    <option value="Master Card">MasterCard</option>
                  </select></td>
              </tr>
              <tr>
                <th align="left">Amount:</th>
                <td>$
                  <input type="text" size="15"></td>
              </tr>
              <tr>
                <td></td>
                <td>&nbsp;&nbsp;&nbsp;
                  <button class="btn btn-large btn-primary" type="submit" name="submit" onclick="#">OK</button>
                  &nbsp;&nbsp;&nbsp;&nbsp;
                  <button class="btn btn-large btn-primary" type="reset" name="reset">Reset</button></td>
              </tr>
            </table>
          </fieldset>
        </form>
        <form>
          <fieldset style="text-align:left">
            <legend>
            <h2 style="color:#CC0000">Payment History</h2>
            </legend>
            <p>
            <h4>Select:
              <select>
                <option value="One">1 Month</option>
                <option value="Two">2 Month</option>
                <option value="Three">3 Month</option>
              </select>
            </h4>
            </p>
            <table style="width:400px" rules="rows" style="border-collapse:collapse" border="1px">
            <tr>
              <th>Ref#</th>
              <th>From</th>
              <th>To</th>
              <th>Amount</th>
              <th>Date</th>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            <tr>
              <td>0001</td>
              <td>Chaquing
                </dr>
              <td>Savings</td>
              <td>$100.00</td>
              <td>Mar.10, 2014</td>
            </tr>
            </table>
          </fieldset>
        </form>
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