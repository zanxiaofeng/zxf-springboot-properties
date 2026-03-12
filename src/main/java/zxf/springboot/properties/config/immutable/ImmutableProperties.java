package zxf.springboot.properties.config.immutable;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "immutable")
public class ImmutableProperties {
    private final String authMethod;
    private final String username;
    private final String password;

    public ImmutableProperties(String authMethod, String username, String password) {
        this.authMethod = authMethod;
        this.username = username;
        this.password = password;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
