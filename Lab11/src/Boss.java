import java.util.*;

class Boss extends Employee {
        
        float bonus;

        Boss CEO;
        ArrayList<Employee> arb = new ArrayList<Employee>();
        
        public Boss(String name, float salary) {
                super(name, salary);
                bonus = 13;
        }
        
        public float getBonus() {
                return bonus;
        }

        public void setBonus(float bonus) {
                this.bonus = bonus;
        }
        public float getTotalRevenue() {
            return salary + bonus;
        }
        public void accept(Visitor v) {
           v.visit(this);
           for (Employee r : arb)
        	   r.accept(v);
           }
        public float getpr(){
        	return (bonus * 100)/ (salary + bonus);
        }
        
        
        	          
    }
        
