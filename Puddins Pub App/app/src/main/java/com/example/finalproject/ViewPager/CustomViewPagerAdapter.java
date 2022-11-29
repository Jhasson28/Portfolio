package com.example.finalproject.ViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.finalproject.R;

public class CustomViewPagerAdapter extends FragmentStateAdapter {
    public CustomViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return MenuItemFragment.newInstance("Puddins Ribs", "Tender Baby Back Ribs with a mild BBQ sauce. Served with fries and a side of baked beans $24.99", R.drawable.ribs);
            case 1:
                return MenuItemFragment.newInstance("Chicken Wings", "Breaded or naked tossed in our sauces: BBQ, Honey Garlic, Mild, Medium, Hot, Fire, Fire & Ice, Spicy Thai. 1 dozen $12.99", R.drawable.chicken_wings);
            case 2:
                return MenuItemFragment.newInstance("Jordans Burger", "Our classic 100% beef burger topped with crispy onions, lettuce, onion rings, bacon, ketchup, mustard, and swiss cheese all on a crispy brioche bun", R.drawable.burger);
            case 3:
                return MenuItemFragment.newInstance("Papa's Pizza","Our delicious pizza doe topped with pizza sauce with cheese melted on top with your choice of up to 4 toppings \n S: 12$ M: 16$ L:20$",R.drawable.pizza);
            case 4:
                return MenuItemFragment.newInstance("Chicken Nuggets","A plate of chicken nuggets with your choice of sauce for dipping served with french fries or onion rings $15", R.drawable.nuggets);

            default:
                return MenuItemFragment.newInstance("404: Fragment not found","404: Fragment not found", R.drawable.ic_launcher_foreground);
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
