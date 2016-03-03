package cn.test.login.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.test.base.controller.BaseController;
import cn.test.login.bean.LoginBean;
import cn.test.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService loginService = null;

	@RequestMapping(value = "/getUser")
	@ResponseBody
	public Object login(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, String[]> paraMap = request.getParameterMap();
		String uId = (String) paraMap.get("username")[0];
		String passWd = (String) paraMap.get("password")[0];

		String forward = "";
		JSONObject json = new JSONObject();
		LoginBean loginBean = loginService.getLogin(uId, passWd);

		if (loginBean == null) {
			json.put("flag", "1");
			json.put("path", "0");
		} else {
			json.put("flag", "0");
			forward = "/jsp/common/main.jsp";
			json.put("path", forward);

		}
		return json;
	}
/*	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void login() {
		String forward = "";
		JSONObject json = new JSONObject();
		String uId = "";
		uId = BaseController.getRequest().getParameter("username");
		String passWd = BaseController.getRequest().getParameter("password");
		LoginBean loginBean = loginService.getLogin(uId, passWd);

		if (loginBean == null) {
			json.put("flag", "1");
			json.put("path", "0");
		} else {
			json.put("flag", "0");
			forward = "/jsp/common/main.jsp";
			json.put("path", forward);

		}
		BaseController.getResponse().setContentType("text/html;charset=utf-8");
		try {
			BaseController.getResponse().getWriter().print(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

}
