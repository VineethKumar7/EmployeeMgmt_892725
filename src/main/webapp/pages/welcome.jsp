<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
<style>
         table, th, td {
            border: 1px solid black;
         }
      </style>
</head>
<body>
<h1>
	Welcome <bean:write name="dynaUserForm" property="username" />
</h1>

 <html:form action="/addUserData">
 
 <logic:equal name="dynaUserForm" property="role" value="admin">
        <table>
         <tr>
            <th>Employee Management System</th>
         </tr>
         <tr>
            <td>Side Menu <br>
            <p><html:link page="/LoginPage.do">Click here to go to login page</html:link></p> 
            </td>
            <td>Welcome <bean:write name="dynaUserForm" property="role" /> <br>
           	Employee Name : <html:text property="empName" /> <br>
            Employee Address <html:textarea property="address" cols="50" rows="10" /> <br>
            Country
			<html:select property="country">
				<html:option value="india">India</html:option>
				<html:option value="usa">USA</html:option>
			</html:select>
            
            <html:submit>Add details</html:submit>
            
            </td>
         </tr>
         
          <tr>
           <td> All rights Reserved  </td>
         </tr>
         
      </table>
      
      </logic:equal>
      
      <logic:equal name="dynaUserForm" property="role" value="user">
        <table>
         <tr>
            <th>Employee Management System</th>
         </tr>
         <tr>
            <td>Side Menu <br>
            <p><html:link page="/LoginPage.do">Click here to go to login page</html:link></p> 
            </td>
            <td>Welcome <bean:write name="dynaUserForm" property="role" /> <br>
           	Employee Name :  <bean:write name="emp_name"/> <br>
            Employee Address <bean:write name="emp_address" /> <br>
            Country
			<bean:write name="emp_country" /> <br>
			
			<p><html:link page="/LoginPage.do">Click here relogin</html:link></p> 
            
            
            </td>
         </tr>
         
          <tr>
           <td> All rights Reserved  </td>
         </tr>
         
      </table>
      
      </logic:equal>
      
    </html:form>
</body>
</html>