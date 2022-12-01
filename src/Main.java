import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println(".........................................................  \n");
        System.out.println("          .- Inicio del sistema operativo                  \n");
        System.out.println(".........................................................  \n");
        System.out.println("________________________________________________________   \n");
        System.out.println("|               ¿Que desea realizar?:                   |  \n");
        System.out.println("|   1.-Visualizar los datos personales o modificarles.  |  \n");
        System.out.println("|   2.-Visualizar las lista de servicio o modificarlas. |  \n");
        System.out.println("|   3.-Visualizar las hoja de facturas o modificarlas.  |  \n");
        System.out.println("|   4.-Salir.                                           |  \n");
        System.out.println("|_______________________________________________________|  \n");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("_________________________________________________________  \n");
        System.out.println("|               Ha selecionado en el menu:              |  \n");
        switch (num1){
            case 1:
            {
                System.out.println("|   1.-Visualizar los datos personales o modificarles.  | \n");
            }
            case 2:
            {
                System.out.println("|   2.-Visualizar las lista de servicio o modificarlas.  | \n");
            }
            case 3:
            {
                System.out.println("|    3.-Visualizar las hoja de facturas o modificarlas.  | \n");
            }
            case 4:
            {
                System.out.println("|    4.-Salir.                                            | \n");
            }
        }










    }
}



