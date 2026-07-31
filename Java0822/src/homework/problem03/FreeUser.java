package homework.problem03;

public class FreeUser extends User {
    public FreeUser(String name) {
        super(name);
    }

    @Override
    void listen() {
        System.out.println(name + ": 광고 후 음악을 재생합니다.");
    }
}
