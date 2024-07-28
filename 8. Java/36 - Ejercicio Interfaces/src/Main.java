public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.setNombre("Mr. Oriol Rodriguez");
        profesor.setSalario(50000);
        System.out.println("\nNombre del Profesor: " + profesor.getNombre());
        System.out.println("Salario del Profesor: " + profesor.getSalario());

        Alumno alumno = new Alumno();
        alumno.setNombre("Mar Romero");
        alumno.setCurso("Matemáticas");
        System.out.println("Nombre del Alumno: " + alumno.getNombre());
        System.out.println("Curso del Alumno: " + alumno.getCurso());
    }
}
