package programmers;

public class String_In_To_Int {
    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
    public static int solution(String s)
    {
        int answer=0;
        answer=Integer.parseInt(s);
        return answer;
    }
}
