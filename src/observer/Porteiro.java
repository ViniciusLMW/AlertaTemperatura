package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Porteiro extends Thread{

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    } 

    public void notificarChegadaAniversariante() {
        ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());

        //Notificar os observers
        for (ChegadaAniversarianteObserver observer : this.observers) {
            observer.chegou(event);
        }
    }
}
