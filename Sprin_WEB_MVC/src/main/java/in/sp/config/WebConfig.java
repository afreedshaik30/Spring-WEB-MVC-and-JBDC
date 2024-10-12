package in.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("in.sp.controller")
public class WebConfig implements WebMvcConfigurer
{
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry)
    {
         InternalResourceViewResolver resolver=new InternalResourceViewResolver();
         resolver.setPrefix("/WEB-INF/views/");
         resolver.setSuffix(".jsp");
         registry.viewResolver(resolver);
    }
}
/*
   implements WebMvcConfigurer & @EnableWebMvc
   override configureViewResolvers(ViewResolverRegistry registry)
   -->in that method
          InternalViewResolver resolver =new InternalViewResolver();
*/