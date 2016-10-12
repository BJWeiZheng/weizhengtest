package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weizheng on 2016/5/24.
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        try {
            BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
            Thread.sleep(3000l);
            SpringTestBean test = beanFactory.getBean(SpringTestBean.class);
            FactoryBean fb;
        } catch (Exception e) {

        }
    }
}
