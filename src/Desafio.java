import java.util.Scanner;
import java.util.SortedMap;

public class Desafio {

    public static void main(String[] args) {
        //variables
        String nombre = "Rene Reyes";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;


//imprimir datos
        System.out.println("*********************");
        System.out.println("\nNombre del cliente "+ nombre);
        System.out.println("\nTipo de cuenta "+ tipoDeCuenta);
        System.out.println("\nSu saldo disponible es de: "+ saldo + " pesos");
        System.out.println("\n*********************");
        //menu
       String menu = """
               ***Escribe la acción a realizar***
               1.- Consultar saldo 
               2.- Retirar
               3.- Depositar
               4.- Salir
               """;
        // funciones
        Scanner teclado = new Scanner(System.in);
       while (opcion != 4){
           System.out.println(menu);
           opcion = teclado.nextInt();

           switch (opcion){
               case 1:
                   System.out.println("el saldo actualizado es: "+ saldo + " pesos");
                   break;

               case 2:
                   System.out.println("Cuanto vas a retirar?");
                   double retirar = teclado.nextDouble();
                   if (saldo < retirar){
                       System.out.println("Saldo insuficiente");
                   }else{
                       saldo=saldo-retirar;
                       System.out.println("El saldo actual es de: " + saldo);
                   }
                   break;
               case 3:
                   System.out.println("Cuanto vas a retirar?");
                   double depositar = teclado.nextDouble();
                       saldo += depositar;
                       System.out.println("tu saldo actual es de: " + saldo);
                   break;
               case 4:
                   System.out.println("Muchas Gracias por elegirnos");
                   break;
           }
       }
    }

}
