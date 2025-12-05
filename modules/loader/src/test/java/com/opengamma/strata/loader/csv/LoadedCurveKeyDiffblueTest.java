package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.curve.CurveName;
import java.time.LocalDate;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoadedCurveKeyDiffblueTest {
  /**
   * Test {@link LoadedCurveKey#of(LocalDate, CurveName)}.
   *
   * <ul>
   *   <li>Then return CurveName is {@link CurveName} with name is {@link
   *       CsvLoaderColumns#NAME_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#of(LocalDate, CurveName)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, CurveName); then return CurveName is CurveName with name is NAME_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoadedCurveKey LoadedCurveKey.of(LocalDate, CurveName)"})
  void testOf_thenReturnCurveNameIsCurveNameWithNameIsName_field() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);

    // Act
    LoadedCurveKey actualOfResult = LoadedCurveKey.of(curveDate, curveName);

    // Assert
    assertSame(curveName, actualOfResult.getCurveName());
    assertSame(curveDate, actualOfResult.getCurveDate());
  }

  /**
   * Test {@link LoadedCurveKey#meta()}.
   *
   * <p>Method under test: {@link LoadedCurveKey#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveKey.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<LoadedCurveKey> actualMetaResult = LoadedCurveKey.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveDate"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(actualMetaResult.isBuildable());
    Class<LoadedCurveKey> expectedBeanTypeResult = LoadedCurveKey.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link LoadedCurveKey#metaBean()}.
   *
   * <p>Method under test: {@link LoadedCurveKey#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveKey.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act
    TypedMetaBean<LoadedCurveKey> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveDate"));
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<LoadedCurveKey> expectedBeanTypeResult = LoadedCurveKey.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveKey#toString()}
   *   <li>{@link LoadedCurveKey#getCurveDate()}
   *   <li>{@link LoadedCurveKey#getCurveName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate LoadedCurveKey.getCurveDate()",
    "CurveName LoadedCurveKey.getCurveName()",
    "String LoadedCurveKey.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveKey ofResult = LoadedCurveKey.of(curveDate, curveName);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualCurveDate = ofResult.getCurveDate();

    // Assert
    assertEquals("1970-01-01", actualCurveDate.toString());
    assertEquals("LoadedCurveKey{curveDate=1970-01-01, curveName=Name}", actualToStringResult);
    assertSame(curveName, ofResult.getCurveName());
    assertSame(curveDate, actualCurveDate);
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}, and {@link LoadedCurveKey#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveKey#equals(Object)}
   *   <li>{@link LoadedCurveKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));
    LocalDate curveDate2 = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult2 =
        LoadedCurveKey.of(curveDate2, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}, and {@link LoadedCurveKey#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveKey#equals(Object)}
   *   <li>{@link LoadedCurveKey#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate curveDate = LocalDate.now();
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));
    LocalDate curveDate2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        ofResult, LoadedCurveKey.of(curveDate2, CurveName.of(CsvLoaderColumns.NAME_FIELD)));
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult = LoadedCurveKey.of(curveDate, CurveName.of("42"));
    LocalDate curveDate2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(
        ofResult, LoadedCurveKey.of(curveDate2, CurveName.of(CsvLoaderColumns.NAME_FIELD)));
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link LoadedCurveKey#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveKey#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveKey.equals(Object)", "int LoadedCurveKey.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate curveDate = LocalDate.of(1970, 1, 1);
    LoadedCurveKey ofResult =
        LoadedCurveKey.of(curveDate, CurveName.of(CsvLoaderColumns.NAME_FIELD));

    // Act and Assert
    assertNotEquals(ofResult, "Different type to LoadedCurveKey");
  }
}
