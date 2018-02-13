package skin.example.com.attrslearn.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import skin.example.com.attrslearn.R;

/**
 * Created by whrwhr446 on 13/02/2018.
 */

public class AttrTextView1 extends TextView {
    String text;
    int color;
    float size;
    TypedArray a;

    public AttrTextView1(Context context) {
        super(context);
//        init(context,null);
    }

    public AttrTextView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public AttrTextView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        init(context,attrs);
    }

    protected void init(Context context, AttributeSet attrs) {
        if(a == null){
            a = context.getTheme().obtainStyledAttributes(R.styleable.AttrTextView1);
        }

        text = a.getString(R.styleable.AttrTextView1_text1);
        color = a.getColor(R.styleable.AttrTextView1_textColor,0);
        size = a.getDimension(R.styleable.AttrTextView1_textSize,0);
        a.recycle();

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setText(text);
        setTextColor(color);
        setTextSize(size);
    }
}
