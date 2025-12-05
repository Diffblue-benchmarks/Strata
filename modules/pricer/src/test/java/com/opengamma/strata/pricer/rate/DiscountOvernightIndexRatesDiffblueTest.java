package com.opengamma.strata.pricer.rate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.pricer.DiscountFactors;
import com.opengamma.strata.pricer.rate.DiscountOvernightIndexRates.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DiscountOvernightIndexRatesDiffblueTest {
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
    Class<? extends DiscountOvernightIndexRates> actualBeanTypeResult =
        DiscountOvernightIndexRates.meta().beanType();

    // Assert
    Class<DiscountOvernightIndexRates> expectedBeanTypeResult = DiscountOvernightIndexRates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountFactors()}
   *   <li>{@link Meta#fixings()}
   *   <li>{@link Meta#index()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.discountFactors()",
    "MetaProperty Meta.fixings()",
    "MetaProperty Meta.index()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DiscountOvernightIndexRates.meta();

    // Act
    MetaProperty<DiscountFactors> actualDiscountFactorsResult = metaResult.discountFactors();
    MetaProperty<LocalDateDoubleTimeSeries> actualFixingsResult = metaResult.fixings();

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualFixingsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.index() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code discountFactors}.
   *   <li>Then return name is {@code discountFactors}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discountFactors'; then return name is 'discountFactors'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscountFactors_thenReturnNameIsDiscountFactors() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountOvernightIndexRates.meta().metaPropertyGet("discountFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = ((Meta) metaBeanResult).fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", actualMetaPropertyGetResult.name());
    Class<DiscountFactors> expectedPropertyTypeResult = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountFactors());
    assertSame(metaBeanResult, fixingsResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixings}.
   *   <li>Then return name is {@code fixings}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'fixings'; then return name is 'fixings'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixings_thenReturnNameIsFixings() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DiscountOvernightIndexRates.meta().metaPropertyGet("fixings");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> discountFactorsResult = ((Meta) metaBeanResult).discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixings", actualMetaPropertyGetResult.name());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixings());
    assertSame(metaBeanResult, discountFactorsResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
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
        DiscountOvernightIndexRates.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> discountFactorsResult = ((Meta) metaBeanResult).discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = ((Meta) metaBeanResult).fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<OvernightIndex> expectedPropertyTypeResult = OvernightIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, discountFactorsResult.metaBean());
    assertSame(metaBeanResult, fixingsResult.metaBean());
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
    assertNull(DiscountOvernightIndexRates.meta().metaPropertyGet("Property Name"));
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
        DiscountOvernightIndexRates.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("index");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("discountFactors");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("fixings");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", getResult2.name());
    assertEquals("fixings", getResult3.name());
    assertEquals("index", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<OvernightIndex> expectedPropertyTypeResult = OvernightIndex.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult2 = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult3 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult2 =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult3 =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
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
        DiscountOvernightIndexRates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () ->
            DiscountOvernightIndexRates.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountFactors}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountFactors'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountFactors_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountOvernightIndexRates.meta()
                .propertySet(mock(Bean.class), "discountFactors", "New Value", true));
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
            DiscountOvernightIndexRates.meta()
                .propertySet(mock(Bean.class), "discountFactors", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixings}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixings'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixings_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DiscountOvernightIndexRates.meta()
                .propertySet(mock(Bean.class), "fixings", "New Value", true));
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
            DiscountOvernightIndexRates.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
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
            DiscountOvernightIndexRates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link DiscountOvernightIndexRates#of(OvernightIndex, DiscountFactors,
   * LocalDateDoubleTimeSeries)} with {@code index}, {@code discountFactors}, {@code fixings}.
   *
   * <ul>
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#of(OvernightIndex, DiscountFactors,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, DiscountFactors, LocalDateDoubleTimeSeries) with 'index', 'discountFactors', 'fixings'; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.of(OvernightIndex, DiscountFactors, LocalDateDoubleTimeSeries)"
  })
  void testOfWithIndexDiscountFactorsFixings_thenReturnValuationDateIsNull() {
    // Arrange
    OvernightIndex index = mock(OvernightIndex.class);
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    LocalDateDoubleTimeSeries fixings = mock(LocalDateDoubleTimeSeries.class);

    // Act
    DiscountOvernightIndexRates actualOfResult =
        DiscountOvernightIndexRates.of(index, discountFactors, fixings);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertEquals(0, actualOfResult.getParameterCount());
    assertSame(index, actualOfResult.getIndex());
    assertSame(fixings, actualOfResult.getFixings());
    assertSame(discountFactors, actualOfResult.getDiscountFactors());
  }

  /**
   * Test {@link DiscountOvernightIndexRates#of(OvernightIndex, DiscountFactors)} with {@code
   * index}, {@code discountFactors}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#of(OvernightIndex, DiscountFactors)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, DiscountFactors) with 'index', 'discountFactors'; when OvernightIndex; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.of(OvernightIndex, DiscountFactors)"
  })
  void testOfWithIndexDiscountFactors_whenOvernightIndex_thenReturnValuationDateIsNull() {
    // Arrange
    OvernightIndex index = mock(OvernightIndex.class);
    DiscountFactors discountFactors = mock(DiscountFactors.class);

    // Act
    DiscountOvernightIndexRates actualOfResult =
        DiscountOvernightIndexRates.of(index, discountFactors);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertEquals(0, actualOfResult.getParameterCount());
    assertSame(index, actualOfResult.getIndex());
    assertSame(discountFactors, actualOfResult.getDiscountFactors());
  }

  /**
   * Test {@link DiscountOvernightIndexRates#withParameter(int, double)}.
   *
   * <ul>
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.withParameter(int, double)"
  })
  void testWithParameter_thenReturnValuationDateIsNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.withParameter(anyInt(), anyDouble()))
        .thenReturn(mock(DiscountFactors.class));
    DiscountOvernightIndexRates ofResult =
        DiscountOvernightIndexRates.of(
            mock(OvernightIndex.class), discountFactors, mock(LocalDateDoubleTimeSeries.class));

    // Act
    DiscountOvernightIndexRates actualWithParameterResult = ofResult.withParameter(1, 10.0d);

    // Assert
    verify(discountFactors).withParameter(1, 10.0d);
    assertNull(actualWithParameterResult.getValuationDate());
    assertEquals(0, actualWithParameterResult.getParameterCount());
  }

  /**
   * Test {@link DiscountOvernightIndexRates#withParameter(int, double)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.withParameter(int, double)"
  })
  void testWithParameter_thenThrowIllegalArgumentException() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.withParameter(anyInt(), anyDouble()))
        .thenThrow(new IllegalArgumentException());
    DiscountOvernightIndexRates ofResult =
        DiscountOvernightIndexRates.of(
            mock(OvernightIndex.class), discountFactors, mock(LocalDateDoubleTimeSeries.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withParameter(1, 10.0d));
    verify(discountFactors).withParameter(1, 10.0d);
  }

  /**
   * Test {@link DiscountOvernightIndexRates#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountOvernightIndexRates#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation); then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation_thenReturnValuationDateIsNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.withPerturbation(Mockito.<ParameterPerturbation>any()))
        .thenReturn(mock(DiscountFactors.class));
    DiscountOvernightIndexRates ofResult =
        DiscountOvernightIndexRates.of(
            mock(OvernightIndex.class), discountFactors, mock(LocalDateDoubleTimeSeries.class));

    // Act
    DiscountOvernightIndexRates actualWithPerturbationResult =
        ofResult.withPerturbation(mock(ParameterPerturbation.class));

    // Assert
    verify(discountFactors).withPerturbation(isA(ParameterPerturbation.class));
    assertNull(actualWithPerturbationResult.getValuationDate());
    assertEquals(0, actualWithPerturbationResult.getParameterCount());
  }

  /**
   * Test {@link DiscountOvernightIndexRates#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountOvernightIndexRates#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation_thenThrowIllegalArgumentException() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.withPerturbation(Mockito.<ParameterPerturbation>any()))
        .thenThrow(new IllegalArgumentException());
    DiscountOvernightIndexRates ofResult =
        DiscountOvernightIndexRates.of(
            mock(OvernightIndex.class), discountFactors, mock(LocalDateDoubleTimeSeries.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.withPerturbation(mock(ParameterPerturbation.class)));
    verify(discountFactors).withPerturbation(isA(ParameterPerturbation.class));
  }

  /**
   * Test {@link DiscountOvernightIndexRates#withDiscountFactors(DiscountFactors)}.
   *
   * <ul>
   *   <li>When {@link DiscountFactors}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#withDiscountFactors(DiscountFactors)}
   */
  @Test
  @DisplayName(
      "Test withDiscountFactors(DiscountFactors); when DiscountFactors; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountOvernightIndexRates DiscountOvernightIndexRates.withDiscountFactors(DiscountFactors)"
  })
  void testWithDiscountFactors_whenDiscountFactors_thenReturnValuationDateIsNull() {
    // Arrange
    DiscountOvernightIndexRates ofResult =
        DiscountOvernightIndexRates.of(
            mock(OvernightIndex.class),
            mock(DiscountFactors.class),
            mock(LocalDateDoubleTimeSeries.class));
    DiscountFactors factors = mock(DiscountFactors.class);

    // Act
    DiscountOvernightIndexRates actualWithDiscountFactorsResult =
        ofResult.withDiscountFactors(factors);

    // Assert
    assertNull(actualWithDiscountFactorsResult.getValuationDate());
    assertEquals(0, actualWithDiscountFactorsResult.getParameterCount());
    assertSame(factors, actualWithDiscountFactorsResult.getDiscountFactors());
  }

  /**
   * Test {@link DiscountOvernightIndexRates#meta()}.
   *
   * <p>Method under test: {@link DiscountOvernightIndexRates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DiscountOvernightIndexRates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DiscountOvernightIndexRates.meta();

    // Assert
    MetaProperty<DiscountFactors> discountFactorsResult = actualMetaResult.discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = actualMetaResult.fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    MetaProperty<OvernightIndex> indexResult = actualMetaResult.index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", discountFactorsResult.name());
    assertEquals("fixings", fixingsResult.name());
    assertEquals("index", indexResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountFactorsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, fixingsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<OvernightIndex> expectedPropertyTypeResult = OvernightIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult2 = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult2, fixingsResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult3 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult3, discountFactorsResult.propertyType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult, discountFactorsResult.declaringType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult2 =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult2, fixingsResult.declaringType());
    Class<DiscountOvernightIndexRates> expectedDeclaringTypeResult3 =
        DiscountOvernightIndexRates.class;
    assertEquals(expectedDeclaringTypeResult3, indexResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, discountFactorsResult.metaBean());
    assertSame(meta, fixingsResult.metaBean());
    assertSame(meta, indexResult.metaBean());
  }
}
