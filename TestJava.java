public class TestJava {
    public static void main(String[] args) {
        System.out.println("Hello from TestJava!");
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running... from the main BB");
                }
            };
            r.run();
    }

}
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Running...");
    }
}


