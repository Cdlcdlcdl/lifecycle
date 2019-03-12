package  com.example.pc.lifecycle;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycleActivity";
    /**
     * LifeCycleActivity创建时被调用
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d(TAG,"onCreate invoke");
    }


    /**
     * LifeCycleActivity从后台重新回到前台时被调用
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart invoke");
    }

    /**
     *LifeCycleActivity创建或者从后台重新回到前台时被调用
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onRestart invoke");
    }


    /**
     *LifeCycleActivity创建或者从被覆盖、后台重新回到前台时被调用
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume invoke");
    }

    /**
     *  LifeCycleActivity被覆盖到下面或者锁屏时被调用
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause invoke");
    }

    /**
     *退出当前Activity或者跳转到新Activity时被调用
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop invoke");
    }

    /**
     *退出当前LifeCycleActivity时被调用,调用之后Activity就结束了
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy invoke");
    }
}
