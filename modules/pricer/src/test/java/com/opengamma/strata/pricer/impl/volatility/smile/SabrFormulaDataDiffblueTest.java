package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

class SabrFormulaDataDiffblueTest {
  /**
   * Test {@link SabrFormulaData#of(double, double, double, double)} with {@code alpha}, {@code
   * beta}, {@code rho}, {@code nu}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return Parameters min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#of(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double) with 'alpha', 'beta', 'rho', 'nu'; when minus one; then return Parameters min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.of(double, double, double, double)"})
  void testOfWithAlphaBetaRhoNu_whenMinusOne_thenReturnParametersMinIsMinusOne() {
    // Arrange and Act
    SabrFormulaData actualOfResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Assert
    DoubleArray parameters = actualOfResult.getParameters();
    assertEquals(-1.0d, parameters.min());
    assertEquals(-1.0d, actualOfResult.getRho());
    assertEquals(1, parameters.dimensions());
    assertEquals(10.0d, parameters.max());
    assertEquals(10.0d, actualOfResult.getAlpha());
    assertEquals(10.0d, actualOfResult.getBeta());
    assertEquals(10.0d, actualOfResult.getNu());
    assertEquals(29.0d, parameters.sum());
    assertEquals(4, parameters.size());
    assertEquals(4, actualOfResult.getNumberOfParameters());
    assertEquals(4, parameters.toList().size());
    assertFalse(parameters.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, -1.0d, 10.0d}, parameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrFormulaData#of(double[])} with {@code parameters}.
   *
   * <ul>
   *   <li>Then return Parameters min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#of(double[])}
   */
  @Test
  @DisplayName("Test of(double[]) with 'parameters'; then return Parameters min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.of(double[])"})
  void testOfWithParameters_thenReturnParametersMinIsMinusOne() {
    // Arrange and Act
    SabrFormulaData actualOfResult = SabrFormulaData.of(new double[] {10.0d, 10.0d, -1.0d, 10.0d});

    // Assert
    DoubleArray parameters = actualOfResult.getParameters();
    assertEquals(-1.0d, parameters.min());
    assertEquals(-1.0d, actualOfResult.getRho());
    assertEquals(1, parameters.dimensions());
    assertEquals(10.0d, parameters.max());
    assertEquals(10.0d, actualOfResult.getAlpha());
    assertEquals(10.0d, actualOfResult.getBeta());
    assertEquals(10.0d, actualOfResult.getNu());
    assertEquals(29.0d, parameters.sum());
    assertEquals(4, parameters.size());
    assertEquals(4, actualOfResult.getNumberOfParameters());
    assertEquals(4, parameters.toList().size());
    assertFalse(parameters.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, -1.0d, 10.0d}, parameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrFormulaData#getAlpha()}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#getAlpha()}
   */
  @Test
  @DisplayName("Test getAlpha(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrFormulaData.getAlpha()"})
  void testGetAlpha_thenReturnTen() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.getAlpha());
  }

  /**
   * Test {@link SabrFormulaData#getBeta()}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#getBeta()}
   */
  @Test
  @DisplayName("Test getBeta(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrFormulaData.getBeta()"})
  void testGetBeta_thenReturnTen() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.getBeta());
  }

  /**
   * Test {@link SabrFormulaData#getRho()}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#getRho()}
   */
  @Test
  @DisplayName("Test getRho(); then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrFormulaData.getRho()"})
  void testGetRho_thenReturnMinusOne() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.getRho());
  }

  /**
   * Test {@link SabrFormulaData#getNu()}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#getNu()}
   */
  @Test
  @DisplayName("Test getNu(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrFormulaData.getNu()"})
  void testGetNu_thenReturnTen() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.getNu());
  }

  /**
   * Test {@link SabrFormulaData#withAlpha(double)}.
   *
   * <p>Method under test: {@link SabrFormulaData#withAlpha(double)}
   */
  @Test
  @DisplayName("Test withAlpha(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.withAlpha(double)"})
  void testWithAlpha() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualWithAlphaResult = ofResult.withAlpha(10.0d);

    // Assert
    assertEquals(ofResult, actualWithAlphaResult);
  }

  /**
   * Test {@link SabrFormulaData#withBeta(double)}.
   *
   * <p>Method under test: {@link SabrFormulaData#withBeta(double)}
   */
  @Test
  @DisplayName("Test withBeta(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.withBeta(double)"})
  void testWithBeta() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualWithBetaResult = ofResult.withBeta(10.0d);

    // Assert
    assertEquals(ofResult, actualWithBetaResult);
  }

  /**
   * Test {@link SabrFormulaData#withRho(double)}.
   *
   * <p>Method under test: {@link SabrFormulaData#withRho(double)}
   */
  @Test
  @DisplayName("Test withRho(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.withRho(double)"})
  void testWithRho() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualWithRhoResult = ofResult.withRho(-1.0d);

    // Assert
    assertEquals(ofResult, actualWithRhoResult);
  }

  /**
   * Test {@link SabrFormulaData#withNu(double)}.
   *
   * <p>Method under test: {@link SabrFormulaData#withNu(double)}
   */
  @Test
  @DisplayName("Test withNu(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.withNu(double)"})
  void testWithNu() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualWithNuResult = ofResult.withNu(10.0d);

    // Assert
    assertEquals(ofResult, actualWithNuResult);
  }

  /**
   * Test {@link SabrFormulaData#getParameter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrFormulaData.getParameter(int)"})
  void testGetParameter_whenOne_thenReturnTen() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.getParameter(1));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_thenReturnFalse() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertFalse(ofResult.isAllowed(1, -1.0d));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_thenReturnTrue() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertTrue(ofResult.isAllowed(2, -1.0d));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0000000000000002}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when '-1.0000000000000002'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_when10000000000000002_thenReturnFalse() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertFalse(ofResult.isAllowed(2, -1.0000000000000002d));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenReturnFalse() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertFalse(ofResult.isAllowed(2, 10.0d));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenReturnTrue() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertTrue(ofResult.isAllowed(1, 10.0d));
  }

  /**
   * Test {@link SabrFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenThrowIllegalArgumentException() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.isAllowed(-1, 10.0d));
  }

  /**
   * Test {@link SabrFormulaData#with(int, double)}.
   *
   * <p>Method under test: {@link SabrFormulaData#with(int, double)}
   */
  @Test
  @DisplayName("Test with(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrFormulaData SabrFormulaData.with(int, double)"})
  void testWith() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualWithResult = ofResult.with(1, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithResult);
  }

  /**
   * Test {@link SabrFormulaData#meta()}.
   *
   * <p>Method under test: {@link SabrFormulaData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrFormulaData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SabrFormulaData> actualMetaResult = SabrFormulaData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SabrFormulaData> expectedBeanTypeResult = SabrFormulaData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SabrFormulaData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrFormulaData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    TypedMetaBean<SabrFormulaData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SabrFormulaData> expectedBeanTypeResult = SabrFormulaData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SabrFormulaData#equals(Object)}, and {@link SabrFormulaData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrFormulaData#equals(Object)}
   *   <li>{@link SabrFormulaData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.equals(Object)", "int SabrFormulaData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SabrFormulaData ofResult = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrFormulaData ofResult2 = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SabrFormulaData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.equals(Object)", "int SabrFormulaData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d), 1);
  }

  /**
   * Test {@link SabrFormulaData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrFormulaData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SabrFormulaData.equals(Object)", "int SabrFormulaData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d), null);
  }
}
