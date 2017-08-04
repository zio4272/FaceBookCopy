package kr.co.tjeit.facebookcopy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.co.tjeit.facebookcopy.fragment.NewsfeedFragment;
import kr.co.tjeit.facebookcopy.fragment.FourPageFragment;
import kr.co.tjeit.facebookcopy.fragment.NoPageFragment;
import kr.co.tjeit.facebookcopy.fragment.FriendRequestFragment;
import kr.co.tjeit.facebookcopy.fragment.MessageFragment;
import kr.co.tjeit.facebookcopy.fragment.SeeMoreFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager MainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainViewPager = (ViewPager) findViewById(R.id.MainViewPager);
        MainViewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager()));

    }

    class MainViewPagerAdapter extends FragmentStatePagerAdapter {

        public MainViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NewsfeedFragment();
            } else if (position == 1) {
                return new FriendRequestFragment();
            } else if (position == 2) {
                return new MessageFragment();
            } else if (position == 3) {
                return new FourPageFragment();
            } else if (position == 4) {
                return new SeeMoreFragment();

            } else {
                return new NoPageFragment();
            }
        }
    }


}
