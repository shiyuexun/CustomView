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

public class Practice7DrawRoundRectView extends View {
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
        Log.i(TAG, "onMeasure: +"+ mWidth +"=="+ mHeight);
    }
    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
@TargetApi(21)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(mWidth/3,mHeight/3,mWidth/3*2,mHeight/3*2,30,30,mPaint);
//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
    }
}
