package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.ReportingCurrency;
import com.opengamma.strata.calc.marketdata.MarketDataRequirements;
import com.opengamma.strata.data.MarketDataId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationTasksDiffblueTest {
  /**
   * Test {@link CalculationTasks#of(List, List)} with {@code tasks}, {@code columns}.
   *
   * <ul>
   *   <li>Then return Columns size is two.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#of(List, List)}
   */
  @Test
  @DisplayName("Test of(List, List) with 'tasks', 'columns'; then return Columns size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTasks CalculationTasks.of(List, List)"})
  void testOfWithTasksColumns_thenReturnColumnsSizeIsTwo() {
    // Arrange
    ArrayList<CalculationTask> tasks = new ArrayList<>();

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act and Assert
    List<Column> columns2 = CalculationTasks.of(tasks, columns).getColumns();
    assertEquals(2, columns2.size());
    Column expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
  }

  /**
   * Test {@link CalculationTasks#of(List, List)} with {@code tasks}, {@code columns}.
   *
   * <ul>
   *   <li>Then return Targets Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#of(List, List)}
   */
  @Test
  @DisplayName("Test of(List, List) with 'tasks', 'columns'; then return Targets Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTasks CalculationTasks.of(List, List)"})
  void testOfWithTasksColumns_thenReturnTargetsEmpty() {
    // Arrange
    ArrayList<CalculationTask> tasks = new ArrayList<>();

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    CalculationTasks actualOfResult = CalculationTasks.of(tasks, columns);

    // Assert
    List<CalculationTarget> targets = actualOfResult.getTargets();
    assertTrue(targets.isEmpty());
    assertEquals(columns, actualOfResult.getColumns());
    assertSame(targets, actualOfResult.getTasks());
  }

  /**
   * Test {@link CalculationTasks#requirements(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return NonObservables Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#requirements(ReferenceData)}
   */
  @Test
  @DisplayName("Test requirements(ReferenceData); then return NonObservables Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataRequirements CalculationTasks.requirements(ReferenceData)"})
  void testRequirements_thenReturnNonObservablesEmpty() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    MarketDataRequirements actualRequirementsResult =
        CalculationTasks.of(new ArrayList<>(), columns).requirements(mock(ReferenceData.class));

    // Assert
    ImmutableSet<MarketDataId<?>> nonObservables = actualRequirementsResult.getNonObservables();
    assertTrue(nonObservables.isEmpty());
    assertSame(nonObservables, actualRequirementsResult.getObservables());
    assertSame(nonObservables, actualRequirementsResult.getOutputCurrencies());
    assertSame(nonObservables, actualRequirementsResult.getTimeSeries());
  }

  /**
   * Test {@link CalculationTasks#meta()}.
   *
   * <p>Method under test: {@link CalculationTasks#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTasks.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationTasks> actualMetaResult = CalculationTasks.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("columns"));
    assertTrue(metaPropertyMapResult.containsKey("targets"));
    assertTrue(metaPropertyMapResult.containsKey("tasks"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationTasks> expectedBeanTypeResult = CalculationTasks.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationTasks#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTasks.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    TypedMetaBean<CalculationTasks> actualMetaBeanResult =
        CalculationTasks.of(new ArrayList<>(), columns).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("columns"));
    assertTrue(metaPropertyMapResult.containsKey("targets"));
    assertTrue(metaPropertyMapResult.containsKey("tasks"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationTasks> expectedBeanTypeResult = CalculationTasks.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link CalculationTasks#equals(Object)}, and {@link CalculationTasks#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTasks#equals(Object)}
   *   <li>{@link CalculationTasks#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationTasks.equals(Object)", "int CalculationTasks.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks ofResult = CalculationTasks.of(new ArrayList<>(), columns);

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns2.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks ofResult2 = CalculationTasks.of(new ArrayList<>(), columns2);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CalculationTasks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationTasks.equals(Object)", "int CalculationTasks.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks ofResult = CalculationTasks.of(new ArrayList<>(), columns);

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult2 = Column.builder();

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns2.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult3 = Column.builder();

    Builder measureResult3 = builderResult3.measure(ImmutableMeasure.of("Name"));

    Builder nameResult3 = measureResult3.name(ColumnName.of("Name"));
    columns2.add(
        nameResult3
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks ofResult2 = CalculationTasks.of(new ArrayList<>(), columns2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link CalculationTasks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationTasks.equals(Object)", "int CalculationTasks.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act and Assert
    assertNotEquals(CalculationTasks.of(new ArrayList<>(), columns), 1);
  }

  /**
   * Test {@link CalculationTasks#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTasks#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CalculationTasks.equals(Object)", "int CalculationTasks.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act and Assert
    assertNotEquals(CalculationTasks.of(new ArrayList<>(), columns), null);
  }
}
