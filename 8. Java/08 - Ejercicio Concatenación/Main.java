
public class Main {
	public static void main(String[] args) {

		String nombre = "Oriol";
		String apellido = "Rodriguez";
		String calle = "Calle Falsa 123";
		String municipio = "Springfield";
		String codigoPostal = "12345";
		char sexo = 'M';
		String mail = "oriolrodriguez.98@gmail.com";

		String infoConcatenada = 	"Nombre:\t\t\t" + nombre + 
									"\n" + "Apellido:\t\t" + apellido + 
									"\n" + "Calle:\t\t\t" + calle + 
									"\n" + "Municipio:\t\t" + municipio + 
									"\n" + "Código Postal:\t\t" + codigoPostal + 
									"\n" + "Sexo:\t\t\t" + sexo + 
									"\n" + "Correo Electrónico:\t" + mail;

		System.out.println(infoConcatenada);
	}
}
