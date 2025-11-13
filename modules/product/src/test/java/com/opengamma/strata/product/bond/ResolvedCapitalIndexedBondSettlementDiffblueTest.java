package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
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

class ResolvedCapitalIndexedBondSettlementDiffblueTest {
  /**
   * Test {@link ResolvedCapitalIndexedBondSettlement#of(LocalDate, double, BondPaymentPeriod)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Price is zero.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedCapitalIndexedBondSettlement#of(LocalDate, double,
   * BondPaymentPeriod)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double, BondPaymentPeriod); when zero; then return Price is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResolvedCapitalIndexedBondSettlement ResolvedCapitalIndexedBondSettlement.of(LocalDate, double, BondPaymentPeriod)"
  })
  void testOf_whenZero_thenReturnPriceIsZero() {
    // Arrange
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);
    BondPaymentPeriod amount = mock(BondPaymentPeriod.class);

    // Act
    ResolvedCapitalIndexedBondSettlement actualOfResult =
        ResolvedCapitalIndexedBondSettlement.of(settlementDate, 0.0d, amount);

    // Assert
    assertEquals(0.0d, actualOfResult.getPrice());
    assertSame(settlementDate, actualOfResult.getSettlementDate());
    assertSame(amount, actualOfResult.getPayment());
  }

  /**
   * Test {@link ResolvedCapitalIndexedBondSettlement#meta()}.
   *
   * <p>Method under test: {@link ResolvedCapitalIndexedBondSettlement#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean ResolvedCapitalIndexedBondSettlement.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<ResolvedCapitalIndexedBondSettlement> actualMetaResult =
        ResolvedCapitalIndexedBondSettlement.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("payment"));
    assertTrue(metaPropertyMapResult.containsKey("price"));
    assertTrue(metaPropertyMapResult.containsKey("settlementDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ResolvedCapitalIndexedBondSettlement> expectedBeanTypeResult =
        ResolvedCapitalIndexedBondSettlement.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
