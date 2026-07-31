package homework.problem02;

public class Workout {
    int duration;

    public Workout(int duration) {
        this.duration = duration;
    }

    void start() {
        System.out.println("운동을 시작합니다.");
    }

    void stop() {
        System.out.println("운동을 종료합니다. 총 시간: " + duration + "분");
    }
}
