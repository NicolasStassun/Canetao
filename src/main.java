import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        canetao CanetaoSala301 = new canetao();

        int opcao=1;
        while (opcao!=0) {
            System.out.println("Oque deseja fazer: \n" +
                    "1 - Escrever \n" +
                    "2 - Colocar a Tampa \n" +
                    "3 - Tirar a Tampa \n" +
                    "4 - Fazer o Refil \n" +
                    "5 - Ver quanta tinta ainda resta no Canetão \n" +
                    "0 - Sair");
            opcao = sc.nextInt();


            switch (opcao) {

                case 1:

                    System.out.println(CanetaoSala301.escrever());

                    break;

                case 2:

                    CanetaoSala301.tampaON();

                    break;

                case 3:

                    CanetaoSala301.tampaOFF();

                    break;

                case 4:

                    System.out.println(CanetaoSala301.fazRefil());

                    break;

                case 5:

                    CanetaoSala301.verTinta();

                    break;


            }
        }


    }

}
