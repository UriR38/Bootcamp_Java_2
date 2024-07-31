public class Coche {
    private String marca;
    private String modelo;
    private int caballos;
    private String motor;

    private Coche(CocheBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.caballos = builder.caballos;
        this.motor = builder.motor;
    }

    @Override
    public String toString() {
        return "Coche: \n\tMarca:\t\t" + marca + " \n\tModelo:\t\t" + modelo + "\n\tCaballos:\t" + caballos + "\n\tMotor:\t\t" + motor + "\n";
    }

    public static class CocheBuilder {
        private String marca;
        private String modelo;
        private int caballos;
        private String motor;

        public CocheBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public CocheBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CocheBuilder setCaballos(int caballos) {
            this.caballos = caballos;
            return this;
        }

        public CocheBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public Coche build() {
            return new Coche(this);
        }
    }
}
