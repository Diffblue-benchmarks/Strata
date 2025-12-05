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
import com.opengamma.strata.product.rate.InflationMonthlyRateComputation.Meta;
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

class InflationMonthlyRateComputationDiffblueTest {
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
    Class<? extends InflationMonthlyRateComputation> actualBeanTypeResult =
        InflationMonthlyRateComputation.meta().beanType();

    // Assert
    Class<InflationMonthlyRateComputation> expectedBeanTypeResult =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endObservation()}
   *   <li>{@link Meta#startObservation()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.endObservation()", "MetaProperty Meta.startObservation()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationMonthlyRateComputation.meta();

    // Act
    MetaProperty<PriceIndexObservation> actualEndObservationResult = metaResult.endObservation();

    // Assert
    assertTrue(actualEndObservationResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startObservation() instanceof DirectMetaProperty);
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
        InflationMonthlyRateComputation.meta().metaPropertyGet("startObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndexObservation> endObservationResult =
        ((Meta) metaBeanResult).endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("endObservation", endObservationResult.name());
    assertEquals("startObservation", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, endObservationResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, endObservationResult.propertyType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, endObservationResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startObservation());
    assertSame(Meta.INSTANCE, endObservationResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean startObservation return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean startObservation return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanStartObservationReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationMonthlyRateComputation.meta().metaPropertyGet("endObservation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        ((Meta) metaBeanResult).startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    assertEquals("endObservation", actualMetaPropertyGetResult.name());
    assertEquals("startObservation", startObservationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, startObservationResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, startObservationResult.propertyType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, startObservationResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endObservation());
    assertSame(Meta.INSTANCE, startObservationResult.metaBean());
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
    assertNull(InflationMonthlyRateComputation.meta().metaPropertyGet("Property Name"));
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
        InflationMonthlyRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("startObservation");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("endObservation");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("endObservation", getResult2.name());
    assertEquals("startObservation", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<PriceIndexObservation> expectedPropertyTypeResult2 = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult2 =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
            InflationMonthlyRateComputation.meta()
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
        InflationMonthlyRateComputation.meta()
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
            InflationMonthlyRateComputation.meta()
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
            InflationMonthlyRateComputation.meta()
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
            InflationMonthlyRateComputation.meta()
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
            InflationMonthlyRateComputation.meta()
                .propertySet(mock(Bean.class), "startObservation", "New Value", true));
  }

  /**
   * Test {@link InflationMonthlyRateComputation#of(PriceIndex, YearMonth, YearMonth)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with four and four.
   *   <li>Then return EndObservation Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link InflationMonthlyRateComputation#of(PriceIndex, YearMonth,
   * YearMonth)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, YearMonth, YearMonth); when YearMonth with four and four; then return EndObservation Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InflationMonthlyRateComputation InflationMonthlyRateComputation.of(PriceIndex, YearMonth, YearMonth)"
  })
  void testOf_whenYearMonthWithFourAndFour_thenReturnEndObservationCurrencyIsNull() {
    // Arrange
    PriceIndex index = mock(PriceIndex.class);
    YearMonth referenceStartMonth = YearMonth.of(4, 4);
    YearMonth referenceEndMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    InflationMonthlyRateComputation actualOfResult =
        InflationMonthlyRateComputation.of(index, referenceStartMonth, referenceEndMonth);

    // Assert
    PriceIndexObservation endObservation = actualOfResult.getEndObservation();
    assertNull(endObservation.getCurrency());
    PriceIndexObservation startObservation = actualOfResult.getStartObservation();
    assertNull(startObservation.getCurrency());
    assertSame(referenceStartMonth, startObservation.getFixingMonth());
    assertSame(referenceEndMonth, endObservation.getFixingMonth());
    assertSame(index, endObservation.getIndex());
    assertSame(index, startObservation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link InflationMonthlyRateComputation#meta()}.
   *
   * <p>Method under test: {@link InflationMonthlyRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationMonthlyRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationMonthlyRateComputation.meta();

    // Assert
    MetaProperty<PriceIndexObservation> endObservationResult = actualMetaResult.endObservation();
    assertTrue(endObservationResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndexObservation> startObservationResult =
        actualMetaResult.startObservation();
    assertTrue(startObservationResult instanceof DirectMetaProperty);
    assertEquals("endObservation", endObservationResult.name());
    assertEquals("startObservation", startObservationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, endObservationResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, startObservationResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<PriceIndexObservation> expectedPropertyTypeResult = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, endObservationResult.propertyType());
    Class<PriceIndexObservation> expectedPropertyTypeResult2 = PriceIndexObservation.class;
    assertEquals(expectedPropertyTypeResult2, startObservationResult.propertyType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, endObservationResult.declaringType());
    Class<InflationMonthlyRateComputation> expectedDeclaringTypeResult2 =
        InflationMonthlyRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, startObservationResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, endObservationResult.metaBean());
    assertSame(meta, startObservationResult.metaBean());
  }
}
