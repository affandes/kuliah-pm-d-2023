public class Puzzle {
    int[] data = new int[9];

    @Override
    public String toString() {
        String hasil = data[0] + " | " + data[1] + " | " + data[2] + "\n";
        hasil += data[3] + " | " + data[4] + " | " + data[5] + "\n";
        hasil += data[6] + " | " + data[7] + " | " + data[8] + "\n";
        return hasil;
    }

    public int cariIndexKosong() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) return i;
        }
        return -1;
    }

    public void moveUp() throws Exception {
        int indexPosisiKosong = cariIndexKosong();
        if (indexPosisiKosong > 2) {
            // Pindahkan antara id ? - ?-3
            int temp = data[indexPosisiKosong];
            data[indexPosisiKosong] = data[indexPosisiKosong-3];
            data[indexPosisiKosong-3] = temp;
        } else {
            throw new Exception("Ndak bisa");
        }
    }
}
