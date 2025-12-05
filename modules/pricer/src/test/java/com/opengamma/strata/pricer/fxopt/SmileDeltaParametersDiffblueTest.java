package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.pricer.common.GenericVolatilitySurfaceYearFractionParameterMetadata;
import com.opengamma.strata.pricer.fxopt.SmileDeltaParameters.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmileDeltaParametersDiffblueTest {
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
    Class<? extends SmileDeltaParameters> actualBeanTypeResult =
        SmileDeltaParameters.meta().beanType();

    // Assert
    Class<SmileDeltaParameters> expectedBeanTypeResult = SmileDeltaParameters.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#delta()}
   *   <li>{@link Meta#expiry()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#volatility()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.delta()",
    "MetaProperty Meta.expiry()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.volatility()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SmileDeltaParameters.meta();

    // Act
    MetaProperty<DoubleArray> actualDeltaResult = metaResult.delta();
    MetaProperty<Double> actualExpiryResult = metaResult.expiry();
    MetaProperty<ImmutableList<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();

    // Assert
    assertTrue(actualDeltaResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.volatility() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code delta}.
   *   <li>Then return name is {@code delta}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'delta'; then return name is 'delta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDelta_thenReturnNameIsDelta() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SmileDeltaParameters.meta().metaPropertyGet("delta");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> volatilityResult = ((Meta) metaBeanResult).volatility();
    assertTrue(volatilityResult instanceof DirectMetaProperty);
    assertEquals("delta", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).delta());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, volatilityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'expiry'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiry_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SmileDeltaParameters.meta().metaPropertyGet("expiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> deltaResult = ((Meta) metaBeanResult).delta();
    assertTrue(deltaResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> volatilityResult = ((Meta) metaBeanResult).volatility();
    assertTrue(volatilityResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("expiry", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiry());
    assertSame(metaBeanResult, deltaResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, volatilityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return name is {@code parameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameterMetadata'; then return name is 'parameterMetadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameterMetadata_thenReturnNameIsParameterMetadata() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SmileDeltaParameters.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> deltaResult = ((Meta) metaBeanResult).delta();
    assertTrue(deltaResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> volatilityResult = ((Meta) metaBeanResult).volatility();
    assertTrue(volatilityResult instanceof DirectMetaProperty);
    assertEquals("parameterMetadata", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterMetadata());
    assertSame(metaBeanResult, deltaResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, volatilityResult.metaBean());
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
    assertNull(SmileDeltaParameters.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code volatility}.
   *   <li>Then return name is {@code volatility}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'volatility'; then return name is 'volatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenVolatility_thenReturnNameIsVolatility() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SmileDeltaParameters.meta().metaPropertyGet("volatility");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> deltaResult = ((Meta) metaBeanResult).delta();
    assertTrue(deltaResult instanceof DirectMetaProperty);
    MetaProperty<Double> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    assertEquals("volatility", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatility());
    assertSame(metaBeanResult, deltaResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
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
        SmileDeltaParameters.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("delta") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiry") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("volatility") instanceof DirectMetaProperty);
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
    assertNull(SmileDeltaParameters.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SmileDeltaParameters.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code delta}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'delta'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDelta_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SmileDeltaParameters.meta().propertySet(mock(Bean.class), "delta", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiry'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiry_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SmileDeltaParameters.meta().propertySet(mock(Bean.class), "expiry", "New Value", true));
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
            SmileDeltaParameters.meta().propertySet(mock(Bean.class), "delta", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameterMetadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameterMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SmileDeltaParameters.meta()
                .propertySet(mock(Bean.class), "parameterMetadata", "New Value", true));
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
            SmileDeltaParameters.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatility}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'volatility'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenVolatility_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SmileDeltaParameters.meta()
                .propertySet(mock(Bean.class), "volatility", "New Value", true));
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, double, DoubleArray, DoubleArray, DoubleArray)}
   * with {@code expiry}, {@code atmVolatility}, {@code delta}, {@code riskReversal}, {@code
   * strangle}.
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, double, DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, DoubleArray, DoubleArray, DoubleArray) with 'expiry', 'atmVolatility', 'delta', 'riskReversal', 'strangle'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, double, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryAtmVolatilityDeltaRiskReversalStrangle() {
    // Arrange
    DoubleArray delta = DoubleArray.of();
    DoubleArray riskReversal = DoubleArray.of();

    // Act
    SmileDeltaParameters actualOfResult =
        SmileDeltaParameters.of(10.0d, 10.0d, delta, riskReversal, DoubleArray.of());

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(1, actualOfResult.getParameterMetadata().size());
    assertEquals(10.0d, actualOfResult.getExpiry());
    assertFalse(actualOfResult.getExpiryTenor().isPresent());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, DoubleArray, DoubleArray)} with {@code expiry},
   * {@code delta}, {@code volatility}.
   *
   * <ul>
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, DoubleArray, DoubleArray) with 'expiry', 'delta', 'volatility'; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryDeltaVolatility_thenReturnParameterCountIsThree() {
    // Arrange
    DoubleArray delta = DoubleArray.of(0.5d);
    DoubleArray volatility = DoubleArray.filled(3);

    // Act
    SmileDeltaParameters actualOfResult = SmileDeltaParameters.of(10.0d, delta, volatility);

    // Assert
    assertEquals(3, actualOfResult.getParameterCount());
    assertEquals(3, actualOfResult.getParameterMetadata().size());
    assertSame(volatility, actualOfResult.getVolatility());
    assertSame(delta, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, DoubleArray, DoubleArray)} with {@code expiry},
   * {@code delta}, {@code volatility}.
   *
   * <ul>
   *   <li>Then return ParameterMetadata size is one.
   * </ul>
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, DoubleArray, DoubleArray) with 'expiry', 'delta', 'volatility'; then return ParameterMetadata size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryDeltaVolatility_thenReturnParameterMetadataSizeIsOne() {
    // Arrange
    DoubleArray delta = DoubleArray.of();
    DoubleArray volatility = DoubleArray.of(0.5d);

    // Act
    SmileDeltaParameters actualOfResult = SmileDeltaParameters.of(10.0d, delta, volatility);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata = actualOfResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(
        parameterMetadata.get(0) instanceof GenericVolatilitySurfaceYearFractionParameterMetadata);
    assertEquals(1, actualOfResult.getParameterCount());
    assertSame(volatility, actualOfResult.getVolatility());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, Tenor, double, DoubleArray, DoubleArray,
   * DoubleArray)} with {@code expiry}, {@code expiryTenor}, {@code atmVolatility}, {@code delta},
   * {@code riskReversal}, {@code strangle}.
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, Tenor, double, DoubleArray,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, Tenor, double, DoubleArray, DoubleArray, DoubleArray) with 'expiry', 'expiryTenor', 'atmVolatility', 'delta', 'riskReversal', 'strangle'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, Tenor, double, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryExpiryTenorAtmVolatilityDeltaRiskReversalStrangle() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    DoubleArray delta = DoubleArray.of();
    DoubleArray riskReversal = DoubleArray.of();

    // Act
    SmileDeltaParameters actualOfResult =
        SmileDeltaParameters.of(10.0d, expiryTenor, 10.0d, delta, riskReversal, DoubleArray.of());

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(1, actualOfResult.getParameterMetadata().size());
    assertEquals(10.0d, actualOfResult.getExpiry());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, Tenor, DoubleArray, DoubleArray)} with {@code
   * expiry}, {@code expiryTenor}, {@code delta}, {@code volatility}.
   *
   * <ul>
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, Tenor, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, Tenor, DoubleArray, DoubleArray) with 'expiry', 'expiryTenor', 'delta', 'volatility'; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, Tenor, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryExpiryTenorDeltaVolatility_thenReturnParameterCountIsThree() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    DoubleArray delta = DoubleArray.of(0.5d);
    DoubleArray volatility = DoubleArray.filled(3);

    // Act
    SmileDeltaParameters actualOfResult =
        SmileDeltaParameters.of(10.0d, expiryTenor, delta, volatility);

    // Assert
    assertEquals(3, actualOfResult.getParameterCount());
    assertEquals(3, actualOfResult.getParameterMetadata().size());
    assertSame(volatility, actualOfResult.getVolatility());
    assertSame(delta, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#of(double, Tenor, DoubleArray, DoubleArray)} with {@code
   * expiry}, {@code expiryTenor}, {@code delta}, {@code volatility}.
   *
   * <ul>
   *   <li>Then return ParameterMetadata size is one.
   * </ul>
   *
   * <p>Method under test: {@link SmileDeltaParameters#of(double, Tenor, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, Tenor, DoubleArray, DoubleArray) with 'expiry', 'expiryTenor', 'delta', 'volatility'; then return ParameterMetadata size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters SmileDeltaParameters.of(double, Tenor, DoubleArray, DoubleArray)"
  })
  void testOfWithExpiryExpiryTenorDeltaVolatility_thenReturnParameterMetadataSizeIsOne() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    DoubleArray delta = DoubleArray.of();
    DoubleArray volatility = DoubleArray.of(0.5d);

    // Act
    SmileDeltaParameters actualOfResult =
        SmileDeltaParameters.of(10.0d, expiryTenor, delta, volatility);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata = actualOfResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(
        parameterMetadata.get(0) instanceof GenericVolatilitySurfaceYearFractionParameterMetadata);
    assertEquals(1, actualOfResult.getParameterCount());
    assertSame(volatility, actualOfResult.getVolatility());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDelta());
  }

  /**
   * Test {@link SmileDeltaParameters#meta()}.
   *
   * <p>Method under test: {@link SmileDeltaParameters#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SmileDeltaParameters.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SmileDeltaParameters.meta();

    // Assert
    assertTrue(actualMetaResult.delta() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.expiry() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.volatility() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
