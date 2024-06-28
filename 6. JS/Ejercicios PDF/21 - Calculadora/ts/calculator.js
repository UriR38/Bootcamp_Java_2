"use strict";
document.addEventListener("DOMContentLoaded", () => {
    const buttons = document.querySelectorAll(".button");
    const display = document.getElementById("displayOutput");
    buttons.forEach((button) => {
        button.addEventListener("click", () => {
            handleButtonClick(button, display);
        });
    });
});
function handleButtonClick(button, display) {
    var _a;
    const buttonValue = (_a = button.textContent) === null || _a === void 0 ? void 0 : _a.trim();
    switch (buttonValue) {
        case "=":
            calculateResult(display);
            break;
        case "RESET":
            display.textContent = "0";
            break;
        case "DEL":
            if (display.textContent && display.textContent.length > 0) {
                display.textContent = display.textContent.slice(0, -1);
            }
            if (display.textContent === "") {
                display.textContent = "0";
            }
            break;
        default:
            if (display.textContent === "0") {
                display.textContent = buttonValue;
            }
            else {
                display.textContent += buttonValue;
            }
            break;
    }
}
function calculateResult(display) {
    try {
        const result = eval(display.textContent || "");
        display.textContent = result.toString();
    }
    catch (error) {
        display.textContent = "ERR0R";
    }
}
