public class Singleton {
    private static Singleton instancia;

    private Singleton() {
        // Constructor privado para evitar la instanciación
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Instancia Singleton");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstancia();
        singleton.mostrarMensaje();
    }
}
