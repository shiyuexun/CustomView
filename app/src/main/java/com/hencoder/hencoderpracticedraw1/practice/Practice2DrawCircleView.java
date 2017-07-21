package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private int width;
    private int height;
    int radius;
    private static final String TAG = "Practice2DrawCircleView";
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    Paint mPaint;
    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        Log.e(TAG, "Practice2DrawCircleView: " );
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width = w;
        height = h;
        Log.e(TAG, "onSizeChanged: " );
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG, "onDraw: " );
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        int radus1= (width / 2-80-20)/2;
        int radus2= (height -80)/4;
        radius = Math.min(radus1, radus2);
        int x1 = 80 + radius;
        int y1= 20 + radius;
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x1,y1,radius,mPaint);

        int x2 = width / 2 + 20+radius;
        int y2= y1;
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        canvas.drawCircle(x2,y2,radius,mPaint);
        int x3 = x1;
        int y3= height/2+20+radius;
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(x3,y3,radius,mPaint);

        int x4 = x2;
        int y4= y3;
        Path path = new Path();
        path.addCircle(x4,y4,radius, Path.Direction.CCW);
        path.addCircle(x4,y4,radius-40, Path.Direction.CCW);
        path.setFillType(Path.FillType.EVEN_ODD);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(path,mPaint);
    }
}
