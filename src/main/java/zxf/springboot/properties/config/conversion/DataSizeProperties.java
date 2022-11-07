package zxf.springboot.properties.config.conversion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

/*
The supported units are B, KB, MB, GB, and TB. The default unit is bytes. We can also override the default unit using @DataSizeUnit.
 */
@ConfigurationProperties(prefix = "datasize")
public class DataSizeProperties {
    private DataSize sizeInDefaultUnit;
    private DataSize sizeBySpec;
    @DataSizeUnit(DataUnit.TERABYTES)
    private DataSize sizeInTB;

    public DataSize getSizeInDefaultUnit() {
        return sizeInDefaultUnit;
    }

    public void setSizeInDefaultUnit(DataSize sizeInDefaultUnit) {
        this.sizeInDefaultUnit = sizeInDefaultUnit;
    }

    public DataSize getSizeBySpec() {
        return sizeBySpec;
    }

    public void setSizeBySpec(DataSize sizeBySpec) {
        this.sizeBySpec = sizeBySpec;
    }

    public DataSize getSizeInTB() {
        return sizeInTB;
    }

    public void setSizeInTB(DataSize sizeInTB) {
        this.sizeInTB = sizeInTB;
    }
}
