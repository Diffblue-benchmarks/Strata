package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.common.LongShort;
import com.opengamma.strata.product.swap.ResolvedSwap;
import com.opengamma.strata.product.swaption.ResolvedSwaption.Builder;
import com.opengamma.strata.product.swaption.ResolvedSwaption.Meta;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResolvedSwaptionDiffblueTest {
  /**
   * Test Builder {@link Builder#exerciseInfo(SwaptionExerciseDates)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#exerciseInfo(SwaptionExerciseDates)}
   */
  @Test
  @DisplayName("Test Builder exerciseInfo(SwaptionExerciseDates); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.exerciseInfo(SwaptionExerciseDates)"})
  void testBuilderExerciseInfo_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwaption.builder();

    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());

    // Act
    Builder actualExerciseInfoResult =
        builderResult.exerciseInfo(SwaptionExerciseDates.of(dates, false));

    // Assert
    assertSame(builderResult, actualExerciseInfoResult);
  }

  /**
   * Test Builder {@link Builder#expiry(ZonedDateTime)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiry(ZonedDateTime)}
   */
  @Test
  @DisplayName("Test Builder expiry(ZonedDateTime); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiry(ZonedDateTime)"})
  void testBuilderExpiry_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwaption.builder();

    // Act
    Builder actualExpiryResult =
        builderResult.expiry(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Assert
    assertSame(builderResult, actualExpiryResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code exerciseInfo}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'exerciseInfo'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExerciseInfo_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedSwaption.builder().get("exerciseInfo"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'expiry'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiry_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedSwaption.builder().get("expiry"));
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
    assertNull(ResolvedSwaption.builder().get("longShort"));
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
        NoSuchElementException.class, () -> ResolvedSwaption.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code swaptionSettlement}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'swaptionSettlement'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSwaptionSettlement_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedSwaption.builder().get("swaptionSettlement"));
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
    assertNull(ResolvedSwaption.builder().get("underlying"));
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
    Builder builderResult = ResolvedSwaption.builder();

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
        () -> ResolvedSwaption.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code exerciseInfo}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'exerciseInfo'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenExerciseInfo_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwaption.builder();

    // Act
    Builder actualSetResult = builderResult.set("exerciseInfo", null);

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
    Builder builderResult = ResolvedSwaption.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#swaptionSettlement(SwaptionSettlement)}.
   *
   * <ul>
   *   <li>When {@link SwaptionSettlement}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#swaptionSettlement(SwaptionSettlement)}
   */
  @Test
  @DisplayName(
      "Test Builder swaptionSettlement(SwaptionSettlement); when SwaptionSettlement; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.swaptionSettlement(SwaptionSettlement)"})
  void testBuilderSwaptionSettlement_whenSwaptionSettlement_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwaption.builder();

    // Act
    Builder actualSwaptionSettlementResult =
        builderResult.swaptionSettlement(mock(SwaptionSettlement.class));

    // Assert
    assertSame(builderResult, actualSwaptionSettlementResult);
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
    Class<? extends ResolvedSwaption> actualBeanTypeResult = ResolvedSwaption.meta().beanType();

    // Assert
    Class<ResolvedSwaption> expectedBeanTypeResult = ResolvedSwaption.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#exerciseInfo()}
   *   <li>{@link Meta#expiry()}
   *   <li>{@link Meta#longShort()}
   *   <li>{@link Meta#swaptionSettlement()}
   *   <li>{@link Meta#underlying()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.exerciseInfo()",
    "MetaProperty Meta.expiry()",
    "MetaProperty Meta.longShort()",
    "MetaProperty Meta.swaptionSettlement()",
    "MetaProperty Meta.underlying()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedSwaption.meta();

    // Act
    MetaProperty<SwaptionExerciseDates> actualExerciseInfoResult = metaResult.exerciseInfo();
    MetaProperty<ZonedDateTime> actualExpiryResult = metaResult.expiry();
    MetaProperty<LongShort> actualLongShortResult = metaResult.longShort();
    MetaProperty<SwaptionSettlement> actualSwaptionSettlementResult =
        metaResult.swaptionSettlement();

    // Assert
    assertTrue(actualExerciseInfoResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryResult instanceof DirectMetaProperty);
    assertTrue(actualLongShortResult instanceof DirectMetaProperty);
    assertTrue(actualSwaptionSettlementResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlying() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code swaptionSettlement}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'swaptionSettlement'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsSwaptionSettlement() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedSwaption.meta().metaPropertyGet("swaptionSettlement");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SwaptionExerciseDates> exerciseInfoResult = ((Meta) metaBeanResult).exerciseInfo();
    assertTrue(exerciseInfoResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<LongShort> longShortResult = ((Meta) metaBeanResult).longShort();
    assertTrue(longShortResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("swaptionSettlement", actualMetaPropertyGetResult.name());
    Class<SwaptionSettlement> expectedPropertyTypeResult = SwaptionSettlement.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).swaptionSettlement());
    assertSame(metaBeanResult, exerciseInfoResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, longShortResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code exerciseInfo}.
   *   <li>Then return name is {@code exerciseInfo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'exerciseInfo'; then return name is 'exerciseInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExerciseInfo_thenReturnNameIsExerciseInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedSwaption.meta().metaPropertyGet("exerciseInfo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ZonedDateTime> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<LongShort> longShortResult = ((Meta) metaBeanResult).longShort();
    assertTrue(longShortResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionSettlement> swaptionSettlementResult =
        ((Meta) metaBeanResult).swaptionSettlement();
    assertTrue(swaptionSettlementResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("exerciseInfo", actualMetaPropertyGetResult.name());
    Class<SwaptionExerciseDates> expectedPropertyTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).exerciseInfo());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, longShortResult.metaBean());
    assertSame(metaBeanResult, swaptionSettlementResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return name is {@code expiry}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'expiry'; then return name is 'expiry'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiry_thenReturnNameIsExpiry() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedSwaption.meta().metaPropertyGet("expiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SwaptionExerciseDates> exerciseInfoResult = ((Meta) metaBeanResult).exerciseInfo();
    assertTrue(exerciseInfoResult instanceof DirectMetaProperty);
    MetaProperty<LongShort> longShortResult = ((Meta) metaBeanResult).longShort();
    assertTrue(longShortResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionSettlement> swaptionSettlementResult =
        ((Meta) metaBeanResult).swaptionSettlement();
    assertTrue(swaptionSettlementResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("expiry", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiry());
    assertSame(metaBeanResult, exerciseInfoResult.metaBean());
    assertSame(metaBeanResult, longShortResult.metaBean());
    assertSame(metaBeanResult, swaptionSettlementResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
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
        ResolvedSwaption.meta().metaPropertyGet("longShort");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SwaptionExerciseDates> exerciseInfoResult = ((Meta) metaBeanResult).exerciseInfo();
    assertTrue(exerciseInfoResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionSettlement> swaptionSettlementResult =
        ((Meta) metaBeanResult).swaptionSettlement();
    assertTrue(swaptionSettlementResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwap> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("longShort", actualMetaPropertyGetResult.name());
    Class<LongShort> expectedPropertyTypeResult = LongShort.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).longShort());
    assertSame(metaBeanResult, exerciseInfoResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, swaptionSettlementResult.metaBean());
    assertSame(metaBeanResult, underlyingResult.metaBean());
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
    assertNull(ResolvedSwaption.meta().metaPropertyGet("Property Name"));
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
        ResolvedSwaption.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SwaptionExerciseDates> exerciseInfoResult = ((Meta) metaBeanResult).exerciseInfo();
    assertTrue(exerciseInfoResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<LongShort> longShortResult = ((Meta) metaBeanResult).longShort();
    assertTrue(longShortResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwaptionSettlement> swaptionSettlementResult =
        ((Meta) metaBeanResult).swaptionSettlement();
    assertTrue(swaptionSettlementResult instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    Class<ResolvedSwap> expectedPropertyTypeResult = ResolvedSwap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlying());
    assertSame(metaBeanResult, exerciseInfoResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, longShortResult.metaBean());
    assertSame(metaBeanResult, swaptionSettlementResult.metaBean());
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
        ResolvedSwaption.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("exerciseInfo") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiry") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("longShort") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("swaptionSettlement") instanceof DirectMetaProperty);
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
    assertNull(ResolvedSwaption.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ResolvedSwaption.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code exerciseInfo}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'exerciseInfo'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExerciseInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedSwaption.meta()
                .propertySet(mock(Bean.class), "exerciseInfo", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiry'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiry_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedSwaption.meta().propertySet(mock(Bean.class), "expiry", "New Value", true));
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
            ResolvedSwaption.meta()
                .propertySet(mock(Bean.class), "exerciseInfo", "New Value", false));
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
            ResolvedSwaption.meta().propertySet(mock(Bean.class), "longShort", "New Value", true));
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
            ResolvedSwaption.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code swaptionSettlement}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'swaptionSettlement'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSwaptionSettlement_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedSwaption.meta()
                .propertySet(mock(Bean.class), "swaptionSettlement", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlying'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlying_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedSwaption.meta().propertySet(mock(Bean.class), "underlying", "New Value", true));
  }
}
