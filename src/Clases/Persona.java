package Clases;
/**
 * La clase persona que tiene 2 parametros,
 * que tiene dos metodos y puedes obtenerlo o editarlos tambien piedes saludar pero es deprecate.
 * @version  0.9
 * @author Joaquin
 * */
public class Persona {


    private String nombre;
    private  int edad;

    /**
     * Para crear una clase persoan necesitas 2 parametros
     * @param nombre es el nombre de la persona.
     * @param edad es la edad de la persona.
     * */


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Esta funcion es una funcion que ya no se actuliza.
     * @deprecated ya esta obsloeta la puedes uar pero nada.
     */
    @Deprecated
    public void saludar(){
        System.out.println("Hola " + this.nombre +", tienes " + this.edad + " annos");;
    }


    /**
     * @return Devuelve el nombre de la persona.
     * @since 1.0
     * */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la persona.
     * @param nombre es el nuevo nombre de la persona.
     * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve la edad de la persona.
     * @since 1.0
     * */
    public int getEdad() {
        return edad;
    }

    /**
     * Cambia la edad de la persona.
     * @param edad es la nueva edad la persona.
     * */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
