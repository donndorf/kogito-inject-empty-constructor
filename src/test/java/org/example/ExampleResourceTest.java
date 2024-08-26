package org.example;

import io.quarkus.arc.Arc;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.kie.kogito.Model;
import org.kie.kogito.process.ProcessInstance;
import org.kie.kogito.process.impl.AbstractProcess;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class InjectErrorTest {
    @Test
    void testInjection() {
        AbstractProcess<?> process = (AbstractProcess<?>) Arc.container().instance("inject").get();
        Model model = process.createModel();
        model.fromMap(new HashMap<>());
        process.createInstance(model).start();
    }

}
