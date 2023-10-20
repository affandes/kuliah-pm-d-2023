import java.util.Stack;

public class Tree {
    public Node root;

    public boolean cari(int value){
        if(root != null){
            Stack<Integer> stack = root.cari(value);
            if (stack != null) {
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            }
        }
        return false;
    }
}
