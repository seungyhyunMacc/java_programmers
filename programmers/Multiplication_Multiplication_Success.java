package programmers;

public class Multiplication_Multiplication_Success {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        double long_temp_answer=Math.sqrt(n);       //제곱근인지 아닌지 판별//
        int int_temp_answer = (int) long_temp_answer;   //근데 double형으로 나와서 int로 변환//

        return long_temp_answer == int_temp_answer ? (long) Math.pow(int_temp_answer+1, 2) : -1;
        //제곱근이면 int형과 double형이 같아야함, 그래서 같으면 pow를 이용해서 a의 b제곱 형태로 값을 return
    }

}


