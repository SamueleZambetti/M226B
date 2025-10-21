package ch.samt.sportournament;
public class Main {
    public static void main(String[] args) {
        TournamnetManager manager = new TournamnetManager();
        Team team1 = new Team("Falcons", "High School A", "Soccer", 10);
        Team team2 = new Team("Tigers", "High School B", "Basketball", 15);
        Team team3 = new Team("Eagles", "High School C", "Volleyball", 12);

        manager.addTeam(team1);
        manager.addTeam(team2);
        manager.addTeam(team3);

        manager.updateScore("Falcons", 6);
        manager.updateScore("Eagles", 1);

        System.out.println("Teams sorted by natural order:");
        manager.printTeamsSortedByNatural();
        System.out.println(" ");
        System.out.println("Teams sorted by school:");
        manager.printTeamsSortedBySchool();
        System.out.println(" ");
        System.out.println("Teams sorted by sport:");
        manager.printTeamsSortedBySport();
        System.out.println(" ");
        System.out.println("Current scores:");
        manager.printScores();
    }
}