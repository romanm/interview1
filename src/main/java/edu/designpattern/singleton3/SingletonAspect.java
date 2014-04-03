package edu.designpattern.singleton3;

public aspect SingletonAspect extends AbstractSingletonAspect {
	pointcut singletonPointcut() : call(Stats.new(..));
}
