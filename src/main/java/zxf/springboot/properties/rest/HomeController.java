package zxf.springboot.properties.rest;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zxf.springboot.properties.config.bean.BeanItem;
import zxf.springboot.properties.config.conversion.CustomProperties;
import zxf.springboot.properties.config.conversion.DataSizeProperties;
import zxf.springboot.properties.config.conversion.DurationProperties;
import zxf.springboot.properties.config.featuretoggle.FeatureToggleProperties;
import zxf.springboot.properties.config.immutable.ImmutableProperties;
import zxf.springboot.properties.config.nested.NestedProperties;
import zxf.springboot.properties.config.simple.SimpleProperties;
import zxf.springboot.properties.config.source.CountryProperties;
import zxf.springboot.properties.config.source.MyJdbcProperties;
import zxf.springboot.properties.config.validation.ValidationProperties;

import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    BeanItem beanA;
    @Autowired
    BeanItem beanB;
    @Autowired
    CustomProperties customProperties;
    @Autowired
    DataSizeProperties dataSizeProperties;
    @Autowired
    DurationProperties durationProperties;
    @Autowired
    ImmutableProperties immutableProperties;
    @Autowired
    NestedProperties nestedProperties;
    @Autowired
    SimpleProperties simpleProperties;
    @Autowired
    ValidationProperties validationProperties;
    @Autowired
    MyJdbcProperties myJdbcProperties;
    @Autowired
    CountryProperties countryProperties;
    @Autowired
    FeatureToggleProperties featureToggleProperties;
    @Autowired
    Environment environment;

    @GetMapping("/bean/a")
    public BeanItem beanA() {
        return beanA;
    }

    @GetMapping("/bean/b")
    public BeanItem beanB() {
        return beanB;
    }

    @GetMapping("/custom")
    public CustomProperties custom() {
        return customProperties;
    }

    @GetMapping("/dataSize")
    public DataSizeProperties dataSize() {
        return dataSizeProperties;
    }

    @GetMapping("/duration")
    public DurationProperties duration() {
        return durationProperties;
    }

    @GetMapping("/immutable")
    public ImmutableProperties immutable() {
        return immutableProperties;
    }

    @GetMapping("/nested")
    public NestedProperties nested() {
        return nestedProperties;
    }

    @GetMapping("/simple")
    public SimpleProperties simple() {
        return simpleProperties;
    }

    @GetMapping("/validation")
    public ValidationProperties validation() {
        return validationProperties;
    }

    @GetMapping("/source/jdbc")
    public MyJdbcProperties jdbc() {
        return myJdbcProperties;
    }

    @GetMapping("/source/country")
    public CountryProperties country() {
        return countryProperties;
    }

    @GetMapping("/feature/toggle")
    public Optional<FeatureToggleProperties.FeatureToggle> featureToggles(@RequestParam String feature, @RequestParam(required = false) String type, @RequestParam(required = false) String target) {
        Optional<FeatureToggleProperties.FeatureToggle> featureToggle = featureToggleProperties.getToggles().stream().filter(FeatureToggleProperties.FeatureToggle.matcher(feature, type, target)).findFirst();
        if (featureToggle.isPresent()) {
            return featureToggle;
        }
        return featureToggleProperties.getToggles().stream().filter(FeatureToggleProperties.FeatureToggle.matcher(feature)).findFirst();
    }

    @GetMapping("/spring/env")
    public String springEnv(@RequestParam String property) {
        return environment.getProperty(property);
    }

    @Autowired
    StringEncryptor encryptor;

    @GetMapping("/enc")
    public String enc(@RequestParam String password) {
        return encryptor.encrypt(password);
    }
}
