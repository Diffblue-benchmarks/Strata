package com.opengamma.strata.product.credit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.credit.CdsIndexCalibrationTrade.Meta;
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

class CdsIndexCalibrationTradeDiffblueTest {
  /**
   * Test {@link CdsIndexCalibrationTrade#meta()}.
   *
   * <p>Method under test: {@link CdsIndexCalibrationTrade#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CdsIndexCalibrationTrade.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CdsIndexCalibrationTrade.meta();

    // Assert
    MetaProperty<CdsQuote> quoteResult = actualMetaResult.quote();
    assertTrue(quoteResult instanceof DirectMetaProperty);
    MetaProperty<CdsIndexTrade> underlyingTradeResult = actualMetaResult.underlyingTrade();
    assertTrue(underlyingTradeResult instanceof DirectMetaProperty);
    assertEquals("quote", quoteResult.name());
    assertEquals("underlyingTrade", underlyingTradeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quoteResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingTradeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult, quoteResult.declaringType());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult2 = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult2, underlyingTradeResult.declaringType());
    Class<CdsIndexTrade> expectedPropertyTypeResult = CdsIndexTrade.class;
    assertEquals(expectedPropertyTypeResult, underlyingTradeResult.propertyType());
    Class<CdsQuote> expectedPropertyTypeResult2 = CdsQuote.class;
    assertEquals(expectedPropertyTypeResult2, quoteResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, quoteResult.metaBean());
    assertSame(meta, underlyingTradeResult.metaBean());
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
    Class<? extends CdsIndexCalibrationTrade> actualBeanTypeResult =
        CdsIndexCalibrationTrade.meta().beanType();

    // Assert
    Class<CdsIndexCalibrationTrade> expectedBeanTypeResult = CdsIndexCalibrationTrade.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#quote()}
   *   <li>{@link Meta#underlyingTrade()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.quote()", "MetaProperty Meta.underlyingTrade()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CdsIndexCalibrationTrade.meta();

    // Act
    MetaProperty<CdsQuote> actualQuoteResult = metaResult.quote();

    // Assert
    assertTrue(actualQuoteResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingTrade() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean quote return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean quote return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanQuoteReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexCalibrationTrade.meta().metaPropertyGet("underlyingTrade");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CdsQuote> quoteResult = ((Meta) metaBeanResult).quote();
    assertTrue(quoteResult instanceof DirectMetaProperty);
    assertEquals("quote", quoteResult.name());
    assertEquals("underlyingTrade", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, quoteResult.style());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult, quoteResult.declaringType());
    Class<CdsIndexTrade> expectedPropertyTypeResult = CdsIndexTrade.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CdsQuote> expectedPropertyTypeResult2 = CdsQuote.class;
    assertEquals(expectedPropertyTypeResult2, quoteResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingTrade());
    assertSame(Meta.INSTANCE, quoteResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean underlyingTrade return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean underlyingTrade return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanUnderlyingTradeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexCalibrationTrade.meta().metaPropertyGet("quote");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CdsIndexTrade> underlyingTradeResult = ((Meta) metaBeanResult).underlyingTrade();
    assertTrue(underlyingTradeResult instanceof DirectMetaProperty);
    assertEquals("quote", actualMetaPropertyGetResult.name());
    assertEquals("underlyingTrade", underlyingTradeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingTradeResult.style());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult, underlyingTradeResult.declaringType());
    Class<CdsIndexTrade> expectedPropertyTypeResult = CdsIndexTrade.class;
    assertEquals(expectedPropertyTypeResult, underlyingTradeResult.propertyType());
    Class<CdsQuote> expectedPropertyTypeResult2 = CdsQuote.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quote());
    assertSame(Meta.INSTANCE, underlyingTradeResult.metaBean());
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
    assertNull(CdsIndexCalibrationTrade.meta().metaPropertyGet("Property Name"));
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
        CdsIndexCalibrationTrade.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlyingTrade");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("quote");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("quote", getResult2.name());
    assertEquals("underlyingTrade", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<CdsIndexCalibrationTrade> expectedDeclaringTypeResult2 = CdsIndexCalibrationTrade.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<CdsIndexTrade> expectedPropertyTypeResult = CdsIndexTrade.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CdsQuote> expectedPropertyTypeResult2 = CdsQuote.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
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
        CdsIndexCalibrationTrade.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            CdsIndexCalibrationTrade.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            CdsIndexCalibrationTrade.meta()
                .propertySet(mock(Bean.class), "quote", "New Value", false));
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
            CdsIndexCalibrationTrade.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quote}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quote'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuote_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexCalibrationTrade.meta()
                .propertySet(mock(Bean.class), "quote", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingTrade}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlyingTrade'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlyingTrade_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexCalibrationTrade.meta()
                .propertySet(mock(Bean.class), "underlyingTrade", "New Value", true));
  }
}
