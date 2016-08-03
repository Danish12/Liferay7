<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="student_Student.caption"/></b>
</p>


<portlet:actionURL name="getStudent" var="getStudentURL">
	<portlet:param name="studentId" value="5"/>
</portlet:actionURL>

<portlet:actionURL name="getStudentURL2" var="getStudentURL2">
	<portlet:param name="studentId" value="5"/>
</portlet:actionURL>


<a href="${getStudentURL}">Click Here to Load Student with id 5 USING the Action URL</a><br>
<a href="${getStudentURL2}">Click Here to Load Student with id 5 USING the Action URL 2</a><br>

<br>
${student}