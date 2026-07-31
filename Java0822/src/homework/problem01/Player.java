package homework.problem01;

public class Player {
    String name;
    int level;
    int exp = 0;

    public Player(String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack() {
        System.out.println("기본 공격을 합니다.");
    }

    void showInfo() {
        System.out.printf("이름: {%s}, 레벨: {%d}, 경험치: {%d}%n", name, level, exp);
    }
}
