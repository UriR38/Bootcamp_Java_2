interface Estrategia {
    void ejecutar();
}

class EstrategiaConcretaA implements Estrategia {
    public void ejecutar() {
        System.out.println("Estrategia A ejecutada");
    }
}

class EstrategiaConcretaB implements Estrategia {
    public void ejecutar() {
        System.out.println("Estrategia B ejecutada");
    }
}

class Contexto {
    private Estrategia estrategia;

    void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    void ejecutarEstrategia() {
        estrategia.ejecutar();
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        contexto.setEstrategia(new EstrategiaConcretaA());
        contexto.ejecutarEstrategia();

        contexto.setEstrategia(new EstrategiaConcretaB());
        contexto.ejecutarEstrategia();
    }
}
