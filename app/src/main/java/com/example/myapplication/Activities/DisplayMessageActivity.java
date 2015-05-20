package com.example.myapplication.Activities;

import com.example.myapplication.Entities.Results;
import com.example.myapplication.Entities.Show;
import com.example.myapplication.Entities.ShowList;
import com.example.myapplication.Parsers.Handlers.ListHandler;
import com.example.myapplication.Parsers.ShowListParser;
import com.example.myapplication.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class DisplayMessageActivity extends ListActivity implements LoaderManager.LoaderCallbacks<Cursor>, ListHandler {

    // This is the Adapter being used to display the list's data
    SimpleCursorAdapter mAdapter;

    // These are the Contacts rows that we will retrieve
    static final String[] PROJECTION = new String[]{};

    // This is the select criteria
    static final String SELECTION = "(())";

    String query;

    ShowListParser listParser;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        ListView listview = (ListView) findViewById(android.R.id.list);

        //request the list
        listParser = new ShowListParser(this);
        this.query = getIntent().getStringExtra("query");
        listParser.execute(query);

        // create the grid item mapping
        String[] from = new String[] {};
        int[] to = new int[] { };

        SimpleAdapter adapter = new SimpleAdapter(this, new ArrayList<HashMap<String, String>>(), R.layout.fragment_display_message_item, from, to);

        listview.setAdapter(adapter);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        // Now create and return a CursorLoader that will take care of
        // creating a Cursor for the data being displayed.
        return new CursorLoader(this, Uri.EMPTY,
                PROJECTION, SELECTION, null, null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        // Swap the new cursor in.  (The framework will take care of closing the
        // old cursor once we return.)
        mAdapter.swapCursor(cursor);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        // This is called when the last Cursor provided to onLoadFinished()
        // above is about to be closed.  We need to make sure we are no
        // longer using it.
        mAdapter.swapCursor(null);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
    }

    @Override
    public void handleList(Results showList) {
        for (Show show : showList.getShows()) {
            Toast.makeText(this, show.getShowid(), Toast.LENGTH_SHORT);
        }
    }
}