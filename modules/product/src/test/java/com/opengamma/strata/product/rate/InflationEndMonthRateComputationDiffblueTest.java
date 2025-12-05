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
import com.opengamma.strata.product.rate.InflationEndMonthRateComputation.Meta;
import java.time.Month;
import java.time.YearMonth;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InflationEndMonthRateComputationDiffblueTest {
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
    Class<? extends InflationEndMonthRateComputation> actualBeanTypeResult =
        InflationEndMonthRateComputation.meta().beanType();

    // Assert
    Class<InflationEndMonthRateComputation> expectedBeanTypeResult =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endObservation()}
   *   <li>{@link Meta#startIndexValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.endObservation()", "MetaProperty Meta.startIndexValue()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationEndMonthRateComputation.meta();

    // Act
    MetaProperty<PriceIndexObservation> actualEndObservationResult = metaResult.endObservation();

    // Assert
    assertTrue(actualEndObservationResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startIndexValue() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean endObservation return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean endObservation return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanEndObservationReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationEndMonthRateComputation.meta().metaPropertyGet("startIndexValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("endObservation", endObservationResult.name());
    assertEquals("startIndexValue", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, endObservationResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, endObservationResult.propertyType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, endObservationResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startIndexValue());
    assertSame(Meta.INSTANCE, endObservationResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean startIndexValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean startIndexValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanStartIndexValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationEndMonthRateComputation.meta().metaPropertyGet("endObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> startIndexValueResult = ((Meta) metaBeanResult).startIndexValue();
    assertTrue(startIndexValueResult instanceof DirectMetaProperty);
    assertEquals("double", startIndexValueResult.propertyType().getName());
    assertEquals("endObservation", actualMetaPropertyGetResult.name());
    assertEquals("startIndexValue", startIndexValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, startIndexValueResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, startIndexValueResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endObservation());
    assertSame(Meta.INSTANCE, startIndexValueResult.metaBean());
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
    assertNull(InflationEndMonthRateComputation.meta().metaPropertyGet("Property Name"));
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
        InflationEndMonthRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("startIndexValue");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("endObservation");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("endObservation", getResult2.name());
    assertEquals("startIndexValue", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult2 =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
        InflationEndMonthRateComputation.meta()
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
            InflationEndMonthRateComputation.meta()
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
            InflationEndMonthRateComputation.meta()
                .propertySet(mock(Bean.class), "endObservation", "New Value", true));
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
            InflationEndMonthRateComputation.meta()
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
            InflationEndMonthRateComputation.meta()
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
            InflationEndMonthRateComputation.meta()
                .propertySet(mock(Bean.class), "startIndexValue", "New Value", true));
  }

  /**
   * Test {@link InflationEndMonthRateComputation#of(PriceIndex, double, YearMonth)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return EndObservation Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InflationEndMonthRateComputation#of(PriceIndex, double,
   * YearMonth)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, double, YearMonth); when ten; then return EndObservation Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationEndMonthRateComputation InflationEndMonthRateComputation.of(PriceIndex, double, YearMonth)"
  })
  void testOf_whenTen_thenReturnEndObservationCurrencyIsNull() {
    // Arrange
    PriceIndex index = mock(PriceIndex.class);
    YearMonth referenceEndMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationEndMonthRateComputation actualOfResult =
        InflationEndMonthRateComputation.of(index, 10.0d, referenceEndMonth);

    // Assert
    PriceIndexObservation endObservation = actualOfResult.getEndObservation();
    assertNull(endObservation.getCurrency());
    assertEquals(10.0d, actualOfResult.getStartIndexValue());
    assertSame(referenceEndMonth, endObservation.getFixingMonth());
    assertSame(index, endObservation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link InflationEndMonthRateComputation#meta()}.
   *
   * <p>Method under test: {@link InflationEndMonthRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationEndMonthRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationEndMonthRateComputation.meta();

    // Assert
    MetaProperty<PriceIndexObservation> endObservationResult = actualMetaResult.endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    MetaProperty<Double> startIndexValueResult = actualMetaResult.startIndexValue();
    assertTrue(startIndexValueResult instanceof DirectMetaProperty);
    assertEquals("double", startIndexValueResult.propertyType().getName());
    assertEquals("endObservation", endObservationResult.name());
    assertEquals("startIndexValue", startIndexValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, endObservationResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, startIndexValueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, endObservationResult.propertyType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, endObservationResult.declaringType());
    Class<InflationEndMonthRateComputation> expectedDeclaringTypeResult2 =
        InflationEndMonthRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, startIndexValueResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, endObservationResult.metaBean());
    assertSame(meta, startIndexValueResult.metaBean());
  }
}
