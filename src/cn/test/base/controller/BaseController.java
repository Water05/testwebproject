package cn.test.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.test.base.bean.SysContext;

/**
 * <p>
 * Class : com.neunn.base.controller.BaseController
 * <p>
 * Descdription: 用户请求响应处理基类
 * 
 * @author 赵广志-zhaogz@neunn.com
 * @version 1.0.0
 *          <p>
 *          --------------------------------------------------------------<br>
 *          修改履历：<br>
 *          <li>2014年7月21日，zhaogz@neunn.com，创建文件；<br>
 *          --------------------------------------------------------------<br>
 *          </p>
 */
public class BaseController {

    /**
     * 获得用户请求对象
     * 
     * @return 用户请求对象
     */
    public static HttpServletRequest getRequest() {
        return SysContext.getRequest();
    }

    /**
     * 获得服务器响应对象
     * 
     * @return 服务器响应对象
     */
    public static HttpServletResponse getResponse() {
        return SysContext.getResponse();
    }

    /**
     * 获得服务器会话对象
     * 
     * @return 服务器会话对象
     */
    public static HttpSession getSession() {
        return SysContext.getSession();
    }

}
