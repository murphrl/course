package ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * a players holds a List of Players and Managers.
 * @author Karan Tongay (karantongay@uvic.ca)
 * @author Andreas Koenzen 
 *
 */
public class Team implements Comparable<Team> {

	private List<Player> players = new ArrayList<Player>();
	private Player player;
	private String teamName;
	private int teamSize;
	private int points;
	private int compare;
	private int home;
	private int away;
	
	
	@Override
	public int compareTo(Team o) {
		home = getPoints();
		away = o.getPoints();
		if (home > away) {
			return home;
		} else if (home < away) {
			return away;
		} else {
			return 0;
		}
	}
	
	public Team(String name) {
		teamName = name;
	}

	public int getSize() {
		return this.teamSize;
	}
	
	public int getPoints() {
		return this.points;
	}
		
	public List<Player> sort(List<Player> players) {
		//compare player points and teamName
		//organize points, then number of players, 
		//then alphabetical
		Player.sort(players);
		return List<Player> player;
	}
		
	public void addPlayer(Player player) {
		this.players.add(player);
		this.teamSize += 1;
	}
	
	public void removePlayer(Player player) {
		this.players.remove(player);
		this.teamSize += 1;
	}
	

	
	
}
