package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque afilado");

    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque latigo cepa");

    }

}
