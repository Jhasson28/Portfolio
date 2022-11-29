package com.example.finalproject.RecyclerView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.finalproject.R;
import com.example.finalproject.ViewPager.CustomViewPagerAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MerchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MerchFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MerchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MerchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MerchFragment newInstance(String param1, String param2) {
        MerchFragment fragment = new MerchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_merch, container, false);
        //creates the arraylist
        ArrayList<Term> items = new ArrayList<>();
        //populates the arraylist
        items.add(new Term("Puddins Pub Bucket Hat","Looking to have some fun on the beach but hate the sun? Try out our Puddins pub Bucket Hat! $16.99",R.drawable.bucket_hat_edited));
        items.add(new Term("Puddins Pub T Shirt","Rock your favourite menu item with our Puddins Pub T Shirt $20.99",R.drawable.tshirt_edited));
        items.add(new Term("Puddins Pub Mug","Enjoy your morning coffee with your favourite pub and grill in mind! $11.99",R.drawable.mug_edited));
        items.add(new Term("Puddins Pub Hoodie","Looking to bundle up for the winter? Try our Puddins Pub Hoodie feel warm and look stylish at the same time! $49.99",R.drawable.hoodie_edited));
        items.add(new Term("Puddins Pub Beer Mug","Have a Cold one with our Puddins Pub Beer Mug,  Fits up to 400ml of Liquid! $15.99", R.drawable.beer_mug_edited));
        items.add(new Term("Puddins Pub Dad Cap","Looking for a cool new hat try Puddins Pub Dad Cap $15.99",R.drawable.dad_cap_edited));


        //sets to the recyclerView
        RecyclerView recyclerView = view.findViewById(R.id.merchRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(items));

        return view;
    }
}