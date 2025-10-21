package ch.samt.sportournament;

import java.util.*;

public class TournamnetManager {
    private Set<Team> teams = new HashSet<>();

    public boolean addTeam(Team t) {
        System.out.println("Team "+ t.getName()+" aggiunto al torneo di "+t.getSport());
        return teams.add(t);

    }

    public boolean updateScore(String name, Integer delta) {
        for (Team t : teams) {
            if (t.getName().equals(name)) {
                t.addScore(delta);
                return true;
            }
        }
        return false;
    }
    public void printTeamsSortedByNatural(){
        List<Team> listOfTeams = new ArrayList<>(teams);
        Collections.sort(listOfTeams);
        for( Team t : listOfTeams){
            System.out.printf(t.toString());
        }
    }
    public void printTeamsSortedBySchool(){
        List<Team> listOfTeams = new ArrayList<>(teams);
        Collections.sort(listOfTeams, new SchoolComparator());
        for( Team t : listOfTeams){
            System.out.printf(t.toString());
        }
    }
    public void printTeamsSortedBySport(){
        List<Team> listOfTeams = new ArrayList<>(teams);
        Collections.sort(listOfTeams, new SportComparator());
        for( Team t : listOfTeams){
            System.out.printf(t.toString());
        }
    }
    public void printScores(){
        for(Team t : teams){
            System.out.printf("%s: %d\n", t.getName(), t.getPunteggioTot());
        }
    }
}
