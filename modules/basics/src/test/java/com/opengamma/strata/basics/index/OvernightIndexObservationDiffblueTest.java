package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendars;
import com.opengamma.strata.basics.index.OvernightIndexObservation.Builder;
import com.opengamma.strata.basics.index.OvernightIndexObservation.Meta;
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
import org.mockito.Mockito;

class OvernightIndexObservationDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OvernightIndexObservation Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    LocalDate effectiveDate = LocalDate.of(1970, 1, 1);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);
    OvernightIndex index = OvernightIndices.AUD_AONIA;
    LocalDate maturityDate = LocalDate.of(1970, 1, 1);
    LocalDate publicationDate = LocalDate.of(1970, 1, 1);

    // Act
    OvernightIndexObservation actualOvernightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(effectiveDate)
            .fixingDate(fixingDate)
            .index(index)
            .maturityDate(maturityDate)
            .publicationDate(publicationDate)
            .yearFraction(10.0d)
            .build();

    // Assert
    LocalDate effectiveDate2 = actualOvernightIndexObservation.getEffectiveDate();
    assertEquals("1970-01-01", effectiveDate2.toString());
    LocalDate fixingDate2 = actualOvernightIndexObservation.getFixingDate();
    assertEquals("1970-01-01", fixingDate2.toString());
    LocalDate maturityDate2 = actualOvernightIndexObservation.getMaturityDate();
    assertEquals("1970-01-01", maturityDate2.toString());
    LocalDate publicationDate2 = actualOvernightIndexObservation.getPublicationDate();
    assertEquals("1970-01-01", publicationDate2.toString());
    Currency currency = actualOvernightIndexObservation.getCurrency();
    assertEquals("AUD", currency.getCode());
    assertEquals("AUD", currency.toString());
    Currency triangulationCurrency = currency.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(10.0d, actualOvernightIndexObservation.getYearFraction());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertEquals(2, currency.getMinorUnitDigits());
    assertSame(effectiveDate, effectiveDate2);
    assertSame(fixingDate, fixingDate2);
    assertSame(maturityDate, maturityDate2);
    assertSame(publicationDate, publicationDate2);
    assertSame(index, actualOvernightIndexObservation.getIndex());
  }

  /**
   * Test Builder {@link Builder#effectiveDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#effectiveDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder effectiveDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.effectiveDate(LocalDate)"})
  void testBuilderEffectiveDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualEffectiveDateResult = builderResult.effectiveDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEffectiveDateResult);
  }

  /**
   * Test Builder {@link Builder#fixingDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder fixingDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingDate(LocalDate)"})
  void testBuilderFixingDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualFixingDateResult = builderResult.fixingDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualFixingDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'effectiveDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenEffectiveDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightIndexObservation.builder().get("effectiveDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightIndexObservation.builder().get("fixingDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightIndexObservation.builder().get("index"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'maturityDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMaturityDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightIndexObservation.builder().get("maturityDate"));
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
        () -> OvernightIndexObservation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code publicationDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'publicationDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPublicationDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightIndexObservation.builder().get("publicationDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'yearFraction'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenYearFraction_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, ((Double) OvernightIndexObservation.builder().get("yearFraction")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#index(OvernightIndex)}.
   *
   * <ul>
   *   <li>When {@link OvernightIndices#AUD_AONIA}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(OvernightIndex)}
   */
  @Test
  @DisplayName("Test Builder index(OvernightIndex); when AUD_AONIA; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(OvernightIndex)"})
  void testBuilderIndex_whenAud_aonia_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualIndexResult = builderResult.index(OvernightIndices.AUD_AONIA);

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#maturityDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#maturityDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder maturityDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.maturityDate(LocalDate)"})
  void testBuilderMaturityDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualMaturityDateResult = builderResult.maturityDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualMaturityDateResult);
  }

  /**
   * Test Builder {@link Builder#publicationDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#publicationDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder publicationDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.publicationDate(LocalDate)"})
  void testBuilderPublicationDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualPublicationDateResult = builderResult.publicationDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualPublicationDateResult);
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
        () -> OvernightIndexObservation.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'effectiveDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenEffectiveDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualSetResult = builderResult.set("effectiveDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'fixingDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFixingDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualSetResult = builderResult.set("fixingDate", LocalDate.of(1970, 1, 1));

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
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#yearFraction(double)}.
   *
   * <p>Method under test: {@link Builder#yearFraction(double)}
   */
  @Test
  @DisplayName("Test Builder yearFraction(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.yearFraction(double)"})
  void testBuilderYearFraction() {
    // Arrange
    Builder builderResult = OvernightIndexObservation.builder();

    // Act
    Builder actualYearFractionResult = builderResult.yearFraction(10.0d);

    // Assert
    assertSame(builderResult, actualYearFractionResult);
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
    Class<? extends OvernightIndexObservation> actualBeanTypeResult =
        OvernightIndexObservation.meta().beanType();

    // Assert
    Class<OvernightIndexObservation> expectedBeanTypeResult = OvernightIndexObservation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#effectiveDate()}
   *   <li>{@link Meta#fixingDate()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#maturityDate()}
   *   <li>{@link Meta#publicationDate()}
   *   <li>{@link Meta#yearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.effectiveDate()",
    "MetaProperty Meta.fixingDate()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.maturityDate()",
    "MetaProperty Meta.publicationDate()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();

    // Act
    MetaProperty<LocalDate> actualEffectiveDateResult = metaResult.effectiveDate();
    MetaProperty<LocalDate> actualFixingDateResult = metaResult.fixingDate();
    MetaProperty<OvernightIndex> actualIndexResult = metaResult.index();
    MetaProperty<LocalDate> actualMaturityDateResult = metaResult.maturityDate();
    MetaProperty<LocalDate> actualPublicationDateResult = metaResult.publicationDate();

    // Assert
    assertTrue(actualEffectiveDateResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualMaturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualPublicationDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then return name is {@code effectiveDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'effectiveDate'; then return name is 'effectiveDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEffectiveDate_thenReturnNameIsEffectiveDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("effectiveDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> publicationDateResult = ((Meta) metaBeanResult).publicationDate();
    assertTrue(publicationDateResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("effectiveDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).effectiveDate());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, publicationDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then return name is {@code fixingDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDate'; then return name is 'fixingDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDate_thenReturnNameIsFixingDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("fixingDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> publicationDateResult = ((Meta) metaBeanResult).publicationDate();
    assertTrue(publicationDateResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("fixingDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDate());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, publicationDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).effectiveDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).maturityDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<OvernightIndex> expectedPropertyTypeResult = OvernightIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then return name is {@code maturityDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'maturityDate'; then return name is 'maturityDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMaturityDate_thenReturnNameIsMaturityDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("maturityDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> publicationDateResult = ((Meta) metaBeanResult).publicationDate();
    assertTrue(publicationDateResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("maturityDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).maturityDate());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, publicationDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
    assertNull(OvernightIndexObservation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code publicationDate}.
   *   <li>Then return name is {@code publicationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'publicationDate'; then return name is 'publicationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPublicationDate_thenReturnNameIsPublicationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("publicationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> effectiveDateResult = ((Meta) metaBeanResult).effectiveDate();
    assertTrue(effectiveDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> fixingDateResult = ((Meta) metaBeanResult).fixingDate();
    assertTrue(fixingDateResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> maturityDateResult = ((Meta) metaBeanResult).maturityDate();
    assertTrue(maturityDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("publicationDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).publicationDate());
    assertSame(metaBeanResult, effectiveDateResult.metaBean());
    assertSame(metaBeanResult, fixingDateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, maturityDateResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightIndexObservation.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).effectiveDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).maturityDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDate() instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
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
        OvernightIndexObservation.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("effectiveDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("maturityDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("publicationDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then FloatingRateName return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then FloatingRateName return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenFloatingRateNameReturnImmutableFloatingRateName() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            OvernightIndexObservation.builder()
                .effectiveDate(LocalDate.of(1970, 1, 1))
                .fixingDate(LocalDate.of(1970, 1, 1))
                .index(OvernightIndices.AUD_AONIA)
                .maturityDate(LocalDate.of(1970, 1, 1))
                .publicationDate(LocalDate.of(1970, 1, 1))
                .yearFraction(10.0d)
                .build(),
            "index",
            true);

    // Assert
    assertTrue(
        ((ImmutableOvernightIndex) actualPropertyGetResult).getFloatingRateName()
            instanceof ImmutableFloatingRateName);
    assertTrue(actualPropertyGetResult instanceof ImmutableOvernightIndex);
    assertEquals("AUD-AONIA", ((ImmutableOvernightIndex) actualPropertyGetResult).getName());
    assertEquals(0, ((ImmutableOvernightIndex) actualPropertyGetResult).getEffectiveDateOffset());
    assertEquals(0, ((ImmutableOvernightIndex) actualPropertyGetResult).getPublicationDateOffset());
    assertTrue(((ImmutableOvernightIndex) actualPropertyGetResult).isActive());
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
        OvernightIndexObservation.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'effectiveDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEffectiveDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();
    LocalDate effectiveDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            OvernightIndexObservation.builder()
                .effectiveDate(effectiveDate)
                .fixingDate(LocalDate.of(1970, 1, 1))
                .index(OvernightIndices.AUD_AONIA)
                .maturityDate(LocalDate.of(1970, 1, 1))
                .publicationDate(LocalDate.of(1970, 1, 1))
                .yearFraction(10.0d)
                .build(),
            "effectiveDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(effectiveDate, actualPropertyGetResult);
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
        () -> OvernightIndexObservation.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fixingDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixingDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            OvernightIndexObservation.builder()
                .effectiveDate(LocalDate.of(1970, 1, 1))
                .fixingDate(fixingDate)
                .index(OvernightIndices.AUD_AONIA)
                .maturityDate(LocalDate.of(1970, 1, 1))
                .publicationDate(LocalDate.of(1970, 1, 1))
                .yearFraction(10.0d)
                .build(),
            "fixingDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(fixingDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'maturityDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMaturityDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();
    LocalDate maturityDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            OvernightIndexObservation.builder()
                .effectiveDate(LocalDate.of(1970, 1, 1))
                .fixingDate(LocalDate.of(1970, 1, 1))
                .index(OvernightIndices.AUD_AONIA)
                .maturityDate(maturityDate)
                .publicationDate(LocalDate.of(1970, 1, 1))
                .yearFraction(10.0d)
                .build(),
            "maturityDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(maturityDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code publicationDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'publicationDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPublicationDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = OvernightIndexObservation.meta();
    LocalDate publicationDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            OvernightIndexObservation.builder()
                .effectiveDate(LocalDate.of(1970, 1, 1))
                .fixingDate(LocalDate.of(1970, 1, 1))
                .index(OvernightIndices.AUD_AONIA)
                .maturityDate(LocalDate.of(1970, 1, 1))
                .publicationDate(publicationDate)
                .yearFraction(10.0d)
                .build(),
            "publicationDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(publicationDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code effectiveDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'effectiveDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEffectiveDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "effectiveDate", "New Value", true));
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
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "effectiveDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "fixingDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code maturityDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'maturityDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMaturityDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "maturityDate", "New Value", true));
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
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code publicationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'publicationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPublicationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "publicationDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFraction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFraction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightIndexObservation.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }

  /**
   * Test {@link OvernightIndexObservation#of(OvernightIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link OvernightIndices#AUD_AONIA}.
   *   <li>Then return MaturityDate toString is {@code 1970-01-04}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#of(OvernightIndex, LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, LocalDate, ReferenceData); given FRI_SAT; when AUD_AONIA; then return MaturityDate toString is '1970-01-04'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexObservation OvernightIndexObservation.of(OvernightIndex, LocalDate, ReferenceData)"
  })
  void testOf_givenFri_sat_whenAud_aonia_thenReturnMaturityDateToStringIs19700104() {
    // Arrange
    OvernightIndex index = OvernightIndices.AUD_AONIA;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    OvernightIndexObservation actualOfResult =
        OvernightIndexObservation.of(index, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-04", actualOfResult.getMaturityDate().toString());
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AUD", currency.getCode());
    assertEquals("AUD", currency.toString());
    assertEquals(0.00821917808219178d, actualOfResult.getYearFraction());
    assertSame(fixingDate, actualOfResult.getPublicationDate());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link OvernightIndexObservation#of(OvernightIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link OvernightIndices#BRL_CDI}.
   *   <li>Then return PublicationDate toString is {@code 1970-01-04}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#of(OvernightIndex, LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, LocalDate, ReferenceData); given FRI_SAT; when BRL_CDI; then return PublicationDate toString is '1970-01-04'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexObservation OvernightIndexObservation.of(OvernightIndex, LocalDate, ReferenceData)"
  })
  void testOf_givenFri_sat_whenBrl_cdi_thenReturnPublicationDateToStringIs19700104() {
    // Arrange
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    OvernightIndexObservation actualOfResult =
        OvernightIndexObservation.of(OvernightIndices.BRL_CDI, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    OvernightIndex index = actualOfResult.getIndex();
    FloatingRateName floatingRateName = index.getFloatingRateName();
    assertTrue(floatingRateName instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableOvernightIndex);
    assertEquals("1970-01-04", actualOfResult.getPublicationDate().toString());
    Currency currency = actualOfResult.getCurrency();
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
    assertSame(currency, index.getCurrency());
    assertSame(currency, floatingRateName.getCurrency());
    assertSame(index.getTenor(), floatingRateName.getDefaultTenor());
    assertSame(index, floatingRateName.toFloatingRateIndex());
  }

  /**
   * Test {@link OvernightIndexObservation#of(OvernightIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return MaturityDate toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#of(OvernightIndex, LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, LocalDate, ReferenceData); given NO_HOLIDAYS; then return MaturityDate toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexObservation OvernightIndexObservation.of(OvernightIndex, LocalDate, ReferenceData)"
  })
  void testOf_givenNo_holidays_thenReturnMaturityDateToStringIs19700102() {
    // Arrange
    OvernightIndex index = OvernightIndices.AUD_AONIA;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.NO_HOLIDAYS);

    // Act
    OvernightIndexObservation actualOfResult =
        OvernightIndexObservation.of(index, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-02", actualOfResult.getMaturityDate().toString());
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AUD", currency.getCode());
    assertEquals("AUD", currency.toString());
    assertEquals(0.0027397260273972603d, actualOfResult.getYearFraction());
    assertSame(fixingDate, actualOfResult.getPublicationDate());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link OvernightIndexObservation#of(OvernightIndex, LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>When ofYearDay one and one.
   *   <li>Then return MaturityDate toString is {@code 0001-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#of(OvernightIndex, LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, LocalDate, ReferenceData); when ofYearDay one and one; then return MaturityDate toString is '0001-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexObservation OvernightIndexObservation.of(OvernightIndex, LocalDate, ReferenceData)"
  })
  void testOf_whenOfYearDayOneAndOne_thenReturnMaturityDateToStringIs00010102() {
    // Arrange
    LocalDate fixingDate = LocalDate.ofYearDay(1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    OvernightIndexObservation actualOfResult =
        OvernightIndexObservation.of(OvernightIndices.BRL_CDI, fixingDate, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    OvernightIndex index = actualOfResult.getIndex();
    FloatingRateName floatingRateName = index.getFloatingRateName();
    assertTrue(floatingRateName instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableOvernightIndex);
    assertEquals("0001-01-02", actualOfResult.getMaturityDate().toString());
    assertEquals("0001-01-02", actualOfResult.getPublicationDate().toString());
    Currency currency = actualOfResult.getCurrency();
    assertSame(
        currency.getTriangulationCurrency().getTriangulationCurrency(),
        currency.getTriangulationCurrency().getTriangulationCurrency());
    assertSame(currency, index.getCurrency());
    assertSame(currency, floatingRateName.getCurrency());
    assertSame(fixingDate, actualOfResult.getEffectiveDate());
    assertSame(fixingDate, actualOfResult.getFixingDate());
    assertSame(index, floatingRateName.toFloatingRateIndex());
  }

  /**
   * Test {@link OvernightIndexObservation#getCurrency()}.
   *
   * <p>Method under test: {@link OvernightIndexObservation#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency OvernightIndexObservation.getCurrency()"})
  void testGetCurrency() {
    // Arrange
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();

    // Act
    Currency actualCurrency = overnightIndexObservation.getCurrency();

    // Assert
    OvernightIndex index = overnightIndexObservation.getIndex();
    assertTrue(index instanceof ImmutableOvernightIndex);
    Currency currency = Currency.AUD;
    assertSame(currency, index.getCurrency());
    assertSame(currency, actualCurrency);
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}, and {@link
   * OvernightIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightIndexObservation#equals(Object)}
   *   <li>{@link OvernightIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();
    OvernightIndexObservation overnightIndexObservation2 =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();

    // Act and Assert
    assertEquals(overnightIndexObservation, overnightIndexObservation2);
    assertEquals(overnightIndexObservation.hashCode(), overnightIndexObservation2.hashCode());
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}, and {@link
   * OvernightIndexObservation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightIndexObservation#equals(Object)}
   *   <li>{@link OvernightIndexObservation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();

    // Act and Assert
    assertEquals(overnightIndexObservation, overnightIndexObservation);
    int expectedHashCodeResult = overnightIndexObservation.hashCode();
    assertEquals(expectedHashCodeResult, overnightIndexObservation.hashCode());
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.now())
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        overnightIndexObservation,
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build());
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.BRL_CDI)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build();

    // Act and Assert
    assertNotEquals(
        overnightIndexObservation,
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build());
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build(),
        null);
  }

  /**
   * Test {@link OvernightIndexObservation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightIndexObservation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightIndexObservation.equals(Object)",
    "int OvernightIndexObservation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build(),
        "Different type to OvernightIndexObservation");
  }

  /**
   * Test {@link OvernightIndexObservation#meta()}.
   *
   * <p>Method under test: {@link OvernightIndexObservation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta OvernightIndexObservation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = OvernightIndexObservation.meta();

    // Assert
    assertTrue(actualMetaResult.effectiveDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.maturityDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.publicationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link OvernightIndexObservation#metaBean()}.
   *
   * <p>Method under test: {@link OvernightIndexObservation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta OvernightIndexObservation.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build()
            .metaBean());
  }

  /**
   * Test {@link OvernightIndexObservation#getIndex()}.
   *
   * <p>Method under test: {@link OvernightIndexObservation#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OvernightIndex OvernightIndexObservation.getIndex()"})
  void testGetIndex() {
    // Arrange and Act
    OvernightIndex actualIndex =
        OvernightIndexObservation.builder()
            .effectiveDate(LocalDate.of(1970, 1, 1))
            .fixingDate(LocalDate.of(1970, 1, 1))
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(LocalDate.of(1970, 1, 1))
            .publicationDate(LocalDate.of(1970, 1, 1))
            .yearFraction(10.0d)
            .build()
            .getIndex();

    // Assert
    assertTrue(actualIndex.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(actualIndex instanceof ImmutableOvernightIndex);
    assertEquals("AUD-AONIA", actualIndex.getName());
    assertEquals(0, actualIndex.getEffectiveDateOffset());
    assertEquals(0, actualIndex.getPublicationDateOffset());
    assertTrue(actualIndex.isActive());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightIndexObservation#toString()}
   *   <li>{@link OvernightIndexObservation#getEffectiveDate()}
   *   <li>{@link OvernightIndexObservation#getFixingDate()}
   *   <li>{@link OvernightIndexObservation#getMaturityDate()}
   *   <li>{@link OvernightIndexObservation#getPublicationDate()}
   *   <li>{@link OvernightIndexObservation#getYearFraction()}
   *   <li>{@link OvernightIndexObservation#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate OvernightIndexObservation.getEffectiveDate()",
    "LocalDate OvernightIndexObservation.getFixingDate()",
    "LocalDate OvernightIndexObservation.getMaturityDate()",
    "LocalDate OvernightIndexObservation.getPublicationDate()",
    "double OvernightIndexObservation.getYearFraction()",
    "Builder OvernightIndexObservation.toBuilder()",
    "String OvernightIndexObservation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate effectiveDate = LocalDate.of(1970, 1, 1);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);
    LocalDate maturityDate = LocalDate.of(1970, 1, 1);
    LocalDate publicationDate = LocalDate.of(1970, 1, 1);
    OvernightIndexObservation overnightIndexObservation =
        OvernightIndexObservation.builder()
            .effectiveDate(effectiveDate)
            .fixingDate(fixingDate)
            .index(OvernightIndices.AUD_AONIA)
            .maturityDate(maturityDate)
            .publicationDate(publicationDate)
            .yearFraction(10.0d)
            .build();

    // Act
    String actualToStringResult = overnightIndexObservation.toString();
    LocalDate actualEffectiveDate = overnightIndexObservation.getEffectiveDate();
    LocalDate actualFixingDate = overnightIndexObservation.getFixingDate();
    LocalDate actualMaturityDate = overnightIndexObservation.getMaturityDate();
    LocalDate actualPublicationDate = overnightIndexObservation.getPublicationDate();
    double actualYearFraction = overnightIndexObservation.getYearFraction();
    overnightIndexObservation.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualEffectiveDate.toString());
    assertEquals("1970-01-01", actualFixingDate.toString());
    assertEquals("1970-01-01", actualMaturityDate.toString());
    assertEquals("1970-01-01", actualPublicationDate.toString());
    assertEquals("OvernightIndexObservation[AUD-AONIA on 1970-01-01]", actualToStringResult);
    assertEquals(10.0d, actualYearFraction);
    assertSame(effectiveDate, actualEffectiveDate);
    assertSame(fixingDate, actualFixingDate);
    assertSame(maturityDate, actualMaturityDate);
    assertSame(publicationDate, actualPublicationDate);
  }
}
