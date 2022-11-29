package com.example.finalproject.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.finalproject.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BurgerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BurgerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    FragmentManager fm;

    public BurgerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BurgerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BurgerFragment newInstance(String param1, String param2) {
        BurgerFragment fragment = new BurgerFragment();
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
        View view = inflater.inflate(R.layout.fragment_burger, container, false);
        // gets the submit button
        Button submitButton = view.findViewById(R.id.submit_button);
        // gets the input and textviews
        TextInputEditText bun = view.findViewById(R.id.bun_input);
        TextView bunChosen = view.findViewById(R.id.bunChoice);
        TextInputEditText burgerType = view.findViewById(R.id.burgerTypeInput);
        TextView burgerTypeChosen = view.findViewById(R.id.burger_type_choice);
        TextInputEditText cheese = view.findViewById(R.id.cheeseTypeInput);
        TextView cheeseChosen = view.findViewById(R.id.cheese_type_choice);
        // gets the checkboxes
        CheckBox relish = view.findViewById(R.id.relishBox);
        CheckBox ketchup = view.findViewById(R.id.ketchupBox);
        CheckBox mustard = view.findViewById(R.id.mustardBox);
        CheckBox mayo = view.findViewById(R.id.mayoBox);
        CheckBox lettuce = view.findViewById(R.id.lettuceBox);
        CheckBox tomato = view.findViewById(R.id.tomatoBox);
        CheckBox onion = view.findViewById(R.id.onionBox);
        CheckBox mushrooms = view.findViewById(R.id.mushroomBox);
        CheckBox jalapenos = view.findViewById(R.id.jalapenoBox);
        CheckBox egg = view.findViewById(R.id.eggBox);
        CheckBox fries = view.findViewById(R.id.friesBox);
        CheckBox rings = view.findViewById(R.id.ringsBox);


        // when submit button is clicked
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gets the text entered into the bunChoice
                String bunChoice = bun.getText().toString();

                // if it equals anything from the menu sets the text under to whatever was entered else sets it to unknown bun type
                if (bunChoice.equals("Pretzel") || bunChoice.equals("Brioche") || bunChoice.equals("Sesame Seed") || bunChoice.equals("Plain")) {
                    bunChosen.setText(bunChoice);
                } else {
                    bunChosen.setText("Unknown Bun Type");
                }

                // gets burger type choice
                String burgerTypeChoice = burgerType.getText().toString();

                // if it equals anything from the menu sets the text under to whatever was entered else sets it to unknown burger type
                switch (burgerTypeChoice) {
                    case "Beef":
                        break;
                    case "Fish":
                        burgerTypeChosen.setText(burgerTypeChoice);
                        break;
                    case "Chicken":
                        burgerTypeChosen.setText(burgerTypeChoice);
                        break;
                    case "Turkey":
                        burgerTypeChosen.setText(burgerTypeChoice);
                        break;
                    case "Veggie":
                        burgerTypeChosen.setText(burgerTypeChoice);
                        break;

                    default:
                        burgerTypeChosen.setText("Unknown Burger Type");


                }
                //gets cheese choice
                String cheeseChoice = cheese.getText().toString();

                // if it equals anything from the menu sets the text under to whatever was entered else sets it to unknown cheese type
                switch (cheeseChoice) {
                    case "American":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "Swiss":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "Cheddar":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "Montery Jack":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "Pepper Jack":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "Provolone":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    case "None":
                        cheeseChosen.setText(cheeseChoice);
                        break;
                    default:
                        String unknownC = "Unknown Cheese Type";
                        cheeseChosen.setText(unknownC);
                }
                //if any of the texts equal Unknown _____ Order placed will not pop up
                if (bunChosen.getText().equals("Unknown Bun Type") || cheeseChosen.getText().equals("Unknown Cheese Type") || burgerTypeChosen.getText().equals("Unknown Burger Type")){
                    return;
                }else{
                    fm = getActivity().getSupportFragmentManager();
                    fm.beginTransaction()
                            .replace(R.id.content, new OrderFragment())
                            .addToBackStack(null)
                            .commit();
                    bun.setVisibility(View.INVISIBLE);
                    burgerType.setVisibility(View.INVISIBLE);
                    cheese.setVisibility(View.INVISIBLE);
                    relish.setVisibility(View.INVISIBLE);
                    ketchup.setVisibility(View.INVISIBLE);
                    mustard.setVisibility(View.INVISIBLE);
                    mayo.setVisibility(View.INVISIBLE);
                    lettuce.setVisibility(View.INVISIBLE);
                    tomato.setVisibility(View.INVISIBLE);
                    onion.setVisibility(View.INVISIBLE);
                    mushrooms.setVisibility(View.INVISIBLE);
                    jalapenos.setVisibility(View.INVISIBLE);
                    egg.setVisibility(View.INVISIBLE);
                    fries.setVisibility(View.INVISIBLE);
                    rings.setVisibility(View.INVISIBLE);
                }


            }


        });


        return view;
    }
}