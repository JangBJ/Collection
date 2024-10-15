import java.util.HashSet;

public class HashSettwo {
    public static void main(String[] args){
        HashSet h = new HashSet();
        h.add("abc");
        h.add("abc");
        h.add(new Person("David",10));
        h.add(new Person("David",10));  //객체는 주소값으로 판단하기에 중복아니라고 나옴
        System.out.println(h);
    }

    static class Person{
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        // equals와 hashCode 오버라이딩 안할시 중복값도 출력됨
        // equals 오버라이딩할때 hashCode도 꼭 세트로 오버라이딩해주기
        // Object... hashCode(name, age) => 가변인자 이용
        public boolean equals(Object obj){
            if(obj instanceof Person) {
                Person tmp = (Person) obj;
                return name.equals(tmp.name) && age == tmp.age;
            }
            return false;
        }

        public int hashCode(){
            return (name+age).hashCode();
        }

        public String toString(){
            return name + ":" + age;
        }
    }
}
