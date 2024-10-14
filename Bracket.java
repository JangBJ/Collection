import java.util.*;


public class Bracket {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();          //list에 대한 읽어올 요소 확인
                                                //Iterator은 Collection간 형변환해야하는일 많은데 Iterator가 표준화 되어있기때문에 유리
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        while(it.hasNext()){                    //이렇게 한번더한다고 한번더 안나옴
            Object obj = it.next();             //Iterator는 한번다 읽으면 다시 호출해서 사용해야함(일회용)
            System.out.println(obj);
        }
    }
}


