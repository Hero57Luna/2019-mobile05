package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class FitnessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }

    public void handlerHand(View view) {
        HandFragment handFragment = (HandFragment)getSupportFragmentManager().findFragmentByTag("Hand_Fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(handFragment != null && handFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.place_fragment_here, new HandFragment(), "Hand_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void handlerDips(View view) {
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("Dips_Fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(dipsFragment != null && dipsFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.place_fragment_here, new DipsFragment(), "Dips_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerPushup(View view) {
        PushupFragment pushupFragment = (PushupFragment) getSupportFragmentManager().findFragmentByTag("Pushup_Fragment");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if(pushupFragment != null && pushupFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.place_fragment_here, new PushupFragment(), "Pushup_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
