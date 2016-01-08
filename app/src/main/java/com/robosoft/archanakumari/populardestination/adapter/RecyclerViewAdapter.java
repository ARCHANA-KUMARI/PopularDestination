package com.robosoft.archanakumari.populardestination.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.populardestination.DisplayDescription;
import com.robosoft.archanakumari.populardestination.R;

/**
 * Created by archanakumari on 3/1/16.
 */
public class RecyclerViewAdapter  extends  RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private Context mContext;
    private View mOneRow;
    private int mListOfBackImages[] = {R.drawable.sanfancisko,R.drawable.newyork,R.drawable.barcelona,R.drawable.stavanger,R.drawable.images};
    private String mFevoriteText[] = {"7.5k","5.2k","3.5 K","3.1 k","56.9 k"};
    private String mName[] = {"SAN FRARNCISCO"," NEW YORK","BARCELONA","STAVANGER","INDIA"};
    private String mNoOfVisitors[] = {"4775 VISITORS","3333 VISITORS","5775 VISITORS","6000 VISITORS","9900 VISITORS"};
    private static int sCount = 0;

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mOneRow = LayoutInflater.from(mContext).inflate(R.layout.child, parent, false);
        Log.i("HEllo", "I am in onCreateViewHOlder");
        ViewHolder viewHolder = new ViewHolder(mOneRow);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

      holder.mImageBackground.setImageResource(mListOfBackImages[sCount]);
      holder.mImageFevorite.setImageResource(R.drawable.ic_favorite_white_18dp);
      holder.mTextFevorite.setText(mFevoriteText[sCount]);
      holder.mTextname.setText(mName[sCount]);
      holder.mTextVisitors.setText(mNoOfVisitors[sCount]);
        sCount++;


    }

    @Override
    public int getItemCount() {
        return 5;
    }
    @Override
    public int getItemViewType(int position) {
        Log.i("Hellow","Hi i am in getItemViewType()");
        return position;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageBackground;
        private ImageView mImageFevorite;
        private TextView mTextFevorite;
        private TextView mTextname;
        private TextView mTextVisitors;

        public ViewHolder(View itemView) {
            super(itemView);
            mImageBackground = (ImageView) itemView.findViewById(R.id.back);
            mImageFevorite = (ImageView) itemView.findViewById(R.id.fevorite);
            mTextFevorite = (TextView) itemView.findViewById(R.id.textfevorite);
            mTextname = (TextView) itemView.findViewById(R.id.name);
            mTextVisitors = (TextView) itemView.findViewById(R.id.visitor);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, DisplayDescription.class);
                    mContext.startActivity(intent);

                }
            });

        }
    }
}
