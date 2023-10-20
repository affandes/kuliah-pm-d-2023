public class Node {
    public int value;
    public Node[] children;

    public boolean cari(int value){
        if (value == this.value){
            System.out.println(this.value);
            return true;
        }else {
            if (children != null){
                for (int i = 0; i < children.length; i++) {
                    if (children[i] != null){
                        if (children[i].cari(value)) {
                            System.out.println(this.value);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
