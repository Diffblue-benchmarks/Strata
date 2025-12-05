package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.product.bond.FixedCouponBondOption.Builder;
import com.opengamma.strata.product.bond.FixedCouponBondOption.Meta;
import com.opengamma.strata.product.common.LongShort;
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

class FixedCouponBondOptionDiffblueTest {
  /**
   * Test Builder {@link Builder#cleanStrikePrice(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#cleanStrikePrice(double)}
   */
  @Test
  @DisplayName("Test Builder cleanStrikePrice(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.cleanStrikePrice(double)"})
  void testBuilderCleanStrikePrice_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualCleanStrikePriceResult = builderResult.cleanStrikePrice(10.0d);

    // Assert
    assertSame(builderResult, actualCleanStrikePriceResult);
  }

  /**
   * Test Builder {@link Builder#expiryTime(LocalTime)}.
   *
   * <ul>
   *   <li>When {@link LocalTime#MIDNIGHT}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiryTime(LocalTime)}
   */
  @Test
  @DisplayName("Test Builder expiryTime(LocalTime); when MIDNIGHT; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiryTime(LocalTime)"})
  void testBuilderExpiryTime_whenMidnight_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualExpiryTimeResult = builderResult.expiryTime(LocalTime.MIDNIGHT);

    // Assert
    assertSame(builderResult, actualExpiryTimeResult);
  }

  /**
   * Test Builder {@link Builder#expiryZone(ZoneId)}.
   *
   * <ul>
   *   <li>When ofTotalSeconds one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiryZone(ZoneId)}
   */
  @Test
  @DisplayName("Test Builder expiryZone(ZoneId); when ofTotalSeconds one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiryZone(ZoneId)"})
  void testBuilderExpiryZone_whenOfTotalSecondsOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualExpiryZoneResult = builderResult.expiryZone(ZoneOffset.ofTotalSeconds(1));

    // Assert
    assertSame(builderResult, actualExpiryZoneResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code cleanStrikePrice}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'cleanStrikePrice'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCleanStrikePrice_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, ((Double) FixedCouponBondOption.builder().get("cleanStrikePrice")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiryDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'expiryDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiryDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("expiryDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiryTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'expiryTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiryTime_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("expiryTime"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiryZone}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'expiryZone'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiryZone_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("expiryZone"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code longShort}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'longShort'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLongShort_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("longShort"));
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
        NoSuchElementException.class, () -> FixedCouponBondOption.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'settlementDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSettlementDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("settlementDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'underlying'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnderlying_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedCouponBondOption.builder().get("underlying"));
  }

  /**
   * Test Builder {@link Builder#longShort(LongShort)}.
   *
   * <ul>
   *   <li>When {@code LONG}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#longShort(LongShort)}
   */
  @Test
  @DisplayName("Test Builder longShort(LongShort); when 'LONG'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.longShort(LongShort)"})
  void testBuilderLongShort_whenLong_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualLongShortResult = builderResult.longShort(LongShort.LONG);

    // Assert
    assertSame(builderResult, actualLongShortResult);
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
        () -> FixedCouponBondOption.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualSetResult = builderResult.set("cleanStrikePrice", 10.0d);

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
    Builder builderResult = FixedCouponBondOption.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends FixedCouponBondOption> actualBeanTypeResult =
        FixedCouponBondOption.meta().beanType();

    // Assert
    Class<FixedCouponBondOption> expectedBeanTypeResult = FixedCouponBondOption.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#cleanStrikePrice()}
   *   <li>{@link Meta#expiryDate()}
   *   <li>{@link Meta#expiryTime()}
   *   <li>{@link Meta#expiryZone()}
   *   <li>{@link Meta#longShort()}
   *   <li>{@link Meta#quantity()}
   *   <li>{@link Meta#settlementDate()}
   *   <li>{@link Meta#underlying()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.cleanStrikePrice()",
    "MetaProperty Meta.expiryDate()",
    "MetaProperty Meta.expiryTime()",
    "MetaProperty Meta.expiryZone()",
    "MetaProperty Meta.longShort()",
    "MetaProperty Meta.quantity()",
    "MetaProperty Meta.settlementDate()",
    "MetaProperty Meta.underlying()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FixedCouponBondOption.meta();

    // Act
    MetaProperty<Double> actualCleanStrikePriceResult = metaResult.cleanStrikePrice();
    MetaProperty<AdjustableDate> actualExpiryDateResult = metaResult.expiryDate();
    MetaProperty<LocalTime> actualExpiryTimeResult = metaResult.expiryTime();
    MetaProperty<ZoneId> actualExpiryZoneResult = metaResult.expiryZone();
    MetaProperty<LongShort> actualLongShortResult = metaResult.longShort();
    MetaProperty<Double> actualQuantityResult = metaResult.quantity();
    MetaProperty<AdjustableDate> actualSettlementDateResult = metaResult.settlementDate();

    // Assert
    assertTrue(actualCleanStrikePriceResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryDateResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryTimeResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryZoneResult instanceof DirectMetaProperty);
    assertTrue(actualLongShortResult instanceof DirectMetaProperty);
    assertTrue(actualQuantityResult instanceof DirectMetaProperty);
    assertTrue(actualSettlementDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlying() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cleanStrikePrice}.
   *   <li>Then return name is {@code cleanStrikePrice}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'cleanStrikePrice'; then return name is 'cleanStrikePrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCleanStrikePrice_thenReturnNameIsCleanStrikePrice() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("cleanStrikePrice");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("cleanStrikePrice", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cleanStrikePrice());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiryDate}.
   *   <li>Then return name is {@code expiryDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'expiryDate'; then return name is 'expiryDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiryDate_thenReturnNameIsExpiryDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("expiryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("expiryDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiryTime}.
   *   <li>Then return name is {@code expiryTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'expiryTime'; then return name is 'expiryTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiryTime_thenReturnNameIsExpiryTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("expiryTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("expiryTime", actualMetaPropertyGetResult.name());
    Class<LocalTime> expectedPropertyTypeResult = LocalTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryTime());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiryZone}.
   *   <li>Then return name is {@code expiryZone}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'expiryZone'; then return name is 'expiryZone'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiryZone_thenReturnNameIsExpiryZone() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("expiryZone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("expiryZone", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryZone());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code longShort}.
   *   <li>Then return name is {@code longShort}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'longShort'; then return name is 'longShort'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLongShort_thenReturnNameIsLongShort() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("longShort");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("longShort", actualMetaPropertyGetResult.name());
    Class<LongShort> expectedPropertyTypeResult = LongShort.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).longShort());
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
    assertNull(FixedCouponBondOption.meta().metaPropertyGet("Property Name"));
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
        FixedCouponBondOption.meta().metaPropertyGet("quantity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("quantity", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quantity());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then return name is {@code settlementDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'settlementDate'; then return name is 'settlementDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSettlementDate_thenReturnNameIsSettlementDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("settlementDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("settlementDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).settlementDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return name is {@code underlying}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlying'; then return name is 'underlying'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlying_thenReturnNameIsUnderlying() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedCouponBondOption.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cleanStrikePrice() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quantity() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    Class<FixedCouponBond> expectedPropertyTypeResult = FixedCouponBond.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlying());
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
        FixedCouponBondOption.meta().metaPropertyMap();

    // Assert
    assertEquals(8, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("cleanStrikePrice") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryZone") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("longShort") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("quantity") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("settlementDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("underlying") instanceof DirectMetaProperty);
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
    assertNull(FixedCouponBondOption.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'null'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNull_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> FixedCouponBondOption.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cleanStrikePrice}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cleanStrikePrice'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCleanStrikePrice_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "cleanStrikePrice", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cleanStrikePrice}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cleanStrikePrice'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCleanStrikePrice_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "cleanStrikePrice", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiryDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiryDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiryDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "expiryDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiryTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiryTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiryTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "expiryTime", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiryZone}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiryZone'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiryZone_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "expiryZone", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code longShort}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'longShort'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLongShort_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "longShort", "New Value", true));
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
            FixedCouponBondOption.meta()
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
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "quantity", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'settlementDate'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSettlementDate_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            FixedCouponBondOption.meta()
                .propertySet(mock(Bean.class), "settlementDate", "New Value", false));
  }
}
