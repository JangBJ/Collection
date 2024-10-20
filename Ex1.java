import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList(); // 교집합
        ArrayList cha = new ArrayList(); // 차집합
        ArrayList hap = new ArrayList(); // 합집합
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        kyo.addAll(list1);
        kyo.retainAll(list2);

        hap.addAll(list1);
        hap.removeAll(kyo);
        hap.addAll(list2);



        cha.addAll(list1);
        cha.removeAll(list2);


        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}
class Point3D {
    int x,y,z;
    Point3D(int x, int y, int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Point3D() {
        this(0,0,0);
    }
    public boolean equals(Object obj) {
        if(obj instanceof Point3D){
            Point3D p = (Point3D) obj;
            return x == p.x && y == p.y && z == p.z;
        }
        else return false;
    }
    public String toString() {
        return "["+x+","+y+","+z+"]";
    }
}

