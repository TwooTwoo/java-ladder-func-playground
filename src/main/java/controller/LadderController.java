package controller;

import dto.LineDto;
import model.Ladder;
import model.Line;
import view.LadderOutputView;

import java.util.List;

public class LadderController {
    private static final LadderController ladderController = new LadderController();

    private final LadderOutputView ladderOutputView = LadderOutputView.getInstance();

    private LadderController() {
    }

    public static LadderController getInstance() {
        return ladderController;
    }

    public void run() {
        Ladder ladder = new Ladder(4, 4);
        List<Line> lines = ladder.getLines();

        ladderOutputView.printResultHeader();
        for (Line line : lines) {
            LineDto lineDto = LineDto.from(line);
            ladderOutputView.printLine(lineDto);
        }
    }

}
