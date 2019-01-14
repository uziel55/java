import java.util.Scanner;

class POO{

    public static void main(String[] args){
        
        int opcion;
        int opcion2;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Cubo cubo = new Cubo();

        do {

            System.out.println("Ingrese una medida o escriba 0 para salir");
            opcion = scanner.nextInt();
            cubo.setLado(opcion);
            
            if(opcion != 0){

                do {
                    System.out.println("Seleccione una opcion:");
                    System.out.println("[1] - Calcular area");
                    System.out.println("[2] - Calcular perimetro");
                    System.out.println("[3] - Calcular volumen");
                    System.out.println("[0] - Salir");    
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Area: " + cubo.calcularArea());
                            break;
                        case 2:
                            System.out.println("Perimetro: " + cubo.calcularPerimetro());
                            break;
                        case 3:
                            System.out.println("Volumen: " + cubo.calcularVolumen());
                            break;
                        case 0:
                            System.out.println("Regresando al menu principal");
                            break;
                    }

                } while (opcion2 != 0);
            }
 
        } while (opcion != 0);
    }

}

class Cuadrado{
    
    int lado;

    public Cuadrado(){
        
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

    public int calcularPerimetro(){
        return lado * 4;
    }
}

//Hereda la clase Cuadrado
class Cubo extends Cuadrado{

    public Cubo(){
        
    }
    
    public int calcularVolumen(){
        return lado * lado * lado;
    }
}