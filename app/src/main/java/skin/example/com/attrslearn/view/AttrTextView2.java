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

public class AttrTextView2 extends AttrTextView1 {


    public AttrTextView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public AttrTextView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    public void init(Context context, AttributeSet attrs) {
        a = context.getTheme().obtainStyledAttributes(R.style.AttrStyle1,R.styleable.AttrTextView1);
        super.init(context,attrs);

    }


}
