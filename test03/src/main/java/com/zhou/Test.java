package com.zhou;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception{
        String url = "http://localhost:8080/solr/hotel";
        HttpSolrServer httpSolrServer = new HttpSolrServer(url);
        httpSolrServer.setParser(new XMLResponseParser());
        httpSolrServer.setConnectionTimeout(50000);

        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        solrQuery.addFilterQuery("address:北京的景色真美");
        solrQuery.setStart(0);
        solrQuery.setRows(100);

        QueryResponse query = httpSolrServer.query(solrQuery);
        List<Hotel> hotels = query.getBeans(Hotel.class);
        for(Hotel hotel : hotels){
            System.out.println(hotel.getId()+"\t"+hotel.getAddress()+"\t"+hotel.getHotelName());
        }

    }
}
