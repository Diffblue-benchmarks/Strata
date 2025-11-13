package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.DefaultCurveMetadata;
import com.opengamma.strata.market.curve.InterpolatedNodalCurve;
import com.opengamma.strata.market.curve.interpolator.BoundCurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LoadedCurveSettingsDiffblueTest {
  /**
   * Test {@link LoadedCurveSettings#of(CurveName, ValueType, ValueType, DayCount,
   * CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}.
   *
   * <ul>
   *   <li>Then return XValueType is {@link ValueType} with name is {@link
   *       CsvLoaderColumns#NAME_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#of(CurveName, ValueType, ValueType, DayCount,
   * CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(CurveName, ValueType, ValueType, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator); then return XValueType is ValueType with name is NAME_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LoadedCurveSettings LoadedCurveSettings.of(CurveName, ValueType, ValueType, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void testOf_thenReturnXValueTypeIsValueTypeWithNameIsName_field() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);
    ValueType yValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);
    DayCount dayCount = mock(DayCount.class);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    LoadedCurveSettings actualOfResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            yValueType,
            dayCount,
            interpolator,
            extrapolatorLeft,
            extrapolatorRight);

    // Assert
    assertSame(xValueType, actualOfResult.getXValueType());
    assertSame(yValueType, actualOfResult.getYValueType());
    assertSame(curveName, actualOfResult.getCurveName());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(extrapolatorLeft, actualOfResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfResult.getInterpolator());
  }

  /**
   * Test {@link LoadedCurveSettings#createCurve(LocalDate, List)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#createCurve(LocalDate, List)}
   */
  @Test
  @DisplayName("Test createCurve(LocalDate, List); then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"InterpolatedNodalCurve LoadedCurveSettings.createCurve(LocalDate, List)"})
  void testCreateCurve_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(Double.NaN);

    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(mock(BoundCurveInterpolator.class));
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            dayCount,
            interpolator,
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));
    LocalDate date = LocalDate.of(1970, 1, 1);

    ArrayList<LoadedCurveNode> curveNodes = new ArrayList<>();
    curveNodes.add(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "date"));
    curveNodes.add(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "curveName"));

    // Act
    InterpolatedNodalCurve actualCreateCurveResult = ofResult.createCurve(date, curveNodes);

    // Assert
    verify(dayCount, atLeast(1)).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(interpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertTrue(actualCreateCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(2, actualCreateCurveResult.getParameterCount());
    assertSame(curveName, actualCreateCurveResult.getName());
  }

  /**
   * Test {@link LoadedCurveSettings#meta()}.
   *
   * <p>Method under test: {@link LoadedCurveSettings#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveSettings.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<LoadedCurveSettings> actualMetaResult = LoadedCurveSettings.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(7, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("dayCount"));
    assertTrue(metaPropertyMapResult.containsKey("extrapolatorLeft"));
    assertTrue(metaPropertyMapResult.containsKey("interpolator"));
    assertTrue(metaPropertyMapResult.containsKey("xValueType"));
    assertTrue(metaPropertyMapResult.containsKey("yValueType"));
    assertTrue(actualMetaResult.isBuildable());
    Class<LoadedCurveSettings> expectedBeanTypeResult = LoadedCurveSettings.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link LoadedCurveSettings#metaBean()}.
   *
   * <p>Method under test: {@link LoadedCurveSettings#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveSettings.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));

    // Act
    TypedMetaBean<LoadedCurveSettings> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(7, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curveName"));
    assertTrue(metaPropertyMapResult.containsKey("dayCount"));
    assertTrue(metaPropertyMapResult.containsKey("extrapolatorLeft"));
    assertTrue(metaPropertyMapResult.containsKey("interpolator"));
    assertTrue(metaPropertyMapResult.containsKey("xValueType"));
    assertTrue(metaPropertyMapResult.containsKey("yValueType"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<LoadedCurveSettings> expectedBeanTypeResult = LoadedCurveSettings.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveSettings#toString()}
   *   <li>{@link LoadedCurveSettings#getCurveName()}
   *   <li>{@link LoadedCurveSettings#getDayCount()}
   *   <li>{@link LoadedCurveSettings#getExtrapolatorLeft()}
   *   <li>{@link LoadedCurveSettings#getExtrapolatorRight()}
   *   <li>{@link LoadedCurveSettings#getInterpolator()}
   *   <li>{@link LoadedCurveSettings#getXValueType()}
   *   <li>{@link LoadedCurveSettings#getYValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveName LoadedCurveSettings.getCurveName()",
    "DayCount LoadedCurveSettings.getDayCount()",
    "CurveExtrapolator LoadedCurveSettings.getExtrapolatorLeft()",
    "CurveExtrapolator LoadedCurveSettings.getExtrapolatorRight()",
    "CurveInterpolator LoadedCurveSettings.getInterpolator()",
    "ValueType LoadedCurveSettings.getXValueType()",
    "ValueType LoadedCurveSettings.getYValueType()",
    "String LoadedCurveSettings.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);
    ValueType yValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            yValueType,
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));

    // Act
    ofResult.toString();
    CurveName actualCurveName = ofResult.getCurveName();
    ofResult.getDayCount();
    ofResult.getExtrapolatorLeft();
    ofResult.getExtrapolatorRight();
    ofResult.getInterpolator();
    ValueType actualXValueType = ofResult.getXValueType();

    // Assert
    assertSame(xValueType, actualXValueType);
    assertSame(yValueType, ofResult.getYValueType());
    assertSame(curveName, actualCurveName);
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}, and {@link LoadedCurveSettings#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveSettings#equals(Object)}
   *   <li>{@link LoadedCurveSettings#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));
    CurveName curveName2 = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType2 = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        LoadedCurveSettings.of(
            curveName2,
            xValueType2,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)));
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveName curveName = CurveName.of("42");
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));
    CurveName curveName2 = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType2 = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        LoadedCurveSettings.of(
            curveName2,
            xValueType2,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)));
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of("42");

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));
    CurveName curveName2 = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType2 = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        LoadedCurveSettings.of(
            curveName2,
            xValueType2,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)));
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    LoadedCurveSettings ofResult =
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of("42"),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class));
    CurveName curveName2 = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType2 = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        LoadedCurveSettings.of(
            curveName2,
            xValueType2,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)));
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)),
        null);
  }

  /**
   * Test {@link LoadedCurveSettings#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveSettings#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LoadedCurveSettings.equals(Object)",
    "int LoadedCurveSettings.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);
    ValueType xValueType = ValueType.of(CsvLoaderColumns.NAME_FIELD);

    // Act and Assert
    assertNotEquals(
        LoadedCurveSettings.of(
            curveName,
            xValueType,
            ValueType.of(CsvLoaderColumns.NAME_FIELD),
            mock(DayCount.class),
            mock(CurveInterpolator.class),
            mock(CurveExtrapolator.class),
            mock(CurveExtrapolator.class)),
        "Different type to LoadedCurveSettings");
  }
}
