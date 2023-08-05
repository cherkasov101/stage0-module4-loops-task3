package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(second);
            first = first ^ second;
            second = first ^ second;
            first = first ^ second;
            second = first + second;
        }
    }
}
