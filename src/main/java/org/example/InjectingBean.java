package org.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InjectingBean {

    private final InjectedBean injectedBean;

    public InjectingBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public String sayHello() {
        return injectedBean.sayHello();
    }
}
