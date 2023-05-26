package com.java.annotations;

public @interface Uniqueness {
    Constraints constaints() default @Constraints(unique = true);
}
