package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    public Ladder(int width, int height) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            lines.add(new Line(width));
        }

        this.lines = Collections.unmodifiableList(lines);
    }

    public List<Line> getLines() {
        return List.copyOf(lines);
    }

}
