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

class LegalEntityCurveGroupIdDiffblueTest {
  /**
   * Test {@link LegalEntityCurveGroupId#of(CurveGroupName, ObservableSource)} with {@code
   * CurveGroupName}, {@code ObservableSource}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#of(CurveGroupName, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, ObservableSource) with 'CurveGroupName', 'ObservableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityCurveGroupId LegalEntityCurveGroupId.of(CurveGroupName, ObservableSource)"
  })
  void testOfWithCurveGroupNameObservableSource() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    LegalEntityCurveGroupId actualOfResult = LegalEntityCurveGroupId.of(groupName, obsSource);

    // Assert
    Class<LegalEntityCurveGroup> expectedMarketDataType = LegalEntityCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(obsSource, actualOfResult.getObservableSource());
    assertSame(groupName, actualOfResult.getCurveGroupName());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#of(CurveGroupName)} with {@code CurveGroupName}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#of(CurveGroupName)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName) with 'CurveGroupName'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityCurveGroupId LegalEntityCurveGroupId.of(CurveGroupName)"})
  void testOfWithCurveGroupName_thenReturnObservableSourceNameIsNone() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");

    // Act
    LegalEntityCurveGroupId actualOfResult = LegalEntityCurveGroupId.of(groupName);

    // Assert
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<LegalEntityCurveGroup> expectedMarketDataType = LegalEntityCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(groupName, actualOfResult.getCurveGroupName());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Group Name}.
   *   <li>Then return CurveGroupName Name is {@code Group Name}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when 'Group Name'; then return CurveGroupName Name is 'Group Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityCurveGroupId LegalEntityCurveGroupId.of(String)"})
  void testOfWithString_whenGroupName_thenReturnCurveGroupNameNameIsGroupName() {
    // Arrange and Act
    LegalEntityCurveGroupId actualOfResult = LegalEntityCurveGroupId.of("Group Name");

    // Assert
    CurveGroupName curveGroupName = actualOfResult.getCurveGroupName();
    assertEquals("Group Name", curveGroupName.getName());
    assertEquals("Group Name", curveGroupName.toString());
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<LegalEntityCurveGroup> expectedMarketDataType = LegalEntityCurveGroup.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code LegalEntityCurveGroupId:Group Name}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'LegalEntityCurveGroupId:Group Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String LegalEntityCurveGroupId.toString()"})
  void testToString_thenReturnLegalEntityCurveGroupIdGroupName() {
    // Arrange, Act and Assert
    assertEquals(
        "LegalEntityCurveGroupId:Group Name", LegalEntityCurveGroupId.of("Group Name").toString());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code LegalEntityCurveGroupId:LegalEntityCurveGroupId:/Name}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); then return 'LegalEntityCurveGroupId:LegalEntityCurveGroupId:/Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String LegalEntityCurveGroupId.toString()"})
  void testToString_thenReturnLegalEntityCurveGroupIdLegalEntityCurveGroupIdName() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("LegalEntityCurveGroupId:");

    // Act and Assert
    assertEquals(
        "LegalEntityCurveGroupId:LegalEntityCurveGroupId:/Name",
        LegalEntityCurveGroupId.of(groupName, ObservableSource.of("Name")).toString());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#meta()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LegalEntityCurveGroupId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<LegalEntityCurveGroupId> actualMetaResult = LegalEntityCurveGroupId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<LegalEntityCurveGroupId> expectedBeanTypeResult = LegalEntityCurveGroupId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#metaBean()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LegalEntityCurveGroupId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<LegalEntityCurveGroupId> actualMetaBeanResult =
        LegalEntityCurveGroupId.of("Group Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<LegalEntityCurveGroupId> expectedBeanTypeResult = LegalEntityCurveGroupId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroupId#getCurveGroupName()}
   *   <li>{@link LegalEntityCurveGroupId#getMarketDataType()}
   *   <li>{@link LegalEntityCurveGroupId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveGroupName LegalEntityCurveGroupId.getCurveGroupName()",
    "Class LegalEntityCurveGroupId.getMarketDataType()",
    "ObservableSource LegalEntityCurveGroupId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    LegalEntityCurveGroupId ofResult = LegalEntityCurveGroupId.of("Group Name");

    // Act
    CurveGroupName actualCurveGroupName = ofResult.getCurveGroupName();
    Class<LegalEntityCurveGroup> actualMarketDataType = ofResult.getMarketDataType();
    ObservableSource actualObservableSource = ofResult.getObservableSource();

    // Assert
    assertEquals("Group Name", actualCurveGroupName.getName());
    assertEquals("Group Name", actualCurveGroupName.toString());
    Class<LegalEntityCurveGroup> expectedMarketDataType = LegalEntityCurveGroup.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(ObservableSource.NONE, actualObservableSource);
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}, and {@link
   * LegalEntityCurveGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroupId#equals(Object)}
   *   <li>{@link LegalEntityCurveGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LegalEntityCurveGroupId ofResult = LegalEntityCurveGroupId.of("Group Name");
    LegalEntityCurveGroupId ofResult2 = LegalEntityCurveGroupId.of("Group Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}, and {@link
   * LegalEntityCurveGroupId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroupId#equals(Object)}
   *   <li>{@link LegalEntityCurveGroupId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LegalEntityCurveGroupId ofResult = LegalEntityCurveGroupId.of("Group Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LegalEntityCurveGroupId.of("Group Name"), 1);
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LegalEntityCurveGroupId ofResult = LegalEntityCurveGroupId.of("42");

    // Act and Assert
    assertNotEquals(ofResult, LegalEntityCurveGroupId.of("Group Name"));
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Group Name");
    LegalEntityCurveGroupId ofResult =
        LegalEntityCurveGroupId.of(groupName, ObservableSource.of("Name"));

    // Act and Assert
    assertNotEquals(ofResult, LegalEntityCurveGroupId.of("Group Name"));
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LegalEntityCurveGroupId.of("Group Name"), null);
  }

  /**
   * Test {@link LegalEntityCurveGroupId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroupId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroupId.equals(Object)",
    "int LegalEntityCurveGroupId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        LegalEntityCurveGroupId.of("Group Name"), "Different type to LegalEntityCurveGroupId");
  }
}
