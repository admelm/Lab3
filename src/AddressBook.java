public class AddressBook {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        AddressBook.add(buddy);
        AddressBook.remove(buddy);

        System.out.println("Address Book");
    }
}
