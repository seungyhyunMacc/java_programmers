package programmers;

import java.util.Arrays;

public class Star_Phone_Number {
    public static void main(String[] args) {
        String phone_number="01033334444";
        System.out.println(solution(phone_number));
    }
    public static String solution(String phone_number)
    {
        char[] temp= phone_number.toCharArray();
        for(int i=phone_number.length()-5; i>=0; i--)       //끝에 5번째부터 *를 넣어줌//
            temp[i] = '*';
        String answer="";
        answer=String.valueOf(temp);
        return answer;
    }
}
