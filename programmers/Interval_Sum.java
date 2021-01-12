package programmers;

import java.util.Arrays;

public class Interval_Sum {
    public static void main(String[] args) {
        int x=-4;
        int n=5;
        System.out.println(Arrays.toString(solution(x, n)));
    }
    public static long[] solution(long x, int n)    //long으로 하니까 케이스 13, 14해결됨//
    {
        long[] answer=new long[n];
        for(int i=0; i<n; i++)
        {
            answer[i]= x*(i+1);
        }
        return answer;
    }
}
