package com.opengamma.strata.product.bond;

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

class ResolvedFixedCouponBondSettlementDiffblueTest {
  /**
   * Test {@link ResolvedFixedCouponBondSettlement#of(LocalDate, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Price is ten.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#of(LocalDate, double)}
   */
  @Test
  @DisplayName("Test of(LocalDate, double); when ten; then return Price is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResolvedFixedCouponBondSettlement ResolvedFixedCouponBondSettlement.of(LocalDate, double)"
  })
  void testOf_whenTen_thenReturnPriceIsTen() {
    // Arrange
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    // Act
    ResolvedFixedCouponBondSettlement actualOfResult =
        ResolvedFixedCouponBondSettlement.of(settlementDate, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getPrice());
    assertSame(settlementDate, actualOfResult.getSettlementDate());
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#meta()}.
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ResolvedFixedCouponBondSettlement.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<ResolvedFixedCouponBondSettlement> actualMetaResult =
        ResolvedFixedCouponBondSettlement.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("price"));
    assertTrue(metaPropertyMapResult.containsKey("settlementDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ResolvedFixedCouponBondSettlement> expectedBeanTypeResult =
        ResolvedFixedCouponBondSettlement.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#metaBean()}.
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ResolvedFixedCouponBondSettlement.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<ResolvedFixedCouponBondSettlement> actualMetaBeanResult =
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("price"));
    assertTrue(metaPropertyMapResult.containsKey("settlementDate"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<ResolvedFixedCouponBondSettlement> expectedBeanTypeResult =
        ResolvedFixedCouponBondSettlement.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResolvedFixedCouponBondSettlement#toString()}
   *   <li>{@link ResolvedFixedCouponBondSettlement#getPrice()}
   *   <li>{@link ResolvedFixedCouponBondSettlement#getSettlementDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ResolvedFixedCouponBondSettlement.getPrice()",
    "LocalDate ResolvedFixedCouponBondSettlement.getSettlementDate()",
    "String ResolvedFixedCouponBondSettlement.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);
    ResolvedFixedCouponBondSettlement ofResult =
        ResolvedFixedCouponBondSettlement.of(settlementDate, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualPrice = ofResult.getPrice();
    LocalDate actualSettlementDate = ofResult.getSettlementDate();

    // Assert
    assertEquals("1970-01-01", actualSettlementDate.toString());
    assertEquals(
        "ResolvedFixedCouponBondSettlement{settlementDate=1970-01-01, price=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualPrice);
    assertSame(settlementDate, actualSettlementDate);
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}, and {@link
   * ResolvedFixedCouponBondSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResolvedFixedCouponBondSettlement#equals(Object)}
   *   <li>{@link ResolvedFixedCouponBondSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ResolvedFixedCouponBondSettlement ofResult =
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d);
    ResolvedFixedCouponBondSettlement ofResult2 =
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}, and {@link
   * ResolvedFixedCouponBondSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResolvedFixedCouponBondSettlement#equals(Object)}
   *   <li>{@link ResolvedFixedCouponBondSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ResolvedFixedCouponBondSettlement ofResult =
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d), 1);
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ResolvedFixedCouponBondSettlement ofResult =
        ResolvedFixedCouponBondSettlement.of(LocalDate.now(), 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ResolvedFixedCouponBondSettlement ofResult =
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 0.5d);

    // Act and Assert
    assertNotEquals(
        ofResult, ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d), null);
  }

  /**
   * Test {@link ResolvedFixedCouponBondSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedFixedCouponBondSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ResolvedFixedCouponBondSettlement.equals(Object)",
    "int ResolvedFixedCouponBondSettlement.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ResolvedFixedCouponBondSettlement.of(LocalDate.of(1970, 1, 1), 10.0d),
        "Different type to ResolvedFixedCouponBondSettlement");
  }
}
