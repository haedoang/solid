package isp.refactor;

import isp.before.Duty;

/**
 * packageName : isp
 * fileName : Bank
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public interface BankMessage {
    default String msg(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}
