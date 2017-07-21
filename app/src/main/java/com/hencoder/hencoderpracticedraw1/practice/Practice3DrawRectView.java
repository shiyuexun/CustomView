package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Practice3DrawRectView extends View {

    private int mWidth;
    private int mHeight;
    private Paint mPaint;

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
        Log.i(TAG, "onMeasure: +"+ mWidth +"=="+ mHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(mWidth/3,mHeight/4,mWidth/3+mWidth/3,mHeight/2+mHeight/4,mPaint);
//        练习内容：使用 canvas.drawRect() 方法画矩形
    }
}
