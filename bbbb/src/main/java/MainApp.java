import com.demo.ccc.*;
import com.demo.ccc.MyWorld;
import com.demo.config.AopDaoConfig;
import com.demo.controller.UserController;
import com.demo.dao.AopDao;
import com.demo.dao.OrderDao;
import com.demo.entity.MyUser;
import com.demo.entity.Order22;
import com.demo.service.MyUserService;
import com.demo.service.Order22Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
        System.out.println("---创建一个测试Bean---");
        // 方法一，没成功
//        ApplicationContext context = new FileSystemXmlApplicationContext("/Applications/XAMPP/xamppfiles/htdocs/my_practice22/my_java/aaaa/src/Test.xml");
        // 方法二
        ApplicationContext context = new ClassPathXmlApplicationContext("Test.xml");

        // 方法一
//        HelloWorld obj = (HelloWorld) context.getBean("helloworld22");
        // 方法二
        HelloWorld obj = context.getBean("helloworld22", HelloWorld.class);
        obj.getMessage();

        // 构造函数注入
        System.out.println("---构造函数注入【System.out.println】---");
        LOGGER.info("---构造函数注入【LOGGER.info】---");
        Student stuObj = context.getBean("Student", Student.class);
        LOGGER.info(stuObj.toString());

        // setter 注入
        System.out.println("---setter 注入【System.out.println】---");      // 注意这里的sout信息 比 上面LOGGER.info先输出
        LOGGER.info("---setter 注入【LOGGER.info】---");
        Parent22 parent22Obj = context.getBean("Parent22", Parent22.class);
        LOGGER.info(parent22Obj.toString());
        Child22 child22Obj = context.getBean("Child22", Child22.class);
        LOGGER.info(child22Obj.toString());

        // 短命名空间注入
        System.out.println("---短命名空间注入【System.out.println】---");      // 注意这里的sout信息 比 上面LOGGER.info先输出
        LOGGER.info("---短命名空间注入【LOGGER.info】---");
        // p 命名空间注入
        Employee33 emp33Obj = context.getBean("employee33", Employee33.class);
        LOGGER.info(emp33Obj.toString());
        // c 命名空间注入
        Employee44 emp44Obj = context.getBean("employee44", Employee44.class);
        LOGGER.info(emp44Obj.toString());

        // Spring注入内部Bean
        LOGGER.info("--- Spring注入内部Bean ---");
        //   setter 方式注入内部 Bean
        Employee55 emp55Obj = context.getBean("employee55", Employee55.class);
        LOGGER.info(emp55Obj.toString());
        //   构造函数方式注入内部 Bean
        Employee66 emp66Obj = context.getBean("employee66", Employee66.class);
        LOGGER.info(emp66Obj.toString());

        // Spring注入集合
        //   <list>	用于注入 list 类型的值，允许重复
        //   <set>	用于注入 set 类型的值，不允许重复
        //   <map>	用于注入 key-value 的集合，其中 key 和 value 都可以是任意类型
        //   <props>	用于注入 key-value 的集合，其中 key  和 value 都是字符串类型
        //   在集合中设置对象类型的值
        LOGGER.info("--- Spring注入集合 ---");
        JavaCollection jcObj = context.getBean("javaCollection", JavaCollection.class);
        LOGGER.info(jcObj.toString());
        // Spring注入其他类型的属性
        ExampleBean ebObj = context.getBean("exampleBean", ExampleBean.class);
        LOGGER.info(ebObj.toString());

        // Spring Bean作用域
        LOGGER.info("--- Spring Bean作用域 ---");
        //   singleton
        PatternBean sb11 = context.getBean("singletonBean", PatternBean.class);
        PatternBean sb22 = context.getBean("singletonBean", PatternBean.class);
        LOGGER.info(sb11);   // 实例地址完全相同
        LOGGER.info(sb22);   // 实例地址完全相同
        //   prototype
        PatternBean pb11 = context.getBean("prototypeBean", PatternBean.class);
        PatternBean pb22 = context.getBean("prototypeBean", PatternBean.class);
        LOGGER.info(pb11);   // 实例地址不相同
        LOGGER.info(pb22);   // 实例地址不相同

        // Spring Bean生命周期
        LOGGER.info("");
        LOGGER.info("--- Spring Bean生命周期 ---");
        // ① 通过接口实现
        // 获取 ClassPathXmlApplicationContext 容器
        ClassPathXmlApplicationContext context_1 = new ClassPathXmlApplicationContext("Test.xml");
        LifeCycleBean lcbObj = context_1.getBean("lifeCycleBean", LifeCycleBean.class);
        LOGGER.info(lcbObj);
        context_1.close();
        // ② 通过 XML 配置实现
        ClassPathXmlApplicationContext context_2 = new ClassPathXmlApplicationContext("Test.xml");
        LifeCycleBean22 lcbObj22 = context_2.getBean("lifeCycleBean22", LifeCycleBean22.class);
        LOGGER.info(lcbObj22);
        context_2.close();
        // ③ 使用注解实现
        ClassPathXmlApplicationContext context_3 = new ClassPathXmlApplicationContext("Test2.xml");
        LifeCycleBean33 lcbObj33 = context_3.getBean("lifeCycleBean33", LifeCycleBean33.class);
        LOGGER.info(lcbObj33);
        context_3.close();

        // Spring后置处理器（BeanPostProcessor）
        AbstractApplicationContext context_4 = new ClassPathXmlApplicationContext("Test.xml");
        MyWorld hwObj = (MyWorld) context_4.getBean("myWorld");
        hwObj.getMessage();
        context_4.registerShutdownHook();

        // Spring Bean继承
        AnimalDog adObj = context.getBean("animalDog", AnimalDog.class);
        System.out.println(adObj);
        // Bean 定义模板
        ClassPathXmlApplicationContext context_5 = new ClassPathXmlApplicationContext("Test2.xml");
        AnimalDog adObj22 = context_5.getBean("animalDog", AnimalDog.class);
        System.out.println(adObj22);

        // Spring自动装配
        // Spring 的 IOC 容器虽然功能强大，但它本身不过只是一个空壳而已，它自己并不能独自完成装配工作。
        // 需要我们主动将 Bean 放进去，并告诉它 Bean 和 Bean 之间的依赖关系，它才能按照我们的要求完成装配工作。
        // Spring 共提供了 5 中自动装配规则
        //    byName	按名称自动装配。
        //    byType	按类型自动装配。
        //    constructor	根据构造器参数的数据类型，进行 byType 模式的自动装配。
        //    default	表示默认采用上一级元素 <beans> 设置的自动装配规则（default-autowire）进行装配。
        //    no	    默认值，表示不使用自动装配，Bean 的依赖关系必须通过 <constructor-arg>和 <property> 元素的 ref 属性来定义。
        // ① 不使用自动装配（autowire="no"）
        // autowire="no" 表示不使用自动装配，此时我们必须通过 <bean> 元素的 <constructor-arg>和 <property> 元素的 ref 属性维护 Bean 的依赖关系
        ApplicationContext context_6 = new ClassPathXmlApplicationContext("Test66.xml");
        Employee77 empObj66 = context_6.getBean("employee77", Employee77.class);
        System.out.println(empObj66);
        // ② 按名称自动装配（autowire="byName"）
        // autowire="byName" 表示按属性名称自动装配，XML 文件中 Bean 的 id 或 name 必须与类中的属性名称相同
        ApplicationContext context_7 = new ClassPathXmlApplicationContext("Test77.xml");
        Employee77 empObj77 = context_7.getBean("employee77", Employee77.class);
        System.out.println(empObj77);
        // ③ 按类型自动装配（autowire="byType"）
        // autowire="byType" 表示按类中对象属性数据类型进行自动装配。即使 XML 文件中 Bean 的 id 或 name 与类中的属性名不同，
        // 只要 Bean 的 class 属性值与类中的对象属性的类型相同，就可以完成自动装配。
        ApplicationContext context_8 = new ClassPathXmlApplicationContext("Test88.xml");
        Employee77 empObj88 = context_8.getBean("employee77", Employee77.class);
        System.out.println(empObj88);
        // ④ 构造函数自动装配（autowire="constructor"）
        // autowire="constructor" 表示按照 Java 类中构造函数进行自动装配
        ApplicationContext context_9 = new ClassPathXmlApplicationContext("Test99.xml");
        Employee77 empObj99 = context_9.getBean("employee77", Employee77.class);
        System.out.println(empObj99);
        // 默认的自动装配模式（autowire="default"）
        // 默认采用上一级标签 <beans> 设置的自动装配规则（default-autowire）进行装配
        ApplicationContext context_10 = new ClassPathXmlApplicationContext("Test100.xml");
        Employee77 empObj100 = context_10.getBean("employee77", Employee77.class);
        System.out.println(empObj100);

        // Spring自动装配（基于注解）
        // Spring 默认不使用注解装配 Bean，因此我们需要在 XML 配置中，通过 <context:component-scan> 元素开启 Spring Beans的自动扫描功能。
        //     自动从扫描指定的包（base-package 属性设置）及其子包下的所有类，如果类上使用了 @Component 注解，就将该类装配到容器中。
        //
        //  使用注解定义 Bean
        //  注解                              说明
        //  @Component	        该注解用于描述 Spring 中的 Bean，它是一个泛化的概念，仅仅表示容器中的一个组件（Bean），并且可以作用在应用的任何层次，例如 Service 层、Dao 层等。
        //                      使用时只需将该注解标注在相应类上即可。
        //  @Repository	        该注解用于将数据访问层（Dao 层）的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
        //  @Service	        该注解通常作用在业务层（Service 层），用于将业务层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
        //  @Controller	        该注解通常作用在控制层（如 Struts2 的 Action、SpringMVC 的 Controller），用于将控制层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。\
        //
        //  基于注解方式实现依赖注入
        //  注解	                说明
        //  @Autowired	        可以应用到 Bean 的属性变量、setter 方法、非 setter 方法及构造函数等，默认按照 Bean 的类型进行装配。
        //
        //  @Autowired      注解默认按照 Bean 的类型进行装配，默认情况下它要求依赖对象必须存在，如果允许 null 值，可以设置它的 required 属性为 false。如果我们想使用按照名称（byName）来装配，可以结合 @Qualifier 注解一起使用
        //                  @Resource	作用与 Autowired 相同，区别在于 @Autowired 默认按照 Bean 类型装配，而 @Resource 默认按照 Bean 的名称进行装配。
        //                  @Resource 中有两个重要属性：name 和 type。
        //                  Spring 将 name 属性解析为 Bean 的实例名称，type 属性解析为 Bean 的实例类型。
        //                  如果都不指定，则先按 Bean 实例名称装配，如果不能匹配，则再按照 Bean 类型进行装配；如果都无法匹配，则抛出 NoSuchBeanDefinitionException 异常。
        //  @Qualifier	        与 @Autowired 注解配合使用，会将默认的按 Bean 类型装配修改为按 Bean 的实例名称装配，Bean 的实例名称由 @Qualifier 注解的参数指定。
        // No.1  因为自动扫描包的问题，不兼容
//        ApplicationContext context_11 = new ClassPathXmlApplicationContext("Test101.xml");
//        UserController ucObj = context_11.getBean("userController22", UserController.class);
//        ucObj.doStr();

        // Spring AOP编程
        // Spring AOP 的底层是通过以下 2 种动态代理机制，为目标对象（Target Bean）执行横向织入的
        //      JDK 动态代理	Spring AOP 默认的动态代理方式，若目标对象实现了若干接口，Spring 使用 JDK 的 java.lang.reflect.Proxy 类进行代理。
        //      CGLIB 动态代理	若目标对象没有实现任何接口，Spring 则使用 CGLIB 库生成目标对象的子类，以实现对目标对象的代理。
        // Spring AOP 通知类型（Advice）
        //      @Aspect	            用于定义一个切面。
        //          可以通过 @Aspect 注解将一个 Bean 定义为切面。
        //          在启用了 @AspectJ 注解支持的情况下，Spring 会自动将 IoC 容器（ApplicationContext）中的所有使用了 @Aspect 注解的 Bean 识别为一个切面。
        //      @Pointcut	        用于定义一个切入点。
        //      @Before	            用于定义前置通知，相当于 BeforeAdvice。
        //      @AfterReturning	    用于定义后置通知，相当于 AfterReturningAdvice。
        //      @Around	            用于定义环绕通知，相当于 MethodInterceptor。
        //      @AfterThrowing	    用于定义抛出通知，相当于 ThrowAdvice。
        //      @After	            用于定义最终通知，不管是否异常，该通知都会执行。
        //      @DeclareParents	    用于定义引介通知，相当于 IntroductionInterceptor（不要求掌握）。
        // Spring AOP 切面类型
        //      一般切面：对目标对象（Target）中的所有方法连接点进行拦截
        //      切点切面：用来表示带切点的切面，我们可以通过包名、类名、方法名等信息更加灵活的定义切面中的切入点，提供更具有适用性的切面
        //      引介切面：特殊的切面，它应用于类层面上，所以引介切面适用 ClassFilter 进行定义
        // 自动代理 3 种方案，不需要在 XML 配置中通过 ProxyFactoryBean 创建 代理对象（Proxy Bean）
        //      BeanNameAutoProxyCreator：根据 Bean 名称创建代理对象。
        //      DefaultAdvisorAutoProxyCreator：根据 Advisor 本身包含信息创建代理对象。
        //      AnnotationAwareAspectJAutoProxyCreator：基于 Bean 中的 AspectJ 注解进行自动代理对象。

        // 一般切面的 AOP 开发
        System.out.println("=====一般切面的 AOP 开发=====");
        ApplicationContext context_12 = new ClassPathXmlApplicationContext("Test102.xml");
        AopDao aopDaoObj = context_12.getBean("aopDaoProxy", AopDao.class);
        aopDaoObj.add();
        aopDaoObj.delete();
        aopDaoObj.get();
        aopDaoObj.modify();

        // 自动代理
        System.out.println("=====自动代理 - BeanNameAutoProxyCreator====");
        ApplicationContext context_13 = new ClassPathXmlApplicationContext("Test103.xml");
        AopDao aopDaoObj22 = context_13.getBean("aopDao", AopDao.class);
        aopDaoObj22.add();
        aopDaoObj22.delete();
        aopDaoObj22.get();
        aopDaoObj22.modify();

        OrderDao orderDaoObj = context_13.getBean("orderDao", OrderDao.class);
        orderDaoObj.add();
        orderDaoObj.adds();
        orderDaoObj.delete();
        orderDaoObj.get();
        orderDaoObj.modify();

        System.out.println("=====自动代理 - DefaultAdvisorAutoProxyCreator====");
        ApplicationContext context_14 = new ClassPathXmlApplicationContext("Test104.xml");
        AopDao aopDaoObj33 = context_14.getBean("aopDao", AopDao.class);
        aopDaoObj33.add();
        aopDaoObj33.delete();
        aopDaoObj33.get();
        aopDaoObj33.modify();

        OrderDao orderDaoObj33 = context_14.getBean("orderDao", OrderDao.class);
        orderDaoObj33.add();
        orderDaoObj33.adds();
        orderDaoObj33.delete();
        orderDaoObj33.get();
        orderDaoObj33.modify();

        // Spring使用AspectJ进行AOP开发（基于注解）
        // 干了些什么事情：
        // ① 定义一个 dao 类
        // ② 定义一个 实现dao 类
        // ③ 定义一个 bean，对 实现dao 类里的方法各种 前置通知、后置通知，一顿操作
        // ④ 定义一个 daoConfig 类，把 bean 注入到 springIOC
        // ⑤ 主函数里 new springIOC , 调用 dao 类，来实现功能
        // No.2  因为自动扫描包的问题，不兼容
        System.out.println("=====Spring使用AspectJ进行AOP开发（基于注解）====");
//        ApplicationContext context_15 = new AnnotationConfigApplicationContext(AopDaoConfig.class);
//        AopDao aopDaoObj44 = context_15.getBean("aopDao", AopDao.class);
//        aopDaoObj44.add();
//        aopDaoObj44.modify();
//        aopDaoObj44.delete();
//        aopDaoObj44.get();

        // Spring JdbcTemplate（使用详解）    No.3  因为自动扫描包的问题，不兼容
        // 干了些什么事情：
        // ① 定义一个DB表实体类 MyUser          表字段的 set & get
        // ② 定义一个 MyUserDao 接口类          对 MyUser 表的操作定义接口，增删改查，统计，按什么查询等等，都是跟数据库打交道
        // ③ 定义一个 MyUserDaoImpl 类         对 MyUser 表的操作实现接口
        // ④ 定义一个 MyUserService 接口类      调用 MyUserDao 接口类 实现 对 MyUser 表的操作，对 MyUser 业务的操作，都是接口
        // ⑤ 定义一个 MyUserServiceImpl 类      具体实现接口
        // ⑥ 定义一个 jdbc.properties ，配置数据库
        // ⑦ 定义一个 Test110.xml 实现以上bean的自动扫描，纳入 IOC
//        ApplicationContext context_16 = new ClassPathXmlApplicationContext("Test110.xml");
//        MyUserService musObj = context_16.getBean("myUserService222", MyUserService.class);
//
//        MyUser myUser = new MyUser();
//        myUser.setUserName("小张");
//        myUser.setStatus("离线");
//        int i = musObj.addMyUser(myUser);
//        System.out.println("新增用户成功 " + i);
//
//        MyUser myUser22 = new MyUser();
//        myUser22.setUserName("小张");
//        myUser22.setStatus("在线");
//        int u = musObj.updateMyUser(myUser22);
//        System.out.println("修改用户成功 " + u);
//
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"小明", "在线"};
//        Object[] o2 = {"小龙", "离线"};
//        Object[] o3 = {"小林", "在线"};
//        Object[] o4 = {"小李", "在线"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        batchArgs.add(o4);
//        musObj.batchAddMyUser(batchArgs);
//        System.out.println("批量增加完毕");
//
//        MyUser myUser33 = new MyUser();
//        myUser33.setStatus("在线");
//        int count = musObj.countMyUser(myUser33);
//        System.out.println("在线用户的个数为：" + count);
//
//        List<MyUser> myUsersList = musObj.getMyUserList(myUser33);
//        System.out.println("在线用户查询：");
//        for (MyUser muObj:myUsersList) {
//            System.out.println("用户ID：" + muObj.getUserId() + ", 用户名：" + muObj.getUserName() + ", 状态：" + muObj.getStatus());
//        }


        // Spring事务（Transaction）
        // Spring 中提供了以下隔离级别
        //      ISOLATION_DEFAULT	        使用后端数据库默认的隔离级别
        //      ISOLATION_READ_UNCOMMITTED	允许读取尚未提交的更改，可能导致脏读、幻读和不可重复读
        //      ISOLATION_READ_COMMITTED	Oracle 默认级别，允许读取已提交的并发事务，防止脏读，可能出现幻读和不可重复读
        //      ISOLATION_REPEATABLE_READ	MySQL 默认级别，多次读取相同字段的结果是一致的，防止脏读和不可重复读，可能出现幻读
        //      ISOLATION_SERIALIZABLE	    完全服从 ACID 的隔离级别，防止脏读、不可重复读和幻读
        //
        // 事务传播行为（propagation behavior）：当一个事务方法被另一个事务方法调用时，这个事务方法应该如何运行。
        //      例如，事务方法 A 在调用事务方法 B 时，B 方法是继续在调用者 A 方法的事务中运行呢，还是为自己开启一个新事务运行，这就是由事务方法 B 的事务传播行为决定的。
        // Spring 提供了以下 7 种不同的事务传播行为
        //      PROPAGATION_MANDATORY	    支持当前事务，如果不存在当前事务，则引发异常。
        //      PROPAGATION_NESTED	        如果当前事务存在，则在嵌套事务中执行。
        //      PROPAGATION_NEVER	        不支持当前事务，如果当前事务存在，则引发异常。
        //      PROPAGATION_NOT_SUPPORTED	不支持当前事务，始终以非事务方式执行。
        //      PROPAGATION_REQUIRED	    默认传播行为，如果存在当前事务，则当前方法就在当前事务中运行，如果不存在，则创建一个新的事务，并在这个新建的事务中运行。
        //      PROPAGATION_REQUIRES_NEW	创建新事务，如果已经存在事务则暂停当前事务。
        //      PROPAGATION_SUPPORTS	    支持当前事务，如果不存在事务，则以非事务方式执行。
        //
        // TransactionStatus 接口
        //      boolean  hasSavepoint()	    获取是否存在保存点
        //      boolean  isCompleted()	    获取事务是否完成
        //      boolean  isNewTransaction()	获取是否是新事务
        //      boolean  isRollbackOnly()	获取事务是否回滚
        //      void     setRollbackOnly()	设置事务回滚
        //
        // @Transactional 注解包含多个属性，其中常用属性如下表。
        //      事务属性	            说明
        //      propagation	        指定事务的传播行为。
        //      isolation	        指定事务的隔离级别。
        //      read-only	        指定是否为只读事务。
        //      timeout	            表示超时时间，单位为“秒”；声明的事务在指定的超时时间后，自动回滚，避免事务长时间不提交会回滚导致的数据库资源的占用。
        //      rollback-for	    指定事务对于那些类型的异常应当回滚，而不提交。
        //      no-rollback-for	    指定事务对于那些异常应当继续运行，而不回滚。
        //
        // Spring基于注解实现事务管理
        ApplicationContext context_17 = new ClassPathXmlApplicationContext("Test111.xml");
        Order22Service o22sObj = context_17.getBean("order22Service", Order22Service.class);
        Order22 order22Obj = new Order22();
        order22Obj.setProductId("1");
        order22Obj.setCount(30);
        order22Obj.setMoney(new BigDecimal(600));
        order22Obj.setUserId("1");
        order22Obj.setStatus(0);
        o22sObj.createOrder(order22Obj);
    }

}


// 创建 spring项目，输出第一个 helloworld
// https://blog.csdn.net/qq_46631566/article/details/118114677
// http://c.biancheng.net/spring/first-spring.html

// 加载类路径 ClassPath 下指定的 XML 配置文件，并完成 ApplicationContext 的实例化工作
// ApplicationContext applicationContext = new ClassPathXmlApplicationContext(String configLocation);

// 加载指定的文件系统路径中指定的 XML 配置文件，并完成 ApplicationContext 的实例化工作
// ApplicationContext applicationContext = new FileSystemXmlApplicationContext(String configLocation);

// Spring Bean定义    <bean> 标签上的各种属性
// http://c.biancheng.net/spring/bean-definition.html
// 属性名称	    描述
// id	        Bean 的唯一标识符，Spring IoC 容器对 Bean 的配置和管理都通过该属性完成。id 的值必须以字母开始，可以使用字母、数字、下划线等符号。
// name	        该属性表示 Bean 的名称，我们可以通过 name 属性为同一个 Bean 同时指定多个名称，每个名称之间用逗号或分号隔开。Spring 容器可以通过 name 属性配置和管理容器中的 Bean。
// class	    该属性指定了 Bean 的具体实现类，它必须是一个完整的类名，即类的全限定名。
// list	        用于封装 List 或数组类型的属性注入。
// set	        用于封装 Set 类型的属性注入。
// map	        用于封装 Map 类型的属性注入。

// Spring Bean属性注入
// Bean 属性注入，简单点说就是将属性注入到 Bean 中的过程，而这属性既可以普通属性，也可以是一个对象（Bean）
//  构造函数注入
//  setter 注入
//  短命名空间注入
//        短命名空间	    简化的 XML 配置	                        说明
//        p 命名空间	    <bean> 元素中嵌套的 <property> 元素	    是 setter 方式属性注入的一种快捷实现方式
//        c 命名空间	    <bean> 元素中嵌套的 <constructor> 元素	    是构造函数属性注入的一种快捷实现方式
//
//        使用 p 命名空间注入依赖时，必须注意以下 3 点：
//            Java 类中必须有 setter 方法；
//            Java 类中必须有无参构造器（类中不包含任何带参构造函数的情况，无参构造函数默认存在）；
//            在使用 p 命名空间实现属性注入前，XML 配置的 <beans> 元素内必须先导入 p 命名空间的 XML 约束。

// Spring注入内部Bean

// Spring Bean作用域
//      singleton	  默认值，单例模式，表示在 Spring 容器中只有一个 Bean 实例
//      prototype	  原型模式，表示每次通过 Spring 容器获取 Bean 时，容器都会创建一个新的 Bean 实例。
//      request	      每次 HTTP 请求，容器都会创建一个 Bean 实例。该作用域只在当前 HTTP Request 内有效。
//      session	      同一个 HTTP Session 共享一个 Bean 实例，不同的 Session 使用不同的 Bean 实例。该作用域仅在当前 HTTP Session 内有效。
//      application	  同一个 Web 应用共享一个 Bean 实例，该作用域在当前 ServletContext 内有效。
//                    与 singleton 类似，但 singleton 表示每个 IoC 容器中仅有一个 Bean 实例，而一个 Web 应用中可能会存在多个 IoC 容器，但一个 Web 应用只会有一个 ServletContext，也可以说 application 才是 Web 应用中货真价实的单例模式。
//      websocket	  websocket 的作用域是 WebSocket ，即在整个 WebSocket 中有效。

// spring Bean 的生命周期
//   Bean 的实例化
//   Bean 属性赋值
//   Bean 的初始化
//   Bean 的使用
//   Bean 的销毁

// 对于 singleton 作用域的 Bean 来说，Spring IoC 容器能够精确地控制 Bean 何时被创建、何时初始化完成以及何时被销毁；
// 对于 prototype 作用域的 Bean 来说，Spring IoC 容器只负责创建，然后就将 Bean 的实例交给客户端代码管理，Spring IoC 容器将不再跟踪其生命周期。


// 3 种方式自定义 Bean 的生命周期回调方法
//    通过接口实现
//    通过 XML 配置实现
//    使用注解实现


