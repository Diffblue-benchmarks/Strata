package com.opengamma.strata.pricer.swaption;

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

class SwaptionVolatilitiesIdDiffblueTest {
  /**
   * Test {@link SwaptionVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then MarketDataName return {@link SwaptionVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when 'Name'; then MarketDataName return SwaptionVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionVolatilitiesId SwaptionVolatilitiesId.of(String)"})
  void testOfWithString_whenName_thenMarketDataNameReturnSwaptionVolatilitiesName() {
    // Arrange and Act
    SwaptionVolatilitiesId actualOfResult = SwaptionVolatilitiesId.of("Name");

    // Assert
    MarketDataName<SwaptionVolatilities> marketDataName = actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof SwaptionVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<SwaptionVolatilities> expectedMarketDataType = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<SwaptionVolatilities> expectedMarketDataType2 = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test {@link SwaptionVolatilitiesId#of(SwaptionVolatilitiesName)} with {@code
   * SwaptionVolatilitiesName}.
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#of(SwaptionVolatilitiesName)}
   */
  @Test
  @DisplayName("Test of(SwaptionVolatilitiesName) with 'SwaptionVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionVolatilitiesId SwaptionVolatilitiesId.of(SwaptionVolatilitiesName)"})
  void testOfWithSwaptionVolatilitiesName() {
    // Arrange
    SwaptionVolatilitiesName name = SwaptionVolatilitiesName.of("Name");

    // Act
    SwaptionVolatilitiesId actualOfResult = SwaptionVolatilitiesId.of(name);

    // Assert
    Class<SwaptionVolatilities> expectedMarketDataType = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionVolatilitiesId#toString()}
   *   <li>{@link SwaptionVolatilitiesId#getMarketDataName()}
   *   <li>{@link SwaptionVolatilitiesId#getMarketDataType()}
   *   <li>{@link SwaptionVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName SwaptionVolatilitiesId.getMarketDataName()",
    "Class SwaptionVolatilitiesId.getMarketDataType()",
    "SwaptionVolatilitiesName SwaptionVolatilitiesId.getName()",
    "String SwaptionVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SwaptionVolatilitiesId ofResult = SwaptionVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<SwaptionVolatilities> actualMarketDataName = ofResult.getMarketDataName();
    Class<SwaptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    SwaptionVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof SwaptionVolatilitiesName);
    assertEquals("SwaptionVolatilitiesId:Name", actualToStringResult);
    Class<SwaptionVolatilities> expectedMarketDataType = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link SwaptionVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SwaptionVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SwaptionVolatilitiesId> actualMetaResult = SwaptionVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SwaptionVolatilitiesId> expectedBeanTypeResult = SwaptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SwaptionVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SwaptionVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<SwaptionVolatilitiesId> actualMetaBeanResult =
        SwaptionVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SwaptionVolatilitiesId> expectedBeanTypeResult = SwaptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SwaptionVolatilitiesId#equals(Object)}, and {@link
   * SwaptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionVolatilitiesId#equals(Object)}
   *   <li>{@link SwaptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionVolatilitiesId.equals(Object)",
    "int SwaptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SwaptionVolatilitiesId ofResult = SwaptionVolatilitiesId.of("Name");
    SwaptionVolatilitiesId ofResult2 = SwaptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SwaptionVolatilitiesId#equals(Object)}, and {@link
   * SwaptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionVolatilitiesId#equals(Object)}
   *   <li>{@link SwaptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionVolatilitiesId.equals(Object)",
    "int SwaptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SwaptionVolatilitiesId ofResult = SwaptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SwaptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionVolatilitiesId.equals(Object)",
    "int SwaptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SwaptionVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link SwaptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionVolatilitiesId.equals(Object)",
    "int SwaptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SwaptionVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link SwaptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionVolatilitiesId.equals(Object)",
    "int SwaptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SwaptionVolatilitiesId.of("Name"), "Different type to SwaptionVolatilitiesId");
  }
}
