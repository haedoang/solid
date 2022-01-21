package isp;

import isp.before.Bank;
import isp.before.HappyBank;
import isp.before.UnhappyBank;
import isp.refactor.RainyBank;
import isp.refactor.SunnyBank;
import org.junit.jupiter.api.DisplayName;

/**
 * packageName : isp
 * fileName : BankTest
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
@DisplayName("인터페이스 분리 테스트")
public class BankTest {


    @DisplayName("인터페이스 분리 전에는 필요하지 않은 메서드도 구현해야 한다.")
    public static void main(String[] args) {
        Bank happyBank = new HappyBank();
        happyBank.doPersonalFinance();
        happyBank.doEnterpriseFinance();
        happyBank.doPrivateBanking();
        System.out.println("-------------------------------------------");

        Bank unhappyBank = new UnhappyBank();
        unhappyBank.doPersonalFinance();
        unhappyBank.doEnterpriseFinance();
        unhappyBank.doPrivateBanking();
        System.out.println("============================================");

        SunnyBank sunnyBank = new SunnyBank();
        sunnyBank.doPersonalFinance();
        sunnyBank.doEnterpriseFinance();
        System.out.println("-------------------------------------------");

        RainyBank rainyBank = new RainyBank();
        rainyBank.doPersonalFinance();
        rainyBank.doEnterpriseFinance();
        rainyBank.doPrivateBanking();
    }

}
