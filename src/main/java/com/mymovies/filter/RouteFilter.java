package com.mymovies.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return "route";
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
    	log.info("Inside Route Filter");
        return null;
    }
}
