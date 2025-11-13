package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveIdDiffblueTest {
  /**
   * Test {@link CurveId#of(CurveGroupName, CurveName, ObservableSource)} with {@code
   * CurveGroupName}, {@code CurveName}, {@code ObservableSource}.
   *
   * <p>Method under test: {@link CurveId#of(CurveGroupName, CurveName, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, CurveName, ObservableSource) with 'CurveGroupName', 'CurveName', 'ObservableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveId CurveId.of(CurveGroupName, CurveName, ObservableSource)"})
  void testOfWithCurveGroupNameCurveNameObservableSource() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    CurveId actualOfResult = CurveId.of(groupName, curveName, obsSource);

    // Assert
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(obsSource, actualOfResult.getObservableSource());
    assertSame(groupName, actualOfResult.getCurveGroupName());
    assertSame(curveName, actualOfResult.getCurveName());
    assertSame(curveName, actualOfResult.getMarketDataName());
  }

  /**
   * Test {@link CurveId#of(CurveGroupName, CurveName)} with {@code CurveGroupName}, {@code
   * CurveName}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#of(CurveGroupName, CurveName)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, CurveName) with 'CurveGroupName', 'CurveName'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveId CurveId.of(CurveGroupName, CurveName)"})
  void testOfWithCurveGroupNameCurveName_thenReturnObservableSourceNameIsNone() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    // Act
    CurveId actualOfResult = CurveId.of(groupName, curveName);

    // Assert
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(groupName, actualOfResult.getCurveGroupName());
    assertSame(curveName, actualOfResult.getCurveName());
    assertSame(curveName, actualOfResult.getMarketDataName());
  }

  /**
   * Test {@link CurveId#of(String, String)} with {@code String}, {@code String}.
   *
   * <ul>
   *   <li>When {@code Group Name}.
   *   <li>Then return CurveName Name is {@code Curve Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#of(String, String)}
   */
  @Test
  @DisplayName(
      "Test of(String, String) with 'String', 'String'; when 'Group Name'; then return CurveName Name is 'Curve Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveId CurveId.of(String, String)"})
  void testOfWithStringString_whenGroupName_thenReturnCurveNameNameIsCurveName() {
    // Arrange and Act
    CurveId actualOfResult = CurveId.of("Group Name", "Curve Name");

    // Assert
    CurveName curveName = actualOfResult.getCurveName();
    assertEquals("Curve Name", curveName.getName());
    CurveGroupName curveGroupName = actualOfResult.getCurveGroupName();
    assertEquals("Group Name", curveGroupName.getName());
    assertEquals("Group Name", curveGroupName.toString());
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    Class<Curve> expectedMarketDataType2 = Curve.class;
    assertEquals(expectedMarketDataType2, curveName.getMarketDataType());
    assertSame(curveName, actualOfResult.getMarketDataName());
  }

  /**
   * Test {@link CurveId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code CurveId:CurveId:/CurveId:/Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'CurveId:CurveId:/CurveId:/Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurveId.toString()"})
  void testToString_thenReturnCurveIdCurveIdCurveIdName() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("CurveId:");
    CurveName curveName = CurveName.of("CurveId:");

    CurveId ofResult = CurveId.of(groupName, curveName, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals("CurveId:CurveId:/CurveId:/Name", ofResult.toString());
  }

  /**
   * Test {@link CurveId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code CurveId:Group Name/Curve Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'CurveId:Group Name/Curve Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurveId.toString()"})
  void testToString_thenReturnCurveIdGroupNameCurveName() {
    // Arrange, Act and Assert
    assertEquals(
        "CurveId:Group Name/Curve Name", CurveId.of("Group Name", "Curve Name").toString());
  }

  /**
   * Test {@link CurveId#meta()}.
   *
   * <p>Method under test: {@link CurveId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CurveId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<CurveId> actualMetaResult = CurveId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<CurveId> expectedBeanTypeResult = CurveId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link CurveId#metaBean()}.
   *
   * <p>Method under test: {@link CurveId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean CurveId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<CurveId> actualMetaBeanResult = CurveId.of("Group Name", "Curve Name").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<CurveId> expectedBeanTypeResult = CurveId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveId#getCurveGroupName()}
   *   <li>{@link CurveId#getCurveName()}
   *   <li>{@link CurveId#getMarketDataName()}
   *   <li>{@link CurveId#getMarketDataType()}
   *   <li>{@link CurveId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveGroupName CurveId.getCurveGroupName()",
    "CurveName CurveId.getCurveName()",
    "MarketDataName CurveId.getMarketDataName()",
    "Class CurveId.getMarketDataType()",
    "ObservableSource CurveId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveId ofResult = CurveId.of("Group Name", "Curve Name");

    // Act
    CurveGroupName actualCurveGroupName = ofResult.getCurveGroupName();
    CurveName actualCurveName = ofResult.getCurveName();
    MarketDataName<Curve> actualMarketDataName = ofResult.getMarketDataName();
    Class<Curve> actualMarketDataType = ofResult.getMarketDataType();
    ObservableSource actualObservableSource = ofResult.getObservableSource();

    // Assert
    assertEquals("Curve Name", actualCurveName.getName());
    assertEquals("Group Name", actualCurveGroupName.getName());
    assertEquals("Group Name", actualCurveGroupName.toString());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    Class<Curve> expectedMarketDataType2 = Curve.class;
    assertEquals(expectedMarketDataType2, actualCurveName.getMarketDataType());
    assertSame(actualCurveName, actualMarketDataName);
    assertSame(ObservableSource.NONE, actualObservableSource);
  }

  /**
   * Test {@link CurveId#equals(Object)}, and {@link CurveId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveId#equals(Object)}
   *   <li>{@link CurveId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveId ofResult = CurveId.of("Group Name", "Curve Name");
    CurveId ofResult2 = CurveId.of("Group Name", "Curve Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CurveId#equals(Object)}, and {@link CurveId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveId#equals(Object)}
   *   <li>{@link CurveId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveId ofResult = CurveId.of("Group Name", "Curve Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CurveId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Group Name");
    CurveId ofResult = CurveId.of(groupName, CurveName.of("Group Name"));

    // Act and Assert
    assertNotEquals(ofResult, CurveId.of("Group Name", "Curve Name"));
  }

  /**
   * Test {@link CurveId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveId ofResult = CurveId.of("Curve Name", "Curve Name");

    // Act and Assert
    assertNotEquals(ofResult, CurveId.of("Group Name", "Curve Name"));
  }

  /**
   * Test {@link CurveId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveId.of("Group Name", "Curve Name"), null);
  }

  /**
   * Test {@link CurveId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveId.equals(Object)", "int CurveId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveId.of("Group Name", "Curve Name"), "Different type to CurveId");
  }
}
