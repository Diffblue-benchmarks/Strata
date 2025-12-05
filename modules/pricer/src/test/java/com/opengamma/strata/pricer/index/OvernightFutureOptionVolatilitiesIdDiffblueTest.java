package com.opengamma.strata.pricer.index;

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

class OvernightFutureOptionVolatilitiesIdDiffblueTest {
  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#of(OvernightFutureOptionVolatilitiesName)} with
   * {@code OvernightFutureOptionVolatilitiesName}.
   *
   * <p>Method under test: {@link
   * OvernightFutureOptionVolatilitiesId#of(OvernightFutureOptionVolatilitiesName)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightFutureOptionVolatilitiesName) with 'OvernightFutureOptionVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionVolatilitiesId OvernightFutureOptionVolatilitiesId.of(OvernightFutureOptionVolatilitiesName)"
  })
  void testOfWithOvernightFutureOptionVolatilitiesName() {
    // Arrange
    OvernightFutureOptionVolatilitiesName name = OvernightFutureOptionVolatilitiesName.of("Name");

    // Act
    OvernightFutureOptionVolatilitiesId actualOfResult =
        OvernightFutureOptionVolatilitiesId.of(name);

    // Assert
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then MarketDataName return {@link OvernightFutureOptionVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; then MarketDataName return OvernightFutureOptionVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionVolatilitiesId OvernightFutureOptionVolatilitiesId.of(String)"
  })
  void testOfWithString_thenMarketDataNameReturnOvernightFutureOptionVolatilitiesName() {
    // Arrange and Act
    OvernightFutureOptionVolatilitiesId actualOfResult =
        OvernightFutureOptionVolatilitiesId.of("Name");

    // Assert
    MarketDataName<OvernightFutureOptionVolatilities> marketDataName =
        actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof OvernightFutureOptionVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType2 =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureOptionVolatilitiesId#toString()}
   *   <li>{@link OvernightFutureOptionVolatilitiesId#getMarketDataName()}
   *   <li>{@link OvernightFutureOptionVolatilitiesId#getMarketDataType()}
   *   <li>{@link OvernightFutureOptionVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName OvernightFutureOptionVolatilitiesId.getMarketDataName()",
    "Class OvernightFutureOptionVolatilitiesId.getMarketDataType()",
    "OvernightFutureOptionVolatilitiesName OvernightFutureOptionVolatilitiesId.getName()",
    "String OvernightFutureOptionVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    OvernightFutureOptionVolatilitiesId ofResult = OvernightFutureOptionVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<OvernightFutureOptionVolatilities> actualMarketDataName =
        ofResult.getMarketDataName();
    Class<OvernightFutureOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    OvernightFutureOptionVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof OvernightFutureOptionVolatilitiesName);
    assertEquals("OvernightFutureOptionVolatilitiesId:Name", actualToStringResult);
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean OvernightFutureOptionVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<OvernightFutureOptionVolatilitiesId> actualMetaResult =
        OvernightFutureOptionVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<OvernightFutureOptionVolatilitiesId> expectedBeanTypeResult =
        OvernightFutureOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean OvernightFutureOptionVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<OvernightFutureOptionVolatilitiesId> actualMetaBeanResult =
        OvernightFutureOptionVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<OvernightFutureOptionVolatilitiesId> expectedBeanTypeResult =
        OvernightFutureOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#equals(Object)}, and {@link
   * OvernightFutureOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureOptionVolatilitiesId#equals(Object)}
   *   <li>{@link OvernightFutureOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureOptionVolatilitiesId.equals(Object)",
    "int OvernightFutureOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OvernightFutureOptionVolatilitiesId ofResult = OvernightFutureOptionVolatilitiesId.of("Name");
    OvernightFutureOptionVolatilitiesId ofResult2 = OvernightFutureOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#equals(Object)}, and {@link
   * OvernightFutureOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureOptionVolatilitiesId#equals(Object)}
   *   <li>{@link OvernightFutureOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureOptionVolatilitiesId.equals(Object)",
    "int OvernightFutureOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OvernightFutureOptionVolatilitiesId ofResult = OvernightFutureOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureOptionVolatilitiesId.equals(Object)",
    "int OvernightFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(OvernightFutureOptionVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureOptionVolatilitiesId.equals(Object)",
    "int OvernightFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(OvernightFutureOptionVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link OvernightFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureOptionVolatilitiesId.equals(Object)",
    "int OvernightFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        OvernightFutureOptionVolatilitiesId.of("Name"),
        "Different type to OvernightFutureOptionVolatilitiesId");
  }
}
