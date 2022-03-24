package L10_Matrix;

public class Matrix implements IMatrix{
    private double [][] numbers;

    // create constructor for array
    public Matrix(int rows, int cols){
        numbers = new double[rows][cols];
    }
    // create constructor for final array
    public Matrix(double[][] numbers){
        this.numbers = numbers;

    }
    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex >= this.getRows() || rowIndex < 0){
            System.out.println("Wrong Row Index!");
            return -1;
        }

        if (colIndex >= this.getColumns() || colIndex <0) {
            System.out.println("Wrong Column Index!");
            return -1;
        }

        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if(rowIndex >= this.getRows() || rowIndex < 0){
            System.out.println("Wrong Row Index!");
           return;
        }

        if (colIndex >= this.getColumns() || colIndex <0) {
            System.out.println("Wrong Column Index!");
            return;
        }

        numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //otherMatrix is second Matrix. And first Matrix is called by this.
        if(otherMatrix == null){
           throw new NullPointerException("OtherMatrix is null");

        }

        if(this.getRows() != otherMatrix.getRows()){
           throw new IllegalArgumentException("Rows numbers are different!");

        }

        if(this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Columns numbers are different!");

        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this. getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for(int i = 0; i < numbers.length; i++){
    for(int j = 0; j < numbers[i].length; j++){
        System.out.print(numbers[i][j] + "   ");
    }
            System.out.println();
        }

    }
}
