package structuralpatterns.proxy;

import java.math.BigDecimal;

public class RealManager implements CompanyInfo {
    @Override
    public BigDecimal getTurnover() {
        return BigDecimal.valueOf(10000);
    }
}
