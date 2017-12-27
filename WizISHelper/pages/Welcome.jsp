<%---------------------------------------------------------------------
 * ファイル：Welcom.jsp
 * 内容：メインページ
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

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<p>ログインページ</p>

</body>
</html:html>
