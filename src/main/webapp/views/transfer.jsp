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
    </div>
<center>
    <h1 style="color: black;">TRANSFER FORM</h1>&nbsp;&nbsp;&nbsp;
    <table border="1">
        <form action="/transferconfirm" method="GET">
         <tr>   
            <td>Accont Number:</td>
            <td><input type="text" name="accountNumber"></td>
         </tr>
         <tr>   
            <td>Name:</td>
            <td><input type="text" name="name"></td>
         </tr>
         <tr>   
            <td> Password:</td>
            <td><input type="text" name="password"></td>
         </tr>
         <tr>   
            <td> Target Account Number:</td>
            <td><input type="text" name="tacc_no"></td>
         </tr>
         <tr>   
            <td>Amount:</td>
            <td><input type="text" name="accountBalance"></td>
         </tr>
        </table>
         <tr> 
            <td></td>
            <td><input type="submit" value="submit"></td>
            <td><input type="reset" value="clear"></td>
        </tr>
    </form>
</center>
