public class Team
{
	private String name;
	private PlayerList	players;
	
	// Purpose:
	//	initialize this instance of Team
	// 	with no Player
	//
	public Team (String name){
		this.name=name;
		players = new PlayerList();
	}
	
	// Purpose:
	//	initialize this instance of Team
	//	add p to the list of phone players associated with 
	//	this Team
	//
	public Team (String name, Player p){
		this.name=name;
		players = new PlayerList();
		players.add(p);
	}

	// Purpose: 
	//	return the name associated with this instance
	//
	public String getName (){	
		return this.name;
	}

	// Purpose:
	//	change the name associated with this instance to be newName
	//
	public void setName(String newName){	
		name = newName;
	}

	// Purpose:
	//	add a new player to this Team
	//	there is no maximum number of phone players that can be
	//	assigned to a Team.
	//
	public void addPlayer (Player p){
		players.add(p);
	}

	// Purpose:
	//	remove p from the list of Players associated with this Team
	//	if p is not in the list, do nothing.
	//
	public void removePlayer (Player p){
		int x = players.find(p);
		players.remove(x);
	}

	// Purpose:
	//	return the count of Players associated with this Team
	//
	public int getPlayerCount(){	
		return players.size();
	}
	
	// Purpose:
	//	return the player at index pos from this Team
	//	
	// Pre-condition:
	//	pos >= 0 AND
	//	pos < this.getPlayerCount()
	//
	public Player getPlayer (int pos){
		String y = (players.get(pos).getName());
		int x = (players.get(pos).getBattingAvg());
		Player s = new Player(y,x);
		return s;
	}

	// Purpose:
	//	return a String representation of this Team	
	//
	public String toString(){
		String s = name;
		for (int i=0;i<players.size();i++){
			s += "\n";
			s += players.get(i);
		}
		return s;
	}
}
