package model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Line {
    private static final Random random = new Random();

    private final List<Boolean> links;

    public Line(int width) {
        List<Boolean> links = new ArrayList<>();
        for (int i = 0; i < width-1; i++) {
            links.add(getConnectDecider(i, links));
        }

        this.links = Collections.unmodifiableList(links);
    }

    // 메서드명 미정
    private boolean getConnectDecider (int index, List<Boolean> links) {
        if(!isConnectable(index, links)) {
            return false;
        }
        // 랜덤 돌리고
        return random.nextBoolean();
    }

    // 연결 가능한지 검사
    private boolean isConnectable(int index, List<Boolean> links) {
        return isFirstIndex(index) || !(links.get(index-1));
    }

    // 첫번째 인덱스인지 확인
    private boolean isFirstIndex(int index) {
        return index == 0;
    }

    public List<Boolean> getLinks() {
        return List.copyOf(links);
    }
}
