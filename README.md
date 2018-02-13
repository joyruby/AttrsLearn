# AttrsLearn
主要尝试了下面四种用法：
```
//对应于当前主题的赋值
context.getTheme().obtainStyledAttributes(R.styleable.AttrTextView1);
//对应指定的R.style.AttrStyle1样式下的赋值
context.getTheme().obtainStyledAttributes(R.style.AttrStyle1,R.styleable.AttrTextView1);
//对应自定义view的赋值，如上2
context.getResources().obtainAttributes(attrs, R.styleable.AttrTextView1);
//四个参数包括了上面的三种情况：
//第一个参数：对应自定义view的赋值
//第二个参数：属性集
//第三个参数：对应主题里的属性赋值，这里的属性一般不对应一个值而是一个样式的引用
//第四个参数：对应指定样式下的赋值
context.getTheme().obtainStyledAttributes(null, R.styleable.AttrTextView1,R.attr.attr4,0);
```
