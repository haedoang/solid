package isp.before;

/**
 * packageName : isp.domain
 * fileName : BBAnk
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public class UnhappyBank implements Bank {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }

    @Override
    public void doPrivateBanking() {
        System.out.println(this.msg(this.getClass().getSimpleName(), Duty.PB));
    }
}
