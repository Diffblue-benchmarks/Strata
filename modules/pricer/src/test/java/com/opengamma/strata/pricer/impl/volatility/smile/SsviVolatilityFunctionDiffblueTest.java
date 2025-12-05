package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SsviVolatilityFunctionDiffblueTest {
  /**
   * Test {@link SsviVolatilityFunction#volatility(double, double, double, SsviFormulaData)} with
   * {@code double}, {@code double}, {@code double}, {@code SsviFormulaData}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviVolatilityFunction#volatility(double, double, double,
   * SsviFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SsviFormulaData) with 'double', 'double', 'double', 'SsviFormulaData'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SsviVolatilityFunction.volatility(double, double, double, SsviFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSsviFormulaData_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        SsviVolatilityFunction.DEFAULT.volatility(
            10.0d, 10.0d, 10.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d)));
  }

  /**
   * Test {@link SsviVolatilityFunction#volatilityAdjoint(double, double, double, SsviFormulaData)}
   * with {@code double}, {@code double}, {@code double}, {@code SsviFormulaData}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#volatilityAdjoint(double, double, double,
   * SsviFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SsviFormulaData) with 'double', 'double', 'double', 'SsviFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives SsviVolatilityFunction.volatilityAdjoint(double, double, double, SsviFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSsviFormulaData() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SsviVolatilityFunction.DEFAULT
            .volatilityAdjoint(10.0d, 10.0d, 10.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d))
            .getDerivatives();
    assertEquals(-0.158113883008419d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.158113883008419d, toListResult.get(1).doubleValue());
    assertEquals(0.158113883008419d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.158113883008419d, -0.158113883008419d, 0.0d, 1.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SsviVolatilityFunction#volatilityAdjoint(double, double, double, SsviFormulaData)}
   * with {@code double}, {@code double}, {@code double}, {@code SsviFormulaData}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#volatilityAdjoint(double, double, double,
   * SsviFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SsviFormulaData) with 'double', 'double', 'double', 'SsviFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives SsviVolatilityFunction.volatilityAdjoint(double, double, double, SsviFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSsviFormulaData2() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SsviVolatilityFunction.DEFAULT
            .volatilityAdjoint(10.0d, 10.0d, 10.0d, SsviFormulaData.of(10.0d, 0.5d, 10.0d))
            .getDerivatives();
    assertEquals(-0.0790569415042095d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.0790569415042095d, toListResult.get(0).doubleValue());
    assertEquals(0.0790569415042095d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {-0.0790569415042095d, 0.0790569415042095d, 0.0d, 1.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SsviVolatilityFunction#volatilityAdjoint2(double, double, double, SsviFormulaData,
   * double[], double[][])} with {@code double}, {@code double}, {@code double}, {@code
   * SsviFormulaData}, {@code double[]}, {@code double[][]}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#volatilityAdjoint2(double, double, double,
   * SsviFormulaData, double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint2(double, double, double, SsviFormulaData, double[], double[][]) with 'double', 'double', 'double', 'SsviFormulaData', 'double[]', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SsviVolatilityFunction.volatilityAdjoint2(double, double, double, SsviFormulaData, double[], double[][])"
  })
  void testVolatilityAdjoint2WithDoubleDoubleDoubleSsviFormulaDataDoubleDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            SsviVolatilityFunction.DEFAULT.volatilityAdjoint2(
                10.0d,
                10.0d,
                10.0d,
                SsviFormulaData.of(10.0d, -1.0d, 10.0d),
                new double[] {
                  10.0d,
                  SsviVolatilityFunction.MIN_TIME_TO_EXPIRY,
                  10.0d,
                  SsviVolatilityFunction.MIN_TIME_TO_EXPIRY
                },
                new double[][] {
                  new double[] {
                    10.0d,
                    SsviVolatilityFunction.MIN_TIME_TO_EXPIRY,
                    10.0d,
                    SsviVolatilityFunction.MIN_TIME_TO_EXPIRY
                  }
                }));
  }

  /**
   * Test {@link SsviVolatilityFunction#meta()}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SsviVolatilityFunction.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SsviVolatilityFunction> actualMetaResult = SsviVolatilityFunction.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    assertTrue(actualMetaResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaResult.isBuildable());
    Class<SsviVolatilityFunction> expectedBeanTypeResult = SsviVolatilityFunction.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SsviVolatilityFunction#metaBean()}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SsviVolatilityFunction.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<SsviVolatilityFunction> actualMetaBeanResult =
        SsviVolatilityFunction.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    assertTrue(actualMetaBeanResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SsviVolatilityFunction> expectedBeanTypeResult = SsviVolatilityFunction.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SsviVolatilityFunction#equals(Object)}, and {@link
   * SsviVolatilityFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SsviVolatilityFunction#equals(Object)}
   *   <li>{@link SsviVolatilityFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SsviVolatilityFunction.equals(Object)",
    "int SsviVolatilityFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SsviVolatilityFunction ssviVolatilityFunction = SsviVolatilityFunction.DEFAULT;
    SsviVolatilityFunction ssviVolatilityFunction2 = SsviVolatilityFunction.DEFAULT;

    // Act and Assert
    assertEquals(ssviVolatilityFunction, ssviVolatilityFunction2);
    assertEquals(ssviVolatilityFunction.hashCode(), ssviVolatilityFunction2.hashCode());
  }

  /**
   * Test {@link SsviVolatilityFunction#equals(Object)}, and {@link
   * SsviVolatilityFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SsviVolatilityFunction#equals(Object)}
   *   <li>{@link SsviVolatilityFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SsviVolatilityFunction.equals(Object)",
    "int SsviVolatilityFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SsviVolatilityFunction ssviVolatilityFunction = SsviVolatilityFunction.DEFAULT;

    // Act and Assert
    assertEquals(ssviVolatilityFunction, ssviVolatilityFunction);
    int expectedHashCodeResult = ssviVolatilityFunction.hashCode();
    assertEquals(expectedHashCodeResult, ssviVolatilityFunction.hashCode());
  }

  /**
   * Test {@link SsviVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SsviVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SsviVolatilityFunction.equals(Object)",
    "int SsviVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SsviVolatilityFunction.DEFAULT, 1);
  }

  /**
   * Test {@link SsviVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SsviVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SsviVolatilityFunction.equals(Object)",
    "int SsviVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SsviVolatilityFunction.DEFAULT, null);
  }

  /**
   * Test {@link SsviVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SsviVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SsviVolatilityFunction.equals(Object)",
    "int SsviVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SsviVolatilityFunction.DEFAULT, "Different type to SsviVolatilityFunction");
  }

  /**
   * Test {@link SsviVolatilityFunction#toString()}.
   *
   * <p>Method under test: {@link SsviVolatilityFunction#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String SsviVolatilityFunction.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("SsviVolatilityFunction{}", SsviVolatilityFunction.DEFAULT.toString());
  }
}
