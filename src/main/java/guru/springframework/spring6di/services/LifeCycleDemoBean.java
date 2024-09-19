/* Copyright Alcon 2023 */
package guru.springframework.spring6di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import guru.springframework.spring6di.controllers.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
                ApplicationContextAware, BeanPostProcessor {
    // order:
    // 0. constructor
    // 1. set properties
    // 2. BeanNameAware
    // 3. BeanFactoryAware
    // 4. ApplicationContextAware
    // 5. postConstruct
    // 6. afterPropertiesSet
    // postProcessBeforeInitialization
    // postProcessAfterInitialization
    // --
    // 7. PreDestroy
    // 8. DisposableBean.destroy

    private String javaVer;

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor ##");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 afterPropertiesSet Populate Properties The LifeCycleBean has its properties set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 DisposableBean.destroy The Lifecycle bean has been terminated");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## 5 postConstruct The Post Construct annotated method has been called");
    }

    @Override
    // called for every object in the context
    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
        System.out.println("## postProcessAfterInitialization: " + beanName);

        if (bean instanceof MyController) {
            final MyController myController = (MyController) bean;
            System.out.println("Calling after init");
            myController.afterInit();
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    // called for every object in the context
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
        System.out.println("## postProcessBeforeInitialization: " + beanName);

        if (bean instanceof MyController) {
            final MyController myController = (MyController) bean;
            System.out.println("Calling before init");
            myController.beforeInit();
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The @PreDestroy annotated method has been called");
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContextAware - Application context has been set");
    }

    @Override
    public void setBeanFactory(final BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanFactoryAware - Bean Factory has been set");
    }

    @Override
    public void setBeanName(final String name) {
        System.out.println("## 2 BeanNameAware My Bean Name is: " + name);
    }

    @Value("${java.specification.version}") // spel (spring expression language)
    public void setJavaVer(final String javaVer) {
        this.javaVer = javaVer;
        System.out.println("## 1 Properties Set. Java Ver: " + this.javaVer);
    }

}
