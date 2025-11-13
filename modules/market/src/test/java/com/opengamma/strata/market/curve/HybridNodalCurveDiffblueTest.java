package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.HybridNodalCurve.Meta;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolators;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HybridNodalCurveDiffblueTest {
  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends HybridNodalCurve> actualBeanTypeResult = HybridNodalCurve.meta().beanType();

    // Assert
    Class<HybridNodalCurve> expectedBeanTypeResult = HybridNodalCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#leftCurve()}
   *   <li>{@link Meta#rightCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.leftCurve()", "MetaProperty Meta.rightCurve()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = HybridNodalCurve.meta();

    // Act
    MetaProperty<NodalCurve> actualLeftCurveResult = metaResult.leftCurve();

    // Assert
    assertTrue(actualLeftCurveResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rightCurve() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean leftCurve return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean leftCurve return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanLeftCurveReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        HybridNodalCurve.meta().metaPropertyGet("rightCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<NodalCurve> leftCurveResult = ((Meta) metaBeanResult).leftCurve();
    assertTrue(leftCurveResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("leftCurve", leftCurveResult.name());
    assertEquals("rightCurve", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, leftCurveResult.style());
    Class<HybridNodalCurve> expectedDeclaringTypeResult = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, leftCurveResult.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult, leftCurveResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rightCurve());
    assertSame(Meta.INSTANCE, leftCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean rightCurve return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean rightCurve return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanRightCurveReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        HybridNodalCurve.meta().metaPropertyGet("leftCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<NodalCurve> rightCurveResult = ((Meta) metaBeanResult).rightCurve();
    assertTrue(rightCurveResult instanceof DirectMetaProperty);
    assertEquals("leftCurve", actualMetaPropertyGetResult.name());
    assertEquals("rightCurve", rightCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, rightCurveResult.style());
    Class<HybridNodalCurve> expectedDeclaringTypeResult = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, rightCurveResult.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult, rightCurveResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).leftCurve());
    assertSame(Meta.INSTANCE, rightCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(HybridNodalCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        HybridNodalCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("leftCurve");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("rightCurve");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("leftCurve", getResult.name());
    assertEquals("rightCurve", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<HybridNodalCurve> expectedDeclaringTypeResult = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<HybridNodalCurve> expectedDeclaringTypeResult2 = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<NodalCurve> expectedPropertyTypeResult2 = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(HybridNodalCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> HybridNodalCurve.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            HybridNodalCurve.meta().propertySet(mock(Bean.class), "leftCurve", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code leftCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'leftCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLeftCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            HybridNodalCurve.meta().propertySet(mock(Bean.class), "leftCurve", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            HybridNodalCurve.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rightCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rightCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRightCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            HybridNodalCurve.meta().propertySet(mock(Bean.class), "rightCurve", "New Value", true));
  }

  /**
   * Test {@link HybridNodalCurve#of(CurveMetadata, DoubleArray, DoubleArray, int,
   * CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HybridNodalCurve#of(CurveMetadata, DoubleArray, DoubleArray, int,
   * CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, DoubleArray, DoubleArray, int, CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HybridNodalCurve HybridNodalCurve.of(CurveMetadata, DoubleArray, DoubleArray, int, CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void testOf_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray xValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            HybridNodalCurve.of(
                metadata,
                xValues,
                DoubleArray.of(),
                1,
                CurveInterpolators.DOUBLE_QUADRATIC,
                CurveInterpolators.DOUBLE_QUADRATIC,
                CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
                CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE));
  }

  /**
   * Test {@link HybridNodalCurve#of(CurveMetadata, DoubleArray, DoubleArray, int,
   * CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HybridNodalCurve#of(CurveMetadata, DoubleArray, DoubleArray, int,
   * CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, DoubleArray, DoubleArray, int, CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HybridNodalCurve HybridNodalCurve.of(CurveMetadata, DoubleArray, DoubleArray, int, CurveInterpolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void testOf_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray xValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            HybridNodalCurve.of(
                metadata,
                xValues,
                DoubleArray.of(),
                -1,
                CurveInterpolators.DOUBLE_QUADRATIC,
                CurveInterpolators.DOUBLE_QUADRATIC,
                CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
                CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE));
  }

  /**
   * Test {@link HybridNodalCurve#meta()}.
   *
   * <p>Method under test: {@link HybridNodalCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta HybridNodalCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = HybridNodalCurve.meta();

    // Assert
    MetaProperty<NodalCurve> leftCurveResult = actualMetaResult.leftCurve();
    assertTrue(leftCurveResult instanceof DirectMetaProperty);
    MetaProperty<NodalCurve> rightCurveResult = actualMetaResult.rightCurve();
    assertTrue(rightCurveResult instanceof DirectMetaProperty);
    assertEquals("leftCurve", leftCurveResult.name());
    assertEquals("rightCurve", rightCurveResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, leftCurveResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, rightCurveResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<HybridNodalCurve> expectedDeclaringTypeResult = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, leftCurveResult.declaringType());
    Class<HybridNodalCurve> expectedDeclaringTypeResult2 = HybridNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, rightCurveResult.declaringType());
    Class<NodalCurve> expectedPropertyTypeResult = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult, leftCurveResult.propertyType());
    Class<NodalCurve> expectedPropertyTypeResult2 = NodalCurve.class;
    assertEquals(expectedPropertyTypeResult2, rightCurveResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, leftCurveResult.metaBean());
    assertSame(meta, rightCurveResult.metaBean());
  }
}
