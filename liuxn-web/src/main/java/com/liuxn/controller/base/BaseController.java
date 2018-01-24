package com.liuxn.controller.base;




import com.liuxn.utls.ConstantUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * create by lxn
 * 2018/1/24 15:53
 */
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 输出响应-JSON方式
     *
     * @param response
     * @param jsonString
     *            json字符串
     */
    protected void writeApplicationJson(HttpServletResponse response,
                                        String jsonString) {
        write(response, "application/json", jsonString);
    }

    /**
     * 输出响应-普通字符串方式
     *
     * @param response
     * @param textString
     *            文本消息
     */
    protected void writeTextHtml(HttpServletResponse response, String textString) {
        write(response, "text/html", textString);
    }

    /**
     *  返回指定格式的数据到页面
     * @param response
     * @param contentType
     * @param jsonString
     */
    private void write(HttpServletResponse response, String contentType,
                       String jsonString) {
        String charset = ConstantUtils.DEFAULT_CHARSET;
        response.setCharacterEncoding(charset);
        response.setContentType(contentType + "; charset=" + charset);
        try {
            PrintWriter out = response.getWriter();
            out.write(jsonString);
            out.flush();
            out.close();
        } catch (IOException e) {
            logger.error("",e);
        }
    }
}
