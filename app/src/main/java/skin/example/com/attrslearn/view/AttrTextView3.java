package skin.example.com.attrslearn.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import skin.example.com.attrslearn.R;

/**
 * Created by whrwhr446 on 13/02/2018.
 */

public class AttrTextView3 extends AttrTextView1 {
    public AttrTextView3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public AttrTextView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void init(Context context, AttributeSet attrs) {
        a = context.getResources().obtainAttributes(attrs, R.styleable.AttrTextView1);
        super.init(context,attrs);
    }
}
