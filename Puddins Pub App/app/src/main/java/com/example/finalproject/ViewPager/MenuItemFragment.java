package com.example.finalproject.ViewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalproject.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuItemFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "Name";
    private static final String ARG_PARAM2 = "Desc";
    private static final String ARG_PARAM3 = "Image";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    public MenuItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuItemFragment newInstance(String param1, String param2, int param3) {
        MenuItemFragment fragment = new MenuItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getInt(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_item, container, false);
        if (mParam1 != null && mParam2 != null) {
            //gets the food name and sets it to its param
            TextView foodName = view.findViewById(R.id.food_name);
            foodName.setText(mParam1);
            TextView foodDesc = view.findViewById(R.id.food_desc);
            foodDesc.setText(mParam2);
            ImageView foodImage = view.findViewById(R.id.food_image);
            foodImage.setImageResource(mParam3);
        }
        return view;
    }
}