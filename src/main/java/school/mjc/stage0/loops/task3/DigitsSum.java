package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int count = 0;
        while (t > 0) {
            count += t % 10;
            t /= 10;
        }
    }
}
