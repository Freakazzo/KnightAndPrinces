public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {

    }

    public void goAndSavePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        kon();
        System.out.println("Да иду уже...");
    }

    private void sharpenBlade() {
        System.out.println("Точим мечь");
    }

    private void getFood() {
        System.out.println("Собираем консервы");
    }

    private void assembleTeam() {
        System.out.println("Будим оруженосца");

    }

    private void kon() {
        System.out.println("Седлаем коня");
    }
}
