package lict.willow.relativelayoutexample.adapter;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import lict.willow.relativelayoutexample.MainActivity;
import lict.willow.relativelayoutexample.R;
import lict.willow.relativelayoutexample.model.Student;


public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Student> arrayList;

    public CustomAdapter(Context context, ArrayList<Student> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View list_item = inflater.inflate(R.layout.list_item, null);

        TextView tVName = list_item.findViewById(R.id.textViewName);
        TextView tVCgpa = list_item.findViewById(R.id.textViewCGPA);
        ImageView callIcon = list_item.findViewById(R.id.imageViewCall);

        tVName.setText(arrayList.get(position).getName());
        tVCgpa.setText(arrayList.get(position).getCgpa()+"");

        callIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                dialog.setTitle("Call?").setMessage("Do you want to make a call?").setCancelable(false);
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String phoneNo = arrayList.get(position).getPhoneNo();
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:"+phoneNo));
                        context.startActivity(callIntent);
                    }
                });

                dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                dialog.show();

            }
        });

        return list_item;
    }
}
