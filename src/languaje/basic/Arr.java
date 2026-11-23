package languaje.basic;
import java.lang.Math;
import java.util.Arrays;

public class Arr {
    static int[] anArray;
    static double[] aDoubleArray;
    static String[] aStringArray = {"pepe", "juan", "jose"};
    static int[][] anMatrix;
    static String[][] names;
    public static void main(String[] args) {
        anArray = new int[10];
        aDoubleArray = new double[] {1, 2, 3, 4, 5};
        anMatrix = new int[][]{{1,2, 3}, {4, 5, 6}, {7, 8, 9}};   
        names = new String[][] {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"},            
        };

        System.out.println("anArray: " + anArray.length);
        System.out.println("aDoubleArray: " + aDoubleArray.length);
        System.out.println("anMatrix: " + anMatrix.length);
        System.out.println("names: " + names.length);
        // showNames();
        // showMatrix();
        // copy();
        // copyOfRange();
        // fill();
        // equalsArr();
        // compareArr();
        // sortArr();
        //convertToStringz();
        //practice1();
        //practice2();
        //practice3();
        //practice4();
        //practice5();
        practice6();
    }

    public static void showNames() {
        for (String names[] : names) {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }

    public static void showMatrix() {
        for (int[] anMatrix : anMatrix) {
            for (int number : anMatrix) {
                System.out.println((int) Math.pow(number, number));
            }
        }
    }

    public static void copy() {
        double[] copyArray = Arrays.copyOf(aDoubleArray, 2);
        System.out.println("copyArray: " + copyArray.length);
    }

    public static void copyOfRange() {
        double[] copyOfRangeArray = Arrays.copyOfRange(aDoubleArray, 0, 3);
        System.out.println("copyOfRangeArray: " + copyOfRangeArray.length);
    }

    public static void fill() {
        int[] fillArray = new int[10];

        Arrays.fill(fillArray, -1);
        System.out.println(fillArray[0]);
    }

    public static void equalsArr() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        var result = Arrays.equals(arr1, arr2);
        System.out.println(result);
    }

    public static void compareArr() {
        int[] arr1 = {};
        int[] arr2 = {1};
        var result = Arrays.compare(arr1, arr2);
        System.out.println(result);
    }

    public static void sortArr() {
        int[] arr1 = {3, 2, 1};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void convertToStringz() {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));
    }

    public static void practice1() {
        int[] numbers = {1, 2, 3, 4};

        for (int number : numbers) {
            System.out.println((byte) number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + 1);
        }
    }

    public static void practice2() {
        double[][] numbers = new double[][]{{1.0, 2.0}, {3.0, 4.0}};

        for (double[] number : numbers) {
            for (double numb : number) {
                System.out.println(numb);
            }
        }
    }

    public static void practice3() {
        double[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }

    public static void practice4() {
        String[][] schedule = {
            {"Math", "Science", "English"},
            {"History", "Art", "PE"},
            {"Music", "Computer", "Study Hall"}
        };

        String[] periods = {"Period 1", "Period 2", "Period 3"};

        int counter = 0;

        for (String[] row : schedule) {
            System.out.println("Day " + ++counter + ":");
            
            for (int i = 0; i < periods.length; i++) {
                System.out.println(periods[i] + ": " + row[i]);;
            }
        }
    }

    public static void practice5() {
        int[] values = {12, 8, 15, 3, 9, 21};
        int sum = 0;
        int max = values[0];
        int min = values[0];

        for (int numb : values) {
            sum += numb;
        }
        Arrays.sort(values);
        System.out.println(sum);
        System.out.println(values[0]);
        System.out.println(values[values.length-1]);

    }

    public static void practice6() {
        int[] values = {12, 8, 15, 3, 9, 21};
        int[] copyValues = Arrays.copyOf(values, values.length);
        System.out.println(Arrays.toString(copyValues));
        System.out.println(Arrays.toString(values));
    }
}
