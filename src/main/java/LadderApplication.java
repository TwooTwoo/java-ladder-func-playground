import controller.LadderController;

public class LadderApplication {
    public static void main(String[] args) {
        LadderController ladderController = LadderController.getInstance();

        ladderController.run();
    }

}
