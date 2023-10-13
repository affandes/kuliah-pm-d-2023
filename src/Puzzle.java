public class Puzzle {
    int[] data = new int[9];

    @Override
    public String toString() {
        String hasil = data[0] + " | " + data[1] + " | " + data[2] + "\n";
        hasil += data[3] + " | " + data[4] + " | " + data[5] + "\n";
        hasil += data[6] + " | " + data[7] + " | " + data[8] + "\n";
        return hasil;
    }

    public boolean isSama(Puzzle yangDicek) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != yangDicek.data[i]) {
                return false;
            }
        }
        return true;
    }

    public int cariIndexKosong() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) return i;
        }
        return -1;
    }

    public Puzzle duplikatPuzzle() {
        Puzzle baru = new Puzzle();
        for (int i = 0; i < baru.data.length; i++) {
            baru.data[i] = data[i];
        }
        return baru;
    }

    public Puzzle moveUp() throws Exception {
        Puzzle baru = duplikatPuzzle();
        int indexPosisiKosong = cariIndexKosong();
        if (indexPosisiKosong > 2) {
            // Pindahkan antara id ? - ?-3
            int temp = baru.data[indexPosisiKosong];
            baru.data[indexPosisiKosong] = baru.data[indexPosisiKosong-3];
            baru.data[indexPosisiKosong-3] = temp;
        } else {
            throw new Exception("Ndak bisa");
        }
        return baru;
    }

    public Puzzle moveDown() throws Exception {
        Puzzle baru = duplikatPuzzle();
        int indexPosisiKosong = cariIndexKosong();
        if (indexPosisiKosong < 6) {
            // Pindahkan antara id ? - ?-3
            int temp = baru.data[indexPosisiKosong];
            baru.data[indexPosisiKosong] = baru.data[indexPosisiKosong+3];
            baru.data[indexPosisiKosong+3] = temp;
        } else {
            throw new Exception("Ndak bisa");
        }
        return baru;
    }

    public Puzzle moveLeft() throws Exception {
        Puzzle baru = duplikatPuzzle();
        int indexPosisiKosong = cariIndexKosong();
        if (indexPosisiKosong != 6 && indexPosisiKosong != 3 && indexPosisiKosong != 0) {
            int temp = baru.data[indexPosisiKosong];
            baru.data[indexPosisiKosong] = baru.data[indexPosisiKosong - 1];
            baru.data[indexPosisiKosong - 1] = temp;
        } else {
            throw new Exception("Ada-ada saja");
        }
        return baru;
    }

    public Puzzle moveRight() throws Exception {
        Puzzle baru = duplikatPuzzle();
        int indexPosisiKosong = cariIndexKosong();
        if (indexPosisiKosong != 2 && indexPosisiKosong != 5 && indexPosisiKosong != 8) {
            int temp = baru.data[indexPosisiKosong];
            baru.data[indexPosisiKosong] = baru.data[indexPosisiKosong + 1];
            baru.data[indexPosisiKosong + 1] = temp;
        } else {
            throw new Exception("Ada-ada saja");
        }
        return baru;
    }

    public Puzzle[] next() {

        Puzzle[] puzzles;
        int indexPosisiKosong = cariIndexKosong();
        try {
            switch (indexPosisiKosong) {
                case 0:
                    puzzles = new Puzzle[2];
                    puzzles[0] = moveDown();
                    puzzles[1] = moveRight();
                    break;
                case 1:
                    puzzles = new Puzzle[3];
                    puzzles[0] = moveDown();
                    puzzles[1] = moveLeft();
                    puzzles[2] = moveRight();
                    break;
                case 2:
                    puzzles = new Puzzle[2];
                    puzzles[0] = moveDown();
                    puzzles[1] = moveLeft();
                    break;
                case 3:
                    puzzles = new Puzzle[3];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveDown();
                    puzzles[2] = moveRight();
                    break;
                case 4:
                    puzzles = new Puzzle[4];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveDown();
                    puzzles[2] = moveLeft();
                    puzzles[3] = moveRight();
                    break;
                case 5:
                    puzzles = new Puzzle[3];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveDown();
                    puzzles[2] = moveLeft();
                    break;
                case 6:
                    puzzles = new Puzzle[2];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveRight();
                    break;
                case 7:
                    puzzles = new Puzzle[3];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveLeft();
                    puzzles[2] = moveRight();
                    break;
                case 8:
                    puzzles = new Puzzle[2];
                    puzzles[0] = moveUp();
                    puzzles[1] = moveLeft();
                    break;
                default:
                    puzzles = new Puzzle[]{};
            }
        } catch (Exception e) {
            puzzles = new Puzzle[]{};
            System.out.println(e.getMessage());
        }

        return puzzles;
    }


}
