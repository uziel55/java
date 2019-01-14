import java.util.Scanner;

public class CodigoMorse {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner mensaje = new Scanner(System.in);
        int opcion;
        String texto = null;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("[1] Traducir texto a codigo morse");
            System.out.println("[2] Traducir codigo morse a texto");
            System.out.println("[3] Salir");  
            opcion = scanner.nextInt();  
            
            switch (opcion) {
                case 1:
                    System.out.println("Escriba el texto a convertir:");
                    texto = mensaje.nextLine();
                    System.out.println(TextoMorse(texto));
                    break;
                case 2:
                    System.out.println("Escriba el codigo morse a convertir:");
                    texto = mensaje.nextLine();
                    System.out.println(MorseTexto(texto));
                break;
                case 3:
                    System.out.println("Saliendo del programa");
                break;
                default:
                    System.out.println("Selecciona una opcion valida");
                break;
            }
        } while (opcion != 3);
    }

    public static String TextoMorse(String mensaje) {

        //Caracteres aceptados
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String codigo[] = {".-", ".-", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--..", "/"};
        
        //Se convierte a minusculas la cadena
        mensaje = mensaje.toLowerCase();
        
        String espacio = "/";
        String morse = " ";

        for (int i = 0; i < mensaje.length(); i++) {
            if (mensaje.charAt(i) == ' ')
                //Se deja 3 espacios entre palab
                morse = morse + espacio + "   ";
            else {
                for (int j = 0; j < abecedario.length(); j++) {
                    if (mensaje.charAt(i) == abecedario.charAt(j))
                        morse = morse + codigo[j] + ' ';
                }
            }
        }

        //Se quitan los espacios extras
        morse = morse.substring(1, morse.length());

        return morse;
    }

	public static String MorseTexto(String mensaje){
		
			String abecedario = "abcdefghijklmnopqrstuvwxyz ";
			String codigo[] = {".-", ".-", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                    "--..", "/"};

			String morse = " ";				
            String texto[] = mensaje.split(" ");
                	
		    for  (int i = 0; i < texto.length; i++){
		        for (int j = 0; j < 60; j++){
		        	if (texto[i].equals(codigo[j])) {
		        		morse = morse+abecedario.charAt(j);
		        		break;
                    }
                }
		    }
            
            //Se quitan los espacios extras
            morse = morse.substring(1,morse.length());

            return morse;
    }
}