package programmers;

public class middle_score {
    public static void main(String args[]){
        System.out.println(solution("abcded"));
    }
    public static String solution(String s) {
        String answer = "";
        int a=s.length();
        if(a%2==0)
        {
            answer=s.substring(a/2-1, a/2+1);
        }
        else
        {
            answer=s.substring(a/2,a/2+1);
        }


        return answer;
    }
}
