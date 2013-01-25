import java.lang.Object;
import java.util.Hashtable;
public class Student {

String nume;
float medie;

public void Student()
{
	this.nume=null;
	this.medie=0;
	
}


public void Student(String x, float y)
{
	this.nume=x;
	this.medie=y;
}

public String toString() {
    return "[" + nume + ", " + medie + "]";
}

public int ashCode()

{
	return nume.hashCode();
}

public int compareTo(Object x)
{
	if (this.medie>(Student)x.medie) return 1;
	else if (this.medie< (Student)x.medie) return -1;
	return 0;
}
}