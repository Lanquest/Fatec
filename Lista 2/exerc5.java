import java.util.*;
public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int vet1[] = new int[10];
        int maior = 0, menor = 0, i;
        
        System.out.println("Digite 10 valores\n");
        for (i = 0; i < vet1.length; i++)
        {
            System.out.println((i+1)+"º valor: ");
            vet1[i] = sc.nextInt();
            if(vet1[i] > maior)
            {
                maior = vet1[i];
            }
        }
        menor = maior;
        for(i = 0; i < vet1.length; i++)
        {
            if(vet1[i] < menor)
            {
                menor = vet1[i];
            }
        }
        System.out.println("O maior valor é: "+ maior);
        System.out.println("O menor valor é: "+ menor);      
    }
}
