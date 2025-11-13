package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.FxMatrix;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxMatrixIdDiffblueTest {
  /**
   * Test {@link FxMatrixId#standard()}.
   *
   * <p>Method under test: {@link FxMatrixId#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixId FxMatrixId.standard()"})
  void testStandard() {
    // Arrange and Act
    FxMatrixId actualStandardResult = FxMatrixId.standard();

    // Assert
    ObservableSource observableSource = actualStandardResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, actualStandardResult.getMarketDataType());
  }

  /**
   * Test {@link FxMatrixId#of(ObservableSource)}.
   *
   * <ul>
   *   <li>When {@link ObservableSource#NONE}.
   *   <li>Then return MarketDataType is {@link FxMatrix}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#of(ObservableSource)}
   */
  @Test
  @DisplayName("Test of(ObservableSource); when NONE; then return MarketDataType is FxMatrix")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixId FxMatrixId.of(ObservableSource)"})
  void testOf_whenNone_thenReturnMarketDataTypeIsFxMatrix() {
    // Arrange and Act
    FxMatrixId actualOfResult = FxMatrixId.of(ObservableSource.NONE);

    // Assert
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(ObservableSource.NONE, actualOfResult.getObservableSource());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrixId#getMarketDataType()}
   *   <li>{@link FxMatrixId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class FxMatrixId.getMarketDataType()",
    "ObservableSource FxMatrixId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    FxMatrixId standardResult = FxMatrixId.standard();

    // Act
    Class<FxMatrix> actualMarketDataType = standardResult.getMarketDataType();
    ObservableSource actualObservableSource = standardResult.getObservableSource();

    // Assert
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(ObservableSource.NONE, actualObservableSource);
  }

  /**
   * Test {@link FxMatrixId#toString()}.
   *
   * <ul>
   *   <li>Given {@link ObservableSource} with {@code Name}.
   *   <li>Then return {@code FxMatrixId:Name}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#toString()}
   */
  @Test
  @DisplayName("Test toString(); given ObservableSource with 'Name'; then return 'FxMatrixId:Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxMatrixId.toString()"})
  void testToString_givenObservableSourceWithName_thenReturnFxMatrixIdName() {
    // Arrange, Act and Assert
    assertEquals("FxMatrixId:Name", FxMatrixId.of(ObservableSource.of("Name")).toString());
  }

  /**
   * Test {@link FxMatrixId#toString()}.
   *
   * <ul>
   *   <li>Given standard.
   *   <li>Then return {@code FxMatrixId}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#toString()}
   */
  @Test
  @DisplayName("Test toString(); given standard; then return 'FxMatrixId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxMatrixId.toString()"})
  void testToString_givenStandard_thenReturnFxMatrixId() {
    // Arrange, Act and Assert
    assertEquals("FxMatrixId", FxMatrixId.standard().toString());
  }

  /**
   * Test {@link FxMatrixId#meta()}.
   *
   * <p>Method under test: {@link FxMatrixId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean FxMatrixId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<FxMatrixId> actualMetaResult = FxMatrixId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<FxMatrixId> expectedBeanTypeResult = FxMatrixId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link FxMatrixId#metaBean()}.
   *
   * <p>Method under test: {@link FxMatrixId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean FxMatrixId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<FxMatrixId> actualMetaBeanResult = FxMatrixId.standard().metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<FxMatrixId> expectedBeanTypeResult = FxMatrixId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}, and {@link FxMatrixId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrixId#equals(Object)}
   *   <li>{@link FxMatrixId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FxMatrixId standardResult = FxMatrixId.standard();
    FxMatrixId standardResult2 = FxMatrixId.standard();

    // Act and Assert
    assertEquals(standardResult, standardResult2);
    assertEquals(standardResult.hashCode(), standardResult2.hashCode());
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}, and {@link FxMatrixId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrixId#equals(Object)}
   *   <li>{@link FxMatrixId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FxMatrixId ofResult = FxMatrixId.of(ObservableSource.NONE);
    FxMatrixId standardResult = FxMatrixId.standard();

    // Act and Assert
    assertEquals(ofResult, standardResult);
    assertEquals(ofResult.hashCode(), standardResult.hashCode());
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}, and {@link FxMatrixId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxMatrixId#equals(Object)}
   *   <li>{@link FxMatrixId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FxMatrixId standardResult = FxMatrixId.standard();

    // Act and Assert
    assertEquals(standardResult, standardResult);
    int expectedHashCodeResult = standardResult.hashCode();
    assertEquals(expectedHashCodeResult, standardResult.hashCode());
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxMatrixId.of(ObservableSource.NONE), null);
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxMatrixId.standard(), null);
  }

  /**
   * Test {@link FxMatrixId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxMatrixId.equals(Object)", "int FxMatrixId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxMatrixId.standard(), "Different type to FxMatrixId");
  }
}
