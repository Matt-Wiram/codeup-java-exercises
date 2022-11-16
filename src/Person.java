public class Person {

        private String name;
        private int age;

        public Person() {

        }
        public Person(String name) {
            this.name = name;

        }
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
//TODO: return the person's name
            return name;

        }

        public void setName(String name){
//TODO: change the name field to the passed value
            this.name = name;
        }
        public void sayHello(){
//TODO: print a message to the console using the person's name
            System.out.println("Hello " + getName());
        }



    public static void main(String[] args) {
        Person character = new Person();
        System.out.print(character.getName() + " ");
        System.out.print(character.getAge() + "\n");
        character.sayHello();


        Person person = new Person("Matt", 31);
        person.setAge(34);
        person.setName("John");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.sayHello();
    }
}
