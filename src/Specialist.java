
    public class Specialist extends Student {

        private String diplom; // тема диплома
        private int diplomValue; //оценка диплома

        public String getDiplom() {
            return diplom;
        }
        public int getDiplomValue() {
            return diplomValue;
        }
        public void setDiplom(String diplom) {
            this.diplom = diplom;
        }

        public void setDiplomValue(int ddiplomValue) {
            this.diplomValue = diplomValue;
        }


        public Specialist
                (
                        String lastName, String firstName, int age,
                        String speciality, String group, double rating, double attendance,
                        String diplom, int diplomValue
                )
        {
            super(lastName, firstName, age, speciality, group, rating, attendance);
            setDiplom(diplom);
            setDiplomValue(diplomValue);

        }
        public String toString()
        {
            return super.toString() + " " + diplom + " " + diplomValue;
        }

    }

