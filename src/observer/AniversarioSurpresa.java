package observer;

import java.util.Scanner;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Digite 1 para simular a chegada do aniversariante: ");
            int valor = input.nextInt();

            if(valor == 1) {
                porteiro.notificarChegadaAniversariante();
            } else {
                System.out.println("Alarme falso!");
            }
        }
    }
}
