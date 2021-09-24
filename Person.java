import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(101);
        p1.setName("Ram");
        Person p2 = new Person();
        p2.setId(100);
        p2.setName("Shyam");
        Person p3 = new Person();
        p3.setId(103);
        p3.setName("Ashish");
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        System.out.println("Initially : ");
        for (Person person : personList){
            System.out.println(person.getId()+" : "+person.getName());
        }
        System.out.println("Sort by ID");
        Collections.sort(personList, new SortById());
        for (Person person : personList){
            System.out.println(person.getId()+" : "+person.getName());
        }
        System.out.println("Sort By Name");
        Collections.sort(personList, new SortByName());
        for (Person person : personList) {
            System.out.println(person.getId()+":"+person.getName());
        }
    }
}
class SortById implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        int person_id1=o1.getId();
        int person_id2=o2.getId();
        if(person_id1 > person_id2){
            return 1;
        }
        else if(person_id1 < person_id2){
            return -1;
        }
        else return 0;
    }
}
class SortByName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}