package controller;

import model.Ladder;
import model.Line;
import view.LadderOutputView;

import java.util.List;

public class LadderController {
    LadderOutputView ladderOutputView = new LadderOutputView();

    public void run() {
        Ladder ladder = new Ladder(4, 4);
        List<Line> lines = ladder.getLines();

        for(Line line : lines) {
            ladderOutputView.printLine(line.getLinks());
        }
    }

}
