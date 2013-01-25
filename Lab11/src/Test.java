
import java.util.*;

public class Test {

        public static void main(String[] args) {
                
                List<Employee> employees = new LinkedList<Employee>();
                
                Boss becali;
                Boss c = new Boss("Gigi",1000);
                c.CEO = new Boss("Giovani",10000);
                c.CEO.bonus = 13;
                c.CEO.salary = 10000;
                c.arb.add(new Employee("Steve", 100));
                c.arb.add(new Employee("Donald", 200));
                c.arb.add(new Employee("Vladimir", 300));
                employees.add(c);
                employees.add(new Employee("Alex", 50));
                employees.add(new Boss("Mircea", 3000));
                Visitor v = new RevenueVisitor();
					
				
                
               
                int nr=0;
                float p=0;
                
                for (Employee e : employees)
                	
                        if(e instanceof Boss){
                        	nr++;
                        	p+= ((Boss) e).getpr();
                	         ((Boss)e).accept(v);
                        }
                        else e.accept(v);

              System.out.println( "Procent mediu= "+p/nr); 
        }
        
}