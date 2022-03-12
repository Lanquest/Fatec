import java.util.*;
public class exerc2 {
    
    public static void main(String[] args) {
        double vet1[] = new double [8];
        double vet2[] = new double [8];
        int i;
        for (i = 0; i < vet1.length; i++)
        {
            vet1[i] = i + 1;
            vet2[vet1.length - i - 1] = vet1[i];
        }
        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));


    }
}
