package com.opengamma.strata.product.dsf;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.SecurityId;
import com.opengamma.strata.product.dsf.ResolvedDsf.Builder;
import com.opengamma.strata.product.dsf.ResolvedDsf.Meta;
import com.opengamma.strata.product.swap.ResolvedSwap;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResolvedDsfDiffblueTest {
  /**
   * Test Builder {@link Builder#deliveryDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#deliveryDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder deliveryDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.deliveryDate(LocalDate)"})
  void testBuilderDeliveryDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedDsf.builder();

    // Act
    Builder actualDeliveryDateResult = builderResult.deliveryDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualDeliveryDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code deliveryDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'deliveryDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDeliveryDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedDsf.builder().get("deliveryDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code lastTradeDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'lastTradeDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLastTradeDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedDsf.builder().get("lastTradeDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code notional}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'notional'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNotional_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) ResolvedDsf.builder().get("notional")).doubleValue());
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
    assertThrows(NoSuchElementException.class, () -> ResolvedDsf.builder().get("Property Name"));
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
    assertNull(ResolvedDsf.builder().get("securityId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code underlyingSwap}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'underlyingSwap'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnderlyingSwap_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedDsf.builder().get("underlyingSwap"));
  }

  /**
   * Test Builder {@link Builder#lastTradeDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#lastTradeDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder lastTradeDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.lastTradeDate(LocalDate)"})
  void testBuilderLastTradeDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedDsf.builder();

    // Act
    Builder actualLastTradeDateResult = builderResult.lastTradeDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualLastTradeDateResult);
  }

  /**
   * Test Builder {@link Builder#notional(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#notional(double)}
   */
  @Test
  @DisplayName("Test Builder notional(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.notional(double)"})
  void testBuilderNotional_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedDsf.builder();

    // Act
    Builder actualNotionalResult = builderResult.notional(10.0d);

    // Assert
    assertSame(builderResult, actualNotionalResult);
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
        () -> ResolvedDsf.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code deliveryDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'deliveryDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDeliveryDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedDsf.builder();

    // Act
    Builder actualSetResult = builderResult.set("deliveryDate", LocalDate.of(1970, 1, 1));

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
    Builder builderResult = ResolvedDsf.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link ResolvedDsf#meta()}.
   *
   * <p>Method under test: {@link ResolvedDsf#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedDsf.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedDsf.meta();

    // Assert
    assertTrue(actualMetaResult.deliveryDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.notional() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.securityId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.underlyingSwap() instanceof DirectMetaProperty);
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
    Class<? extends ResolvedDsf> actualBeanTypeResult = ResolvedDsf.meta().beanType();

    // Assert
    Class<ResolvedDsf> expectedBeanTypeResult = ResolvedDsf.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#deliveryDate()}
   *   <li>{@link Meta#lastTradeDate()}
   *   <li>{@link Meta#notional()}
   *   <li>{@link Meta#securityId()}
   *   <li>{@link Meta#underlyingSwap()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.deliveryDate()",
    "MetaProperty Meta.lastTradeDate()",
    "MetaProperty Meta.notional()",
    "MetaProperty Meta.securityId()",
    "MetaProperty Meta.underlyingSwap()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedDsf.meta();

    // Act
    MetaProperty<LocalDate> actualDeliveryDateResult = metaResult.deliveryDate();
    MetaProperty<LocalDate> actualLastTradeDateResult = metaResult.lastTradeDate();
    MetaProperty<Double> actualNotionalResult = metaResult.notional();
    MetaProperty<SecurityId> actualSecurityIdResult = metaResult.securityId();

    // Assert
    assertTrue(actualDeliveryDateResult instanceof DirectMetaProperty);
    assertTrue(actualLastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalResult instanceof DirectMetaProperty);
    assertTrue(actualSecurityIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingSwap() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code deliveryDate}.
   *   <li>Then return name is {@code deliveryDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'deliveryDate'; then return name is 'deliveryDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDeliveryDate_thenReturnNameIsDeliveryDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedDsf.meta().metaPropertyGet("deliveryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> lastTradeDateResult = ((Meta) metaBeanResult).lastTradeDate();
    assertTrue(lastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> notionalResult = ((Meta) metaBeanResult).notional();
    assertTrue(notionalResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingSwapResult = ((Meta) metaBeanResult).underlyingSwap();
    assertTrue(underlyingSwapResult instanceof DirectMetaProperty);
    assertEquals("deliveryDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).deliveryDate());
    assertSame(metaBeanResult, lastTradeDateResult.metaBean());
    assertSame(metaBeanResult, notionalResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, underlyingSwapResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lastTradeDate}.
   *   <li>Then return name is {@code lastTradeDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lastTradeDate'; then return name is 'lastTradeDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLastTradeDate_thenReturnNameIsLastTradeDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedDsf.meta().metaPropertyGet("lastTradeDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> deliveryDateResult = ((Meta) metaBeanResult).deliveryDate();
    assertTrue(deliveryDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> notionalResult = ((Meta) metaBeanResult).notional();
    assertTrue(notionalResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingSwapResult = ((Meta) metaBeanResult).underlyingSwap();
    assertTrue(underlyingSwapResult instanceof DirectMetaProperty);
    assertEquals("lastTradeDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastTradeDate());
    assertSame(metaBeanResult, deliveryDateResult.metaBean());
    assertSame(metaBeanResult, notionalResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, underlyingSwapResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code notional}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'notional'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNotional_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedDsf.meta().metaPropertyGet("notional");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> deliveryDateResult = ((Meta) metaBeanResult).deliveryDate();
    assertTrue(deliveryDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastTradeDateResult = ((Meta) metaBeanResult).lastTradeDate();
    assertTrue(lastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingSwapResult = ((Meta) metaBeanResult).underlyingSwap();
    assertTrue(underlyingSwapResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("notional", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).notional());
    assertSame(metaBeanResult, deliveryDateResult.metaBean());
    assertSame(metaBeanResult, lastTradeDateResult.metaBean());
    assertSame(metaBeanResult, securityIdResult.metaBean());
    assertSame(metaBeanResult, underlyingSwapResult.metaBean());
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
    assertNull(ResolvedDsf.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedDsf.meta().metaPropertyGet("securityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> deliveryDateResult = ((Meta) metaBeanResult).deliveryDate();
    assertTrue(deliveryDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastTradeDateResult = ((Meta) metaBeanResult).lastTradeDate();
    assertTrue(lastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> notionalResult = ((Meta) metaBeanResult).notional();
    assertTrue(notionalResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingSwapResult = ((Meta) metaBeanResult).underlyingSwap();
    assertTrue(underlyingSwapResult instanceof DirectMetaProperty);
    assertEquals("securityId", actualMetaPropertyGetResult.name());
    Class<SecurityId> expectedPropertyTypeResult = SecurityId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).securityId());
    assertSame(metaBeanResult, deliveryDateResult.metaBean());
    assertSame(metaBeanResult, lastTradeDateResult.metaBean());
    assertSame(metaBeanResult, notionalResult.metaBean());
    assertSame(metaBeanResult, underlyingSwapResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlyingSwap}.
   *   <li>Then return name is {@code underlyingSwap}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlyingSwap'; then return name is 'underlyingSwap'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlyingSwap_thenReturnNameIsUnderlyingSwap() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedDsf.meta().metaPropertyGet("underlyingSwap");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> deliveryDateResult = ((Meta) metaBeanResult).deliveryDate();
    assertTrue(deliveryDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastTradeDateResult = ((Meta) metaBeanResult).lastTradeDate();
    assertTrue(lastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> notionalResult = ((Meta) metaBeanResult).notional();
    assertTrue(notionalResult instanceof DirectMetaProperty);
    MetaProperty<SecurityId> securityIdResult = ((Meta) metaBeanResult).securityId();
    assertTrue(securityIdResult instanceof DirectMetaProperty);
    assertEquals("underlyingSwap", actualMetaPropertyGetResult.name());
    Class<ResolvedSwap> expectedPropertyTypeResult = ResolvedSwap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingSwap());
    assertSame(metaBeanResult, deliveryDateResult.metaBean());
    assertSame(metaBeanResult, lastTradeDateResult.metaBean());
    assertSame(metaBeanResult, notionalResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = ResolvedDsf.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("deliveryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastTradeDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("notional") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("securityId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("underlyingSwap") instanceof DirectMetaProperty);
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
    assertNull(ResolvedDsf.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ResolvedDsf.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code deliveryDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'deliveryDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDeliveryDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "deliveryDate", "New Value", true));
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
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "deliveryDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastTradeDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lastTradeDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLastTradeDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "lastTradeDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code notional}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'notional'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNotional_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "notional", "New Value", true));
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
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> ResolvedDsf.meta().propertySet(mock(Bean.class), "securityId", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingSwap}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlyingSwap'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlyingSwap_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedDsf.meta().propertySet(mock(Bean.class), "underlyingSwap", "New Value", true));
  }
}
