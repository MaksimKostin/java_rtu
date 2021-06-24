package patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Max Kostin", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");
        while(iterator.hasNext()){
            System.out.print(iterator.getNext() + " ");
        }
    }

}
