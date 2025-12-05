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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.value.Rounding;
import com.opengamma.strata.product.SecurityId;
import com.opengamma.strata.product.bond.BondFuture.Builder;
import com.opengamma.strata.product.bond.BondFuture.Meta;
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

class BondFutureDiffblueTest {
  /**
   * Test Builder {@link Builder#conversionFactors(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>When ten and {@code 0.5}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#conversionFactors(Double[])}
   */
  @Test
  @DisplayName(
      "Test Builder conversionFactors(Double[]) with 'Double[]'; when ten and '0.5'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.conversionFactors(Double[])"})
  void testBuilderConversionFactorsWithDouble_whenTenAnd05_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualConversionFactorsResult = builderResult.conversionFactors(10.0d, 0.5d);

    // Assert
    assertSame(builderResult, actualConversionFactorsResult);
  }

  /**
   * Test Builder {@link Builder#conversionFactors(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#conversionFactors(Double[])}
   */
  @Test
  @DisplayName(
      "Test Builder conversionFactors(Double[]) with 'Double[]'; when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.conversionFactors(Double[])"})
  void testBuilderConversionFactorsWithDouble_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualConversionFactorsResult = builderResult.conversionFactors(10.0d);

    // Assert
    assertSame(builderResult, actualConversionFactorsResult);
  }

  /**
   * Test Builder {@link Builder#conversionFactors(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#conversionFactors(List)}
   */
  @Test
  @DisplayName(
      "Test Builder conversionFactors(List) with 'List'; given '0.5'; when ArrayList() add '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.conversionFactors(List)"})
  void testBuilderConversionFactorsWithList_given05_whenArrayListAdd05() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    ArrayList<Double> conversionFactors = new ArrayList<>();
    conversionFactors.add(0.5d);
    conversionFactors.add(10.0d);

    // Act
    Builder actualConversionFactorsResult = builderResult.conversionFactors(conversionFactors);

    // Assert
    assertSame(builderResult, actualConversionFactorsResult);
  }

  /**
   * Test Builder {@link Builder#conversionFactors(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#conversionFactors(List)}
   */
  @Test
  @DisplayName("Test Builder conversionFactors(List) with 'List'; given ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.conversionFactors(List)"})
  void testBuilderConversionFactorsWithList_givenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    ArrayList<Double> conversionFactors = new ArrayList<>();
    conversionFactors.add(10.0d);

    // Act
    Builder actualConversionFactorsResult = builderResult.conversionFactors(conversionFactors);

    // Assert
    assertSame(builderResult, actualConversionFactorsResult);
  }

  /**
   * Test Builder {@link Builder#firstNoticeDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#firstNoticeDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder firstNoticeDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.firstNoticeDate(LocalDate)"})
  void testBuilderFirstNoticeDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualFirstNoticeDateResult = builderResult.firstNoticeDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualFirstNoticeDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code conversionFactors}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'conversionFactors'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConversionFactors_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = BondFuture.builder().get("conversionFactors");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code deliveryBasket}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'deliveryBasket'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDeliveryBasket_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = BondFuture.builder().get("deliveryBasket");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code firstNoticeDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'firstNoticeDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFirstNoticeDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BondFuture.builder().get("firstNoticeDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code lastNoticeDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'lastNoticeDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLastNoticeDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BondFuture.builder().get("lastNoticeDate"));
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
    assertNull(BondFuture.builder().get("lastTradeDate"));
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
    assertThrows(NoSuchElementException.class, () -> BondFuture.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code rounding}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'rounding'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRounding_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> BondFuture.builder().get("rounding"));
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
    assertNull(BondFuture.builder().get("securityId"));
  }

  /**
   * Test Builder {@link Builder#lastNoticeDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#lastNoticeDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder lastNoticeDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.lastNoticeDate(LocalDate)"})
  void testBuilderLastNoticeDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualLastNoticeDateResult = builderResult.lastNoticeDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualLastNoticeDateResult);
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
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualLastTradeDateResult = builderResult.lastTradeDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualLastTradeDateResult);
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
    Builder builderResult = BondFuture.builder();

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
        NoSuchElementException.class, () -> BondFuture.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code conversionFactors}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'conversionFactors'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenConversionFactors_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualSetResult = builderResult.set("conversionFactors", new ArrayList<>());

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
    Builder builderResult = BondFuture.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link BondFuture#meta()}.
   *
   * <p>Method under test: {@link BondFuture#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BondFuture.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BondFuture.meta();

    // Assert
    assertTrue(actualMetaResult.conversionFactors() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rounding() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.securityId() instanceof DirectMetaProperty);
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
    Class<? extends BondFuture> actualBeanTypeResult = BondFuture.meta().beanType();

    // Assert
    Class<BondFuture> expectedBeanTypeResult = BondFuture.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#conversionFactors()}
   *   <li>{@link Meta#deliveryBasket()}
   *   <li>{@link Meta#firstDeliveryDate()}
   *   <li>{@link Meta#firstNoticeDate()}
   *   <li>{@link Meta#lastDeliveryDate()}
   *   <li>{@link Meta#lastNoticeDate()}
   *   <li>{@link Meta#lastTradeDate()}
   *   <li>{@link Meta#rounding()}
   *   <li>{@link Meta#securityId()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.conversionFactors()",
    "MetaProperty Meta.deliveryBasket()",
    "MetaProperty Meta.firstDeliveryDate()",
    "MetaProperty Meta.firstNoticeDate()",
    "MetaProperty Meta.lastDeliveryDate()",
    "MetaProperty Meta.lastNoticeDate()",
    "MetaProperty Meta.lastTradeDate()",
    "MetaProperty Meta.rounding()",
    "MetaProperty Meta.securityId()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BondFuture.meta();

    // Act
    MetaProperty<ImmutableList<Double>> actualConversionFactorsResult =
        metaResult.conversionFactors();
    MetaProperty<ImmutableList<FixedCouponBond>> actualDeliveryBasketResult =
        metaResult.deliveryBasket();
    MetaProperty<LocalDate> actualFirstDeliveryDateResult = metaResult.firstDeliveryDate();
    MetaProperty<LocalDate> actualFirstNoticeDateResult = metaResult.firstNoticeDate();
    MetaProperty<LocalDate> actualLastDeliveryDateResult = metaResult.lastDeliveryDate();
    MetaProperty<LocalDate> actualLastNoticeDateResult = metaResult.lastNoticeDate();
    MetaProperty<LocalDate> actualLastTradeDateResult = metaResult.lastTradeDate();
    MetaProperty<Rounding> actualRoundingResult = metaResult.rounding();

    // Assert
    assertTrue(actualConversionFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualDeliveryBasketResult instanceof DirectMetaProperty);
    assertTrue(actualFirstDeliveryDateResult instanceof DirectMetaProperty);
    assertTrue(actualFirstNoticeDateResult instanceof DirectMetaProperty);
    assertTrue(actualLastDeliveryDateResult instanceof DirectMetaProperty);
    assertTrue(actualLastNoticeDateResult instanceof DirectMetaProperty);
    assertTrue(actualLastTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualRoundingResult instanceof DirectMetaProperty);
    assertTrue(metaResult.securityId() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code conversionFactors}.
   *   <li>Then return name is {@code conversionFactors}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'conversionFactors'; then return name is 'conversionFactors'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConversionFactors_thenReturnNameIsConversionFactors() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("conversionFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("conversionFactors", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).conversionFactors());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code deliveryBasket}.
   *   <li>Then return name is {@code deliveryBasket}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'deliveryBasket'; then return name is 'deliveryBasket'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDeliveryBasket_thenReturnNameIsDeliveryBasket() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("deliveryBasket");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("deliveryBasket", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).deliveryBasket());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code firstDeliveryDate}.
   *   <li>Then return name is {@code firstDeliveryDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'firstDeliveryDate'; then return name is 'firstDeliveryDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirstDeliveryDate_thenReturnNameIsFirstDeliveryDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("firstDeliveryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("firstDeliveryDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstDeliveryDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code firstNoticeDate}.
   *   <li>Then return name is {@code firstNoticeDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'firstNoticeDate'; then return name is 'firstNoticeDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirstNoticeDate_thenReturnNameIsFirstNoticeDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("firstNoticeDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("firstNoticeDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstNoticeDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lastDeliveryDate}.
   *   <li>Then return name is {@code lastDeliveryDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lastDeliveryDate'; then return name is 'lastDeliveryDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLastDeliveryDate_thenReturnNameIsLastDeliveryDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("lastDeliveryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("lastDeliveryDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastDeliveryDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lastNoticeDate}.
   *   <li>Then return name is {@code lastNoticeDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lastNoticeDate'; then return name is 'lastNoticeDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLastNoticeDate_thenReturnNameIsLastNoticeDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BondFuture.meta().metaPropertyGet("lastNoticeDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("lastNoticeDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastNoticeDate());
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
        BondFuture.meta().metaPropertyGet("lastTradeDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("lastTradeDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastTradeDate());
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
    assertNull(BondFuture.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rounding}.
   *   <li>Then return name is {@code rounding}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'rounding'; then return name is 'rounding'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRounding_thenReturnNameIsRounding() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = BondFuture.meta().metaPropertyGet("rounding");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).securityId() instanceof DirectMetaProperty);
    assertEquals("rounding", actualMetaPropertyGetResult.name());
    Class<Rounding> expectedPropertyTypeResult = Rounding.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rounding());
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
    MetaProperty<?> actualMetaPropertyGetResult = BondFuture.meta().metaPropertyGet("securityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).conversionFactors() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).deliveryBasket() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastDeliveryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastNoticeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastTradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rounding() instanceof DirectMetaProperty);
    assertEquals("securityId", actualMetaPropertyGetResult.name());
    Class<SecurityId> expectedPropertyTypeResult = SecurityId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).securityId());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = BondFuture.meta().metaPropertyMap();

    // Assert
    assertEquals(9, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("conversionFactors") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("deliveryBasket") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("firstDeliveryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("firstNoticeDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastDeliveryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastNoticeDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastTradeDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rounding") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("securityId") instanceof DirectMetaProperty);
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
    assertNull(BondFuture.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> BondFuture.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code conversionFactors}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'conversionFactors'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConversionFactors_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BondFuture.meta()
                .propertySet(mock(Bean.class), "conversionFactors", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code deliveryBasket}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'deliveryBasket'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDeliveryBasket_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> BondFuture.meta().propertySet(mock(Bean.class), "deliveryBasket", "New Value", true));
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
            BondFuture.meta()
                .propertySet(mock(Bean.class), "conversionFactors", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstDeliveryDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstDeliveryDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstDeliveryDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BondFuture.meta()
                .propertySet(mock(Bean.class), "firstDeliveryDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstNoticeDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstNoticeDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstNoticeDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BondFuture.meta().propertySet(mock(Bean.class), "firstNoticeDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastDeliveryDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lastDeliveryDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLastDeliveryDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BondFuture.meta().propertySet(mock(Bean.class), "lastDeliveryDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastNoticeDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lastNoticeDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLastNoticeDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> BondFuture.meta().propertySet(mock(Bean.class), "lastNoticeDate", "New Value", true));
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
        () -> BondFuture.meta().propertySet(mock(Bean.class), "lastTradeDate", "New Value", true));
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
        () -> BondFuture.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
