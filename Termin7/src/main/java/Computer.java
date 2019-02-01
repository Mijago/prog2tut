public class Computer {
    private int kernAnzahl;
    private String seriennummer;
    private String hersteller;
    private Betriebssystem betriebssystem;

    public Computer(int kernAnzahl, Betriebssystem betriebssystem, String seriennummer, String hersteller) {
        this.kernAnzahl = kernAnzahl;
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
        this.betriebssystem = betriebssystem;
    }

    public void ausfuehren(Programm programm) {
        for (int n = 0; n < kernAnzahl; n++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // Simuliere das Warten je nach Betriebssystem
                        switch (betriebssystem) {
                            case Windows10:
                                Thread.sleep(100);
                                break;
                            case WindowsXP:
                                Thread.sleep(5000);
                        }
                        programm.macheDinge();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
    }
}

/**
 * Thread t = new Thread(() -> {
 * try {
 * switch (betriebssystem) {
 * case Windows10:
 * Thread.sleep(100);
 * break;
 * case WindowsXP:
 * Thread.sleep(5000);
 * }
 * programm.macheDinge();
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * });
 */