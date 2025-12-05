package com.opengamma.strata.pricer.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HullWhiteOneFactorPiecewiseConstantParametersDiffblueTest {
  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#of(double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is one thousand.
   *   <li>Then return VolatilityTime min is zero.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#of(double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, DoubleArray, DoubleArray); when DoubleArray with value is one thousand; then return VolatilityTime min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParameters HullWhiteOneFactorPiecewiseConstantParameters.of(double, DoubleArray, DoubleArray)"
  })
  void testOf_whenDoubleArrayWithValueIsOneThousand_thenReturnVolatilityTimeMinIsZero() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(1000.0d);

    // Act
    HullWhiteOneFactorPiecewiseConstantParameters actualOfResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Assert
    DoubleArray volatilityTime = actualOfResult.getVolatilityTime();
    assertEquals(0.0d, volatilityTime.min());
    assertEquals(1, volatilityTime.dimensions());
    assertEquals(10.0d, actualOfResult.getMeanReversion());
    assertEquals(1000.0d, volatilityTime.max());
    assertEquals(1000.0d, volatilityTime.sum());
    assertEquals(1000.0d, actualOfResult.getLastVolatility());
    assertEquals(2, volatilityTime.size());
    assertEquals(2, volatilityTime.toList().size());
    assertFalse(volatilityTime.isEmpty());
    assertSame(volatility, actualOfResult.getVolatility());
    assertArrayEquals(new double[] {0.0d, 1000.0d}, volatilityTime.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#withVolatility(DoubleArray)}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParameters#withVolatility(DoubleArray)}
   */
  @Test
  @DisplayName("Test withVolatility(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParameters HullWhiteOneFactorPiecewiseConstantParameters.withVolatility(DoubleArray)"
  })
  void testWithVolatility() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act
    HullWhiteOneFactorPiecewiseConstantParameters actualWithVolatilityResult =
        ofResult.withVolatility(DoubleArray.of(10.0d));

    // Assert
    assertEquals(ofResult, actualWithVolatilityResult);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#getLastVolatility()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#getLastVolatility()}
   */
  @Test
  @DisplayName("Test getLastVolatility(); given DoubleArray with value is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double HullWhiteOneFactorPiecewiseConstantParameters.getLastVolatility()"})
  void testGetLastVolatility_givenDoubleArrayWithValueIsTen_thenReturnTen() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act and Assert
    assertEquals(10.0d, ofResult.getLastVolatility());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#withLastVolatility(double)}.
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParameters#withLastVolatility(double)}
   */
  @Test
  @DisplayName("Test withLastVolatility(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParameters HullWhiteOneFactorPiecewiseConstantParameters.withLastVolatility(double)"
  })
  void testWithLastVolatility() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act
    HullWhiteOneFactorPiecewiseConstantParameters actualWithLastVolatilityResult =
        ofResult.withLastVolatility(10.0d);

    // Assert
    assertEquals(ofResult, actualWithLastVolatilityResult);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#withVolatilityAdded(double, double)}.
   *
   * <ul>
   *   <li>Then return VolatilityTime min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantParameters#withVolatilityAdded(double, double)}
   */
  @Test
  @DisplayName("Test withVolatilityAdded(double, double); then return VolatilityTime min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HullWhiteOneFactorPiecewiseConstantParameters HullWhiteOneFactorPiecewiseConstantParameters.withVolatilityAdded(double, double)"
  })
  void testWithVolatilityAdded_thenReturnVolatilityTimeMinIsZero() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act
    HullWhiteOneFactorPiecewiseConstantParameters actualWithVolatilityAddedResult =
        ofResult.withVolatilityAdded(10.0d, 10.0d);

    // Assert
    DoubleArray volatilityTime = actualWithVolatilityAddedResult.getVolatilityTime();
    assertEquals(0.0d, volatilityTime.min());
    DoubleArray volatility2 = actualWithVolatilityAddedResult.getVolatility();
    assertEquals(1, volatility2.dimensions());
    assertEquals(1, volatilityTime.dimensions());
    assertEquals(10.0d, volatility2.max());
    assertEquals(10.0d, volatility2.min());
    assertEquals(10.0d, actualWithVolatilityAddedResult.getLastVolatility());
    assertEquals(10.0d, actualWithVolatilityAddedResult.getMeanReversion());
    assertEquals(1000.0d, volatilityTime.max());
    assertEquals(1010.0d, volatilityTime.sum());
    assertEquals(2, volatility2.size());
    assertEquals(2, volatility2.toList().size());
    assertEquals(20.0d, volatility2.sum());
    assertEquals(3, volatilityTime.size());
    assertEquals(3, volatilityTime.toList().size());
    assertFalse(volatility2.isEmpty());
    assertFalse(volatilityTime.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d}, volatility2.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.0d, 10.0d, 1000.0d}, volatilityTime.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#meta()}.
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean HullWhiteOneFactorPiecewiseConstantParameters.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<HullWhiteOneFactorPiecewiseConstantParameters> actualMetaResult =
        HullWhiteOneFactorPiecewiseConstantParameters.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("meanReversion"));
    assertTrue(metaPropertyMapResult.containsKey("volatility"));
    assertTrue(metaPropertyMapResult.containsKey("volatilityTime"));
    assertTrue(actualMetaResult.isBuildable());
    Class<HullWhiteOneFactorPiecewiseConstantParameters> expectedBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given DoubleArray with value is ten; then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean HullWhiteOneFactorPiecewiseConstantParameters.metaBean()"})
  void testMetaBean_givenDoubleArrayWithValueIsTen_thenReturnLightMetaBean() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());

    // Act
    TypedMetaBean<HullWhiteOneFactorPiecewiseConstantParameters> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("meanReversion"));
    assertTrue(metaPropertyMapResult.containsKey("volatility"));
    assertTrue(metaPropertyMapResult.containsKey("volatilityTime"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<HullWhiteOneFactorPiecewiseConstantParameters> expectedBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantParameters.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}, and {@link
   * HullWhiteOneFactorPiecewiseConstantParameters#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantParameters#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParameters.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParameters.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    DoubleArray volatility2 = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult2 =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility2, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParameters.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParameters.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);

    // Act and Assert
    assertNotEquals(
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of()), 1);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParameters.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParameters.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);

    // Act and Assert
    assertNotEquals(
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of()),
        null);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParameters.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParameters.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(10.0d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(1000.0d, volatility, DoubleArray.of());
    DoubleArray volatility2 = DoubleArray.of(10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility2, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantParameters#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantParameters.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantParameters.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DoubleArray volatility = DoubleArray.of(0.5d);
    HullWhiteOneFactorPiecewiseConstantParameters ofResult =
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility, DoubleArray.of());
    DoubleArray volatility2 = DoubleArray.of(10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult,
        HullWhiteOneFactorPiecewiseConstantParameters.of(10.0d, volatility2, DoubleArray.of()));
  }
}
