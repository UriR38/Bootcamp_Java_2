document.addEventListener("DOMContentLoaded", () => {
  setupProgressHandlers();
  simulateTimePassing();
});
function setupProgressHandlers() {
  document
    .getElementById("foodIcon")
    .addEventListener("click", () => increaseProgress("foodProgress"));
  document
    .getElementById("funIcon")
    .addEventListener("click", () => increaseProgress("funProgress"));
  document
    .getElementById("bathroomIcon")
    .addEventListener("click", () => decreaseProgress("bathroomProgress"));
  document
    .getElementById("sleepIcon")
    .addEventListener("click", () => decreaseProgress("sleepProgress"));
}

function increaseProgress(progressId) {
  const progressElement = document.getElementById(progressId);
  let currentValue = parseInt(progressElement.value, 10);
  progressElement.value = Math.min(currentValue + 10, 100);
  handleProgressVisibility(progressId, progressElement.value);
}

function decreaseProgress(progressId) {
  const progressElement = document.getElementById(progressId);
  let currentValue = parseInt(progressElement.value, 10);
  progressElement.value = Math.max(currentValue - 10, 0);
  handleProgressVisibility(progressId, progressElement.value);
}

function simulateTimePassing() {
  setInterval(() => {
    increaseProgress("bathroomProgress");
    decreaseProgress("foodProgress");
    decreaseProgress("funProgress");
    increaseProgress("sleepProgress");
  }, 6000); // TIEMPOO
}

function handleProgressVisibility(progressId, value) {
  switch (progressId) {
    case "bathroomProgress":
      toggleCacotaVisibility(value);
      break;
    case "funProgress":
      changePetImage(value === 0 ? "./img/cry.gif" : "./img/original.gif");
      break;
    case "sleepProgress":
      toggleZzzVisibility(value);
      break;
  }
}

function toggleCacotaVisibility(bathroomValue) {
  const cacotaImage = document.getElementById("cacota");
  cacotaImage.style.display = bathroomValue === 100 ? "block" : "none";
  adjustZzzPositionBasedOnCacota();
}

function toggleZzzVisibility(sleepValue) {
  const zzzImage = document.getElementById("zzz");
  zzzImage.style.display = sleepValue === 100 ? "block" : "none";
  adjustZzzPositionBasedOnCacota();
}

function adjustZzzPositionBasedOnCacota() {
  const cacotaImage = document.getElementById("cacota");
  const zzzImage = document.getElementById("zzz");
  if (
    cacotaImage.style.display === "block" &&
    zzzImage.style.display === "block"
  ) {
    zzzImage.style.position = "absolute";
    zzzImage.style.top = "40px";
    zzzImage.style.left = "45%";
  } else {
    zzzImage.style.top = "40px";
    zzzImage.style.left = "55%";
  }
}

function changePetImage(newImagePath) {
  const petImage = document.getElementById("petM");
  petImage.src = newImagePath;
}
