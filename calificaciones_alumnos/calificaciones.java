package calificaciones_alumnos;

import java.util.Scanner;

public class calificaciones {
    Scanner lector = new Scanner(System.in);
    int[]cali= new int[15];
    double promedio;
    double prom;
    public void cali(){
     String[] alumnos={"ACEVEDO CAMPOS ARIGNA","AMBROCIO PEREZ MICHAEL HAZIEL","AMBROSIO HERNANDEZ VIANEY CELERINA","CAMPOS CASASANERO JUAN PABLO","DIAZ DE JESUS MARIANA DAZZLING","DIAZ ROSAS ALEXIS EFREN","DOMIENGUEZ CAZALES JENNIFER IRLANDA","ELIGIO RAMOS MONSERRAT"," FLORES MALDONADO LILIANA","GOMEZ ARAGON EDGAR OMAR","GUTIERREZ VALLE SAMARA","JUAREZ RAMOS ALEXIS MANUEL"," LEYVA SILVA ROGELIO JESUS","MARTINEZ DE LOS SANTOS ISABEL","MARTINEZ RAYO IRIS MADAI"};
     String[] matricula={"18680056","19680091","19680092","19680113","19680133","17680136","18680108","19680957","19680144","19680156","19680162","19680958","19680177","18680163","18680165"};
      for (int i=0;i<cali.length;i++){
         System.out.println("Introducir la calificacion de " + matricula[i]+"-"+alumnos[i]);  
         cali[i] = lector.nextInt();
         prom= prom + cali[i];
      }
    }
    
    public void promediototal(){
    promedio = prom / cali.length;
    System.out.println("promedio total "+promedio);
     }
    
    
    public void promedioprimeros5(){
    double prom2=0;
    double promedio2=0;
    for (int i=0;i<5;i++){
    prom2= prom2 + cali[i];
    }
    promedio2 = prom2/5;
    System.out.println(promedio2);
    } 
    
    
    public void promedioultimos5(){
    double prom3=0;
    double promedio3=0;
    for (int i=cali.length-1;i>=10;i--){
    prom3= prom3 + cali[i];
    }
    promedio3 = prom3/5;
    System.out.println(promedio3);

    } 
}
    
