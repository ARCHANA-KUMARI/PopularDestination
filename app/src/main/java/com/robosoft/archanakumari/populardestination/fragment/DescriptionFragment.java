package com.robosoft.archanakumari.populardestination.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robosoft.archanakumari.populardestination.R;
import com.robosoft.archanakumari.populardestination.adapter.DescriptionAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {

    View mOneRow;
    private Context mContext;
    private DescriptionAdapter mDescriptionAdapter;
    private  RecyclerView mRecyclerview;

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContext = container.getContext();
        // Inflate the layout for this fragment
        mOneRow=   inflater.inflate(R.layout.fragment_description, container, false);
        mRecyclerview = (RecyclerView) mOneRow.findViewById(R.id.recyclerView);
        return mOneRow;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Helllo ", "Hi i am in onActivity Created");
        mDescriptionAdapter = new DescriptionAdapter(mContext);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerview.setLayoutManager(linearLayoutManager);
        mRecyclerview.setAdapter(mDescriptionAdapter);
    }
}
