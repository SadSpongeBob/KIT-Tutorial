package tut1.demo;

class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }
        String first = args[0];
        String second = args[1];
        System.out.println("Say " + first + " to " + second);
    }
}
