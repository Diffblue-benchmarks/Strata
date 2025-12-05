package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradedPriceDiffblueTest {
  /**
   * Test {@link TradedPrice#of(LocalDate, double)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Price is ten.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#of(LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double); when LocalDate with '1970' and one and one; then return Price is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradedPrice TradedPrice.of(LocalDate, double)"})
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnPriceIsTen() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);

    // Act
    TradedPrice actualOfResult = TradedPrice.of(tradeDate, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getPrice());
    assertSame(tradeDate, actualOfResult.getTradeDate());
  }

  /**
   * Test {@link TradedPrice#meta()}.
   *
   * <p>Method under test: {@link TradedPrice#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradedPrice.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<TradedPrice> actualMetaResult = TradedPrice.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("price"));
    assertTrue(metaPropertyMapResult.containsKey("tradeDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<TradedPrice> expectedBeanTypeResult = TradedPrice.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link TradedPrice#metaBean()}.
   *
   * <p>Method under test: {@link TradedPrice#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradedPrice.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<TradedPrice> actualMetaBeanResult =
        TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("price"));
    assertTrue(metaPropertyMapResult.containsKey("tradeDate"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<TradedPrice> expectedBeanTypeResult = TradedPrice.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradedPrice#toString()}
   *   <li>{@link TradedPrice#getPrice()}
   *   <li>{@link TradedPrice#getTradeDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double TradedPrice.getPrice()",
    "LocalDate TradedPrice.getTradeDate()",
    "String TradedPrice.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    TradedPrice ofResult = TradedPrice.of(tradeDate, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualPrice = ofResult.getPrice();
    LocalDate actualTradeDate = ofResult.getTradeDate();

    // Assert
    assertEquals("1970-01-01", actualTradeDate.toString());
    assertEquals("TradedPrice{tradeDate=1970-01-01, price=10.0}", actualToStringResult);
    assertEquals(10.0d, actualPrice);
    assertSame(tradeDate, actualTradeDate);
  }

  /**
   * Test {@link TradedPrice#equals(Object)}, and {@link TradedPrice#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradedPrice#equals(Object)}
   *   <li>{@link TradedPrice#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TradedPrice ofResult = TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d);
    TradedPrice ofResult2 = TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TradedPrice#equals(Object)}, and {@link TradedPrice#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradedPrice#equals(Object)}
   *   <li>{@link TradedPrice#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TradedPrice ofResult = TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TradedPrice#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d), 1);
  }

  /**
   * Test {@link TradedPrice#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TradedPrice ofResult = TradedPrice.of(LocalDate.now(), 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link TradedPrice#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TradedPrice ofResult = TradedPrice.of(LocalDate.of(1970, 1, 1), 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link TradedPrice#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d), null);
  }

  /**
   * Test {@link TradedPrice#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradedPrice#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradedPrice.equals(Object)", "int TradedPrice.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TradedPrice.of(LocalDate.of(1970, 1, 1), 10.0d), "Different type to TradedPrice");
  }
}
