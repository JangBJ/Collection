import java.util.HashSet;
import java.util.Iterator;

public class HashSetTrd {
    public static void main(String[] args) {
        HashSet A = new HashSet();
        HashSet B = new HashSet();
        HashSet Hab = new HashSet();
        HashSet Cha = new HashSet();
        HashSet Kyo = new HashSet();

        A.add(1); A.add(2); A.add(3); A.add(4); A.add(5); A.add(6);
        B.add(5); B.add(6); B.add(7); B.add(8);

        Iterator it = A.iterator();
        while(it.hasNext()){                // hasNext로 Iterator에 읽을요소가 없을때 까지 읽음
            Object obj = it.next();         // next로 하나씩 값을 읽어옴
            if(B.contains(obj)){            // contains로 해당하는 객체가 B에 있는지 확인
                Kyo.add(obj);               // 있으면 교집합으로 넣음
            }
        }

        it = B.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(!(A.contains(obj))){         // 객체가 없는지 확인
                Cha.add(obj);               // 없는 것만 넣어서 차집합 만듬
            }
        }

        it = A.iterator();
        while(it.hasNext()){                // 모든 합집합에 넣음
            Object obj = it.next();
            Hab.add(obj);
        }

        it = B.iterator();
        while(it.hasNext()){                // 모든 객체 합집합에 넣음
            Object obj = it.next();
            Hab.add(obj);
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(Kyo);
        System.out.println(Cha);
        System.out.println(Hab);            // HashSet이기에 중복요소 차단됨

    }
}
