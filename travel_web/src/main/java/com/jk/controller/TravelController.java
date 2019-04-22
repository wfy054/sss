package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.pojo.TravelMessage;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class TravelController {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @RequestMapping("/findTravel")
    @ResponseBody
    public Iterable findTravel() {

        //拿到elastic客户端
        Client client = elasticsearchTemplate.getClient();
        //参数为索引名称
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("travel1")
                .setTypes("travel2");
        //执行查询 拿到返回值
        SearchResponse searchResponse = searchRequestBuilder.get();

        //拿到命中条数
        SearchHits hits = searchResponse.getHits();
        //获取总条数 用来分页
        //hits.getTotalHits();
        //获取到结果集迭代器
        Iterator<SearchHit> iterator = hits.iterator();
        List<TravelMessage> orderList = new ArrayList<TravelMessage>();
        while (iterator.hasNext()){
            SearchHit next = iterator.next();
            //获取到源码内容 以json字符串的形式获取
            String sourceAsString = next.getSourceAsString();
            //获取高亮字段
            Map<String, HighlightField> highlightFields = next.getHighlightFields();
//            HighlightField orderInfo = highlightFields.get("orderInfo");
            TravelMessage order = JSON.parseObject(sourceAsString, TravelMessage.class);
           /* //使用高亮内容 替换非高亮内容
            order.setOrderInfo(orderInfo.toString());*/
            orderList.add(order);
        }
        return orderList;
    }

    @GetMapping("toIndex")
    public String toIndex(){

        return "index";
    }

}
