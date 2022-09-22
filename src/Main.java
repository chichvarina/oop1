public class Main {
    public static void main(String[] args) {
        //Задания 1, 2
        int currentYear = 2022;
        Human maxim = new Human("Максим","Минск", currentYear - 35,"бренд-менеджера");
        Human ana = new Human("Анна","Москва", currentYear - 29,"методиста образовательных программ");
        Human katy = new Human("Катя","Калининград", currentYear - 28,"продакт-менеджера");
        Human artem = new Human("Артем","Москва", currentYear - 27,"директора по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(ana);
        System.out.println(katy);
        System.out.println(artem);

    }
}

