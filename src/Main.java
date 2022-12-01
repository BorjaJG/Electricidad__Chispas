import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc;


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
        sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("_________________________________________________________  \n");
        System.out.println("|               Ha selecionado en el menu:              |  \n");
        switch (num1){
            case 1:
            {
                System.out.println("|   1.-Visualizar los datos personales o modificarles.  | \n");
                System.out.println("|        *¿Que desea hacer?:                            | \n");
                System.out.println("|           1.Ver datos.                                | \n");
                System.out.println("|           2.Modificar datos.                          | \n");
                sc = new Scanner(System.in);
                int num2 = sc.nextInt();
                switch (num2){
                    case 1:
                    {
                    System.out.println("_________________________________________________________  \n");
                    System.out.println("|               Ha selecionado en el menu:              |  \n");
                    System.out.println("|               1.Ver datos.                            |   \n");
                    System.out.println("|                                                       |   \n");
                    System.out.println("|               ¿Que cliente desea ver los datos        |   \n");
                    System.out.println("|               - Jose                                  |   \n");
                    System.out.println("|               - Jiménez S.l                           |   \n");
                    String name = sc.next();
                    if (name=="Jose");{

                    }
                    }
                    case 2:
                    {
                        System.out.println("_________________________________________________________  \n");
                        System.out.println("|          Ha selecionado en el menu:                   |  \n");
                        System.out.println("|           2.Modificar datos.                          | \n");
                    }

                }

            }
            case 2:
            {
                System.out.println("|   2.-Visualizar las lista de servicio o modificarlas.  | \n");
                System.out.println("|        *¿Que desea hacer?:                            | \n");
                System.out.println("|           1.Ver datos.                                | \n");
                System.out.println("|           2.Modificar datos.                          | \n");
                sc = new Scanner(System.in);
                int num2 = sc.nextInt();
                switch (num2) {
                    case 1: {
                        System.out.println("_________________________________________________________  \n");
                        System.out.println("|               Ha selecionado en el menu:              |  \n");
                        System.out.println("|               1.Ver datos.                            |   \n");
                    }
                    case 2: {
                        System.out.println("_________________________________________________________  \n");
                        System.out.println("|           Ha selecionado en el menu:                  |  \n");
                        System.out.println("|           2.Modificar datos.                          | \n");
                    }
                }
            }
            case 3:
            {
                System.out.println("|    3.-Visualizar las hoja de facturas o modificarlas.  | \n");
                System.out.println("|        *¿Que desea hacer?:                            | \n");
                System.out.println("|           1.Ver datos.                                | \n");
                System.out.println("|           2.Modificar datos.                          | \n");
                sc = new Scanner(System.in);
                int num2 = sc.nextInt();
                switch (num2) {
                    case 1: {
                        System.out.println("_________________________________________________________  \n");
                        System.out.println("|               Ha selecionado en el menu:              |  \n");
                        System.out.println("|               1.Ver datos.                            |   \n");
                    }
                    case 2: {
                        System.out.println("_________________________________________________________  \n");
                        System.out.println("|           Ha selecionado en el menu:                  |  \n");
                        System.out.println("|           2.Modificar datos.                          | \n");
                    }
                }
            }
            case 4:
            {
                System.out.println("|    4.-Salir.                                            | \n");
                System.out.println("|        Adios                                            | \n");
                System.out.println(" _________________________________________________________    \n");
            }
        }










    }
}



