import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Create (INSERT)");
            System.out.println("2. Read (SELECT)");
            System.out.println("3. Update (UPDATE)");
            System.out.println("4. Delete (DELETE)");
            System.out.println("5. Salir");
            System.out.print("Escribe el numero (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    hacerCreate();
                    break;
                case 2:
                    hacerRead();
                    break;
                case 3:
                    hacerUpdate();
                    break;
                case 4:
                    hacerDelete();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void hacerCreate() {
        System.out.println("Escribe tu consulta SQL para CREATE:");
        String sql = scanner.nextLine();
        executeUpdateQuery(sql);
    }

    private static void hacerRead() {
        System.out.println("Escribe tu consulta SQL para READ:");
        String sql = scanner.nextLine();
        executeSelectQuery(sql);
    }

    private static void hacerUpdate() {
        System.out.println("Escribe tu consulta SQL para UPDATE:");
        String sql = scanner.nextLine();
        executeUpdateQuery(sql);
    }

    private static void hacerDelete() {
        System.out.println("Escribe tu consulta SQL para DELETE:");
        String sql = scanner.nextLine();
        executeUpdateQuery(sql);
    }

    private static void executeUpdateQuery(String sql) {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Operación exitosa. Filas afectadas: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeSelectQuery(String sql) {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            int columnCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
