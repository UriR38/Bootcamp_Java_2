public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Demasiados parámetros, es maximo es 2.");
            return;
        }

        if ("Federico".equals(args[0]) && "GarcíaLorca".equals(args[1])) {
            Lorca recitar = new Lorca();
            recitar.recitarPoema();
        } else {
            NotAutorizado noAutorizado = new NotAutorizado();
            noAutorizado.mensajeNoAutorizado();
        }
    }
}