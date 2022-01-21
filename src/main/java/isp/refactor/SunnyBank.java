package isp.refactor;

import isp.before.Duty;

/**
 * packageName : isp.refactor
 * fileName : FancyBank
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public class SunnyBank implements BankPersonalFinance, BankEnterpriseFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }
}
