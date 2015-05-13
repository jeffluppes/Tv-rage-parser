package com.example.myapplication.Parsers;

import android.os.AsyncTask;
import org.springframework.http.converter.xml.SimpleXmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import com.example.myapplication.Entities.Show;
import com.example.myapplication.Parsers.Handlers.ShowHandler;

/**
 * Created by Jeff on 27-4-2015. Gebruikt AsyncTask voor asynchroon binnenhalen
 * Zie ook:
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/extensible-xml.html
 */
public class ShowParser extends AsyncTask<String, Void, Show> {

    private ShowHandler handler;

    public ShowParser() {
        super();
    }

    public ShowParser(ShowHandler handler) {
        super();
        this.handler = handler;
    }

    public ShowHandler getHandler() {
        return handler;
    }

    public void setHandler(ShowHandler handler) {
        this.handler = handler;
    }

    @Override
    protected Show doInBackground(String[] showIds) {
        final String url = "http://services.tvrage.com/feeds/full_show_info.php?sid="+showIds[0];
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
        Show show = restTemplate.getForObject(url, Show.class);
        return show;
    }

    protected void onPostExecute(Show result) {
        if(handler != null) {
            handler.handleShow(result);
        }

    }
}