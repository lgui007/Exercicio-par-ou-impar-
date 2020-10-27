
package impar_ou_par_luizguilherme;
import java.util.Scanner;

public class Impar_ou_Par_LuizGuilherme 
{


    public static void main(String[] args) 
    
    {
    
    Scanner entrada;
        short num;

        entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextShort();

        if(num%2==0)
            System.out.println("O número "+num+" é par");

        else
            System.out.println("O número"+num+" é impar");

    }
}
