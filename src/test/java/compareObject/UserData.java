package compareObject;

import java.util.Comparator;
import java.util.Objects;

class UserData {
    private String name;
    private int phoneNumber;

    public UserData(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Comparator<UserData> usernameComparator = (u1, u2) -> u1.getName().compareTo(u2.getName());


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return phoneNumber == userData.phoneNumber && Objects.equals(name, userData.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


    public static class Adress {
        String city;
        String street;
        String house;


        public Adress(String city, String street, String house) {
            this.city = city;
            this.street = street;
            this.house = house;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", house='" + house + '\'' +
                    '}';
        }
    }
}
