package homework.problem01;

public class Gamer extends Player {
    String item;

    public Gamer(String name, int level, String item) {
        super(name, level);
        this.item = item;
    }

    @Override
    void attack() {
        System.out.println("Gamer: {" + item + "}을(를) 사용하여 공격합니다!");
    }
}
