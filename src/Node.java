import java.util.Stack;

public class Node {
    public int value;
    public Node[] children;

    public Stack<Integer> cari(int value){
        if (this.value == value) {
            Stack<Integer> stack = new Stack<>();
            stack.push(this.value);
            return stack;
        } else {
            if (children != null){
                for (int i = 0; i < children.length; i++) {
                    if (children[i] != null){
                        Stack<Integer> stack = children[i].cari(value);
                        if (stack != null) {
                            stack.push(this.value);
                            return stack;
                        }
                    }
                }
            }
            return null;
        }
    }
}
