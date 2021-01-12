package programmers;

public class clap {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solution(n));
    }
    public static String solution(int n)
    {
        String answer="";
        for(int i=1; i<=n; i++)
        {
            if(i%2==1)
                answer += "수";
            else if(i%2==0)
                answer +="박";
        }

        return answer;

    }
}
