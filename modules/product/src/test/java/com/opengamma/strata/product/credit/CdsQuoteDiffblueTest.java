package com.opengamma.strata.product.credit;

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
import com.opengamma.strata.product.credit.CdsQuote.Meta;
import com.opengamma.strata.product.credit.type.CdsQuoteConvention;
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

class CdsQuoteDiffblueTest {
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
    Class<? extends CdsQuote> actualBeanTypeResult = CdsQuote.meta().beanType();

    // Assert
    Class<CdsQuote> expectedBeanTypeResult = CdsQuote.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#quoteConvention()}
   *   <li>{@link Meta#quotedValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.quoteConvention()", "MetaProperty Meta.quotedValue()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CdsQuote.meta();

    // Act
    MetaProperty<CdsQuoteConvention> actualQuoteConventionResult = metaResult.quoteConvention();

    // Assert
    assertTrue(actualQuoteConventionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.quotedValue() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean quoteConvention return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean quoteConvention return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanQuoteConventionReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsQuote.meta().metaPropertyGet("quotedValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CdsQuoteConvention> quoteConventionResult =
        ((Meta) metaBeanResult).quoteConvention();
    assertTrue(quoteConventionResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("quoteConvention", quoteConventionResult.name());
    assertEquals("quotedValue", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quoteConventionResult.style());
    Class<CdsQuote> expectedDeclaringTypeResult = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult, quoteConventionResult.declaringType());
    Class<CdsQuoteConvention> expectedPropertyTypeResult = CdsQuoteConvention.class;
    assertEquals(expectedPropertyTypeResult, quoteConventionResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quotedValue());
    assertSame(Meta.INSTANCE, quoteConventionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean quotedValue return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean quotedValue return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanQuotedValueReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsQuote.meta().metaPropertyGet("quoteConvention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quotedValueResult = ((Meta) metaBeanResult).quotedValue();
    assertTrue(quotedValueResult instanceof DirectMetaProperty);
    assertEquals("double", quotedValueResult.propertyType().getName());
    assertEquals("quoteConvention", actualMetaPropertyGetResult.name());
    assertEquals("quotedValue", quotedValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quotedValueResult.style());
    Class<CdsQuote> expectedDeclaringTypeResult = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult, quotedValueResult.declaringType());
    Class<CdsQuoteConvention> expectedPropertyTypeResult = CdsQuoteConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quoteConvention());
    assertSame(Meta.INSTANCE, quotedValueResult.metaBean());
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
    assertNull(CdsQuote.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = CdsQuote.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("quoteConvention");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("quotedValue");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("quoteConvention", getResult.name());
    assertEquals("quotedValue", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<CdsQuote> expectedDeclaringTypeResult = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CdsQuote> expectedDeclaringTypeResult2 = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<CdsQuoteConvention> expectedPropertyTypeResult = CdsQuoteConvention.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(CdsQuote.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CdsQuote.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code quoteConvention}.
   *   <li>Then return {@link CdsQuoteConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'quoteConvention'; then return CdsQuoteConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenQuoteConvention_thenReturnCdsQuoteConvention() {
    // Arrange
    Meta metaResult = CdsQuote.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d), "quoteConvention", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CdsQuoteConvention);
    assertEquals(CdsQuoteConvention.PAR_SPREAD, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code quotedValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'quotedValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenQuotedValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = CdsQuote.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d), "quotedValue", true))
            .doubleValue());
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
        () -> CdsQuote.meta().propertySet(mock(Bean.class), "quoteConvention", "New Value", false));
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
        () -> CdsQuote.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quoteConvention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quoteConvention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuoteConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CdsQuote.meta().propertySet(mock(Bean.class), "quoteConvention", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quotedValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quotedValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuotedValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CdsQuote.meta().propertySet(mock(Bean.class), "quotedValue", "New Value", true));
  }

  /**
   * Test {@link CdsQuote#of(CdsQuoteConvention, double)}.
   *
   * <ul>
   *   <li>When {@code PAR_SPREAD}.
   *   <li>Then return QuotedValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#of(CdsQuoteConvention, double)}
   */
  @Test
  @DisplayName(
      "Test of(CdsQuoteConvention, double); when 'PAR_SPREAD'; then return QuotedValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CdsQuote CdsQuote.of(CdsQuoteConvention, double)"})
  void testOf_whenParSpread_thenReturnQuotedValueIsTen() {
    // Arrange and Act
    CdsQuote actualOfResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getQuotedValue());
    assertEquals(CdsQuoteConvention.PAR_SPREAD, actualOfResult.getQuoteConvention());
  }

  /**
   * Test {@link CdsQuote#meta()}.
   *
   * <p>Method under test: {@link CdsQuote#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CdsQuote.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CdsQuote.meta();

    // Assert
    MetaProperty<CdsQuoteConvention> quoteConventionResult = actualMetaResult.quoteConvention();
    assertTrue(quoteConventionResult instanceof DirectMetaProperty);
    MetaProperty<Double> quotedValueResult = actualMetaResult.quotedValue();
    assertTrue(quotedValueResult instanceof DirectMetaProperty);
    assertEquals("double", quotedValueResult.propertyType().getName());
    assertEquals("quoteConvention", quoteConventionResult.name());
    assertEquals("quotedValue", quotedValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quoteConventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, quotedValueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CdsQuote> expectedDeclaringTypeResult = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult, quoteConventionResult.declaringType());
    Class<CdsQuote> expectedDeclaringTypeResult2 = CdsQuote.class;
    assertEquals(expectedDeclaringTypeResult2, quotedValueResult.declaringType());
    Class<CdsQuoteConvention> expectedPropertyTypeResult = CdsQuoteConvention.class;
    assertEquals(expectedPropertyTypeResult, quoteConventionResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, quoteConventionResult.metaBean());
    assertSame(meta, quotedValueResult.metaBean());
  }

  /**
   * Test {@link CdsQuote#metaBean()}.
   *
   * <p>Method under test: {@link CdsQuote#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CdsQuote.metaBean()"})
  void testMetaBean() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CdsQuote#toString()}
   *   <li>{@link CdsQuote#getQuoteConvention()}
   *   <li>{@link CdsQuote#getQuotedValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CdsQuoteConvention CdsQuote.getQuoteConvention()",
    "double CdsQuote.getQuotedValue()",
    "String CdsQuote.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    CdsQuoteConvention actualQuoteConvention = ofResult.getQuoteConvention();

    // Assert
    assertEquals("CdsQuote{quoteConvention=ParSpread, quotedValue=10.0}", actualToStringResult);
    assertEquals(10.0d, ofResult.getQuotedValue());
    assertEquals(CdsQuoteConvention.PAR_SPREAD, actualQuoteConvention);
  }

  /**
   * Test {@link CdsQuote#equals(Object)}, and {@link CdsQuote#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CdsQuote#equals(Object)}
   *   <li>{@link CdsQuote#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);
    CdsQuote ofResult2 = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CdsQuote#equals(Object)}, and {@link CdsQuote#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CdsQuote#equals(Object)}
   *   <li>{@link CdsQuote#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CdsQuote#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link CdsQuote#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.POINTS_UPFRONT, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d));
  }

  /**
   * Test {@link CdsQuote#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d));
  }

  /**
   * Test {@link CdsQuote#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link CdsQuote#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuote#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsQuote.equals(Object)", "int CdsQuote.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CdsQuote ofResult = CdsQuote.of(CdsQuoteConvention.PAR_SPREAD, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to CdsQuote");
  }
}
