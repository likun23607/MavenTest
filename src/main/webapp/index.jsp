<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    function sdf() {
        var arr=[];
        document.writeln("arr的长度是:"+arr.length+"<br/>")
        arr[2]=6;
        arr[4]="孙悟空";
        document.writeln("arr的长度是:"+arr.length+"<br/>")
    }




</script>
<body >
<form action="/adding.do" method="post">

    <input type="submit"/>

    <a  onclick="" href="/jmsTest.do">jmsTest</a>

</form>
</body>
</html>
