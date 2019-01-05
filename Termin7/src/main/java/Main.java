public class Main {
    public static void main(String[] args) {
        Computer asus = new ComputerBuilder("1234", "Asus")
                .withBetriebssystem(Betriebssystem.WindowsXP)
                .withKernAnzahl(20)
                .build();

        asus.ausfuehren(new Programm() {
            @Override
            public void macheDinge() {
                System.out.println("Hallo Welt 1!");
            }
        });

        asus.ausfuehren(() -> System.out.println("Hallo Welt 2!"));
    }
}
