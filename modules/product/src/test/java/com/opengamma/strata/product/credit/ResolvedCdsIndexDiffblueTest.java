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
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.credit.ResolvedCdsIndex.Builder;
import com.opengamma.strata.product.credit.ResolvedCdsIndex.Meta;
import java.time.LocalDate;
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

class ResolvedCdsIndexDiffblueTest {
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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
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
    assertNull(ResolvedCdsIndex.builder().get("buySell"));
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
    assertNull(ResolvedCdsIndex.builder().get("cdsIndexId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedCdsIndex.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code legalEntityIds}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'legalEntityIds'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLegalEntityIds_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ResolvedCdsIndex.builder().get("legalEntityIds");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentOnDefault}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentOnDefault'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentOnDefault_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedCdsIndex.builder().get("paymentOnDefault"));
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
        NoSuchElementException.class, () -> ResolvedCdsIndex.builder().get("Property Name"));
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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

    // Act
    Builder actualLegalEntityIdsResult =
        builderResult.legalEntityIds(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
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
    Builder builderResult = ResolvedCdsIndex.builder();

    // Act
    Builder actualPaymentOnDefaultResult =
        builderResult.paymentOnDefault(PaymentOnDefault.ACCRUED_PREMIUM);

    // Assert
    assertSame(builderResult, actualPaymentOnDefaultResult);
  }

  /**
   * Test Builder {@link Builder#protectionEndDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#protectionEndDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder protectionEndDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.protectionEndDate(LocalDate)"})
  void testBuilderProtectionEndDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedCdsIndex.builder();

    // Act
    Builder actualProtectionEndDateResult =
        builderResult.protectionEndDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualProtectionEndDateResult);
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
    Builder builderResult = ResolvedCdsIndex.builder();

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
        NoSuchElementException.class,
        () -> ResolvedCdsIndex.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

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
    Builder builderResult = ResolvedCdsIndex.builder();

    // Act
    Builder actualStepinDateOffsetResult = builderResult.stepinDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualStepinDateOffsetResult);
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
    Class<? extends ResolvedCdsIndex> actualBeanTypeResult = ResolvedCdsIndex.meta().beanType();

    // Assert
    Class<ResolvedCdsIndex> expectedBeanTypeResult = ResolvedCdsIndex.class;
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
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#legalEntityIds()}
   *   <li>{@link Meta#paymentOnDefault()}
   *   <li>{@link Meta#paymentPeriods()}
   *   <li>{@link Meta#protectionEndDate()}
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
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.legalEntityIds()",
    "MetaProperty Meta.paymentOnDefault()",
    "MetaProperty Meta.paymentPeriods()",
    "MetaProperty Meta.protectionEndDate()",
    "MetaProperty Meta.protectionStart()",
    "MetaProperty Meta.settlementDateOffset()",
    "MetaProperty Meta.stepinDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedCdsIndex.meta();

    // Act
    MetaProperty<BuySell> actualBuySellResult = metaResult.buySell();
    MetaProperty<StandardId> actualCdsIndexIdResult = metaResult.cdsIndexId();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<ImmutableList<StandardId>> actualLegalEntityIdsResult =
        metaResult.legalEntityIds();
    MetaProperty<PaymentOnDefault> actualPaymentOnDefaultResult = metaResult.paymentOnDefault();
    MetaProperty<ImmutableList<CreditCouponPaymentPeriod>> actualPaymentPeriodsResult =
        metaResult.paymentPeriods();
    MetaProperty<LocalDate> actualProtectionEndDateResult = metaResult.protectionEndDate();
    MetaProperty<ProtectionStartOfDay> actualProtectionStartResult = metaResult.protectionStart();
    MetaProperty<DaysAdjustment> actualSettlementDateOffsetResult =
        metaResult.settlementDateOffset();

    // Assert
    assertTrue(actualBuySellResult instanceof DirectMetaProperty);
    assertTrue(actualCdsIndexIdResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualLegalEntityIdsResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentOnDefaultResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentPeriodsResult instanceof DirectMetaProperty);
    assertTrue(actualProtectionEndDateResult instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("buySell");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("cdsIndexId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("cdsIndexId", actualMetaPropertyGetResult.name());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cdsIndexId());
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
        ResolvedCdsIndex.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
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
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("legalEntityIds");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("legalEntityIds", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityIds());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentOnDefault}.
   *   <li>Then return name is {@code paymentOnDefault}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentOnDefault'; then return name is 'paymentOnDefault'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentOnDefault_thenReturnNameIsPaymentOnDefault() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("paymentOnDefault");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("paymentOnDefault", actualMetaPropertyGetResult.name());
    Class<PaymentOnDefault> expectedPropertyTypeResult = PaymentOnDefault.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentOnDefault());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentPeriods}.
   *   <li>Then return name is {@code paymentPeriods}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentPeriods'; then return name is 'paymentPeriods'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentPeriods_thenReturnNameIsPaymentPeriods() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("paymentPeriods");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("paymentPeriods", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentPeriods());
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
    assertNull(ResolvedCdsIndex.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code protectionEndDate}.
   *   <li>Then return name is {@code protectionEndDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'protectionEndDate'; then return name is 'protectionEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenProtectionEndDate_thenReturnNameIsProtectionEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("protectionEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionStart() instanceof DirectMetaProperty);
    assertEquals("protectionEndDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).protectionEndDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code protectionStart}.
   *   <li>Then return name is {@code protectionStart}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'protectionStart'; then return name is 'protectionStart'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenProtectionStart_thenReturnNameIsProtectionStart() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedCdsIndex.meta().metaPropertyGet("protectionStart");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).protectionEndDate() instanceof DirectMetaProperty);
    assertEquals("protectionStart", actualMetaPropertyGetResult.name());
    Class<ProtectionStartOfDay> expectedPropertyTypeResult = ProtectionStartOfDay.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).protectionStart());
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
        ResolvedCdsIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(10, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("buySell") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("cdsIndexId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("legalEntityIds") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentOnDefault") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentPeriods") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("protectionEndDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("protectionStart") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("settlementDateOffset") instanceof DirectMetaProperty);
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
    assertNull(ResolvedCdsIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ResolvedCdsIndex.meta().propertyGet(null, "Property Name", false));
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
        () -> ResolvedCdsIndex.meta().propertySet(mock(Bean.class), "buySell", "New Value", true));
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
        () ->
            ResolvedCdsIndex.meta().propertySet(mock(Bean.class), "cdsIndexId", "New Value", true));
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
        () -> ResolvedCdsIndex.meta().propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
        () -> ResolvedCdsIndex.meta().propertySet(mock(Bean.class), "buySell", "New Value", false));
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
            ResolvedCdsIndex.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
