package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

    }

    public void handlerClickLoadBlueFragment(View view) {
        BlueFragment blueFragment = (BlueFragment) getSupportFragmentManager().findFragmentByTag("BLUE_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(blueFragment != null && blueFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new BlueFragment(), "BLUE_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }


    public void handlerClickLoadRedFragment(View view) {
        RedFragment redFragment = (RedFragment) getSupportFragmentManager().findFragmentByTag("RED_FRAGMENT");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(redFragment != null && redFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new RedFragment(), "RED_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
