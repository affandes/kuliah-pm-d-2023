public class QueueLinkedListPuzzle {
    public LinkedListPuzzle isi;

    public void enqueue(Puzzle data) {
        isi.insertBack(data);
    }

    public Puzzle dequeue() {
        return isi.removeFront();
    }
}
