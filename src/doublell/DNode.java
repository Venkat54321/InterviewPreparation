package doublell;

public class DNode {
    DNode prev;
    Integer value;
    DNode next;

    public DNode(DNode prev, Integer value, DNode next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}
