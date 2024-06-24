function onOff() {
  const switchElement = document.getElementById("switch");
  const bulbElement = document.getElementById("bombillaApagada");
  const sliderElement = document.getElementById("brillo");

  if (switchElement.classList.contains("off")) {
    switchElement.src = "./img/bon.jpg";
    bulbElement.src = "./img/on.jpg";
    switchElement.classList.remove("off");
    switchElement.classList.add("on");
    sliderElement.style.display = "flex";
  } else {
    switchElement.src = "./img/boff.jpg";
    bulbElement.src = "./img/off.jpg";
    switchElement.classList.remove("on");
    switchElement.classList.add("off");
    sliderElement.style.display = "none";
    bulbElement.style.filter = "brightness(100%)";
    document.getElementById("brilloSlider").value = 100;
  }
}

function adjustBrightness() {
  const bulbElement = document.getElementById("bombillaApagada");
  let sliderValue = document.getElementById("brilloSlider").value;

  if (sliderValue < 2) {
    sliderValue = 2;
    document.getElementById("brilloSlider").value = sliderValue;
  }

  if (sliderValue == 3) {
    bulbElement.src = "./img/on.jpg";
  }

  bulbElement.style.filter = `brightness(${sliderValue}%)`;
}

document.getElementById("switch").addEventListener("click", onOff);
document
  .getElementById("brilloSlider")
  .addEventListener("input", adjustBrightness);
