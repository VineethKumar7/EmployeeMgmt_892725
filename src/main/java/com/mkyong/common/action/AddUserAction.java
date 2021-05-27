package com.mkyong.common.action;

import java.io.FileOutputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.MappingDispatchAction;

import com.mkyong.common.form.UserForm;

public class AddUserAction extends MappingDispatchAction{
	
	public ActionForward saveData(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		UserForm userForm = (UserForm) form;
		
		Properties props = new Properties();
		props.put("Employee_name", userForm.getEmpName());
		props.put("Employee_Address", userForm.getAddress());
		props.put("Country", userForm.getCountry());
		
		String path="C:\\Uploads\\empdata.properties";
		FileOutputStream output = new FileOutputStream(path);
		props.store(output, "Prop file");
		
            return mapping.findForward("success");
		
	}
	
}