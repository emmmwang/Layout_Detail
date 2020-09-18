package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        1.xml配置  layout下创建爱你.xml文件  进行界面布局
        2.code创建 手动使用代码来创建界面或者是添加控件

        一个界面就是一个activity
        一个界面上显示什么内容->控件 视图
        View:单个的看得到的  可以和用户交互的 控件
        ViewGroup：容器 可以存放多个View 并且管理View的布局
        根据每个容器具体功能划分
            FrameLayout        帧布局
            LinearLayout       线性布局
            RelativeLayout     相对布局 A和B之间有相对对其关系（左对齐，右对齐。。。）
            ConstrainLayout    约束布局
         */
    }
}