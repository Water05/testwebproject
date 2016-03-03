package cn.test.login.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.test.login.bean.LoginBean;
import cn.test.login.mapper.LoginMapper;
@Service
public class LoginService {
	@Autowired
	private LoginMapper loginMapper=null;
	public LoginBean getLogin(String uId,String passWd){
		Map<String,String>para =new HashMap<String,String>();
		para.put("userId", uId);
		para.put("password", passWd);
		return loginMapper.getLogin(para);
		
	}

}
