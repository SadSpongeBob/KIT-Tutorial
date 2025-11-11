# Task Description

Find the output of the following code without running it.

```java
class OperatorExercise {
    public static void main(String[] args) {
        System.out.println(testOperators());
    }

    static boolean testOperators() {
        int x = 3;
        Integer y = null;
        boolean result;
        
        boolean flag = !(!false);

        int a = x++;
        int b = ++x;

        result = ((a < b) | (y != null && y > 2)) || flag;
        System.out.println("x = " + x + ", a = " + a + ", b = " + b);
        return result;
    }
}

```
