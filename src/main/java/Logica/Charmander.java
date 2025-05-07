
package Logica;


public class Charmander extends Pokemon implements IFuego{
    
    public Charmander(){}
    
   
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    public void atacarArañazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }


}
