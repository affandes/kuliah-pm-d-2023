public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Andi";
        mhs1.nim = "123";
        mhs1.tinggi = 165;
        mhs1.berat = 68;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Budi";
        mhs2.nim = "124";
        mhs2.tinggi = 163;
        mhs2.berat = 74;

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "Citra";
        mhs3.nim = "125";
        mhs3.tinggi = 153;
        mhs3.berat = 55;

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nama = "Dodi";
        mhs4.nim = "126";
        mhs4.tinggi = 171;
        mhs4.berat = 65;

        Mahasiswa[] data = new Mahasiswa[4];
        data[0] = mhs1;
        data[1] = mhs2;
        data[2] = mhs3;
        data[3] = mhs4;

        Mahasiswa x = data[0];
        data[0] = data[data.length-1];
        data[data.length-1] = x;

        for (int i = 0; i < data.length; i++) {
            System.out.println("Nama = " + data[i].nama);
            System.out.println("NIM = " + data[i].nim);
            System.out.println("Tinggi = " + data[i].tinggi);
            System.out.println("Berat = " + data[i].berat);
            System.out.println("===================");
        }


    }
}
