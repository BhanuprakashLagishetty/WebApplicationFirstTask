
<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>
        <h2>Alien Details</h2>

         <form action="progressreport">
            <label for="pname">Enter Your name :</label>
                <input type="text" id="pname" name="pname"><br>

                <label for="spring">Enter your spring marks :</label>
                <input type="text" id="spring" name="spring"><br>
                 <label for="java">Enter your java marks :</label>
                 <input type="text" id="java" name="java"><br>
                <label for="react">Enter your react marks :</label>
                <input type="text" id="react" name="react"><br>
                <label for="english">Enter your english marks :</label>
                <input type="text" id="english" name="english"><br>
                <input type="submit" value="Submit">
              <select path="courses">
                                      <form:option value="" label="Please Select" />
                                      <form:options items="${courses}"/>
                                       </form:select>

            </form>

    </body>
</html>