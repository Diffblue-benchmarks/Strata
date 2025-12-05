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

class SsviFormulaDataDiffblueTest {
  /**
   * Test {@link SsviFormulaData#of(double, double, double)} with {@code sigma}, {@code rho}, {@code
   * eta}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return Parameters min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#of(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double) with 'sigma', 'rho', 'eta'; when minus one; then return Parameters min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SsviFormulaData SsviFormulaData.of(double, double, double)"})
  void testOfWithSigmaRhoEta_whenMinusOne_thenReturnParametersMinIsMinusOne() {
    // Arrange and Act
    SsviFormulaData actualOfResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Assert
    DoubleArray parameters = actualOfResult.getParameters();
    assertEquals(-1.0d, parameters.min());
    assertEquals(-1.0d, actualOfResult.getRho());
    assertEquals(1, parameters.dimensions());
    assertEquals(10.0d, parameters.max());
    assertEquals(10.0d, actualOfResult.getEta());
    assertEquals(10.0d, actualOfResult.getSigma());
    assertEquals(19.0d, parameters.sum());
    assertEquals(3, parameters.size());
    assertEquals(3, actualOfResult.getNumberOfParameters());
    assertEquals(3, parameters.toList().size());
    assertFalse(parameters.isEmpty());
    assertArrayEquals(new double[] {10.0d, -1.0d, 10.0d}, parameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SsviFormulaData#getSigma()}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#getSigma()}
   */
  @Test
  @DisplayName("Test getSigma(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SsviFormulaData.getSigma()"})
  void testGetSigma_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d).getSigma());
  }

  /**
   * Test {@link SsviFormulaData#getRho()}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#getRho()}
   */
  @Test
  @DisplayName("Test getRho(); then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SsviFormulaData.getRho()"})
  void testGetRho_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d).getRho());
  }

  /**
   * Test {@link SsviFormulaData#getEta()}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#getEta()}
   */
  @Test
  @DisplayName("Test getEta(); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SsviFormulaData.getEta()"})
  void testGetEta_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d).getEta());
  }

  /**
   * Test {@link SsviFormulaData#withSigma(double)}.
   *
   * <ul>
   *   <li>Then return {@link SsviFormulaData} with sigma is ten and rho is minus one and eta is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#withSigma(double)}
   */
  @Test
  @DisplayName(
      "Test withSigma(double); then return SsviFormulaData with sigma is ten and rho is minus one and eta is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SsviFormulaData SsviFormulaData.withSigma(double)"})
  void testWithSigma_thenReturnSsviFormulaDataWithSigmaIsTenAndRhoIsMinusOneAndEtaIsTen() {
    // Arrange
    SsviFormulaData ofResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Act
    SsviFormulaData actualWithSigmaResult = ofResult.withSigma(10.0d);

    // Assert
    assertEquals(ofResult, actualWithSigmaResult);
  }

  /**
   * Test {@link SsviFormulaData#withRho(double)}.
   *
   * <ul>
   *   <li>Then return {@link SsviFormulaData} with sigma is ten and rho is minus one and eta is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#withRho(double)}
   */
  @Test
  @DisplayName(
      "Test withRho(double); then return SsviFormulaData with sigma is ten and rho is minus one and eta is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SsviFormulaData SsviFormulaData.withRho(double)"})
  void testWithRho_thenReturnSsviFormulaDataWithSigmaIsTenAndRhoIsMinusOneAndEtaIsTen() {
    // Arrange
    SsviFormulaData ofResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Act
    SsviFormulaData actualWithRhoResult = ofResult.withRho(-1.0d);

    // Assert
    assertEquals(ofResult, actualWithRhoResult);
  }

  /**
   * Test {@link SsviFormulaData#withEta(double)}.
   *
   * <ul>
   *   <li>Then return {@link SsviFormulaData} with sigma is ten and rho is minus one and eta is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#withEta(double)}
   */
  @Test
  @DisplayName(
      "Test withEta(double); then return SsviFormulaData with sigma is ten and rho is minus one and eta is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SsviFormulaData SsviFormulaData.withEta(double)"})
  void testWithEta_thenReturnSsviFormulaDataWithSigmaIsTenAndRhoIsMinusOneAndEtaIsTen() {
    // Arrange
    SsviFormulaData ofResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Act
    SsviFormulaData actualWithEtaResult = ofResult.withEta(10.0d);

    // Assert
    assertEquals(ofResult, actualWithEtaResult);
  }

  /**
   * Test {@link SsviFormulaData#getParameter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when one; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SsviFormulaData.getParameter(int)"})
  void testGetParameter_whenOne_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1.0d, SsviFormulaData.of(10.0d, -1.0d, 10.0d).getParameter(1));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(2, 0.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(0, 0.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0000000000000002}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when '-1.0000000000000002'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_when10000000000000002_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(1, -1.0000000000000002d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when minus one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenMinusOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(1, -1.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(-1, 10.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(1, 10.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(2, 10.0d));
  }

  /**
   * Test {@link SsviFormulaData#isAllowed(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#isAllowed(int, double)}
   */
  @Test
  @DisplayName("Test isAllowed(int, double); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.isAllowed(int, double)"})
  void testIsAllowed_whenTen_thenReturnTrue2() {
    // Arrange, Act and Assert
    assertTrue(SsviFormulaData.of(10.0d, -1.0d, 10.0d).isAllowed(0, 10.0d));
  }

  /**
   * Test {@link SsviFormulaData#with(int, double)}.
   *
   * <ul>
   *   <li>Then return {@link SsviFormulaData} with sigma is ten and rho is minus one and eta is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#with(int, double)}
   */
  @Test
  @DisplayName(
      "Test with(int, double); then return SsviFormulaData with sigma is ten and rho is minus one and eta is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SsviFormulaData SsviFormulaData.with(int, double)"})
  void testWith_thenReturnSsviFormulaDataWithSigmaIsTenAndRhoIsMinusOneAndEtaIsTen() {
    // Arrange
    SsviFormulaData ofResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Act
    SsviFormulaData actualWithResult = ofResult.with(2, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithResult);
  }

  /**
   * Test {@link SsviFormulaData#meta()}.
   *
   * <p>Method under test: {@link SsviFormulaData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SsviFormulaData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SsviFormulaData> actualMetaResult = SsviFormulaData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SsviFormulaData> expectedBeanTypeResult = SsviFormulaData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SsviFormulaData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SsviFormulaData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<SsviFormulaData> actualMetaBeanResult =
        SsviFormulaData.of(10.0d, -1.0d, 10.0d).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SsviFormulaData> expectedBeanTypeResult = SsviFormulaData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SsviFormulaData#equals(Object)}, and {@link SsviFormulaData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SsviFormulaData#equals(Object)}
   *   <li>{@link SsviFormulaData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.equals(Object)", "int SsviFormulaData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SsviFormulaData ofResult = SsviFormulaData.of(10.0d, -1.0d, 10.0d);
    SsviFormulaData ofResult2 = SsviFormulaData.of(10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SsviFormulaData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.equals(Object)", "int SsviFormulaData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SsviFormulaData.of(10.0d, -1.0d, 10.0d), 1);
  }

  /**
   * Test {@link SsviFormulaData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SsviFormulaData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SsviFormulaData.equals(Object)", "int SsviFormulaData.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(SsviFormulaData.of(10.0d, -1.0d, 10.0d), null);
  }
}
