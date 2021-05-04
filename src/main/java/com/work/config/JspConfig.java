package com.work.config;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.JspConfigDescriptorImpl;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroup;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroupDescriptorImpl;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class JspConfig {

//    @Bean
//    public ConfigurableServletWebServerFactory configurableServletWebServerFactory(){
//        return new TomcatServletWebServerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                super.postProcessContext(context);
//                JspPropertyGroup jspPropertyGroup = new JspPropertyGroup();
//                jspPropertyGroup.set
//                jspPropertyGroup.
//                JspPropertyGroupDescriptorImpl jspPropertyGroupDescriptor = new JspPropertyGroupDescriptorImpl(jspPropertyGroup);
//                // jsp-property-group列表和taglib列表
//                context.setJspConfigDescriptor(new JspConfigDescriptorImpl(Collections.singletonList(jspPropertyGroupDescriptor),
//                        Collections.emptyList()));
//            }
//        };
//    }
}
