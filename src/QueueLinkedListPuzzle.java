public class QueueLinkedListPuzzle {
    public LinkedListPuzzle isi;

    QueueLinkedListPuzzle() {
        isi = new LinkedListPuzzle();
    }

    public void enqueue(Puzzle data) {
        isi.insertBack(data);
    }

    public Puzzle dequeue() {
        return isi.removeFront();
    }
}
