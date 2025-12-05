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
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.product.common.LongShort;
import com.opengamma.strata.product.swap.Swap;
import com.opengamma.strata.product.swaption.Swaption.Builder;
import com.opengamma.strata.product.swaption.Swaption.Meta;
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

class SwaptionDiffblueTest {
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
    Builder builderResult = Swaption.builder();

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
    Builder builderResult = Swaption.builder();

    // Act
    Builder actualExpiryZoneResult = builderResult.expiryZone(ZoneOffset.ofTotalSeconds(1));

    // Assert
    assertSame(builderResult, actualExpiryZoneResult);
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
    assertNull(Swaption.builder().get("expiryDate"));
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
    assertNull(Swaption.builder().get("expiryTime"));
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
    assertNull(Swaption.builder().get("expiryZone"));
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
    assertNull(Swaption.builder().get("longShort"));
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
    assertThrows(NoSuchElementException.class, () -> Swaption.builder().get("Property Name"));
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
    assertNull(Swaption.builder().get("swaptionSettlement"));
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
    assertNull(Swaption.builder().get("underlying"));
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
    Builder builderResult = Swaption.builder();

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
        NoSuchElementException.class, () -> Swaption.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code expiryDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'expiryDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenExpiryDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Swaption.builder();

    // Act
    Builder actualSetResult = builderResult.set("expiryDate", null);

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
    Builder builderResult = Swaption.builder();

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
    Builder builderResult = Swaption.builder();

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
    Class<? extends Swaption> actualBeanTypeResult = Swaption.meta().beanType();

    // Assert
    Class<Swaption> expectedBeanTypeResult = Swaption.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#exerciseInfo()}
   *   <li>{@link Meta#expiryDate()}
   *   <li>{@link Meta#expiryTime()}
   *   <li>{@link Meta#expiryZone()}
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
    "MetaProperty Meta.expiryDate()",
    "MetaProperty Meta.expiryTime()",
    "MetaProperty Meta.expiryZone()",
    "MetaProperty Meta.longShort()",
    "MetaProperty Meta.swaptionSettlement()",
    "MetaProperty Meta.underlying()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Swaption.meta();

    // Act
    MetaProperty<SwaptionExercise> actualExerciseInfoResult = metaResult.exerciseInfo();
    MetaProperty<AdjustableDate> actualExpiryDateResult = metaResult.expiryDate();
    MetaProperty<LocalTime> actualExpiryTimeResult = metaResult.expiryTime();
    MetaProperty<ZoneId> actualExpiryZoneResult = metaResult.expiryZone();
    MetaProperty<LongShort> actualLongShortResult = metaResult.longShort();
    MetaProperty<SwaptionSettlement> actualSwaptionSettlementResult =
        metaResult.swaptionSettlement();

    // Assert
    assertTrue(actualExerciseInfoResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryDateResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryTimeResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryZoneResult instanceof DirectMetaProperty);
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
        Swaption.meta().metaPropertyGet("swaptionSettlement");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("swaptionSettlement", actualMetaPropertyGetResult.name());
    Class<SwaptionSettlement> expectedPropertyTypeResult = SwaptionSettlement.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).swaptionSettlement());
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("exerciseInfo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("exerciseInfo", actualMetaPropertyGetResult.name());
    Class<SwaptionExercise> expectedPropertyTypeResult = SwaptionExercise.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).exerciseInfo());
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("expiryDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).underlying() instanceof DirectMetaProperty);
    assertEquals("expiryDate", actualMetaPropertyGetResult.name());
    Class<AdjustableDate> expectedPropertyTypeResult = AdjustableDate.class;
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("expiryTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("expiryZone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("longShort");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
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
    assertNull(Swaption.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = Swaption.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).exerciseInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).expiryZone() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).longShort() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).swaptionSettlement() instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    Class<Swap> expectedPropertyTypeResult = Swap.class;
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Swaption.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("exerciseInfo") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiryZone") instanceof DirectMetaProperty);
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
    assertNull(Swaption.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> Swaption.meta().propertyGet(null, "Property Name", false));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "exerciseInfo", "New Value", true));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "expiryDate", "New Value", true));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "expiryTime", "New Value", true));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "expiryZone", "New Value", true));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "exerciseInfo", "New Value", false));
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
        () -> Swaption.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
