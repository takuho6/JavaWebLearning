<%--<%@page contentType="text/html; charset=utf-8" %> --%>
<%--<%@page import="jp.itacademy.samples.web.mvc.counter.Counter" %> --%>

<%--<% Counter counter = (Counter)session.getAttribute("counter"); %>--%>
<%--<% Counter counter = (Counter)request.getAttribute("counter"); %>--%>
<%--<% Counter counter = (Counter)application.getAttribute("counter"); --%>

<%@page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>

<meta charset="utf-8">
<title>カウンター</title>

<%--<p>訪問回数： <%= counter.getNum() %> 回</p> --%>

<p>訪問回数：  ${counter.num } 回</p>