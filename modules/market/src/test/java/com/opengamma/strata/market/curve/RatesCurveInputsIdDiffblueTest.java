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

class RatesCurveInputsIdDiffblueTest {
  /**
   * Test {@link RatesCurveInputsId#of(CurveGroupName, CurveName, ObservableSource)}.
   *
   * <ul>
   *   <li>When {@link CurveGroupName} with {@code Name}.
   *   <li>Then return MarketDataType is {@link RatesCurveInputs}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#of(CurveGroupName, CurveName,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, CurveName, ObservableSource); when CurveGroupName with 'Name'; then return MarketDataType is RatesCurveInputs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveInputsId RatesCurveInputsId.of(CurveGroupName, CurveName, ObservableSource)"
  })
  void testOf_whenCurveGroupNameWithName_thenReturnMarketDataTypeIsRatesCurveInputs() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    RatesCurveInputsId actualOfResult = RatesCurveInputsId.of(groupName, curveName, obsSource);

    // Assert
    Class<RatesCurveInputs> expectedMarketDataType = RatesCurveInputs.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(obsSource, actualOfResult.getObservableSource());
    assertSame(groupName, actualOfResult.getCurveGroupName());
    assertSame(curveName, actualOfResult.getCurveName());
  }

  /**
   * Test {@link RatesCurveInputsId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code RatesCurveInputsId:Name/Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'RatesCurveInputsId:Name/Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RatesCurveInputsId.toString()"})
  void testToString_thenReturnRatesCurveInputsIdNameName() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("None"));

    // Act and Assert
    assertEquals("RatesCurveInputsId:Name/Name", ofResult.toString());
  }

  /**
   * Test {@link RatesCurveInputsId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code RatesCurveInputsId:Name/Name/Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'RatesCurveInputsId:Name/Name/Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RatesCurveInputsId.toString()"})
  void testToString_thenReturnRatesCurveInputsIdNameNameName() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals("RatesCurveInputsId:Name/Name/Name", ofResult.toString());
  }

  /**
   * Test {@link RatesCurveInputsId#meta()}.
   *
   * <p>Method under test: {@link RatesCurveInputsId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RatesCurveInputsId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<RatesCurveInputsId> actualMetaResult = RatesCurveInputsId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<RatesCurveInputsId> expectedBeanTypeResult = RatesCurveInputsId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link RatesCurveInputsId#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveInputsId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean RatesCurveInputsId.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));

    // Act
    TypedMetaBean<RatesCurveInputsId> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveGroupName"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<RatesCurveInputsId> expectedBeanTypeResult = RatesCurveInputsId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputsId#getCurveGroupName()}
   *   <li>{@link RatesCurveInputsId#getCurveName()}
   *   <li>{@link RatesCurveInputsId#getMarketDataType()}
   *   <li>{@link RatesCurveInputsId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveGroupName RatesCurveInputsId.getCurveGroupName()",
    "CurveName RatesCurveInputsId.getCurveName()",
    "Class RatesCurveInputsId.getMarketDataType()",
    "ObservableSource RatesCurveInputsId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    RatesCurveInputsId ofResult = RatesCurveInputsId.of(groupName, curveName, obsSource);

    // Act
    CurveGroupName actualCurveGroupName = ofResult.getCurveGroupName();
    CurveName actualCurveName = ofResult.getCurveName();
    Class<RatesCurveInputs> actualMarketDataType = ofResult.getMarketDataType();
    ObservableSource actualObservableSource = ofResult.getObservableSource();

    // Assert
    Class<RatesCurveInputs> expectedMarketDataType = RatesCurveInputs.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(obsSource, actualObservableSource);
    assertSame(groupName, actualCurveGroupName);
    assertSame(curveName, actualCurveName);
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}, and {@link RatesCurveInputsId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputsId#equals(Object)}
   *   <li>{@link RatesCurveInputsId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));
    CurveGroupName groupName2 = CurveGroupName.of("Name");
    CurveName curveName2 = CurveName.of("Name");

    RatesCurveInputsId ofResult2 =
        RatesCurveInputsId.of(groupName2, curveName2, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}, and {@link RatesCurveInputsId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputsId#equals(Object)}
   *   <li>{@link RatesCurveInputsId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name")), 1);
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("42");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));
    CurveGroupName groupName2 = CurveGroupName.of("Name");
    CurveName curveName2 = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(
        ofResult, RatesCurveInputsId.of(groupName2, curveName2, ObservableSource.of("Name")));
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name"));
    CurveGroupName groupName2 = CurveGroupName.of("Name");
    CurveName curveName2 = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(
        ofResult, RatesCurveInputsId.of(groupName2, curveName2, ObservableSource.of("Name")));
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    RatesCurveInputsId ofResult =
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("42"));
    CurveGroupName groupName2 = CurveGroupName.of("Name");
    CurveName curveName2 = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(
        ofResult, RatesCurveInputsId.of(groupName2, curveName2, ObservableSource.of("Name")));
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name")), null);
  }

  /**
   * Test {@link RatesCurveInputsId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputsId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RatesCurveInputsId.equals(Object)",
    "int RatesCurveInputsId.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    CurveName curveName = CurveName.of("Name");

    // Act and Assert
    assertNotEquals(
        RatesCurveInputsId.of(groupName, curveName, ObservableSource.of("Name")),
        "Different type to RatesCurveInputsId");
  }
}
