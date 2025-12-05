package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.Trade;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeListDiffblueTest {
  /**
   * Test {@link TradeList#of(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Trades is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TradeList#of(List)}
   */
  @Test
  @DisplayName("Test of(List); when ArrayList(); then return Trades is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeList TradeList.of(List)"})
  void testOf_whenArrayList_thenReturnTradesIsArrayList() {
    // Arrange
    ArrayList<Trade> trades = new ArrayList<>();

    // Act
    TradeList actualOfResult = TradeList.of(trades);

    // Assert
    assertEquals(trades, actualOfResult.getTrades());
  }

  /**
   * Test {@link TradeList#meta()}.
   *
   * <p>Method under test: {@link TradeList#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradeList.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<TradeList> actualMetaResult = TradeList.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("trades"));
    assertTrue(actualMetaResult.isBuildable());
    Class<TradeList> expectedBeanTypeResult = TradeList.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link TradeList#metaBean()}.
   *
   * <p>Method under test: {@link TradeList#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradeList.metaBean()"})
  void testMetaBean() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());

    // Act
    TypedMetaBean<TradeList> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("trades"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<TradeList> expectedBeanTypeResult = TradeList.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeList#toString()}
   *   <li>{@link TradeList#getTrades()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableList TradeList.getTrades()",
    "String TradeList.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("TradeList{trades=[]}", actualToStringResult);
    assertTrue(ofResult.getTrades().isEmpty());
  }

  /**
   * Test {@link TradeList#equals(Object)}, and {@link TradeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeList#equals(Object)}
   *   <li>{@link TradeList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeList.equals(Object)", "int TradeList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());
    TradeList ofResult2 = TradeList.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TradeList#equals(Object)}, and {@link TradeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeList#equals(Object)}
   *   <li>{@link TradeList#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeList.equals(Object)", "int TradeList.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TradeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeList.equals(Object)", "int TradeList.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link TradeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeList#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeList.equals(Object)", "int TradeList.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    TradeList ofResult = TradeList.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to TradeList");
  }
}
