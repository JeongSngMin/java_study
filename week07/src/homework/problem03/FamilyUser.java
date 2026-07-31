package homework.problem03;

public class FamilyUser extends User {
    public FamilyUser(String name) {
        super(name);
    }

    @Override
    void listen() {
        System.out.println(name + ": 가족과 함께 음악을 즐깁니다.");
    }
}
