import java.util.Scanner;

public class Rphone {
    public static void main(String[] args) throws Exception {
        Iphone();
    }

    static Object Iphone(){
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Olá você está no RPhone");
        System.out.println("Selecione uma das Opções:");
        System.out.println("1 - RMusics");
        System.out.println("2 - RCall");
        System.out.println("3 - RNet");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            Apps.ReprodutorDeMusica();
        }else if (escolha == 2){
            Apps.AparelhoTelefonico();
        }else if (escolha == 3){
            Apps.NavegadorInternet();
        }else{
            System.out.println("Escolha incorreta!");
            return Iphone();
        }
        }
        return null;   
    }
}