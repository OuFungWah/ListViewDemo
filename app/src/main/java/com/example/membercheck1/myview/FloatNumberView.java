package com.example.membercheck1.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.membercheck1.R;

/**
 * Created by 区枫华 on 2017/5/18.
 */

public class FloatNumberView extends View {

    private Paint paint = new Paint();
    private Path path = new Path();

    public FloatNumberView(Context context) {
        super(context);
        paint.setColor(getResources().getColor(R.color.buddhaGold));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        setAlpha(1);
    }

    public FloatNumberView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FloatNumberView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        path.moveTo(0, 0);
        path.lineTo(getX(), 0);
        path.lineTo(0, getY());
        path.lineTo(0, 0);
        canvas.drawPath(path, paint);
    }
}
