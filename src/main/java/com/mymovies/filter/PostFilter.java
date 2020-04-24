package com.mymovies.filter;

import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostFilter extends ZuulFilter {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
    	
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();

        response.setStatus(400);

        log.info("Inside Post Filter");
        
        log.info(" CODE HTTP {} ", response.getStatus());
        
        return null;
    }
}
