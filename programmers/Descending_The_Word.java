package programmers;

import java.util.*;

public class Descending_The_Word
{
    public static void main(String[] args)
    {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s)
    {
        char[] answer = s.toCharArray();        //char로 배열
        Arrays.sort(answer);        //오름차순
        return new StringBuilder(new String(answer)).reverse().toString();  //char배열을 다시 string으로 변환, reverse로 내림차
    }

}
