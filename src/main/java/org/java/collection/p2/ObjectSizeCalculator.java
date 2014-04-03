package org.java.collection.p2;


import java.lang.instrument.Instrumentation;
import java.util.Calendar;

public class ObjectSizeCalculator {
   private static Instrumentation instrumentation;

   public static void premain(String agentArgs, Instrumentation inst) {
      instrumentation = inst;
   }

   private static long sizeOf(Object o) {
      return instrumentation.getObjectSize(o);
   }

   public static void main(String[] args) {
      System.out.println("Size of Object: " + sizeOf(new Object()));
      System.out.println("Size of direct subclass: " + sizeOf(
            new ObjectSizeCalculator()));
      System.out.println("Size of String \"size\": " + sizeOf("size"));
      System.out.println("Size of Calendar: " + sizeOf(Calendar.getInstance()));   
   }
}
