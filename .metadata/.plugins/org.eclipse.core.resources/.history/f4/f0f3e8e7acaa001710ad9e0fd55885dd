package com.linda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 3207965954908325063L;

	public LoginServlet() {
		 super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        
    	Map<String, Object> jsonMap = new HashMap<>();
    	
    	jsonMap.put("code", "501");
        jsonMap.put("massege", "this a test!");
        
        ArrayList list = new ArrayList();
        
        for (int i = 0; i < 100; i++) {
        	
        	CustomUser user = new CustomUser();
        	
        	Map<String,Object> userMap = new HashMap<>();
        	userMap.put("custom_id", user.custom_id);
        	userMap.put("custom_name", user.custom_name);
        	userMap.put("cusotm_sname", user.cusotm_sname);
        	userMap.put("custom_address", user.custom_address);
        	userMap.put("custom_contact", user.custom_contact);
        	userMap.put("custom_tel", user.custom_tel);
        	
			list.add(userMap);
        }
       
        jsonMap.put("data", list);
    		
    	response.setCharacterEncoding("utf-8");
    	response.getWriter().print(JSONObject.fromObject(jsonMap));
        response.getWriter().flush();
        response.getWriter().close();
    }
}
