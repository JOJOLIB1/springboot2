package com.jjj.boot.config;


import com.jjj.boot.JJJMessageConverter;
import com.jjj.boot.interceptor.DefaultInterceptor;
import com.jjj.boot.interceptor.ViewInterceptor;
import com.jjj.boot.pojo.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.UrlPathHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @className: com.jjj.boot.config.WebConfigure
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-30 22:19
 */
@Configuration
@Profile("default")
//@EnableWebMvc
public class WebConfigure {
    /*@Bean
    public WebMvcRegistrations webMvcRegistrations() {
        return new WebMvcRegistrations() {
            @Override
            public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
                return null;
            }
        };
    }*/
    @Autowired
    ViewInterceptor viewInterceptor;
    @Autowired
    com.hello.service.HelloService helloService;



    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer(){
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper helper = new UrlPathHelper();
                helper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(helper);
            }
            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new JJJMessageConverter());
            }

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                HashMap<String, MediaType> medias = new HashMap<>();
                medias.put("jjj", MediaType.parseMediaType("application/jjj"));
                ParameterContentNegotiationStrategy parameterContentNegotiationStrategy = new ParameterContentNegotiationStrategy(medias);
                configurer.strategies(Arrays.asList(new HeaderContentNegotiationStrategy(), parameterContentNegotiationStrategy));
            }

            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Pet>() {
                    @Override
                    public Pet convert(String source) {
                        if (!StringUtils.isEmpty(source)) {
                            String[] params = source.split(",");
                            Pet pet = new Pet();
                            pet.setName(params[0]);
                            pet.setWeight(Double.parseDouble(params[1]));
                            return pet;
                        }
                        return null;
                    }
                });
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new DefaultInterceptor())
                        .addPathPatterns("/**")
                        .excludePathPatterns("/esc/**");
                registry.addInterceptor(viewInterceptor)
                        .addPathPatterns("/**");
            }
        };

    }


    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setMethodParam("_m");
        return hiddenHttpMethodFilter;
    }
}
