package com.occ.score.board.calc;

import com.occ.score.board.model.Name;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class DefaultScoreCalculator implements IScoreCalculator {

  /**
   *
   * <pre>
   * To score a list of names, the given collection is sorted alphabetically and sum the individual scores for all
   * the names.
   *
   * To score a name, each alphabet is individually weighed (A=1, B=2, C=3, etc...)
   * and multiplied by the sum by the name’s position in the list (1-based).
   *
   * For example, <code>LINDA</code>, which is worth <code>12 + 9 + 14 + 4 + 1 = 40</code>,
   * and say is the 4th name in the list. So, LINDA would obtain a score of 40 x 4 = 160.
   * </pre>
   *
   * @param names {@link Name} generated from given names file
   * @return
   */
  @Override
  public int getNamesScore(List<Name> names) {
    names.sort(Comparator.comparing(Name::getFirstName));

    return IntStream.range(0, names.size())
        .mapToObj(index -> getNameScore(names.get(index), index + 1))
        .reduce(0, Integer::sum);
  }

  private int getCharValue(Character c) {
    if (c >= 'a' && c <= 'z') {
      return c - 'a' + 1;
    } else if (c >= 'A' && c <= 'Z') {
      return c - 'A' + 1;
    }
    return 0;
  }

  private int getNameScore(Name name, int index) {
    return index
        * name.getFirstName().chars().mapToObj(c -> (char) c).mapToInt(this::getCharValue).sum();
  }
}
