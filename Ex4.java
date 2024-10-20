import com.sun.java.swing.SwingUtilities3;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;

class Student3 implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total; // 총점
    int schoolRank; // 전교등수
    int classRank; // 반등수

    Student3(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
    }
    int getTotal() {
        return total;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public int compareTo(Object o) {
        if(o instanceof Student3) {
            Student3 s = (Student3) o;
            return s.total - total;
        }
       else{ return -1;}
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                +","+schoolRank // 새로추가
                +","+classRank;
    }

    class ClassTotalComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            int res;
            if(o1 instanceof Student3 && o2 instanceof Student3){
                Student3 s1 = (Student3) o1;
                Student3 s2 = (Student3) o2;
                res = s1.ban - s2.ban;
                if(res==0) res = s2.total - s1.total;
                return res;
            }
            return -1;
        }
    }
} // class Student

public class Ex4 {
    public static void calculateClassRank(List list){
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevBan = -1;
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();

        for(int i=0,n=0; i < length; i++,n++){
            Student3 s3 = (Student3) list.get(i);

            if(s3.ban != prevBan){
                prevRank = -1;
                prevTotal = -1;
                n=0;
            }

            if(s3.total == prevTotal){
                s3.classRank =prevRank;
            }
            else{
                s3.classRank = n+1;
            }
            prevBan = s3.ban;
            prevRank = s3.classRank;
            prevTotal = s3.total;

        }
    }
    public static void calculateSchoolRank(List list) {
        /* 내용 생략*/
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student3("이자바 ",2,1,70,90,70));
        list.add(new Student3("안자바 ",2,2,60,100,80));
        list.add(new Student3("홍길동 ",1,3,100,100,100));
        list.add(new Student3("남궁성 ",1,1,90,70,80));
        list.add(new Student3("김자바 ",1,2,80,80,90));
        calculateSchoolRank(list);
        calculateClassRank(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}



