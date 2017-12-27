<%---------------------------------------------------------------------
 * ファイル：Login.jsp
 * 内容：ログインページ
 *
 * 更新履歴
 * 新規作成 村上 聖矢 2017/12/26
 *
 *
 * 更新者　　村上 聖矢
 * 更新日付  2017/11/26
----------------------------------------------------------------------%>


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

		<%--tomcatの起動後にずっとデータが残るBeans --%>
		<jsp:useBean id="appbeans" scope="application" class="beans.appBeans" />
		<p>アクセス数：<jsp:getProperty name="appbeans" property="acessCount" /></p>
		<p>※index.jspを通ってきたページのみカウント(URL:http://localhost:8080/WizISHelper/)</p>
	</body>
</html:html>
