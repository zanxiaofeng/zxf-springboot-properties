package zxf.springboot.properties.config.source;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import zxf.springboot.properties.config.bean.BeanItem;

@Configuration
@PropertySource("classpath:/jdbc-${spring.profiles.active:}.properties")
public class MyJdbcProperties {

    @Bean
    @ConfigurationProperties(prefix = "my.jdbc")
    public JdbcProperties jdbcProperties() {
        return new JdbcProperties();
    }

    public static class JdbcProperties {
        private String url;
        private String username;
        private String password;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
