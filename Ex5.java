import java.util.*;
class SutdaCard1 {
    int num;
    boolean isKwang;
    SutdaCard1() {
        this(1, true);
    }
    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard1) {
            SutdaCard1 c = (SutdaCard1)obj;
            return num==c.num && isKwang==c.isKwang;
        } else {
            return false;
        }
    }

    /*
    hashCode() 오버라이딩 규칙
    1.동일 객체에 대해 hashCode는 동일한 int값 반환
    2. equals의 비교에서 true 얻었으면 두 객체에 대한 hashCode( )의 결과는 같아야함
    3. false일 경우 결과는 같아도 되지만 성능 향상위해 다른 int값 반환이 더 좋음
    고로 equals를 오버라이딩 하면 그에 맞게 hashCode도 오버라이딩해줘야함
    Object의 hashCode( )는 객체를 식별하는 하나의 정수 값을 의미
    */

    public int hashCode(){
        return toString().hashCode(); // 내가 작성할려했던거 (num+isKwang).hashCode( )
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class Ex5 {
    public static void main(String[] args) {
        SutdaCard1 c1 = new SutdaCard1(3,true);
        SutdaCard1 c2 = new SutdaCard1(3,true);
        SutdaCard1 c3 = new SutdaCard1(1,true);
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);

    } // main
}
