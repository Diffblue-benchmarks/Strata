package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.index.ImmutableFloatingRateName.Builder;
import com.opengamma.strata.basics.index.ImmutableFloatingRateName.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableFloatingRateNameDiffblueTest {
  /**
   * Test Builder {@link Builder#externalName(String)}.
   *
   * <ul>
   *   <li>When {@code External Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#externalName(String)}
   */
  @Test
  @DisplayName("Test Builder externalName(String); when 'External Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.externalName(String)"})
  void testBuilderExternalName_whenExternalName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualExternalNameResult = builderResult.externalName("External Name");

    // Assert
    assertSame(builderResult, actualExternalNameResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code externalName}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'externalName'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExternalName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableFloatingRateName.builder().get("externalName"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code indexName}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'indexName'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndexName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableFloatingRateName.builder().get("indexName"));
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
        NoSuchElementException.class,
        () -> ImmutableFloatingRateName.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'type'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableFloatingRateName.builder().get("type"));
  }

  /**
   * Test Builder {@link Builder#indexName(String)}.
   *
   * <ul>
   *   <li>When {@code Index Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indexName(String)}
   */
  @Test
  @DisplayName("Test Builder indexName(String); when 'Index Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indexName(String)"})
  void testBuilderIndexName_whenIndexName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualIndexNameResult = builderResult.indexName("Index Name");

    // Assert
    assertSame(builderResult, actualIndexNameResult);
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
        () -> ImmutableFloatingRateName.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code externalName}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'externalName'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenExternalName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualSetResult = builderResult.set("externalName", "New Value");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code indexName}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'indexName'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenIndexName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualSetResult = builderResult.set("indexName", "New Value");

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
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#type(FloatingRateType)}.
   *
   * <ul>
   *   <li>When {@code IBOR}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#type(FloatingRateType)}
   */
  @Test
  @DisplayName("Test Builder type(FloatingRateType); when 'IBOR'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.type(FloatingRateType)"})
  void testBuilderType_whenIbor_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableFloatingRateName.builder();

    // Act
    Builder actualTypeResult = builderResult.type(FloatingRateType.IBOR);

    // Assert
    assertSame(builderResult, actualTypeResult);
  }

  /**
   * Test {@link ImmutableFloatingRateName#getFloatingRateName()}.
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#getFloatingRateName()}
   */
  @Test
  @DisplayName("Test getFloatingRateName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateName ImmutableFloatingRateName.getFloatingRateName()"})
  void testGetFloatingRateName() {
    // Arrange
    ImmutableFloatingRateName ofResult =
        ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR);

    // Act
    FloatingRateName actualFloatingRateName = ofResult.getFloatingRateName();

    // Assert
    assertSame(ofResult, actualFloatingRateName);
  }

  /**
   * Test {@link ImmutableFloatingRateName#getTenors()}.
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#getTenors()}
   */
  @Test
  @DisplayName("Test getTenors()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ImmutableFloatingRateName.getTenors()"})
  void testGetTenors() {
    // Arrange, Act and Assert
    assertTrue(
        ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR)
            .getTenors()
            .isEmpty());
  }

  /**
   * Test {@link ImmutableFloatingRateName#getTenors()}.
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#getTenors()}
   */
  @Test
  @DisplayName("Test getTenors()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ImmutableFloatingRateName.getTenors()"})
  void testGetTenors2() {
    // Arrange, Act and Assert
    assertTrue(
        ImmutableFloatingRateName.of(
                "External Name", "Index Name", FloatingRateType.OVERNIGHT_COMPOUNDED)
            .getTenors()
            .isEmpty());
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
    Class<? extends ImmutableFloatingRateName> actualBeanTypeResult =
        ImmutableFloatingRateName.meta().beanType();

    // Assert
    Class<ImmutableFloatingRateName> expectedBeanTypeResult = ImmutableFloatingRateName.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#externalName()}
   *   <li>{@link Meta#fixingDateOffsetDays()}
   *   <li>{@link Meta#indexName()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.externalName()",
    "MetaProperty Meta.fixingDateOffsetDays()",
    "MetaProperty Meta.indexName()",
    "MetaProperty Meta.type()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act
    MetaProperty<String> actualExternalNameResult = metaResult.externalName();
    MetaProperty<Integer> actualFixingDateOffsetDaysResult = metaResult.fixingDateOffsetDays();
    MetaProperty<String> actualIndexNameResult = metaResult.indexName();

    // Assert
    assertTrue(actualExternalNameResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateOffsetDaysResult instanceof DirectMetaProperty);
    assertTrue(actualIndexNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code fixingDateOffsetDays}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'fixingDateOffsetDays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsFixingDateOffsetDays() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableFloatingRateName.meta().metaPropertyGet("fixingDateOffsetDays");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> externalNameResult = ((Meta) metaBeanResult).externalName();
    assertTrue(externalNameResult instanceof DirectMetaProperty);
    MetaProperty<String> indexNameResult = ((Meta) metaBeanResult).indexName();
    assertTrue(indexNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FloatingRateType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("fixingDateOffsetDays", actualMetaPropertyGetResult.name());
    Class<Integer> expectedPropertyTypeResult = Integer.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDateOffsetDays());
    assertSame(metaBeanResult, externalNameResult.metaBean());
    assertSame(metaBeanResult, indexNameResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code externalName}.
   *   <li>Then return name is {@code externalName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'externalName'; then return name is 'externalName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExternalName_thenReturnNameIsExternalName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableFloatingRateName.meta().metaPropertyGet("externalName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> fixingDateOffsetDaysResult =
        ((Meta) metaBeanResult).fixingDateOffsetDays();
    assertTrue(fixingDateOffsetDaysResult instanceof DirectMetaProperty);
    MetaProperty<String> indexNameResult = ((Meta) metaBeanResult).indexName();
    assertTrue(indexNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FloatingRateType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("externalName", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).externalName());
    assertSame(metaBeanResult, fixingDateOffsetDaysResult.metaBean());
    assertSame(metaBeanResult, indexNameResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code indexName}.
   *   <li>Then return name is {@code indexName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'indexName'; then return name is 'indexName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndexName_thenReturnNameIsIndexName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableFloatingRateName.meta().metaPropertyGet("indexName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> externalNameResult = ((Meta) metaBeanResult).externalName();
    assertTrue(externalNameResult instanceof DirectMetaProperty);
    MetaProperty<Integer> fixingDateOffsetDaysResult =
        ((Meta) metaBeanResult).fixingDateOffsetDays();
    assertTrue(fixingDateOffsetDaysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FloatingRateType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("indexName", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indexName());
    assertSame(metaBeanResult, externalNameResult.metaBean());
    assertSame(metaBeanResult, fixingDateOffsetDaysResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
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
    assertNull(ImmutableFloatingRateName.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return name is {@code type}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'type'; then return name is 'type'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenType_thenReturnNameIsType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableFloatingRateName.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> externalNameResult = ((Meta) metaBeanResult).externalName();
    assertTrue(externalNameResult instanceof DirectMetaProperty);
    MetaProperty<Integer> fixingDateOffsetDaysResult =
        ((Meta) metaBeanResult).fixingDateOffsetDays();
    assertTrue(fixingDateOffsetDaysResult instanceof DirectMetaProperty);
    MetaProperty<String> indexNameResult = ((Meta) metaBeanResult).indexName();
    assertTrue(indexNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("type", actualMetaPropertyGetResult.name());
    Class<FloatingRateType> expectedPropertyTypeResult = FloatingRateType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
    assertSame(metaBeanResult, externalNameResult.metaBean());
    assertSame(metaBeanResult, fixingDateOffsetDaysResult.metaBean());
    assertSame(metaBeanResult, indexNameResult.metaBean());
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
        ImmutableFloatingRateName.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("externalName") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("fixingDateOffsetDays") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("indexName") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("type") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR),
                "Property Name",
                false));
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
    assertNull(
        ImmutableFloatingRateName.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code externalName}.
   *   <li>Then return {@code External Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'externalName'; then return 'External Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenExternalName_thenReturnExternalName() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act and Assert
    assertEquals(
        "External Name",
        metaResult.propertyGet(
            ImmutableFloatingRateName.builder()
                .externalName("External Name")
                .fixingDateOffsetDays(1)
                .indexName("Index Name")
                .type(FloatingRateType.IBOR)
                .build(),
            "externalName",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffsetDays}.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fixingDateOffsetDays'; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixingDateOffsetDays_thenReturnIntValueIsOne() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act and Assert
    assertEquals(
        1,
        ((Integer)
                metaResult.propertyGet(
                    ImmutableFloatingRateName.builder()
                        .externalName("External Name")
                        .fixingDateOffsetDays(1)
                        .indexName("Index Name")
                        .type(FloatingRateType.IBOR)
                        .build(),
                    "fixingDateOffsetDays",
                    true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexName}.
   *   <li>Then return {@code Index Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'indexName'; then return 'Index Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIndexName_thenReturnIndexName() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act and Assert
    assertEquals(
        "Index Name",
        metaResult.propertyGet(
            ImmutableFloatingRateName.builder()
                .externalName("External Name")
                .fixingDateOffsetDays(1)
                .indexName("Index Name")
                .type(FloatingRateType.IBOR)
                .build(),
            "indexName",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@link FloatingRateType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'type'; then return FloatingRateType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenType_thenReturnFloatingRateType() {
    // Arrange
    Meta metaResult = ImmutableFloatingRateName.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            ImmutableFloatingRateName.builder()
                .externalName("External Name")
                .fixingDateOffsetDays(1)
                .indexName("Index Name")
                .type(FloatingRateType.IBOR)
                .build(),
            "type",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof FloatingRateType);
    assertEquals(FloatingRateType.IBOR, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code externalName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'externalName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExternalName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "externalName", "New Value", true));
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
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "externalName", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffsetDays}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingDateOffsetDays'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingDateOffsetDays_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "fixingDateOffsetDays", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indexName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndexName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "indexName", "New Value", true));
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
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableFloatingRateName.meta()
                .propertySet(mock(Bean.class), "type", "New Value", true));
  }

  /**
   * Test {@link ImmutableFloatingRateName#toIborIndex(Tenor)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#toIborIndex(Tenor)}
   */
  @Test
  @DisplayName("Test toIborIndex(Tenor); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.index.IborIndex ImmutableFloatingRateName.toIborIndex(Tenor)"
  })
  void testToIborIndex_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            ImmutableFloatingRateName.of(
                    "External Name", "Index Name", FloatingRateType.OVERNIGHT_COMPOUNDED)
                .toIborIndex(Tenor.TENOR_10M));
  }

  /**
   * Test {@link ImmutableFloatingRateName#toIborIndexFixingOffset()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#toIborIndexFixingOffset()}
   */
  @Test
  @DisplayName("Test toIborIndexFixingOffset(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DaysAdjustment ImmutableFloatingRateName.toIborIndexFixingOffset()"
  })
  void testToIborIndexFixingOffset_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            ImmutableFloatingRateName.of(
                    "External Name", "Index Name", FloatingRateType.OVERNIGHT_COMPOUNDED)
                .toIborIndexFixingOffset());
  }

  /**
   * Test {@link ImmutableFloatingRateName#toOvernightIndex()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#toOvernightIndex()}
   */
  @Test
  @DisplayName("Test toOvernightIndex(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.index.OvernightIndex ImmutableFloatingRateName.toOvernightIndex()"
  })
  void testToOvernightIndex_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR)
                .toOvernightIndex());
  }

  /**
   * Test {@link ImmutableFloatingRateName#toPriceIndex()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#toPriceIndex()}
   */
  @Test
  @DisplayName("Test toPriceIndex(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.index.PriceIndex ImmutableFloatingRateName.toPriceIndex()"
  })
  void testToPriceIndex_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR)
                .toPriceIndex());
  }

  /**
   * Test {@link ImmutableFloatingRateName#equals(Object)}, and {@link
   * ImmutableFloatingRateName#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableFloatingRateName#equals(Object)}
   *   <li>{@link ImmutableFloatingRateName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableFloatingRateName.equals(Object)",
    "int ImmutableFloatingRateName.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableFloatingRateName immutableFloatingRateName =
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build();
    ImmutableFloatingRateName immutableFloatingRateName2 =
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build();

    // Act and Assert
    assertEquals(immutableFloatingRateName, immutableFloatingRateName2);
    assertEquals(immutableFloatingRateName.hashCode(), immutableFloatingRateName2.hashCode());
  }

  /**
   * Test {@link ImmutableFloatingRateName#equals(Object)}, and {@link
   * ImmutableFloatingRateName#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableFloatingRateName#equals(Object)}
   *   <li>{@link ImmutableFloatingRateName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableFloatingRateName.equals(Object)",
    "int ImmutableFloatingRateName.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableFloatingRateName immutableFloatingRateName =
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build();

    // Act and Assert
    assertEquals(immutableFloatingRateName, immutableFloatingRateName);
    int expectedHashCodeResult = immutableFloatingRateName.hashCode();
    assertEquals(expectedHashCodeResult, immutableFloatingRateName.hashCode());
  }

  /**
   * Test {@link ImmutableFloatingRateName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableFloatingRateName.equals(Object)",
    "int ImmutableFloatingRateName.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ImmutableFloatingRateName immutableFloatingRateName =
        ImmutableFloatingRateName.builder()
            .externalName("com.opengamma.strata.basics.index.FloatingRateType")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build();

    // Act and Assert
    assertNotEquals(
        immutableFloatingRateName,
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build());
  }

  /**
   * Test {@link ImmutableFloatingRateName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableFloatingRateName.equals(Object)",
    "int ImmutableFloatingRateName.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build(),
        null);
  }

  /**
   * Test {@link ImmutableFloatingRateName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableFloatingRateName.equals(Object)",
    "int ImmutableFloatingRateName.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build(),
        "Different type to ImmutableFloatingRateName");
  }

  /**
   * Test {@link ImmutableFloatingRateName#meta()}.
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableFloatingRateName.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableFloatingRateName.meta();

    // Assert
    assertTrue(actualMetaResult.externalName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingDateOffsetDays() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.indexName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.type() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableFloatingRateName#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableFloatingRateName#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableFloatingRateName.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ImmutableFloatingRateName.of("External Name", "Index Name", FloatingRateType.IBOR)
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableFloatingRateName#toString()}
   *   <li>{@link ImmutableFloatingRateName#getExternalName()}
   *   <li>{@link ImmutableFloatingRateName#getIndexName()}
   *   <li>{@link ImmutableFloatingRateName#getName()}
   *   <li>{@link ImmutableFloatingRateName#getType()}
   *   <li>{@link ImmutableFloatingRateName#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String ImmutableFloatingRateName.getExternalName()",
    "String ImmutableFloatingRateName.getIndexName()",
    "String ImmutableFloatingRateName.getName()",
    "FloatingRateType ImmutableFloatingRateName.getType()",
    "Builder ImmutableFloatingRateName.toBuilder()",
    "String ImmutableFloatingRateName.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableFloatingRateName immutableFloatingRateName =
        ImmutableFloatingRateName.builder()
            .externalName("External Name")
            .fixingDateOffsetDays(1)
            .indexName("Index Name")
            .type(FloatingRateType.IBOR)
            .build();

    // Act
    String actualToStringResult = immutableFloatingRateName.toString();
    String actualExternalName = immutableFloatingRateName.getExternalName();
    String actualIndexName = immutableFloatingRateName.getIndexName();
    String actualName = immutableFloatingRateName.getName();
    FloatingRateType actualType = immutableFloatingRateName.getType();
    immutableFloatingRateName.toBuilder();

    // Assert
    assertEquals("External Name", actualExternalName);
    assertEquals("External Name", actualName);
    assertEquals("External Name", actualToStringResult);
    assertEquals("Index Name", actualIndexName);
    assertEquals(FloatingRateType.IBOR, actualType);
  }
}
