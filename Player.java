package ca.uvic.seng330.assn1;


enum Position {
	DEFENDER, WINGER, CENTRE, GOALTENDER
}
/**
 * A Player belongs to a team.
 * Requires:
 * 		Position: Defender, Winger, Centre, Goalie
 * 		Points: Goals/Assists
 * 		Name: First Last
 */
public class Player {
	
	private Position playerPosition;
	private int playerPoints;
	private String playerName;
	private int size;
	//compare player by their points
	
	public Player(String name, int points, Position position) {
		assert playerPosition != null;
		playerPosition = position;
		playerName = name;
		playerPoints = points;
	}
	
	public Player(String name, Position position) {
		assert playerPosition != null;
		playerPosition = position;
		playerName = name;
	}
	
	public void setPoints() {
		
	}
	
	public int getSize() {
		//probably don't need
		return this.size;
	}
	
	public int getPoints() {
		return this.playerPoints;
	}
	
	public String getName() {
		return this.playerName;
	}
	
	
}
