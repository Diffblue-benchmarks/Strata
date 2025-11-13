package com.opengamma.strata.pricer.fx;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.pricer.fx.ForwardFxIndexRates.Meta;
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

class ForwardFxIndexRatesDiffblueTest {
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
    Class<? extends ForwardFxIndexRates> actualBeanTypeResult =
        ForwardFxIndexRates.meta().beanType();

    // Assert
    Class<ForwardFxIndexRates> expectedBeanTypeResult = ForwardFxIndexRates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixings()}
   *   <li>{@link Meta#fxForwardRates()}
   *   <li>{@link Meta#index()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.fixings()",
    "MetaProperty Meta.fxForwardRates()",
    "MetaProperty Meta.index()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ForwardFxIndexRates.meta();

    // Act
    MetaProperty<LocalDateDoubleTimeSeries> actualFixingsResult = metaResult.fixings();
    MetaProperty<FxForwardRates> actualFxForwardRatesResult = metaResult.fxForwardRates();

    // Assert
    assertTrue(actualFixingsResult instanceof DirectMetaProperty);
    assertTrue(actualFxForwardRatesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.index() instanceof DirectMetaProperty);
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
        ForwardFxIndexRates.meta().metaPropertyGet("fixings");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FxForwardRates> fxForwardRatesResult = ((Meta) metaBeanResult).fxForwardRates();
    assertTrue(fxForwardRatesResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixings", actualMetaPropertyGetResult.name());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixings());
    assertSame(metaBeanResult, fxForwardRatesResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fxForwardRates}.
   *   <li>Then return name is {@code fxForwardRates}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fxForwardRates'; then return name is 'fxForwardRates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFxForwardRates_thenReturnNameIsFxForwardRates() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ForwardFxIndexRates.meta().metaPropertyGet("fxForwardRates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = ((Meta) metaBeanResult).fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fxForwardRates", actualMetaPropertyGetResult.name());
    Class<FxForwardRates> expectedPropertyTypeResult = FxForwardRates.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fxForwardRates());
    assertSame(metaBeanResult, fixingsResult.metaBean());
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
        ForwardFxIndexRates.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = ((Meta) metaBeanResult).fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    MetaProperty<FxForwardRates> fxForwardRatesResult = ((Meta) metaBeanResult).fxForwardRates();
    assertTrue(fxForwardRatesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, fixingsResult.metaBean());
    assertSame(metaBeanResult, fxForwardRatesResult.metaBean());
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
    assertNull(ForwardFxIndexRates.meta().metaPropertyGet("Property Name"));
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
        ForwardFxIndexRates.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("index");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("fixings");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("fxForwardRates");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("fixings", getResult2.name());
    assertEquals("fxForwardRates", getResult3.name());
    assertEquals("index", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult2 = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult2 = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult3 = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<FxForwardRates> expectedPropertyTypeResult3 = FxForwardRates.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
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
    assertNull(ForwardFxIndexRates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ForwardFxIndexRates.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            ForwardFxIndexRates.meta()
                .propertySet(mock(Bean.class), "fixings", "New Value", false));
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
            ForwardFxIndexRates.meta().propertySet(mock(Bean.class), "fixings", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fxForwardRates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fxForwardRates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFxForwardRates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ForwardFxIndexRates.meta()
                .propertySet(mock(Bean.class), "fxForwardRates", "New Value", true));
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
        () -> ForwardFxIndexRates.meta().propertySet(mock(Bean.class), "index", "New Value", true));
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
            ForwardFxIndexRates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates)} with {@code index}, {@code
   * fxForwardRates}.
   *
   * <p>Method under test: {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates)}
   */
  @Test
  @DisplayName("Test of(FxIndex, FxForwardRates) with 'index', 'fxForwardRates'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ForwardFxIndexRates ForwardFxIndexRates.of(FxIndex, FxForwardRates)"})
  void testOfWithIndexFxForwardRates() {
    // Arrange
    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ForwardFxIndexRates.of(index, mock(FxForwardRates.class)));
    verify(index).getCurrencyPair();
  }

  /**
   * Test {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries)} with
   * {@code index}, {@code fxForwardRates}, {@code fixings}.
   *
   * <p>Method under test: {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries) with 'index', 'fxForwardRates', 'fixings'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ForwardFxIndexRates ForwardFxIndexRates.of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries)"
  })
  void testOfWithIndexFxForwardRatesFixings() {
    // Arrange
    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ForwardFxIndexRates.of(
                index, mock(FxForwardRates.class), mock(LocalDateDoubleTimeSeries.class)));
    verify(index).getCurrencyPair();
  }

  /**
   * Test {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries)} with
   * {@code index}, {@code fxForwardRates}, {@code fixings}.
   *
   * <ul>
   *   <li>Then calls {@link FxForwardRates#getCurrencyPair()}.
   * </ul>
   *
   * <p>Method under test: {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries) with 'index', 'fxForwardRates', 'fixings'; then calls getCurrencyPair()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ForwardFxIndexRates ForwardFxIndexRates.of(FxIndex, FxForwardRates, LocalDateDoubleTimeSeries)"
  })
  void testOfWithIndexFxForwardRatesFixings_thenCallsGetCurrencyPair() {
    // Arrange
    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenReturn(null);

    FxForwardRates fxForwardRates = mock(FxForwardRates.class);
    when(fxForwardRates.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ForwardFxIndexRates.of(index, fxForwardRates, mock(LocalDateDoubleTimeSeries.class)));
    verify(index).getCurrencyPair();
    verify(fxForwardRates).getCurrencyPair();
  }

  /**
   * Test {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates)} with {@code index}, {@code
   * fxForwardRates}.
   *
   * <ul>
   *   <li>Then calls {@link FxForwardRates#getCurrencyPair()}.
   * </ul>
   *
   * <p>Method under test: {@link ForwardFxIndexRates#of(FxIndex, FxForwardRates)}
   */
  @Test
  @DisplayName(
      "Test of(FxIndex, FxForwardRates) with 'index', 'fxForwardRates'; then calls getCurrencyPair()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ForwardFxIndexRates ForwardFxIndexRates.of(FxIndex, FxForwardRates)"})
  void testOfWithIndexFxForwardRates_thenCallsGetCurrencyPair() {
    // Arrange
    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenReturn(null);

    FxForwardRates fxForwardRates = mock(FxForwardRates.class);
    when(fxForwardRates.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ForwardFxIndexRates.of(index, fxForwardRates));
    verify(index).getCurrencyPair();
    verify(fxForwardRates).getCurrencyPair();
  }

  /**
   * Test {@link ForwardFxIndexRates#meta()}.
   *
   * <p>Method under test: {@link ForwardFxIndexRates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ForwardFxIndexRates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ForwardFxIndexRates.meta();

    // Assert
    MetaProperty<LocalDateDoubleTimeSeries> fixingsResult = actualMetaResult.fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    MetaProperty<FxForwardRates> fxForwardRatesResult = actualMetaResult.fxForwardRates();
    assertTrue(fxForwardRatesResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = actualMetaResult.index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertEquals("fixings", fixingsResult.name());
    assertEquals("fxForwardRates", fxForwardRatesResult.name());
    assertEquals("index", indexResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixingsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, fxForwardRatesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, indexResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, indexResult.propertyType());
    Class<LocalDateDoubleTimeSeries> expectedPropertyTypeResult2 = LocalDateDoubleTimeSeries.class;
    assertEquals(expectedPropertyTypeResult2, fixingsResult.propertyType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult, fixingsResult.declaringType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult2 = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult2, fxForwardRatesResult.declaringType());
    Class<ForwardFxIndexRates> expectedDeclaringTypeResult3 = ForwardFxIndexRates.class;
    assertEquals(expectedDeclaringTypeResult3, indexResult.declaringType());
    Class<FxForwardRates> expectedPropertyTypeResult3 = FxForwardRates.class;
    assertEquals(expectedPropertyTypeResult3, fxForwardRatesResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, fixingsResult.metaBean());
    assertSame(meta, fxForwardRatesResult.metaBean());
    assertSame(meta, indexResult.metaBean());
  }
}
