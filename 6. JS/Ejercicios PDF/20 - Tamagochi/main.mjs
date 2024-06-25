// Este script maneja las interacciones y estados de un juego tipo Tamagotchi.

document.addEventListener("DOMContentLoaded", () => {
    setupProgressHandlers();
    simulateTimePassing();
  });
  
  // Configura los manejadores de eventos para cada icono de acción.
  function setupProgressHandlers() {
    document.getElementById("foodIcon").addEventListener("click", () => increaseProgress("foodProgress"));
    document.getElementById("funIcon").addEventListener("click", () => increaseProgress("funProgress"));
    document.getElementById("bathroomIcon").addEventListener("click", () => decreaseProgress("bathroomProgress"));
    document.getElementById("sleepIcon").addEventListener("click", () => increaseProgress("sleepProgress"));
  }
  
  // Incrementa la barra de progreso y gestiona la visibilidad y cambios de imagen.
  function increaseProgress(progressId) {
    const progressElement = document.getElementById(progressId);
    let currentValue = parseInt(progressElement.value, 10);
    progressElement.value = Math.min(currentValue + 10, 100);
  
    if (progressId === "bathroomProgress") {
      toggleCacotaVisibility(progressElement.value);
    }
  
    if (progressId === "funProgress" && currentValue === 0) {
      changePetImage("./img/original.gif"); // Vuelve a la imagen original cuando la diversión se recupera.
    }
  }
  
  // Decrementa la barra de progreso y gestiona la visibilidad y cambios de imagen.
  function decreaseProgress(progressId) {
    const progressElement = document.getElementById(progressId);
    let currentValue = parseInt(progressElement.value, 10);
    progressElement.value = Math.max(currentValue - 10, 0);
  
    if (progressId === "bathroomProgress") {
      toggleCacotaVisibility(progressElement.value);
    }
  
    if (progressId === "funProgress" && progressElement.value === 0) {
      changePetImage("./img/cry.gif"); // Cambia a imagen triste cuando la diversión llega a 0.
    }
  }
  
  // Simula el paso del tiempo, alterando progresivamente las barras de progreso.
  function simulateTimePassing() {
    setInterval(() => {
      increaseProgress("bathroomProgress");
      decreaseProgress("foodProgress");
      decreaseProgress("funProgress");
      decreaseProgress("sleepProgress");
    }, 6000); // Actualiza cada 6 segundos.
  }
  
  // Controla la visibilidad de la imagen asociada al estado del baño.
  function toggleCacotaVisibility(bathroomValue) {
    const cacotaImage = document.getElementById("cacota");
    cacotaImage.style.display = bathroomValue === 100 ? "block" : "none";
  }
  
  // Cambia la imagen principal del Tamagotchi.
  function changePetImage(newImagePath) {
    const petImage = document.getElementById("petM");
    petImage.src = newImagePath;
  }
  