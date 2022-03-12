import java.util.*;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i, rep, tam=0, nts_acima=0;
        double soma=0, nt_verify;
        do
        {
            System.out.println("\nDigite a quantidade de alunos na sala: ");
            tam = ent.nextInt();
        }
        while (tam<0 && tam>=100);
        System.out.println("\n");
        double nts[] = new double[tam]; 
        for (i=0; i<nts.length; i++)
        {
            System.out.println("Digite a nota do " + (i+1) +"° aluno: ");
            nt_verify = ent.nextDouble();
            if (nt_verify==-1)
            {
                break;
            } 
            else 
            {
                nts[i] = nt_verify;
            }
        }
        rep = nts.length - 1;
        System.out.println("\n\nValores na ordem que foram informados: " + Arrays.toString(nts));
        System.out.println("Valores na ordem inversa que foram informados: ");
        for (i=0; i<nts.length; i++)
        {
            System.out.println(nts[rep]);
            rep=rep-1;
        }
        for (i=0; i<nts.length; i++)
        {
            soma = soma+nts[i];
        }
        System.out.println("\nSoma das Notas: " + soma + ".\nMedia das Notas: " + soma/nts.length + ".");
        for (i=0; i<nts.length; i++)
        {
            if (nts[i]>(soma/nts.length))
            {
                nts_acima = nts_acima + 1;
            }
        }
        System.out.println("Notas acima da media: " + nts_acima + "\n\n");
    }
}