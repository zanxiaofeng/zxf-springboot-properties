package zxf.springboot.properties.config.conversion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
/*
The supported units are ns, us, ms, s, m, h and d for nanoseconds, microseconds, milliseconds, seconds, minutes, hours, and days, respectively.
The default unit is milliseconds, which means if we don't specify a unit next to the numeric value, Spring will convert the value to milliseconds.
We can also override the default unit using @DurationUnit:
@DurationUnit(ChronoUnit.DAYS)
private Duration timeInDays;
 */
@ConfigurationProperties(prefix = "duration")
public class DurationProperties {
    private Duration timeInDefaultUnit;
    private Duration timeBySpec;
    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;

    public Duration getTimeInDefaultUnit() {
        return timeInDefaultUnit;
    }

    public void setTimeInDefaultUnit(Duration timeInDefaultUnit) {
        this.timeInDefaultUnit = timeInDefaultUnit;
    }

    public Duration getTimeBySpec() {
        return timeBySpec;
    }

    public void setTimeBySpec(Duration timeBySpec) {
        this.timeBySpec = timeBySpec;
    }

    public Duration getTimeInDays() {
        return timeInDays;
    }

    public void setTimeInDays(Duration timeInDays) {
        this.timeInDays = timeInDays;
    }
}
