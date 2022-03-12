import java.util.*;
public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vet1[] = new double[10];
        double vetcop[] = new double[3];
        int i, pos;
        System.out.println("Forneça 10 valores para armazenar\n");
        for(i = 0; i < vet1.length; i++)
        {
            System.out.println((i+1)+"º valor: ");
            vet1[i] = sc.nextDouble();
        }
        System.out.println("Digite uma posição de 0 a 7 do vetor: ");
        pos = sc.nextInt();
        if (pos >= 0 && pos <= 7)
        {
            System.arraycopy(vet1, pos, vetcop, 0, vetcop.length);
            System.out.println(Arrays.toString(vetcop));
        }
        else
        {
            System.out.println("Digite uma posição válida!!!");
        }
    }
}
