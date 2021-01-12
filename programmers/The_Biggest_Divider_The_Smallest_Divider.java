package programmers;

import java.util.Arrays;

public class The_Biggest_Divider_The_Smallest_Divider {
    public static void main(String[] args) {
        int n=3;
        int m=12;
        System.out.println(Arrays.toString(solution(n, m)));
    }
    public static int[] solution(int n, int m)
    {
        int[] answer= new int[2];
        //두수를 곱한 값을 최소공배수로 나누면 최대공약수가 나옴 그걸이용//
        int number=0;
        if(n>m)
            number=n;
        else
            number=m;
        while(number>0)
        {
            if(n%number==0&&m%number==0)
            {
                answer[0]=number;
                answer[1]=(n*m)/number;
                break;
            }
            number -=1;
        }
        return answer;
    }
}
