import java.util.Scanner;

public class Jogo {

    public void atividadeN1(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Pedra, Papel ou Tesoura");
        System.out.println("Pedra = 1");
        System.out.println("Papel = 2");
        System.out.println("Tesoura = 3");
        System.out.println("Faça sua escolha:");
        byte escolha = teclado.nextByte();


        teclado.close();

        if(escolha == 1){
            System.out.println("Jogador escolheu Pedra.");
        }if(escolha == 2){
            System.out.println("Jogador escolheu Papel.");
        }if(escolha == 3){
            System.out.println("Jogador escolheu Tesoura.");
        }
        System.out.println("");

        byte computador = (byte) (Math.random() * 3 + 1);

        if(computador == 1){
            System.out.println("Computador escolheu Pedra.");
        }if(computador == 2){
            System.out.println("Computador escolheu Papel.");
        }if(computador == 3){
            System.out.println("Computador escolheu Tesoura.");
        }
        System.out.println("");

        if(escolha == computador){
            System.out.println("Empate");
        } else {
            if((escolha == 1 && computador == 3) || (escolha == 2 && computador == 1) || (escolha == 3 && computador == 2)){
                System.out.println("Jogador venceu!!");
            } else {
                System.out.println("Coputador venceu!!");
            }
        }






    }
}
