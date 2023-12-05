public class Main {
    public static void main(String[] args) {


        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", "Пуффендуй", 30, 5,
                        40, 15, 23),
                new Hufflepuff("Седрик Диггори", "Пуффендуй", 37, 68,
                        24, 56, 32),
                new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 47, 12,
                        58, 64, 52)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", "Когтевран", 45, 20,
                        38, 56, 77, 23),
                new Ravenclaw("Падма Патил", "Когтевран", 15, 49,
                        28, 21, 59, 24),
                new Ravenclaw("Маркус Белби", "Когтевран", 57, 5,
                        62, 37, 15, 33)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", "Слизерин", 15, 15,
                        66, 59, 44, 35, 80),
                new Slytherin("Грэхэм Монтегю", "Слизерин", 30, 10,
                        26, 54, 64, 21, 40),
                new Slytherin("Грегори Гойл", "Слизерин", 26, 28,
                        27, 36, 12, 19, 30)
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "Грифиндор", 90, 50,
                        80, 100, 100),
                new Gryffindor("Гермиона Грейнджер", "Грифиндор", 90, 80,
                        80, 100, 100),
                new Gryffindor("Рон Уизли", "Грифиндор", 10, 10,
                        100, 100, 100)
        };


        System.out.println("=========================");
        PrintServise.printHufflepuff(hufflepuffs[0]);
        PrintServise.printRavenclaw(ravenclaws[0]);
        PrintServise.printSlytherin(slytherins[0]);
        PrintServise.printGryffindor(gryffindors[0]);
        System.out.println("=========================");
        Hufflepuff.equalseStudentFaculty(hufflepuffs[0], hufflepuffs[1]);
        System.out.println("=========================");
        Ravenclaw.equalseStudentFaculty(ravenclaws[0], ravenclaws[1]);
        System.out.println("=========================");
        Slytherin.equalseStudentFaculty(slytherins[0], slytherins[1]);
        System.out.println("=========================");
        Gryffindor.equalseStudentFaculty(gryffindors[0], gryffindors[1]);
        System.out.println("=========================");
        Hogwarts.equalseStudent((Hogwarts) gryffindors[0], (Hogwarts) slytherins[0]);

    }
}