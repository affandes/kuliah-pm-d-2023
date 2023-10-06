public class AppPuzzle {
    public static void main(String[] args) {

        Puzzle puzzle = new Puzzle();
        puzzle.data[0] = 4;
        puzzle.data[1] = 0;
        puzzle.data[2] = 3;
        puzzle.data[3] = 2;
        puzzle.data[4] = 5;
        puzzle.data[5] = 6;
        puzzle.data[6] = 8;
        puzzle.data[7] = 1;
        puzzle.data[8] = 7;
        System.out.println(puzzle);

        Puzzle[] puzzles = puzzle.next();

        for (int i = 0; i < puzzles.length; i++) {
            System.out.println(puzzles[i]);
        }


    }
}
