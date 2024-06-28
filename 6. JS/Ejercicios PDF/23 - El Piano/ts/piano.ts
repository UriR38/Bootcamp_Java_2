"use strict";
document.addEventListener("DOMContentLoaded", function () {
  // sonido
  function playSound(note) {
    const audio = new Audio(`./audio/${note}.wav`);
    audio.play();
  }

  // teclado
  function activateKey(keyElement) {
    keyElement.classList.add("active");
    const note = keyElement.getAttribute("data-note");
    if (note) {
      playSound(note);
    }
  }
  document.addEventListener("keydown", function (event) {
    if (event.repeat) return;
    const keyElement = document.querySelector(
      `.key[data-key="${event.key.toUpperCase()}"]`
    );
    if (keyElement) {
      activateKey(keyElement);
    }
  });
  document.addEventListener("keyup", function (event) {
    const keyElement = document.querySelector(
      `.key[data-key="${event.key.toUpperCase()}"]`
    );
    if (keyElement) {
      keyElement.classList.remove("active");
    }
  });

  // clicks
  const keys = document.querySelectorAll(".key");
  keys.forEach((key) => {
    key.addEventListener("click", function () {
      activateKey(key);
      setTimeout(() => {
        key.classList.remove("active");
      }, 200);
    });
  });
});
