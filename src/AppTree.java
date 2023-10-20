public class AppTree {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node();
        tree.root.value = 15;

        tree.root.children = new Node[3];
        tree.root.children[0] = new Node();
        tree.root.children[0].value = 17;
        tree.root.children[1] = new Node();
        tree.root.children[1].value = 19;
        tree.root.children[2] = new Node();
        tree.root.children[2].value = 21;


    }
}
