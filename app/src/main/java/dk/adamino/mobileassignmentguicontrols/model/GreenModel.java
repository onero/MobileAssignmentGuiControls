package dk.adamino.mobileassignmentguicontrols.model;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Mathias on 19/02/2018.
 */

public class GreenModel {

    private final String[] weekDayList = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday"};
    private final String[] monthList = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private final String[] yearList = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse",
            "Goat", "Monkey", "Rooster", "Dog", "Pig"};

    public String[] getWeekDayList() {
        return weekDayList;
    }

    public String[] getMonthList() {
        return monthList;
    }

    public String[] getYearList() {
        return yearList;
    }

}
