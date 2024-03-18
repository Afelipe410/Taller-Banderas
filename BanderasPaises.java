import java.awt.Color;

public class BanderasPaises {

    public static final int YELLOW = new Color(250, 201, 20).getRGB();
    public static final int BLUE = new Color(17, 13, 99).getRGB();
    public static final int RED = new Color(196, 0, 15).getRGB();
    public static final int BLACK = new Color(9, 9, 9).getRGB();
    public static final int WHITE = new Color(255, 255, 255).getRGB();
    public static final int GREEN = new Color(35, 139, 51).getRGB();
    public static final int SKYBLUE = new Color(135, 206, 235).getRGB();

    public static void main(String[] args) {
        int[][] flagMatrix = {};

        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix = createDNKflag(h * 12, w * 24);

                JOptionPaneArrays.showColorArray2D(null, flagMatrix);

            }

    }

    public static int[][] createCOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0; // NO ES BUENA PRACTICA, DECLARARLAS TODAS JUNTAS

        rowIni = (height * 0) / 4;
        rowEnd = (height * 2) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 2) / 4;
        rowEnd = (height * 3) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 3) / 4;
        rowEnd = (height * 4) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createVENflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createPOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createPANflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createCHIflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createCZEflag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int c = colIni; c < colEnd; c += 1) {
            for (int r = rowIni; r < rowEnd - (c * 2); r++)
                flag[r + c][c] = BLUE;
        }

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = WHITE;
                flag[height - 1 - r][c] = RED;
            }
        }

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        }
        return flag;
    }

    public static int[][] createDNKflag(int height, int width) {

        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (int) (height * 0.01);
        rowEnd = (int) (height * 0.45);
        colIni = (int) (width * 0.0);
        colEnd = (int) (width * 0.25);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = RED;
            }

        rowIni = (int) (height * 0);
        rowEnd = (height * 1) / 2;
        colIni = (int) (width * 0.30);
        colEnd = (int) (width * 0.99 + 1);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = RED;
            }

        rowIni = (int) (height * 0);
        rowEnd = (int) (height * 0.99 + 1);
        colIni = (int) (width * 0.22);
        colEnd = (int) (width * 0.30);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = WHITE;
            }

        rowIni = (int) (height * 0.49);
        rowEnd = (int) (height * 0.6);
        colIni = (int) (width * 0.0);
        colEnd = (int) (width * 0.99 + 1);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = WHITE;
            }

        rowIni = (int) (height * 0.60);
        rowEnd = (int) (height * 0.99 + 1);
        colIni = (int) (width * 0.0);
        colEnd = (int) (width * 0.22);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = RED;
            }

        rowIni = (int) (height * 0.65);
        rowEnd = (int) (height * 2) / 2;
        colIni = (int) (width * 0.30);
        colEnd = (int) (width * 0.99 + 1);

        for (int i = rowIni; i < rowEnd; i += 1)
            for (int j = colIni; j < colEnd; j++) {
                flag[i][j] = RED;
            }
        return flag;

    }

    public static int[][] createUSAflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        for (int b = 0; b < 12; b += 1) {

            rowIni = (height * b) / 12;
            rowEnd = (height * (b + 1)) / 12;
            colIni = (b < 6) ? (height * 1) / 2 : (width * 0) / 1;
            colEnd = (width * 1) / 1;

            for (int r = rowIni; r < rowEnd; r += 1) {
                for (int c = colIni; c < colEnd; c += 1) {
                    if (b % 2 == 0) {
                        flag[r][c] = RED;
                    } else
                        flag[r][c] = WHITE;
                }
            }
        }
        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        return flag;
    }

    public static int[][] createZAFflag(int height, int width) {

        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.34);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = RED;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.67);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = WHITE;
            }
        }
        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = BLUE;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = WHITE;
            }
        }
        rowIni = (int) (height * 0.45);
        rowEnd = (int) (height * 0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = GREEN;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 1;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = WHITE;
            rowIni++;
            rowEnd--;
            cellIni++;
        } while (rowIni != rowEnd / 1.4);

        rowIni = 0;
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = GREEN;
            rowIni++;
            rowEnd--;
            cellIni++;
        } while (rowIni != rowEnd);

        rowIni = 2;
        rowEnd = (int) (height - 2);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = YELLOW;
            rowIni++;
            rowEnd--;
            cellIni++;
        } while (rowIni != rowEnd);

        rowIni = 3;
        rowEnd = (int) (height - 3);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = BLACK;
            rowIni++;
            rowEnd--;
            cellIni++;
        } while (rowIni != rowEnd);

        return flag;
    }

    public static int[][] createFINflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;
        int colIni = 0;
        int colEnd = 0;
        rowIni = 4;
        int x = (width - rowIni * 0) / 5;
        int y = (height - rowIni * 1) / 2;
        for (int r = y; r < y + rowIni; r++) {
            for (int c = 0; c < width; c++) {
                flag[r][c] = BLUE;
            }
        }
        for (int r = 0; r < height; r++) {
            for (int c = x; c < x + rowIni; c++) {
                flag[r][c] = BLUE;
            }
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = ((width * 0) / 3) + 8;
        colEnd = (width * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = ((width * 0) / 3) + 8;
        colEnd = (width * 3) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        }
        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 3;
        colEnd = (width * 1) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        }
        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (width * 0) / 3;
        colEnd = (width * 1) / 3;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;
        }
        return flag;
    }

}
