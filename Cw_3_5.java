import java.awt.*;

public class Cw_3_5 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(1,1,4,5);

        Rectangle obj2 = new Rectangle(4,-3,4,3);

        boolean intersec = obj1.intersects(obj2);

        System.out.println("Czy obj1 przecina sie z obj2 : " + intersec);

    }
}
