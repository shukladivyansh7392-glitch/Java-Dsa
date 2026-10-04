package OOPS4;

public class LearnInterface {

    static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();

    }

    interface Human{
        void walk();
    }
    interface Animal {
        int LEGS = 4;

        void eats();
        void drinks();

        default void walks(){
            System.out.println("Animal is Walking");
        }
    }

    static class Monkey implements Animal, Human {

        @Override
        public void eats() {
            System.out.println("Monkey is Eating:");
        }

        @Override
        public void walk() {
        }
        public void drinks(){
            System.out.println("Animal is drinking");
        }
    }
}
