package tut2.exercise2.solution;

class Loops {
    void printThis(int count, String sentence) {
        int i = 0;
        if (i >= count) {
            // We need to include 1 more iteration if expression false
            System.out.println(sentence);
        }
        for (; i < count; i++) {
            if (count == 1) {
                break;
            }
            System.out.println(sentence);
        }
    }
}
