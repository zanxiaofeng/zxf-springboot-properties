package zxf.springboot.properties.config.featuretoggle;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.function.Predicate;


@ConfigurationProperties(prefix = "feature")
public class FeatureToggleProperties {
    private List<FeatureToggle> toggles;

    public List<FeatureToggle> getToggles() {
        return toggles;
    }

    public void setToggles(List<FeatureToggle> toggles) {
        this.toggles = toggles;
    }

    public static class FeatureToggle {
        private String feature;
        private String type;

        private String target;
        private String toggle;

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getToggle() {
            return toggle;
        }

        public void setToggle(String toggle) {
            this.toggle = toggle;
        }

        public static Predicate<FeatureToggle> matcher(String feature, String type, String target) {
            return (toggle) -> toggle.feature.equalsIgnoreCase(feature) && toggle.type.equalsIgnoreCase(type) && toggle.target.equalsIgnoreCase(target);
        }

        public static Predicate<FeatureToggle> matcher(String feature) {
            return (toggle) -> toggle.feature.equalsIgnoreCase(feature) && toggle.type.equalsIgnoreCase("None") && Strings.isEmpty(toggle.target);
        }
    }
}
