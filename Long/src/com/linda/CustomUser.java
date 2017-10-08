package com.linda;

public class CustomUser {
	
	public String custom_id;
	public String custom_name;
	public String cusotm_sname;
	public String custom_address;
	public String custom_contact;
	public String custom_tel;
	
	public CustomUser(){
		this.custom_id = "111111111111111";
		this.custom_name = "美味嘉年华";
		this.cusotm_sname =  "新世界";
		this.custom_address = "南京市珠江路188号";
		this.custom_contact = "王经理";
		this.custom_tel = "13813813888";
	}
	
	public CustomUser(String id,String name,String sname,String address,String contact,String tel){
		this.custom_id = id;
		this.custom_name = name;
		this.cusotm_sname = sname;
		this.custom_address = address;
		this.custom_contact = contact;
		this.custom_tel = tel;
	}
}
