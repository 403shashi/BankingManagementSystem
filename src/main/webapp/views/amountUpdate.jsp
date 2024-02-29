
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
<form>
    <table border="1">
    <tr>
        <td>
            Before Deposit accountBalance:${details.accountBalance -accountBalance}<p></p>
        </td>
           </tr>
    <tr>
           <td>
            My Deposit accountBalance:${accountBalance}<p></p><p></p><p></p>
           </td>
    </tr>
    <tr>
        <td>
         After Deposit accountBalance:${details.accountBalance}<p></p>
        </td>
    </tr>
        
    </tr>
</table>
</form>
</center>
