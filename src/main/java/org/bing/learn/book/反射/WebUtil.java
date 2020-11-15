package org.bing.learn.book.反射;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import org.apache.commons.beanutils.BeanUtils;

public class WebUtil {
    public static <T>T requestToBean(HttpServletRequest request,Class<T> obj){
        try{
            T t=obj.newInstance();
            Enumeration er=request.getParameterNames();
            while (er.hasMoreElements()){
                String name=(String)er.nextElement();
                String value=request.getParameter(name);
                BeanUtils.setProperty(obj,name,value);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return null;
    }
}
