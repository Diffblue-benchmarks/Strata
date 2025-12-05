package com.opengamma.strata.market;

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
import com.opengamma.strata.market.FxRateShifts.Meta;
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

class FxRateShiftsDiffblueTest {
  /**
   * Test {@link FxRateShifts#meta()}.
   *
   * <p>Method under test: {@link FxRateShifts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxRateShifts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxRateShifts.meta();

    // Assert
    MetaProperty<CurrencyPair> currencyPairResult = actualMetaResult.currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountResult = actualMetaResult.shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = actualMetaResult.shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("currencyPair", currencyPairResult.name());
    assertEquals("shiftAmount", shiftAmountResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyPairResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftAmountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, currencyPairResult.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, shiftAmountResult.propertyType());
    Class<FxRateShifts> expectedDeclaringTypeResult = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult, currencyPairResult.declaringType());
    Class<FxRateShifts> expectedDeclaringTypeResult2 = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult2, shiftAmountResult.declaringType());
    Class<FxRateShifts> expectedDeclaringTypeResult3 = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult3, shiftTypeResult.declaringType());
    Class<ShiftType> expectedPropertyTypeResult3 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult3, shiftTypeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyPairResult.metaBean());
    assertSame(meta, shiftAmountResult.metaBean());
    assertSame(meta, shiftTypeResult.metaBean());
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
    Class<? extends FxRateShifts> actualBeanTypeResult = FxRateShifts.meta().beanType();

    // Assert
    Class<FxRateShifts> expectedBeanTypeResult = FxRateShifts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currencyPair()}
   *   <li>{@link Meta#shiftAmount()}
   *   <li>{@link Meta#shiftType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currencyPair()",
    "MetaProperty Meta.shiftAmount()",
    "MetaProperty Meta.shiftType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxRateShifts.meta();

    // Act
    MetaProperty<CurrencyPair> actualCurrencyPairResult = metaResult.currencyPair();
    MetaProperty<DoubleArray> actualShiftAmountResult = metaResult.shiftAmount();

    // Assert
    assertTrue(actualCurrencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualShiftAmountResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shiftType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return name is {@code currencyPair}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currencyPair'; then return name is 'currencyPair'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrencyPair_thenReturnNameIsCurrencyPair() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxRateShifts.meta().metaPropertyGet("currencyPair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("currencyPair", actualMetaPropertyGetResult.name());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencyPair());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
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
    assertNull(FxRateShifts.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then return name is {@code shiftAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftAmount'; then return name is 'shiftAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftAmount_thenReturnNameIsShiftAmount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxRateShifts.meta().metaPropertyGet("shiftAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("shiftAmount", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftAmount());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then return name is {@code shiftType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftType'; then return name is 'shiftType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftType_thenReturnNameIsShiftType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FxRateShifts.meta().metaPropertyGet("shiftType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyPair> currencyPairResult = ((Meta) metaBeanResult).currencyPair();
    assertTrue(currencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    assertEquals("shiftType", actualMetaPropertyGetResult.name());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftType());
    assertSame(metaBeanResult, currencyPairResult.metaBean());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
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
        FxRateShifts.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("shiftType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("currencyPair");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("shiftAmount");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("currencyPair", getResult2.name());
    assertEquals("shiftAmount", getResult3.name());
    assertEquals("shiftType", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<FxRateShifts> expectedDeclaringTypeResult = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<FxRateShifts> expectedDeclaringTypeResult2 = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<FxRateShifts> expectedDeclaringTypeResult3 = FxRateShifts.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<ShiftType> expectedPropertyTypeResult3 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
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
    assertNull(FxRateShifts.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FxRateShifts.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencyPair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencyPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRateShifts.meta().propertySet(mock(Bean.class), "currencyPair", "New Value", true));
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
            FxRateShifts.meta().propertySet(mock(Bean.class), "currencyPair", "New Value", false));
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
            FxRateShifts.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRateShifts.meta().propertySet(mock(Bean.class), "shiftAmount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxRateShifts.meta().propertySet(mock(Bean.class), "shiftType", "New Value", true));
  }
}
