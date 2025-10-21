package ch.samt.sportournament;

import java.util.Objects;

public class Team implements Comparable<Team> {

    private String name;
    private String scuola;
    private String sport;
    private int PunteggioTot;

    public Team(String name, String scuola, String sport, int PunteggioTot) {
        this.name = name;
        this.scuola = scuola;
        this.sport = sport;
        this.PunteggioTot = PunteggioTot;
    }

    public String getName() { return name; }
    public String getScuola() { return scuola; }
    public String getSport() { return sport; }
    public int getPunteggioTot() { return PunteggioTot; }
    public void addScore(int delta) {
        this.PunteggioTot += delta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(scuola, team.scuola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scuola);
    }

    @Override
    public String toString() {
        return "Team: " + name + " - School: " + scuola + " - Sport: " + sport + " - Total Score: " + PunteggioTot+"\n";
    }

    @Override
    public int compareTo(Team o) {
        int scoreComparison = Integer.compare(o.PunteggioTot, this.PunteggioTot);
        if (scoreComparison != 0) {
            return scoreComparison;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}