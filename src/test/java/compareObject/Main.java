package compareObject;


import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        UserData user1 = new UserData("Yura", 1234);
        UserData user2 = new UserData("Yura", 1234);

        boolean hashCodeEqual = user1.hashCode() == user2.hashCode();
        System.out.println("User equal by hashCode: " + hashCodeEqual);
        System.out.println("User equal by equal: " + user1.equals(user2));

        int compareName = UserData.usernameComparator.compare(user1, user2);
        System.out.println("Compare by name: " + compareName);

        System.out.print("Assert: ");
        Assert.assertEquals(user1, user2, "User no equals: ");

    }
}
