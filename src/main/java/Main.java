import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double numero=0;

            try{
                System.out.println("Ingrese un número por favor");
                numero = teclado.nextDouble();

            }catch (Exception e){
                System.out.println("Valor inválido");
                teclado.next();
            }
            System.out.println("El número ingresado es: " +numero);
        }
    }


