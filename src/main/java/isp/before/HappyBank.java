package isp.before;

/**
 * packageName : isp.domain
 * fileName : ABank
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public class HappyBank implements Bank {
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
        //
    }
}
