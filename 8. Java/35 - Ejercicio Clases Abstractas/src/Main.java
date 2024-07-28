public class Main {
    public static void main(String[] args) {
        SerVivo planta = new Planta();
        planta.alimentarse();

        Animal carnivoro = new AnimalCarnivoro();
        carnivoro.alimentarse();

        Animal herbivoro = new AnimalHerbivoro();
        herbivoro.alimentarse();
    }
}
