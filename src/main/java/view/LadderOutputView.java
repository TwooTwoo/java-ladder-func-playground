package view;

import dto.LineDto;

public class LadderOutputView {

    private static final String INDENTATION = "    ";
    private static final String DASH_COUPLER = "-----";
    private static final String BLANK_COUPLER = "     ";
    private static final String PILLAR = "|";

    private LadderOutputView() {
    }

    private static final LadderOutputView ladderOutputView = new LadderOutputView();

    public static LadderOutputView getInstance() {
        return ladderOutputView;
    }

    public void printResultHeader() {
        System.out.println("실행결과");
        System.out.println();
    }

    public void printLine(LineDto lineDto) {
        StringBuilder output = new StringBuilder()
                .append(INDENTATION)
                .append(PILLAR);

        for (boolean isExist : lineDto.getLinkExistCollection()) {
            String coupler = getCoupler(isExist);
            output.append(coupler)
                    .append(PILLAR);
        }

        System.out.println(output);
    }

    private String getCoupler(boolean isLinkExist) {
        if (isLinkExist) {
            return DASH_COUPLER;
        }
        return BLANK_COUPLER;
    }

}
