import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numero = sc.nextInt();
        int[] inteiros = new int[numero];

        if(numero > 0 && numero <= 10){
            for (int i = 0; i < inteiros.length; i++){
                System.out.print("Digite um numero: ");
                inteiros[i] = sc.nextInt();
            }
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int j = 0; j < inteiros.length; j++){
            if(inteiros[j] < 0){
                System.out.println(inteiros[j]);
            }
        }
    }
}
