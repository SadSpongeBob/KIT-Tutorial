# Task Description

What is wrong with this class:

```java
private class Cone {
    static final double pi = Math.PI;
    Circle base;
    double height;
    double slantHeight;

    public Cone(Circle base, Double height) {
        this.base = base;
        this.height = height;
        this.slantHeight = getSlantHeight(base, height);
    }
    
    private double getSlantHeight(Circle base, double height) {
        return Math.hypot(base.getRadius(), height);
    }

    private double getSlantHeight() {
        return this.slantHeight;
    }
    
    private double getHeight() {
        return this.height;
    }
}
```
