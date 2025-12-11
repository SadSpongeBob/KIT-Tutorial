# Task Description

Find the values returned from each method call without running it:

```java
class Parent {
    public String getFoo() { return "parentFoo"; }
}

class Child extends Parent {
    public String getFoo() { return "childFoo"; }
    public String getBar() { return "childBar"; }
}

class GrandChild extends Child {
    public String getFoo() { return "grandChildFoo"; }
}

Parent p0 = new Child();
p0.getFoo();  // Returns: ???
p0.getBar();

Child c0 = new GrandChild();
c0.getFoo();
c0.getBar();

GrandChild gc0 = new GrandChild();
gc0.getFoo();
gc0.getBar();
```
