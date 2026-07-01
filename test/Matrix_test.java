package test;

import org.junit.*;

import src.Matrix;

public class Matrix_test {

    Matrix matrix = new Matrix(4, 5);
    Matrix Lecture_matrix = new Matrix("./data/data1.txt");



    @Test
    public void test_rows() {
        Assert.assertEquals(matrix.getNbRows(), 4);
    }

    @Test
    public void test_negative_rows() {
        int nb_row = matrix.getNbRows();
        Assert.assertEquals(nb_row, 4);
    }

    @Test
    public void test_cols() {
        Assert.assertEquals(matrix.getNbCols(), 5);
    }

    @Test 
    public void data_lecture(){
        Assert.assertEquals(Lecture_matrix.getNbCols(), 12);
    }

     
     @Test(expected = IndexOutOfBoundsException.class)
      public void exception_set() {
        Lecture_matrix.set(13, 14, 1);
      
  } 

    @Test(expected = IndexOutOfBoundsException.class)
      public void exception_get() {
        Lecture_matrix.set(13, 14, 1);
      
  } 



}
