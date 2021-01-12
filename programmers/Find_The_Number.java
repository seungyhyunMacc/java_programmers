package programmers;

public class Find_The_Number {
    public static void main(String[] args)
    {
        int n= 10;
        System.out.println(solution(n));
    }
    public static int solution(int n)
    {
        int cnt=0;
        int answer=0;
        for(int i=2; i<=n; i++)
        {
            for(int a=1; a<=i; a++)
            {
                if (i % a == 0)
                    cnt++;
            }
            if(cnt==2)
                answer++;
        }
        return answer;
    }
}
