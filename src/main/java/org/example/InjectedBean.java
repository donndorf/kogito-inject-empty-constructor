package org.example;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InjectedBean {

        public String sayHello() {
            return "Hello";
        }
}
