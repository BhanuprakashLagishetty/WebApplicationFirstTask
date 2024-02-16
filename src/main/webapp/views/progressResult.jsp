<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>




       <!--  using jstl tags -->
       <h1>Wellcome ${progress.getPname()}</h1>
       <p>marks in spring is: ${progress.getSpring()}</p>
       <p>marks in java is  : ${progress.getJava()}</p>
       <p>marks in react is: ${progress.getReact()}</p>
       <p>marks in english is  : ${progress.getEnglish()}</p>
       <h1>Final result is :  ${progress.getResult()}</h1>



    </body>
</html>