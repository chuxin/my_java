package com.mb.mapper;

import com.mb.po.Website;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WebsiteMapper33_3 {
    public int addWebsiteByJavaBean(Website website);

    public int updateWebsiteByJavaBean(Website website);

    public int deleteWebsiteByJavaBean(Website website);

    public List<Website> selectWebsiteByJavaBean(Website website);
}
