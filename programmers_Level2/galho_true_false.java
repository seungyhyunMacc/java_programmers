package programmers_Level2;

public class galho_true_false {
    public static void main(String[] args) {
        String s="()))((()";
        System.out.println(solution(s));
    }
    public static boolean solution(String s){
        char[] temp = s.toCharArray();
        boolean answer=true;
        int cnt1=0;
        int cnt2=0;
        for(int i=0; i< temp.length; i++){      //괄호요소를 탐색//
            if(')'==temp[0])
                return answer=false;            //괄호 시작은 (이므로 )로 시작하면 false//
            if(cnt1<cnt2)
                return answer=false;            //탐색 중에 (의 갯수가 )보다 많아야한다 (가 있어야 )가 있으므로//

            if('('==temp[i])                    //(의 개수와 )의 개수를 세서 같으면 true
                cnt1++;
            if(')'==temp[i])
                cnt2++;
        }
        if(cnt1==cnt2)
            answer=true;
        else
            answer=false;
        return answer;
    }
}
