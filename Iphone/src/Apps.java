import java.util.Scanner;

public class Apps {
    
    public static void NavegadorInternet() {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Você está no Navegador de Internet");
        System.out.println("Abriu uma aba");
        System.out.println("1 - Abrir Nova Aba");
        System.out.println("2 - Atualizar Pagina");
        System.out.println("3 - Fechar uma Aba");
        System.out.println("0 - Voltar ao Inicio");

        int escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Você Abriu uma Nova Aba");
            NavegadorInternet();
        }else if (escolha == 2){
            System.out.println("Você Atualizou a Página");
            NavegadorInternet();
        }else if (escolha == 3){
            System.out.println("Você Fechou uma Aba");
            NavegadorInternet();
        }else if (escolha == 0){
            Rphone.Iphone();
        }else{
            System.out.println("Escolha incorreta!");
            NavegadorInternet();
        }   
        }
    }

    public static void AparelhoTelefonico() {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Você está no Telefone");
        System.out.println("Selecione uma opção");
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender");
        System.out.println("3 - Iniciar Correio de Voz");
        System.out.println("0 - Voltar ao Inicio");

        int escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Você Ligou");
            AparelhoTelefonico();
        }else if (escolha == 2){
            System.out.println("Você Atendeu");
            AparelhoTelefonico();
        }else if (escolha == 3){
            System.out.println("Você Abriu o correio de voz");
            AparelhoTelefonico();
        }else if (escolha == 0){
            Rphone.Iphone();
        }else{
            System.out.println("Escolha incorreta!");
            AparelhoTelefonico();
        }   
        }

    }    

    public static Object ReprodutorDeMusica(){
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Você está no reprodutor de musica!");
        System.out.println("Selecione uma musica");
        System.out.println("1 - Rock");
        System.out.println("2 - Samba");
        System.out.println("3 - Voltar ao Inicio");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            System.out.println("Você está Ouvindo Rock");
            TocandoMusica();
        }else if (escolha == 2){
            System.out.println("Você está Ouvindo Samba");
            TocandoMusica();
        }else if (escolha == 3){
            return Rphone.Iphone();
        }else{
            System.out.println("Escolha incorreta!");
            return ReprodutorDeMusica();
        }        


    }
        return "";
    }
    
    static void TocandoMusica(){
        try (Scanner scanner = new Scanner(System.in)) {        
        int botão = 1;
        if( botão != 0){
            System.out.println("Aperte 1 para Pausar");
            System.out.println("Aperte 0 para Voltar");
            botão = scanner.nextInt();
        }
        if(botão == 1){
            System.out.println("Aperte 2 para Tocar");
            System.out.println("Aperte 0 para Voltar");        
            botão = scanner.nextInt();
        }else if(botão == 0){
            ReprodutorDeMusica();
        }else{
            System.out.println("Opção Invalida!");
            ReprodutorDeMusica();
        }
        if(botão == 2){
            TocandoMusica();
        }else if(botão == 0){
            ReprodutorDeMusica();
        }else{
            System.out.println("Opção Invalida!");
            ReprodutorDeMusica();
        }
        
        
        }
    }
}
