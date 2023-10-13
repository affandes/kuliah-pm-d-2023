public class LinkedListPuzzle {
    public ListPuzzle head;

    public void insertBack(Puzzle data) {
        ListPuzzle baru = new ListPuzzle();
        baru.data = data;

        if (head == null) {
            head = baru;
        } else {
            ListPuzzle cek = head;
            while (cek.next != null) {
                cek = cek.next;
            }
            cek.next = baru;
        }
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

    public boolean exist(Puzzle data) {
        if (head == null) {
            return false;
        } else {
            ListPuzzle cek = head;
            while (cek != null) {
                if (cek.data.equals(data)) {
                    return true;
                }
                cek = cek.next;
            }
            return false;
        }
    }
}
