package ch.samt.sportournament;
import java.util.Comparator;
public class SchoolComparator implements Comparator<Team>{
    @Override
    public int compare(Team t1, Team t2) {
        return t1.getScuola().compareTo(t2.getScuola());
    }
}
