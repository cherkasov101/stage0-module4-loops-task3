package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber < 1) {
            System.out.println(0);
        }
        for (int i = 1; i < lengthOfLastNumber; i++) {
            System.out.print(1);
        }
        System.out.println(0 + "" + (10 - lengthOfLastNumber));
    }
}
