package observer;

public class AlertaTemperatura implements TemperaturaObserver{

    @Override
    public void temperaturaExcedida(TemperaturaEvent event) {
        System.out.println("Alerta! Temperatura: " + event.getTemperatura() + "°C");
    }
}