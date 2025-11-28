package tut4.exercise1.solution;

class Main {
    void printIntegers(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println(0);
            return;
        }

        for (int current : array) {
            System.out.print(current + ", ");
        }
        System.out.println();
    }

    void printMid(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println(0);
            return;
        }

        int max = array[0];
        int min = array[0];

        for (int current : array) {
            if (current > max) {
                max = current;
            } else if (current < min) {
                min = current;
            }
        }
        int result = (min + max) / 2;
        System.out.println(result);
    }
}
