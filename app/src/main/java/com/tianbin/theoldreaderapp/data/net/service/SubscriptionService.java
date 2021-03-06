package com.tianbin.theoldreaderapp.data.net.service;

import com.tianbin.theoldreaderapp.data.module.BlogList;
import com.tianbin.theoldreaderapp.data.module.SubscriptionList;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * subscription service
 * Created by tianbin on 16/11/3.
 */
public interface SubscriptionService {

    @GET("/reader/api/0/subscription/list")
    Observable<SubscriptionList> getSubscriptionList();

    @GET("/reader/api/0/stream/contents")
    Observable<BlogList> getBlogList(@Query("c") long continuation);
}
