<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>DO ADMIN</h1>

  <h2><sec:authentication property="principal"></sec:authentication></h2>
  <h2><sec:authentication property="principal.memNick"></sec:authentication></h2>
  <h2><sec:authentication property="principal.memId"></sec:authentication></h2>
  <h2><sec:authentication property="principal.memPwd"></sec:authentication></h2>

</body>
</html>
