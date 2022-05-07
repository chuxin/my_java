package com.mb.mapper;

import com.mb.po.Website;

import java.util.List;
import java.util.Map;

public interface WebsiteMapper33_1 {
    public int addWebsite(String name);

    public int addWebsite_2(Map<String, String> params);

    public int updateWebstieByMap(Map<String, Object> params);

    public int deleteWebsiteByMap(Map<String, Object> params);

    public List<Website> selectWebsiteByMap(Map<String, String> params);
}
