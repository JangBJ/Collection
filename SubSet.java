import java.util.*;

public class SubSet {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();

        Scanner sc = new Scanner(System.in);
        String from = sc.next();
        String to = sc.next();

        s.add("aaa"); s.add("adc"); s.add("shit"); s.add("the"); s.add("fuck"); s.add("coding");
        s.add("i"); s.add("want"); s.add("go"); s.add("home"); s.add("Bitches"); s.add("please");

        System.out.println(s.subSet(from,to));                 // subSet은 TreeSet을 from~to 전까지 추출해줌
        System.out.println(s.subSet(from,to + "ZZZ"));         // to+"ZZZ"시 to 범위까지 나오게함(to전체는 아니고 ZZZ보다 작으면 추출
    }
}
