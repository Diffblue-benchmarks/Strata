package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KnownAmountRateComputationDiffblueTest {
  /**
   * Test {@link KnownAmountRateComputation#of(CurrencyAmount)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Amount is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link KnownAmountRateComputation#of(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test of(CurrencyAmount); when 'null'; then return Amount is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"KnownAmountRateComputation KnownAmountRateComputation.of(CurrencyAmount)"})
  void testOf_whenNull_thenReturnAmountIsNull() {
    // Arrange and Act
    KnownAmountRateComputation actualOfResult = KnownAmountRateComputation.of(null);

    // Assert
    assertNull(actualOfResult.getAmount());
  }

  /**
   * Test {@link KnownAmountRateComputation#meta()}.
   *
   * <p>Method under test: {@link KnownAmountRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean KnownAmountRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<KnownAmountRateComputation> actualMetaResult = KnownAmountRateComputation.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("amount"));
    assertTrue(actualMetaResult.isBuildable());
    Class<KnownAmountRateComputation> expectedBeanTypeResult = KnownAmountRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link KnownAmountRateComputation#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link KnownAmountRateComputation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean KnownAmountRateComputation.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    KnownAmountRateComputation ofResult = KnownAmountRateComputation.of(null);

    // Act
    TypedMetaBean<KnownAmountRateComputation> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("amount"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<KnownAmountRateComputation> expectedBeanTypeResult = KnownAmountRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link KnownAmountRateComputation#equals(Object)}, and {@link
   * KnownAmountRateComputation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link KnownAmountRateComputation#equals(Object)}
   *   <li>{@link KnownAmountRateComputation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean KnownAmountRateComputation.equals(Object)",
    "int KnownAmountRateComputation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    KnownAmountRateComputation ofResult = KnownAmountRateComputation.of(null);
    KnownAmountRateComputation ofResult2 = KnownAmountRateComputation.of(null);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link KnownAmountRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link KnownAmountRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean KnownAmountRateComputation.equals(Object)",
    "int KnownAmountRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    KnownAmountRateComputation ofResult = KnownAmountRateComputation.of(null);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link KnownAmountRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link KnownAmountRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean KnownAmountRateComputation.equals(Object)",
    "int KnownAmountRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    KnownAmountRateComputation ofResult = KnownAmountRateComputation.of(null);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }
}
