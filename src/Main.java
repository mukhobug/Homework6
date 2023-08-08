public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n Первое задание:");
        System.out.printf("ФИО сотрудника — %s", task1());
        System.out.println("\n\n\n Второе задание:");
        task2();
        System.out.println("\n\n\n Третье задание:");
        task3();
        System.out.println("\n\n\n Четвёртое задание:");
//        task4();
        System.out.println("\n\n\n Пятое задание:");
        task5();
        System.out.println("\n\n\n Шестое задание:");
        task6();
//        System.out.println("\n\n\n Седьмое задание:");
//        task7();
//        System.out.println("\n\n\n Восьмое задание:");
//        task8();
    }

    public static String task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        return fullName;
    }

    public static void task2() {
        String fullNameUp = task1().toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", fullNameUp);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameFormat = fullName.replace('ё', 'е');
        System.out.printf("Данные ФИО сотрудника — %s", fullNameFormat);
    }

    public static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        String lastName = fullName.substring(0, fullName.indexOf(' '));
        System.out.printf("Имя сотрудника — %s\nФамилия сотрудника — %s\nОтчество сотрудника — %s", firstName, lastName, middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] arr = fullName.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
            }
        }
        arr[0] = Character.toUpperCase(arr[0]);
        System.out.printf("Верное написание Ф.И.О. сотрудника с заглавных букв — %s", String.valueOf(arr));
    }

    //    public static void task7() {
//        String one = "135";
//        String two = "246";
//        char[] arr1 = one.toCharArray();
//        char[] arr2 = two.toCharArray();
//        int length=arr1.length+arr2.length;
//        for (int i = 0; i < length; i++) {
//
//        }
//        StringBuilder sb = new StringBuilder(one);
//
//        System.out.printf("\n%s", String.valueOf(sb));
//    }
//
//    public static void task8() {
//
//    }
}
