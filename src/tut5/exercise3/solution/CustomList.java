package tut5.exercise3.solution;

import java.util.Objects;

class CustomList {
    private CustomListElement head = null;
    private CustomListElement tail = null;
    private int size = 0;

    public Integer getTail() {
        return tail == null ? null : tail.getValue();
    }

    public void insertTail(Integer value) {
        CustomListElement newTail = new CustomListElement(value);
        if (size == 0) {
            head = newTail;
        } else {
            tail.setNext(newTail);
        }
        tail = newTail;
        size++;
    }

    public Integer removeHead() {
        if (size == 0) {
            return null;
        }

        CustomListElement oldHead = head;
        CustomListElement newHead = head.getNext();
        if (newHead == null) {
            head = null;
            tail = null;
        } else {
            head = newHead;
        }
        size--;
        return oldHead.getValue();
    }

    public boolean contains(Integer value) {
        for (CustomListElement current = head; current != null; current = current.getNext()) {
            if (Objects.equals(current.getValue(), value)) {
                return true;
            }
        }
        return false;
    }
}
