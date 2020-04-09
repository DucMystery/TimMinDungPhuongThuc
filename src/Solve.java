import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myArr[] ={2,4,6,8,10,9,7,5,3};
        System.out.println("Giá trị nhỏ nhất của mảng là :"+checkMin(myArr));
    }

    public static int checkMin( int arr[]){
        int min =arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
