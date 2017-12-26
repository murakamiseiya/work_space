
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%-- ページをWindows-31Jにする --%>
<%@ page contentType="text/html; charset=Windows-31J" %>

<html:html>
	<head>
		<title><bean:message key="welcome.title"/></title>
		<html:base/>
	</head>
	<body bgcolor="white">

 		<%-- 送信するページを設定 --%>
 		<%-- 次はstruts-config.xmlの /LoginAuth がある行を見てください。 --%>
		<html:form action="/LoginAuth">
			<%-- 文字入力：ID --%>
		    <html:text property="id" size="16"/>
		    <br>
		    <%-- 文字入力：パスワード --%>
		    <html:password property="pass" size="16" redisplay="false"/>
		    <br>

		    <%-- 送信ボタン --%>
		    <html:submit property="submit" value="送信"/>
		    <html:reset value="リセット"/>
		</html:form>

	</body>
</html:html>
