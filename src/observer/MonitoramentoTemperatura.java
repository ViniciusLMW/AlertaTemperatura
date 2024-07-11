package observer;

import java.util.Scanner;

public class MonitoramentoTemperatura {
    public static void main(String[] args) {
        AlertaTemperatura alertaTemperatura = new AlertaTemperatura();
        SensorDeTemperatura sensorDeTemperatura = new SensorDeTemperatura();

        sensorDeTemperatura.addTemperaturaObserver(alertaTemperatura);

        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Digite a temperatura atual: ");
            double temperatura = input.nextDouble();

            if(temperatura >= 30.0) {
                sensorDeTemperatura.notificarTemperatura(temperatura);
            } else {
                System.out.println("Temperatura dentro dos limites");
            }
        }
    }
}
