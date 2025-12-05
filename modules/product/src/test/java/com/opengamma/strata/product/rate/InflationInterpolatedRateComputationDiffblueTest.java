package com.opengamma.strata.product.rate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.basics.index.PriceIndexObservation;
import com.opengamma.strata.product.rate.InflationInterpolatedRateComputation.Meta;
import java.time.Month;
import java.time.YearMonth;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InflationInterpolatedRateComputationDiffblueTest {
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
    Class<? extends InflationInterpolatedRateComputation> actualBeanTypeResult =
        InflationInterpolatedRateComputation.meta().beanType();

    // Assert
    Class<InflationInterpolatedRateComputation> expectedBeanTypeResult =
        InflationInterpolatedRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endObservation()}
   *   <li>{@link Meta#endSecondObservation()}
   *   <li>{@link Meta#startObservation()}
   *   <li>{@link Meta#startSecondObservation()}
   *   <li>{@link Meta#weight()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.endObservation()",
    "MetaProperty Meta.endSecondObservation()",
    "MetaProperty Meta.startObservation()",
    "MetaProperty Meta.startSecondObservation()",
    "MetaProperty Meta.weight()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationInterpolatedRateComputation.meta();

    // Act
    MetaProperty<PriceIndexObservation> actualEndObservationResult = metaResult.endObservation();
    MetaProperty<PriceIndexObservation> actualEndSecondObservationResult =
        metaResult.endSecondObservation();
    MetaProperty<PriceIndexObservation> actualStartObservationResult =
        metaResult.startObservation();
    MetaProperty<PriceIndexObservation> actualStartSecondObservationResult =
        metaResult.startSecondObservation();

    // Assert
    assertTrue(actualEndObservationResult instanceof DirectMetaProperty);
    assertTrue(actualEndSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualStartObservationResult instanceof DirectMetaProperty);
    assertTrue(actualStartSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(metaResult.weight() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code endSecondObservation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'endSecondObservation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsEndSecondObservation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationInterpolatedRateComputation.meta().metaPropertyGet("endSecondObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        ((Meta) metaBeanResult).startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startSecondObservationResult =
        ((Meta) metaBeanResult).startSecondObservation();
    assertTrue(startSecondObservationResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("endSecondObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endSecondObservation());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, startObservationResult.metaBean());
    assertSame(metaBeanResult, startSecondObservationResult.metaBean());
    assertSame(metaBeanResult, weightResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code startSecondObservation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'startSecondObservation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStartSecondObservation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationInterpolatedRateComputation.meta().metaPropertyGet("startSecondObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> endSecondObservationResult =
        ((Meta) metaBeanResult).endSecondObservation();
    assertTrue(endSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        ((Meta) metaBeanResult).startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("startSecondObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startSecondObservation());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startObservationResult.metaBean());
    assertSame(metaBeanResult, weightResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code endObservation}.
   *   <li>Then return name is {@code endObservation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'endObservation'; then return name is 'endObservation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEndObservation_thenReturnNameIsEndObservation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationInterpolatedRateComputation.meta().metaPropertyGet("endObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endSecondObservationResult =
        ((Meta) metaBeanResult).endSecondObservation();
    assertTrue(endSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        ((Meta) metaBeanResult).startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startSecondObservationResult =
        ((Meta) metaBeanResult).startSecondObservation();
    assertTrue(startSecondObservationResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("endObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endObservation());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startObservationResult.metaBean());
    assertSame(metaBeanResult, startSecondObservationResult.metaBean());
    assertSame(metaBeanResult, weightResult.metaBean());
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
    assertNull(InflationInterpolatedRateComputation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startObservation}.
   *   <li>Then return name is {@code startObservation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startObservation'; then return name is 'startObservation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartObservation_thenReturnNameIsStartObservation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationInterpolatedRateComputation.meta().metaPropertyGet("startObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> endSecondObservationResult =
        ((Meta) metaBeanResult).endSecondObservation();
    assertTrue(endSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startSecondObservationResult =
        ((Meta) metaBeanResult).startSecondObservation();
    assertTrue(startSecondObservationResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("startObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startObservation());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startSecondObservationResult.metaBean());
    assertSame(metaBeanResult, weightResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code weight}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'weight'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWeight_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationInterpolatedRateComputation.meta().metaPropertyGet("weight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> endSecondObservationResult =
        ((Meta) metaBeanResult).endSecondObservation();
    assertTrue(endSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        ((Meta) metaBeanResult).startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startSecondObservationResult =
        ((Meta) metaBeanResult).startSecondObservation();
    assertTrue(startSecondObservationResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("weight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).weight());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startObservationResult.metaBean());
    assertSame(metaBeanResult, startSecondObservationResult.metaBean());
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
        InflationInterpolatedRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("endObservation") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("endSecondObservation") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startObservation") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("startSecondObservation") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("weight") instanceof DirectMetaProperty);
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
            InflationInterpolatedRateComputation.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        InflationInterpolatedRateComputation.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "endObservation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endSecondObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endSecondObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndSecondObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "endSecondObservation", "New Value", true));
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
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "endObservation", "New Value", false));
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
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "startObservation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startSecondObservation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startSecondObservation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartSecondObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "startSecondObservation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code weight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'weight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenWeight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "weight", "New Value", true));
  }

  /**
   * Test {@link InflationInterpolatedRateComputation#of(PriceIndex, YearMonth, YearMonth, double)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with one and one.
   *   <li>Then return EndObservation Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InflationInterpolatedRateComputation#of(PriceIndex, YearMonth,
   * YearMonth, double)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, YearMonth, YearMonth, double); when YearMonth with one and one; then return EndObservation Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationInterpolatedRateComputation InflationInterpolatedRateComputation.of(PriceIndex, YearMonth, YearMonth, double)"
  })
  void testOf_whenYearMonthWithOneAndOne_thenReturnEndObservationCurrencyIsNull() {
    // Arrange
    PriceIndex index = mock(PriceIndex.class);
    YearMonth referenceStartMonth = YearMonth.of(1, 1);
    YearMonth referenceEndMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationInterpolatedRateComputation actualOfResult =
        InflationInterpolatedRateComputation.of(
            index, referenceStartMonth, referenceEndMonth, 10.0d);

    // Assert
    PriceIndexObservation endObservation = actualOfResult.getEndObservation();
    assertNull(endObservation.getCurrency());
    PriceIndexObservation endSecondObservation = actualOfResult.getEndSecondObservation();
    assertNull(endSecondObservation.getCurrency());
    PriceIndexObservation startObservation = actualOfResult.getStartObservation();
    assertNull(startObservation.getCurrency());
    PriceIndexObservation startSecondObservation = actualOfResult.getStartSecondObservation();
    assertNull(startSecondObservation.getCurrency());
    assertEquals(10.0d, actualOfResult.getWeight());
    assertSame(referenceStartMonth, startObservation.getFixingMonth());
    assertSame(referenceEndMonth, endObservation.getFixingMonth());
    assertSame(index, endObservation.getIndex());
    assertSame(index, endSecondObservation.getIndex());
    assertSame(index, startObservation.getIndex());
    assertSame(index, startSecondObservation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link InflationInterpolatedRateComputation#meta()}.
   *
   * <p>Method under test: {@link InflationInterpolatedRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationInterpolatedRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationInterpolatedRateComputation.meta();

    // Assert
    assertTrue(actualMetaResult.endObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.endSecondObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startSecondObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.weight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
