
import java.util.Scanner;


        
public class Conta {
    
    Scanner scan = new Scanner(System.in);
    public String Nome;
    public int[] Notas;
    
    public Conta(){
        System.out.println("digite a sua conta:");
    }
    public void addnotas() {
        System.out.println("Quantas notas deseja digitar?");
        int n = scan.nextInt();
        Notas = new int[n];
        for (int x =0; x < n; x++) {
            int numero = x + 1;
            System.out.println("Entre com a nota" + numero + ":");
            Notas[x] = scan.nextInt();
        }
        
    }
}
    
    
    
    
    
    
    
   
    
    
  






