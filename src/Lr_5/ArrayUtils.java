package Lr_5;

public final class ArrayUtils {

    private ArrayUtils() {
    }

    public static int determineFirstNonZero(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                if (array[i] > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 0;
    }

}

