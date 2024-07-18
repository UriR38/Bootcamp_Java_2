
public class Main {
	public static void main(String[] args) {
		// PRIMERA PARTE
		System.out.println("Apartado 1:");
		int valorAleatorio = (Math.random() < 0.5) ? 0 : 1;

		// Sin el else
		boolean esRojo = valorAleatorio == 0;

		if (esRojo) {
			System.out.print("🟥");
		}
		if (!esRojo) {
			System.out.print("⬛️");
		}

		// Con else
		boolean esRojo2 = valorAleatorio == 0;

		if (esRojo2) {
			System.out.print("🟥");
		} else {
			System.out.print("⬛️");
		}

		// Usando el operador ternario
		System.out.println(valorAleatorio == 0 ? "🟥" : "⬛️");

		// SEGUNDA PARTE

		System.out.println("Apartado 2:");
		double temperatura = 26.5;
		String tipoClima;
		System.out.println();

		if (temperatura < 10) {
			if (temperatura < 5) {
				tipoClima = "Polar";
			} else {
				tipoClima = "Alta montaña";
			}
		} else if (temperatura >= 10 && temperatura < 20) {
			if (temperatura >= 10 && temperatura < 13.5) {
				tipoClima = "Oceánico";
			} else if (temperatura >= 13.5 && temperatura < 16.5) {
				tipoClima = "Mediterráneo";
			} else {
				tipoClima = "Continental";
			}
		} else {
			if (temperatura >= 20 && temperatura < 23.5) {
				tipoClima = "Ecuatorial";
			} else if (temperatura >= 23.5 && temperatura < 26.5) {
				tipoClima = "Tropical";
			} else {
				tipoClima = "Desértico";
			}
		}

		System.out.println("Temperatura: " + temperatura);
		System.out.println("Clima: " + tipoClima);
		System.out.println();

		tipoClima = (temperatura < 10) ? ((temperatura < 5) ? "Polar" : "Alta montaña")
				: (temperatura < 20)
						? ((temperatura < 13.5) ? "Oceánico" : (temperatura < 16.5) ? "Mediterráneo" : "Continental")
						: (temperatura < 23.5) ? "Ecuatorial" : (temperatura < 26.5) ? "Tropical" : "Desértico";

		System.out.println("Temperatura " + temperatura + "\nClima: " + tipoClima);

	}
}
