package monitorizacao;

import java.util.ArrayList;
import java.util.List;

public class Semaforo {

    private final List<Observer> Observers = new ArrayList<>();
    private String estado;

    public void addObserver(Observer observer) {
        Observers.add(observer);
    }

    public void setEstado(String estado) {
        this.estado = estado;

        System.out.println(" Semáforo mudou para: " + estado);

        notificarObservers();
    }

    private void notificarObservers() {
        for (Observer obs : Observers) {
            obs.update(estado);
        }
    }

}