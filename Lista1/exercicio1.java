import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int val[] = new int [15];
        int i, x , cont = 1, somatoria = 0;
          for (i=0; i<val.length; i++) 
        {
            System.out.println("\nDigite o " + cont + "º valor inteiro: ");
            x = ent.nextInt();
            if (x >= 0)
            {
                val[i] = x;
                cont += 1;
            }
            else
            {
                System.out.println("Digite apenas valores inteiros!!");
            }

        }    
        
        for (i=0; i<val.length; i++) 
        {
            somatoria = somatoria+val[i]; 
        }
        System.out.println("\nSoma dos valores: " + somatoria);    
        System.out.println("Media dos Valores: " + somatoria/val.length);          
    }   
}