package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupIdDiffblueTest {
  /**
   * Test {@link RatesCurveGroupId#of(CurveGroupName, ObservableSource)} with {@code
   * CurveGroupName}, {@code ObservableSource}.
   *
   * <p>Method under test: {@link RatesCurveGroupId#of(CurveGroupName, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, ObservableSource) with 'CurveGroupName', 'ObservableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupId RatesCurveGroupId.of(CurveGroupName, ObservableSource)"})
  void testOfWithCurveGroupNameObservableSource() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    RatesCurveGroupId actualOfResult = RatesCurveGroupId.of(groupName, obsSource);

    // Assert
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(obsSource, actualOfResult.getObservableSource());
    assertSame(groupName, actualOfResult.getCurveGroupName());
  }

  /**
   * Test {@link RatesCurveGroupId#of(CurveGroupName)} with {@code CurveGroupName}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#of(CurveGroupName)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName) with 'CurveGroupName'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupId RatesCurveGroupId.of(CurveGroupName)"})
  void testOfWithCurveGroupName_thenReturnObservableSourceNameIsNone() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");

    // Act
    RatesCurveGroupId actualOfResult = RatesCurveGroupId.of(groupName);

    // Assert
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(groupName, actualOfResult.getCurveGroupName());
  }

  /**
   * Test {@link RatesCurveGroupId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Group Name}.
   *   <li>Then return CurveGroupName Name is {@code Group Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when 'Group Name'; then return CurveGroupName Name is 'Group Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroupId RatesCurveGroupId.of(String)"})
  void testOfWithString_whenGroupName_thenReturnCurveGroupNameNameIsGroupName() {
    // Arrange and Act
    RatesCurveGroupId actualOfResult = RatesCurveGroupId.of("Group Name");

    // Assert
    CurveGroupName curveGroupName = actualOfResult.getCurveGroupName();
    assertEquals("Group Name", curveGroupName.getName());
    assertEquals("Group Name", curveGroupName.toString());
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test {@link RatesCurveGroupId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code RatesCurveGroupId:Group Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'RatesCurveGroupId:Group Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RatesCurveGroupId.toString()"})
  void testToString_thenReturnRatesCurveGroupIdGroupName() {
    // Arrange, Act and Assert
    assertEquals("RatesCurveGroupId:Group Name", RatesCurveGroupId.of("Group Name").toString());
  }

  /**
   * Test {@link RatesCurveGroupId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code RatesCurveGroupId:RatesCurveGroupId:/Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'RatesCurveGroupId:RatesCurveGroupId:/Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RatesCurveGroupId.toString()"})
  void testToString_thenReturnRatesCurveGroupIdRatesCurveGroupIdName() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("RatesCurveGroupId:");

    // Act and Assert
    assertEquals(
        "RatesCurveGroupId:RatesCurveGroupId:/Name",
        RatesCurveGroupId.of(groupName, ObservableSource.of("Name")).toString());
  }

  /**
   * Test {@link RatesCurveGroupId#meta()}.
   *
   * <p>Method under test: {@link RatesCurveGroupId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RatesCurveGroupId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<RatesCurveGroupId> actualMetaResult = RatesCurveGroupId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<RatesCurveGroupId> expectedBeanTypeResult = RatesCurveGroupId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link RatesCurveGroupId#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveGroupId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RatesCurveGroupId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<RatesCurveGroupId> actualMetaBeanResult =
        RatesCurveGroupId.of("Group Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<RatesCurveGroupId> expectedBeanTypeResult = RatesCurveGroupId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupId#getCurveGroupName()}
   *   <li>{@link RatesCurveGroupId#getMarketDataType()}
   *   <li>{@link RatesCurveGroupId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveGroupName RatesCurveGroupId.getCurveGroupName()",
    "Class RatesCurveGroupId.getMarketDataType()",
    "ObservableSource RatesCurveGroupId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    RatesCurveGroupId ofResult = RatesCurveGroupId.of("Group Name");

    // Act
    CurveGroupName actualCurveGroupName = ofResult.getCurveGroupName();
    Class<RatesCurveGroup> actualMarketDataType = ofResult.getMarketDataType();
    ObservableSource actualObservableSource = ofResult.getObservableSource();

    // Assert
    assertEquals("Group Name", actualCurveGroupName.getName());
    assertEquals("Group Name", actualCurveGroupName.toString());
    Class<RatesCurveGroup> expectedMarketDataType = RatesCurveGroup.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(ObservableSource.NONE, actualObservableSource);
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}, and {@link RatesCurveGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupId#equals(Object)}
   *   <li>{@link RatesCurveGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RatesCurveGroupId ofResult = RatesCurveGroupId.of("Group Name");
    RatesCurveGroupId ofResult2 = RatesCurveGroupId.of("Group Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}, and {@link RatesCurveGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupId#equals(Object)}
   *   <li>{@link RatesCurveGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RatesCurveGroupId ofResult = RatesCurveGroupId.of("Group Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(RatesCurveGroupId.of("Group Name"), 1);
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RatesCurveGroupId ofResult = RatesCurveGroupId.of("42");

    // Act and Assert
    assertNotEquals(ofResult, RatesCurveGroupId.of("Group Name"));
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Group Name");
    RatesCurveGroupId ofResult = RatesCurveGroupId.of(groupName, ObservableSource.of("Name"));

    // Act and Assert
    assertNotEquals(ofResult, RatesCurveGroupId.of("Group Name"));
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(RatesCurveGroupId.of("Group Name"), null);
  }

  /**
   * Test {@link RatesCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveGroupId.equals(Object)",
    "int RatesCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(RatesCurveGroupId.of("Group Name"), "Different type to RatesCurveGroupId");
  }
}
