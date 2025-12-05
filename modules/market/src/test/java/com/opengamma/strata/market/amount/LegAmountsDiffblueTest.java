package com.opengamma.strata.market.amount;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.market.amount.LegAmounts.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegAmountsDiffblueTest {
  /**
   * Test Meta {@link Meta#amounts()}.
   *
   * <p>Method under test: {@link Meta#amounts()}
   */
  @Test
  @DisplayName("Test Meta amounts()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.amounts()"})
  void testMetaAmounts() {
    // Arrange, Act and Assert
    assertTrue(LegAmounts.meta().amounts() instanceof DirectMetaProperty);
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
    Class<? extends LegAmounts> actualBeanTypeResult = LegAmounts.meta().beanType();

    // Assert
    Class<LegAmounts> expectedBeanTypeResult = LegAmounts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'amounts'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAmounts_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = LegAmounts.meta().metaPropertyGet("amounts");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("amounts", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<LegAmounts> expectedDeclaringTypeResult = LegAmounts.class;
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
    assertNull(LegAmounts.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = LegAmounts.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("amounts");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("amounts", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<LegAmounts> expectedDeclaringTypeResult = LegAmounts.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    assertNull(LegAmounts.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Meta metaResult = LegAmounts.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(LegAmounts.of(new ArrayList<>()), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link LegAmounts} with amounts is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when LegAmounts with amounts is ArrayList(); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLegAmountsWithAmountsIsArrayList_thenReturnList() {
    // Arrange
    Meta metaResult = LegAmounts.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(LegAmounts.of(new ArrayList<>()), "amounts", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'amounts'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAmounts_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> LegAmounts.meta().propertySet(mock(Bean.class), "amounts", "New Value", true));
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
        () -> LegAmounts.meta().propertySet(mock(Bean.class), "amounts", "New Value", false));
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
        () -> LegAmounts.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link LegAmounts#of(LegAmount[])} with {@code LegAmount[]}.
   *
   * <ul>
   *   <li>Then return Amounts Empty.
   * </ul>
   *
   * <p>Method under test: {@link LegAmounts#of(LegAmount[])}
   */
  @Test
  @DisplayName("Test of(LegAmount[]) with 'LegAmount[]'; then return Amounts Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegAmounts LegAmounts.of(LegAmount[])"})
  void testOfWithLegAmount_thenReturnAmountsEmpty() {
    // Arrange, Act and Assert
    assertTrue(LegAmounts.of().getAmounts().isEmpty());
  }

  /**
   * Test {@link LegAmounts#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Amounts is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link LegAmounts#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Amounts is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegAmounts LegAmounts.of(List)"})
  void testOfWithList_whenArrayList_thenReturnAmountsIsArrayList() {
    // Arrange
    ArrayList<LegAmount> amounts = new ArrayList<>();

    // Act
    LegAmounts actualOfResult = LegAmounts.of(amounts);

    // Assert
    assertEquals(amounts, actualOfResult.getAmounts());
  }

  /**
   * Test {@link LegAmounts#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link LegAmounts#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegAmounts LegAmounts.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act
    LegAmounts actualConvertedToResult = ofResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link LegAmounts#meta()}.
   *
   * <p>Method under test: {@link LegAmounts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegAmounts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LegAmounts.meta();

    // Assert
    MetaProperty<ImmutableList<LegAmount>> amountsResult = actualMetaResult.amounts();
    assertTrue(amountsResult instanceof DirectMetaProperty);
    assertEquals("amounts", amountsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, amountsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, amountsResult.propertyType());
    Class<LegAmounts> expectedDeclaringTypeResult = LegAmounts.class;
    assertEquals(expectedDeclaringTypeResult, amountsResult.declaringType());
    assertSame(Meta.INSTANCE, amountsResult.metaBean());
  }

  /**
   * Test {@link LegAmounts#metaBean()}.
   *
   * <p>Method under test: {@link LegAmounts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegAmounts.metaBean()"})
  void testMetaBean() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegAmounts#toString()}
   *   <li>{@link LegAmounts#getAmounts()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList LegAmounts.getAmounts()", "String LegAmounts.toString()"})
  void testGettersAndSetters() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("LegAmounts{amounts=[]}", actualToStringResult);
    assertTrue(ofResult.getAmounts().isEmpty());
  }

  /**
   * Test {@link LegAmounts#equals(Object)}, and {@link LegAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegAmounts#equals(Object)}
   *   <li>{@link LegAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LegAmounts.equals(Object)", "int LegAmounts.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());
    LegAmounts ofResult2 = LegAmounts.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LegAmounts#equals(Object)}, and {@link LegAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegAmounts#equals(Object)}
   *   <li>{@link LegAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LegAmounts.equals(Object)", "int LegAmounts.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LegAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LegAmounts.equals(Object)", "int LegAmounts.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link LegAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LegAmounts.equals(Object)", "int LegAmounts.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LegAmounts ofResult = LegAmounts.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to LegAmounts");
  }
}
