package dk.adamino.mobileassignmentguicontrols.bll;

import android.graphics.Color;

import dk.adamino.mobileassignmentguicontrols.R;

/**
 * Created by Lindved on 19-02-2018.
 */

public class ColorService implements IColorService{
    @Override
    public int getColor(boolean red, boolean yellow, boolean blue) {
        if(red && !yellow && !blue)
            return R.color.kLindvedRed;
        else if(red && yellow && !blue)
            return R.color.kLindvedOrange;
        else if (red && yellow && blue)
            return R.color.kLindvedBrown;
        else if (red && !yellow && blue)
            return R.color.kLindvedPurple;
        else if(!red && yellow && !blue)
            return R.color.kLindvedYellow;
        else if(!red && yellow && blue)
            return R.color.kLindvedGreen;
        else if(!red && !yellow && blue)
            return R.color.colorPrimaryDark;
        else
            return R.color.kLindvedWhite;
    }
}
