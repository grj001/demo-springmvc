<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <base href="http://localhost:8080/springmvc-demo/">

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>springmvc-demo</title>

    <script language="JavaScript">
        function iframeJump(path){
            document.getElementById("window_view").setAttribute("src",path);
        }
    </script>

</head>
<body>
    <h1>springmvc-demo</h1>
    <ul>
        <li>converter 测试 : <a onclick="iframeJump('static/converter/converter.html')" id="converter" href="#">converter.html</a></li>
        <li>fileUpload 测试 : <a onclick="iframeJump('static/fileUpload/fileUpload.jsp')" id="fileUpload" href="#">fileUpload/fileUpload.jsp</a></li>
    </ul>

    <iframe id="window_view" style="width: 100%;height:600px" ></iframe>

</body>
</html>