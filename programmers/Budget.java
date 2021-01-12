package programmers;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println(solution(d,budget));
    }
    public static int solution(int[]d, int budget)
    {
        int Sum=0; int Cnt=0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++)   //최대의 개수를 구하는것이니 오름차순을 해서 더하면 그게 최대의 개수//
        {
            Sum += d[i];
            if(Sum > budget)
                break;
            Cnt++;
        }
        return Cnt;
    }

}
