package isp.before;

/**
 * packageName : isp
 * fileName : Bank
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public interface Bank {
    void doPersonalFinance();
    void doEnterpriseFinance();
    void doPrivateBanking();

    default String msg(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}
