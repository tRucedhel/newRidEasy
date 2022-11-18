package com.project.driveasy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.project.driveasy.fragments.OrderHistory;
import com.project.driveasy.fragments.TransactionHistory;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new OrderHistory();
            case 1:
                return new TransactionHistory();
            default:
                return new OrderHistory();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
