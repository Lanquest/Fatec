import java.util.Scanner;
import java.util.Arrays;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i;
        double vet1[] = new double[5];
        double vet2[] = new double[5]; 
        double vet3[] = new double[5];
        for(i=0; i<vet1.length; i++) 
        {
            System.out.println("Digite o " + (i+1) + "° valor do Primeiro Vetor: ");
            vet1[i] = ent.nextDouble();
        }
        System.out.println("\n");
        for(i=0; i<vet2.length; i++) 
        {
            System.out.println("Digite o " + (i+1) + "° valor do Segundo Vetor: ");
            vet2[i] = ent.nextDouble();
        }
        for(i=0; i<vet1.length; i++) 
        {
            vet3[i] = vet1[i]+vet2[i];
        }
        System.out.println("\nPrimeiro Vetor: " + Arrays.toString(vet1));
        System.out.println("Segundo Vetor: " + Arrays.toString(vet2));
        System.out.println("\nTerceiro Vetor: " + Arrays.toString(vet3));
    }
}