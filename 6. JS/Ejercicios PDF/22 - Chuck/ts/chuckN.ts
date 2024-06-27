const jokeButton = document.getElementById("next");
const jokeDisplay = document.getElementById("frase");

jokeButton.addEventListener("click", () => {
  fetch("https://api.chucknorris.io/jokes/random")
    .then((response) => response.json())
    .then((json) => {
      jokeDisplay.innerText = json.value;
    })
    .catch((error) => {
      jokeDisplay.innerText = "Error al cargar un chiste.";
      console.error("Error fetching the joke:", error);
    });
});
