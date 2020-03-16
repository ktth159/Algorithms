
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Main
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N;
        int T = 10;
        int a = 0;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            answer = 0;
            int[] arr = new int[N+4];
            for (int i = 2; i <N+2 ; i++) {
                arr[i] = sc.nextInt();
            }
            arr[0] = 0; arr[1] = 0; arr[N+2] = 0; arr[N+3] = 0;
            for (int i = 2; i <N+2 ; i++) {
                a =Integer.max(Integer.max(arr[i-1],arr[i-2]),Integer.max(arr[i+1],arr[i+2]));
                if(arr[i]>a){
                    answer+=arr[i]-a;
                }
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}