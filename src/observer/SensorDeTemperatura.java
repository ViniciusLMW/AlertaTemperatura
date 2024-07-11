package observer;

import java.util.ArrayList;
import java.util.List;

public class SensorDeTemperatura {

    private List<TemperaturaObserver> observers = new ArrayList<>();

    public void addTemperaturaObserver(TemperaturaObserver observer) {
        this.observers.add(observer);
    } 

    public void notificarTemperatura(double temperatura) {
        TemperaturaEvent event = new TemperaturaEvent(temperatura);

        //Notificar os observers
        for (TemperaturaObserver observer : this.observers) {
            observer.temperaturaExcedida(event);
        }
    }
}
