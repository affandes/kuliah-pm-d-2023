import java.lang.reflect.Array;

public class Stack<T> {

    public T[] data;
    public int top;

    public Stack(Class<T> c, int n) {
        this.data = (T[]) Array.newInstance(c, n);
        this.top = 0;
    }

    public void push(T d) {
        if (this.top < this.data.length) {
            this.data[this.top] = d;
            this.top++;
        }
    }

    public T pop() {
        if (this.top > 0) {
            this.top--;
            return this.data[this.top];
        }
        return null;
    }

    public T peek() {
        if (this.top > 0) {
            return this.data[this.top-1];
        }
        return null;
    }

    public boolean empty() {
        return this.top == 0;
    }
}
