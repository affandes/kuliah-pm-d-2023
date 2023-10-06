public class AppPuzzle {
    public static void main(String[] args) {

        Puzzle puzzle = new Puzzle();
        puzzle.data[0] = 1;
        puzzle.data[1] = 2;
        puzzle.data[2] = 3;
        puzzle.data[3] = 4;
        puzzle.data[4] = 5;
        puzzle.data[5] = 6;
        puzzle.data[6] = 7;
        puzzle.data[7] = 8;
        puzzle.data[8] = 0;
        System.out.println(puzzle);
        try {
            puzzle.moveUp();
            puzzle.moveUp();
            puzzle.moveUp();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(puzzle);

    }
}
