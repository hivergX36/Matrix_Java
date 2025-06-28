import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }


    public Matrix(String filename){
         File input = new File(filename);
            try (Scanner scanner = new Scanner(input)) {
                if (scanner.hasNextLine()) {
                    String[] values = scanner.nextLine().split(" ");
                    this.rows = Integer.parseInt(values[0]);
                    this.cols = Integer.parseInt(values[1]);
                    this.data = new double[rows][cols];
    
                    for (int i = 0; i < rows; i++) {
                        if (scanner.hasNextLine()) {
                            values = scanner.nextLine().split(" ");
                            for (int j = 0; j < cols; j++) {
                                data[i][j] = Double.parseDouble(values[j]);
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }

    public void set(int row, int col, double value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[row][col] = value;
    }

    public double get(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[row][col];
    }

    public int getNbRows() {
        return rows;
    }

    public int getNbCols() {
        return cols;
    }

    void display_matrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}