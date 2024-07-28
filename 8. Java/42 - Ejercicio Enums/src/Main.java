
public class Main {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Oriol", "Rodriguez Martinez", 26, 482750233, profesiones.FRONT_END_DEVELOPER);
        Developer dev2 = new Developer("Mar", "Romero Lara", 26, 422750233, profesiones.BACK_END_DEVELOPER);
        Developer dev3 = new Developer("Barbara", "Martinez Hidalgo", 26, 482050233, profesiones.FULL_STACK_DEVELOPER);

        Developer[] developers = {dev1, dev2, dev3};

        for (Developer dev : developers) {
            if (dev.getRolTecnologico() == profesiones.BACK_END_DEVELOPER || dev.getRolTecnologico() == profesiones.FULL_STACK_DEVELOPER) {
                System.out.println(dev.getNombre() + " " + dev.getApellidos() + " - Viva el Back.");
            } else {
                System.out.println(dev.getNombre() + " " + dev.getApellidos() + ", no eres Back End Developer, buuuuuh.");
            }
        }
    }
}