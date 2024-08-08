public class TestUser {

        String firstName;
        String lastName;

        public TestUser(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

    public static void main(String[] args) {
        TestUser u1 = new TestUser("Ashna","Arora");
        System.out.println(u1.firstName + " " + u1.lastName);
    }
}
