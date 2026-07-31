package homework.problem01;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Gamer("철수", 10, "전설의 검");
        Player p2 = new Streamer("영희", 5, 1000);

        p1.attack();
        p1.showInfo();
        p2.attack();
        p2.showInfo();

    }
}
