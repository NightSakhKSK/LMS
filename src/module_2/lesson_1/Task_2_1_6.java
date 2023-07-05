package module_2.lesson_1;

public class Task_2_1_6 {
}

class Solution_2_1_6 {
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }

        public void sayHello() {
            System.out.println("Гав!");
        }
    }
}
