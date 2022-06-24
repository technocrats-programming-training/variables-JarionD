public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        

        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
 System.out.println("  Hello, I am" + " " + firstName + " " + lastName + ", and I am" + " " + age + " " + "years old.");
       
// Print out whether age is even
      
  if ( age % 2 == 0 )
        System.out.println("The age you entered is even.");
     else
        System.out.println("The age you entered is odd.");

    // Print out whether firstName equals lastName

      if (firstName.equals(lastName))
           System.out.println("The first name you entered equals the last name.");
      else
        System.out.println("The first name you entered is not equal to the last name.");
      
      // Print out whether age is greater than 0

      if ( age > 2 )
           System.out.println("The age you entered is greater than 0.");
      else
        System.out.println("The age you entered is not greater than 0.");
      


    }
}
