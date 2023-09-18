package collections;

public class Main {
    public static void main(String[] args) {
        MyLinkedListCollection<String> myList = new MyLinkedListCollection<>();

        myList.add("Yura");
        myList.add("Oleh");
        myList.add("Yura");
        myList.add("Max");
        myList.add("Yura");

        int yuraCount = myList.getCountOfElement("Yura");

        System.out.println("Count of Yura: " + yuraCount);
        System.out.println("Count of Oleh: " + myList.getCountOfElement("Oleh"));
        System.out.println("Count of Max: " + myList.getCountOfElement("Max"));

        System.out.println(myList);
    }
}

