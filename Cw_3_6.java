import java.io.*;

public class Cw_3_6
{
    static double KURS_$=3.8;
    static double KURS_€=4.34;
    static double KURS_¥=0.026;

    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj walute ($/€/¥) ");
            String str=br.readLine();

            System.out.print("Podaj kwotę: ");
            double x = Double.parseDouble(br.readLine().trim());

            if(str.equals("€")){
                System.out.println("PLN: "+ x * KURS_€);
            } else if (str.equals("¥")) {
                System.out.println("PLN: "+ x * KURS_¥);
            } else if (str.equals("$")) {
                System.out.println("PLN: "+ x * KURS_$);
            }else {
                System.out.println("Nieznana waluta");
            }

        }

        catch(IOException e1)
        {
            System.out.println("wyjatek operacji wejscia/wyjscia");
        }

        catch(NumberFormatException e2)
        {
            System.out.println("nieprawidlowy format liczby");
        }
    }
}
