package list;
//these changes are related to prosit List number 9
import java.util.Comparator;

public class ComparatorParDepartement implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getDepartement().compareTo(o2.getDepartement());
    }
}
