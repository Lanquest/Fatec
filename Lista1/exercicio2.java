import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);        
        int i, tam, qtd_par=0, qtd_imp=0, x, cont = 1;

        System.out.println("\nDigite a quantidade de valores a serem inseridos: ");
        tam = ent.nextInt();

        double val[] = new double[tam];

        for (i=0; i<val.length; i++)
        {
            System.out.println("Digite o " + cont + "° Valor: ");
            x = ent.nextInt();
            if(x >= 0)
            {
            val[i] = x;
            cont += 1;
            }
            else
            {
                i = i - 1;
                System.out.println("Digite um valor inteiro!!");
            }
        }
        for (i=0; i<val.length; i++)
        {
            if (val[i]%2==0)
            {
                if(val[i] > 0)
                {
                qtd_par = qtd_par+1;
                }
            }
            else 
            {
                qtd_imp = qtd_imp+1;
            }
        }
        System.out.println("\nQuantidade de Números Pares: " + qtd_par + ". ");
        System.out.println("Quantidade de Números Ímpares: " + qtd_imp + ". ");
    }
}