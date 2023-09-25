import java.util.ArrayList;
//hi from website
public class AddressBook {

    ArrayList<BuddyInfo> Buddy = new ArrayList<BuddyInfo>();
    public AddressBook(){
        Buddy =new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddy) {
        if(buddy !=null)
            Buddy.add(buddy);
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < Buddy.size()) {
            return Buddy.remove(index);
        }
        return null;


    }




    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("tom", "carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }



}
