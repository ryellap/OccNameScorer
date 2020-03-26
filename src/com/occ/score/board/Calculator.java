package com.occ.score.board;

import com.occ.score.board.calc.DefaultScoreCalculator;
import com.occ.score.board.calc.IScoreCalculator;
import com.occ.score.board.process.Processor;
import java.io.File;
import java.io.IOException;

public class Calculator {

  public static void main(String[] args) throws IOException {
    if (args.length != 1) {
      throw new RuntimeException("Please provide file path of names file.");
    }
    File file = new File(args[0]);
    if (!file.exists() || !file.isFile() || !file.getName().endsWith(".txt")) {
      throw new RuntimeException("Please provide a valid .txt file path of names file.");
    }
    Processor processor = new Processor();
    IScoreCalculator scoreCalculator = new DefaultScoreCalculator();
    int val = processor.process(file, scoreCalculator);
    System.out.println("File Score " + val);
  }
}
