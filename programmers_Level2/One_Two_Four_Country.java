package programmers_Level2;

public class One_Two_Four_Country {
    public static void main(String[] args) {
        int n=6;
        System.out.println(solution(n));
    }
    public static String solution(int n)
    {
        int num=n;
        String answer= "";
        String[] numbers={"4","1","2"};
        while(num>0){
            int count= num%3;
            num /=3;
            if(count==0)
                num--;      //3의 배수일때는 num값에서 하나 뺀다
            answer=numbers[count]+answer;       //이게 핵심, 2가 먼저 답이 나와도 이렇게 스면 1이 나오고 뒤에 2가나옴//
        }
        return answer;
    }
}
