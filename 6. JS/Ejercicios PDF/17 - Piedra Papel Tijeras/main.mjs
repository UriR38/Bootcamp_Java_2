document.addEventListener("DOMContentLoaded", function () {
  MejorD3();
});

function MejorD3() {
  let puntuacionUser = 0;
  let puntuacionPC = 0;
  const contenedorResultados = document.createElement("div");
  document.body.appendChild(contenedorResultados);

  const puntuacionInicial = document.createElement("p");
  puntuacionInicial.className = "puntuacion";
  puntuacionInicial.innerHTML = `<span class='puntuaciones'>Puntuacion</span>`;
  puntuacionInicial.innerHTML = `<span class='user'>Usuario</span>: <span class='puntUser'>${puntuacionUser}</span> <span class='maquina'>Maquina</span>: <span class='puntPC'>${puntuacionPC}</span>`;
  contenedorResultados.appendChild(puntuacionInicial);

  while (puntuacionUser < 2 && puntuacionPC < 2) {
    const resultado = PPT(contenedorResultados);
    if (resultado === "usuario") {
      puntuacionUser++;
    } else if (resultado === "computadora") {
      puntuacionPC++;
    }
    const p = document.createElement("p");
    p.className = "puntuacion";
    p.innerHTML = `<span class='puntuaciones'>Puntuacion</span>`;
    p.innerHTML = `<span class='user'>Usuario</span>: <span class='puntUser'>${puntuacionUser}</span> - <span class='maquina'>Maquina</span>: <span class='puntPC'>${puntuacionPC}</span>`;
    contenedorResultados.appendChild(p);
  }

  const resultadoFinal = document.createElement("p");
  resultadoFinal.className = "resultado";
  if (puntuacionUser === 2) {
    resultadoFinal.classList.add("victoria");
    resultadoFinal.innerHTML = "¡Ganaste el mejor de 3!";
  } else {
    resultadoFinal.classList.add("derrota");
    resultadoFinal.innerHTML = "Perdiste el mejor de 3.";
  }
  contenedorResultados.appendChild(resultadoFinal);
}

function PPT(contenedor) {
  const opciones = ["piedra", "papel", "tijeras"];
  const emojis = {
    piedra: "✊",
    papel: "✋",
    tijeras: "🖖",
  };

  const jugadaPC = opciones[Math.floor(Math.random() * opciones.length)];
  const jugadaUser = prompt(
    "Escribe una opción entre: Piedra, Papel o Tijeras"
  ).toLowerCase();

  const pUser = document.createElement("p");
  pUser.className = "jugada";
  pUser.innerHTML = `<span class=''>${jugadaUser.toUpperCase()}</span> ${
    emojis[jugadaUser]
  } <span class='vs'>vs</span> ${emojis[jugadaPC]} ${jugadaPC.toUpperCase()}`;
  contenedor.appendChild(pUser);

  if (jugadaUser === jugadaPC) {
    const empate = document.createElement("p");
    empate.innerHTML = "Empate";
    contenedor.appendChild(empate);

    const hr = document.createElement("hr");
    hr.className = "hr";
    contenedor.appendChild(hr);

    return "empate";
  } else if (
    (jugadaUser === "piedra" && jugadaPC === "tijeras") ||
    (jugadaUser === "tijeras" && jugadaPC === "papel") ||
    (jugadaUser === "papel" && jugadaPC === "piedra")
  ) {
    const ganado = document.createElement("p");
    ganado.innerHTML = "¡Has ganado!";
    contenedor.appendChild(ganado);

    const hr = document.createElement("hr");
    hr.className = "hr";
    contenedor.appendChild(hr);

    return "usuario";
  } else {
    const perdido = document.createElement("p");
    perdido.innerHTML = "Has perdido :(";
    contenedor.appendChild(perdido);

    const hr = document.createElement("hr");
    hr.className = "hr";
    contenedor.appendChild(hr);

    return "computadora";
  }
}
