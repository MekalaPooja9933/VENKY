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
            background-image:url("https://www.shutterstock.com/shutterstock/photos/1858855108/display_1500/stock-photo-modern-artwork-on-white-canvas-digital-brush-strokes-like-oil-painting-vibrant-paint-background-1858855108.jpg");
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
        <h2 style="margin-left:auto">Login</h2>
        <a  href="/"><h4>Home</h4></a>
    </header>
   <nav>
<center>
<form action="/reset">
<table>
<tr>
<td>Account No:</td>
<td><input type="text" name="act_num"></td>
</tr>
<tr>
<td>name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="clear"></td>
</tr>
</table>
</form>
</center>
</nav>
</body>
</html>
