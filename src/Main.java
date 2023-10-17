public class Main {
    public static void main(String[] args) {
        Human human = new Human( //человек
                "Montana", "Antonio", 30);
        System.out.println(human);

        Student student = new Student( //студент
                "Pinlman", "Jessie", 25,
                "Chemistry", "WW_22",
                90, 95); //Объект класса Student
        System.out.println(student);

        Teacher teacher = new Teacher( // учитель
                "Pinl", "Jes", 25,
                "Chemistry", 50);
        System.out.println(teacher);

        Graduate graduate = new Graduate( //Выпускник
                "Chris", "Jes", 40,
                "Chemistry", "OBN", 70, 50,
                "HoW");
        System.out.println(graduate);

        Specialist specialist = new Specialist("Klochko", "Sergei", 39,
                "Юрист", "Ю08-", 100500, 10,
                "Арбитражный процесс", 5);
        System.out.println(specialist);
    }
}