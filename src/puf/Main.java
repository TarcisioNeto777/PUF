package puf;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[8];

        l[0] = new Lutador("Lucas Cavalcante(Papa Tango)", "Good Garden", 24, 1.84f, 83.0f, 11, 2, 1);
        l[1] = new Lutador("Colares", "Cid. dos Funcionarios", 32, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Tarcísio Neto", "Maraponga", 35, 1.71f, 78.3f, 12, 2, 1);
        l[3] = new Lutador("Felipe Alexandre", "Parquelândia", 23, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Castelo(Castelito)", "Barra do Ceará", 24, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Carlos Mesquita", "Benfica", 28, 1.81f, 105.7f, 12, 2, 4);
        l[6] = new Lutador("Isadora Rocha(India)", "Caucaia", 20, 1.60f, 55.7f, 15, 4, 4);
        l[7] = new Lutador("Rhayane(Rhayagil)", "Meirelles", 24, 1.58f, 58.4f, 20, 2, 4);

        Luta PUF01 = new Luta();
        PUF01.marcarLuta(l[0], l[5]);
        PUF01.lutar();
    }
}
