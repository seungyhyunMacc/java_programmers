package programmers_Level2;


public class Number_Book {
    public static void main(String[] args) {
        String[] phone_book={"123", "456", "789"};
        System.out.println(solution(phone_book));
    }
    public static boolean solution(String[] phone_book){
        for(int i=0; i< phone_book.length-1; i++){
            for(int j=i+1; j< phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])){        //문자열에 포함되어있는지 안되있는지 확인 첫번째수를 기준으//
                    return false;
                }
                if(phone_book[j].startsWith(phone_book[i])){        //문자열에 포함되어있는지 안되어있는지 확인 첫번째수를 제외한 기준//
                    return false;
                }
            }
        }
        return true;
    }
}
