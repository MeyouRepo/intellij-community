// "Inline variable|->Keep 'exp' name" "true-preview"
package com.example;

import java.util.ArrayList;
import java.util.List;

public class Demo {
  static class ExposureSpecification {
  }

  public static void main(String[] args) {
    List<ExposureSpecification> vExposures = new ArrayList<>();

    for (ExposureSpecification vExposure : vExposures) {
      System.out.println(vExposure);
      ExposureSpecification e<caret>xp = vExposure;
      // ... lines of code using exp ...
      System.out.println(exp);
    }
  }
}