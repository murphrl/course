package ca.uvic.seng330.assn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class League implements Iterable<Team> {

	private List<Team> teams = new ArrayList<Team>();
	private Team team;
	private int size;
	private String leagueName;
	
	
	@Override
	public Iterator<Team> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public League(String name) {
		leagueName = name;
	}
	
	public void addTeam(Team team) {
		this.teams.add(team);
		this.size = this.size+1;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public List<Team> sort() {
		//not sure
	}
	
}
