package com.github.stephanenicolas.afterburner.inserts;

import javassist.CtClass;
import lombok.Getter;

public final class SimpleInsertableMethod extends InsertableMethod {
    @Getter
    private String fullMethod;
    @Getter
    private String body;
    @Getter
    private String targetMethodName;
    @Getter
    private String insertionBeforeMethod;
    @Getter
    private String insertionAfterMethod;

    public SimpleInsertableMethod(CtClass classToInsertInto,
            String targetMethodName, String insertionBeforeMethod,
            String insertionAfterMethod, String body, String fullMethod) {
        super(classToInsertInto);
        this.targetMethodName = targetMethodName;
        this.insertionBeforeMethod = insertionBeforeMethod;
        this.insertionAfterMethod = insertionAfterMethod;
        this.body = body;
        this.fullMethod = fullMethod;
    }


}
