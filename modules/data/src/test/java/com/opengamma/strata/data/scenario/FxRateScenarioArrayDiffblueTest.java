package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.scenario.FxRateScenarioArray.Meta;
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

class FxRateScenarioArrayDiffblueTest {
  /**
   * Test {@link FxRateScenarioArray#meta()}.
   *
   * <p>Method under test: {@link FxRateScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxRateScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxRateScenarioArray.meta();

    // Assert
    MetaProperty<CurrencyPair> pairResult = actualMetaResult.pair();
    assertTrue(pairResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> ratesResult = actualMetaResult.rates();
    assertTrue(ratesResult instanceof DirectMetaProperty);
    assertEquals("pair", pairResult.name());
    assertEquals("rates", ratesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, pairResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, ratesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, pairResult.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, ratesResult.propertyType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, pairResult.declaringType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult2 = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult2, ratesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, pairResult.metaBean());
    assertSame(meta, ratesResult.metaBean());
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
    Class<? extends FxRateScenarioArray> actualBeanTypeResult =
        FxRateScenarioArray.meta().beanType();

    // Assert
    Class<FxRateScenarioArray> expectedBeanTypeResult = FxRateScenarioArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#pair()}
   *   <li>{@link Meta#rates()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.pair()", "MetaProperty Meta.rates()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxRateScenarioArray.meta();

    // Act
    MetaProperty<CurrencyPair> actualPairResult = metaResult.pair();

    // Assert
    assertTrue(actualPairResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rates() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code pair}.
   *   <li>Then metaBean rates return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'pair'; then metaBean rates return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPair_thenMetaBeanRatesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxRateScenarioArray.meta().metaPropertyGet("pair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> ratesResult = ((Meta) metaBeanResult).rates();
    assertTrue(ratesResult instanceof DirectMetaProperty);
    assertEquals("pair", actualMetaPropertyGetResult.name());
    assertEquals("rates", ratesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, ratesResult.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, ratesResult.propertyType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, ratesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).pair());
    assertSame(Meta.INSTANCE, ratesResult.metaBean());
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
    assertNull(FxRateScenarioArray.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rates}.
   *   <li>Then metaBean pair return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rates'; then metaBean pair return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRates_thenMetaBeanPairReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxRateScenarioArray.meta().metaPropertyGet("rates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyPair> pairResult = ((Meta) metaBeanResult).pair();
    assertTrue(pairResult instanceof DirectMetaProperty);
    assertEquals("pair", pairResult.name());
    assertEquals("rates", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, pairResult.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, pairResult.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, pairResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rates());
    assertSame(Meta.INSTANCE, pairResult.metaBean());
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
        FxRateScenarioArray.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("pair");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("rates");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("pair", getResult.name());
    assertEquals("rates", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxRateScenarioArray> expectedDeclaringTypeResult2 = FxRateScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(FxRateScenarioArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FxRateScenarioArray.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> FxRateScenarioArray.meta().propertySet(mock(Bean.class), "pair", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code pair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'pair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRateScenarioArray.meta().propertySet(mock(Bean.class), "pair", "New Value", true));
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
            FxRateScenarioArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRateScenarioArray.meta().propertySet(mock(Bean.class), "rates", "New Value", true));
  }
}
