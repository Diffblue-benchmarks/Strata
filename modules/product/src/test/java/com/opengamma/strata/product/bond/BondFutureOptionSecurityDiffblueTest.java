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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.value.Rounding;
import com.opengamma.strata.product.SecurityInfo;
import com.opengamma.strata.product.bond.BondFutureOptionSecurity.Builder;
import com.opengamma.strata.product.bond.BondFutureOptionSecurity.Meta;
import com.opengamma.strata.product.common.PutCall;
import com.opengamma.strata.product.option.FutureOptionPremiumStyle;
import java.time.LocalDate;
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

class BondFutureOptionSecurityDiffblueTest {
  /**
   * Test Builder {@link Builder#expiryDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiryDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder expiryDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiryDate(LocalDate)"})
  void testBuilderExpiryDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFutureOptionSecurity.builder();

    // Act
    Builder actualExpiryDateResult = builderResult.expiryDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualExpiryDateResult);
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
    Builder builderResult = BondFutureOptionSecurity.builder();

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
    Builder builderResult = BondFutureOptionSecurity.builder();

    // Act
    Builder actualExpiryZoneResult = builderResult.expiryZone(ZoneOffset.ofTotalSeconds(1));

    // Assert
    assertSame(builderResult, actualExpiryZoneResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BondFutureOptionSecurity.builder().get("currency"));
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
    assertNull(BondFutureOptionSecurity.builder().get("expiryDate"));
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
    assertNull(BondFutureOptionSecurity.builder().get("expiryTime"));
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
    assertNull(BondFutureOptionSecurity.builder().get("expiryZone"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'info'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInfo_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BondFutureOptionSecurity.builder().get("info"));
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
        () -> BondFutureOptionSecurity.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#premiumStyle(FutureOptionPremiumStyle)}.
   *
   * <ul>
   *   <li>When {@code DAILY_MARGIN}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#premiumStyle(FutureOptionPremiumStyle)}
   */
  @Test
  @DisplayName(
      "Test Builder premiumStyle(FutureOptionPremiumStyle); when 'DAILY_MARGIN'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.premiumStyle(FutureOptionPremiumStyle)"})
  void testBuilderPremiumStyle_whenDailyMargin_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFutureOptionSecurity.builder();

    // Act
    Builder actualPremiumStyleResult =
        builderResult.premiumStyle(FutureOptionPremiumStyle.DAILY_MARGIN);

    // Assert
    assertSame(builderResult, actualPremiumStyleResult);
  }

  /**
   * Test Builder {@link Builder#rounding(Rounding)}.
   *
   * <ul>
   *   <li>When {@link Rounding}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#rounding(Rounding)}
   */
  @Test
  @DisplayName("Test Builder rounding(Rounding); when Rounding; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.rounding(Rounding)"})
  void testBuilderRounding_whenRounding_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFutureOptionSecurity.builder();

    // Act
    Builder actualRoundingResult = builderResult.rounding(mock(Rounding.class));

    // Assert
    assertSame(builderResult, actualRoundingResult);
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
        () -> BondFutureOptionSecurity.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currency'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFutureOptionSecurity.builder();

    // Act
    Builder actualSetResult = builderResult.set("currency", null);

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
    Builder builderResult = BondFutureOptionSecurity.builder();

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
    Class<? extends BondFutureOptionSecurity> actualBeanTypeResult =
        BondFutureOptionSecurity.meta().beanType();

    // Assert
    Class<BondFutureOptionSecurity> expectedBeanTypeResult = BondFutureOptionSecurity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#expiryDate()}
   *   <li>{@link Meta#expiryTime()}
   *   <li>{@link Meta#expiryZone()}
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#premiumStyle()}
   *   <li>{@link Meta#putCall()}
   *   <li>{@link Meta#rounding()}
   *   <li>{@link Meta#strikePrice()}
   *   <li>{@link Meta#underlyingFutureId()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.expiryDate()",
    "MetaProperty Meta.expiryTime()",
    "MetaProperty Meta.expiryZone()",
    "MetaProperty Meta.info()",
    "MetaProperty Meta.premiumStyle()",
    "MetaProperty Meta.putCall()",
    "MetaProperty Meta.rounding()",
    "MetaProperty Meta.strikePrice()",
    "MetaProperty Meta.underlyingFutureId()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BondFutureOptionSecurity.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<LocalDate> actualExpiryDateResult = metaResult.expiryDate();
    MetaProperty<LocalTime> actualExpiryTimeResult = metaResult.expiryTime();
    MetaProperty<ZoneId> actualExpiryZoneResult = metaResult.expiryZone();
    MetaProperty<SecurityInfo> actualInfoResult = metaResult.info();
    MetaProperty<FutureOptionPremiumStyle> actualPremiumStyleResult = metaResult.premiumStyle();
    MetaProperty<PutCall> actualPutCallResult = metaResult.putCall();
    MetaProperty<Rounding> actualRoundingResult = metaResult.rounding();
    MetaProperty<Double> actualStrikePriceResult = metaResult.strikePrice();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryDateResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryTimeResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryZoneResult instanceof DirectMetaProperty);
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualPremiumStyleResult instanceof DirectMetaProperty);
    assertTrue(actualPutCallResult instanceof DirectMetaProperty);
    assertTrue(actualRoundingResult instanceof DirectMetaProperty);
    assertTrue(actualStrikePriceResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingFutureId() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFutureOptionSecurity.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
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
        BondFutureOptionSecurity.meta().metaPropertyGet("expiryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
    assertEquals("expiryDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
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
        BondFutureOptionSecurity.meta().metaPropertyGet("expiryTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
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
        BondFutureOptionSecurity.meta().metaPropertyGet("expiryZone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
    assertEquals("expiryZone", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryZone());
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
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFutureOptionSecurity.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<SecurityInfo> expectedPropertyTypeResult = SecurityInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code premiumStyle}.
   *   <li>Then return name is {@code premiumStyle}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'premiumStyle'; then return name is 'premiumStyle'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPremiumStyle_thenReturnNameIsPremiumStyle() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFutureOptionSecurity.meta().metaPropertyGet("premiumStyle");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).putCall() instanceof DirectMetaProperty);
    assertEquals("premiumStyle", actualMetaPropertyGetResult.name());
    Class<FutureOptionPremiumStyle> expectedPropertyTypeResult = FutureOptionPremiumStyle.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).premiumStyle());
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
    assertNull(BondFutureOptionSecurity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code putCall}.
   *   <li>Then return name is {@code putCall}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'putCall'; then return name is 'putCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPutCall_thenReturnNameIsPutCall() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFutureOptionSecurity.meta().metaPropertyGet("putCall");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).premiumStyle() instanceof DirectMetaProperty);
    assertEquals("putCall", actualMetaPropertyGetResult.name());
    Class<PutCall> expectedPropertyTypeResult = PutCall.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).putCall());
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
        BondFutureOptionSecurity.meta().metaPropertyMap();

    // Assert
    assertEquals(10, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryZone") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("premiumStyle") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("putCall") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rounding") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strikePrice") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("underlyingFutureId") instanceof DirectMetaProperty);
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
        BondFutureOptionSecurity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> BondFutureOptionSecurity.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
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
            BondFutureOptionSecurity.meta()
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
            BondFutureOptionSecurity.meta()
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
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "expiryZone", "New Value", true));
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
        () ->
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code premiumStyle}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'premiumStyle'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPremiumStyle_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "premiumStyle", "New Value", false));
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
            BondFutureOptionSecurity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
