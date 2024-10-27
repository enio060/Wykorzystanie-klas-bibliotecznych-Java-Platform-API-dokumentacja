import java.awt.Rectangle;


public class Cw_3_2
{
    public static void main(String[] args)
    {
        Rectangle obj1=new Rectangle(0,0,4,3);

        Rectangle obj2=new Rectangle(1,1,4,3);

        Rectangle przeciecie = obj1.intersection(obj2) ;

        System.out.println(przeciecie);


    }
}