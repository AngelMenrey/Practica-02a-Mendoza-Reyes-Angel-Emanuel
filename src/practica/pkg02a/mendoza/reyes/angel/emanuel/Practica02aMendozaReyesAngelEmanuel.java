//Angel Emanuel Mendoza Reyes
//22110083
//Programacion orientada a Eventos
//Parcial 1
//Practica 02a Mendoza Reyes Angel Emanuel
package practica.pkg02a.mendoza.reyes.angel.emanuel;
import java.util.Arrays;
import java.util.Scanner;

public class Practica02aMendozaReyesAngelEmanuel {
    public static void main(String[] args) {
        Dispositivo[] dispositivos = new Dispositivo[20]; 
         int opc;
         String color, tipo;
         double peso;
         
         Scanner leer = new Scanner(System.in);
         do{
             System.out.println("************");
             System.out.println("Opciones:");
             System.out.println("************");
             System.out.println("1. Registrar:");
             System.out.println("************");
             System.out.println("2. Buscar:");
             System.out.println("************");
             System.out.println("3. Consultar:");
             System.out.println("************");
             System.out.println("4. Salir: ");
             System.out.println("************");
             System.out.println("Ingrese la opcion deseeada:");
             System.out.println("************");
             opc = leer.nextInt();
             leer.nextLine();
             switch(opc){
                 //Registrar
                 case 1:
                     for (int i = 0; i < dispositivos.length; i++) {
                         System.out.print("Ingresa el color: ");
                         color = leer.next();
                         System.out.print("Ingresa el tipo del dispositivo: ");
                         tipo = leer.next();
                         System.out.print("Ingresa el peso: ");
                         peso = leer.nextDouble();
                         dispositivos[i] = new Dispositivo(color, tipo, peso);
                     }
                     break;
                   //Buscar
                  case 2:
                        System.out.print("Ingrese el tipo de dispositivo, para hacer la busqueda: ");
                        tipo = leer.next();
                        for (int i = 0; i < dispositivos.length; i++) {
                        if(dispositivos[i].getTipo().equals(tipo)){
                        System.out.println("El color es: "+dispositivos[i].getColor());
                        System.out.println("El tipo es: " +dispositivos[i].getTipo());
                        System.out.println("El peso es: " +dispositivos[i].getPeso());
                        break;
                        }
                     }
                     break;
                     //Consutar
                 case 3:
                        for (int i = 0; i < dispositivos.length; i++) {
                        System.out.println("El color es: "+dispositivos[i].getColor());
                        System.out.println("El tipo es: " +dispositivos[i].getTipo());
                        System.out.println("El peso es: " +dispositivos[i].getPeso());
                     }
                        break;
                 default:
                     if (opc > 4){
                     System.out.println("Opcion Invalida");
                     }
                         break;
             }
         }while(opc!=4);
         System.out.println("Usted Salio del Menu");
    }
}
