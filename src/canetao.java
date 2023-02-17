import java.util.Scanner;

public class canetao {

    static Scanner sc = new Scanner(System.in);

    String Cor;
    double quantiddadeTinta = 100.0;
    Boolean tampaOn=true;
    String material = "Plástico";

    public String toString() {
        return "canetao{" +
                "Cor='" + Cor + '\'' +
                ", quantiddadeTinta=" + quantiddadeTinta +
                ", tampaOn=" + tampaOn +
                ", material='" + material + '\'' +
                '}';
    }

    public String escrever(){

        if (tampaOn==false) {

            System.out.println("Oque deseja escrever? : ");

            quantiddadeTinta -= 1.0;

            String escrito = sc.nextLine();


            return escrito;
        }
        return "Tire a tampa do canetão";
    }

    public Boolean tampaON(){

        tampaOn=true;

        return tampaOn;
    }

    public Boolean tampaOFF(){

        tampaOn=false;

        return tampaOn;
    }
    public String fazRefil(){

        System.out.println("Qual cor você deseja colocar no refíl? : ");
        String corNova = sc.nextLine();

        Cor = corNova;
        quantiddadeTinta = 100.0;

        return  Cor;
    }
    public void verTinta(){



        if (quantiddadeTinta==0.0){

            System.out.println("Canetão sem tinta, faça o refil");

        }
        else{
            System.out.println("O canetão possui "+quantiddadeTinta+"% da tinta");
        }

    }




}
