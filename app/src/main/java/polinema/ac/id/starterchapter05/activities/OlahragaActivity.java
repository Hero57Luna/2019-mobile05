package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandFragment;
import polinema.ac.id.starterchapter05.fragments.PushFragment;

public class OlahragaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);
    }

    public void handlerHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HandFragment handFragment = (HandFragment)getSupportFragmentManager().findFragmentByTag("Hand_Fragment");

        if(handFragment != null && handFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_disini, new HandFragment(), "Hand_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDipsNew(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("Dips_Fragment");

        if(dipsFragment != null && dipsFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_disini, new DipsFragment(), "Dips_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerPush(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushFragment pushFragment = (PushFragment) getSupportFragmentManager().findFragmentByTag("Push_Fragment");

        if(pushFragment != null && pushFragment.isVisible()) {
            fragmentTransaction.commit();
        }
        else {
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_disini, new PushFragment(), "Push_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
