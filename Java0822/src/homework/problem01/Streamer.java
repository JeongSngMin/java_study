package homework.problem01;

public class Streamer extends Player {

    int fans;

    public Streamer(String name, int level, int fans) {
        super(name, level);
        this.fans = fans;
    }

    @Override
    void attack() {
        System.out.println("Streamer: {" + fans + "}명의 팬과 함께 공격합니다!");
    }
}
