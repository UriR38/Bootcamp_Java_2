public class Developer {
    private String nombre;
    private String apellidos;
    private int edad;
    private int dni;
    private profesiones rolTecnologico;

    public Developer(String nombre, String apellidos, int edad, int dni, profesiones rolTecnologico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.rolTecnologico = rolTecnologico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public profesiones getRolTecnologico() {
        return rolTecnologico;
    }

    public void setRolTecnologico(profesiones rolTecnologico) {
        this.rolTecnologico = rolTecnologico;
    }
}
