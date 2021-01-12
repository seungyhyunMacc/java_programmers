package programmers;

public class Multiplication_Multiplication {
    public static void main(String[] args) {
        int n=121;
        System.out.println(solution(n));
    }
    public static long solution(long n)
    {
        int temp=0;
        long answer=0;
        for(int i=1; i<n; i++)
        {
            if((i*i)==n)
            {
                temp=i;
                break;
            }
            temp=-1;
        }
        if(temp==-1) {
            answer = -1;
            return answer;
        }
        else{
            answer=(temp+1)*(temp+1);
            return answer;
        }
    }
}
