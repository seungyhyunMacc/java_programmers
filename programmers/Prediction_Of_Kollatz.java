package programmers;

public class Prediction_Of_Kollatz {
    public static void main(String[] args) {
        long n=626331;
        System.out.println(solution(n));
    }
    public static long solution(long n)     //int로 했을경우 488에서 끝남, 그래서 long으로 바꿨음//
    {
        long cnt=0;
        while(n!=1)
        {
            if(n%2==0)
            {
                n /= 2;
            }
            else
            {
                n= n*3+1;
            }
            cnt++;
            if(cnt>500)
            {
                n=-1;
                return n;
            }
        }
        return cnt;
    }
}
