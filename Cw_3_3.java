import java.awt.*;

public class Cw_3_3 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(1,1,4,5);

        Rectangle obj2 = new Rectangle(2,0,2,3);

        boolean ob1wob2 = obj1.contains(obj2) ;
        boolean ob2wob1 = obj2.contains(obj1) ;


        System.out.println("Czy obj1 zawiera obj2? " + ob1wob2);
        System.out.println("Czy obj2 zawiera obj1? " + ob2wob1);


    }
}

