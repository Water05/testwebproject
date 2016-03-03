package cn.test.login.mapper;

import java.util.Map;

import cn.test.login.bean.LoginBean;

public interface LoginMapper {
	public LoginBean getLogin(Map<String ,String> para);

}
