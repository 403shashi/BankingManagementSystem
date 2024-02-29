
<style>
    .navbar{
        width: 100%;
    height: 80px;
    background-color: green;
    font-size:xx-large;
    }
</style>

<center>
    <img src="OIP.jpeg">
    </center>
    <div class="navbar">
        <a href="/home">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/newAccount">NewAccount</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/closeAccount">closeAccount</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/aboutus">Aboutus</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </div><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>         
<center>
    <h1>TRANSFER  RESULT DETAILS</h1>
<form>
    <table border="1">
        <center>
            <body bgcolor="lightgreen"></body>
            My Account Number is.....${AccountDetails.accountNumber}<p></p>
            My Account Balance is.....${AccountDetails.accountBalance}<p></p>
            Transfer Amount is.....${accountBalance}<p></p>
            Target Account Number is....${acc1.accountNumber}<p></p>
            Target Account Balance is....${acc1.accountBalance-accountBalance}<p></p>
            After Transfer Target Account Balance is.....${acc1.accountBalance}<p></p>
            </center>

</table>
</form>
</center>
<center>
 