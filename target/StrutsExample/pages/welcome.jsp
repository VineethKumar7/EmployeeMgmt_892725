<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

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
	Welcome <bean:write name="userForm" property="username" />
</h1>

 <html:form>
        <table>
         <tr>
            <th>Employee Management System</th>
         </tr>
         <tr>
            <td>MySQL</td>
            <td>1995</td>
         </tr>
      </table>
      
    </html:form>
</body>
</html>