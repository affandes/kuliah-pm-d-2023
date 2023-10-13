public class LinkedListPuzzle {
    public ListPuzzle head;

    public void insertBack(Puzzle data) {
        ListPuzzle baru = new ListPuzzle();
        baru.data = data;

        ListPuzzle cek = head;
        while (cek.next != null) {
            cek = cek.next;
        }
        cek.next = baru;
    }

    public Puzzle removeFront() {
        if (head != null) {
            ListPuzzle ret = head;
            head = head.next;
            return ret.data;
        } else {
            return null;
        }
    }
}
