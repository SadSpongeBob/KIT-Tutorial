# Solution

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
p0.getFoo();  // childFoo
p0.getBar();  // Error

Child c0 = new GrandChild();
c0.getFoo();  // grandChildFoo
c0.getBar();  // childBar

GrandChild gc0 = new GrandChild();
gc0.getFoo();  // grandChildFoo
gc0.getBar();  // childBar
```
