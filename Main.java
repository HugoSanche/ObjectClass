public class Main extends  Object{
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //todas las clases provienen de la clase objet

        Student arely=new Student("Arely", 15);
        System.out.println(arely);

        PrimarySchoolStudent parent=new PrimarySchoolStudent("Arely",15, "Hugo");
        System.out.println(parent);
    }

}
