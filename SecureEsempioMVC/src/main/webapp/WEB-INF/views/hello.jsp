<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="false"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
	
    <form action="http://localhost:8080/controller2/admin" method="get">
      <input type="submit" value="Entra" />
    </form>	
	
</body>
</html>