import java.util.HashMap;
import java.util.Scanner;

public class KeyValue {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("kasina", "okgo");                                //key와 value한쌍을 저장
        h.put("worksout", "ready");
        h.put("nike", "let");
        h.put("adidas", "holly");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("id 입력하시오>>");
            String id = sc.nextLine().trim();                   // trim으로 공백 제거

            System.out.print("암호 입력하시오>>");
            String pass = sc.nextLine().trim();
            System.out.println();

            if(!(h.containsKey(id))){                           // containsKey으로 key있는지 확인
                System.out.println("id가 불일치합니다"); continue;
            }
            if(h.get(id).equals(pass)){                         // key얻고 equals로 pass비교
                System.out.println("로그인 성공"); break;
            } else {
                System.out.println("암호가 틀렸습니다");
            }

        }
    }
}
