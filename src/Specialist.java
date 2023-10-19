
    public class Specialist extends Graduate {
    private  int grade;

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public Specialist(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance,
                          String subject, int grade) {

            super(lastName, firstName, age, speciality, group, rating, attendance, subject);
            this.grade = grade;
            System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
        }
        public Specialist (Graduate graduate, int grade){
            super(graduate);
            this.grade = grade;
            System.out.println("SpConstructor" + Integer.toHexString(hashCode()));

        }
        public Specialist (Specialist other){
            super (other);
            this.grade = other.grade;
            System.out.println("SpCopyConstructor");
        }
        public String toString (){
            return super.toString() + " grade: " + grade;
        }

        //
//        private String diplom; // тема диплома
//        private int diplomValue; //оценка диплома
//
//        public String getDiplom() {
//            return diplom;
//        }
//        public int getDiplomValue() {
//            return diplomValue;
//        }
//        public void setDiplom(String diplom) {
//            this.diplom = diplom;
//        }
//
//        public void setDiplomValue(int ddiplomValue) {
//            this.diplomValue = diplomValue;
//        }
//
//
//        public Specialist
//                (
//                        String lastName, String firstName, int age,
//                        String speciality, String group, double rating, double attendance,
//                        String diplom, int diplomValue
//                )
//        {
//            super(lastName, firstName, age, speciality, group, rating, attendance);
//            setDiplom(diplom);
//            setDiplomValue(diplomValue);
//
//        }
//        public String toString()
//        {
//            return super.toString() + " " + diplom + " " + diplomValue;
//        }

    }

