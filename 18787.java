import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int sum = 1;
        arr[0] = 2;
        if(N>1) {
            for (int i = 1; i < arr.length; i++) {
                if (i % 3 != 0) {
                    sum++;
                }
                arr[i] = arr[i - 1] + sum;
            }
        }
        System.out.print(arr[N-1]);
    }
}
