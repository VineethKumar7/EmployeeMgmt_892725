package com.mkyong.common.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

public class UserForm extends ActionForm{
	
	String empName;
	String address;
	String country;
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors = new ActionErrors();
	      
	    if( getEmpName() == null || ("".equals(getEmpName()))) {
	       errors.add("common.name.err",new ActionMessage("error.common.name.required"));
	    }
	    
	    if( getAddress() == null || ("".equals(getAddress()))) {
		       errors.add("common.pwd.err",new ActionMessage("error.common.pwd.required"));
		    }
	    
			
		if( getCountry() == null || ("".equals(getCountry()))) {
			  errors.add("common.radio.err", new
			  ActionMessage("error.common.html.radio.required")); 
			  }
	      
	    return errors;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	
}