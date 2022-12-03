package chapters.chapter_13.checkpoints;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class CheckPoint_20_21 {
    /*20
     Yes we can implement toCompare method without implementing Comprable interface but using comprable interface reduces the mistakes
     *21
     there is no compareTo method
     */
    public static void main(String[] args) {
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
class Person implements Comparable<Person>{
    private int id;
    Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "ID: " + this.id;
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.id < o.id ){
            return -1;
        }else if (this.id > o.id){
            return 1;
        }else {
            return 0;
        }
    }
}
