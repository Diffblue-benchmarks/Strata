package com.opengamma.strata.pricer.fxopt;

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

class FxOptionVolatilitiesIdDiffblueTest {
  /**
   * Test {@link FxOptionVolatilitiesId#of(FxOptionVolatilitiesName)} with {@code
   * FxOptionVolatilitiesName}.
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#of(FxOptionVolatilitiesName)}
   */
  @Test
  @DisplayName("Test of(FxOptionVolatilitiesName) with 'FxOptionVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionVolatilitiesId FxOptionVolatilitiesId.of(FxOptionVolatilitiesName)"})
  void testOfWithFxOptionVolatilitiesName() {
    // Arrange
    FxOptionVolatilitiesName name = FxOptionVolatilitiesName.of("Name");

    // Act
    FxOptionVolatilitiesId actualOfResult = FxOptionVolatilitiesId.of(name);

    // Assert
    Class<FxOptionVolatilities> expectedMarketDataType = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link FxOptionVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then MarketDataName return {@link FxOptionVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when 'Name'; then MarketDataName return FxOptionVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionVolatilitiesId FxOptionVolatilitiesId.of(String)"})
  void testOfWithString_whenName_thenMarketDataNameReturnFxOptionVolatilitiesName() {
    // Arrange and Act
    FxOptionVolatilitiesId actualOfResult = FxOptionVolatilitiesId.of("Name");

    // Assert
    MarketDataName<FxOptionVolatilities> marketDataName = actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof FxOptionVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<FxOptionVolatilities> expectedMarketDataType = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<FxOptionVolatilities> expectedMarketDataType2 = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxOptionVolatilitiesId#toString()}
   *   <li>{@link FxOptionVolatilitiesId#getMarketDataName()}
   *   <li>{@link FxOptionVolatilitiesId#getMarketDataType()}
   *   <li>{@link FxOptionVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName FxOptionVolatilitiesId.getMarketDataName()",
    "Class FxOptionVolatilitiesId.getMarketDataType()",
    "FxOptionVolatilitiesName FxOptionVolatilitiesId.getName()",
    "String FxOptionVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FxOptionVolatilitiesId ofResult = FxOptionVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<FxOptionVolatilities> actualMarketDataName = ofResult.getMarketDataName();
    Class<FxOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    FxOptionVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof FxOptionVolatilitiesName);
    assertEquals("FxOptionVolatilitiesId:Name", actualToStringResult);
    Class<FxOptionVolatilities> expectedMarketDataType = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link FxOptionVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean FxOptionVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<FxOptionVolatilitiesId> actualMetaResult = FxOptionVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<FxOptionVolatilitiesId> expectedBeanTypeResult = FxOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link FxOptionVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean FxOptionVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<FxOptionVolatilitiesId> actualMetaBeanResult =
        FxOptionVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<FxOptionVolatilitiesId> expectedBeanTypeResult = FxOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link FxOptionVolatilitiesId#equals(Object)}, and {@link
   * FxOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxOptionVolatilitiesId#equals(Object)}
   *   <li>{@link FxOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxOptionVolatilitiesId.equals(Object)",
    "int FxOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FxOptionVolatilitiesId ofResult = FxOptionVolatilitiesId.of("Name");
    FxOptionVolatilitiesId ofResult2 = FxOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link FxOptionVolatilitiesId#equals(Object)}, and {@link
   * FxOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxOptionVolatilitiesId#equals(Object)}
   *   <li>{@link FxOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxOptionVolatilitiesId.equals(Object)",
    "int FxOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FxOptionVolatilitiesId ofResult = FxOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link FxOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxOptionVolatilitiesId.equals(Object)",
    "int FxOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxOptionVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link FxOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxOptionVolatilitiesId.equals(Object)",
    "int FxOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxOptionVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link FxOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxOptionVolatilitiesId.equals(Object)",
    "int FxOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxOptionVolatilitiesId.of("Name"), "Different type to FxOptionVolatilitiesId");
  }
}
