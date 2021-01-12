package programmers;

public class Hashard_Number {
    public static void main(String[] args) {
        int n=11;
        System.out.println(solution(n));
    }
    public static boolean solution(int n)
    {
        int Sum=0;
        int dup_n=n;        //n의 복제본을 만들어줌//
        while(dup_n!=0)
        {
            Sum += dup_n%10;
            dup_n /= 10;
        }
        if(n % Sum==0)
            return true;
        else
            return false;
    }
}
