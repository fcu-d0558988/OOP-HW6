package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1=new Player("Player One");
		
		Pokemon pkm11=new Pokemon("Bulbasaur",PokemonType.GRASS,123);
		Pokemon pkm12=new Pokemon("Charmander",PokemonType.FIRE,456);
		Pokemon pkm13=new Pokemon("Psyduck",PokemonType.WATER,89);
		
		Pokemon[] pkm1={pkm11,pkm12,pkm13};
		player1.setPokemons(pkm1);
		
		Player player2=new Player("Player Two");
		
		Pokemon pkm21=new Pokemon("Seel",PokemonType.WATER,432);
		Pokemon pkm22=new Pokemon("Gyarados",PokemonType.WATER,987);
		Pokemon pkm23=new Pokemon("Horsea",PokemonType.WATER,89);
		
		Pokemon[] pkm2={pkm21,pkm22,pkm23};
		player2.setPokemons(pkm2);
		
		GYM.fight(player1,player2);

	}

}
