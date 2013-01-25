import java.util.Collection;
import java.util.ArrayList;

public class Colectie1 {
	
Collection <Student> name = new ArrayList<Student>();	


public void AddElem(Student x)
{
	if (name.contains(x.nume)) System.out.println("Element deja in colectie");
	else name.add(x);
	
}
}
