package programmers;

public class middle_score_Sum {
    public static void main(String args[]){
        int a=3;
        int b=5;
        System.out.println(solution(a,b));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (; a <= b; a++) {
                answer += a;
            }
        } else if (a == b)
            answer = a;
        else {
            for (; a >= b; a--) {
                answer += a;
            }
        }
        return answer;
    }
}