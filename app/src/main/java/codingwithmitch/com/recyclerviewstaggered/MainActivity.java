package codingwithmitch.com.recyclerviewstaggered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://live.staticflickr.com/5172/5588953445_04145e42f2_c.jpg");
        mNames.add("Android");

        mImageUrls.add("https://live.staticflickr.com/48/132225679_c0304347c9_n.jpg");
        mNames.add("Java");

        mImageUrls.add("https://live.staticflickr.com/4491/37511800220_c0728d9465_c.jpg");
        mNames.add("Kotlin");

        mImageUrls.add("https:////live.staticflickr.com/7349/9534194705_be75949919_k.jpg");
        mNames.add("HTML");

        mImageUrls.add("https://i.pinimg.com/564x/c2/92/ee/c292eefb0d695b83e9fe34fcdcf0c00f.jpg");
        mNames.add("Marvel - El Venom");

        mImageUrls.add("https://yt3.ggpht.com/a/AGF-l78CuGJILYcDHKNjtXlQwC2Gu1-QilTOysKYgg=s288-c-k-c0xffffffff-no-rj-mo");
        mNames.add("Profe Apruebenos");

        mImageUrls.add("https:////live.staticflickr.com/53/110995239_6530296ae4_b.jpg");
        mNames.add("CSS");


        mImageUrls.add("https://live.staticflickr.com/6170/6248724400_5278bf3979_n.jpg");
        mNames.add("Linux");

        mImageUrls.add("https://i.pinimg.com/564x/a2/9d/4d/a29d4d786f3892c641986c35b36b6a53.jpg");
        mNames.add("Robotica");

        initRecyclerView();

    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview.");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter =
                new StaggeredRecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);

    }
}















