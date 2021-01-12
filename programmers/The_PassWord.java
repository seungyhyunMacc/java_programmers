package programmers;

public class The_PassWord {
    public static void main(String[] args) {
        String s ="b B z";
        int n = 4;
        System.out.println(solution(s, n));
    }
    public static String solution(String s, int n)
    {
        char[] answer = s.toCharArray();
        for(int i=0; i<answer.length; i++)
        {
            if(answer[i]>='a'&&answer[i]<='z'||answer[i]>='A'&&answer[i]<='Z')
            {
                answer[i] += n;
                if(answer[i]>'Z')
                {
                    answer[i]='A';
                    answer[i]+=n-1;
                }
                else if(answer[i]>'z')
                {
                    answer[i]='a';
                    answer[i] +=n-1;
                }
            }
            else
                continue;

        }
        String new_answer= new String(answer);
        new_answer.trim();

        return new_answer;

    }
}
