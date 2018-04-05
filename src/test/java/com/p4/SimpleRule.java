package com.p4;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class SimpleRule implements TestRule {
    @Override
    public Statement apply(Statement statement, Description description) {

        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("before");
                statement.evaluate();
                System.out.println("after");
            }
        };
    }
}
