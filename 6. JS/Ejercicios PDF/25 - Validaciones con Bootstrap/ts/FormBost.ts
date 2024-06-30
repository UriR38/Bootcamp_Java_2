(function () {
    "use strict";
  
    window.addEventListener("load", function () {
        const forms = document.getElementsByClassName("needs-validation") as HTMLCollectionOf<HTMLFormElement>;
        Array.prototype.filter.call(forms, function (form: HTMLFormElement) {
            form.addEventListener(
                "submit",
                function (event: Event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add("was-validated");
                },
                false
            );
        });
    }, false);
  })();