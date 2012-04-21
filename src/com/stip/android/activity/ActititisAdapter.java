package com.stip.android.activity;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import barcode.android.model.Activity;




import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



public class ActititisAdapter extends BaseAdapter{
	private static SimpleDateFormat df = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	LayoutInflater inflater ;
	List<Activity> listStrings;
	public ActititisAdapter(LinkedList<Activity> list,Context context){
		this.listStrings=list;
		this.inflater=LayoutInflater.from(context);
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return listStrings.size();
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listStrings.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		
		if( convertView ==null){
			
			convertView = inflater.inflate(R.layout.activityitem, null);
		}
		
		TextView tView = (TextView)convertView.findViewById(R.id.activityname);
		TextView tView2 = (TextView)convertView.findViewById(R.id.activitylocation);
		TextView tView3 = (TextView)convertView.findViewById(R.id.activitytime);		
				tView.setText(listStrings.get(position).getId());
				tView2.setText(listStrings.get(position).getLocation().getName());
				String time = df.format(listStrings.get(position).getActDate().getTime().getTime());

				tView3.setText(time);
				
		
		return convertView;
	}

}
