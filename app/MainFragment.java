package ltd.solutions.software.myt.asfapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    private ViewPager viewPager;
    private CustomSwipeAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, null);
    }

    @Override
    public void onStart() {
        super.onStart();

        viewPager = (ViewPager) getView().findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(getView().getContext());
        viewPager.setAdapter(adapter);
    }
}
