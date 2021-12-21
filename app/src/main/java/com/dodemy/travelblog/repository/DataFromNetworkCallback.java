package com.dodemy.travelblog.repository;


import com.dodemy.travelblog.http.Blog;

import java.util.List;

public interface DataFromNetworkCallback {
    void onSuccess(List<Blog> blogList);

    void onError();
}
