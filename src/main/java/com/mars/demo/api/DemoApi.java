package com.mars.demo.api;

import com.mars.demo.service.DemoService;
import com.mars.framework.annotation.MarsAutowired;
import com.mars.framework.annotation.MarsController;
import com.mars.framework.annotation.MarsRequestMapping;
import com.mars.framework.annotation.MarsRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mars
 * @since 2019/11/6 12:41
 */
@MarsController
@MarsRequestMapping("/demo")
public class DemoApi {

    @MarsAutowired
    private DemoService demoService;

    @MarsRequestMapping("/query")
    public void query(HttpServletRequest req,
                      HttpServletResponse resp,
                      @MarsRequestParam("name") String name) {
        System.out.println("name: " + name);
        String result = demoService.get(name);

        try{
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @MarsRequestMapping("/add")
    public void add(HttpServletRequest req,
                    HttpServletResponse resp,
                    @MarsRequestParam("a") Integer a,
                    @MarsRequestParam("b") Integer b) {
        try {
            resp.getWriter().write(String.format("%d+%d=%d", a, b, (a+b)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
