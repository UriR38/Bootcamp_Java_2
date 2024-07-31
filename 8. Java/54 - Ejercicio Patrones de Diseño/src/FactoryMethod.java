abstract class Producto {
    abstract void usar();
}

class ProductoConcretoA extends Producto {
    void usar() {
        System.out.println("Usando Producto A");
    }
}

class ProductoConcretoB extends Producto {
    void usar() {
        System.out.println("Usando Producto B");
    }
}

abstract class Creador {
    abstract Producto crearProducto();

    void operacion() {
        Producto producto = crearProducto();
        producto.usar();
    }
}

class CreadorConcretoA extends Creador {
    Producto crearProducto() {
        return new ProductoConcretoA();
    }
}

class CreadorConcretoB extends Creador {
    Producto crearProducto() {
        return new ProductoConcretoB();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        Creador creadorA = new CreadorConcretoA();
        creadorA.operacion();

        Creador creadorB = new CreadorConcretoB();
        creadorB.operacion();
    }
}
