package zxf.springboot.properties.config.express;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "express")
public class ExpressProperties {
    private String basicAuth;

    public String getBasicAuth() {
        return basicAuth;
    }

    public void setBasicAuth(String basicAuth) {
        this.basicAuth = basicAuth;
    }
}
