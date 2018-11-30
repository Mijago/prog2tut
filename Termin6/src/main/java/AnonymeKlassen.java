public class AnonymeKlassen {

    public static void main(String[] args) {

        machIrgendwas(new MyCallback() {
            public void onCall() {
                System.out.println("Test");
            }
        });

        machIrgendwas(new MyCallback() {
            public void onCall() {
                System.out.println("Test 2");
            }
        });

        machIrgendwas(() -> {
            System.out.println("Test 3");
        });

    }

    public static void machIrgendwas(MyCallback cb) {
        // ... komplexe berechnung
        cb.onCall();
    }

    public interface MyCallback {
        void onCall();
    }

}
