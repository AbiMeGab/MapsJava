public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(args);
        Counter counter = new Counter(storage.getEntry());
        counter.countData();
        Printer printer = new Printer(counter.getCount());
        printer.printCount();
    }
}