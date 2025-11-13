package com.opengamma.strata.pricer.capfloor;

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

class IborCapletFloorletVolatilitiesIdDiffblueTest {
  /**
   * Test {@link IborCapletFloorletVolatilitiesId#of(IborCapletFloorletVolatilitiesName)} with
   * {@code IborCapletFloorletVolatilitiesName}.
   *
   * <p>Method under test: {@link
   * IborCapletFloorletVolatilitiesId#of(IborCapletFloorletVolatilitiesName)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapletFloorletVolatilitiesName) with 'IborCapletFloorletVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletVolatilitiesId IborCapletFloorletVolatilitiesId.of(IborCapletFloorletVolatilitiesName)"
  })
  void testOfWithIborCapletFloorletVolatilitiesName() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");

    // Act
    IborCapletFloorletVolatilitiesId actualOfResult = IborCapletFloorletVolatilitiesId.of(name);

    // Assert
    Class<IborCapletFloorletVolatilities> expectedMarketDataType =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then MarketDataName return {@link IborCapletFloorletVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; then MarketDataName return IborCapletFloorletVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletVolatilitiesId IborCapletFloorletVolatilitiesId.of(String)"
  })
  void testOfWithString_thenMarketDataNameReturnIborCapletFloorletVolatilitiesName() {
    // Arrange and Act
    IborCapletFloorletVolatilitiesId actualOfResult = IborCapletFloorletVolatilitiesId.of("Name");

    // Assert
    MarketDataName<IborCapletFloorletVolatilities> marketDataName =
        actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof IborCapletFloorletVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<IborCapletFloorletVolatilities> expectedMarketDataType =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<IborCapletFloorletVolatilities> expectedMarketDataType2 =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletVolatilitiesId#toString()}
   *   <li>{@link IborCapletFloorletVolatilitiesId#getMarketDataName()}
   *   <li>{@link IborCapletFloorletVolatilitiesId#getMarketDataType()}
   *   <li>{@link IborCapletFloorletVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName IborCapletFloorletVolatilitiesId.getMarketDataName()",
    "Class IborCapletFloorletVolatilitiesId.getMarketDataType()",
    "IborCapletFloorletVolatilitiesName IborCapletFloorletVolatilitiesId.getName()",
    "String IborCapletFloorletVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborCapletFloorletVolatilitiesId ofResult = IborCapletFloorletVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<IborCapletFloorletVolatilities> actualMarketDataName =
        ofResult.getMarketDataName();
    Class<IborCapletFloorletVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    IborCapletFloorletVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof IborCapletFloorletVolatilitiesName);
    assertEquals("IborCapletFloorletVolatilitiesId:Name", actualToStringResult);
    Class<IborCapletFloorletVolatilities> expectedMarketDataType =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborCapletFloorletVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<IborCapletFloorletVolatilitiesId> actualMetaResult =
        IborCapletFloorletVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IborCapletFloorletVolatilitiesId> expectedBeanTypeResult =
        IborCapletFloorletVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborCapletFloorletVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<IborCapletFloorletVolatilitiesId> actualMetaBeanResult =
        IborCapletFloorletVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IborCapletFloorletVolatilitiesId> expectedBeanTypeResult =
        IborCapletFloorletVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#equals(Object)}, and {@link
   * IborCapletFloorletVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletVolatilitiesId#equals(Object)}
   *   <li>{@link IborCapletFloorletVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletVolatilitiesId.equals(Object)",
    "int IborCapletFloorletVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborCapletFloorletVolatilitiesId ofResult = IborCapletFloorletVolatilitiesId.of("Name");
    IborCapletFloorletVolatilitiesId ofResult2 = IborCapletFloorletVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#equals(Object)}, and {@link
   * IborCapletFloorletVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletVolatilitiesId#equals(Object)}
   *   <li>{@link IborCapletFloorletVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletVolatilitiesId.equals(Object)",
    "int IborCapletFloorletVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborCapletFloorletVolatilitiesId ofResult = IborCapletFloorletVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletVolatilitiesId.equals(Object)",
    "int IborCapletFloorletVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborCapletFloorletVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletVolatilitiesId.equals(Object)",
    "int IborCapletFloorletVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborCapletFloorletVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link IborCapletFloorletVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletVolatilitiesId.equals(Object)",
    "int IborCapletFloorletVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborCapletFloorletVolatilitiesId.of("Name"),
        "Different type to IborCapletFloorletVolatilitiesId");
  }
}
