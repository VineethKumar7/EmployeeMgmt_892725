package com.mkyong.common.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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

import com.mkyong.common.form.UserForm;

public class UserAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		
		DynaActionForm userForm = (DynaActionForm)form;
        
        ActionMessages errors = new ActionMessages();
        boolean invalid = false;
        
        
        //do the form validation in action class
        if( userForm.get("username") == null || ("".equals(userForm.get("username")))) {
 	       errors.add("common.name.err",new ActionMessage("error.common.name.required"));
 	       
 	    }
 	    
 	    if( userForm.get("password") == null || ("".equals(userForm.get("password")))) {
 		       errors.add("common.pwd.err",new ActionMessage("error.common.pwd.required"));
 		       
 		    }
 	    
 			
 		if(userForm.get("role") == null || ("".equals(userForm.get("role")))) {
 			  errors.add("common.radio.err", new
 			  ActionMessage("error.common.html.radio.required")); 
 			  
 		}
 
        saveErrors(request,errors);
        
        // Password is here
        if( ((!("".equals(userForm.get("username")))) && !userForm.get("username").equals("Vineeth"))
        		|| (!("".equals(userForm.get("username"))) && !userForm.get("password").equals("vin"))) {
        	 		   
        	 		  invalid = true;
        	 		   
        	 	   }
        
       
         if(!errors.isEmpty()){
             return mapping.findForward("failed");
         }
        else if(invalid) {
         	return mapping.findForward("invalid");
         }
        
        else{
        	
        	if(userForm.get("role").equals("user")) {
        		populateUserRecord(request);
        	}
            return mapping.findForward("success");
        }
		
		
	}
	
	public void populateUserRecord(HttpServletRequest request) throws IOException {
		
		FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream("E:\\\\Uploads\\\\empdata.properties");
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fis);
            
            request.setAttribute("emp_name",prop.getProperty("Employee_name"));
            request.setAttribute("emp_address",prop.getProperty("Employee_Address"));
            request.setAttribute("emp_country",prop.getProperty("Country"));
            
 
        } catch (FileNotFoundException e) {
 
            e.printStackTrace();
        } catch (IOException e) {
 
            e.printStackTrace();
        } finally {
            fis.close();
        }
 
    }
		
	
}