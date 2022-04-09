<%
String status=(String)session.getAttribute("status");
if(status==null){
	request.setAttribute("msg", "Please Login First !!");
	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	dispatcher.forward(request, response);
}
else
{
String msg=(String)request.getAttribute("msg");
if(msg!=null){
%>
<script type="text/javascript">
alert("${msg}")
</script>
<%	
}
String type=(String)session.getAttribute("type");
if(type.equalsIgnoreCase("admin")){
	%>
	<jsp:include page="adminMenu.jsp" />
<%	
}
else{
	%>
	<jsp:include page="employeeMenu.jsp" />
<%
}
}
%>


