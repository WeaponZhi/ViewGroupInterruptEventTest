package com.weaponzhi.viewgroupinterrupteventtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * MyLayout 测试ViewGroup的requestDisallowInterceptTouchEvent()方法调用位置
 * <p>
 * author: 张冠之 <br>
 * time:   2017/03/10 11:51 <br>
 * GitHub: https://github.com/WeaponZhi
 * blog:   http://weaponzhi.online
 * CSDN:   http://blog.csdn.net/qq_34795285
 * </p>
 */

public class MyLayout extends LinearLayout{
    public MyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                return false;
            case MotionEvent.ACTION_MOVE:   //表示父类需要
                    return false;
            case MotionEvent.ACTION_UP:
                return false;
            default:
                break;
        }
        Log.e("TestView","父容器拦截");
        return false;    //如果设置拦截，除了down,其他都是父类处理
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("TAG", "You down layout");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("TAG", "You up layout");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("TAG", "You move layout");
        }
        return true;
    }
}
