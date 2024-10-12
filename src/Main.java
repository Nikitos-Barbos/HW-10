public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println("Задание 2");
        System.out.println();

        //String fullName2 = fullName;
        System.out.println(fullName.toUpperCase());


        System.out.println("Задание 3");
        System.out.println();

        String fullName2 = "Иванов Семён Семёнович";
        System.out.println(fullName2.replace("ё", "е"));


    }
}