import java.util.*;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i;
        int vet_org[] = new int[5];
        int vet_cop[] = new int[5];

        for(i=0; i < vet_org.length; i++) 
        {
            System.out.println("Digite o " + (i+1) + "° Valor: ");
            vet_org[i]= ent.nextInt(); 
            vet_cop[vet_cop.length - i - 1] = vet_org[i];
        }
        System.out.println("Vetor Original: " + Arrays.toString(vet_org));
        System.out.println("Vetor Cópia: " + Arrays.toString(vet_cop));
    }
}
