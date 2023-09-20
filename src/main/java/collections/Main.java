package collections;

public class Main {
    public static void main(String[] args) {
        MyLinkedListCollection<String> myList = new MyLinkedListCollection<>();

        myList.add("Yura");
        myList.add("Oleh");
        myList.add("Yura");
        myList.add("Max");
        myList.add("Yura");
        myList.add("Max");

        System.out.println("Count of duplicates in collection: " + myList.getCountOfDuplicate());

        System.out.println(myList);
    }
}

