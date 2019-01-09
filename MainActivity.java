package khoapham.ptp.phamtanphat.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.add(R.id.relativelayout,fragmentAndroid);
        fragmentTransaction.commit();
    }
    add ben xml :
        - Chỉ quan tâm về kick thước của view;
    add ben code:
        - Layout fragment ra sao thì đưa y như vậy vào

}
