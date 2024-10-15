import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinGo {
    public static void main(String[] args){
        Set set = new LinkedHashSet();
        int[][] board = new int[5][5];

        for(int i=0; set.size()<25; i++){
            set.add((int)(Math.random()*50) +1);
        }

        Iterator it = set.iterator();                   //Set은 순서가 없기때문에 Iterator을 통해 접근해야함

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = (int) it.next();          //Iterator은 int타입이 아니기에 형변환 진행
                System.out.print((board[i][j]<10? "  ":" ")+board[i][j]);
            }
            System.out.println();
        }
    }
}
