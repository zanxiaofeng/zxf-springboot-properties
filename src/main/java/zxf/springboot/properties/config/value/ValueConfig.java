package zxf.springboot.properties.config.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Component
public class ValueConfig {
    @Value("http://${value.host}:${value.port}/user/{uid}?qid={qid}")
    private String templateUrl;

    @PostConstruct
    public void setup() {
        Map<String, String> param = new HashMap<>();
        param.put("uid", "davis");
        param.put("qid", "zzz");
        URI newURI = UriComponentsBuilder.fromHttpUrl(templateUrl).build(param);
        System.out.println("********************************" + newURI);
    }
}
