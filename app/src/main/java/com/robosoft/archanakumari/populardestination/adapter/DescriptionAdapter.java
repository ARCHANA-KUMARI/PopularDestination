package com.robosoft.archanakumari.populardestination.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.populardestination.R;

/**
 * Created by archanakumari on 4/1/16.
 */
public class DescriptionAdapter extends  RecyclerView.Adapter<DescriptionAdapter.LaoutHolder>
{
    private Context mContext;
    View mOneRow;

    public DescriptionAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public LaoutHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType%2==0) {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childoneofdescription, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");

        }
        else
        {
            mOneRow = LayoutInflater.from(mContext).inflate(R.layout.childtwoofdescription, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");
        }
        LaoutHolder  viewHolder = new  LaoutHolder (mOneRow);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(LaoutHolder holder, int position) {

         if(position%2==0)
         {
             holder.mTextComments.setText("RECENT COMMENTS");
             holder.mImageLeft.setImageResource(R.drawable.left);
             holder.mImageRounded.setImageResource(R.drawable.boneman);
             holder.mTextName.setText("Edward Philips");
             holder.mTextMessage.setText("View All");
             holder. mTextDescription.setText("Sunny days rockey mountain ranges. great forests - aa you need");


         }
        else
         {

              holder.mTextplaceofChildTwolayone.setText("POPULAR PLACES");
             holder. mImageNumberofChildTwolayone.setImageResource(R.drawable.one);
             holder. mImageCoeffeOfChildTwolayone.setImageResource(R.drawable.cafe);
             holder. mTextNoOfPlacesofChildTwolayone.setText("Cafe Fellini");
             holder.mTextMinuteofChildTwolayone.setText("587 visits");
             holder. mTextDescriptionofchildtwolayone.setText("1422 Fulton Street Brooklyn,NY 11123");
             holder.mImageNumberofChildTwolaytwo.setImageResource(R.drawable.two);
             holder.mImageCoeffeOfChildTwolaytwo.setImageResource(R.drawable.barof);
             holder. mTextNoOfPlacesofChildTwolaytwo.setText("Jacob club bar");
             holder.mTextMinuteofChildTwolayonetwo.setText("493 visits");
             holder. mTextDescriptionofchildtwolayonetwo.setText("57 East 55th Street New York.NY 10022");

         }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
    @Override
    public int getItemViewType(int position) {
        Log.i("Hellow","Hi i am in getItemViewType()");
        return position;
    }

    public  class LaoutHolder extends RecyclerView.ViewHolder{
        private TextView mTextComments;
        private ImageView mImageLeft;
        private ImageView mImageRounded;
        private TextView mTextName;
        private TextView mTextDescription;
        private TextView mTextMessage;
        private TextView mTextplaceofChildTwolayone;
        private  ImageView mImageNumberofChildTwolayone;
        private ImageView mImageCoeffeOfChildTwolayone;
        private TextView mTextNoOfPlacesofChildTwolayone;
        private TextView mTextMinuteofChildTwolayone;
        private TextView mTextDescriptionofchildtwolayone;
        private  ImageView mImageNumberofChildTwolaytwo;
        private ImageView mImageCoeffeOfChildTwolaytwo;
        private TextView mTextNoOfPlacesofChildTwolaytwo;
        private TextView mTextMinuteofChildTwolayonetwo;
        private TextView mTextDescriptionofchildtwolayonetwo;

        public LaoutHolder(View itemView) {
            super(itemView);
            mTextComments = (TextView) itemView.findViewById(R.id.comments);
            mImageLeft = (ImageView) itemView.findViewById(R.id.left);
            mImageRounded = (ImageView) itemView.findViewById(R.id.imag);
            mTextName = (TextView) itemView.findViewById(R.id.name);
            mTextDescription = (TextView) itemView.findViewById(R.id.description);
            mTextMessage = (TextView) itemView.findViewById(R.id.message);
            mTextplaceofChildTwolayone = (TextView) itemView.findViewById(R.id.places);
            mImageNumberofChildTwolayone = (ImageView) itemView.findViewById(R.id.number);
            mImageCoeffeOfChildTwolayone = (ImageView) itemView.findViewById(R.id.coeffeemug);
            mTextNoOfPlacesofChildTwolayone = (TextView) itemView.findViewById(R.id.nameofplace);
            mTextMinuteofChildTwolayone = (TextView) itemView.findViewById(R.id.minute);
            mTextDescriptionofchildtwolayone = (TextView) itemView.findViewById(R.id.descriptionofchildtwo);
            mImageNumberofChildTwolaytwo = (ImageView) itemView.findViewById(R.id.numberoflayouttwo);
            mImageCoeffeOfChildTwolaytwo = (ImageView) itemView.findViewById(R.id.coeffeemugoflayouttwo);
            mTextNoOfPlacesofChildTwolaytwo = (TextView) itemView.findViewById(R.id.nameofplaceoflayouttwo);
            mTextMinuteofChildTwolayonetwo = (TextView) itemView.findViewById(R.id.minuteoflayouttow);;
            mTextDescriptionofchildtwolayonetwo = (TextView) itemView.findViewById(R.id.decriptionofchildtwooflayouttow);



        }
    }
}
