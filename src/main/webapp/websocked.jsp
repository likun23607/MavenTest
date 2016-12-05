<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/2
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    var url='ws://'+window.location.host+ '/marco';
    var sock=new WebSocket(url);
    sock.onopen=function () {
        alert(1);
        console.log('Opening');
        sayMarco();
    };
    sock.onmessage=function (e) {
        alert(2);
        console.log('Receive message:',e.data);
        setTimeout(function () {sayMarco()},2000);
    }
    sock.onclose=function () {
        console.log('Closing');
    }
    function sayMarco () {
        alert(4);
        console.log('Sending Marco');
        sock.send("Marco")
    }

</script>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
