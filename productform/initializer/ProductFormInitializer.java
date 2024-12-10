package com.xworkz.productform.initializer;

import com.xworkz.productform.configuration.ProductFormConfiguration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProductFormInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses()  {
        return new Class[] {ProductFormConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    }
}
