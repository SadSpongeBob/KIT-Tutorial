# Task Description

Implement the following method under [Main](Main.java):
```java
class Main {
    
    public static void main(String[] args) {
        // TODO: Implement me
    }
    
    static void correctAnswer() {
        System.out.println("Correct answer");
    }
}
```

The `main` method should:
- Take single `String` command-line argument at the start
- Afterward keep asking the user for input
- If the given input matches a [Command](Command.java), the command should
be executed
  - `QUIT`: Stops the loop and exits
  - `SAY_HI`: Prints out `Hello World`
- If the given input matches the initially passed command-line argument,
then `correctAnswer` should be executed

Useful:
- `Command::name` returns the `enum` as a `String`
- The returned value will also be `ALL_CAPS`
