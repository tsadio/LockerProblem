import java.util.Arrays;

public class LockerProblem {
    public static void main (String [] args) {
        boolean openLocker []  = new boolean [100];

        for (int i = 0; i < openLocker.length; i++) {
            openLocker[i] = false;
        }
        System.out.println(Arrays.toString(openLocker));

        for (int i = 1; i <= openLocker.length; i++) {
            for (int j = (i - 1); j < openLocker.length; j += i) {
                if (openLocker[j] == false) {
                    openLocker[j] = true;
                }
                else {
                    openLocker[j] = false;
                }
            }
        }

        for (int i = 0; i < openLocker.length; i++) {
            if (openLocker[i] == true)
                System.out.println("Locker[" + (i + 1) + "] is opened");

        }

        /*
        for (int i = 0; i < openLocker.length; i++) {
            if (openLocker[i ] == true)
                System.out.println("Locker[" + (i + 1) + "] = " + openLocker[i]);
        }
        */

    }
}
