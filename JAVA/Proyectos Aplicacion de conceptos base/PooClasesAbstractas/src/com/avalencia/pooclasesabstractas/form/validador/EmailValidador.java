package com.avalencia.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{
    protected String mensaje = "el campo %s tiene un formato incorrecto";

    //En expresiones regulares ^ este caracter significa que va a validar el String desde el inicio de la linea
    //los () indican que va a haber una agrupacion de caracteres y el . indica cualquier caracter y el + que x caracter se pueda repetir n cantidad de veces
    // esta seria una implementacion mas robusta para la validacion de caracteres en el email
    //private final static String EMAIL_REGEX = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$\"";


    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //matches, se encarga de verificar que el string que pasen por parametro sea acorde a la
        //validacion o la expresion regular que valida
        return valor.matches(EMAIL_REGEX);
    }
}
