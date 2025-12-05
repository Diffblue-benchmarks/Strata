package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator;
import com.opengamma.strata.pricer.capfloor.SurfaceIborCapletFloorletVolatilityBootstrapDefinition.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SurfaceIborCapletFloorletVolatilityBootstrapDefinitionDiffblueTest {
  /**
   * Test {@link SurfaceIborCapletFloorletVolatilityBootstrapDefinition#meta()}.
   *
   * <p>Method under test: {@link SurfaceIborCapletFloorletVolatilityBootstrapDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.shiftCurve() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

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
    Class<? extends SurfaceIborCapletFloorletVolatilityBootstrapDefinition> actualBeanTypeResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().beanType();

    // Assert
    Class<SurfaceIborCapletFloorletVolatilityBootstrapDefinition> expectedBeanTypeResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#shiftCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.shiftCurve()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<GridSurfaceInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<IborCapletFloorletVolatilitiesName> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shiftCurve() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<GridSurfaceInterpolator> interpolatorResult =
        ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Curve> shiftCurveResult = ((Meta) metaBeanResult).shiftCurve();
    assertTrue(shiftCurveResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, shiftCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<GridSurfaceInterpolator> interpolatorResult =
        ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Curve> shiftCurveResult = ((Meta) metaBeanResult).shiftCurve();
    assertTrue(shiftCurveResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, shiftCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then return name is {@code interpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'interpolator'; then return name is 'interpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInterpolator_thenReturnNameIsInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
            .metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Curve> shiftCurveResult = ((Meta) metaBeanResult).shiftCurve();
    assertTrue(shiftCurveResult instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<GridSurfaceInterpolator> expectedPropertyTypeResult = GridSurfaceInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, shiftCurveResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<GridSurfaceInterpolator> interpolatorResult =
        ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Curve> shiftCurveResult = ((Meta) metaBeanResult).shiftCurve();
    assertTrue(shiftCurveResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<IborCapletFloorletVolatilitiesName> expectedPropertyTypeResult =
        IborCapletFloorletVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, shiftCurveResult.metaBean());
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
    assertNull(
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
            .metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftCurve}.
   *   <li>Then return name is {@code shiftCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftCurve'; then return name is 'shiftCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftCurve_thenReturnNameIsShiftCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().metaPropertyGet("shiftCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<GridSurfaceInterpolator> interpolatorResult =
        ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("shiftCurve", actualMetaPropertyGetResult.name());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftCurve());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("shiftCurve") instanceof DirectMetaProperty);
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
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'interpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "interpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
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
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SurfaceIborCapletFloorletVolatilityBootstrapDefinition.meta()
                .propertySet(mock(Bean.class), "shiftCurve", "New Value", true));
  }
}
