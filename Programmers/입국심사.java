import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] times = {};
        Arrays.sort(times);
        return binarySearch(n,times,times[times.length-1]);
    }
    public long binarySearch(int n , int[] times, long max){
        long left =1;
        long mid = 0;
        long right = max*n;
        long answer = Long.MAX_VALUE;
        while(left<=right){
            mid = (left + right)/2;
            if(isPassed(times,n,mid)){
                answer = answer > mid ? mid : answer;
                right = mid-1;
            }
            else
                left = mid+1;
        }
        return answer;
    }
    public boolean isPassed(int[] times, int n, long mid){
        long amount = 0;
        for (int i = 0; i <times.length ; i++) {
            amount += mid/times[i];
        }
        if(amount>=n){
            return true;
        }
        else
            return false;
    }
}
