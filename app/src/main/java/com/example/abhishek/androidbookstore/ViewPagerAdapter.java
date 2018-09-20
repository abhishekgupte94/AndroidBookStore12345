package com.example.abhishek.androidbookstore;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static java.lang.System.exit;

public class ViewPagerAdapter extends PagerAdapter {
 private Context context;
 private LayoutInflater layoutInflater;
 public Integer [] images = {R.drawable.harrypotter1,R.drawable.harrypotter2,R.drawable.harrypotter3,
 R.drawable.harrypotter4,R.drawable.harrypotter5,R.drawable.harrypotter6,R.drawable.harrypotter7};

     public ViewPagerAdapter(Context context){

         this.context = context;
     }

    @Override
    public int getCount(){
       return images.length;

    }
    @Override
    public boolean isViewFromObject(View view, Object object){
         return view==object;

    }
    @Override
    public Object instantiateItem(ViewGroup container, final int position){

         layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View view = layoutInflater.inflate(R.layout.custom_layout,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        ViewPager vp = (ViewPager)container;
        vp.addView(view,0);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Displayer1.class);
                intent.putExtra("MY_IMAGE", images[position]);
                context.startActivity(intent);

            }
        });

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
         ViewPager vp = (ViewPager)container;
         View view = (View)object;
         vp.removeView(view);
    }
}
