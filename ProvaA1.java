import java.util.Scanner;

public class ProvaA1 {

    public static void main(String[] args) {

    int anoBissexto;    

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o ano:");
    anoBissexto = scanner.nextInt();

    if (anoBissexto %4 == 0 && anoBissexto %100 != 0 || anoBissexto %400 == 0){
    System.out.println("O ano informado é bissexto.");

}
    
    else {
        System.out.println("O ano informado não é bissexto.");
            
        }
      scanner.close();
    }
    }

