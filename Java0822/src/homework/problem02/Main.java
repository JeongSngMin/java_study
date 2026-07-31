package homework.problem02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Workout w1 = new Running(30);
        Workout w2 = new Cycling(60);

        ArrayList<Workout> workouts = new ArrayList<>();

        workouts.add(w1);
        workouts.add(w2);

        for (Workout workout : workouts) {
            workout.start();
            workout.stop();
        }
    }
}
