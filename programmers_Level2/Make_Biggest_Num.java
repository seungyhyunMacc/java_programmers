package programmers_Level2;

public class Make_Biggest_Num {
    public static void main(String[] args) {
        String answer="4177252841";
        int k=4;
        System.out.println(solution(answer, k));
    }
    public static String solution(String answer, int k){
     int pos=0;
     char max;
     StringBuilder temp= new StringBuilder();       //String으로 답을 변환하기 위해//

     if(answer.charAt(0)=='0')      //만약 첫번째 수가 0이면 자연수가 아니므로 0이 나옴//
         return "0";

     for(int i=0; i<answer.length()-k; i++){        //-k를 하는 이유는 두번째 for문에서 i+k를 하기때문(범위 초과안함)//
         max='0';
         for(int j=pos; j<=k+i; j++){               //범위가 하나씩 더 늘어나므로 6의 자리 5의 자리 이렇게 줄어들면 범위는 늘어남//
             if(max<answer.charAt(j)){
                 max=answer.charAt(j);
                 pos= j+1;                          //가장 큰수 다음 수부터 시작//
             }
         }
         temp.append(max);                          //범위내에 가장 큰수부터 담는다
     }
     return temp.toString();
    }
}
