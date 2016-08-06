<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="multiplemvcrendercommand_Multiplemvcrendercommandmvcportlet.caption"/></b>
</p>

<portlet:renderURL var="firstRenderURL">
	<portlet:param name="mvcRenderCommandName" value="firstRenderURL"/>
</portlet:renderURL>

<portlet:renderURL var="secondRenderURL">
	<portlet:param name="mvcRenderCommandName" value="secondRenderURL"/>
</portlet:renderURL>

<a href="${firstRenderURL}">Click Here to Load FIRST JSP USING the RENDER URL</a><br>
<a href="${secondRenderURL}">Click Here to Load SECOND JSP USING the SECOND RENDER URL</a>

<br>
