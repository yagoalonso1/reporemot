import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
        preuFinal();
    }

    public static void menuPrincipal (){
        System.out.println("\"Hola, benvingut a la calculadora de cost PVP!\"")
    }

    public static float llegirFloat() {
        Scanner llegir = new Scanner(System.in);

        float x = 0;
        boolean valorCorrecte = false;

        do {
            System.out.print("Quin és el cost?");
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no correcte.");
                llegir.nextLine();
            } else {
                x = llegir.nextFloat();
                llegir.nextLine();
            }

        } while (!valorCorrecte);

        return x;
    }


    public static float preuFinal (){
        float preufinalnum = (float) (llegirFloat()*1.21);
        System.out.println("El preu final és " + preufinalnum + "€");
        return preufinalnum;
    }
}




