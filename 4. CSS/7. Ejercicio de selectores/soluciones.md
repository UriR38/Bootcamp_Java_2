/* Orden de mas a menos pesados */

/* Por tener el !important es el mas pesado */  
p {  
  color: red !important;  
}  
/* Segundo lugar para el id */  
#titulo {  
  color: red;  
}  
/* tercer lugar para la clase que contenga un link */  
.container href {  
  color: red;  
}  
/* Luego irian las claes */  
.container {  
  color: red;  
}  
/* Los elementos */  
h1 {  
  color: red;  
}  
/* y por ultimo el global  */  
\* {  
  color: red;  
}  
