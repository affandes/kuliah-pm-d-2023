public class Rekursif {
    public static void main(String[] args) {

        cetak(5);

    }

    public static void cetak(int n) {

            n--;
            System.out.println(n);
            cetak(n);
    }
}
