package com.weaponzhi.viewgroupinterrupteventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * MyButton 重写onTouchEvent
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/10 11:53 <br>
 * GitHub: https://github.com/WeaponZhi
 * blog:   http://weaponzhi.online
 * CSDN:   http://blog.csdn.net/qq_34795285
 * </p>
 */

public class MyButton extends Button {
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        getParent().requestDisallowInterceptTouchEvent(true);
        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:
                Log.d("TAG", "You down button");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("TAG", "You up button");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("TAG", "You move button");
        }
        return false;
    }
}
