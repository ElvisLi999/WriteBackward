public class Main {

    public static void writeBackward(String s, int size) {
        if (size > 0) {       // Enforcing pre-condition
            System.out.print(s.substring(size-1,size));  // Print last character

            writeBackward(s, size-1);    // Print rest of string backward
        }// End of if

    } // End of method

    public static void main(String[] args) {
	// write your code here
        writeBackward("Cat",3);
        System.out.println("");
        writeBackward("Elvis",5);
        System.out.println("");
        writeBackward("",0);
    }
}
