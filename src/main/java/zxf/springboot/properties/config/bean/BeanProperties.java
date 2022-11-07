package zxf.springboot.properties.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanProperties {
    @Bean
    @ConfigurationProperties(prefix = "bean.a")
    public BeanItem beanA(){
        return new BeanItem();
    }

    @Bean
    @ConfigurationProperties(prefix = "bean.b")
    public BeanItem beanB(){
        return new BeanItem();
    }
}
