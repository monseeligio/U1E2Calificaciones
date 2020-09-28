package calificaciones_alumnos;

import java.util.Scanner;

public class CALIFICACIONES_ALUMNOS {
    public static void main(String[] args) {
    calificaciones opera =new calificaciones();
     int opc2=0;
     int opc; 
    System.out.println("----BIENVENIDO  CALIFICACIONES GRUPO 2----\nIngresa las calificaciones del grupo 2\n");
    opera.cali();
        Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("-------Menu------");
        System.out.println("1. Promedio total de la clase");
        System.out.println("2. Promedio de los primero 5 alumnos");
        System.out.println("3. Promedio de los ultimos 5 alumnos");
        System.out.println("4. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1: opera.promediototal();break;
            case 2: opera.promedioprimeros5();break;
            case 3: opera.promedioultimos5();break;
            case 4: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("desea realizar otro proceso \n 1=SI    2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2); 
     
       }
    }
