package com.example.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;

import com.example.myapplication.R;

public class ShowListActivity extends FragmentActivity
        implements ShowListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        ShowListFragment fragment = ((ShowListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.show_list));
        if (findViewById(R.id.show_detail_container) != null) {
            fragment.setActivateOnItemClick(true);

        }

        SearchView searchView = (SearchView) findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(fragment);

        //image loader config
       // ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
       // ImageLoader.getInstance().init(config);
    }

    @Override
    public void onItemSelected(String id) {
            Intent detailIntent = new Intent(this, ShowDetailActivity.class);
            detailIntent.putExtra(ShowDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
