package com.occ.score.board.process;

import com.occ.score.board.calc.IScoreCalculator;
import com.occ.score.board.model.Name;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {

  /**
   * Processes the given text file and produces the score based on caclulator implementation.
   *
   * @param file that needs to be scored.
   * @param scoreCalculator how the names should be scored.
   * @return the overall score of the file.
   * @throws FileNotFoundException
   */
  public int process(File file, IScoreCalculator scoreCalculator) throws FileNotFoundException {
    return scoreCalculator.getNamesScore(buildListOfNames(file));
  }

  private List<Name> buildListOfNames(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file).useDelimiter(",");
    List<Name> names = new ArrayList<>();
    while (scanner.hasNext()) {
      names.add(new Name(scanner.next()));
    }
    return names;
  }
}
