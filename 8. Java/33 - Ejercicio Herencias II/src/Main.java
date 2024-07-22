public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Oriol", "Rodriguez", "12345678", "Cliente", "VIP");
        System.out.println("Cliente Nombre: " + cliente.getNombres() + " " + cliente.getApellidos());
        System.out.println("Cliente Código: " + cliente.getCodigo());

        Empleado empleado = new Empleado("Mar", "Romero", "87654321", "Empleado", "Full-time", 3000.0f);
        System.out.println("Empleado Nombre: " + empleado.getNombres() + " " + empleado.getApellidos());
        System.out.println("Empleado Sueldo: " + empleado.calcularSueldo());
    }
}
