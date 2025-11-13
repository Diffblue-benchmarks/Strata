package com.opengamma.strata.market.sensitivity;

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
import com.opengamma.strata.market.sensitivity.PointSensitivities.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PointSensitivitiesDiffblueTest {
  /**
   * Test {@link PointSensitivities#empty()}.
   *
   * <p>Method under test: {@link PointSensitivities#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.empty()"})
  void testEmpty() {
    // Arrange and Act
    PointSensitivities actualEmptyResult = PointSensitivities.empty();

    // Assert
    MutablePointSensitivities toMutableResult = actualEmptyResult.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, actualEmptyResult.size());
    ImmutableList<PointSensitivity> sensitivities = actualEmptyResult.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
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
    Class<? extends PointSensitivities> actualBeanTypeResult = PointSensitivities.meta().beanType();

    // Assert
    Class<PointSensitivities> expectedBeanTypeResult = PointSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(PointSensitivities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivities'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivities_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PointSensitivities.meta().metaPropertyGet("sensitivities");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<PointSensitivities> expectedDeclaringTypeResult = PointSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        PointSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("sensitivities");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<PointSensitivities> expectedDeclaringTypeResult = PointSensitivities.class;
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
    assertNull(PointSensitivities.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when empty; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenReturnList() {
    // Arrange
    Meta metaResult = PointSensitivities.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(PointSensitivities.empty(), "sensitivities", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = PointSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(PointSensitivities.empty(), "Property Name", false));
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
            PointSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", false));
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
            PointSensitivities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PointSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#sensitivities()}.
   *
   * <p>Method under test: {@link Meta#sensitivities()}
   */
  @Test
  @DisplayName("Test Meta sensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.sensitivities()"})
  void testMetaSensitivities() {
    // Arrange, Act and Assert
    assertTrue(PointSensitivities.meta().sensitivities() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link PointSensitivities#of(List)} with {@code sensitivities}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return toMutable size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'sensitivities'; when ArrayList(); then return toMutable size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.of(List)"})
  void testOfWithSensitivities_whenArrayList_thenReturnToMutableSizeIsZero() {
    // Arrange
    ArrayList<PointSensitivity> sensitivities = new ArrayList<>();

    // Act
    PointSensitivities actualOfResult = PointSensitivities.of(sensitivities);

    // Assert
    MutablePointSensitivities toMutableResult = actualOfResult.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, actualOfResult.size());
    ImmutableList<PointSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(sensitivities, sensitivities2);
    assertSame(sensitivities2, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link PointSensitivities#of(PointSensitivity[])} with {@code sensitivity}.
   *
   * <ul>
   *   <li>Then return toMutable size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#of(PointSensitivity[])}
   */
  @Test
  @DisplayName("Test of(PointSensitivity[]) with 'sensitivity'; then return toMutable size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.of(PointSensitivity[])"})
  void testOfWithSensitivity_thenReturnToMutableSizeIsZero() {
    // Arrange and Act
    PointSensitivities actualOfResult = PointSensitivities.of();

    // Assert
    MutablePointSensitivities toMutableResult = actualOfResult.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, actualOfResult.size());
    ImmutableList<PointSensitivity> sensitivities = actualOfResult.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link PointSensitivities#size()}.
   *
   * <p>Method under test: {@link PointSensitivities#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int PointSensitivities.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, PointSensitivities.empty().size());
  }

  /**
   * Test {@link PointSensitivities#combinedWith(PointSensitivities)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#combinedWith(PointSensitivities)}
   */
  @Test
  @DisplayName("Test combinedWith(PointSensitivities); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.combinedWith(PointSensitivities)"})
  void testCombinedWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();
    PointSensitivities other = PointSensitivities.empty();

    // Act
    PointSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PointSensitivities#multipliedBy(double)}.
   *
   * <p>Method under test: {@link PointSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.multipliedBy(double)"})
  void testMultipliedBy() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act
    PointSensitivities actualMultipliedByResult = emptyResult.multipliedBy(10.0d);

    // Assert
    assertEquals(emptyResult, actualMultipliedByResult);
  }

  /**
   * Test {@link PointSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link PointSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.mapSensitivities(DoubleUnaryOperator)"})
  void testMapSensitivities() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act
    PointSensitivities actualMapSensitivitiesResult =
        emptyResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link PointSensitivities#normalized()}.
   *
   * <p>Method under test: {@link PointSensitivities#normalized()}
   */
  @Test
  @DisplayName("Test normalized()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.normalized()"})
  void testNormalized() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act
    PointSensitivities actualNormalizedResult = emptyResult.normalized();

    // Assert
    assertSame(emptyResult, actualNormalizedResult);
  }

  /**
   * Test {@link PointSensitivities#toMutable()}.
   *
   * <p>Method under test: {@link PointSensitivities#toMutable()}
   */
  @Test
  @DisplayName("Test toMutable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MutablePointSensitivities PointSensitivities.toMutable()"})
  void testToMutable() {
    // Arrange and Act
    MutablePointSensitivities actualToMutableResult = PointSensitivities.empty().toMutable();

    // Assert
    assertEquals(0, actualToMutableResult.size());
    assertTrue(actualToMutableResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link PointSensitivities#equalWithTolerance(PointSensitivities, double)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#equalWithTolerance(PointSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(PointSensitivities, double); when empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointSensitivities.equalWithTolerance(PointSensitivities, double)"})
  void testEqualWithTolerance_whenEmpty_thenReturnTrue() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act and Assert
    assertTrue(emptyResult.equalWithTolerance(PointSensitivities.empty(), 10.0d));
  }

  /**
   * Test {@link PointSensitivities#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link PointSensitivities#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointSensitivities PointSensitivities.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act
    PointSensitivities actualConvertedToResult =
        emptyResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(emptyResult, actualConvertedToResult);
  }

  /**
   * Test {@link PointSensitivities#meta()}.
   *
   * <p>Method under test: {@link PointSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PointSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PointSensitivities.meta();

    // Assert
    MetaProperty<ImmutableList<PointSensitivity>> sensitivitiesResult =
        actualMetaResult.sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<PointSensitivities> expectedDeclaringTypeResult = PointSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    assertSame(Meta.INSTANCE, sensitivitiesResult.metaBean());
  }

  /**
   * Test {@link PointSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link PointSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PointSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, PointSensitivities.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointSensitivities#toString()}
   *   <li>{@link PointSensitivities#getSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList PointSensitivities.getSensitivities()",
    "String PointSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("PointSensitivities{sensitivities=[]}", actualToStringResult);
    assertTrue(emptyResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}, and {@link PointSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointSensitivities#equals(Object)}
   *   <li>{@link PointSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();
    PointSensitivities emptyResult2 = PointSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}, and {@link PointSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointSensitivities#equals(Object)}
   *   <li>{@link PointSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PointSensitivities ofResult = PointSensitivities.of(new ArrayList<>());
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}, and {@link PointSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointSensitivities#equals(Object)}
   *   <li>{@link PointSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PointSensitivities emptyResult = PointSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PointSensitivities ofResult = PointSensitivities.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PointSensitivities.empty(), null);
  }

  /**
   * Test {@link PointSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PointSensitivities.equals(Object)",
    "int PointSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PointSensitivities.empty(), "Different type to PointSensitivities");
  }
}
