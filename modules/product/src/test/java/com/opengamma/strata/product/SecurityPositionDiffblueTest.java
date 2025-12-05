package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.SecurityPosition.Builder;
import com.opengamma.strata.product.SecurityPosition.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityPositionDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return {@link PositionInfo}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'info'; then return PositionInfo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInfo_thenReturnPositionInfo() {
    // Arrange and Act
    Object actualGetResult = SecurityPosition.builder().get("info");

    // Assert
    assertTrue(actualGetResult instanceof PositionInfo);
    assertFalse(((PositionInfo) actualGetResult).getId().isPresent());
    assertTrue(((PositionInfo) actualGetResult).getAttributes().isEmpty());
    assertTrue(((PositionInfo) actualGetResult).getAttributeTypes().isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code longQuantity}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'longQuantity'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLongQuantity_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) SecurityPosition.builder().get("longQuantity")).doubleValue());
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
        NoSuchElementException.class, () -> SecurityPosition.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'securityId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSecurityId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SecurityPosition.builder().get("securityId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code shortQuantity}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'shortQuantity'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenShortQuantity_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) SecurityPosition.builder().get("shortQuantity")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#info(PositionInfo)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#info(PositionInfo)}
   */
  @Test
  @DisplayName("Test Builder info(PositionInfo); when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.info(PositionInfo)"})
  void testBuilderInfo_whenEmpty_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SecurityPosition.builder();

    // Act
    Builder actualInfoResult = builderResult.info(PositionInfo.empty());

    // Assert
    assertSame(builderResult, actualInfoResult);
  }

  /**
   * Test Builder {@link Builder#longQuantity(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#longQuantity(double)}
   */
  @Test
  @DisplayName("Test Builder longQuantity(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.longQuantity(double)"})
  void testBuilderLongQuantity_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SecurityPosition.builder();

    // Act
    Builder actualLongQuantityResult = builderResult.longQuantity(10.0d);

    // Assert
    assertSame(builderResult, actualLongQuantityResult);
  }

  /**
   * Test Builder {@link Builder#securityId(SecurityId)}.
   *
   * <ul>
   *   <li>Then builder build LongQuantity is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#securityId(SecurityId)}
   */
  @Test
  @DisplayName("Test Builder securityId(SecurityId); then builder build LongQuantity is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.securityId(SecurityId)"})
  void testBuilderSecurityId_thenBuilderBuildLongQuantityIsZero() {
    // Arrange
    Builder builderResult = SecurityPosition.builder();
    SecurityId securityId = SecurityId.of(StandardId.of("Scheme", "42"));

    // Act
    Builder actualSecurityIdResult = builderResult.securityId(securityId);

    // Assert
    SecurityPosition securityPosition = builderResult.build();
    assertEquals(0.0d, securityPosition.getLongQuantity());
    assertEquals(0.0d, securityPosition.getQuantity());
    assertEquals(0.0d, securityPosition.getShortQuantity());
    assertSame(securityId, securityPosition.getSecurityId());
    assertSame(builderResult, actualSecurityIdResult);
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
        () -> SecurityPosition.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'info'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenInfo_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SecurityPosition.builder();

    // Act
    Builder actualSetResult = builderResult.set("info", PositionInfo.empty());

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
    Builder builderResult = SecurityPosition.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#shortQuantity(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#shortQuantity(double)}
   */
  @Test
  @DisplayName("Test Builder shortQuantity(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.shortQuantity(double)"})
  void testBuilderShortQuantity_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SecurityPosition.builder();

    // Act
    Builder actualShortQuantityResult = builderResult.shortQuantity(10.0d);

    // Assert
    assertSame(builderResult, actualShortQuantityResult);
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
    Class<? extends SecurityPosition> actualBeanTypeResult = SecurityPosition.meta().beanType();

    // Assert
    Class<SecurityPosition> expectedBeanTypeResult = SecurityPosition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#longQuantity()}
   *   <li>{@link Meta#quantity()}
   *   <li>{@link Meta#securityId()}
   *   <li>{@link Meta#shortQuantity()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.info()",
    "MetaProperty Meta.longQuantity()",
    "MetaProperty Meta.quantity()",
    "MetaProperty Meta.securityId()",
    "MetaProperty Meta.shortQuantity()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SecurityPosition.meta();

    // Act
    MetaProperty<PositionInfo> actualInfoResult = metaResult.info();
    MetaProperty<Double> actualLongQuantityResult = metaResult.longQuantity();
    MetaProperty<Double> actualQuantityResult = metaResult.quantity();
    MetaProperty<SecurityId> actualSecurityIdResult = metaResult.securityId();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualLongQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualSecurityIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shortQuantity() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'info'; then return name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInfo_thenReturnNameIsInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = SecurityPosition.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> longQuantityResult = ((Meta) metaBeanResult).longQuantity();
    assertTrue(longQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<Double> shortQuantityResult = ((Meta) metaBeanResult).shortQuantity();
    assertTrue(shortQuantityResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<PositionInfo> expectedPropertyTypeResult = PositionInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, longQuantityResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, shortQuantityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code longQuantity}.
   *   <li>Then return name is {@code longQuantity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'longQuantity'; then return name is 'longQuantity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLongQuantity_thenReturnNameIsLongQuantity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SecurityPosition.meta().metaPropertyGet("longQuantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PositionInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<Double> shortQuantityResult = ((Meta) metaBeanResult).shortQuantity();
    assertTrue(shortQuantityResult instanceof DirectMetaProperty);
    assertEquals("longQuantity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).longQuantity());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, shortQuantityResult.metaBean());
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
    assertNull(SecurityPosition.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code quantity}.
   *   <li>Then return name is {@code quantity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'quantity'; then return name is 'quantity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQuantity_thenReturnNameIsQuantity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SecurityPosition.meta().metaPropertyGet("quantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PositionInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    MetaProperty<Double> longQuantityResult = ((Meta) metaBeanResult).longQuantity();
    assertTrue(longQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<Double> shortQuantityResult = ((Meta) metaBeanResult).shortQuantity();
    assertTrue(shortQuantityResult instanceof DirectMetaProperty);
    assertEquals("quantity", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.DERIVED, actualMetaPropertyGetResult.style());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quantity());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, longQuantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, shortQuantityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then return name is {@code securityId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'securityId'; then return name is 'securityId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSecurityId_thenReturnNameIsSecurityId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SecurityPosition.meta().metaPropertyGet("securityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PositionInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    MetaProperty<Double> longQuantityResult = ((Meta) metaBeanResult).longQuantity();
    assertTrue(longQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<Double> shortQuantityResult = ((Meta) metaBeanResult).shortQuantity();
    assertTrue(shortQuantityResult instanceof DirectMetaProperty);
    assertEquals("securityId", actualMetaPropertyGetResult.name());
    Class<SecurityId> expectedPropertyTypeResult = SecurityId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).securityId());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, longQuantityResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, shortQuantityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shortQuantity}.
   *   <li>Then return name is {@code shortQuantity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shortQuantity'; then return name is 'shortQuantity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShortQuantity_thenReturnNameIsShortQuantity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SecurityPosition.meta().metaPropertyGet("shortQuantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PositionInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    MetaProperty<Double> longQuantityResult = ((Meta) metaBeanResult).longQuantity();
    assertTrue(longQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> quantityResult = ((Meta) metaBeanResult).quantity();
    assertTrue(quantityResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    assertEquals("shortQuantity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shortQuantity());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, longQuantityResult.metaBean());
    assertSame(metaBeanResult, quantityResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
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
        SecurityPosition.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("longQuantity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("quantity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("securityId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("shortQuantity") instanceof DirectMetaProperty);
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
    assertNull(SecurityPosition.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SecurityPosition.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> SecurityPosition.meta().propertySet(mock(Bean.class), "info", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SecurityPosition.meta().propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code longQuantity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'longQuantity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLongQuantity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SecurityPosition.meta()
                .propertySet(mock(Bean.class), "longQuantity", "New Value", true));
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
            SecurityPosition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code quantity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'quantity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenQuantity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SecurityPosition.meta().propertySet(mock(Bean.class), "quantity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code securityId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'securityId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSecurityId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SecurityPosition.meta().propertySet(mock(Bean.class), "securityId", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shortQuantity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shortQuantity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShortQuantity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SecurityPosition.meta()
                .propertySet(mock(Bean.class), "shortQuantity", "New Value", true));
  }

  /**
   * Test {@link SecurityPosition#ofNet(PositionInfo, SecurityId, double)} with {@code
   * positionInfo}, {@code securityId}, {@code netQuantity}.
   *
   * <ul>
   *   <li>Then return Quantity is {@code -1.0E-10}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#ofNet(PositionInfo, SecurityId, double)}
   */
  @Test
  @DisplayName(
      "Test ofNet(PositionInfo, SecurityId, double) with 'positionInfo', 'securityId', 'netQuantity'; then return Quantity is '-1.0E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityPosition SecurityPosition.ofNet(PositionInfo, SecurityId, double)"})
  void testOfNetWithPositionInfoSecurityIdNetQuantity_thenReturnQuantityIs10e10() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();

    // Act
    SecurityPosition actualOfNetResult =
        SecurityPosition.ofNet(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), -1.0E-10d);

    // Assert
    assertEquals(-1.0E-10d, actualOfNetResult.getQuantity());
    assertEquals(0.0d, actualOfNetResult.getLongQuantity());
    assertEquals(1.0E-10d, actualOfNetResult.getShortQuantity());
  }

  /**
   * Test {@link SecurityPosition#ofNet(PositionInfo, SecurityId, double)} with {@code
   * positionInfo}, {@code securityId}, {@code netQuantity}.
   *
   * <ul>
   *   <li>Then return ShortQuantity is zero.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#ofNet(PositionInfo, SecurityId, double)}
   */
  @Test
  @DisplayName(
      "Test ofNet(PositionInfo, SecurityId, double) with 'positionInfo', 'securityId', 'netQuantity'; then return ShortQuantity is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityPosition SecurityPosition.ofNet(PositionInfo, SecurityId, double)"})
  void testOfNetWithPositionInfoSecurityIdNetQuantity_thenReturnShortQuantityIsZero() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();

    // Act
    SecurityPosition actualOfNetResult =
        SecurityPosition.ofNet(positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d);

    // Assert
    assertEquals(0.0d, actualOfNetResult.getShortQuantity());
    assertEquals(10.0d, actualOfNetResult.getLongQuantity());
    assertEquals(10.0d, actualOfNetResult.getQuantity());
  }

  /**
   * Test {@link SecurityPosition#ofNet(SecurityId, double)} with {@code securityId}, {@code
   * netQuantity}.
   *
   * <ul>
   *   <li>Then return Quantity is {@code -1.0E-10}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#ofNet(SecurityId, double)}
   */
  @Test
  @DisplayName(
      "Test ofNet(SecurityId, double) with 'securityId', 'netQuantity'; then return Quantity is '-1.0E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityPosition SecurityPosition.ofNet(SecurityId, double)"})
  void testOfNetWithSecurityIdNetQuantity_thenReturnQuantityIs10e10() {
    // Arrange and Act
    SecurityPosition actualOfNetResult =
        SecurityPosition.ofNet(SecurityId.of(StandardId.of("Scheme", "42")), -1.0E-10d);

    // Assert
    assertEquals(-1.0E-10d, actualOfNetResult.getQuantity());
    assertEquals(0.0d, actualOfNetResult.getLongQuantity());
    assertEquals(1.0E-10d, actualOfNetResult.getShortQuantity());
  }

  /**
   * Test {@link SecurityPosition#ofNet(SecurityId, double)} with {@code securityId}, {@code
   * netQuantity}.
   *
   * <ul>
   *   <li>Then return ShortQuantity is zero.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#ofNet(SecurityId, double)}
   */
  @Test
  @DisplayName(
      "Test ofNet(SecurityId, double) with 'securityId', 'netQuantity'; then return ShortQuantity is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityPosition SecurityPosition.ofNet(SecurityId, double)"})
  void testOfNetWithSecurityIdNetQuantity_thenReturnShortQuantityIsZero() {
    // Arrange and Act
    SecurityPosition actualOfNetResult =
        SecurityPosition.ofNet(SecurityId.of(StandardId.of("Scheme", "42")), 10.0d);

    // Assert
    assertEquals(0.0d, actualOfNetResult.getShortQuantity());
    assertEquals(10.0d, actualOfNetResult.getLongQuantity());
    assertEquals(10.0d, actualOfNetResult.getQuantity());
  }

  /**
   * Test {@link SecurityPosition#ofLongShort(SecurityId, double, double)} with {@code securityId},
   * {@code longQuantity}, {@code shortQuantity}.
   *
   * <ul>
   *   <li>Then return Quantity is zero.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#ofLongShort(SecurityId, double, double)}
   */
  @Test
  @DisplayName(
      "Test ofLongShort(SecurityId, double, double) with 'securityId', 'longQuantity', 'shortQuantity'; then return Quantity is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityPosition SecurityPosition.ofLongShort(SecurityId, double, double)"})
  void testOfLongShortWithSecurityIdLongQuantityShortQuantity_thenReturnQuantityIsZero() {
    // Arrange
    SecurityId securityId = SecurityId.of(StandardId.of("Scheme", "42"));

    // Act
    SecurityPosition actualOfLongShortResult =
        SecurityPosition.ofLongShort(securityId, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualOfLongShortResult.getQuantity());
    assertEquals(10.0d, actualOfLongShortResult.getLongQuantity());
    assertEquals(10.0d, actualOfLongShortResult.getShortQuantity());
    Optional<StandardId> id = actualOfLongShortResult.getId();
    assertFalse(id.isPresent());
    PositionInfo info = actualOfLongShortResult.getInfo();
    assertTrue(info.getAttributes().isEmpty());
    assertTrue(info.getAttributeTypes().isEmpty());
    assertSame(id, info.getId());
    assertSame(securityId, actualOfLongShortResult.getSecurityId());
  }

  /**
   * Test {@link SecurityPosition#getQuantity()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#getQuantity()}
   */
  @Test
  @DisplayName(
      "Test getQuantity(); given StandardId with 'Scheme' and value is '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SecurityPosition.getQuantity()"})
  void testGetQuantity_givenStandardIdWithSchemeAndValueIs42_thenReturnZero() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofLongShortResult.getQuantity());
  }

  /**
   * Test {@link SecurityPosition#meta()}.
   *
   * <p>Method under test: {@link SecurityPosition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SecurityPosition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SecurityPosition.meta();

    // Assert
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.longQuantity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.quantity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.securityId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.shortQuantity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SecurityPosition#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SecurityPosition.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofLongShortResult.metaBean());
  }

  /**
   * Test {@link SecurityPosition#getInfo()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SecurityPosition#getInfo()}
   */
  @Test
  @DisplayName(
      "Test getInfo(); given StandardId with 'Scheme' and value is '42'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfo SecurityPosition.getInfo()"})
  void testGetInfo_givenStandardIdWithSchemeAndValueIs42_thenReturnEmpty() {
    // Arrange
    PositionInfo positionInfo = PositionInfo.empty();
    SecurityPosition ofLongShortResult =
        SecurityPosition.ofLongShort(
            positionInfo, SecurityId.of(StandardId.of("Scheme", "42")), 10.0d, 10.0d);

    // Act and Assert
    assertSame(positionInfo, ofLongShortResult.getInfo());
  }
}
