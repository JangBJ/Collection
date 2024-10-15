import java.util.*;

public class Tree {
    public static void main(String[] args) {
        Set s = new TreeSet();                      // 이진트리 상향시킨 레드-블랙 트리로 구현

        for (int i = 0; s.size() < 6; i++) {
            int num = (int)(Math.random()*45)+1;
            s.add(num);
        }

        System.out.println(s);                  // 트리 구조이기 떄문에 정렬되어서 나옴
    }
}