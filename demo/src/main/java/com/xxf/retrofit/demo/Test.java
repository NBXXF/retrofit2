package com.xxf.retrofit.demo;

import java.util.concurrent.TimeUnit;

import retrofit2.CacheType;
import retrofit2.http.Cache;

public interface Test {
    void cc(@Cache(time = 1, timeUnit = TimeUnit.DAYS) CacheType cacheType);
}
