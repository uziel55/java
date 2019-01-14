import java.util.Scanner;

public class NumerosRomanos {

   //Se declaran los millares, centenas, decenas y unidades en romanos
   static String [][] numeros = {{"","I","II","III","IV","V","VI","VII","VIII","IX"},
      {"","X","XX","XXX","XL","L","LX","LXX","LXX","XC"}, {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}, {"","M"}};

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int numero;

      do {
         System.out.println("Introduzca numero entero entre 1 y 1000 o escriba 0 para salir:");
         numero = scanner.nextInt();   

         if(numero != 0){
            if(numero <= 1000 && numero >= 1){  
               System.out.println(convertir(numero));
            }else{
               System.out.println("El numero debe estar entre 1 y 1000");
            }
         }else{
            System.out.println("Saliendo del programa");
         }

      } while (numero != 0);
   }
 
   public static String convertir(int numero) {
      
      int millares = 0, centenas = 0, decenas = 0, unidades = 0;
      String romano;
            
      millares = numero / 1000;
      centenas = numero % 1000 / 100;
      decenas = numero % 1000 % 100 / 10;
      unidades = numero % 1000 % 100 % 10;

      romano = numeros[3][millares]+numeros[2][centenas]+numeros[1][decenas]+numeros[0][unidades];
      return romano;
   }
}