public class Tree {
    public Node root;

    public boolean cari(int value){
        if(root != null){
            return root.cari(value);
        }
        return false;
    }
}
