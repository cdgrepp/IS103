/*
* Create a class with a main() that throws an object of class Exception inside
* a try block. Give the constructor for Exception a String argument. Catch
* the exception inside a catch clause and print the String argument. Add a
* finally clause and print a message to prove you were there.
*/

public class activityOne {

    
  
    public static void main(String[] args) {
        try {
            throw new Exception("This is an Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally, I'm here ");
        }
    }
    
}
