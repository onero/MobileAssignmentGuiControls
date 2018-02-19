package dk.adamino.mobileassignmentguicontrols.bll;

import android.graphics.Color;

/**
 * Created by Lindved on 19-02-2018.
 */

public class ColorService implements IColorService{
    @Override
    public int getColor(boolean red, boolean yellow, boolean blue) {
        if(red && !yellow && !blue){
            return Color.RED;
        }else if(red && yellow && !blue){
//            return Color.ORANGE;
        }else if (red && yellow && blue){

        }else if(!red && yellow && !blue){

        }else if(!red && yellow && blue){

        }else if(!red && !yellow && blue){

        }else if(!red && !yellow && !blue){

        }
        return 0;
    }
}
