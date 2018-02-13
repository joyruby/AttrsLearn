package skin.example.com.attrslearn.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import skin.example.com.attrslearn.R;

/**
 * Created by whrwhr446 on 13/02/2018.
 */

public class AttrTextView4 extends AttrTextView1 {
    public AttrTextView4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public AttrTextView4(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @Override
    protected void init(Context context, AttributeSet attrs) {
        a = context.getTheme().obtainStyledAttributes(null, R.styleable.AttrTextView1,R.attr.attr4,0);
        super.init(context, attrs);
    }
}
