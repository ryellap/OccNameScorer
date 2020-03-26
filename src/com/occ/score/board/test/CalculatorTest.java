package com.occ.score.board.test;

import com.occ.score.board.calc.DefaultScoreCalculator;
import com.occ.score.board.calc.IScoreCalculator;
import com.occ.score.board.process.Processor;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Wanted to have a basic test to validate logic.
 */
public class CalculatorTest {

  public static void main(String[] args) throws IOException {

    URL path = CalculatorTest.class.getResource("test.txt");
    File file = new File(path.getFile());
    Processor processor = new Processor();
    IScoreCalculator scoreCalculator = new DefaultScoreCalculator();
    int val = processor.process(file, scoreCalculator);

    if (val != 3194) {
      System.out.println("! ! ! TEST FAILED ! ! ! -- expected score: 3194, but got: " + val);
    } else {
      System.out.println("TEST PASSED");
    }
  }
}
