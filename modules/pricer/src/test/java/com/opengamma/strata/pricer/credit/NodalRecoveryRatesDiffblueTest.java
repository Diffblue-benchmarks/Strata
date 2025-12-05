package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.CurveInfoType;
import com.opengamma.strata.market.curve.CurveMetadata;
import com.opengamma.strata.market.curve.NodalCurve;
import com.opengamma.strata.pricer.credit.NodalRecoveryRates.Builder;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.direct.MinimalMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodalRecoveryRatesDiffblueTest {
  /**
   * Test Builder {@link Builder#curve(NodalCurve)}.
   *
   * <ul>
   *   <li>When {@link NodalCurve}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#curve(NodalCurve)}
   */
  @Test
  @DisplayName("Test Builder curve(NodalCurve); when NodalCurve; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.curve(NodalCurve)"})
  void testBuilderCurve_whenNodalCurve_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NodalRecoveryRates.builder();

    // Act
    Builder actualCurveResult = builderResult.curve(mock(NodalCurve.class));

    // Assert
    assertSame(builderResult, actualCurveResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code curve}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'curve'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurve_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NodalRecoveryRates.builder().get("curve"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code legalEntityId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'legalEntityId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLegalEntityId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NodalRecoveryRates.builder().get("legalEntityId"));
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
        NoSuchElementException.class, () -> NodalRecoveryRates.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valuationDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValuationDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NodalRecoveryRates.builder().get("valuationDate"));
  }

  /**
   * Test Builder {@link Builder#legalEntityId(StandardId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityId(StandardId)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityId(StandardId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityId(StandardId)"})
  void testBuilderLegalEntityId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NodalRecoveryRates.builder();

    // Act
    Builder actualLegalEntityIdResult = builderResult.legalEntityId(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualLegalEntityIdResult);
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
        () -> NodalRecoveryRates.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code curve}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'curve'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurve_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NodalRecoveryRates.builder();

    // Act
    Builder actualSetResult = builderResult.set("curve", null);

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
    Builder builderResult = NodalRecoveryRates.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#valuationDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valuationDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder valuationDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valuationDate(LocalDate)"})
  void testBuilderValuationDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NodalRecoveryRates.builder();

    // Act
    Builder actualValuationDateResult = builderResult.valuationDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualValuationDateResult);
  }

  /**
   * Test {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#findInfo(CurveInfoType)} return empty.
   *   <li>Then calls {@link CurveMetadata#findInfo(CurveInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, NodalCurve); given CurveMetadata findInfo(CurveInfoType) return empty; then calls findInfo(CurveInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodalRecoveryRates NodalRecoveryRates.of(StandardId, LocalDate, NodalCurve)"})
  void testOf_givenCurveMetadataFindInfoReturnEmpty_thenCallsFindInfo() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    Optional<Object> emptyResult = Optional.empty();
    when(curveMetadata.findInfo(Mockito.<CurveInfoType<Object>>any())).thenReturn(emptyResult);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("RecoveryRate"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    NodalCurve curve = mock(NodalCurve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NodalRecoveryRates.of(legalEntityId, valuationDate, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).findInfo(isA(CurveInfoType.class));
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#findInfo(CurveInfoType)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then calls {@link CurveMetadata#findInfo(CurveInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, NodalCurve); given CurveMetadata findInfo(CurveInfoType) throw IllegalArgumentException(); then calls findInfo(CurveInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodalRecoveryRates NodalRecoveryRates.of(StandardId, LocalDate, NodalCurve)"})
  void testOf_givenCurveMetadataFindInfoThrowIllegalArgumentException_thenCallsFindInfo() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.findInfo(Mockito.<CurveInfoType<Object>>any()))
        .thenThrow(new IllegalArgumentException());
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("RecoveryRate"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    NodalCurve curve = mock(NodalCurve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NodalRecoveryRates.of(legalEntityId, valuationDate, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).findInfo(isA(CurveInfoType.class));
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, NodalCurve); given CurveMetadata getYValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodalRecoveryRates NodalRecoveryRates.of(StandardId, LocalDate, NodalCurve)"})
  void testOf_givenCurveMetadataGetYValueTypeThrowIllegalArgumentException() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenThrow(new IllegalArgumentException());
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    NodalCurve curve = mock(NodalCurve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NodalRecoveryRates.of(legalEntityId, valuationDate, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link NodalRecoveryRates#of(StandardId, LocalDate, NodalCurve)}
   */
  @Test
  @DisplayName("Test of(StandardId, LocalDate, NodalCurve); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodalRecoveryRates NodalRecoveryRates.of(StandardId, LocalDate, NodalCurve)"})
  void testOf_givenIllegalArgumentException() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    NodalCurve curve = mock(NodalCurve.class);
    when(curve.getMetadata()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NodalRecoveryRates.of(legalEntityId, valuationDate, curve));
    verify(curve).getMetadata();
  }

  /**
   * Test {@link NodalRecoveryRates#meta()}.
   *
   * <p>Method under test: {@link NodalRecoveryRates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean NodalRecoveryRates.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<NodalRecoveryRates> actualMetaResult = NodalRecoveryRates.meta();

    // Assert
    assertTrue(actualMetaResult.builder() instanceof Builder);
    assertTrue(actualMetaResult instanceof MinimalMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("curve"));
    assertTrue(metaPropertyMapResult.containsKey("legalEntityId"));
    assertTrue(metaPropertyMapResult.containsKey("valuationDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<NodalRecoveryRates> expectedBeanTypeResult = NodalRecoveryRates.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
