import org.junit.Test;

public class MainTest {
    @Test
    public void testNumber() {
        System.out.println("******** Letters *************");
        String[] args = {"2", "2", "1", "3", "4", "5", "6", "7", "7"};
        Main.main(args);
    }

    @Test
    public void testLetter() {
        System.out.println("******** Letters *************");
        String[] args = {"hola", "como", "estas", "dije", "hola", "y", "ella", "me", "dijo", "hola"};
        Main.main(args);
    }

    @Test
    public void testHybrid() {
        System.out.println("******** Numbers and Letters *************");
        String[] args = {"Entonces", "dije", "2", "dame", "2", "de", "3"};
        Main.main(args);
    }

}
