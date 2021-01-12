package programmers;

public class Find_Kim {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Hong","Kim"};
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul)
    {
        int Count=0;
        String answer="";
        for(int i=0; i<seoul.length; i++)
        {
            if(seoul[i]!="Kim")
                Count++;
            else if(seoul[i]=="Kim")
                break;
        }

        answer="김서방은 "+Count+"에 있다";
        return answer;

    }
}
