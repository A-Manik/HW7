import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanCook = false;
        System.out.println("ВВедите кол-во Жабьих глаз: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Введитк кол-во Слёзы вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Введие кол-во Кости ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во Пельмени: ");
        dumplingsCount = new Scanner(System.in).nextInt();
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить элексир зоркости");
            isCanCook = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить элексир стойкости");

        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 2 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить элексир скрытности");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 10 && dumplingsCount >= 4 && toadEyesCount >= 3 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить запретный элексир");
            isCanCook = true;
        }
        if (!isCanCook) {
            System.out.println("Вы не можете приготовить ни один элексир");
        }
    }
}




        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда



