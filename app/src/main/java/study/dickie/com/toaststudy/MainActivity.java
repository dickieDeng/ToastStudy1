package study.dickie.com.toaststudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * 按钮点击事件,可以设置几个按钮在一个函数中，然后分别得到它们的ID
    */
    public void button_click(View view){
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this,"默认位置",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast toast = Toast.makeText(MainActivity.this,"指定位置",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,100,100);
                toast.show();
                break;
        }
    }
}
