package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.ReportingCurrency;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationTaskCellDiffblueTest {
  /**
   * Test {@link CalculationTaskCell#of(int, int, Measure, ReportingCurrency)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ColumnIndex is one.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#of(int, int, Measure, ReportingCurrency)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, Measure, ReportingCurrency); when one; then return ColumnIndex is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationTaskCell CalculationTaskCell.of(int, int, Measure, ReportingCurrency)"
  })
  void testOf_whenOne_thenReturnColumnIndexIsOne() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    CalculationTaskCell actualOfResult =
        CalculationTaskCell.of(1, 1, measure, ReportingCurrency.NATURAL);

    // Assert
    assertEquals(1, actualOfResult.getColumnIndex());
    assertEquals(1, actualOfResult.getRowIndex());
    assertSame(measure, actualOfResult.getMeasure());
    assertSame(ReportingCurrency.NATURAL, actualOfResult.getReportingCurrency());
  }

  /**
   * Test {@link CalculationTaskCell#meta()}.
   *
   * <p>Method under test: {@link CalculationTaskCell#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTaskCell.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CalculationTaskCell> actualMetaResult = CalculationTaskCell.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("columnIndex"));
    assertTrue(metaPropertyMapResult.containsKey("measure"));
    assertTrue(metaPropertyMapResult.containsKey("reportingCurrency"));
    assertTrue(metaPropertyMapResult.containsKey("rowIndex"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CalculationTaskCell> expectedBeanTypeResult = CalculationTaskCell.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CalculationTaskCell#metaBean()}.
   *
   * <p>Method under test: {@link CalculationTaskCell#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CalculationTaskCell.metaBean()"})
  void testMetaBean() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act
    TypedMetaBean<CalculationTaskCell> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("columnIndex"));
    assertTrue(metaPropertyMapResult.containsKey("measure"));
    assertTrue(metaPropertyMapResult.containsKey("reportingCurrency"));
    assertTrue(metaPropertyMapResult.containsKey("rowIndex"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CalculationTaskCell> expectedBeanTypeResult = CalculationTaskCell.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTaskCell#toString()}
   *   <li>{@link CalculationTaskCell#getColumnIndex()}
   *   <li>{@link CalculationTaskCell#getMeasure()}
   *   <li>{@link CalculationTaskCell#getReportingCurrency()}
   *   <li>{@link CalculationTaskCell#getRowIndex()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int CalculationTaskCell.getColumnIndex()",
    "Measure CalculationTaskCell.getMeasure()",
    "ReportingCurrency CalculationTaskCell.getReportingCurrency()",
    "int CalculationTaskCell.getRowIndex()",
    "String CalculationTaskCell.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableMeasure measure = ImmutableMeasure.of("Name");
    CalculationTaskCell ofResult = CalculationTaskCell.of(1, 1, measure, ReportingCurrency.NATURAL);

    // Act
    String actualToStringResult = ofResult.toString();
    int actualColumnIndex = ofResult.getColumnIndex();
    Measure actualMeasure = ofResult.getMeasure();
    ReportingCurrency actualReportingCurrency = ofResult.getReportingCurrency();

    // Assert
    assertEquals(
        "CalculationTaskCell[(1, 1), measure=Name, currency=Natural]", actualToStringResult);
    assertEquals(1, actualColumnIndex);
    assertEquals(1, ofResult.getRowIndex());
    assertSame(measure, actualMeasure);
    assertSame(ReportingCurrency.NATURAL, actualReportingCurrency);
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}, and {@link CalculationTaskCell#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTaskCell#equals(Object)}
   *   <li>{@link CalculationTaskCell#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);
    CalculationTaskCell ofResult2 =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}, and {@link CalculationTaskCell#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalculationTaskCell#equals(Object)}
   *   <li>{@link CalculationTaskCell#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL), 1);
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, mock(Measure.class), ReportingCurrency.NATURAL);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL));
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(0, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL));
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 0, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL));
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    CalculationTaskCell ofResult =
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NONE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL));
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL), null);
  }

  /**
   * Test {@link CalculationTaskCell#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskCell#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CalculationTaskCell.equals(Object)",
    "int CalculationTaskCell.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CalculationTaskCell.of(1, 1, ImmutableMeasure.of("Name"), ReportingCurrency.NATURAL),
        "Different type to CalculationTaskCell");
  }
}
