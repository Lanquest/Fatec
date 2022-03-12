import java.util.*;
public class exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vet1[] = new double[3];
        double vet2[] = new double[3];
        double vet3[] = new double[6];
        double somavet1 = 0, somavet2 = 0;
        int i, x = 1;
        System.out.println("\nDigite os 3 valores para o primeiro vetor");

        for(i = 0; i < vet1.length; i++)
        {
        System.out.println("\nDigite o " + (i+1) + "º valor: ");
        vet1[i] = sc.nextDouble();
        somavet1 = vet1[i] + somavet1;
        }
        System.out.println("\nDigite os 3 valores para o segundo vetor");
        for(i = 0; i < vet2.length; i++)
        {
            System.out.println("\nDigite o "+ x + "º valor: ");
            vet2[i] = sc.nextDouble();
            somavet2 = vet2[i] + somavet2;
        }
        if (somavet1 > somavet2)
        {
            System.arraycopy(vet1, 0, vet3, 0, vet1.length);
            System.arraycopy(vet2, 0, vet3, 3, vet2.length);
            System.out.println(Arrays.toString(vet3));
        }
        else 
        {
            System.arraycopy(vet2, 0, vet3, 0, vet2.length);
            System.arraycopy(vet1, 0, vet3, 3, vet1.length);
            System.out.println(Arrays.toString(vet3));
        }
        
    }
        
}
