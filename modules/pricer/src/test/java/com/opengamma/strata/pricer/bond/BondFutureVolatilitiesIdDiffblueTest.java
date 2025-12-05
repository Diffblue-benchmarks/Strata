package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataName;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureVolatilitiesIdDiffblueTest {
  /**
   * Test {@link BondFutureVolatilitiesId#of(BondFutureVolatilitiesName)} with {@code
   * BondFutureVolatilitiesName}.
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#of(BondFutureVolatilitiesName)}
   */
  @Test
  @DisplayName("Test of(BondFutureVolatilitiesName) with 'BondFutureVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureVolatilitiesId BondFutureVolatilitiesId.of(BondFutureVolatilitiesName)"
  })
  void testOfWithBondFutureVolatilitiesName() {
    // Arrange
    BondFutureVolatilitiesName name = BondFutureVolatilitiesName.of("Name");

    // Act
    BondFutureVolatilitiesId actualOfResult = BondFutureVolatilitiesId.of(name);

    // Assert
    Class<BondFutureVolatilities> expectedMarketDataType = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link BondFutureVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then MarketDataName return {@link BondFutureVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when 'Name'; then MarketDataName return BondFutureVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BondFutureVolatilitiesId BondFutureVolatilitiesId.of(String)"})
  void testOfWithString_whenName_thenMarketDataNameReturnBondFutureVolatilitiesName() {
    // Arrange and Act
    BondFutureVolatilitiesId actualOfResult = BondFutureVolatilitiesId.of("Name");

    // Assert
    MarketDataName<BondFutureVolatilities> marketDataName = actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof BondFutureVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<BondFutureVolatilities> expectedMarketDataType = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<BondFutureVolatilities> expectedMarketDataType2 = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BondFutureVolatilitiesId#toString()}
   *   <li>{@link BondFutureVolatilitiesId#getMarketDataName()}
   *   <li>{@link BondFutureVolatilitiesId#getMarketDataType()}
   *   <li>{@link BondFutureVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName BondFutureVolatilitiesId.getMarketDataName()",
    "Class BondFutureVolatilitiesId.getMarketDataType()",
    "BondFutureVolatilitiesName BondFutureVolatilitiesId.getName()",
    "String BondFutureVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    BondFutureVolatilitiesId ofResult = BondFutureVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<BondFutureVolatilities> actualMarketDataName = ofResult.getMarketDataName();
    Class<BondFutureVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    BondFutureVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof BondFutureVolatilitiesName);
    assertEquals("BondFutureVolatilitiesId:Name", actualToStringResult);
    Class<BondFutureVolatilities> expectedMarketDataType = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link BondFutureVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean BondFutureVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<BondFutureVolatilitiesId> actualMetaResult = BondFutureVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<BondFutureVolatilitiesId> expectedBeanTypeResult = BondFutureVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link BondFutureVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean BondFutureVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<BondFutureVolatilitiesId> actualMetaBeanResult =
        BondFutureVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<BondFutureVolatilitiesId> expectedBeanTypeResult = BondFutureVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link BondFutureVolatilitiesId#equals(Object)}, and {@link
   * BondFutureVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BondFutureVolatilitiesId#equals(Object)}
   *   <li>{@link BondFutureVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BondFutureVolatilitiesId.equals(Object)",
    "int BondFutureVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BondFutureVolatilitiesId ofResult = BondFutureVolatilitiesId.of("Name");
    BondFutureVolatilitiesId ofResult2 = BondFutureVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link BondFutureVolatilitiesId#equals(Object)}, and {@link
   * BondFutureVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BondFutureVolatilitiesId#equals(Object)}
   *   <li>{@link BondFutureVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BondFutureVolatilitiesId.equals(Object)",
    "int BondFutureVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BondFutureVolatilitiesId ofResult = BondFutureVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link BondFutureVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BondFutureVolatilitiesId.equals(Object)",
    "int BondFutureVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BondFutureVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link BondFutureVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BondFutureVolatilitiesId.equals(Object)",
    "int BondFutureVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BondFutureVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link BondFutureVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BondFutureVolatilitiesId.equals(Object)",
    "int BondFutureVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        BondFutureVolatilitiesId.of("Name"), "Different type to BondFutureVolatilitiesId");
  }
}
