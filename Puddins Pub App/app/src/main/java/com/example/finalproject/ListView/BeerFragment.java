package com.example.finalproject.ListView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.finalproject.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BeerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeerFragment extends Fragment {
    ListView listView;
    TextView description;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BeerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataTypeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeerFragment newInstance(String param1, String param2) {
        BeerFragment fragment = new BeerFragment();
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
        View view = inflater.inflate(R.layout.fragment_beer, container, false);
        listView = view.findViewById(R.id.beer_list);
        description = view.findViewById(R.id.beer_description);
        // creates the arraylist gor beers
        ArrayList<BeerItem> beerItemArrayList = new ArrayList<>();
        // populates the array list
        beerItemArrayList.add(new BeerItem("Michelob Ultra","Containing only 95 calories and 2.6 carbs, Michelob ULTRA is a light lager brewed with the perfect balance of Herkules hops and wholesome grains, producing a light citrus aroma and a crisp, refreshing finish."));
        beerItemArrayList.add(new BeerItem("Bud Light","The light-bodied beer features a fresh, clean and subtle hop aroma, delicate malt sweetness and a crisp finish that delivers the ultimate refreshment."));
        beerItemArrayList.add(new BeerItem("Land Shark Lager","Born in Margaritaville, this island-style lager is a complex blend of hops and two-row caramel malts with a light, refreshing taste and a hint of malty sweetness"));
        beerItemArrayList.add(new BeerItem("OV"," A mainstream lager with a moderate hop character and slightly sweet, fruity, refreshing aroma and taste"));
        beerItemArrayList.add(new BeerItem("Somersby","Somersby Apple Cider has lovely aromas and flavours of apple with a hint of grapefruit. It's light-bodied and fruity with a sweet palate and a crisp, clean finish"));
        beerItemArrayList.add(new BeerItem("Guinness","Guinness is a traditional Irish stout beer made from barley, hops, water, and a specific strain of ale yeast"));
        beerItemArrayList.add(new BeerItem("Rolling Rock","A premium extra pale lager. Using a time-honored recipe with only the finest malted barley and blend of hops, Rolling Rock is a classic American lager that is as well-known for its distinctive, full-bodied taste as it is for its craftsmanship, heritage and green bottle"));
        beerItemArrayList.add(new BeerItem("Busch","Busch is brewed, fermented and aged to create a smooth, refreshing taste at 4.7% alcohol by volume"));
        beerItemArrayList.add(new BeerItem("Shock Top","This unfiltered ale has a naturally cloudy and light golden color with a smooth, refreshing taste."));
        beerItemArrayList.add(new BeerItem("Coors Light","Brewed according to the high quality standards of Coors Brewing Company, Golden, Colorado, U.S.A. Aged slowly for that legendary ice cold, easy drinking taste that could only come from a brewing tradition born in the Rockies. 4.0% CA. Light"));
        beerItemArrayList.add(new BeerItem("Twisted Tea","Twisted Tea Original is refreshingly smooth hard iced tea made with real brewed black tea and a twist of natural lemon flavor. Non-carbonated, naturally sweetened, and 5% ABV"));
        beerItemArrayList.add(new BeerItem("Puddins Lager","Our own home crafted beer give it a try!"));



        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),
                android.R.layout.simple_list_item_1, beerItemArrayList);

        CustomListViewAdapter adapter1 = new CustomListViewAdapter(getContext(), beerItemArrayList);

        //sets the adapter
        listView.setAdapter(new CustomListViewAdapter(getContext(),
                beerItemArrayList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                description.setText(
                        ((BeerItem)listView.getItemAtPosition(position))
                .getDescription());
            }
        });

        return view;
    }
}