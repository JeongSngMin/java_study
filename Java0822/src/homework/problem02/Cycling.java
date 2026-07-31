package homework.problem02;

public class Cycling extends Workout {
    public Cycling(int duration) {
        super(duration);
    }

    @Override
    public void start() {
        System.out.println("🚲자전거 타기를 시작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자전거 종료. 이동 거리: " + (duration * 0.5) + " km");
    }
}
