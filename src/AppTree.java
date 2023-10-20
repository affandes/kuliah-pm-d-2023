public class AppTree {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node();
        tree.root.value = 15;

        tree.root.children = new Node[3];
        tree.root.children[0] = new Node();
        tree.root.children[0].value = 17;
        tree.root.children[0].children = new Node[2];
        tree.root.children[0].children[0] = new Node();
        tree.root.children[0].children[0].value = 24;
        tree.root.children[0].children[1] = new Node();
        tree.root.children[0].children[1].value = 26;

        tree.root.children[1] = new Node();
        tree.root.children[1].value = 19;
        tree.root.children[1].children = new Node[3];
        tree.root.children[1].children[0] = new Node();
        tree.root.children[1].children[0].value = 33;
        tree.root.children[1].children[1] = new Node();
        tree.root.children[1].children[1].value = 35;
        tree.root.children[1].children[2] = new Node();
        tree.root.children[1].children[2].value = 37;

        tree.root.children[2] = new Node();
        tree.root.children[2].value = 21;
        tree.root.children[2].children = new Node[2];
        tree.root.children[2].children[0] = new Node();
        tree.root.children[2].children[0].value = 46;
        tree.root.children[2].children[1] = new Node();
        tree.root.children[2].children[1].value = 47;

        tree.cari(37);

    }
}
