import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Prostakat extends Rectangle{


    public Prostakat(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void save(){

        Point x1 = new Point(x,y);
        Point x2 = new Point(x + width,y + height);
        Point x3 = new Point(x + width,y);
        Point x4 = new Point(x,y + height);

        String string = "Dla prostokąta o wierzchołku (x, y): " + x + ", " + y +
                "\nRogi to:" +
                "\nLewy dolny: " + x1 +
                "\nPrawy górny: " + x2 +
                "\nPrawy dolny: " + x3 +
                "\nLewy górny: " + x4;

        String nazwapliku = "prostąkat.txt" ;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwapliku))) {
            writer.write(string);
            System.out.println("Wiadomość została zapisana do pliku: " + nazwapliku);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }

    }

}
public class Cw_3_7 {
    public static void main(String[] args) {

        Prostakat Prostakat = new Prostakat(0,0,4,3);
        Prostakat.save();
    }
}
