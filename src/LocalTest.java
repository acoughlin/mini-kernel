// Comp 350
// Prof. Sattar

public class LocalTest {

    public static void main(String[] args) {
// Call getLocal method
        String name = Library.dir();
        int temp;
        try {
            temp = Integer.parseInt(name);
        } catch (NumberFormatException x) {
            temp = 0;
        }
// If getLocal() method gives error message then
        if (temp < 0) {
            Library.output("Error: " + Library.errorMessage[-temp] + "\n");
        } // Else print output of getLocal()
        else {
            Library.output("Local machine name is " + name
                    + "\n");
        }
    }
}
