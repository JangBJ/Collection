import java.util.*;

public class Hash {
    public static void main(String[] args){
        Object[] obj = {"2","3","2","2","2","2","2","1","7"};
        Set s = new LinkedHashSet();

        for(int i=0; i< obj.length; i++){
            s.add(obj[i]);                  // HashSet은 저장할때 중복값 다 없애주고 정렬해서 출력
        }                                   // 순서를 정렬 안해도된다면 LinkedHashSet을 사용하면됨
        Iterator it =s.iterator();
        System.out.println(it);
    }
}
