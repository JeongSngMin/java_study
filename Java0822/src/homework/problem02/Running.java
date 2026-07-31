package homework.problem02;

public class Running extends Workout {
    public Running(int duration) {
        super(duration);
    }

    @Override
    public void start() {
        System.out.println("🏃러닝 시작! 트랙 위를 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("러닝 종료. 소모 칼로리: " + (duration * 10) + " kcal");
    }
}
