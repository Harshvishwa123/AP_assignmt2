import java.util.Scanner;
import java.util.ArrayList;

class zoo{
    public void AdminMenu(){
        System.out.println("\nAdmin Menu:");
        System.out.println("1. Manage Attractions");
        System.out.println("2. Manage Animals");
        System.out.println("3. Schedule Events");
        System.out.println("4. Set Discounts");
        System.out.println("5. Set Special Deal");
        System.out.println("6. View Visitor Stats");
        System.out.println("7. View Feedback");
        System.out.println("8. Exit");
    }
    public void AttractionMenu(){
        System.out.println("\nManage Attractions:");
        System.out.println("1. Add Attraction");
        System.out.println("2. View Attractions");
        System.out.println("3. Modify Attraction");
        System.out.println("4. Remove Attraction");
        System.out.println("5. Exit");
    }
    public void AnimalMenu(){
        System.out.println("\nManage Animals:");
        System.out.println("1. Add Animal");
        System.out.println("2. Update Animal Details");
        System.out.println("3. Remove Animal");
        System.out.println("4. Exit");
    }
    public void DiscountMenu(){
        System.out.println("\nSet Discounts:");
        System.out.println("1. Add Discount");
        System.out.println("2. Modify Discount");
        System.out.println("3. Remove Discount");
        System.out.println("4. Exit");
    }
    public void VisitorMenu(){
        System.out.println("\nVisitor Menu:");
        System.out.println("1. Explore the Zoo");
        System.out.println("2. Buy Membership");
        System.out.println("3. Buy Tickets");
        System.out.println("4. View Discounts");
        System.out.println("5. View Special Deals");
        System.out.println("6. Visit Animals");
        System.out.println("7. Visit Attractions");
        System.out.println("8. Leave Feedback");
        System.out.println("9. Log Out");
    }
    public void ZooMenu(){
        System.out.println("\nExplore the Zoo:");
        System.out.println("1. View Attractions");
        System.out.println("2. View Animals");
        System.out.println("3. Exit");
    }
}
class admin{
    private ArrayList<String> Usernames = new ArrayList<>();
    private ArrayList<String> password = new ArrayList<>();

    zoo zooObj = new zoo();
    public void EnterAdmin(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Admin Username: ");
        String Username = scan.nextLine();
        System.out.print("Enter Admin Password: ");
        String Password = scan.nextLine();
        Usernames.add(Username);
        password.add(Password);
        System.out.println();
        System.out.println("Logged in as Admin.");
        System.out.println();
    }

    public ArrayList<String> AttractionNames = new ArrayList<>();
    public ArrayList<String> AttractionDescriptions = new ArrayList<>();
    public void ManageAttractions(){
        do{
            zooObj.AttractionMenu();
            Scanner obj = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            int AttractionChoice= obj.nextInt();
            System.out.println();
            if(AttractionChoice==1){
                Scanner scan =new Scanner(System.in);
                System.out.print("Enter Attraction Name: ");
                String AName = scan.nextLine();
                System.out.print("Enter Attraction Description: ");
                String ADescription = scan.nextLine();
                AttractionNames.add(AName);
                AttractionDescriptions.add(ADescription);
                System.out.println("Attraction added successfully.");

            }
            if(AttractionChoice==2){
                System.out.println("\nAttraction in the Zoo:");
                for (int i = 0; i < AttractionNames.size(); i++) {
                    System.out.println((i+1)+". Attraction Name: " + AttractionNames.get(i));
                    System.out.println((i+1)+". Attraction Description: " + AttractionDescriptions.get(i));
                }

            }
            if(AttractionChoice==3){
                Scanner scan =new Scanner(System.in);
                System.out.print("Enter Previous Attraction Name to modify: ");
                String AName = scan.nextLine();
                System.out.print("Enter the number to modify\n1.Attraction Name\n2.Attraction Description\n3.Both\n");
                System.out.println("Enter your choice: ");
                int UserAnswer = scan.nextInt();
                int index = AttractionNames.indexOf(AName);
                scan.nextLine();
                if(UserAnswer==1){
                    System.out.print("Enter New Attraction Name to modify: ");
                    String NewAName = scan.nextLine();
                    AttractionNames.set(index,NewAName);
                }
                if (UserAnswer==2){
                    System.out.print("Enter New Attraction Description to modify: ");
                    String NewADes = scan.nextLine();
                    AttractionDescriptions.set(index,NewADes);
                }
                if (UserAnswer==3){
                    System.out.print("Enter New Attraction Name to modify: ");
                    String NewAName = scan.nextLine();
                    AttractionNames.set(index,NewAName);
                    System.out.print("Enter New Attraction Description to modify: ");
                    String NewADes = scan.nextLine();
                    AttractionDescriptions.set(index,NewADes);
                }
            }
            if(AttractionChoice==4){
                Scanner scan =new Scanner(System.in);
                System.out.print("Enter Attraction Name to remove: ");
                String AName = scan.nextLine();
                for(int i = 0; i < AttractionNames.size(); i++) {
                    if(AName.equals(AttractionNames.get(i))){
                        AttractionNames.remove(i);
                        AttractionDescriptions.remove(i);
                    }
                }

            }
            if(AttractionChoice==5){
                break;
            }
        }while(true);
    }

    public ArrayList<String> AnimalNames = new ArrayList<>();
    public ArrayList<String> AnimalType = new ArrayList<>();

    public void ManageAnimals(){
        do{
            zooObj.AnimalMenu();
            Scanner obj = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            int AnimalChoice= obj.nextInt();
            System.out.println();
            if(AnimalChoice==1){
                System.out.println("ALL the possible animals are listed below, ADD on the basis of the list.");
                System.out.println("Mammals-> lion, giraffe, monkey ; Amphibians-> frogs, salamanders, newts ; Reptiles-> crocodiles, chameleons, lizards ");
                Scanner scan =new Scanner(System.in);
                System.out.println("Enter Animal Name: ");
                String AName = scan.nextLine();
                System.out.println("Enter Animal Type: ");
                String AType = scan.nextLine();
                AnimalNames.add(AName);
                AnimalType.add(AType);
                System.out.println("Animal added to Zoo.\n");

            }
            if(AnimalChoice==2){
                Scanner scan =new Scanner(System.in);
                System.out.print("Enter Animal Name to Update: ");
                String AName = scan.nextLine();
                int index = AnimalNames.indexOf(AName);
                System.out.print("Enter New Animal Type to modify: ");
                String NewAType = scan.nextLine();
                AnimalType.set(index,NewAType);

            }
            if(AnimalChoice==3){
                Scanner scan =new Scanner(System.in);
                System.out.print("Enter Animal Name to remove: ");
                String AName = scan.nextLine();
                for(int i = 0; i < AnimalNames.size(); i++) {
                    if(AName.equals(AnimalNames.get(i))){
                        AnimalNames.remove(i);
                        AnimalType.remove(i);
                    }
                }

            }
            if(AnimalChoice==4){
                break;
            }
        }while(true);

    }

    private ArrayList<String> AttractionStatus = new ArrayList<>();
    public ArrayList<Float> AttractionEPrice = new ArrayList<>();
    public ArrayList<String> AttractionOpen = new ArrayList<>();
    public void ScheduleEvents(){
        Scanner scan =new Scanner(System.in);
        ArrayList<String> Attractions= AttractionNames;
        System.out.println("Enter Open/Closed Status of the Attractions");
        for (int i = 0; i < Attractions.size(); i++) {
            System.out.println("#"+(i+1)+" Attraction Name: " + Attractions.get(i)+ " Enter Status: ");
            String Status = scan.nextLine();
            AttractionStatus.add(Status);
        }
        System.out.println("Enter entry price of the Attractions");
        for (int i = 0; i < AttractionStatus.size(); i++) {
            if(AttractionStatus.get(i).equalsIgnoreCase("open")){
                System.out.println("#"+(i+1)+" Attraction Name: " + Attractions.get(i)+ " Enter Entry Price: ");
                Float Price = scan.nextFloat();
                AttractionEPrice.add(Price);
                AttractionOpen.add(Attractions.get(i));
            }
        }
    }

    public ArrayList<String> DiscountCategory = new ArrayList<>();
    private ArrayList<Double> DiscountPercentage = new ArrayList<>();
    private ArrayList<String> DiscountCodes = new ArrayList<>();
    public void SetDiscounts(){
        do{
            zooObj.DiscountMenu();
            Scanner obj = new Scanner(System.in);
            System.out.println("\nEnter your choice: ");
            int DiscountChoice= obj.nextInt();
            System.out.println();
            if(DiscountChoice==1){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Discount Category: ");
                String DName = scan.next();
                System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                double DPercentage = scan.nextFloat();
                System.out.println("Enter Discount Code: ");
                String DCode = scan.next();

                DiscountCategory.add(DName);
                DiscountPercentage.add(DPercentage);
                DiscountCodes.add(DCode);
                System.out.println("Discount added successfully.");
            }
            if(DiscountChoice==2){
                Scanner scan =new Scanner(System.in);
                System.out.println("Enter Discount Category to Modify: ");
                String DName = scan.nextLine();
                int index = DiscountCategory.indexOf(DName);
                System.out.println("Enter New Discount Percentage: ");
                double NewAType = scan.nextFloat();
                DiscountPercentage.set(index,NewAType);

            }
            if(DiscountChoice==3){
                Scanner scan =new Scanner(System.in);
                System.out.println("Enter Discount Category to remove: ");
                String AName = scan.nextLine();
                for(int i = 0; i < DiscountCategory.size(); i++) {
                    if(AName.equals(DiscountCategory.get(i))){
                        DiscountCategory.remove(i);
                        DiscountPercentage.remove(i);
                        DiscountCodes.remove(i);
                    }
                }
            }
            if(DiscountChoice==4){
                break;
            }
        }while(true);
    }
    public void ViewDiscounts(){
        System.out.println("Discounts: ");
        for(int i = 0; i < DiscountCategory.size(); i++) {
            System.out.println("#"+(i+1)+" "+DiscountCategory.get(i)+" ("+DiscountPercentage.get(i)+"% discount)-"+DiscountCodes.get(i));
        }
    }

    private ArrayList<String> SpecialDeals = new ArrayList<>();
    public ArrayList<Integer> SpecialDealsTickets = new ArrayList<>();
    public ArrayList<Integer> SpecialDealsDiscount = new ArrayList<>();

    public void SetSpecialDeal(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of special deals you want to add: ");
        int SpecialDealsCount= obj.nextInt();
        for (int i = 0; i < SpecialDealsCount; i++) {
            System.out.println("Enter number of tickets: ");
            Integer Tickets = obj.nextInt();
            System.out.println("Enter discount percentage : ");
            Integer Discount = obj.nextInt();
            String A="Buy "+Tickets+" tickets and get "+Discount+"% off";
            SpecialDeals.add(A);
            SpecialDealsTickets.add(Tickets);
            SpecialDealsDiscount.add(Discount);
        }
    }
    private ArrayList<Double> revenue = new ArrayList<>();
    private ArrayList<Integer> VisitorCount = new ArrayList<>();

    public void ViewVisitorStats(){
        int VCount = 0;
        for (int number : VisitorCount) {
            VCount += number;
        }
        double Vrevenue = 0;
        for (double number : revenue) {
            Vrevenue += number;
        }
        System.out.println("Total tickets bought :"+VCount);
        System.out.println("Total revenue :" +Vrevenue);
        System.out.println("Total registrations: "+VisitorName.size());
    }
    public void ViewSpecialDealsForVisitor(){
        for(int i = 0; i < SpecialDeals.size(); i++) {
            System.out.println("#"+(i+1)+" "+SpecialDeals.get(i));
        }
    }

    private ArrayList<String> VisitorName = new ArrayList<>();
    private ArrayList<Integer> VisitorAge = new ArrayList<>();
    private ArrayList<String> VisitorPhoneNo = new ArrayList<>();
    private ArrayList<Double> VisitorBalance = new ArrayList<>();
    private ArrayList<String> VisitorEmail = new ArrayList<>();
    private ArrayList<String> VisitorPassword = new ArrayList<>();

    public void VisitorRegister() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Visitor Name: ");
        String VName = scan.nextLine();
        System.out.print("Enter Visitor Age: ");
        int VAge = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Visitor Phone Number: ");
        String VPhoneNo = scan.nextLine();
        System.out.print("Enter Visitor Balance: ");
        double VBalance = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter Visitor Email: ");
        String VEmail = scan.nextLine();
        System.out.print("Enter Visitor Password: ");
        String VPassword = scan.nextLine();

        VisitorName.add(VName);
        VisitorAge.add(VAge);
        VisitorPhoneNo.add(VPhoneNo);
        VisitorBalance.add(VBalance);
        VisitorEmail.add(VEmail);
        VisitorPassword.add(VPassword);
        System.out.println("\nRegistration is successful.");
    }


    public boolean CheckLogin() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Visitor Email: ");
        String VEmail = scan.nextLine();
        System.out.print("Enter Visitor Password: ");
        String VPassword = scan.nextLine();

        for (int i = 0; i < VisitorName.size(); i++) {
            if (VEmail.equalsIgnoreCase(VisitorEmail.get(i)) && VPassword.equalsIgnoreCase(VisitorPassword.get(i))) {
                return true;
            }
        }
        return false;
    }
    public void ExploreTheZoo(){
        do {
            zooObj.ZooMenu();
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int ZooChoice = obj.nextInt();
            if (ZooChoice == 1) {
                System.out.println("\nAttraction in the Zoo:");
                for (int i = 0; i < AttractionNames.size(); i++) {
                    System.out.println((i+1)+". Attraction Name: " + AttractionNames.get(i));
                    System.out.println((i+1)+". Attraction Description: " + AttractionDescriptions.get(i));
                }
            }
            if (ZooChoice == 2) {
                System.out.println("\nAnimals in the Zoo:");
                for (int i = 0; i < AnimalNames.size(); i++) {
                    System.out.println("#"+(i+1)+" Animal Name: " + AnimalNames.get(i));
                }
            }
            if (ZooChoice == 3) {
                break;
            }
        } while (true);
    }

    private ArrayList<String> Membership = new ArrayList<>();
    private ArrayList<Integer> TicketBought= new ArrayList<>();
    private ArrayList<String> AttractionToSee = new ArrayList<>();

    public void BuyTickets(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String VEmail = scan.nextLine();
        if (!VisitorEmail.contains(VEmail)) {
            System.out.println("Invalid email.");
            return;
        }

        System.out.println("Buy Tickets");
        System.out.println("Enter the number of tickets: ");
        int TicketNumber = scan.nextInt();
        TicketBought.add(TicketNumber);
        VisitorCount.add(TicketNumber);
        System.out.println("Make sure to use all your available tickets before logging out. It won't be available afterwards.");

        System.out.println("Buy Tickets");
        System.out.println("Select an Attraction to Buy a Ticket:");
        for(int i =0;i< AttractionOpen.size();i++){
            System.out.println("#"+(i+1)+"."+AttractionOpen.get(i)+" ($"+AttractionEPrice.get(i)+")");
        }

        System.out.println("\nEnter your choice");
        int TicketChoice = scan.nextInt();
        AttractionToSee.add(AttractionOpen.get(TicketChoice-1));
        int index = VisitorEmail.indexOf(VEmail);

        if(Membership.get(index).equals("Premium")){
            System.out.println("The ticket for "+AttractionOpen.get(TicketChoice-1) +" was purchased successfully. Your balance is now "+VisitorBalance.get(index));
        }else{
            System.out.println("Apply Discount Code (If not applicable, then enter 'None'): ");
            String DiscountCode = scan.next();
            ArrayList<String> DCategory = DiscountCategory;
            ArrayList<Double> DPercentage = DiscountPercentage;
            ArrayList<String> DCode = DiscountCodes;
            ArrayList<Integer> SDTickets = SpecialDealsTickets;
            ArrayList<Integer> SDDiscount = SpecialDealsDiscount;

            System.out.println("Apply Special Discount As Well? (Yes/No): ");
            String applyStatus = scan.next();

            double SpecialDiscountAvailable=0.0;
            if(applyStatus.equalsIgnoreCase("Yes")){
                for(int i=0;i< SDTickets.size();i++){
                    if(TicketNumber >= SDTickets.get(i)){
                        SpecialDiscountAvailable = SDDiscount.get(i);
                    }
                }
            }
            if (DiscountCode.equals("None")) {
                double currentBalance = VisitorBalance.get(index);
                float price =AttractionEPrice.get(TicketChoice-1);
                double FinalSUM=price * TicketNumber * (1 - (SpecialDiscountAvailable/ 100));
                VisitorBalance.set(index, currentBalance - FinalSUM);
                revenue.add(FinalSUM);
                System.out.println("The ticket for "+AttractionOpen.get(TicketChoice-1) +" was purchased successfully. Your balance is now "+(currentBalance - FinalSUM));
            } else {
                for (int i = 0; i < DCode.size(); i++) {
                    if (DiscountCode.equals(DCode.get(i))) {
                        double CBalance = VisitorBalance.get(index);
                        float price =AttractionEPrice.get(TicketChoice-1);
                        double DiscountOffering = DPercentage.get(i);
                        double amountToPay = price * TicketNumber * (1 - (DiscountOffering / 100))*(1 - (SpecialDiscountAvailable/ 100));
                        VisitorBalance.set(index,(CBalance -amountToPay ));
                        revenue.add(amountToPay);
                        System.out.println("The ticket for "+AttractionOpen.get(TicketChoice-1) +" was purchased successfully. Your balance is now "+ (CBalance -amountToPay ));
                        break;
                    }else{
                        System.out.println("Invalid discount code. Try again.");
                    }
                }
            }
        }
    }
    public void BuyMembership() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Buy Membership:\n" +
                "1. Basic Membership (₹20)\n" +
                "2. Premium Membership (₹50)\n");
        System.out.println("Enter your choice: ");
        int MemberChoice = scan.nextInt();
        System.out.println();

        System.out.println("Enter Visitor Email: ");
        String VisitorsEmail = scan.next();

        int index = VisitorEmail.indexOf(VisitorsEmail);

        if (index != -1) {
            System.out.println("Apply Discount Code (If not applicable, then enter 'None'): ");
            String VisitorDiscountCode = scan.next();

            ArrayList<String> DCategory = DiscountCategory;
            ArrayList<Double> DisPercentage = DiscountPercentage;
            ArrayList<String> DisCode = DiscountCodes;
            System.out.println("Discount Code:"+DisCode);

            if (VisitorDiscountCode.equalsIgnoreCase("None")) {
                if (MemberChoice == 1) {
                    double currentBalance = VisitorBalance.get(index);
                    VisitorBalance.set(index, currentBalance - 20);
                    System.out.println("Basic Membership purchased. Your balance is now ₹" + (currentBalance - 20));
                    revenue.add(20.0);
                    Membership.add("Basic");
                } else if (MemberChoice == 2) {
                    double currentBalance = VisitorBalance.get(index);
                    VisitorBalance.set(index, currentBalance - 50);
                    System.out.println("Premium Membership purchased. Your balance is now ₹" + (currentBalance - 50));
                    revenue.add(50.0);
                    Membership.add("Premium");
                } else {
                    System.out.println("Invalid membership choice. Try Again.");
                }
            } else {
                for (int i = 0; i < DisCode.size(); i++) {
                    if (VisitorDiscountCode.equalsIgnoreCase(DisCode.get(i))) {
                        if (MemberChoice == 1) {
                            double CBalance = VisitorBalance.get(index);
                            double DiscountOffering = DisPercentage.get(i);
                            double amountToPay = 20 * (1 - (DiscountOffering / 100));
                            VisitorBalance.set(index, (CBalance - amountToPay));
                            revenue.add(amountToPay);
                            System.out.println("Basic Membership purchased with a discount. Your balance is now ₹" + (CBalance - amountToPay));
                            Membership.add("Basic");
                        } else if (MemberChoice == 2) {
                            double CBalance = VisitorBalance.get(index);
                            double DiscountOffering = DisPercentage.get(i);
                            double amountToPay = 50 * (1 - (DiscountOffering / 100));
                            VisitorBalance.set(index, (CBalance - amountToPay));
                            revenue.add(amountToPay);
                            System.out.println("Premium Membership purchased with a discount. Your balance is now ₹" + (CBalance - amountToPay));
                            Membership.add("Premium");
                        } else {
                            System.out.println("Invalid membership choice. Try Again.");
                        }
                        break;
                    } else {
                        System.out.println("Invalid discount code. Try again.");
                    }
                }
            }
        } else {
            System.out.println("Visitor with the provided email not found. Please enter a valid email.");
        }
    }
    animals animalObj = new animals();


    public void VisitAnimals(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nAnimals in the Zoo:");
            for (int i = 0; i < AnimalNames.size(); i++) {
                System.out.println("#"+(i+1)+" Animal Name: " + AnimalNames.get(i));
            }
            System.out.println("Invalid choice");
            System.out.println("Choose an animal to visit: ");
            Integer animalChoice = scan.nextInt();

            if(animalChoice==100){
                break;
            }
            VisitAnimal selectedAnimal = null;
            for(int i=0;i< AnimalNames.size();i++){
                if(AnimalNames.get(animalChoice-1).equalsIgnoreCase(AnimalNames.get(i))){
                    if(AnimalType.get(animalChoice-1).equalsIgnoreCase("mammals")){
                        if (AnimalNames.get(i).equalsIgnoreCase("lion")) {
                            selectedAnimal = new Mammals("lion");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("giraffe")) {
                            selectedAnimal = new Mammals("giraffe");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("monkey")) {
                            selectedAnimal = new Mammals("monkey");
                        }
                        break;
                    }else if(AnimalType.get(animalChoice-1).equalsIgnoreCase("amphibians")){
                        if (AnimalNames.get(i).equalsIgnoreCase("frogs")) {
                            selectedAnimal = new Amphibians("frogs");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("salamanders")) {
                            selectedAnimal = new Amphibians("salamanders");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("newts")) {
                            selectedAnimal = new Amphibians("newts");
                        }
                        break;
                    }else if(AnimalType.get(animalChoice-1).equalsIgnoreCase("reptiles")){
                        if (AnimalNames.get(i).equalsIgnoreCase("crocodiles")) {
                            selectedAnimal = new Reptiles("crocodiles");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("chameleon")) {
                            selectedAnimal = new Reptiles("chameleons");
                        } else if (AnimalNames.get(i).equalsIgnoreCase("lizards")) {
                            selectedAnimal = new Reptiles("lizards");
                        }
                        break;
                    }
                }else{
                    System.out.println("Invalid choice");
                }
            }
            if(selectedAnimal!=null){
                animalObj.Visitanimal(selectedAnimal);
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }while(true);
    }
    public void VisitAttractions(){
        do {
            Scanner scan = new Scanner(System.in);
            ArrayList<String> attractionNames = AttractionOpen;
            System.out.println("Select an attraction to visit:");
            for (int i = 0; i < attractionNames.size(); i++) {
                System.out.println("#" + (i + 1) + " " + attractionNames.get(i));
            }
            System.out.println("#" + (attractionNames.size() + 1) + " Exit\n");
            System.out.println("Enter your choice");
            int TicketChoice = scan.nextInt();
            if(TicketChoice==(AttractionOpen.size()+1)){
                break;
            }
            int lastindex = TicketBought.size() - 1;
            int lastelement = TicketBought.get(lastindex);

            if (attractionNames.get(TicketChoice - 1).equalsIgnoreCase(AttractionToSee.get(lastindex))) {
                if(lastelement>0) {
                    System.out.println("1 Ticket Used.");
                    TicketBought.set(lastindex, lastelement - 1);
                    System.out.println("Thank you for visiting " + attractionNames.get(TicketChoice - 1) + ". Hope you enjoyed the attraction.");
                    break;
                } else{
                    System.out.println("You need to buy new tickets.");
                }
            } else {
                System.out.println("Ticket not available. Basic Members need to buy separate tickets for the attractions.");
            }
        }while(true);
    }
    private ArrayList<String> VisitorFeedback = new ArrayList<>();
    public void LeaveFeedback(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your feedback (max 200 characters): ");
        String VFeedback = scan.nextLine();
        VisitorFeedback.add(VFeedback);
        System.out.print("Thank you for your feedback.");
    }

    public void DisplayFeedback(){
        for(int i = 0; i < VisitorFeedback.size(); i++) {
            System.out.print("#"+(i+1)+" "+VisitorFeedback.get(i));
        }
    }

}
interface VisitAnimal {
    void feed();
    String read();
}
class Mammals implements VisitAnimal {
    private String name;
    public Mammals(String name){
        this.name = name;
    }
    @Override
    public void feed(){
        if(name.equalsIgnoreCase("lion") || name.equalsIgnoreCase("lions")){
            System.out.println(name+": Roar");
        }else if(name.equalsIgnoreCase("giraffe") || name.equalsIgnoreCase("giraffes")){
            System.out.println(name+": Mush");
        }else if(name.equalsIgnoreCase("monkey") || name.equalsIgnoreCase("monkeys")){
            System.out.println(name+": Keeh");
        }
        else{
            System.out.println("Sound not available for this animal.");
        }
    }
    @Override
    public String read(){
        if(name.equalsIgnoreCase("lion") || name.equalsIgnoreCase("monkeys")){
            return "The lion is the king of the jungle";
        }else if(name.equalsIgnoreCase("giraffe") || name.equalsIgnoreCase("giraffes")){
            return "Giraffes have very long neck";
        }else if(name.equalsIgnoreCase("monkey") || name.equalsIgnoreCase("monkeys")){
            return "Monkeys are very mischivious";
        }
        else{
            return "Information about this mammal is not available";
        }
    }
}
class Amphibians implements VisitAnimal {
    private String name;
    public Amphibians(String name){
        this.name = name;
    }
    @Override
    public void feed(){
        if(name.equalsIgnoreCase("frogs") || name.equalsIgnoreCase("frog")){
            System.out.println(name+": Bonk");
        }else if(name.equalsIgnoreCase("salamanders") || name.equalsIgnoreCase("salamander")){
            System.out.println(name+": Clicks");
        }else if(name.equalsIgnoreCase("newts") || name.equalsIgnoreCase("newt")){
            System.out.println(name+": Hssst");
        }
        else{
            System.out.println("Sound not available for this animal.");
        }
    }
    @Override
    public String read(){
        if(name.equalsIgnoreCase("frogs") || name.equalsIgnoreCase("frog")){
            return "Frogs have excellent night visison.";
        }else if(name.equalsIgnoreCase("salamanders") || name.equalsIgnoreCase("salamander")){
            return "Salamanders are the second largest group of amphibinans";
        }else if(name.equalsIgnoreCase("newts") || name.equalsIgnoreCase("newt")){
            return "Newts have the ability to regenerate limbs,intestines and jaws. ";
        }
        else{
            return "Information about this mammal is not available";
        }
    }
}
class Reptiles implements VisitAnimal {
    private String name;
    public Reptiles(String name){
        this.name = name;
    }
    @Override
    public void feed(){
        if(name.equalsIgnoreCase("crocodiles") || name.equalsIgnoreCase("crocodile")){
            System.out.println(name+": Hmmmm");
        }else if(name.equalsIgnoreCase("chameleon") || name.equalsIgnoreCase("chameleons")){
            System.out.println(name+": Hssss");
        }else if(name.equalsIgnoreCase("lizards") || name.equalsIgnoreCase("lizard")){
            System.out.println(name+": Hppp");
        }
        else{
            System.out.println("Sound not available for this animal.");
        }
    }
    @Override
    public String read(){
        if(name.equalsIgnoreCase("crocodiles") || name.equalsIgnoreCase("crocodile")){
            return "Crocodiles have very powerful jaws.";
        }else if(name.equalsIgnoreCase("chameleon") || name.equalsIgnoreCase("chameleons")){
            return "Chameleons have eyes in the backside of their heads.";
        }else if(name.equalsIgnoreCase("lizards") || name.equalsIgnoreCase("lizard")){
            return "Lizards can detach their tails.";
        }
        else{
            return "Information about this mammal is not available";
        }
    }
}
class animals{
    public void Visitanimal (VisitAnimal animal){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to feed the animal or read about it? (feed/read/exit): ");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("feed")) {
                animal.feed();
            } else if (choice.equalsIgnoreCase("read")) {
                System.out.println(animal.read());
            } else if (choice.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid choice. Please choose 'feed', 'read', or 'exit'.");
            }
        }
    }
}

public class zootopia {
    public static void main(String[] args) {
        System.out.println("Welcome to ZOOtopia!");
        System.out.println();

        zoo zooobj = new zoo();
        admin adminObj = new admin();

        while (true) {
            System.out.println("1. Enter as Admin");
            System.out.println("2. Enter as a Visitor");
            System.out.println("3. View Special Deals");
            System.out.println("Enter anything else to exit.");
            System.out.println();

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int UserAnswer = obj.nextInt();

            if (UserAnswer == 1) {
                int AdminChoice;
                adminObj.EnterAdmin();
                do {
                    zooobj.AdminMenu();
                    System.out.println("\nEnter your choice: ");
                    AdminChoice = obj.nextInt();
                    if (AdminChoice == 1) {
                        adminObj.ManageAttractions();
                    }
                    if (AdminChoice == 2) {
                        adminObj.ManageAnimals();
                    }
                    if (AdminChoice == 3) {
                        adminObj.ScheduleEvents();
                    }
                    if (AdminChoice == 4) {
                        adminObj.SetDiscounts();
                    }
                    if (AdminChoice == 5) {
                        adminObj.SetSpecialDeal();
                    }
                    if (AdminChoice == 6) {
                        adminObj.ViewVisitorStats();
                    }
                    if (AdminChoice == 7) {
                        adminObj.DisplayFeedback();
                    }
                    if (AdminChoice == 8) {
                        System.out.println("Logged out.\n");
                        break;
                    }
                } while (true);
            }

            else if (UserAnswer == 2) {
                boolean loggedIn = false;
                do {
                    System.out.println("1. Register");
                    System.out.println("2. Login\n");
                    System.out.println("Enter your choice: ");
                    int VisitorChoice = obj.nextInt();
                    if (VisitorChoice == 1) {
                        adminObj.VisitorRegister();
                    } else if (VisitorChoice == 2) {
                        if (adminObj.CheckLogin()) {
                            System.out.println("Login Successful.");
                            loggedIn = true;
                        } else {
                            System.out.println("Login failed. Please try again.");
                        }
                    }
                } while (!loggedIn);

                do {
                    zooobj.VisitorMenu();
                    System.out.println("Enter your choice: ");
                    int VisitorChoice = obj.nextInt();
                    if (VisitorChoice == 1) {
                        adminObj.ExploreTheZoo();
                    }

                    if (VisitorChoice == 2) {
                        adminObj.BuyMembership();
                    }
                    if (VisitorChoice == 3) {
                        adminObj.BuyTickets();
                    }
                    if (VisitorChoice == 4) {
                        adminObj.ViewDiscounts();
                    }
                    if (VisitorChoice == 5) {
                        adminObj.ViewSpecialDealsForVisitor();
                    }
                    if (VisitorChoice == 6) {
                        adminObj.VisitAnimals();
                    }
                    if (VisitorChoice == 7) {
                        adminObj.VisitAttractions();
                    }
                    if (VisitorChoice == 8) {
                        adminObj.LeaveFeedback();
                    }
                    if (VisitorChoice == 9) {
                        System.out.println("Logged out.");
                        break;
                    }
                } while (true);
            }
            else if(UserAnswer==3){
                adminObj.ViewSpecialDealsForVisitor();
            }else{
                System.out.println("Thank you for visiting ZOOtopia. Goodbye!");
                break;
            }
        }
    }
}

