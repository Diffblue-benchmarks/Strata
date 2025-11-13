package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.ReportingCurrency;
import com.opengamma.strata.calc.runner.CalculationTaskTest.TestFunction;
import com.opengamma.strata.calc.runner.CalculationTaskTest.TestTarget;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.collect.result.FailureReason;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationTaskDiffblueTest {
  /**
   * Test {@link CalculationTask#of(CalculationTarget, CalculationFunction, CalculationTaskCell[])}
   * with {@code target}, {@code function}, {@code cells}.
   *
   * <ul>
   *   <li>Then return Cells size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#of(CalculationTarget, CalculationFunction,
   * CalculationTaskCell[])}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget, CalculationFunction, CalculationTaskCell[]) with 'target', 'function', 'cells'; then return Cells size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationTask CalculationTask.of(CalculationTarget, CalculationFunction, CalculationTaskCell[])"
  })
  void testOfWithTargetFunctionCells_thenReturnCellsSizeIsOne() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act
    CalculationTask actualOfResult = CalculationTask.of(target, function, ofResult);

    // Assert
    List<CalculationTaskCell> cells = actualOfResult.getCells();
    assertEquals(1, cells.size());
    assertSame(ofResult, cells.get(0));
  }

  /**
   * Test {@link CalculationTask#of(CalculationTarget, CalculationFunction, CalculationTaskCell[])}
   * with {@code target}, {@code function}, {@code cells}.
   *
   * <ul>
   *   <li>Then return Cells size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#of(CalculationTarget, CalculationFunction,
   * CalculationTaskCell[])}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget, CalculationFunction, CalculationTaskCell[]) with 'target', 'function', 'cells'; then return Cells size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationTask CalculationTask.of(CalculationTarget, CalculationFunction, CalculationTaskCell[])"
  })
  void testOfWithTargetFunctionCells_thenReturnCellsSizeIsTwo() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("target"), ReportingCurrency.NATURAL);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("target"), ReportingCurrency.NATURAL);

    // Act
    CalculationTask actualOfResult = CalculationTask.of(target, function, ofResult, ofResult2);

    // Assert
    List<CalculationTaskCell> cells = actualOfResult.getCells();
    assertEquals(2, cells.size());
    assertSame(ofResult, cells.get(0));
    assertSame(ofResult2, cells.get(1));
  }

  /**
   * Test {@link CalculationTask#of(CalculationTarget, CalculationFunction, CalculationParameters,
   * List)} with {@code target}, {@code function}, {@code parameters}, {@code cells}.
   *
   * <ul>
   *   <li>Then return Cells size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#of(CalculationTarget, CalculationFunction,
   * CalculationParameters, List)}
   */
  @Test
  @DisplayName(
      "Test of(CalculationTarget, CalculationFunction, CalculationParameters, List) with 'target', 'function', 'parameters', 'cells'; then return Cells size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationTask CalculationTask.of(CalculationTarget, CalculationFunction, CalculationParameters, List)"
  })
  void testOfWithTargetFunctionParametersCells_thenReturnCellsSizeIsTwo() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();
    CalculationParameters parameters = CalculationParameters.empty();

    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("target"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("target"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);

    // Act
    CalculationTask actualOfResult = CalculationTask.of(target, function, parameters, cells);

    // Assert
    List<CalculationTaskCell> cells2 = actualOfResult.getCells();
    assertEquals(2, cells2.size());
    assertSame(ofResult2, cells2.get(1));
  }

  /**
   * Test {@link CalculationTask#getRowIndex()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getRowIndex()}
   */
  @Test
  @DisplayName("Test getRowIndex(); given ImmutableMeasure with 'Name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CalculationTask.getRowIndex()"})
  void testGetRowIndex_givenImmutableMeasureWithName_thenReturnOne() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult2 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(1, ofResult2.getRowIndex());
  }

  /**
   * Test {@link CalculationTask#getRowIndex()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getRowIndex()}
   */
  @Test
  @DisplayName("Test getRowIndex(); given ImmutableMeasure with 'Name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CalculationTask.getRowIndex()"})
  void testGetRowIndex_givenImmutableMeasureWithName_thenReturnOne2() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult3 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(1, ofResult3.getRowIndex());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with name is {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName(
      "Test getMeasures(); given ImmutableMeasure with name is '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithNameIs42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult3 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(2, ofResult3.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with name is {@code Name42}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName(
      "Test getMeasures(); given ImmutableMeasure with name is 'Name42'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithNameIsName42_thenReturnSizeIsFive() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name42"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("NameName"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    CalculationTaskCell ofResult3 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("name"), ReportingCurrency.NATURAL);
    cells.add(ofResult3);
    CalculationTaskCell ofResult4 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult4);
    CalculationTaskCell ofResult5 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult5);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult6 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(5, ofResult6.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with name is {@code NameName}.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName(
      "Test getMeasures(); given ImmutableMeasure with name is 'NameName'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithNameIsNameName_thenReturnSizeIsFour() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("NameName"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    CalculationTaskCell ofResult3 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult3);
    CalculationTaskCell ofResult4 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult4);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult5 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(4, ofResult5.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with name is {@code Namename}.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName(
      "Test getMeasures(); given ImmutableMeasure with name is 'Namename'; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithNameIsNamename_thenReturnSizeIsSix() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Namename"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name42"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    CalculationTaskCell ofResult3 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("NameName"), ReportingCurrency.NATURAL);
    cells.add(ofResult3);
    CalculationTaskCell ofResult4 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("name"), ReportingCurrency.NATURAL);
    cells.add(ofResult4);
    CalculationTaskCell ofResult5 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult5);
    CalculationTaskCell ofResult6 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult6);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult7 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(6, ofResult7.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName("Test getMeasures(); given ImmutableMeasure with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithName_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult2 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(1, ofResult2.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName("Test getMeasures(); given ImmutableMeasure with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithName_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult3 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(1, ofResult3.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code name}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName("Test getMeasures(); given ImmutableMeasure with 'name'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithName_thenReturnSizeIsThree() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    CalculationTaskCell ofResult3 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult3);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult4 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(3, ofResult4.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#getMeasures()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code name}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#getMeasures()}
   */
  @Test
  @DisplayName("Test getMeasures(); given ImmutableMeasure with 'name'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CalculationTask.getMeasures()"})
  void testGetMeasures_givenImmutableMeasureWithName_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult3 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertEquals(2, ofResult3.getMeasures().size());
  }

  /**
   * Test {@link CalculationTask#naturalCurrency(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return {@link Currency#USD}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#naturalCurrency(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test naturalCurrency(ReferenceData); given ImmutableMeasure with 'Name'; then return USD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency CalculationTask.naturalCurrency(ReferenceData)"})
  void testNaturalCurrency_givenImmutableMeasureWithName_thenReturnUsd() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    TestTarget target = new TestTarget();
    TestFunction function = new TestFunction();

    CalculationTask ofResult2 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    assertSame(Currency.USD, ofResult2.naturalCurrency(mock(ReferenceData.class)));
  }

  /**
   * Test {@link CalculationTask#execute(ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with name is {@code 42}.
   *   <li>Then return Cells size is three.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#execute(ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test execute(ScenarioMarketData, ReferenceData); given ImmutableMeasure with name is '42'; then return Cells size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationResults CalculationTask.execute(ScenarioMarketData, ReferenceData)"
  })
  void testExecute_givenImmutableMeasureWithNameIs42_thenReturnCellsSizeIsThree() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("42"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("reason"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    CalculationTaskCell ofResult3 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult3);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult4 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    ImmutableList<CalculationResult> cells2 =
        ofResult4
            .execute(ImmutableScenarioMarketData.empty(), mock(ReferenceData.class))
            .getCells();
    assertEquals(3, cells2.size());
    assertEquals(
        "Measure '42' is not supported by function 'TestFunction'",
        cells2.get(0).getResult().getFailure().getMessage());
    CalculationResult getResult = cells2.get(2);
    Result<?> result = getResult.getResult();
    Failure failure = result.getFailure();
    assertEquals(
        "Measure 'Name' is not supported by function 'TestFunction'", failure.getMessage());
    assertEquals(
        "Measure 'reason' is not supported by function 'TestFunction'",
        cells2.get(1).getResult().getFailure().getMessage());
    assertEquals(1, getResult.getColumnIndex());
    assertEquals(1, getResult.getRowIndex());
    assertEquals(1, failure.getItems().size());
    assertEquals(FailureReason.UNSUPPORTED, failure.getReason());
    assertFalse(result.isSuccess());
    assertTrue(result.isFailure());
  }

  /**
   * Test {@link CalculationTask#execute(ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Cells second is Cells first.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#execute(ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test execute(ScenarioMarketData, ReferenceData); then return Cells second is Cells first")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationResults CalculationTask.execute(ScenarioMarketData, ReferenceData)"
  })
  void testExecute_thenReturnCellsSecondIsCellsFirst() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult2);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult3 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act and Assert
    ImmutableList<CalculationResult> cells2 =
        ofResult3
            .execute(ImmutableScenarioMarketData.empty(), mock(ReferenceData.class))
            .getCells();
    assertEquals(2, cells2.size());
    CalculationResult expectedGetResult = cells2.get(0);
    assertEquals(expectedGetResult, cells2.get(1));
  }

  /**
   * Test {@link CalculationTask#meta()}.
   *
   * <p>Method under test: {@link CalculationTask#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTask.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationTask> actualMetaResult = CalculationTask.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cells"));
    assertTrue(metaPropertyMapResult.containsKey("function"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationTask> expectedBeanTypeResult = CalculationTask.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationTask#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTask#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given ImmutableMeasure with 'Name'; then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTask.metaBean()"})
  void testMetaBean_givenImmutableMeasureWithName_thenReturnLightMetaBean() {
    // Arrange
    ArrayList<CalculationTaskCell> cells = new ArrayList<>();
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    cells.add(ofResult);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    TestFunction function = new TestFunction();

    CalculationTask ofResult2 =
        CalculationTask.of(target, function, CalculationParameters.empty(), cells);

    // Act
    TypedMetaBean<CalculationTask> actualMetaBeanResult = ofResult2.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("cells"));
    assertTrue(metaPropertyMapResult.containsKey("function"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("target"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationTask> expectedBeanTypeResult = CalculationTask.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
