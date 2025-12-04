# Task Description

Implement the class [CustomList](CustomList.java)
to create a `singly-linked list` which can hold elements of type `Integer`.

```java
class CustomList {
    private CustomListElement head = null;
    private CustomListElement tail = null;
    private int size = 0;

    public Integer getTail() {
        // TODO: Implement me
    }

    public void insertTail(Integer value) {
        // TODO: Implement me
    }

    public Integer removeHead() {
        // TODO: Implement me
    }

    public boolean contains(Integer value) {
        // TODO: Implement me
    }
}
```

For this you should use [CustomElements](CustomListElement.java)
as list items. And implement the methods:
- `getTail` : returns the value of last item in list
- `insertTail` : inserts a new value at the end of list
- `removeHead` : removes the first item in list and returns its value
- `contains` : checks if the list contains the value
