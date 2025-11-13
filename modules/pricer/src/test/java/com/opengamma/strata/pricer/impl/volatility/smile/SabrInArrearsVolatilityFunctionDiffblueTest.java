package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrInArrearsVolatilityFunction.Builder;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrInArrearsVolatilityFunction.Meta;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrInArrearsVolatilityFunctionDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SabrInArrearsVolatilityFunction.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SabrInArrearsVolatilityFunction.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return build Q is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return build Q is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuildQIsZero() {
    // Arrange
    Builder builderResult = SabrInArrearsVolatilityFunction.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertEquals(0.0d, actualSetResult.build().getQ());
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrBeforeStart(SabrFormulaData, double,
   * double)}.
   *
   * <p>Method under test: {@link
   * SabrInArrearsVolatilityFunction#effectiveSabrBeforeStart(SabrFormulaData, double, double)}
   */
  @Test
  @DisplayName("Test effectiveSabrBeforeStart(SabrFormulaData, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrFormulaData SabrInArrearsVolatilityFunction.effectiveSabrBeforeStart(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrBeforeStart() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualEffectiveSabrBeforeStartResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrBeforeStart(parameters, 10.0d, 10.0d);

    // Assert
    assertEquals(parameters, actualEffectiveSabrBeforeStartResult);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrAfterStart(SabrFormulaData, double,
   * double)}.
   *
   * <ul>
   *   <li>Then return Parameters min is {@code -0.950381926622983}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrInArrearsVolatilityFunction#effectiveSabrAfterStart(SabrFormulaData, double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabrAfterStart(SabrFormulaData, double, double); then return Parameters min is '-0.950381926622983'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrFormulaData SabrInArrearsVolatilityFunction.effectiveSabrAfterStart(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrAfterStart_thenReturnParametersMinIs0950381926622983() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualEffectiveSabrAfterStartResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrAfterStart(parameters, 10.0d, 10.0d);

    // Assert
    DoubleArray parameters2 = actualEffectiveSabrAfterStartResult.getParameters();
    assertEquals(-0.950381926622983d, parameters2.min());
    assertEquals(-0.950381926622983d, actualEffectiveSabrAfterStartResult.getRho());
    assertEquals(1, parameters2.dimensions());
    assertEquals(10.0d, actualEffectiveSabrAfterStartResult.getBeta());
    assertEquals(4, parameters2.size());
    assertEquals(4, actualEffectiveSabrAfterStartResult.getNumberOfParameters());
    assertEquals(4, parameters2.toList().size());
    assertEquals(7.28991475552747d, actualEffectiveSabrAfterStartResult.getNu());
    assertFalse(parameters2.isEmpty());
    assertEquals(Double.POSITIVE_INFINITY, parameters2.max());
    assertEquals(Double.POSITIVE_INFINITY, parameters2.sum());
    assertEquals(Double.POSITIVE_INFINITY, actualEffectiveSabrAfterStartResult.getAlpha());
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY, 10.0d, -0.950381926622983d, 7.28991475552747d},
        parameters2.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabr(SabrFormulaData, double, double)}.
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#effectiveSabr(SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName("Test effectiveSabr(SabrFormulaData, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrFormulaData SabrInArrearsVolatilityFunction.effectiveSabr(SabrFormulaData, double, double)"
  })
  void testEffectiveSabr() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualEffectiveSabrResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabr(parameters, 10.0d, 10.0d);

    // Assert
    assertEquals(parameters, actualEffectiveSabrResult);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabr(SabrFormulaData, double, double)}.
   *
   * <ul>
   *   <li>Then return Parameters min is {@code -0.950381926622983}.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#effectiveSabr(SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabr(SabrFormulaData, double, double); then return Parameters min is '-0.950381926622983'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrFormulaData SabrInArrearsVolatilityFunction.effectiveSabr(SabrFormulaData, double, double)"
  })
  void testEffectiveSabr_thenReturnParametersMinIs0950381926622983() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrFormulaData actualEffectiveSabrResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabr(parameters, 0.0d, 10.0d);

    // Assert
    DoubleArray parameters2 = actualEffectiveSabrResult.getParameters();
    assertEquals(-0.950381926622983d, parameters2.min());
    assertEquals(-0.950381926622983d, actualEffectiveSabrResult.getRho());
    assertEquals(0.002234218205105832d, actualEffectiveSabrResult.getAlpha());
    assertEquals(1, parameters2.dimensions());
    assertEquals(10.0d, parameters2.max());
    assertEquals(10.0d, actualEffectiveSabrResult.getBeta());
    assertEquals(16.34176704710959d, parameters2.sum());
    assertEquals(4, parameters2.size());
    assertEquals(4, actualEffectiveSabrResult.getNumberOfParameters());
    assertEquals(4, parameters2.toList().size());
    assertEquals(7.28991475552747d, actualEffectiveSabrResult.getNu());
    assertFalse(parameters2.isEmpty());
    assertArrayEquals(
        new double[] {0.002234218205105832d, 10.0d, -0.950381926622983d, 7.28991475552747d},
        parameters2.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrAfterStartAd(SabrFormulaData, double,
   * double)}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrInArrearsVolatilityFunction#effectiveSabrAfterStartAd(SabrFormulaData, double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabrAfterStartAd(SabrFormulaData, double, double); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SabrInArrearsVolatilityFunction.effectiveSabrAfterStartAd(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrAfterStartAd_thenReturnSizeIsFour() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    List<ValueDerivatives> actualEffectiveSabrAfterStartAdResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrAfterStartAd(parameters, 10.0d, 10.0d);

    // Assert
    assertEquals(4, actualEffectiveSabrAfterStartAdResult.size());
    assertEquals(-0.950381926622983d, actualEffectiveSabrAfterStartAdResult.get(2).getValue());
    assertEquals(10.0d, actualEffectiveSabrAfterStartAdResult.get(1).getValue());
    assertEquals(7.28991475552747d, actualEffectiveSabrAfterStartAdResult.get(3).getValue());
    assertEquals(Double.POSITIVE_INFINITY, actualEffectiveSabrAfterStartAdResult.get(0).getValue());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrBeforeStartAd(SabrFormulaData, double,
   * double)}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrInArrearsVolatilityFunction#effectiveSabrBeforeStartAd(SabrFormulaData, double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabrBeforeStartAd(SabrFormulaData, double, double); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SabrInArrearsVolatilityFunction.effectiveSabrBeforeStartAd(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrBeforeStartAd_thenReturnSizeIsFour() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    List<ValueDerivatives> actualEffectiveSabrBeforeStartAdResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrBeforeStartAd(
            parameters, 10.0d, 10.0d);

    // Assert
    assertEquals(4, actualEffectiveSabrBeforeStartAdResult.size());
    assertEquals(-1.0d, actualEffectiveSabrBeforeStartAdResult.get(2).getValue());
    assertEquals(10.0d, actualEffectiveSabrBeforeStartAdResult.get(0).getValue());
    assertEquals(10.0d, actualEffectiveSabrBeforeStartAdResult.get(1).getValue());
    assertEquals(10.0d, actualEffectiveSabrBeforeStartAdResult.get(3).getValue());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrAd(SabrFormulaData, double, double)}.
   *
   * <ul>
   *   <li>Then return third Value is {@code -0.950381926622983}.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#effectiveSabrAd(SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabrAd(SabrFormulaData, double, double); then return third Value is '-0.950381926622983'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SabrInArrearsVolatilityFunction.effectiveSabrAd(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrAd_thenReturnThirdValueIs0950381926622983() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    List<ValueDerivatives> actualEffectiveSabrAdResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrAd(parameters, 0.0d, 10.0d);

    // Assert
    assertEquals(4, actualEffectiveSabrAdResult.size());
    assertEquals(-0.950381926622983d, actualEffectiveSabrAdResult.get(2).getValue());
    assertEquals(0.002234218205105832d, actualEffectiveSabrAdResult.get(0).getValue());
    assertEquals(7.28991475552747d, actualEffectiveSabrAdResult.get(3).getValue());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#effectiveSabrAd(SabrFormulaData, double, double)}.
   *
   * <ul>
   *   <li>Then return third Value is minus one.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#effectiveSabrAd(SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test effectiveSabrAd(SabrFormulaData, double, double); then return third Value is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List SabrInArrearsVolatilityFunction.effectiveSabrAd(SabrFormulaData, double, double)"
  })
  void testEffectiveSabrAd_thenReturnThirdValueIsMinusOne() {
    // Arrange
    SabrFormulaData parameters = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    List<ValueDerivatives> actualEffectiveSabrAdResult =
        SabrInArrearsVolatilityFunction.DEFAULT.effectiveSabrAd(parameters, 10.0d, 10.0d);

    // Assert
    assertEquals(4, actualEffectiveSabrAdResult.size());
    assertEquals(-1.0d, actualEffectiveSabrAdResult.get(2).getValue());
    assertEquals(10.0d, actualEffectiveSabrAdResult.get(0).getValue());
    assertEquals(10.0d, actualEffectiveSabrAdResult.get(3).getValue());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#meta()}.
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SabrInArrearsVolatilityFunction.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SabrInArrearsVolatilityFunction.meta();

    // Assert
    MetaProperty<Double> qResult = actualMetaResult.q();
    assertTrue(qResult instanceof DirectMetaProperty);
    assertEquals("double", qResult.propertyType().getName());
    assertEquals("q", qResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, qResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SabrInArrearsVolatilityFunction> expectedDeclaringTypeResult =
        SabrInArrearsVolatilityFunction.class;
    assertEquals(expectedDeclaringTypeResult, qResult.declaringType());
    assertSame(Meta.INSTANCE, qResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends SabrInArrearsVolatilityFunction> actualBeanTypeResult =
        SabrInArrearsVolatilityFunction.meta().beanType();

    // Assert
    Class<SabrInArrearsVolatilityFunction> expectedBeanTypeResult =
        SabrInArrearsVolatilityFunction.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    assertEquals(0.0d, SabrInArrearsVolatilityFunction.meta().builder().build().getQ());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SabrInArrearsVolatilityFunction.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code q}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'q'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQ_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SabrInArrearsVolatilityFunction.meta().metaPropertyGet("q");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("q", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<SabrInArrearsVolatilityFunction> expectedDeclaringTypeResult =
        SabrInArrearsVolatilityFunction.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        SabrInArrearsVolatilityFunction.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("q");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("q", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<SabrInArrearsVolatilityFunction> expectedDeclaringTypeResult =
        SabrInArrearsVolatilityFunction.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        SabrInArrearsVolatilityFunction.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link SabrInArrearsVolatilityFunction#DEFAULT}.
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when DEFAULT; then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDefault_thenReturnDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        ((Double)
                SabrInArrearsVolatilityFunction.meta()
                    .propertyGet(SabrInArrearsVolatilityFunction.DEFAULT, "q", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            SabrInArrearsVolatilityFunction.meta()
                .propertyGet(SabrInArrearsVolatilityFunction.DEFAULT, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            SabrInArrearsVolatilityFunction.meta()
                .propertySet(mock(Bean.class), "q", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            SabrInArrearsVolatilityFunction.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code q}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'q'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQ_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SabrInArrearsVolatilityFunction.meta()
                .propertySet(mock(Bean.class), "q", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#q()}.
   *
   * <p>Method under test: {@link Meta#q()}
   */
  @Test
  @DisplayName("Test Meta q()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.q()"})
  void testMetaQ() {
    // Arrange, Act and Assert
    assertTrue(SabrInArrearsVolatilityFunction.meta().q() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#of(double)}.
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#of(double)}
   */
  @Test
  @DisplayName("Test of(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrInArrearsVolatilityFunction SabrInArrearsVolatilityFunction.of(double)"})
  void testOf() {
    // Arrange and Act
    SabrInArrearsVolatilityFunction actualOfResult = SabrInArrearsVolatilityFunction.of(10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getQ());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#metaBean()}.
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SabrInArrearsVolatilityFunction.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, SabrInArrearsVolatilityFunction.DEFAULT.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrInArrearsVolatilityFunction#toString()}
   *   <li>{@link SabrInArrearsVolatilityFunction#getQ()}
   *   <li>{@link SabrInArrearsVolatilityFunction#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrInArrearsVolatilityFunction.getQ()",
    "Builder SabrInArrearsVolatilityFunction.toBuilder()",
    "String SabrInArrearsVolatilityFunction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SabrInArrearsVolatilityFunction sabrInArrearsVolatilityFunction =
        SabrInArrearsVolatilityFunction.DEFAULT;

    // Act
    String actualToStringResult = sabrInArrearsVolatilityFunction.toString();
    double actualQ = sabrInArrearsVolatilityFunction.getQ();
    sabrInArrearsVolatilityFunction.toBuilder();

    // Assert
    assertEquals("SabrInArrearsVolatilityFunction{q=1.0}", actualToStringResult);
    assertEquals(1.0d, actualQ);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#equals(Object)}, and {@link
   * SabrInArrearsVolatilityFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrInArrearsVolatilityFunction#equals(Object)}
   *   <li>{@link SabrInArrearsVolatilityFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrInArrearsVolatilityFunction.equals(Object)",
    "int SabrInArrearsVolatilityFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SabrInArrearsVolatilityFunction sabrInArrearsVolatilityFunction =
        SabrInArrearsVolatilityFunction.DEFAULT;
    SabrInArrearsVolatilityFunction sabrInArrearsVolatilityFunction2 =
        SabrInArrearsVolatilityFunction.DEFAULT;

    // Act and Assert
    assertEquals(sabrInArrearsVolatilityFunction, sabrInArrearsVolatilityFunction2);
    assertEquals(
        sabrInArrearsVolatilityFunction.hashCode(), sabrInArrearsVolatilityFunction2.hashCode());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#equals(Object)}, and {@link
   * SabrInArrearsVolatilityFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrInArrearsVolatilityFunction#equals(Object)}
   *   <li>{@link SabrInArrearsVolatilityFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrInArrearsVolatilityFunction.equals(Object)",
    "int SabrInArrearsVolatilityFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SabrInArrearsVolatilityFunction sabrInArrearsVolatilityFunction =
        SabrInArrearsVolatilityFunction.DEFAULT;

    // Act and Assert
    assertEquals(sabrInArrearsVolatilityFunction, sabrInArrearsVolatilityFunction);
    int expectedHashCodeResult = sabrInArrearsVolatilityFunction.hashCode();
    assertEquals(expectedHashCodeResult, sabrInArrearsVolatilityFunction.hashCode());
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrInArrearsVolatilityFunction.equals(Object)",
    "int SabrInArrearsVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SabrInArrearsVolatilityFunction.builder().q(10.0d).build(),
        SabrInArrearsVolatilityFunction.DEFAULT);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrInArrearsVolatilityFunction.equals(Object)",
    "int SabrInArrearsVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SabrInArrearsVolatilityFunction.DEFAULT, null);
  }

  /**
   * Test {@link SabrInArrearsVolatilityFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrInArrearsVolatilityFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrInArrearsVolatilityFunction.equals(Object)",
    "int SabrInArrearsVolatilityFunction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SabrInArrearsVolatilityFunction.DEFAULT,
        "Different type to SabrInArrearsVolatilityFunction");
  }
}
