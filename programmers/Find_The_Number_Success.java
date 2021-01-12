package programmers;

public class Find_The_Number_Success {
    public static void main(String[] args)
    {
        int n =10;
        System.out.println(solution(n));
    }
    public static int solution(int n)
    {
        int answer=0;
        int[] number = new int[n+1];

        for(int i=2; i<=n; i++)
        {
            number[i] = i;
        }

        for(int i=2; i<=n; i++)
        {
            if(number[i]==0)
                continue;
            for(int j=2*i; j<=n; j+=i)
                number[j]=0;
        }

        for(int i=2; i<number.length; i++)
        {
            if(number[i]!=0)
                answer++;
        }
        return answer;
    }
}
