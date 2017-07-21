package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Practice5DrawOvalView extends View {
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
        Log.i(TAG, "onMeasure: +"+ mWidth +"=="+ mHeight);
    }

    @TargetApi(21)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);
        canvas.drawOval(mWidth/3,mHeight/8*3,mWidth/3*2,mHeight/8*5,mPaint);
//        练习内容：使用 canvas.drawOval() 方法画椭圆
    }
}
