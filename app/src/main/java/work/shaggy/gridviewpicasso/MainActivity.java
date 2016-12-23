package work.shaggy.gridviewpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

import work.shaggy.gridviewpicasso.model.Photo;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Photo> photos = new ArrayList<>();

        photos.add(new Photo("one", "https://placeimg.com/640/480/any"));
        photos.add(new Photo("two", "https://placeimg.com/640/400/any"));
        photos.add(new Photo("three", "https://placeimg.com/620/480/any"));
        photos.add(new Photo("four", "https://placeimg.com/600/480/any"));

        GridViewAdapter gridViewAdapter = new GridViewAdapter(this, photos);

        gridView.setAdapter(gridViewAdapter);

    }
}
