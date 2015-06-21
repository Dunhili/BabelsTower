package com.dunhili.babelstower.shape;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public abstract class Shape extends View {
    /**
     *
     * @param context
     */
    public Shape(Context context) {
        super(context);
    }

    /**
     *
     * @param context
     * @param attrs
     */
    public Shape(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public abstract void onDraw(Canvas canvas);
}