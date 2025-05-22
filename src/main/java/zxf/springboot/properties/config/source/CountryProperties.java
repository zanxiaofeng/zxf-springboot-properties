package zxf.springboot.properties.config.source;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@PropertySource("classpath:/country.properties")
@ConfigurationProperties(prefix = "country")
public class CountryProperties {
    private Map<String, String> codes;


    public Map<String, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<String, String> codes) {
        this.codes = codes;
    }
}
