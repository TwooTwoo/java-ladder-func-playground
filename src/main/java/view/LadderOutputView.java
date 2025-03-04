package view;

import java.util.List;

public class LadderOutputView {

    private static String DASH_COUPLER = "-----";
    private static String BLANK_COUPLER = "     ";

    public void printLine(List<Boolean> line) {
        StringBuilder output = new StringBuilder();
        output.append("|");

        for(boolean isConnected : line) {
            output.append(getJoiner(isConnected));
            output.append("|");
        }

        System.out.println(output);
    }

    private String getJoiner(boolean isConnected) {
        if(isConnected) {
            return DASH_COUPLER;
        }
        return BLANK_COUPLER;
    }



}
