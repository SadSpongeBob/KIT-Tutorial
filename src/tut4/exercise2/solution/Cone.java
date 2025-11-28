package tut4.exercise2.solution;

// Can also be set to public if used outside of package
class Cone {
    private static final double PI = Math.PI;
    private final Circle base;
    private final double height;
    private final double slantHeight;

    public Cone(Circle base, double height) {
        this.base = base;
        this.height = height;
        this.slantHeight = getSlantHeight(base, height);
    }

    private static double getSlantHeight(Circle base, double height) {
        return Math.hypot(base.getRadius(), height);
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSlantHeight() {
        return slantHeight;
    }
}
