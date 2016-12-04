package fcu.iecs.oop.pokemon;

import fcu.iecs.oop.pokemon.Pokemon.PokemonType;

public class GYM {
	public static Player fight(Player... players){
		int i;int j;int m=0,n=0;
		for(i=0;i<players.length;i++)
		{
			for(j=0;j<3;j++)
			{
				if(players[i].getPokemons()[j].getType()==players[i+1].getPokemons()[j].getType())
				{
					
				}
				else if((players[i].getPokemons()[j].getType()==PokemonType.FIRE&&players[i+1].getPokemons()[j].getType()==PokemonType.GRASS)||
						(players[i].getPokemons()[j].getType()==PokemonType.GRASS&&players[i+1].getPokemons()[j].getType()==PokemonType.WATER)||
						(players[i].getPokemons()[j].getType()==PokemonType.WATER&&players[i+1].getPokemons()[j].getType()==PokemonType.FIRE))
				{
					m+=1;
				}
				else
				{
					n+=1;
				}
			}
			if(m==n)
			{
				m=n=0;
				for(j=0;j<3;j++)
				{
					if(players[i].getPokemons()[j].getCp()==players[i+1].getPokemons()[j].getCp())
					{
						continue;
					}
					else if(players[i].getPokemons()[j].getCp()>players[i+1].getPokemons()[j].getCp())
					{
						m+=1;
					}
					else
					{
						n+=1;
					}
				}
				if(m==n)
				{
					double a=Math.random()*10;
					if(a%2==0)
					{
						int p=players[i].getLevel();
						players[i].setLevel(p+1);
						System.out.println("Winner is "+players[i].getPlayerName()+",and his/her lever becomes "+players[i].getLevel()+".");
						
					}
					else
					{
						int r=players[i+1].getLevel();
						players[i+1].setLevel(r+1);
						System.out.println("Winner is "+players[i+1].getPlayerName()+",and his/her lever becomes "+players[i+1].getLevel()+".");
						
					}
				}
				else if(m>n)
				{
					int p=players[i].getLevel();
					players[i].setLevel(p+1);
					System.out.println("Winner is "+players[i].getPlayerName()+",and his/her lever becomes "+players[i].getLevel()+".");
					
				}
				else
				{
					int r=players[i+1].getLevel();
					players[i+1].setLevel(r+1);
					System.out.println("Winner is "+players[i+1].getPlayerName()+",and his/her lever becomes "+players[i+1].getLevel()+".");
					
				}
			}
			else if(m>n)
			{
				int p=players[i].getLevel();
				players[i].setLevel(p+1);
				System.out.println("Winner is "+players[i].getPlayerName()+",and his/her lever becomes "+players[i].getLevel()+".");
				
			}
			else
			{
				int r=players[i+1].getLevel();
				players[i+1].setLevel(r+1);
				System.out.println("Winner is "+players[i+1].getPlayerName()+",and his/her lever becomes "+players[i+1].getLevel()+".");
				
			}
		}
		return null;
		
	}
}
