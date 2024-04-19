import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int meio = 0;
        int a ;
        int b;
        int c;
        System.out.printf("insira o primeiro valor");
           a = ler.nextInt();
        System.out.printf("Insira o segundo valor");
           b = ler.nextInt();
        System.out.printf("Insira o terceiro valor");
           c = ler.nextInt();


      if(a<b && a<c){
         menor = a;
     }
      if (a>b && a>c){
          maior = a;
     }
      else{
          meio = a;
      }
      if(b>a && b>c){
          maior = b;
      }
      else if(b<a && b<c){
          menor = b;
      }
      else{
          meio = b;
      }
      if(c>a && c>b){
          maior = c;
      }
      else if(c<b && c<a){
          menor = c;
      }
      else{
          meio = c;
      }
      System.out.print(maior +" e " + meio +" e "+ menor);

    }
}


