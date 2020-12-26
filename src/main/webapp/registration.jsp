<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>registration</title>
    <meta charset="utf-8">
    <style>
        * {
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }

        .topnav {
            overflow: hidden;
            background-color: mediumorchid;
        }

        .topnav a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }
        .content {
            background-color: lavender;
            padding: 10px;
            height: 500px;
        }
        .footer {
            background-color: #f1f1f1;
            padding: 10px;
        }
        h1{
            color: darkblue;
        }
        input[type=text], select {
            width: 30%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid skyblue;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 10%;
            background-color:mediumorchid;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=reset] {
            width: 10%;
            background-color:mediumorchid;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button{
            width: 30%;
            background-color:mediumorchid;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
        }
        a:link, a:visited {

            text-decoration: none;
            display: inline-block;
        }
    </style>
</head>
<body>

<div class="topnav">
    <h1>Seller registration</h1>

</div>

<div class="content">

    <form action="addSeller" method="post">
        <label for="fname">First Name</label><br>
        <input type="text" id="fname" name="firstname" placeholder="Your name.."><br>

        <label for="lname">Last Name</label><br>
        <input type="text" id="lname" name="lastname" placeholder="Your last name.."><br>

        <label for="PhoneNumber">Phone number</label><br>
        <input type="text" id="PhoneNumber" name="PhoneNumber" placeholder="Your phone number.."><br>

        <label for="password">Password</label><br>
        <input type="password" id="password" name="password" placeholder="Your phone password.."><br>

        <input type="submit" value="Submit">
        <input type="reset" value="Delete" >
    </form>

</div>
<div class="footer">
    <p>Footer</p>
</div>
</body>
</html>