package com.opengamma.strata.calc;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.ReportingCurrency.Meta;
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

class ReportingCurrencyDiffblueTest {
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
    Class<? extends ReportingCurrency> actualBeanTypeResult = ReportingCurrency.meta().beanType();

    // Assert
    Class<ReportingCurrency> expectedBeanTypeResult = ReportingCurrency.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.currency()", "MetaProperty Meta.type()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ReportingCurrency.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then metaBean type return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currency'; then metaBean type return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenMetaBeanTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ReportingCurrency.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrencyType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ReportingCurrency> expectedDeclaringTypeResult = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult, typeResult.declaringType());
    Class<ReportingCurrencyType> expectedPropertyTypeResult2 = ReportingCurrencyType.class;
    assertEquals(expectedPropertyTypeResult2, typeResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(Meta.INSTANCE, typeResult.metaBean());
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
    assertNull(ReportingCurrency.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then metaBean currency return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'type'; then metaBean currency return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenType_thenMetaBeanCurrencyReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ReportingCurrency.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("type", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<ReportingCurrency> expectedDeclaringTypeResult = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<ReportingCurrencyType> expectedPropertyTypeResult2 = ReportingCurrencyType.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
    assertSame(Meta.INSTANCE, currencyResult.metaBean());
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
        ReportingCurrency.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("type");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("currency");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("currency", getResult2.name());
    assertEquals("type", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ReportingCurrency> expectedDeclaringTypeResult = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ReportingCurrency> expectedDeclaringTypeResult2 = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ReportingCurrencyType> expectedPropertyTypeResult2 = ReportingCurrencyType.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
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
    assertNull(ReportingCurrency.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ReportingCurrency.meta().propertyGet(ReportingCurrency.NATURAL, "currency", true));
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
            ReportingCurrency.meta()
                .propertyGet(ReportingCurrency.NATURAL, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@link ReportingCurrencyType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'type'; then return ReportingCurrencyType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenType_thenReturnReportingCurrencyType() {
    // Arrange and Act
    Object actualPropertyGetResult =
        ReportingCurrency.meta().propertyGet(ReportingCurrency.NATURAL, "type", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ReportingCurrencyType);
    assertEquals(ReportingCurrencyType.NATURAL, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ReportingCurrency.meta().propertySet(mock(Bean.class), "currency", "New Value", true));
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
            ReportingCurrency.meta().propertySet(mock(Bean.class), "currency", "New Value", false));
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
            ReportingCurrency.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ReportingCurrency.meta().propertySet(mock(Bean.class), "type", "New Value", true));
  }

  /**
   * Test {@link ReportingCurrency#of(Currency)}.
   *
   * <p>Method under test: {@link ReportingCurrency#of(Currency)}
   */
  @Test
  @DisplayName("Test of(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportingCurrency ReportingCurrency.of(Currency)"})
  void testOf() {
    // Arrange and Act
    ReportingCurrency actualOfResult = ReportingCurrency.of(null);

    // Assert
    assertNull(actualOfResult.getCurrency());
    assertEquals(ReportingCurrencyType.SPECIFIC, actualOfResult.getType());
    assertFalse(actualOfResult.isNatural());
    assertFalse(actualOfResult.isNone());
    assertTrue(actualOfResult.isSpecific());
  }

  /**
   * Test {@link ReportingCurrency#isSpecific()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NATURAL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isSpecific()}
   */
  @Test
  @DisplayName("Test isSpecific(); given NATURAL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isSpecific()"})
  void testIsSpecific_givenNatural_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ReportingCurrency.NATURAL.isSpecific());
  }

  /**
   * Test {@link ReportingCurrency#isSpecific()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency} with currency is {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isSpecific()}
   */
  @Test
  @DisplayName(
      "Test isSpecific(); given ReportingCurrency with currency is 'null'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isSpecific()"})
  void testIsSpecific_givenReportingCurrencyWithCurrencyIsNull_thenReturnTrue() {
    // Arrange
    ReportingCurrency ofResult = ReportingCurrency.of(null);

    // Act and Assert
    assertTrue(ofResult.isSpecific());
  }

  /**
   * Test {@link ReportingCurrency#isNatural()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NATURAL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isNatural()}
   */
  @Test
  @DisplayName("Test isNatural(); given NATURAL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isNatural()"})
  void testIsNatural_givenNatural_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ReportingCurrency.NATURAL.isNatural());
  }

  /**
   * Test {@link ReportingCurrency#isNatural()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NONE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isNatural()}
   */
  @Test
  @DisplayName("Test isNatural(); given NONE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isNatural()"})
  void testIsNatural_givenNone_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ReportingCurrency.NONE.isNatural());
  }

  /**
   * Test {@link ReportingCurrency#isNone()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NATURAL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isNone()}
   */
  @Test
  @DisplayName("Test isNone(); given NATURAL; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isNone()"})
  void testIsNone_givenNatural_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ReportingCurrency.NATURAL.isNone());
  }

  /**
   * Test {@link ReportingCurrency#isNone()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NONE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#isNone()}
   */
  @Test
  @DisplayName("Test isNone(); given NONE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReportingCurrency.isNone()"})
  void testIsNone_givenNone_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ReportingCurrency.NONE.isNone());
  }

  /**
   * Test {@link ReportingCurrency#getCurrency()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency#NATURAL}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency(); given NATURAL; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency ReportingCurrency.getCurrency()"})
  void testGetCurrency_givenNatural_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> ReportingCurrency.NATURAL.getCurrency());
  }

  /**
   * Test {@link ReportingCurrency#getCurrency()}.
   *
   * <ul>
   *   <li>Given {@link ReportingCurrency} with currency is {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#getCurrency()}
   */
  @Test
  @DisplayName(
      "Test getCurrency(); given ReportingCurrency with currency is 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency ReportingCurrency.getCurrency()"})
  void testGetCurrency_givenReportingCurrencyWithCurrencyIsNull_thenReturnNull() {
    // Arrange
    ReportingCurrency ofResult = ReportingCurrency.of(null);

    // Act and Assert
    assertNull(ofResult.getCurrency());
  }

  /**
   * Test {@link ReportingCurrency#toString()}.
   *
   * <p>Method under test: {@link ReportingCurrency#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ReportingCurrency.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Natural", ReportingCurrency.NATURAL.toString());
  }

  /**
   * Test {@link ReportingCurrency#meta()}.
   *
   * <p>Method under test: {@link ReportingCurrency#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ReportingCurrency.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ReportingCurrency.meta();

    // Assert
    MetaProperty<Currency> currencyResult = actualMetaResult.currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<ReportingCurrencyType> typeResult = actualMetaResult.type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<ReportingCurrency> expectedDeclaringTypeResult = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<ReportingCurrency> expectedDeclaringTypeResult2 = ReportingCurrency.class;
    assertEquals(expectedDeclaringTypeResult2, typeResult.declaringType());
    Class<ReportingCurrencyType> expectedPropertyTypeResult2 = ReportingCurrencyType.class;
    assertEquals(expectedPropertyTypeResult2, typeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyResult.metaBean());
    assertSame(meta, typeResult.metaBean());
  }

  /**
   * Test {@link ReportingCurrency#metaBean()}.
   *
   * <p>Method under test: {@link ReportingCurrency#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ReportingCurrency.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ReportingCurrency.NATURAL.metaBean());
  }

  /**
   * Test {@link ReportingCurrency#getType()}.
   *
   * <p>Method under test: {@link ReportingCurrency#getType()}
   */
  @Test
  @DisplayName("Test getType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportingCurrencyType ReportingCurrency.getType()"})
  void testGetType() {
    // Arrange
    ReportingCurrency ofResult = ReportingCurrency.of(null);

    // Act and Assert
    assertEquals(ReportingCurrencyType.SPECIFIC, ofResult.getType());
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}, and {@link ReportingCurrency#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportingCurrency#equals(Object)}
   *   <li>{@link ReportingCurrency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ReportingCurrency reportingCurrency = ReportingCurrency.NATURAL;
    ReportingCurrency reportingCurrency2 = ReportingCurrency.NATURAL;

    // Act and Assert
    assertEquals(reportingCurrency, reportingCurrency2);
    assertEquals(reportingCurrency.hashCode(), reportingCurrency2.hashCode());
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}, and {@link ReportingCurrency#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportingCurrency#equals(Object)}
   *   <li>{@link ReportingCurrency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ReportingCurrency ofResult = ReportingCurrency.of(null);
    ReportingCurrency ofResult2 = ReportingCurrency.of(null);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}, and {@link ReportingCurrency#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReportingCurrency#equals(Object)}
   *   <li>{@link ReportingCurrency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ReportingCurrency reportingCurrency = ReportingCurrency.NATURAL;

    // Act and Assert
    assertEquals(reportingCurrency, reportingCurrency);
    int expectedHashCodeResult = reportingCurrency.hashCode();
    assertEquals(expectedHashCodeResult, reportingCurrency.hashCode());
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ReportingCurrency.NONE, ReportingCurrency.NATURAL);
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ReportingCurrency.NATURAL, null);
  }

  /**
   * Test {@link ReportingCurrency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ReportingCurrency.equals(Object)",
    "int ReportingCurrency.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ReportingCurrency.NATURAL, "Different type to ReportingCurrency");
  }
}
