<%---------------------------------------------------------------------
 * �t�@�C���FWelcom.jsp
 * ���e�F���C���y�[�W
 *
 * �X�V����
 * �V�K�쐬 ���� ���� 2017/12/26
 *
 *
 * �X�V�ҁ@�@���� ����
 * �X�V���t  2017/11/26
----------------------------------------------------------------------%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%-- �y�[�W��Windows-31J�ɂ��� --%>
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

<p>���O�C���y�[�W</p>

</body>
</html:html>
