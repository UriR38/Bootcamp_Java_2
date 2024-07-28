import java.util.List;
import java.util.Scanner;

public class Main {
    private static final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Salir");
            System.out.print("Escribe el numero (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createUsuario();
                    break;
                case 2:
                    readUsuarios();
                    break;
                case 3:
                    updateUsuario();
                    break;
                case 4:
                    deleteUsuario();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void createUsuario() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Usuario usuario = new Usuario(0, nombre, edad);
        usuarioDAO.create(usuario);
        System.out.println("Usuario creado exitosamente.");
    }

    private static void readUsuarios() {
        List<Usuario> usuarios = usuarioDAO.read();
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre() + ", Edad: " + usuario.getEdad());
        }
    }

    private static void updateUsuario() {
        System.out.print("Ingrese ID del usuario a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Ingrese nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese nueva edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Usuario usuario = new Usuario(id, nombre, edad);
        usuarioDAO.update(usuario);
        System.out.println("Usuario actualizado exitosamente.");
    }

    private static void deleteUsuario() {
        System.out.print("Ingrese ID del usuario a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        usuarioDAO.delete(id);
        System.out.println("Usuario eliminado exitosamente.");
    }
}
