import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int money1 = 0;
        int money2 = 0;
        int arr[][] = new int[2][N];
        for (int i = 0; i <N ; i++) {
            arr[0][i]= sc.nextInt();
            arr[1][i]= sc.nextInt();
        }
        for (int i = 0; i <N ; i++) {
            money1 = 0;
            money2 = 0;
            if(arr[0][i]==0)
                money1 = 0;
            else if(arr[0][i]==1)
                money1 = 500;
            else if(arr[0][i]<4)
                money1 = 300;
            else if(arr[0][i]<7)
                money1 = 200;
            else if(arr[0][i]<11)
                money1 = 50;
            else if(arr[0][i]<16)
                money1 = 30;
            else if(arr[0][i]<22)
                money1 = 10;
            else
                money1 = 0;

            if(arr[1][i]==0)
                money2 = 0;
            else if(arr[1][i]==1)
                money2 = 512;
            else if(arr[1][i]<4)
                money2 = 256;
            else if(arr[1][i]<8)
                money2 = 128;
            else if(arr[1][i]<16)
                money2 = 64;
            else if(arr[1][i]<32)
                money2 = 32;
            else
                money2 = 0;
            System.out.println((money1+money2)*10000);
        }
    }
}

