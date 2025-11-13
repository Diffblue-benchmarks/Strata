package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.swap.ImmutableSwapIndex.Builder;
import com.opengamma.strata.product.swap.ImmutableSwapIndex.Meta;
import com.opengamma.strata.product.swap.type.FixedFloatSwapTemplate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableSwapIndexDiffblueTest {
  /**
   * Test Builder {@link Builder#fixingTime(LocalTime)}.
   *
   * <ul>
   *   <li>When {@link LocalTime#MIDNIGHT}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingTime(LocalTime)}
   */
  @Test
  @DisplayName("Test Builder fixingTime(LocalTime); when MIDNIGHT; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingTime(LocalTime)"})
  void testBuilderFixingTime_whenMidnight_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualFixingTimeResult = builderResult.fixingTime(LocalTime.MIDNIGHT);

    // Assert
    assertSame(builderResult, actualFixingTimeResult);
  }

  /**
   * Test Builder {@link Builder#fixingZone(ZoneId)}.
   *
   * <ul>
   *   <li>When ofTotalSeconds one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingZone(ZoneId)}
   */
  @Test
  @DisplayName("Test Builder fixingZone(ZoneId); when ofTotalSeconds one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingZone(ZoneId)"})
  void testBuilderFixingZone_whenOfTotalSecondsOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualFixingZoneResult = builderResult.fixingZone(ZoneOffset.ofTotalSeconds(1));

    // Assert
    assertSame(builderResult, actualFixingZoneResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingTime_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableSwapIndex.builder().get("fixingTime"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingZone}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingZone'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingZone_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableSwapIndex.builder().get("fixingZone"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableSwapIndex.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> ImmutableSwapIndex.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code template}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'template'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenTemplate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableSwapIndex.builder().get("template"));
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ImmutableSwapIndex.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'fixingTime'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFixingTime_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("fixingTime", LocalTime.MIDNIGHT);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code fixingZone}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'fixingZone'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFixingZone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("fixingZone", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#template(FixedFloatSwapTemplate)}.
   *
   * <ul>
   *   <li>When {@link FixedFloatSwapTemplate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#template(FixedFloatSwapTemplate)}
   */
  @Test
  @DisplayName(
      "Test Builder template(FixedFloatSwapTemplate); when FixedFloatSwapTemplate; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.template(FixedFloatSwapTemplate)"})
  void testBuilderTemplate_whenFixedFloatSwapTemplate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableSwapIndex.builder();

    // Act
    Builder actualTemplateResult = builderResult.template(mock(FixedFloatSwapTemplate.class));

    // Assert
    assertSame(builderResult, actualTemplateResult);
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
    Class<? extends ImmutableSwapIndex> actualBeanTypeResult = ImmutableSwapIndex.meta().beanType();

    // Assert
    Class<ImmutableSwapIndex> expectedBeanTypeResult = ImmutableSwapIndex.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#active()}
   *   <li>{@link Meta#fixingTime()}
   *   <li>{@link Meta#fixingZone()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#template()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.active()",
    "MetaProperty Meta.fixingTime()",
    "MetaProperty Meta.fixingZone()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.template()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableSwapIndex.meta();

    // Act
    MetaProperty<Boolean> actualActiveResult = metaResult.active();
    MetaProperty<LocalTime> actualFixingTimeResult = metaResult.fixingTime();
    MetaProperty<ZoneId> actualFixingZoneResult = metaResult.fixingZone();
    MetaProperty<String> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualActiveResult instanceof DirectMetaProperty);
    assertTrue(actualFixingTimeResult instanceof DirectMetaProperty);
    assertTrue(actualFixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.template() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then return name is {@code active}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'active'; then return name is 'active'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenActive_thenReturnNameIsActive() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableSwapIndex.meta().metaPropertyGet("active");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalTime> fixingTimeResult = ((Meta) metaBeanResult).fixingTime();
    assertTrue(fixingTimeResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> fixingZoneResult = ((Meta) metaBeanResult).fixingZone();
    assertTrue(fixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<FixedFloatSwapTemplate> templateResult = ((Meta) metaBeanResult).template();
    assertTrue(templateResult instanceof DirectMetaProperty);
    assertEquals("active", actualMetaPropertyGetResult.name());
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).active());
    assertSame(metaBeanResult, fixingTimeResult.metaBean());
    assertSame(metaBeanResult, fixingZoneResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, templateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then return name is {@code fixingTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingTime'; then return name is 'fixingTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingTime_thenReturnNameIsFixingTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableSwapIndex.meta().metaPropertyGet("fixingTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> fixingZoneResult = ((Meta) metaBeanResult).fixingZone();
    assertTrue(fixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<FixedFloatSwapTemplate> templateResult = ((Meta) metaBeanResult).template();
    assertTrue(templateResult instanceof DirectMetaProperty);
    assertEquals("fixingTime", actualMetaPropertyGetResult.name());
    Class<LocalTime> expectedPropertyTypeResult = LocalTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingTime());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, fixingZoneResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, templateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingZone}.
   *   <li>Then return name is {@code fixingZone}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingZone'; then return name is 'fixingZone'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingZone_thenReturnNameIsFixingZone() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableSwapIndex.meta().metaPropertyGet("fixingZone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<LocalTime> fixingTimeResult = ((Meta) metaBeanResult).fixingTime();
    assertTrue(fixingTimeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<FixedFloatSwapTemplate> templateResult = ((Meta) metaBeanResult).template();
    assertTrue(templateResult instanceof DirectMetaProperty);
    assertEquals("fixingZone", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingZone());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, fixingTimeResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, templateResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = ImmutableSwapIndex.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<LocalTime> fixingTimeResult = ((Meta) metaBeanResult).fixingTime();
    assertTrue(fixingTimeResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> fixingZoneResult = ((Meta) metaBeanResult).fixingZone();
    assertTrue(fixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FixedFloatSwapTemplate> templateResult = ((Meta) metaBeanResult).template();
    assertTrue(templateResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, fixingTimeResult.metaBean());
    assertSame(metaBeanResult, fixingZoneResult.metaBean());
    assertSame(metaBeanResult, templateResult.metaBean());
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
    assertNull(ImmutableSwapIndex.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code template}.
   *   <li>Then return name is {@code template}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'template'; then return name is 'template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTemplate_thenReturnNameIsTemplate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableSwapIndex.meta().metaPropertyGet("template");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<LocalTime> fixingTimeResult = ((Meta) metaBeanResult).fixingTime();
    assertTrue(fixingTimeResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> fixingZoneResult = ((Meta) metaBeanResult).fixingZone();
    assertTrue(fixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("template", actualMetaPropertyGetResult.name());
    Class<FixedFloatSwapTemplate> expectedPropertyTypeResult = FixedFloatSwapTemplate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).template());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, fixingTimeResult.metaBean());
    assertSame(metaBeanResult, fixingZoneResult.metaBean());
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
        ImmutableSwapIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("active") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingZone") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("template") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange, Act and Assert
    assertNull(ImmutableSwapIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'active'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenActive_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ImmutableSwapIndex.meta().propertySet(mock(Bean.class), "active", "New Value", true));
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
            ImmutableSwapIndex.meta().propertySet(mock(Bean.class), "active", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableSwapIndex.meta()
                .propertySet(mock(Bean.class), "fixingTime", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingZone}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingZone'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingZone_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableSwapIndex.meta()
                .propertySet(mock(Bean.class), "fixingZone", "New Value", true));
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
        () -> ImmutableSwapIndex.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            ImmutableSwapIndex.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code template}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'template'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTemplate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableSwapIndex.meta().propertySet(mock(Bean.class), "template", "New Value", true));
  }

  /**
   * Test {@link ImmutableSwapIndex#of(String, LocalTime, ZoneId, FixedFloatSwapTemplate)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableSwapIndex#of(String, LocalTime, ZoneId,
   * FixedFloatSwapTemplate)}
   */
  @Test
  @DisplayName(
      "Test of(String, LocalTime, ZoneId, FixedFloatSwapTemplate); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSwapIndex ImmutableSwapIndex.of(String, LocalTime, ZoneId, FixedFloatSwapTemplate)"
  })
  void testOf_whenName_thenReturnName() {
    // Arrange
    ZoneOffset fixingZone = ZoneOffset.ofTotalSeconds(1);
    FixedFloatSwapTemplate template = mock(FixedFloatSwapTemplate.class);

    // Act
    ImmutableSwapIndex actualOfResult =
        ImmutableSwapIndex.of("Name", LocalTime.MIDNIGHT, fixingZone, template);

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertTrue(actualOfResult.isActive());
    assertSame(fixingZone, actualOfResult.getFixingZone());
    assertSame(LocalTime.MIN, actualOfResult.getFixingTime());
    assertSame(template, actualOfResult.getTemplate());
  }

  /**
   * Test {@link ImmutableSwapIndex#meta()}.
   *
   * <p>Method under test: {@link ImmutableSwapIndex#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableSwapIndex.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableSwapIndex.meta();

    // Assert
    assertTrue(actualMetaResult.active() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingTime() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.template() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
