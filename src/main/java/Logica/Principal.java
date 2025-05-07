
package Logica;


public class Principal {
    public static void main(String[] args) {
         
        Pokemon pokemonsFuego[] = new Pokemon[1];
        Pokemon pokemonsElectrico[] = new Pokemon[1];
        Pokemon pokemonsPlanta[] = new Pokemon[1];
        Pokemon pokemonAgua[] = new Pokemon[1];
        
        pokemonsFuego[0] = new Charmander();
        pokemonsElectrico[0] = new Pikachu();
        pokemonsPlanta[0] = new Bulbasaur();
        pokemonAgua[0] = new Squirtle();
        
        System.out.println("-----FUEGO-----");
        for(Pokemon fuego : pokemonsFuego) {
            
            ((Charmander) fuego).atacarLanzallamas();
            
        }
        
        System.out.println("-----ELECTRICO-----");
        for(Pokemon electrico : pokemonsElectrico) {
            
            ((Pikachu) electrico).atacarRayo();
            
        }
        
        System.out.println("-----AGUA-----");
        for(Pokemon agua : pokemonAgua) {
            
            ((Squirtle) agua).atacarBurbuja();
            
        }
        
         System.out.println("-----PLANTA-----");
        for(Pokemon planta : pokemonsPlanta) {
            
            ((Bulbasaur) planta).atacarLatigoCepa();
            
        }
        
        
        
    }
}
