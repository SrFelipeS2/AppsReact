package com.avalencia.PooHerencia;
// A continuacion probamos el "final" esta es una notacion para
// definir que una clase no se puede heredar o que es final en el arbol de herencia
//public class AlumnoInternacionalDiplomatico extends AlumnoInternacional{
//}
//Aquí estamos tratando de implementar una herencia de AlumnoInternacional a AlumnoInternacionalDiplomatico
// y nos marca error obviamente por que AlumnoInternacional esta definido como final, lo correcto seria
// heredar de Alumno
public class AlumnoInternacionalDiplomatico extends Alumno{
}
//De esta manera no marca error y podemos seguir programando