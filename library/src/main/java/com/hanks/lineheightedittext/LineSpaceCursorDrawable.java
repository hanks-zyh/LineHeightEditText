package com.hanks.lineheightedittext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/**
 * Editor cursor
 * Created by hanks on 2017/1/6.
 */

public class LineSpaceCursorDrawable extends ShapeDrawable {
    private int mHeight;

    public LineSpaceCursorDrawable(int cursorColor, int cursorWidth, int cursorHeight) {
        mHeight = cursorHeight;
        setDither(false);
        getPaint().setColor(cursorColor);
        setIntrinsicWidth(cursorWidth);
    }

    public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        super.setBounds(paramInt1, paramInt2, paramInt3, this.mHeight + paramInt2);
    }

}
