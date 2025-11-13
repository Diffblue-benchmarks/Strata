package com.opengamma.strata.product.rate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.IborIndexObservation;
import com.opengamma.strata.product.rate.IborRateComputation.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborRateComputationDiffblueTest {
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
    Class<? extends IborRateComputation> actualBeanTypeResult =
        IborRateComputation.meta().beanType();

    // Assert
    Class<IborRateComputation> expectedBeanTypeResult = IborRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code observation}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'observation'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenObservation_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateComputation.meta().metaPropertyGet("observation");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("observation", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<IborRateComputation> expectedDeclaringTypeResult = IborRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(IborRateComputation.meta().metaPropertyGet("Property Name"));
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
        IborRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("observation");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("observation", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<IborRateComputation> expectedDeclaringTypeResult = IborRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#observation()}.
   *
   * <p>Method under test: {@link Meta#observation()}
   */
  @Test
  @DisplayName("Test Meta observation()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.observation()"})
  void testMetaObservation() {
    // Arrange, Act and Assert
    assertTrue(IborRateComputation.meta().observation() instanceof DirectMetaProperty);
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
    assertNull(IborRateComputation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> IborRateComputation.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            IborRateComputation.meta()
                .propertySet(mock(Bean.class), "observation", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code observation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'observation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenObservation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateComputation.meta()
                .propertySet(mock(Bean.class), "observation", "New Value", true));
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
            IborRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link IborRateComputation#of(IborIndex, LocalDate, ReferenceData)} with {@code index},
   * {@code fixingDate}, {@code refData}.
   *
   * <ul>
   *   <li>Then return Observation Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateComputation#of(IborIndex, LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, LocalDate, ReferenceData) with 'index', 'fixingDate', 'refData'; then return Observation Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborRateComputation IborRateComputation.of(IborIndex, LocalDate, ReferenceData)"
  })
  void testOfWithIndexFixingDateRefData_thenReturnObservationCurrencyIsNull() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex index = mock(IborIndex.class);
    when(index.getDayCount()).thenReturn(dayCount);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(index.calculateEffectiveFromFixing(Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    LocalDate ofResult2 = LocalDate.of(1970, 1, 1);
    when(index.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult2);
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    // Act
    IborRateComputation actualOfResult =
        IborRateComputation.of(index, fixingDate, mock(ReferenceData.class));

    // Assert
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(index).getDayCount();
    verify(index).calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(index).calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    IborIndexObservation observation = actualOfResult.getObservation();
    assertNull(observation.getCurrency());
    assertNull(actualOfResult.getCurrency());
    assertEquals(10.0d, observation.getYearFraction());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    assertSame(ofResult, observation.getEffectiveDate());
    assertSame(fixingDate, observation.getFixingDate());
    assertSame(ofResult2, observation.getMaturityDate());
    assertSame(ofResult, actualOfResult.getEffectiveDate());
    assertSame(fixingDate, actualOfResult.getFixingDate());
    assertSame(ofResult2, actualOfResult.getMaturityDate());
    assertSame(index, observation.getIndex());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link IborRateComputation#meta()}.
   *
   * <p>Method under test: {@link IborRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborRateComputation.meta();

    // Assert
    MetaProperty<IborIndexObservation> observationResult = actualMetaResult.observation();
    assertTrue(observationResult instanceof DirectMetaProperty);
    assertEquals("observation", observationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, observationResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<IborIndexObservation> expectedPropertyTypeResult = IborIndexObservation.class;
    assertEquals(expectedPropertyTypeResult, observationResult.propertyType());
    Class<IborRateComputation> expectedDeclaringTypeResult = IborRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, observationResult.declaringType());
    assertSame(Meta.INSTANCE, observationResult.metaBean());
  }
}
