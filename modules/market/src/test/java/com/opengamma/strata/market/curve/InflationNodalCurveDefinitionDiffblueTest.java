package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ShiftType;
import java.time.Month;
import java.time.YearMonth;
import java.util.Collection;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InflationNodalCurveDefinitionDiffblueTest {
  /**
   * Test {@link InflationNodalCurveDefinition#InflationNodalCurveDefinition(NodalCurveDefinition,
   * YearMonth, double, SeasonalityDefinition)}.
   *
   * <p>Method under test: {@link
   * InflationNodalCurveDefinition#InflationNodalCurveDefinition(NodalCurveDefinition, YearMonth,
   * double, SeasonalityDefinition)}
   */
  @Test
  @DisplayName(
      "Test new InflationNodalCurveDefinition(NodalCurveDefinition, YearMonth, double, SeasonalityDefinition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void InflationNodalCurveDefinition.<init>(NodalCurveDefinition, YearMonth, double, SeasonalityDefinition)"
  })
  void testNewInflationNodalCurveDefinition() {
    // Arrange
    YearMonth lastFixingMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationNodalCurveDefinition actualInflationNodalCurveDefinition =
        new InflationNodalCurveDefinition(null, lastFixingMonth, 10.0d, null);

    // Assert
    assertNull(actualInflationNodalCurveDefinition.getCurveWithoutFixingDefinition());
    SeasonalityDefinition seasonalityDefinition =
        actualInflationNodalCurveDefinition.getSeasonalityDefinition();
    DoubleArray seasonalityMonthOnMonth = seasonalityDefinition.getSeasonalityMonthOnMonth();
    assertEquals(1, seasonalityMonthOnMonth.dimensions());
    assertEquals(1.0d, seasonalityMonthOnMonth.max());
    assertEquals(1.0d, seasonalityMonthOnMonth.min());
    assertEquals(10.0d, actualInflationNodalCurveDefinition.getLastFixingValue());
    assertEquals(12, seasonalityMonthOnMonth.size());
    assertEquals(12, seasonalityMonthOnMonth.toList().size());
    assertEquals(12.0d, seasonalityMonthOnMonth.sum());
    assertEquals(ShiftType.SCALED, seasonalityDefinition.getAdjustmentType());
    assertFalse(seasonalityMonthOnMonth.isEmpty());
    assertSame(lastFixingMonth, actualInflationNodalCurveDefinition.getLastFixingMonth());
    assertArrayEquals(
        new double[] {1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d},
        seasonalityMonthOnMonth.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InflationNodalCurveDefinition#meta()}.
   *
   * <p>Method under test: {@link InflationNodalCurveDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean InflationNodalCurveDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = InflationNodalCurveDefinition.meta();

    // Assert
    Iterable<MetaProperty<?>> metaPropertyIterableResult = actualMetaResult.metaPropertyIterable();
    assertTrue(metaPropertyIterableResult instanceof Collection);
    assertEquals(
        "com.opengamma.strata.market.curve.InflationNodalCurveDefinition",
        actualMetaResult.beanName());
    assertEquals(1, actualMetaResult.annotations().size());
    assertEquals(4, ((Collection<MetaProperty<?>>) metaPropertyIterableResult).size());
    assertEquals(4, actualMetaResult.metaPropertyCount());
  }
}
