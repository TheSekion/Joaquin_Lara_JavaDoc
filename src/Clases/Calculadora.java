package Clases;

/**
 * La clase calculadora que tiene 2 parametros,
 * que tiene dos metodos y puedes sumar y restar.
 * @version 2.0
 * @author Joaquin
 * */
public class Calculadora {

    int num1;
    int num2;

    /**
     * Para crear una clase persoan necesitas 2 parametros
     * @param num1 es el primer parametro.
     * @param num2 es el segundo parametro.
     * Ambos para operar.
     * */
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * @return La funcion sumer nos devuelve la suma de dos numeros iniciclizados en el objeto.
     * @since 1.0
     * */
    public int  sumar(){
        return num1+num2;
    }

    /**
     * @return La funcion restar nos devuelve la resta de dos numeros iniciclizados en el objeto.
     * @since 0.2
     * */
    public int restar(){
        return num1-num2;
    }

    /**
     * @deprecated La funcion divvidir suele dar un monton de fallos con las operaciones y esta en desusu por que hemos desisteido de ella.
     * */
    @Deprecated
    public int dividir(){
        return num1/num2;
    }
}
