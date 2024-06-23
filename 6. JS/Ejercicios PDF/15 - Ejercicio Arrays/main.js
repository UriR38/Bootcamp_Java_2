const emojis = [
  "😀",
  "😂",
  "🤣",
  "😊",
  "😎",
  "😍",
  "😘",
  "😜",
  "🤪",
  "😡",
  "😭",
  "😱",
  "😴",
  "😷",
  "🤒",
  "🥳",
  "🤯",
  "🤠",
  "🥶",
  "🤢",
  "🤑",
  "🤡",
  "👽",
  "🤖",
  "🎃",
  "😺",
  "🙀",
  "😻",
  "😼",
  "😿",
  "👾",
  "🐵",
  "🙉",
  "🐶",
  "🐺",
  "🦊",
  "🐱",
  "🦁",
  "🐯",
  "🐴",
];

const emojiArray = [];

// PUSH
function addEmoji() {
  const randomIndex = Math.floor(Math.random() * emojis.length);
  const randomEmoji = emojis[randomIndex];
  emojiArray.push(randomEmoji);
  actListaEmojis();
}

//Unshift
function addPrincipoEmoji() {
  const randomIndex = Math.floor(Math.random() * emojis.length);
  const randomEmoji = emojis[randomIndex];
  emojiArray.unshift(randomEmoji);
  actListaEmojis();
}

// Insert At
function addEmojioPosicionX() {
  const randomIndex = Math.floor(Math.random() * emojis.length);
  const randomEmoji = emojis[randomIndex];
  const positionSelect = document.getElementById("posicion");
  const position = parseInt(positionSelect.value) - 1;

  emojiArray.splice(position, 0, randomEmoji);
  actListaEmojis();
}

// POP
function brrEmoji() {
  emojiArray.pop();
  actListaEmojis();
}

//Shift
function brrPricipioEmoji() {
  emojiArray.shift();
  actListaEmojis();
}

//Remove at
function brrEmojioPosicionX() {
  const positionSelect = document.getElementById("posicionBorrar");
  const position = parseInt(positionSelect.value) - 1;

  if (position >= 0 && position < emojiArray.length) {
    emojiArray.splice(position, 1);
  }
  actListaEmojis();
}
// Act lista
function actListaEmojis() {
  const emojiList = document.getElementById("listaDeEmojis");
  emojiList.innerHTML = emojiArray.join(", ");
}
