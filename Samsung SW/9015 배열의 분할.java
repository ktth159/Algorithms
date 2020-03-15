
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
        int T;
        T=sc.nextInt();
        int answer = 0;
        int N;
        int flag;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            answer = 1;
            flag = 0 ;
            int[] arr = new int[N];
            for (int i = 0; i <N ; i++) {
                arr[i] =sc.nextInt();
            }
            for (int i = 1; i < N; i++) {
                switch (flag){
                        case 0:
                            if(arr[i-1]<arr[i])
                                flag = 1;
                            else if(arr[i-1]>arr[i])
                                flag = -1;
                            break;
                        case 1:
                            if(arr[i-1]>arr[i]) {
                                flag = 0;
                                answer++;
                            }
                            break;
                        case -1:
                            if(arr[i-1]<arr[i]) {
                                flag = 0;
                                answer++;
                            }
                            break;
                    }
            }
            System.out.println("#"+test_case+" "+answer);
        }
    }
}