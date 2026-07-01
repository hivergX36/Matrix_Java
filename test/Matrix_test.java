package test;

import org.junit.*;

import src.Matrix;

public class Matrix_test{

@Test
public void test_rows() {

    Matrix matrix = new Matrix(4,5);
    Assert.assertEquals(matrix.getNbRows(),4);
    
}

@Test
public void test_negative_rows() {

    Matrix matrix = new Matrix(4,5);
    Assert.(matrix.getNbRows(),4);
    
}


@Test
public void test_cols(){
    
    Matrix matrix = new Matrix(4,5);
    Assert.assertEquals(matrix.getNbCols(),5);
    
}
}
