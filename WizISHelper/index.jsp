


<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%--tomcat起動中のデータを全て持っているBeans --%>
<jsp:useBean id="appbeans" scope="application" class="beans.appBeans" />
<%--アクセスされたらカウント(+1)する --%>
<jsp:setProperty name="appbeans" property="acessCount" value="1" />

<logic:redirect forward="Login"/>


