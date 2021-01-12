package programmers_Level2;

import java.util.Arrays;

public class Stock_Price {
    public static void main(String[] args) {
        int[] prices={1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }
    public static int[] solution(int[] prices) {
        int[] answer= new int[prices.length];
        for(int i=0; i< prices.length; i++) {
            for(int j=i+1; j< prices.length; j++){
                if(prices[i]>prices[j]){
                    answer[i]=j-i;
                    break;
                }
                if(j== prices.length-1){            //끝가지였을때 답 추출//
                    answer[i]= prices.length-1-i;
                }
            }
        }
        return answer;
    }
}
