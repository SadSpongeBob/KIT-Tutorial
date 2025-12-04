package tut5.exercise2;

class CustomListElement {
    private final Integer value;
    private CustomListElement next;

    public CustomListElement(Integer value) {
        this.value = value;
        this.next = null;
    }

    public Integer getValue() {
        return value;
    }

    public CustomListElement getNext() {
        return next;
    }

    public void setNext(CustomListElement next) {
        this.next = next;
    }
}