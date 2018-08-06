package com.example.demo.Filter;

import javax.servlet.*;
import java.io.IOException;

public class SessionFilter implements Filter {

    String unLogin="您还未登录";

    String[] includeUrls=new String[]{"/login","register"};


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
