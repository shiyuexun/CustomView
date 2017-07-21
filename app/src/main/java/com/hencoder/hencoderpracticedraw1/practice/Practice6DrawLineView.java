package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

public class Practice6DrawLineView extends View {
    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
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
    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStrokeWidth(5);
        canvas.drawLine(mWidth/3,mHeight/3,mWidth/3*2,mHeight/3*2,mPaint);
//        练习内容：使用 canvas.drawLine() 方法画直线
    }
}
