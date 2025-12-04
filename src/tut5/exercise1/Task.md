# Task Description

Implement the following methods for the class [Bike](Bike.java):

```java
class Bike {
    private String name;
    private String model;
    private Color color;
    private int year;

    @Override
    public boolean equals(Object obj) {
        // TODO: Implement me 
    }

    @Override
    public int hashCode() {
        // TODO: Implement me
    }

    @Override
    public String toString() {
        // TODO: Implement me
    }
}
```

- `hashCode` should return the hash of all attributes (helpful: `Objects::hash`)
- `toString` should return a meaningful representation of the instance
