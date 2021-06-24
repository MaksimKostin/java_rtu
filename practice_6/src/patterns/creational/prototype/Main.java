package patterns.creational.prototype;

/**
 * 1.Можно использовать законмментированный код если хотим
 * использовать свой интерфейс OurOwnCloneable (через class ProjectFactory)
 * 2. Нужно в class Project добавить реализацию нашего интерфейса
 */


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Project ourCompany = new Project(12, "Maybach", "Good one");
        Project clonedCompany = (Project) ourCompany.clone();

        System.out.println(ourCompany);
        System.out.println("=================");
        System.out.println(clonedCompany);

    }
}
