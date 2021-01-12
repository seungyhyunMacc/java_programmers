package programmers_Level2;

public class find_the_biggest_binary_num {
    public static void main(String[] args) {
        int n =78;
        System.out.println(solution(n));
    }
    public static int solution(int n){
        String a1= Integer.toBinaryString(n);
        int b1= Count(a1);

        int answer = n+1;
        while(answer>n){
            String a2=Integer.toBinaryString(answer);
            int b2=Count(a2);
            if(b1==b2)
                break;
            answer++;
        }
        return answer;
    }

    public static int Count(String compare_one){
        char[] temp = compare_one.toCharArray();
        int count=0;
        for(char k: temp){
            if(k=='1')
                count++;
        }
        return count;
    }

}
