package n0036_validsudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Sudoku {
    public static boolean isValid(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<List<Set<Character>>> sqrs = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            rows.add(new HashSet<Character>());
            cols.add(new HashSet<Character>());
            if(i < 3) {
                List<Set<Character>> square = new ArrayList<>();
                for(int j = 0; j < 3; j++) {
                    square.add(new HashSet<Character>());
                }
                sqrs.add(square);
            }
        }

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                char c = board[row][col];
                if(c == '.') continue;

                if(rows.get(row).contains(c)) return false;
                if(cols.get(col).contains(c)) return false;
                if(sqrs.get(row/3).get(col/3).contains(c)) return false;

                rows.get(row).add(c);
                cols.get(col).add(c);
                sqrs.get(row/3).get(col/3).add(c);
            }
        }
        return true;
    }
}
