package org.java.annotation.sample1;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface TesterInfo {

	public enum Priority {
		LOW, MEDIUM, HIGH
	}

	Priority priority() default Priority.MEDIUM;

	String[] tags() default "";

	String createdBy() default "Mkyong";

	String lastModified() default "03/01/2014";

}