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
            text-align: left
        }
        .footer {
            background-color: #f1f1f1;
            padding: 10px;
        }
        h1 {
            color: darkblue;
        }

        input[type=text], select {
            width: 100%;
            height: 150px;
            padding: 12px 20px;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
            background-color: #f8f8f8;
            resize: none;

        }

        input[type=submit] {
            width: 10%;
            background-color:mediumorchid;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            resize: none;
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
    <h1>My Prom.ua</h1>

</div>

<div class="content">

    <form action="addAdvertisement" method="post">
        <label for="advertisement">advertisement</label><br>
        <input type="text" id="advertisement" name="advertisement" placeholder="Your advertisement.."><br>
        <input type="submit" value="Submit">
        <input type="reset" value="Delete" >
    </form>

</div>
<div class="footer">
    <p>Footer</p>
</div>
</body>
</html>