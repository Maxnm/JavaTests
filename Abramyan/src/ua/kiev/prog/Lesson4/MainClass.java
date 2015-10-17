package ua.kiev.prog.Lesson4;

/**
 * Написать класс телофон, расширить до класса смарт-фон. Телефонов - куча, но все объеденены в сеть.
 * Телефон должен уметь звонить с телефона на телефон. (У каждого есть свойство - номер).
 * Если звонит на другой телефон в сети, то вызываемый абонент должен принять звонок ("Дзынь").
 * Если нету - то вывести сообщение "Немогу позвонить"
 */
public class MainClass {
    public static void main(String[] args) {
        Ball ball = new Ball (2.3, "White");
        Boots boots = new Boots(42, "G&C", "brown");
        Salami salami = new Salami(12.3, 0.3, "Saltavsky MK");

        Dog dog = new Dog("Barky", 3, "Black");

        dog.Bite(ball);
        dog.Bite(boots);
        dog.Bite(salami);
        dog.Bite(dog);
    }
}
