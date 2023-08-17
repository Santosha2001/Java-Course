package exp1;

public class Sport {
public String name;
public Player[] player;

public Sport(String name,Player[] player) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.player=player;
}

public void sportInfo()
{
	System.out.println(name);
	for(int i = 0;i<player.length;i++)
	{
		Player play = player[i];
		play.playerInfo();
	}
}
}
