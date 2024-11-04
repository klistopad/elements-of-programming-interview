package prog.interview.ch17;

import java.util.*;

public class Ch173 {

    public int findWaysCount(int fieldSize) {
        Deque<Cell> stack = new LinkedList<>();
        stack.add(new Cell(0, 0));
        int waysCount = 0;
        Cell finish = new Cell(fieldSize - 1, fieldSize - 1);



        while (!stack.isEmpty()){
            Cell currentCell = stack.pop();

            Cell rightCell = new Cell(currentCell.x + 1, currentCell.y);
            Cell downCell = new Cell(currentCell.x, currentCell.y + 1);

            for (Cell cell : List.of(rightCell, downCell)){
                if (!isValid(cell, fieldSize)) {
                    continue;
                }

                if (Objects.equals(cell, finish)){
                    waysCount++;
                } else {
                    stack.add(cell);
                }
            }
        }

        return waysCount;
    }

    private boolean isValid(Cell cell, int fieldSize){
        return cell.x < fieldSize && cell.y < fieldSize;

    }

    private static class Cell {
        int x;
        int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (!(obj instanceof Cell)) {
                return false;
            }

            Cell cell = (Cell) obj;

            return Objects.equals(cell.x, x)
                    && Objects.equals(cell.y, y);
        }
    }
}
