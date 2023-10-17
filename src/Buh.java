
    public class Buh extends Human
    {
        private int year; // опыт работы лет
        private int salary; //зп

        public int getYear() {
            return year;
        }
        public int getSalary() {
            return salary;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        public Buh(String lastName, String firstName, int age, int year, int salary) {
            super(lastName, firstName, age);
            setYear(year);
            setSalary(salary);

        }
        public Buh(String lastName, String firstName, int age) {
            super(lastName, firstName, age);
        }
        @Override
        public String toString() {
            return super.toString() + " " + year + " " + salary;
        }
    }

