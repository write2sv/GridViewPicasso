package work.shaggy.gridviewpicasso;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import work.shaggy.gridviewpicasso.model.Photo;

/**
 * Created by shaggy on 12/23/16.
 */

public class GridViewAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    public List<Photo> data ;
    Picasso picasso;

    public GridViewAdapter(Context context, List<Photo> arraylist) {
        this.context = context;
        data = arraylist;
        //imageLoader = new ImageLoader(context);

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.listener(new Picasso.Listener()
        {
            @Override
            public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception)
            {
                exception.printStackTrace();
            }
        });
        picasso = builder.build();

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //TODO Don't do this use recyclerView. I am just trying to be quick here.
        View itemView = inflater.inflate(R.layout.girdview_item, parent, false);

        // Get the position
        Photo photo = data.get(position);

        TextView phototitle = (TextView) itemView.findViewById(R.id.phototitle);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView1);

        phototitle.setText(photo.getTitle());
        String url = photo.getUrl();




        picasso.load(url).into(imageView);

        return itemView;
    }
}