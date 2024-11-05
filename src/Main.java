import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эсуптоо учун фигураны киргизиниз: " + " 1- Параллелепипед,2-Цилиндр");
        int san = scanner.nextInt();
        try {
            if (san == 1) {
                System.out.println("Бийиктигин  киргизиниз: ");
                double height = scanner.nextDouble();
                System.out.println("Узундугун киргизиниз");
                double length = scanner.nextDouble();
                System.out.println("Туурасы кмргизиниз");
                double width = scanner.nextDouble();
                Parallelepiped parallelepiped = new Parallelepiped(height, length, width);
                System.out.println("площадь: " + parallelepiped.areaParallelepiped());
                System.out.println("объёмун: " + parallelepiped.colomParallelepiped());
                
            } else if (san == 2) {
                System.out.println("Бийиктигин  киргизиниз: ");
                double height = scanner.nextDouble();
                System.out.println("Радиусун киргизиниз: ");
                double radius = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(height, radius);
                System.out.println("площадь: " + cylinder.areaCylinder());
                System.out.println("объёмун: " + cylinder.colomCylinder());
            } else {
                System.out.println("Туура эмес фигураны киргиздиниз");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    private static double getPositiveDouble(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    throw new IllegalArgumentException("Значение не может быть отрицательным.");
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите число.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
            System.out.print("Попробуйте снова: ");

//        Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз
//        Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
//        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//                Мумкун болгон каталар:
//        1) берилген маалымат терс сан болсо
//        2) берилген маалымат сан эмес тамга болсо
//        3) жана озунуздор берген кошумча каталар болсо да болот

//        Параллелепипед:
//        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//        -Формулалар Parallelepiped классында жазылуусу керек

//        Цилиндр:
//        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//        -Формулалар Cylinder классында жазылуусу керек

//        Бардык Exception дор логикасы main класста жазылcын
//        Бардык маалмыттар консоль аркылуу берилсин
//        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.

    }
}}