import java.util.Scanner; 
public class IMC
{
    
 public static void main(String[] args)
 
 {
     
     Scanner input = new Scanner(System.in);
    
        float peso,
              altura,
              imc; 
 
     System.out.print("Qual seu peso? "); 
     peso = input.nextFloat();

     System.out.print("Qual sua altura? "); 
     altura = input.nextFloat();

     imc = (peso / (altura * altura));
     System.out.printf("seu IMC \u00e9 %.1f", imc);

    }
}