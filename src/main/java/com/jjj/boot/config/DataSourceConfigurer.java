package com.jjj.boot.config;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import java.sql.SQLException;
import java.util.Collections;

/**
 * @className: com.jjj.boot.config.DataSourceConfigurer
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 10:38
 */
//@Configuration
public class DataSourceConfigurer {
    @Bean
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://43.142.25.180:8080/dep_db");
        druidDataSource.setPassword("Hello_world_123!!~~~");
        druidDataSource.setUsername("root");
        druidDataSource.addFilters("wall,stat");
        return druidDataSource;
    }

    @Bean
    public ServletRegistrationBean<StatViewServlet> servletServletRegistrationBean() {
        ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        return statViewServletServletRegistrationBean;
    }
    @Bean
    public StatFilter statFilter() {
        return new StatFilter();
    }
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        webStatFilterFilterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        webStatFilterFilterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        return webStatFilterFilterRegistrationBean;
    }
}
