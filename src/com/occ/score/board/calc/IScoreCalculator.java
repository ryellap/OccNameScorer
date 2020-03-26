package com.occ.score.board.calc;

import com.occ.score.board.model.Name;
import java.util.List;

public interface IScoreCalculator {

  int getNamesScore(List<Name> names);
}
