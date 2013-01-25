import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class StMap extends HashMap<Integer , List <Student>> {
	
	
	
class StudentComparator implements Comparator<Student> 
{  
	    public int compare(Student s1, Student s2) {
	        return (int)(s1.medie - s2.medie);
	    }	
}	
public void addStudent(Student x)
{ int m= Math.round(x.medie);
   List<Student> lista =super.get(m);
   if (lista==null) lista = new LinkedList<Student>();
    super.put(m, lista);
   
	
}

public static void main(String[] args){
Map<Integer,Student> students = new StMap<Integer,Student>();	
Collections.sort(Stmap, new StudentComparator);	
}

}
