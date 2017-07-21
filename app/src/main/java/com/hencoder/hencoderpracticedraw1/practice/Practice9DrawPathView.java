package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Practice9DrawPathView extends View {
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    private Path path;
    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        path = new Path();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mWidth= getWidth();
        mHeight= getHeight();
        Log.i(TAG, "onDraw: "+mWidth);
        int radus = mWidth / 16;
        int radusH = mHeight / 12;
        path.addArc(mWidth/2-2*radus, mHeight/3, mWidth/2, mHeight/3+radusH*2, -225, 225);
        path.arcTo(mWidth/2, mHeight/3, mWidth/2+2*radus, mHeight/3+radusH*2, -225, 250,false);
        path.lineTo(mWidth/2, mHeight/3*2);
        path.close();
canvas.drawPath(path,mPaint);
    }
}
