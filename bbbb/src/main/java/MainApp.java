import com.mb.mapper.*;
import com.mb.po.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);
    private static final Logger log22 = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws IOException {
//        TestSpring tsObj = new TestSpring();
//        tsObj.testIt();

//        //   第一个MyBatis程序
//        // 读取配置文件mybatis-config.xml
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        // 根据配置文件构建SqlSessionFactory
//        // SqlSessionFactory 对象一旦创建，就会在整个应用程序过程中始终存在。作用域是 Application，即随着应用程序的生命周期一直存在
//        // SqlSessionFactoryBuilder 存在于方法体内，也就是局部变量。创建 SqlSessionFactory 对象之后，这个类就不存在了
//        SqlSessionFactory ssfObj = new SqlSessionFactoryBuilder().build(config);
//        // 通过SqlSessionFactory创建SqlSession。
//        // SqlSession 的作用域范围是 request 作用域或方法体作用域内。每次访问数据库时都需要创建 SqlSession 对象
//        SqlSession ssObj = ssfObj.openSession();
//        // 添加网站
//        Website websiteObj = new Website();
//        websiteObj.setName("编程版本");
//        websiteObj.setUrl("https://www.biancheng.net/");
//        websiteObj.setAge(21);
//        websiteObj.setCountry("CN");
//        ssObj.insert("com.mb.mapper.WebsiteMapper.addWebsite", websiteObj);
//        // 查询网站
//        List<Website> listWeb = ssObj.selectList("com.mb.mapper.WebsiteMapper.selectAllWebsite");
//        for (Website site : listWeb) {
//            System.out.println(site);
//        }
//        // 提交事务
//        ssObj.commit();
//        // 关闭 SqlSession
//        ssObj.close();


//        // MyBatis Mapper（映射器）
//        // ① xml 实现映射器 ， 企业里比较流行，灵活方便       sql写在 xml 里
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper wsmObj = ss.getMapper(WebsiteMapper.class);
//        List<Website> websiteList = wsmObj.selectAllRecords();
//        for (Website site: websiteList) {
//            System.out.println(site);
//        }
//        ss.commit();
//        // ② 注解 实现映射器           sql 写在 接口里
//        WebsiteMapper22 wsmObj22 = ss.getMapper(WebsiteMapper22.class);
//        List<Website> websiteList22 = wsmObj22.selectAllRecords22();
//        for (Website site: websiteList22) {
//            System.out.println(site);
//        }
//        ss.commit();
//        ss.close();


        // MyBatis执行SQL的两种方式
        // ① SqlSession发送SQL        没有例子，待试验 ？？？


        // ② Mapper接口发送 SQL     主流    第一个MyBatis程序已实践过，可忽略



        // MyBatis 增删改查 三种方式
        // ① 使用 Map 传递参数
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper33_1 wsmObj = ss.getMapper(WebsiteMapper33_1.class);
        // a.insert
        // 插入1个字段
//        String name = "我是谁";
//        int counter11 = wsmObj.addWebsite(name);
//        ss.commit();
//        // 插入2个字段
//        Map<String, String> params = new HashMap<>();
//        params.put("name", "what's your name");
//        params.put("url", "www.google.com");
//        int counter22 = wsmObj.addWebsite_2(params);
//        ss.commit();
//        System.out.println("共插入了 " + (counter11 + counter22) + " 条记录");
        // b.update
//        Map<String, Object> params22 = new HashMap<>();
//        params22.put("id", 1);
//        params22.put("name", "map方式更新字段");
//        params22.put("url", "www.quora.com");
//        int counter33 = wsmObj.updateWebstieByMap(params22);
//        ss.commit();
//        System.out.println("共更新了 " + counter33 + " 条记录");
        // c.delete
//        Map<String, Object> params33 = new HashMap<>();
//        params33.put("name", "我是谁333");
//        params33.put("id", 20);
//        int counter44 = wsmObj.deleteWebsiteByMap(params33);
//        ss.commit();
//        System.out.println("通过 Map 传递参数，共删除了 " + counter44 + " 条记录");
        // d.select
//        Map<String, String> params44 = new HashMap<String, String>();
//        params44.put("name", "我是谁22");
//        params44.put("url", "www.google.com");
//        List<Website> resultList = wsmObj.selectWebsiteByMap(params44);
//        ss.commit();
//        for (Website site: resultList) {
//            System.out.println(site);
//        }

        // ② 使用注解传递参数
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper33_2 wsmObj = ss.getMapper(WebsiteMapper33_2.class);
        // a.insert
//        String name = "我是谁22";
//        String url = "www.google.com";
//        int counter11 = wsmObj.addWebsiteByParam(name, url);
//        ss.commit();
//        System.out.println("共插入了 " + counter11 + " 条记录");
        // b.update
//        String name = "注解 方式更新字段";
//        String url = "www.dnews.com";
//        Integer id = 13;
//        int counter22 = wsmObj.updateWebsiteByParam(name, url, id);
//        ss.commit();
//        System.out.println("共更新了 " + counter22 + " 条记录");
        // c.delete
//        String name = "编程版本";
//        Integer id = 10;
//        int counter33 = wsmObj.deleteWebsiteByParam(id, name);
//        ss.commit();
//        System.out.println("通过 @Param 注解传递参数，共删除了 " + counter33 + " 条记录");
        // d.select
//        String name = "我是谁";
//        String url = "www";
//        List<Website> resultList = wsmObj.selectWebsiteByParam(name, url);
//        for (Website site: resultList) {
//            System.out.println(site);
//        }

        // ③ 使用 JavaBean 传递参数
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper33_3 wsmObj = ss.getMapper(WebsiteMapper33_3.class);
        // a.insert
//        // 创建 JavaBean 对象
//        Website website = new Website();
//        website.setName("我是谁333");
//        website.setUrl("www.abc.com");
//        int counter11 = wsmObj.addWebsiteByJavaBean(website);
//        // 主键（自动递增）回填。  通过在 insert 标签中添加  keyProperty 和 useGeneratedKeys 属性，来实现该功能
//        System.out.println("提前获得插入记录的主键ID " + website.getId());
//        System.out.println("共插入了 " + counter11 + " 条记录");
//        ss.commit();
//        // 自定义主键   不实践了，只用在 oracle 里，应用场景不广泛
        // b.update
//        Website website22 = new Website();
//        website22.setName("JavaBean 方式变更");
//        website22.setUrl("www.twitter.com");
//        website22.setId(12);
//        int counter22 = wsmObj.updateWebsiteByJavaBean(website22);
//        ss.commit();
//        System.out.println("通过 JavaBean 传递参数，共更新了 " + counter22 + " 条记录");
        // c.delete
//        Website website33 = new Website();
//        website33.setName("我是谁");
//        website33.setUrl("");
//        int counter33 = wsmObj.deleteWebsiteByJavaBean(website33);
//        ss.commit();
//        System.out.println("通过 JavaBean 传递参数，共删除了 " + counter33 + " 条记录");
        // d.select
//        Website website44 = new Website();
//        website44.setName("我是谁");
//        website44.setUrl("www");
//        List<Website> resultList = wsmObj.selectWebsiteByJavaBean(website44);
//        for (Website site: resultList) {
//            System.out.println(site);
//        }


        // MyBatis关联查询 的问题？？？
        // 如果传入多个参数，那像 association, collection 的怎么处理， 属性 column 怎么解决 ？
        // ofType, javaType 都是些什么东西 ？？？

        // MyBatis一对一关联查询
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        // 单步查询
//        Student stuObj = ss.getMapper(StudentMapper.class).selectStuById11(2);
//        System.out.println(stuObj);
//        // 分步查询
//        Student stuObj22 = ss.getMapper(StudentMapper.class).selectStuById22(2);
//        System.out.println(stuObj22);

        // MyBatis一对多关联查询
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        // 单步查询
//        // 注意点：这种查询方式，有个奇葩的规则，Order 中的 id 不能和 User 中的 id 重复，
//        // 所以修改了 Order 实体类的 id 为 oId, 顺带下面的分步查询也一并改了。实际上来说，下面的分步查询是不存在这种奇葩规则的
//        User33Mapper u33Obj = ss.getMapper(User33Mapper.class);
//        User33 uoResult = u33Obj.selectUser33Order33ById22(2);
//        System.out.println(uoResult);
//        // 分步查询
//        User33Mapper u33Obj22 = ss.getMapper(User33Mapper.class);
//        User33 uoResult22 = u33Obj22.selectUser33Order33ById(2);
//        System.out.println(uoResult22);

        // MyBatis多对多关联查询
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        // 单步查询
//        Order44Mapper o44Obj = ss.getMapper(Order44Mapper.class);
//        List<Order44> opResult = o44Obj.selectAllOrder44AndProduct44ById();
//        for (Order44 o:opResult) {
//            System.out.println(o);
//        }

        // MyBatis注解（3种类型）
        // 1、SQL 语句映射
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper22 wsmObj22 = ss.getMapper(WebsiteMapper22.class);
        // 增
//        Website wsObj55 = new Website();
//        wsObj55.setName("jack");
//        wsObj55.setUrl("www.test.com");
//        wsObj55.setAge(19);
//        wsObj55.setCountry("pp");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        try {
//            Date dt = sdf.parse("2021-05-19 11:22:33");
//            wsObj55.setCreatetime(dt);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Integer resIns = wsmObj22.insert(wsObj55);
//        ss.commit();
//        System.out.println(resIns);
        // 增 - 新增后，获取插入记录的自增ID
        // 注意，下面初始化值时，我并没有给 id 赋值，但是并无大碍
//        Website wsObj55_2 = new Website();
//        wsObj55_2.setName("jack22");
//        wsObj55_2.setUrl("www.xxxxx.com");
//        Integer resIns_2 = wsmObj22.insert_2(wsObj55_2);
//        ss.commit();
//        System.out.println("插入一条数据后，获取到的自增 id 的值为：" + wsObj55_2.getId());
//        System.out.println("新插入了 " + resIns_2 + " 条");
        // 查
//        List<Website> wsSel = wsmObj22.selectOne("jack", "ppp");
//        for (Website site:wsSel) {
//            System.out.println(site);
//        }
        // 更新
//        Website wsObj66 = new Website();
//        wsObj66.setId(27);
//        wsObj66.setName("update new name");
//        wsObj66.setUrl("www.ggg.com");
//        Integer resUpd = wsmObj22.updateWebsiteById(wsObj66);
//        ss.commit();
//        System.out.println("新更新了 " + resUpd + " 条");
        // 删除
//        Integer resDel = wsmObj22.deleteById(19);
//        ss.commit();
//        System.out.println("删除了" + resDel + "条");

        // 2、结果集映射
        // @Result、@Results、@ResultMap 是结果集映射的三大注解
//        List<Website> wsSel = wsmObj22.selectAll();
//        for (Website site:wsSel) {
//            System.out.println(site);
//        }
//        System.out.println("===========");
//        List<Website> wsSel22 = wsmObj22.selectAll22();
//        for (Website site:wsSel22) {
//            System.out.println(site);
//        }

//        // 3、关系映射
//        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
//        SqlSession ss = ssf.openSession();
//        WebsiteMapper22 wsmObj22 = ss.getMapper(WebsiteMapper22.class);
//        // @one：用于一对一关系映射
//        List<Website> wsList = wsmObj22.getOneOfWebsiteAndDomain(12);
//        for (Website site: wsList) {
//            System.out.println(site);
//        }
//        // @many：用于一对多关系映射
//        List<Website> wsList22 = wsmObj22.getManyPagesAndOneWebsite(1);
//        for (Website site: wsList22) {
//            System.out.println(site);
//        }

        // MyBatis动态SQL
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        SqlSession ss = ssf.openSession();
        WebsiteMapper wsmObj = ss.getMapper(WebsiteMapper.class);
        // if标签：条件判断
        System.out.println("==== if标签：条件判断 ====");
//        String name = "jack";
//        String url = null;
        String name = null;
        String url = "www.test.com";
        List<Website> wsList = wsmObj.selectRecordsByCondition(name, url);
        for (Website site : wsList) {
            System.out.println(site);
        }
        // choose、when和otherwise标签
        //   类似于  if ... elseif ... else 的效果
        System.out.println("==== choose、when和otherwise标签 ====");
        String name22 = "jack";
        String url22 = "www.test.com";
        List<Website> wsList22 = wsmObj.selectRecordsByCondition22(name22, url22);
        for (Website site : wsList22) {
            System.out.println(site);
        }
        // where标签
        //   where 标签主要用来简化 SQL 语句中的条件判断，可以自动处理 AND/OR 条件
        System.out.println("==== where标签 ====");
        String name33 = "jack";
        String url33 = "www.test.com";
        List<Website> wsList33 = wsmObj.selectRecordsByCondition33(name33, url33);
        for (Website site : wsList33) {
            System.out.println(site);
        }
        // trim标签
        //   trim 属性如下：
        //      prefix	            给SQL语句拼接的前缀，为 trim 包含的内容加上前缀
        //      suffix	            给SQL语句拼接的后缀，为 trim 包含的内容加上后缀
        //      prefixOverrides	    去除 SQL 语句前面的关键字或字符，该关键字或者字符由 prefixOverrides 属性指定。
        //      suffixOverrides	    去除 SQL 语句后面的关键字或者字符，该关键字或者字符由 suffixOverrides 属性指定。
        System.out.println("==== trim标签 ====");
        String name44 = "jack";
        String url44 = "www.test.com";
        List<Website> wsList44 = wsmObj.selectRecordsByCondition44(name44, url44);
        for (Website site : wsList44) {
            System.out.println(site);
        }
        // set标签
        System.out.println("==== set标签 ====");
        Website wsObj = new Website();
        wsObj.setId(18);
        wsObj.setName("xixixi");
        wsObj.setUrl("www.google222.com");
        Integer updRes = wsmObj.updateWebsiteById(wsObj);
        ss.commit();
        System.out.println(updRes);
        // foreach标签
        System.out.println("==== foreach标签 ====");
        List<Integer> ageList = new ArrayList<>();
        ageList.add(20);
        ageList.add(21);
        List<Website> wsList55 = wsmObj.selectRecordsByCondition55(ageList);
        for (Website site : wsList55) {
            System.out.println(site);
        }
        // bind标签
        System.out.println("==== bind标签 ====");
        String name66 = "ja";
        String url66 = "www.";
        List<Website> wsList66 = wsmObj.selectRecordsByCondition66(name66, url66);
        for (Website site : wsList66) {
            System.out.println(site);
        }
        // 分页功能
        //    http://c.biancheng.net/mybatis/paging.html   xml 里传入对象失败了，#{site.name} 在 xml 里是 null ？？？？
        System.out.println("==== 分页功能 ====");
        Website wsObj77 = new Website();
        String name77 = "j";
        String url77 = "www.";
        List<Website> wsList77 = wsmObj.selectRecordsByCondition77(name77, url77, 0, 2);
        for (Website site : wsList77) {
            System.out.println(site);
        }

        // MyBatis缓存（一级缓存和二级缓存）
        // 对于 MyBatis 缓存仅作了解即可，因为面对一定规模的数据量，内置的 Cache 方式就派不上用场了，
        // 并且对查询结果集做缓存并不是 MyBatis 所擅长的，它专心做的应该是 SQL 映射。
        // 对于缓存，采用 OSCache、Memcached 等专门的缓存服务器来做更为合理

        // 逆向工程  不实践了，有点复杂，另一方面，mybatis-plus 简化了 mybatis，那么这个脚手架应该会比较简单

    }


}

// Mybatis-Plus（简称 MP）是 Mybatis 的增强工具，在 Mybatis 的基础上只做增强不做改变，支持 Mybatis 所有原生的特性，为简化开发、提高效率而生。
// MyBatis 是一个半自动化的持久层框架，Hibernate 是一个强大、复杂、全自动化的持久层框架。
// Hibernate 和 MyBatis 都是目前业界中主流的对象关系映射（ORM）框架

// MyBatis 官网 http://mybatis.org/
// github 地址：https://github.com/mybatis/mybatis-3/releases

// 创建 MyBatis 的步骤如下
// ① 利用 maven 在 pom.xml 里配置 mybatis，下载 mybatis 包
// ② 创建实体类：          com/mb/po/Website.java
// ③ 创建 sql 映射文件：   com/mb/mapper/WebsiteMapper.xml
// ④ 创建配置文件：        src/main/resources/mybatis-config.xml
// ⑤ 编写crud脚本去调用：   src/main/java/MainApp.java


// MyBatis配置文件（mybatis-config.xml）
//    <settings>
//        <setting name="cacheEnabled" value="true"/>               // 常用配置项
//        <setting name="lazyLoadingEnabled" value="true"/>         // 常用配置项
//        <setting name="multipleResultSetsEnabled" value="true"/>
//        <setting name="useColumnLabel" value="true"/>
//        <setting name="useGeneratedKeys" value="false"/>
//        <setting name="autoMappingBehavior" value="PARTIAL"/>     // 常用配置项
//        <setting name="autoMappingUnknownColumnBehavior" value="WARNING"/>
//        <setting name="defaultExecutorType" value="SIMPLE"/>      // 常用配置项
//        <setting name="defaultStatementTimeout" value="25"/>
//        <setting name="defaultFetchSize" value="100"/>
//        <setting name="safeRowBoundsEnabled" value="false"/>
//        <setting name="mapUnderscoreToCamelCase" value="false"/>  // 常用配置项
//        <setting name="localCacheScope" value="SESSION"/>
//        <setting name="jdbcTypeForNull" value="OTHER"/>
//        <setting name="lazyLoadTriggerMethods" value="equals,clone,hashCode,toString"/>
//    </settings>


// MyBatis Mapper（映射器）


//======= 其它 ======
/*

        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1=format.format(date);//将时间转换成字符串
        System.out.println(time1);

        String time2="1996-09-18 07:18:09";
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2=format2.parse(time2);//将字符串转换成时间
        System.out.println(date2);

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=df.parse("2016--1-01");
            //指定日期/时间解析是否不严格，默认是不严格(true)
            df.setLenient(false);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
 */

/*
创建外键的原则：哪张表里的字段想要关联另一张表，那么这张表就要设置外键，
比如 A表有个字段 xxx，这个字段是跟 B 表的某个字段相关联的，那么 A表的 xxx 就要设置外键
 */

