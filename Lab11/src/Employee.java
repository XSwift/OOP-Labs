class Employee implements Visitable {
        
        String  name;
        float   salary;
        
        public Employee(String name, float salary) {
                this.name       = name;
                this.salary     = salary;
        }

        public String getName() {
                return name;
        }

        public float getSalary() {
                return salary;
        }
        public float getTotalRevenue() {
            return salary;
    }
        public void accept(Visitor v) {
            v.visit(this);          
    }
}
