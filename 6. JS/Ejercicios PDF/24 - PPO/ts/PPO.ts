interface Pregunta {
  pregunta: string;
  opciones: string[];
  respuestaCorrecta: string;
}

const preguntas: Pregunta[] = [
  {
    pregunta:
      "¿Cuál es el lenguaje de programación que se utiliza principalmente para hacer sitios web interactivos?",
    opciones: ["Java", "Python", "JavaScript", "C#"],
    respuestaCorrecta: "JavaScript",
  },
  {
    pregunta:
      "¿Qué lenguaje de programación es conocido por su uso en el desarrollo de sistemas operativos?",
    opciones: ["C++", "Ruby", "PHP", "Python"],
    respuestaCorrecta: "C++",
  },
  {
    pregunta: "¿Qué es un 'commit' en el contexto de Git?",
    opciones: [
      "Una forma de compilar código",
      "Una restauración de estado",
      "Una propuesta de cambio",
      "Un registro de cambios",
    ],
    respuestaCorrecta: "Un registro de cambios",
  },
  {
    pregunta:
      "¿Cuál es el nombre de la función en Python que se usa para añadir elementos a una lista?",
    opciones: ["add()", "push()", "insert()", "append()"],
    respuestaCorrecta: "append()",
  },
  {
    pregunta: "¿Cuál de los siguientes es un framework de JavaScript?",
    opciones: ["Laravel", "Django", "React", "Flask"],
    respuestaCorrecta: "React",
  },
  {
    pregunta:
      "¿Qué operador se usa en SQL para seleccionar un subconjunto de registros?",
    opciones: ["GET", "SELECT", "TAKE", "PICK"],
    respuestaCorrecta: "SELECT",
  },
  {
    pregunta: "¿Qué etiqueta HTML se utiliza para definir un párrafo?",
    opciones: ["<header>", "<p>", "<div>", "<section>"],
    respuestaCorrecta: "<p>",
  },
  {
    pregunta:
      "¿Cuál de estos NO es un nivel de acceso en la programación orientada a objetos?",
    opciones: ["Protected", "Private", "Public", "Internal"],
    respuestaCorrecta: "Internal",
  },
  {
    pregunta:
      "¿Cuál de los siguientes NO es un tipo de dato primitivo en Java?",
    opciones: ["byte", "array", "short", "int"],
    respuestaCorrecta: "array",
  },
  {
    pregunta: "¿Qué es JSON?",
    opciones: [
      "Un lenguaje de programación",
      "Una base de datos",
      "Un formato de intercambio de datos",
      "Un editor de texto",
    ],
    respuestaCorrecta: "Un formato de intercambio de datos",
  },
];

let aciertos = 0;
let fallos = 0;
let preguntasRespondidas = 0;
const totalPreguntas = 5;
let respuestaCorrectaSeleccionada = false;
let preguntasRestantes = [...preguntas]; // Copia del array original

function cargarPregunta() {
  if (
    preguntasRespondidas >= totalPreguntas ||
    preguntasRestantes.length === 0
  ) {
    mostrarResultadoFinal();
    return;
  }

  respuestaCorrectaSeleccionada = false;

  const preguntaIndex = Math.floor(Math.random() * preguntasRestantes.length);
  const pregunta = preguntasRestantes[preguntaIndex];
  preguntasRestantes.splice(preguntaIndex, 1); // Elimina la pregunta seleccionada del array de preguntas restantes

  const preguntaElement = document.getElementById(
    "pregunta"
  ) as HTMLParagraphElement;
  const respuestaContainer = document.querySelector(
    ".respuestas"
  ) as HTMLDivElement;

  preguntaElement.textContent = pregunta.pregunta;
  respuestaContainer.innerHTML = "";

  pregunta.opciones.forEach((opcion) => {
    const button = document.createElement("button");
    button.textContent = opcion;
    button.className = "respuesta";
    button.onclick = () =>
      verificarRespuesta(opcion, button, pregunta.respuestaCorrecta);
    respuestaContainer.appendChild(button);
  });

  actualizarContadores();
}

function verificarRespuesta(
  opcionSeleccionada: string,
  button: HTMLButtonElement,
  respuestaCorrecta: string
) {
  if (respuestaCorrectaSeleccionada) return;

  if (opcionSeleccionada === respuestaCorrecta) {
    button.style.backgroundColor = "green";
    aciertos++;
    preguntasRespondidas++;
    respuestaCorrectaSeleccionada = true;
    lanzarConfeti();
    setTimeout(() => {
      cargarPregunta();
    }, 1500);
  } else {
    button.style.backgroundColor = "red";
    button.classList.add("shake");
    fallos++;
    button.disabled = true;
    setTimeout(() => {
      button.classList.remove("shake");
    }, 1500);
  }

  actualizarContadores();
}

function actualizarContadores() {
  const aciertosElement = document.getElementById(
    "aciertos"
  ) as HTMLSpanElement;
  const fallosElement = document.getElementById("fallos") as HTMLSpanElement;
  aciertosElement.textContent = String(aciertos);
  fallosElement.textContent = String(fallos);
}

function mostrarResultadoFinal() {
  const container = document.querySelector(".container") as HTMLDivElement;
  container.innerHTML = `
    <div class="resultado-final">
      <h1>¡Has terminado el quiz!</h1>
      <p>Aciertos: ${aciertos}</p>
      <p>Fallos: ${fallos}</p>
      <button onclick="reiniciarQuiz()">Volver a jugar</button>
    </div>
  `;
  for (let i = 0; i <= 2; i++) {
    lanzarConfeti();
  }
}

function lanzarConfeti() {
  confetti({
    particleCount: 100,
    spread: 70,
    origin: { y: 0.6 },
  });
}

function reiniciarQuiz() {
  location.reload();
}

document.addEventListener("DOMContentLoaded", cargarPregunta);
