package com.example.myapplication.Parsers;

import android.os.AsyncTask;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.example.myapplication.Entities.Results;
import com.example.myapplication.Entities.ShowList;
import com.example.myapplication.Parsers.Handlers.ListHandler;

/**
 * Created by Jeff on 11-5-2015.
 */
    public class ShowListParser extends AsyncTask<String, Void, Results> {

        private ListHandler handler;

        public ShowListParser() {
            super();
        }

        public ShowListParser(ListHandler handler) {
            super();
            this.handler = handler;
        }

        public ListHandler getHandler() {
            return handler;
        }

        public void setHandler(ListHandler handler) {
            this.handler = handler;
        }

        @Override
        protected Results doInBackground(String... searches) {
            final String url = "http://services.tvrage.com/feeds/search.php?show=breakingbad";

            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
            Results showList = restTemplate.getForObject(url, Results.class);
            return showList;
        }

        protected void onPostExecute(Results list) {
            if(handler != null) {
                handler.handleList(list);
            }

        }





















}
