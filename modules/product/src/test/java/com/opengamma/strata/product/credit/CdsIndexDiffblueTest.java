package com.opengamma.strata.product.credit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.schedule.PeriodicSchedule;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.credit.CdsIndex.Builder;
import com.opengamma.strata.product.credit.CdsIndex.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsIndexDiffblueTest {
  /**
   * Test Builder {@link Builder#buySell(BuySell)}.
   *
   * <ul>
   *   <li>When {@code BUY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#buySell(BuySell)}
   */
  @Test
  @DisplayName("Test Builder buySell(BuySell); when 'BUY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.buySell(BuySell)"})
  void testBuilderBuySell_whenBuy_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualBuySellResult = builderResult.buySell(BuySell.BUY);

    // Assert
    assertSame(builderResult, actualBuySellResult);
  }

  /**
   * Test Builder {@link Builder#cdsIndexId(StandardId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#cdsIndexId(StandardId)}
   */
  @Test
  @DisplayName(
      "Test Builder cdsIndexId(StandardId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.cdsIndexId(StandardId)"})
  void testBuilderCdsIndexId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualCdsIndexIdResult = builderResult.cdsIndexId(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualCdsIndexIdResult);
  }

  /**
   * Test Builder {@link Builder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder dayCount(DayCount); when DayCount; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dayCount(DayCount)"})
  void testBuilderDayCount_whenDayCount_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#fixedRate(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixedRate(double)}
   */
  @Test
  @DisplayName("Test Builder fixedRate(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixedRate(double)"})
  void testBuilderFixedRate_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualFixedRateResult = builderResult.fixedRate(10.0d);

    // Assert
    assertSame(builderResult, actualFixedRateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'buySell'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenBuySell_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndex.builder().get("buySell"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'cdsIndexId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCdsIndexId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndex.builder().get("cdsIndexId"));
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
    assertNull(CdsIndex.builder().get("currency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> CdsIndex.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixedRate'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixedRate_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) CdsIndex.builder().get("fixedRate")).doubleValue());
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
    assertThrows(NoSuchElementException.class, () -> CdsIndex.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_givenNull_whenArrayListAddNull() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    ArrayList<StandardId> legalEntityIds = new ArrayList<>();
    legalEntityIds.add(null);

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(legalEntityIds);

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_givenNull_whenArrayListAddNull2() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    ArrayList<StandardId> legalEntityIds = new ArrayList<>();
    legalEntityIds.add(null);
    legalEntityIds.add(null);

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(legalEntityIds);

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(StandardId[])} with {@code StandardId[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(StandardId[])}
   */
  @Test
  @DisplayName("Test Builder legalEntityIds(StandardId[]) with 'StandardId[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(StandardId[])"})
  void testBuilderLegalEntityIdsWithStandardId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds();

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(StandardId[])} with {@code StandardId[]}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(StandardId[])}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(StandardId[]) with 'StandardId[]'; when StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(StandardId[])"})
  void testBuilderLegalEntityIdsWithStandardId_whenStandardIdWithSchemeAndValueIs42() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualLegalEntityIdsResult =
        builderResult.legalEntityIds(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
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
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualNotionalResult = builderResult.notional(10.0d);

    // Assert
    assertSame(builderResult, actualNotionalResult);
  }

  /**
   * Test Builder {@link Builder#paymentOnDefault(PaymentOnDefault)}.
   *
   * <ul>
   *   <li>When {@code ACCRUED_PREMIUM}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentOnDefault(PaymentOnDefault)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentOnDefault(PaymentOnDefault); when 'ACCRUED_PREMIUM'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentOnDefault(PaymentOnDefault)"})
  void testBuilderPaymentOnDefault_whenAccruedPremium_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualPaymentOnDefaultResult =
        builderResult.paymentOnDefault(PaymentOnDefault.ACCRUED_PREMIUM);

    // Assert
    assertSame(builderResult, actualPaymentOnDefaultResult);
  }

  /**
   * Test Builder {@link Builder#protectionStart(ProtectionStartOfDay)}.
   *
   * <ul>
   *   <li>When {@code BEGINNING}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#protectionStart(ProtectionStartOfDay)}
   */
  @Test
  @DisplayName(
      "Test Builder protectionStart(ProtectionStartOfDay); when 'BEGINNING'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.protectionStart(ProtectionStartOfDay)"})
  void testBuilderProtectionStart_whenBeginning_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualProtectionStartResult =
        builderResult.protectionStart(ProtectionStartOfDay.BEGINNING);

    // Assert
    assertSame(builderResult, actualProtectionStartResult);
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
        NoSuchElementException.class, () -> CdsIndex.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'buySell'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenBuySell_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("buySell", BuySell.BUY);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'cdsIndexId'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCdsIndexId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("cdsIndexId", null);

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
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#settlementDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#settlementDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder settlementDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.settlementDateOffset(DaysAdjustment)"})
  void testBuilderSettlementDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualSettlementDateOffsetResult =
        builderResult.settlementDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualSettlementDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#stepinDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#stepinDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder stepinDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.stepinDateOffset(DaysAdjustment)"})
  void testBuilderStepinDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndex.builder();

    // Act
    Builder actualStepinDateOffsetResult = builderResult.stepinDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualStepinDateOffsetResult);
  }

  /**
   * Test {@link CdsIndex#meta()}.
   *
   * <p>Method under test: {@link CdsIndex#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CdsIndex.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CdsIndex.meta();

    // Assert
    assertTrue(actualMetaResult.buySell() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixedRate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.notional() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.protectionStart() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.settlementDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.stepinDateOffset() instanceof DirectMetaProperty);
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
    Class<? extends CdsIndex> actualBeanTypeResult = CdsIndex.meta().beanType();

    // Assert
    Class<CdsIndex> expectedBeanTypeResult = CdsIndex.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#buySell()}
   *   <li>{@link Meta#cdsIndexId()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#fixedRate()}
   *   <li>{@link Meta#legalEntityIds()}
   *   <li>{@link Meta#notional()}
   *   <li>{@link Meta#paymentOnDefault()}
   *   <li>{@link Meta#paymentSchedule()}
   *   <li>{@link Meta#protectionStart()}
   *   <li>{@link Meta#settlementDateOffset()}
   *   <li>{@link Meta#stepinDateOffset()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.buySell()",
    "MetaProperty Meta.cdsIndexId()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.fixedRate()",
    "MetaProperty Meta.legalEntityIds()",
    "MetaProperty Meta.notional()",
    "MetaProperty Meta.paymentOnDefault()",
    "MetaProperty Meta.paymentSchedule()",
    "MetaProperty Meta.protectionStart()",
    "MetaProperty Meta.settlementDateOffset()",
    "MetaProperty Meta.stepinDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CdsIndex.meta();

    // Act
    MetaProperty<BuySell> actualBuySellResult = metaResult.buySell();
    MetaProperty<StandardId> actualCdsIndexIdResult = metaResult.cdsIndexId();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<Double> actualFixedRateResult = metaResult.fixedRate();
    MetaProperty<ImmutableList<StandardId>> actualLegalEntityIdsResult =
        metaResult.legalEntityIds();
    MetaProperty<Double> actualNotionalResult = metaResult.notional();
    MetaProperty<PaymentOnDefault> actualPaymentOnDefaultResult = metaResult.paymentOnDefault();
    MetaProperty<PeriodicSchedule> actualPaymentScheduleResult = metaResult.paymentSchedule();
    MetaProperty<ProtectionStartOfDay> actualProtectionStartResult = metaResult.protectionStart();
    MetaProperty<DaysAdjustment> actualSettlementDateOffsetResult =
        metaResult.settlementDateOffset();

    // Assert
    assertTrue(actualBuySellResult instanceof DirectMetaProperty);
    assertTrue(actualCdsIndexIdResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualFixedRateResult instanceof DirectMetaProperty);
    assertTrue(actualLegalEntityIdsResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentOnDefaultResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentScheduleResult instanceof DirectMetaProperty);
    assertTrue(actualProtectionStartResult instanceof DirectMetaProperty);
    assertTrue(actualSettlementDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(metaResult.stepinDateOffset() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return name is {@code buySell}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'buySell'; then return name is 'buySell'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBuySell_thenReturnNameIsBuySell() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("buySell");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("buySell", actualMetaPropertyGetResult.name());
    Class<BuySell> expectedPropertyTypeResult = BuySell.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).buySell());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return name is {@code cdsIndexId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'cdsIndexId'; then return name is 'cdsIndexId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCdsIndexId_thenReturnNameIsCdsIndexId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("cdsIndexId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("cdsIndexId", actualMetaPropertyGetResult.name());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cdsIndexId());
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
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
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
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return name is {@code fixedRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixedRate'; then return name is 'fixedRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixedRate_thenReturnNameIsFixedRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("fixedRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("fixedRate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code legalEntityIds}.
   *   <li>Then return name is {@code legalEntityIds}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'legalEntityIds'; then return name is 'legalEntityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLegalEntityIds_thenReturnNameIsLegalEntityIds() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("legalEntityIds");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notional() instanceof DirectMetaProperty);
    assertEquals("legalEntityIds", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityIds());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code notional}.
   *   <li>Then return name is {@code notional}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'notional'; then return name is 'notional'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNotional_thenReturnNameIsNotional() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CdsIndex.meta().metaPropertyGet("notional");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("notional", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).notional());
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
    assertNull(CdsIndex.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = CdsIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(12, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("buySell") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("cdsIndexId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixedRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("legalEntityIds") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("notional") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentOnDefault") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentSchedule") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("protectionStart") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("stepinDateOffset") instanceof DirectMetaProperty);
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
    assertNull(CdsIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> CdsIndex.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'buySell'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBuySell_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CdsIndex.meta().propertySet(mock(Bean.class), "buySell", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cdsIndexId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCdsIndexId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CdsIndex.meta().propertySet(mock(Bean.class), "cdsIndexId", "New Value", true));
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
        () -> CdsIndex.meta().propertySet(mock(Bean.class), "buySell", "New Value", false));
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
        () -> CdsIndex.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
