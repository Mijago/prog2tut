public class ComputerBuilder {
    private int kernAnzahl = 1;
    private Betriebssystem betriebssystem = Betriebssystem.Windows10;
    private String seriennummer;
    private String hersteller;

    public ComputerBuilder(String seriennummer, String hersteller) {
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
    }

    public Computer build() {
        return new Computer(this.kernAnzahl, this.betriebssystem, this.seriennummer, this.hersteller);
    }

    public ComputerBuilder withKernAnzahl(int kernAnzahl) {
        this.kernAnzahl = kernAnzahl;
        return this;
    }

    public ComputerBuilder withBetriebssystem(Betriebssystem betriebssystem) {
        this.betriebssystem = betriebssystem;
        return this;
    }
}
