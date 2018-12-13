package com.dalvikmx.collapsingtoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ItemDivider extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS = new int[]{android.R.attr.listDivider};
    private Drawable divider;

    public ItemDivider(Context context){
        final TypedArray styledAttributes = context.obtainStyledAttributes(ATTRS);
        divider = styledAttributes.getDrawable(0);
        styledAttributes.recycle();
    }

    public ItemDivider(Context context, int resourceId){
        divider = ContextCompat.getDrawable(context, resourceId);
    }


    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {

        int leftStart = parent.getPaddingLeft();
        int rightEnd = parent.getWidth() - parent.getPaddingRight();

        int count = parent.getChildCount();
        for (int i = 0; i < count; i++){

            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getTop() + params.bottomMargin;
            int bottom = top + divider.getIntrinsicHeight();

            divider.setBounds(leftStart, top, rightEnd, bottom);
            divider.draw(c);

        }



    }
}