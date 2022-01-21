package isp.before;

/**
 * packageName : isp.domain
 * fileName : Duty
 * author : haedoang
 * date : 2022-01-21
 * description :
 */
public enum Duty {
    PERSONAL_FINANCE("개인 금융 업무"),
    ENTERPRISE_FINANCE("기업 금융 업무"),
    PB("Private Banking 업무");

    private final String desc;

    Duty(String desc) {
        this.desc = desc;
    }

    public String description() {
        return this.desc;
    }
}
