package programmers;

import java.util.Arrays;

public class Average_Of_Arr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(solution(arr));
    }
    public static double solution(int[] arr)
    {
        double sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum +=arr[i];
        }
        sum /= arr.length;
        return sum;
    }
}
