import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean wantsToContinue = true;
        iRadio radioJD = new RadioJD();

        do {
            //System.out.println(getMenu(radioJD.isTurnedOn()));

        	System.out.println("\nMenu:\n" +
                    "\t1. Encender\n" +
                    "\t2. Salir\n");
            System.out.print("Ingrese una opcion: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            /*
            if (radioJD.isTurnedOn()){
                if (option != 7){
                    radioButtons(radioJD, option, radioJD.isTurnedOn());
                } else {
                    wantsToContinue = !wantsToContinue;
                }
                
            } else {
                if (option != 2){
                    radioButtons(radioJD, option, radioJD.isTurnedOn());
                } else {
                    wantsToContinue = !wantsToContinue;
                }
                
            }
            */

            System.out.println(radioJD);

        } while (wantsToContinue);
    }
// MENU 1
    public static String getMenu(boolean isTurnedOn){
        if (!isTurnedOn) {
            return "\nMenu:\n" +
                    "\t1. Encender\n" +
                    "\t2. Salir\n";
        }
// MENU 2
        return "\nMenu:\n" +
                "\t1. Apagar\n" +
                "\t2. Cambiar frecuencia\n" +
                "\t3. Subir estacion\n" +
                "\t4. Bajar estacion\n" +
                "\t5. Guardar Favorito\n" +
                "\t6. Mostrar Favorito\n" +
                "\t7. Salir\n";
    }

    public static void radioButtons(iRadio radio, int option, boolean isTurnedOn){
        if (isTurnedOn){
            switch (option){
                case 1:
                    radio.encendidoRadio();
                    break;
                case 2:
                    radio.cambiarAmFm();
                    break;
                case 3:
                    radio.subirFrecuencia();
                    break;
                case 4:
                    radio.bajarFrecuencia();
                    break;
                case 5:
                    System.out.print("Ingrese una posicion: ");
                    Scanner input = new Scanner(System.in);
                    int posicionLista = input.nextInt();
                    radio.setFavorito(posicionLista);
                    break;
                case 6:
                    System.out.print("Ingrese una posicion: ");
                    Scanner input1 = new Scanner(System.in);
                    int posicionFav = input1.nextInt();
                    radio.getFavorito(posicionFav);
                    break;
                default:
                    System.out.println("Esta opcion no es valida!");
                    break;
            }
        } else {
            switch (option) {
                case 1:
                    radio.encendidoRadio();
                    break;
                default:
                    System.out.println("Esta opcion no es valida!");
                    break;
            }

        }

    }
}
