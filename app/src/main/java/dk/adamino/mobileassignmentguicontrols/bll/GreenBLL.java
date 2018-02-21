package dk.adamino.mobileassignmentguicontrols.bll;

/**
 * Created by Mathias on 20/02/2018.
 */

public class GreenBLL implements IGreenBLL {

    @Override
    public boolean getAnswer(String resultValue1, String resultValue2, String resultValue3, int resultValue4, int resultValue5, int resultValue6) {
        if (resultValue1.equals("Sunday") &&
            resultValue2.equals("August") &&
            resultValue3.equals("Rooster") &&
            resultValue4 == 0 &&
            resultValue5 == 8 &&
            resultValue6 == 2) {
            return true;
        } else {
            return false;
        }
    }
}
