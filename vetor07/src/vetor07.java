import java.util.Scanner;

public class vetor07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int[15];
        int numero;  
        int contador=0;
        System.out.println("Digite 15 valores ");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
           
            }
           
            System.out.println("Digite um numero "); 
            numero=scanner.nextInt();
            for (int i = 0; i < vetor.length; i++) {


             if (numero==vetor[i]) {
                contador++;
                
             }  
            
         }
        
         System.out.println("Esse numero aparece: "+ contador+ " vezes");
         scanner.close();
    }
}
