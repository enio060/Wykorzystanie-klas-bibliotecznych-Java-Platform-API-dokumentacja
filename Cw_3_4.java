import java.awt.*;

public class Cw_3_4 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(-3,0,6,3);

        Point punkt = new Point(2,-1) ;

        boolean zawiera = obj.contains(punkt);

        System.out.println("Czy obj zwiera punkt : " + zawiera);
    }
}
