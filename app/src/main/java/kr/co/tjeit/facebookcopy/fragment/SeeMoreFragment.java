package kr.co.tjeit.facebookcopy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kr.co.tjeit.facebookcopy.R;

/**
 * Created by the on 2017-08-04.
 */

public class SeeMoreFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_see_more, container, false);
        return v;
    }
}
