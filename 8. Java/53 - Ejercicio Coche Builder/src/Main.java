public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche.CocheBuilder()
                .setMarca("Toyota")
                .build();
        System.out.println(coche1);

        Coche coche2 = new Coche.CocheBuilder()
                .setMarca("Honda")
                .setModelo("Civic")
                .build();
        System.out.println(coche2);

        Coche coche3 = new Coche.CocheBuilder()
                .setMarca("Ford")
                .setModelo("Mustang")
                .setCaballos(450)
                .build();
        System.out.println(coche3);
    }
}
