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

class IborFutureOptionVolatilitiesIdDiffblueTest {
  /**
   * Test {@link IborFutureOptionVolatilitiesId#of(IborFutureOptionVolatilitiesName)} with {@code
   * IborFutureOptionVolatilitiesName}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionVolatilitiesId#of(IborFutureOptionVolatilitiesName)}
   */
  @Test
  @DisplayName("Test of(IborFutureOptionVolatilitiesName) with 'IborFutureOptionVolatilitiesName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionVolatilitiesId IborFutureOptionVolatilitiesId.of(IborFutureOptionVolatilitiesName)"
  })
  void testOfWithIborFutureOptionVolatilitiesName() {
    // Arrange
    IborFutureOptionVolatilitiesName name = IborFutureOptionVolatilitiesName.of("Name");

    // Act
    IborFutureOptionVolatilitiesId actualOfResult = IborFutureOptionVolatilitiesId.of(name);

    // Assert
    Class<IborFutureOptionVolatilities> expectedMarketDataType = IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(name, actualOfResult.getMarketDataName());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then MarketDataName return {@link IborFutureOptionVolatilitiesName}.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; then MarketDataName return IborFutureOptionVolatilitiesName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureOptionVolatilitiesId IborFutureOptionVolatilitiesId.of(String)"})
  void testOfWithString_thenMarketDataNameReturnIborFutureOptionVolatilitiesName() {
    // Arrange and Act
    IborFutureOptionVolatilitiesId actualOfResult = IborFutureOptionVolatilitiesId.of("Name");

    // Assert
    MarketDataName<IborFutureOptionVolatilities> marketDataName =
        actualOfResult.getMarketDataName();
    assertTrue(marketDataName instanceof IborFutureOptionVolatilitiesName);
    assertEquals("Name", marketDataName.getName());
    Class<IborFutureOptionVolatilities> expectedMarketDataType = IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, marketDataName.getMarketDataType());
    Class<IborFutureOptionVolatilities> expectedMarketDataType2 =
        IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType2, actualOfResult.getMarketDataType());
    assertSame(marketDataName, actualOfResult.getName());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureOptionVolatilitiesId#toString()}
   *   <li>{@link IborFutureOptionVolatilitiesId#getMarketDataName()}
   *   <li>{@link IborFutureOptionVolatilitiesId#getMarketDataType()}
   *   <li>{@link IborFutureOptionVolatilitiesId#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataName IborFutureOptionVolatilitiesId.getMarketDataName()",
    "Class IborFutureOptionVolatilitiesId.getMarketDataType()",
    "IborFutureOptionVolatilitiesName IborFutureOptionVolatilitiesId.getName()",
    "String IborFutureOptionVolatilitiesId.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborFutureOptionVolatilitiesId ofResult = IborFutureOptionVolatilitiesId.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    MarketDataName<IborFutureOptionVolatilities> actualMarketDataName =
        ofResult.getMarketDataName();
    Class<IborFutureOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();
    IborFutureOptionVolatilitiesName actualName = ofResult.getName();

    // Assert
    assertTrue(actualMarketDataName instanceof IborFutureOptionVolatilitiesName);
    assertEquals("IborFutureOptionVolatilitiesId:Name", actualToStringResult);
    Class<IborFutureOptionVolatilities> expectedMarketDataType = IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(actualMarketDataName, actualName);
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#meta()}.
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborFutureOptionVolatilitiesId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<IborFutureOptionVolatilitiesId> actualMetaResult =
        IborFutureOptionVolatilitiesId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IborFutureOptionVolatilitiesId> expectedBeanTypeResult =
        IborFutureOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#metaBean()}.
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborFutureOptionVolatilitiesId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<IborFutureOptionVolatilitiesId> actualMetaBeanResult =
        IborFutureOptionVolatilitiesId.of("Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IborFutureOptionVolatilitiesId> expectedBeanTypeResult =
        IborFutureOptionVolatilitiesId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#equals(Object)}, and {@link
   * IborFutureOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureOptionVolatilitiesId#equals(Object)}
   *   <li>{@link IborFutureOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureOptionVolatilitiesId.equals(Object)",
    "int IborFutureOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborFutureOptionVolatilitiesId ofResult = IborFutureOptionVolatilitiesId.of("Name");
    IborFutureOptionVolatilitiesId ofResult2 = IborFutureOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#equals(Object)}, and {@link
   * IborFutureOptionVolatilitiesId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureOptionVolatilitiesId#equals(Object)}
   *   <li>{@link IborFutureOptionVolatilitiesId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureOptionVolatilitiesId.equals(Object)",
    "int IborFutureOptionVolatilitiesId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborFutureOptionVolatilitiesId ofResult = IborFutureOptionVolatilitiesId.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureOptionVolatilitiesId.equals(Object)",
    "int IborFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborFutureOptionVolatilitiesId.of("Name"), "Name");
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureOptionVolatilitiesId.equals(Object)",
    "int IborFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborFutureOptionVolatilitiesId.of("Name"), null);
  }

  /**
   * Test {@link IborFutureOptionVolatilitiesId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureOptionVolatilitiesId.equals(Object)",
    "int IborFutureOptionVolatilitiesId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborFutureOptionVolatilitiesId.of("Name"),
        "Different type to IborFutureOptionVolatilitiesId");
  }
}
