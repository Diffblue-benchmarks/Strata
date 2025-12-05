package com.opengamma.strata.product.rate;

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
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.basics.index.PriceIndexObservation;
import com.opengamma.strata.product.rate.InflationEndInterpolatedRateComputation.Meta;
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

class InflationEndInterpolatedRateComputationDiffblueTest {
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
    Class<? extends InflationEndInterpolatedRateComputation> actualBeanTypeResult =
        InflationEndInterpolatedRateComputation.meta().beanType();

    // Assert
    Class<InflationEndInterpolatedRateComputation> expectedBeanTypeResult =
        InflationEndInterpolatedRateComputation.class;
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
   *   <li>{@link Meta#startIndexValue()}
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
    "MetaProperty Meta.startIndexValue()",
    "MetaProperty Meta.weight()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationEndInterpolatedRateComputation.meta();

    // Act
    MetaProperty<PriceIndexObservation> actualEndObservationResult = metaResult.endObservation();
    MetaProperty<PriceIndexObservation> actualEndSecondObservationResult =
        metaResult.endSecondObservation();
    MetaProperty<Double> actualStartIndexValueResult = metaResult.startIndexValue();

    // Assert
    assertTrue(actualEndObservationResult instanceof DirectMetaProperty);
    assertTrue(actualEndSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualStartIndexValueResult instanceof DirectMetaProperty);
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
        InflationEndInterpolatedRateComputation.meta().metaPropertyGet("endSecondObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> startIndexValueResult = ((Meta) metaBeanResult).startIndexValue();
    assertTrue(startIndexValueResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("endSecondObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endSecondObservation());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, startIndexValueResult.metaBean());
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
        InflationEndInterpolatedRateComputation.meta().metaPropertyGet("endObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endSecondObservationResult =
        ((Meta) metaBeanResult).endSecondObservation();
    assertTrue(endSecondObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> startIndexValueResult = ((Meta) metaBeanResult).startIndexValue();
    assertTrue(startIndexValueResult instanceof DirectMetaProperty);
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("endObservation", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endObservation());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startIndexValueResult.metaBean());
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
    assertNull(InflationEndInterpolatedRateComputation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startIndexValue}.
   *   <li>Then return name is {@code startIndexValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startIndexValue'; then return name is 'startIndexValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartIndexValue_thenReturnNameIsStartIndexValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationEndInterpolatedRateComputation.meta().metaPropertyGet("startIndexValue");

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
    MetaProperty<Double> weightResult = ((Meta) metaBeanResult).weight();
    assertTrue(weightResult instanceof DirectMetaProperty);
    assertEquals("startIndexValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startIndexValue());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, weightResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code weight}.
   *   <li>Then return name is {@code weight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'weight'; then return name is 'weight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWeight_thenReturnNameIsWeight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationEndInterpolatedRateComputation.meta().metaPropertyGet("weight");

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
    MetaProperty<Double> startIndexValueResult = ((Meta) metaBeanResult).startIndexValue();
    assertTrue(startIndexValueResult instanceof DirectMetaProperty);
    assertEquals("weight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).weight());
    assertSame(metaBeanResult, endObservationResult.metaBean());
    assertSame(metaBeanResult, endSecondObservationResult.metaBean());
    assertSame(metaBeanResult, startIndexValueResult.metaBean());
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
        InflationEndInterpolatedRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("endObservation") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("endSecondObservation") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startIndexValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("weight") instanceof DirectMetaProperty);
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
        InflationEndInterpolatedRateComputation.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
            InflationEndInterpolatedRateComputation.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            InflationEndInterpolatedRateComputation.meta()
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
            InflationEndInterpolatedRateComputation.meta()
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
            InflationEndInterpolatedRateComputation.meta()
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
            InflationEndInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startIndexValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startIndexValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartIndexValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationEndInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "startIndexValue", "New Value", true));
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
            InflationEndInterpolatedRateComputation.meta()
                .propertySet(mock(Bean.class), "weight", "New Value", true));
  }

  /**
   * Test {@link InflationEndInterpolatedRateComputation#of(PriceIndex, double, YearMonth, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return StartIndexValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link InflationEndInterpolatedRateComputation#of(PriceIndex, double,
   * YearMonth, double)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, double, YearMonth, double); when '0.5'; then return StartIndexValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationEndInterpolatedRateComputation InflationEndInterpolatedRateComputation.of(PriceIndex, double, YearMonth, double)"
  })
  void testOf_when05_thenReturnStartIndexValueIs05() {
    // Arrange
    PriceIndex index = mock(PriceIndex.class);
    YearMonth referenceEndMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationEndInterpolatedRateComputation actualOfResult =
        InflationEndInterpolatedRateComputation.of(index, 0.5d, referenceEndMonth, 10.0d);

    // Assert
    PriceIndexObservation endObservation = actualOfResult.getEndObservation();
    assertNull(endObservation.getCurrency());
    PriceIndexObservation endSecondObservation = actualOfResult.getEndSecondObservation();
    assertNull(endSecondObservation.getCurrency());
    assertEquals(0.5d, actualOfResult.getStartIndexValue());
    assertEquals(10.0d, actualOfResult.getWeight());
    YearMonth fixingMonth = endSecondObservation.getFixingMonth();
    assertEquals(1970, fixingMonth.getYear());
    assertEquals(2, fixingMonth.getMonthValue());
    assertEquals(Month.FEBRUARY, fixingMonth.getMonth());
    assertFalse(fixingMonth.isLeapYear());
    assertSame(referenceEndMonth, endObservation.getFixingMonth());
    assertSame(index, endObservation.getIndex());
    assertSame(index, endSecondObservation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link InflationEndInterpolatedRateComputation#of(PriceIndex, double, YearMonth, double)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return StartIndexValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link InflationEndInterpolatedRateComputation#of(PriceIndex, double,
   * YearMonth, double)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, double, YearMonth, double); when YearMonth with '1970' and 'JANUARY'; then return StartIndexValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationEndInterpolatedRateComputation InflationEndInterpolatedRateComputation.of(PriceIndex, double, YearMonth, double)"
  })
  void testOf_whenYearMonthWith1970AndJanuary_thenReturnStartIndexValueIsTen() {
    // Arrange
    PriceIndex index = mock(PriceIndex.class);
    YearMonth referenceEndMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationEndInterpolatedRateComputation actualOfResult =
        InflationEndInterpolatedRateComputation.of(index, 10.0d, referenceEndMonth, 10.0d);

    // Assert
    PriceIndexObservation endObservation = actualOfResult.getEndObservation();
    assertNull(endObservation.getCurrency());
    PriceIndexObservation endSecondObservation = actualOfResult.getEndSecondObservation();
    assertNull(endSecondObservation.getCurrency());
    assertEquals(10.0d, actualOfResult.getStartIndexValue());
    assertEquals(10.0d, actualOfResult.getWeight());
    YearMonth fixingMonth = endSecondObservation.getFixingMonth();
    assertEquals(1970, fixingMonth.getYear());
    assertEquals(2, fixingMonth.getMonthValue());
    assertEquals(Month.FEBRUARY, fixingMonth.getMonth());
    assertFalse(fixingMonth.isLeapYear());
    assertSame(referenceEndMonth, endObservation.getFixingMonth());
    assertSame(index, endObservation.getIndex());
    assertSame(index, endSecondObservation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link InflationEndInterpolatedRateComputation#meta()}.
   *
   * <p>Method under test: {@link InflationEndInterpolatedRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationEndInterpolatedRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationEndInterpolatedRateComputation.meta();

    // Assert
    assertTrue(actualMetaResult.endObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.endSecondObservation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startIndexValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.weight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
