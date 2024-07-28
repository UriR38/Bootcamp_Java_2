public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.setNombre("Oriol Rodriguez");
        System.out.println(emp.toString());

        Operario oper = new Operario();
        oper.setNombre("Carlos López");
        System.out.println(oper.toString());

        Directivo dir = new Directivo();
        dir.setNombre("Ana Gómez");
        System.out.println(dir.toString());

        Oficial ofi = new Oficial();
        ofi.setNombre("Luis Martínez");
        System.out.println(ofi.toString());

        Tecnico tec = new Tecnico();
        tec.setNombre("Marta Fernández");
        System.out.println(tec.toString());
    }
}
