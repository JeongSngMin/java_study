package homework.problem03;

public class PremiumUser extends User {
    public PremiumUser(String name) {
        super(name);
    }

    @Override
    void listen() {
        System.out.println(name + ": 광고 없이 프리미엄 음악을 재생합니다.");
    }
}
