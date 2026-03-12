package zxf.springboot.properties.config.conversion.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import zxf.springboot.properties.config.conversion.CustomProperties;

@Component
public class EmployeeConverter implements Converter<String, CustomProperties.Employee> {
    @Override
    public CustomProperties.Employee convert(String from) {
        String[] data = from.split(",");
        return new CustomProperties.Employee(data[0], Double.parseDouble(data[1]));
    }
}
