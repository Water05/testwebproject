package cn.test.base.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * Class : com.neunn.base.bean.SysContext
 * <p>
 * Descdription: 当前线程用户请求和服务器响应保存类
 * 
 * @author 赵广志-zhaogz@neunn.com
 * @version 1.0.0
 *          <p>
 *          --------------------------------------------------------------<br>
 *          修改履历：<br>
 *          <li>2014-7-8，zhaogz@neunn.com，创建文件；<br>
 *          --------------------------------------------------------------<br>
 *          </p>
 */
public class SysContext {

    /**
     * 当前线程用户请求对象
     */
    private static ThreadLocal<HttpServletRequest> requestLocal = new ThreadLocal<HttpServletRequest>();

    /**
     * 当前线程用户响应对象
     */
    private static ThreadLocal<HttpServletResponse> responseLocal = new ThreadLocal<HttpServletResponse>();

    /**
     * 获得用户请求对象
     * 
     * @return 用户请求对象
     */
    public static HttpServletRequest getRequest() {
        return requestLocal.get();
    }

    /**
     * 设置用户请求对象
     * 
     * @param request 用户请求对象
     */
    public static void setRequest(HttpServletRequest request) {
        requestLocal.set(request);
    }

    /**
     * 获得用户响应对象
     * 
     * @return 用户响应对象
     */
    public static HttpServletResponse getResponse() {
        return responseLocal.get();
    }

    /**
     * 设置用户响应对象
     * 
     * @param response 用户响应对象
     */
    public static void setResponse(HttpServletResponse response) {
        responseLocal.set(response);
    }

    /**
     * 获得服务器会话对象
     * 
     * @return 服务器会话对象
     */
    public static HttpSession getSession() {
        return requestLocal.get().getSession();
    }
}
