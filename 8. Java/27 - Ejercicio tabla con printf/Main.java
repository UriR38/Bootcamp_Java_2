public class Main {
    public static void main(String[] args) {
        String[][] alumnos = {
            {"Juan", "Pérez", "Matemáticas", "2022"},
            {"Ana", "García", "Historia", "2021"},
            {"Luis", "Martínez", "Ciencias", "2023"},
            {"María", "Rodríguez", "Literatura", "2024"}
        };

        System.out.printf("%-15s %-20s %-15s %-5s\n", "Nombre", "Apellidos", "Curso", "Año");
        System.out.printf("%-15s %-20s %-15s %-5s\n", "---------------", "--------------------", "---------------", "-----");

        for (String[] alumno : alumnos) {
            System.out.printf("%-15s %-20s %-15s %-5s\n", alumno[0], alumno[1], alumno[2], alumno[3]);
        }
    }
}
