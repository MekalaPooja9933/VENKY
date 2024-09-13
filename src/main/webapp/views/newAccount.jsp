<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Service</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            background-image:url("https://t4.ftcdn.net/jpg/01/11/64/87/240_F_111648711_npwCYj3lOmiqkOGTi2iAhDpXg7oddijH.jpg");
        }

        header {
            background-color: #333;
            color: #fff;
            text-align:center;
            padding:0px;
            height:50px;
            display:flex;
            justify-content:center;            }
            form{
            margin-top:100px;
            }
            a{
       color:#c23910;
       text-decoration:none;
       margin-left: auto;
       margin-right:20px;
       }
               
           </style>
</head>

<body>
     <header>
        <h2 style="margin-left:auto">New Account</h2>
        <a  href="/"><h4>Home</h4></a>
    </header>
   <nav>
<center>
<form action="/register">
    <table>
     <tr>
            <td>Account Number:</td>
            <td><input type="text" name="act_num"/></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name="password"/></td>
        </tr>
         <tr>
            <td>Conform Password:</td>
            <td><input type="password" name="cpassword"/></td>
        </tr>
        <tr>
            <td>Amount:</td>
            <td><input type="text" name="amount"/></td>
        </tr>
         <tr>
            <td>Address:</td>
            <td><input type="text" name="address" /></td>
        </tr>
        <tr>
        <td>Mobile Number:</td>
        <td><input type="text" name="mbnum"/></td>
        <tr>
        <td><input type="submit" value="submit"/><td>
        </tr>
        </table> 
        </form>
        </center>    
        </body>
        </html>
       
