public class AppPuzzle {
    public static void main(String[] args) {

        Puzzle start = new Puzzle();
        start.data[0] = 8;
        start.data[1] = 0;
        start.data[2] = 1;
        start.data[3] = 2;
        start.data[4] = 3;
        start.data[5] = 4;
        start.data[6] = 5;
        start.data[7] = 6;
        start.data[8] = 7;
        System.out.println(start);

        Puzzle finish = new Puzzle();
        finish.data[0] = 1;
        finish.data[1] = 2;
        finish.data[2] = 3;
        finish.data[3] = 4;
        finish.data[4] = 5;
        finish.data[5] = 6;
        finish.data[6] = 7;
        finish.data[7] = 8;
        finish.data[8] = 0;

        cariSolusi(start, finish);

    }

    public static void cariSolusi(Puzzle start, Puzzle finish) {
        // 1. Masukkan start ke antrianCek
        QueueLinkedListPuzzle antrianCek = new QueueLinkedListPuzzle();
        LinkedListPuzzle daftarSudahDicek = new LinkedListPuzzle();
        antrianCek.enqueue(start);
        boolean solusiDitemukan = false;
        long n = 0;

        while (!solusiDitemukan) {
            System.out.println(++n);
            Puzzle cekIsi = antrianCek.dequeue();
            if (cekIsi.isSama(finish)) {
                solusiDitemukan = true;
            } else {
                Puzzle[] langkahBerikutnya = cekIsi.next();
                for (int i = 0; i < langkahBerikutnya.length; i++) {
                    if (!daftarSudahDicek.exist(langkahBerikutnya[i])) {
                        antrianCek.enqueue(langkahBerikutnya[i]);
                    }

                }
            }
            daftarSudahDicek.insertBack(cekIsi);
        }

        System.out.println("Solusi berhasil ditemukan");
    }
}
