import java.util.ArrayList;
import java.util.List;

interface Observer {
    void actualizar(String mensaje);
}

class Sujeto {
    private List<Observer> observers = new ArrayList<>();

    void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    void notificarObservers(String mensaje) {
        for (Observer observer : observers) {
            observer.actualizar(mensaje);
        }
    }
}

class ObserverConcreto implements Observer {
    private String nombre;

    ObserverConcreto(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Observer observer1 = new ObserverConcreto("Observer 1");
        Observer observer2 = new ObserverConcreto("Observer 2");

        sujeto.agregarObserver(observer1);
        sujeto.agregarObserver(observer2);

        sujeto.notificarObservers("Mensaje de notificación");
    }
}
