<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
<h1>Employee Management System</h1>

<html:form action="/Login">

<div style="color:red">
	<html:errors/>
</div>

<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<bean:message key="label.common.name" /> : 
	</div> 
	
	<html:text property="username" size="20" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<bean:message key="label.common.password" /> : 
	</div> 
	
	<html:password property="password" size="20" maxlength="20"/>
</div>

 <div style="padding:16px">
<bean:message key="label.common.html.radio.name" /> :
<html:radio property="role" value="admin" /> <bean:message key="label.common.html.radio.role.admin" />
<html:radio property="role" value="user" /> <bean:message key="label.common.html.radio.role.user" />
</div>

<%-- <div style="padding:16px">
<bean:message key="label.common.html.select.name" /> :
<html:select property="year">
    <html:option value="">-- None --</html:option>
	<html:option value="1980">1980</html:option>
	<html:option value="1981">1981</html:option>
	<html:option value="1982">1982</html:option>
	<html:option value="1983">1983</html:option>
	<html:option value="1984">1984</html:option>
	<html:option value="1985">1985</html:option>
</html:select>
</div>

<div style="padding:16px">
<bean:message key="label.common.html.checkbox.name" /> :
	<html:checkbox property="checkboxValue" /> Yes
	<html:checkbox property="checkboxValue" /> NO
</div>

<div style="padding:16px">
<div style="float:left;padding-right:8px;">
	Description
</div>
<html:textarea property="address" cols="50" rows="10" />
</div>


<br />
	Upload : <html:file property="file" size="50" />
<br />
 --%>
<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit><bean:message key="label.common.button.submit" /></html:submit>
	</div>
</div>

</html:form>


</body>
</html>