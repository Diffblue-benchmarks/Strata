package com.opengamma.strata.pricer.swaption;

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
import com.opengamma.strata.market.surface.interpolator.SurfaceInterpolator;
import com.opengamma.strata.pricer.swaption.SabrSwaptionDefinition.Meta;
import com.opengamma.strata.product.swap.type.FixedFloatSwapConvention;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrSwaptionDefinitionDiffblueTest {
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
    Class<? extends SabrSwaptionDefinition> actualBeanTypeResult =
        SabrSwaptionDefinition.meta().beanType();

    // Assert
    Class<SabrSwaptionDefinition> expectedBeanTypeResult = SabrSwaptionDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.convention()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.name()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();

    // Act
    MetaProperty<FixedFloatSwapConvention> actualConventionResult = metaResult.convention();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<SurfaceInterpolator> actualInterpolatorResult = metaResult.interpolator();

    // Assert
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return name is {@code convention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'convention'; then return name is 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConvention_thenReturnNameIsConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SabrSwaptionDefinition.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    Class<FixedFloatSwapConvention> expectedPropertyTypeResult = FixedFloatSwapConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        SabrSwaptionDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedFloatSwapConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        SabrSwaptionDefinition.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedFloatSwapConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionVolatilitiesName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<SurfaceInterpolator> expectedPropertyTypeResult = SurfaceInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        SabrSwaptionDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedFloatSwapConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<SwaptionVolatilitiesName> expectedPropertyTypeResult = SwaptionVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
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
    assertNull(SabrSwaptionDefinition.meta().metaPropertyGet("Property Name"));
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
        SabrSwaptionDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("convention") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
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
    assertNull(SabrSwaptionDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenConvention_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();
    SabrSwaptionDefinition bean =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "convention", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();
    SabrSwaptionDefinition bean =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "dayCount", true));
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
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();
    SabrSwaptionDefinition bean =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'interpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInterpolator_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();
    SabrSwaptionDefinition bean =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "interpolator", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link SwaptionVolatilitiesName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return SwaptionVolatilitiesName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnSwaptionVolatilitiesNameWithName() {
    // Arrange
    Meta metaResult = SabrSwaptionDefinition.meta();
    SwaptionVolatilitiesName name = SwaptionVolatilitiesName.of("Name");
    SabrSwaptionDefinition bean =
        SabrSwaptionDefinition.of(
            name,
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act and Assert
    assertSame(name, metaResult.propertyGet(bean, "name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SabrSwaptionDefinition.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", true));
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
            SabrSwaptionDefinition.meta()
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
            SabrSwaptionDefinition.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", false));
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
            SabrSwaptionDefinition.meta()
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
            SabrSwaptionDefinition.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            SabrSwaptionDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link SabrSwaptionDefinition#of(SwaptionVolatilitiesName, FixedFloatSwapConvention,
   * DayCount, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>Then return Name is {@link SwaptionVolatilitiesName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionDefinition#of(SwaptionVolatilitiesName,
   * FixedFloatSwapConvention, DayCount, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SwaptionVolatilitiesName, FixedFloatSwapConvention, DayCount, SurfaceInterpolator); then return Name is SwaptionVolatilitiesName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrSwaptionDefinition SabrSwaptionDefinition.of(SwaptionVolatilitiesName, FixedFloatSwapConvention, DayCount, SurfaceInterpolator)"
  })
  void testOf_thenReturnNameIsSwaptionVolatilitiesNameWithName() {
    // Arrange
    SwaptionVolatilitiesName name = SwaptionVolatilitiesName.of("Name");
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    DayCount dayCount = mock(DayCount.class);
    SurfaceInterpolator interpolator = mock(SurfaceInterpolator.class);

    // Act
    SabrSwaptionDefinition actualOfResult =
        SabrSwaptionDefinition.of(name, convention, dayCount, interpolator);

    // Assert
    assertSame(name, actualOfResult.getName());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(interpolator, actualOfResult.getInterpolator());
    assertSame(convention, actualOfResult.getConvention());
  }

  /**
   * Test {@link SabrSwaptionDefinition#meta()}.
   *
   * <p>Method under test: {@link SabrSwaptionDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SabrSwaptionDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SabrSwaptionDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.convention() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SabrSwaptionDefinition#metaBean()}.
   *
   * <p>Method under test: {@link SabrSwaptionDefinition#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SabrSwaptionDefinition.metaBean()"})
  void testMetaBean() {
    // Arrange
    SabrSwaptionDefinition ofResult =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            mock(FixedFloatSwapConvention.class),
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
