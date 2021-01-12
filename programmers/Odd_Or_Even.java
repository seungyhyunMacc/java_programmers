package programmers;

public class Odd_Or_Even {
    public static void main(String[] args) {
        int num=-9;
        System.out.println(solution(num));
    }
    public static String solution(int num)
    {
        String answer="";
        if(num%2==1||num%2==-1)
            answer="Odd";
        else
            answer="Even";
        return answer;
    }
}
