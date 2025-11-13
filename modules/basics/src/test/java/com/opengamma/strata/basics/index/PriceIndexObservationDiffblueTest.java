package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.PriceIndexObservation.Meta;
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

class PriceIndexObservationDiffblueTest {
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
    Class<? extends PriceIndexObservation> actualBeanTypeResult =
        PriceIndexObservation.meta().beanType();

    // Assert
    Class<PriceIndexObservation> expectedBeanTypeResult = PriceIndexObservation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixingMonth()}
   *   <li>{@link Meta#index()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.fixingMonth()", "MetaProperty Meta.index()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PriceIndexObservation.meta();

    // Act
    MetaProperty<YearMonth> actualFixingMonthResult = metaResult.fixingMonth();

    // Assert
    assertTrue(actualFixingMonthResult instanceof DirectMetaProperty);
    assertTrue(metaResult.index() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean fixingMonth return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean fixingMonth return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanFixingMonthReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PriceIndexObservation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<YearMonth> fixingMonthResult = ((Meta) metaBeanResult).fixingMonth();
    assertTrue(fixingMonthResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingMonth", fixingMonthResult.name());
    assertEquals("index", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixingMonthResult.style());
    Class<PriceIndex> expectedPropertyTypeResult = PriceIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, fixingMonthResult.declaringType());
    Class<YearMonth> expectedPropertyTypeResult2 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult2, fixingMonthResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(Meta.INSTANCE, fixingMonthResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean index return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean index return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanIndexReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PriceIndexObservation.meta().metaPropertyGet("fixingMonth");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PriceIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingMonth", actualMetaPropertyGetResult.name());
    assertEquals("index", indexResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    Class<PriceIndex> expectedPropertyTypeResult = PriceIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, indexResult.declaringType());
    Class<YearMonth> expectedPropertyTypeResult2 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingMonth());
    assertSame(Meta.INSTANCE, indexResult.metaBean());
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
    assertNull(PriceIndexObservation.meta().metaPropertyGet("Property Name"));
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
        PriceIndexObservation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("index");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("fixingMonth");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("fixingMonth", getResult2.name());
    assertEquals("index", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<PriceIndex> expectedPropertyTypeResult = PriceIndex.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult2 = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<YearMonth> expectedPropertyTypeResult2 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then FloatingRateName return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then FloatingRateName return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenFloatingRateNameReturnImmutableFloatingRateName() {
    // Arrange
    Meta metaResult = PriceIndexObservation.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)),
            "index",
            true);

    // Assert
    assertTrue(
        ((ImmutablePriceIndex) actualPropertyGetResult).getFloatingRateName()
            instanceof ImmutableFloatingRateName);
    assertTrue(actualPropertyGetResult instanceof ImmutablePriceIndex);
    assertEquals("CH-CPI", ((ImmutablePriceIndex) actualPropertyGetResult).getName());
    assertTrue(((ImmutablePriceIndex) actualPropertyGetResult).isActive());
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
    assertNull(PriceIndexObservation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Meta metaResult = PriceIndexObservation.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingMonth}.
   *   <li>Then return {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fixingMonth'; then return YearMonth with '1970' and 'JANUARY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixingMonth_thenReturnYearMonthWith1970AndJanuary() {
    // Arrange
    Meta metaResult = PriceIndexObservation.meta();
    YearMonth fixingMonth = YearMonth.of(1970, Month.JANUARY);

    // Act and Assert
    assertSame(
        fixingMonth,
        metaResult.propertyGet(
            PriceIndexObservation.of(PriceIndices.CH_CPI, fixingMonth), "fixingMonth", true));
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
            PriceIndexObservation.meta()
                .propertySet(mock(Bean.class), "fixingMonth", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingMonth}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingMonth'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingMonth_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PriceIndexObservation.meta()
                .propertySet(mock(Bean.class), "fixingMonth", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PriceIndexObservation.meta().propertySet(mock(Bean.class), "index", "New Value", true));
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
            PriceIndexObservation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link PriceIndexObservation#of(PriceIndex, YearMonth)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return Currency Code is {@code CHF}.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#of(PriceIndex, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test of(PriceIndex, YearMonth); when YearMonth with '1970' and 'JANUARY'; then return Currency Code is 'CHF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexObservation PriceIndexObservation.of(PriceIndex, YearMonth)"})
  void testOf_whenYearMonthWith1970AndJanuary_thenReturnCurrencyCodeIsChf() {
    // Arrange
    PriceIndex index = PriceIndices.CH_CPI;
    YearMonth fixingMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    PriceIndexObservation actualOfResult = PriceIndexObservation.of(index, fixingMonth);

    // Assert
    Currency currency = actualOfResult.getCurrency();
    assertEquals("CHF", currency.getCode());
    assertEquals("CHF", currency.toString());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(fixingMonth, actualOfResult.getFixingMonth());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link PriceIndexObservation#getCurrency()}.
   *
   * <p>Method under test: {@link PriceIndexObservation#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency PriceIndexObservation.getCurrency()"})
  void testGetCurrency() {
    // Arrange
    PriceIndexObservation ofResult =
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY));

    // Act
    Currency actualCurrency = ofResult.getCurrency();

    // Assert
    PriceIndex index = ofResult.getIndex();
    assertTrue(index instanceof ImmutablePriceIndex);
    Currency currency = Currency.CHF;
    assertSame(currency, index.getCurrency());
    assertSame(currency, actualCurrency);
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}, and {@link
   * PriceIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PriceIndexObservation#equals(Object)}
   *   <li>{@link PriceIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PriceIndexObservation ofResult =
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY));
    PriceIndexObservation ofResult2 =
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}, and {@link
   * PriceIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PriceIndexObservation#equals(Object)}
   *   <li>{@link PriceIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PriceIndexObservation ofResult =
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)), 1);
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PriceIndexObservation ofResult =
        PriceIndexObservation.of(PriceIndices.EU_AI_CPI, YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(
        ofResult, PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)));
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    PriceIndexObservation ofResult = PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.now());

    // Act and Assert
    assertNotEquals(
        ofResult, PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)));
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)), null);
  }

  /**
   * Test {@link PriceIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PriceIndexObservation.equals(Object)",
    "int PriceIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)),
        "Different type to PriceIndexObservation");
  }

  /**
   * Test {@link PriceIndexObservation#meta()}.
   *
   * <p>Method under test: {@link PriceIndexObservation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PriceIndexObservation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PriceIndexObservation.meta();

    // Assert
    MetaProperty<YearMonth> fixingMonthResult = actualMetaResult.fixingMonth();
    assertTrue(fixingMonthResult instanceof DirectMetaProperty);
    MetaProperty<PriceIndex> indexResult = actualMetaResult.index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertEquals("fixingMonth", fixingMonthResult.name());
    assertEquals("index", indexResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixingMonthResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<PriceIndex> expectedPropertyTypeResult = PriceIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult, fixingMonthResult.declaringType());
    Class<PriceIndexObservation> expectedDeclaringTypeResult2 = PriceIndexObservation.class;
    assertEquals(expectedDeclaringTypeResult2, indexResult.declaringType());
    Class<YearMonth> expectedPropertyTypeResult2 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult2, fixingMonthResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, fixingMonthResult.metaBean());
    assertSame(meta, indexResult.metaBean());
  }

  /**
   * Test {@link PriceIndexObservation#metaBean()}.
   *
   * <p>Method under test: {@link PriceIndexObservation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PriceIndexObservation.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY))
            .metaBean());
  }

  /**
   * Test {@link PriceIndexObservation#getIndex()}.
   *
   * <p>Method under test: {@link PriceIndexObservation#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndex PriceIndexObservation.getIndex()"})
  void testGetIndex() {
    // Arrange and Act
    PriceIndex actualIndex =
        PriceIndexObservation.of(PriceIndices.CH_CPI, YearMonth.of(1970, Month.JANUARY)).getIndex();

    // Assert
    assertTrue(actualIndex.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(actualIndex instanceof ImmutablePriceIndex);
    assertEquals("CH-CPI", actualIndex.getName());
    assertTrue(actualIndex.isActive());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PriceIndexObservation#toString()}
   *   <li>{@link PriceIndexObservation#getFixingMonth()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "YearMonth PriceIndexObservation.getFixingMonth()",
    "String PriceIndexObservation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    YearMonth fixingMonth = YearMonth.of(1970, Month.JANUARY);
    PriceIndexObservation ofResult = PriceIndexObservation.of(PriceIndices.CH_CPI, fixingMonth);

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("PriceIndexObservation[CH-CPI on 1970-01]", actualToStringResult);
    assertSame(fixingMonth, ofResult.getFixingMonth());
  }
}
