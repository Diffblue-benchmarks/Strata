package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.pricer.credit.ConstantRecoveryRates.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ConstantRecoveryRatesDiffblueTest {
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
    Class<? extends ConstantRecoveryRates> actualBeanTypeResult =
        ConstantRecoveryRates.meta().beanType();

    // Assert
    Class<ConstantRecoveryRates> expectedBeanTypeResult = ConstantRecoveryRates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#legalEntityId()}
   *   <li>{@link Meta#recoveryRate()}
   *   <li>{@link Meta#valuationDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.legalEntityId()",
    "MetaProperty Meta.recoveryRate()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ConstantRecoveryRates.meta();

    // Act
    MetaProperty<StandardId> actualLegalEntityIdResult = metaResult.legalEntityId();
    MetaProperty<Double> actualRecoveryRateResult = metaResult.recoveryRate();

    // Assert
    assertTrue(actualLegalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualRecoveryRateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code legalEntityId}.
   *   <li>Then return name is {@code legalEntityId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'legalEntityId'; then return name is 'legalEntityId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLegalEntityId_thenReturnNameIsLegalEntityId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantRecoveryRates.meta().metaPropertyGet("legalEntityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> recoveryRateResult = ((Meta) metaBeanResult).recoveryRate();
    assertTrue(recoveryRateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", actualMetaPropertyGetResult.name());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityId());
    assertSame(metaBeanResult, recoveryRateResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
    assertNull(ConstantRecoveryRates.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code recoveryRate}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'recoveryRate'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRecoveryRate_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantRecoveryRates.meta().metaPropertyGet("recoveryRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> legalEntityIdResult = ((Meta) metaBeanResult).legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("recoveryRate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).recoveryRate());
    assertSame(metaBeanResult, legalEntityIdResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantRecoveryRates.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> legalEntityIdResult = ((Meta) metaBeanResult).legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> recoveryRateResult = ((Meta) metaBeanResult).recoveryRate();
    assertTrue(recoveryRateResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, legalEntityIdResult.metaBean());
    assertSame(metaBeanResult, recoveryRateResult.metaBean());
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
        ConstantRecoveryRates.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("legalEntityId");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("recoveryRate");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valuationDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("legalEntityId", getResult.name());
    assertEquals("recoveryRate", getResult2.name());
    assertEquals("valuationDate", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult2 = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult3 = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    assertNull(ConstantRecoveryRates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ConstantRecoveryRates.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            ConstantRecoveryRates.meta()
                .propertySet(mock(Bean.class), "legalEntityId", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code legalEntityId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'legalEntityId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLegalEntityId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantRecoveryRates.meta()
                .propertySet(mock(Bean.class), "legalEntityId", "New Value", true));
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
            ConstantRecoveryRates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code recoveryRate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'recoveryRate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRecoveryRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantRecoveryRates.meta()
                .propertySet(mock(Bean.class), "recoveryRate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantRecoveryRates.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test {@link ConstantRecoveryRates#of(StandardId, LocalDate, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#of(StandardId, LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, double); when one; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ConstantRecoveryRates ConstantRecoveryRates.of(StandardId, LocalDate, double)"
  })
  void testOf_whenOne_thenReturnParameterCountIsOne() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    ConstantRecoveryRates actualOfResult =
        ConstantRecoveryRates.of(legalEntityId, valuationDate, 1.0d);

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(1.0d, actualOfResult.getRecoveryRate());
    assertSame(legalEntityId, actualOfResult.getLegalEntityId());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link ConstantRecoveryRates#recoveryRate(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#recoveryRate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test recoveryRate(LocalDate); given StandardId with 'Scheme' and value is '42'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantRecoveryRates.recoveryRate(LocalDate)"})
  void testRecoveryRate_givenStandardIdWithSchemeAndValueIs42_thenReturnOne() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.recoveryRate(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link ConstantRecoveryRates#findData(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#findData(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findData(MarketDataName); given StandardId with 'Scheme' and value is '42'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ConstantRecoveryRates.findData(MarketDataName)"})
  void testFindData_givenStandardIdWithSchemeAndValueIs42_thenReturnNotPresent() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act
    Optional<Object> actualFindDataResult = ofResult.findData(mock(MarketDataName.class));

    // Assert
    assertFalse(actualFindDataResult.isPresent());
  }

  /**
   * Test {@link ConstantRecoveryRates#getParameter(int)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#getParameter(int)}
   */
  @Test
  @DisplayName(
      "Test getParameter(int); given StandardId with 'Scheme' and value is '42'; when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantRecoveryRates.getParameter(int)"})
  void testGetParameter_givenStandardIdWithSchemeAndValueIs42_whenZero_thenReturnOne() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.getParameter(0));
  }

  /**
   * Test {@link ConstantRecoveryRates#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); given StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata ConstantRecoveryRates.getParameterMetadata(int)"})
  void testGetParameterMetadata_givenStandardIdWithSchemeAndValueIs42() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act and Assert
    assertTrue(ofResult.getParameterMetadata(1).propertyNames().isEmpty());
  }

  /**
   * Test {@link ConstantRecoveryRates#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with scheme is {@code 42} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); given StandardId with scheme is '42' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata ConstantRecoveryRates.getParameterMetadata(int)"})
  void testGetParameterMetadata_givenStandardIdWithSchemeIs42AndValueIs42() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("42", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act and Assert
    assertTrue(ofResult.getParameterMetadata(1).propertyNames().isEmpty());
  }

  /**
   * Test {@link ConstantRecoveryRates#withParameter(int, double)}.
   *
   * <p>Method under test: {@link ConstantRecoveryRates#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantRecoveryRates ConstantRecoveryRates.withParameter(int, double)"})
  void testWithParameter() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act
    ConstantRecoveryRates actualWithParameterResult = ofResult.withParameter(0, 1.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link ConstantRecoveryRates#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link ConstantRecoveryRates#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ConstantRecoveryRates ConstantRecoveryRates.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(1.0d);

    // Act
    ConstantRecoveryRates actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(1.0d), isA(ParameterMetadata.class));
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link ConstantRecoveryRates#meta()}.
   *
   * <p>Method under test: {@link ConstantRecoveryRates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantRecoveryRates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ConstantRecoveryRates.meta();

    // Assert
    MetaProperty<StandardId> legalEntityIdResult = actualMetaResult.legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    MetaProperty<Double> recoveryRateResult = actualMetaResult.recoveryRate();
    assertTrue(recoveryRateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = actualMetaResult.valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("double", recoveryRateResult.propertyType().getName());
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals("recoveryRate", recoveryRateResult.name());
    assertEquals("valuationDate", valuationDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, recoveryRateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult2 = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult2, recoveryRateResult.declaringType());
    Class<ConstantRecoveryRates> expectedDeclaringTypeResult3 = ConstantRecoveryRates.class;
    assertEquals(expectedDeclaringTypeResult3, valuationDateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, valuationDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, legalEntityIdResult.metaBean());
    assertSame(meta, recoveryRateResult.metaBean());
    assertSame(meta, valuationDateResult.metaBean());
  }

  /**
   * Test {@link ConstantRecoveryRates#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantRecoveryRates#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantRecoveryRates.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange
    ConstantRecoveryRates ofResult =
        ConstantRecoveryRates.of(StandardId.of("Scheme", "42"), LocalDate.of(1970, 1, 1), 1.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
