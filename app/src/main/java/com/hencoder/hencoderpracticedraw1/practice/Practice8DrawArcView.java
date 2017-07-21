package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Practice8DrawArcView extends View {
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        mPaint.setStyle(Paint.Style.STROKE);
        //左边是-180，右边是0°
        canvas.drawArc(mWidth/3,mHeight/3,mWidth/3*2,mHeight/3*2,-160,50,false,mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(mWidth/3,mHeight/3,mWidth/3*2,mHeight/3*2,-100,80,true,mPaint);
        canvas.drawArc(mWidth/3,mHeight/3,mWidth/3*2,mHeight/3*2,20,150,false,mPaint);
    }
}
