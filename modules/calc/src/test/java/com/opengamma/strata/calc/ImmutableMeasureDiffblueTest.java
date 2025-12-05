package com.opengamma.strata.calc;

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
import com.opengamma.strata.calc.ImmutableMeasure.Meta;
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

class ImmutableMeasureDiffblueTest {
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
    Class<? extends ImmutableMeasure> actualBeanTypeResult = ImmutableMeasure.meta().beanType();

    // Assert
    Class<ImmutableMeasure> expectedBeanTypeResult = ImmutableMeasure.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currencyConvertible()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.currencyConvertible()", "MetaProperty Meta.name()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableMeasure.meta();

    // Act
    MetaProperty<Boolean> actualCurrencyConvertibleResult = metaResult.currencyConvertible();

    // Assert
    assertTrue(actualCurrencyConvertibleResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean currencyConvertible return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean currencyConvertible return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCurrencyConvertibleReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ImmutableMeasure.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> currencyConvertibleResult = ((Meta) metaBeanResult).currencyConvertible();
    assertTrue(currencyConvertibleResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("boolean", currencyConvertibleResult.propertyType().getName());
    assertEquals("currencyConvertible", currencyConvertibleResult.name());
    assertEquals("name", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyConvertibleResult.style());
    Class<ImmutableMeasure> expectedDeclaringTypeResult = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult, currencyConvertibleResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(Meta.INSTANCE, currencyConvertibleResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean name return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean name return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanNameReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableMeasure.meta().metaPropertyGet("currencyConvertible");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("currencyConvertible", actualMetaPropertyGetResult.name());
    assertEquals("name", nameResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    Class<ImmutableMeasure> expectedDeclaringTypeResult = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult, nameResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, nameResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencyConvertible());
    assertSame(Meta.INSTANCE, nameResult.metaBean());
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
    assertNull(ImmutableMeasure.meta().metaPropertyGet("Property Name"));
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
        ImmutableMeasure.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("name");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("currencyConvertible");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("boolean", getResult2.propertyType().getName());
    assertEquals("currencyConvertible", getResult2.name());
    assertEquals("name", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMeasure> expectedDeclaringTypeResult = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ImmutableMeasure> expectedDeclaringTypeResult2 = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
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
    assertNull(ImmutableMeasure.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyConvertible}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'currencyConvertible'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrencyConvertible_thenReturnTrue() {
    // Arrange
    Meta metaResult = ImmutableMeasure.meta();

    // Act and Assert
    assertTrue(
        (Boolean) metaResult.propertyGet(ImmutableMeasure.of("Name"), "currencyConvertible", true));
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
    Meta metaResult = ImmutableMeasure.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(ImmutableMeasure.of("Name"), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnName() {
    // Arrange
    Meta metaResult = ImmutableMeasure.meta();

    // Act and Assert
    assertEquals("Name", metaResult.propertyGet(ImmutableMeasure.of("Name"), "name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyConvertible}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencyConvertible'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencyConvertible_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableMeasure.meta()
                .propertySet(mock(Bean.class), "currencyConvertible", "New Value", true));
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
            ImmutableMeasure.meta()
                .propertySet(mock(Bean.class), "currencyConvertible", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ImmutableMeasure.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            ImmutableMeasure.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ImmutableMeasure#of(String, boolean)} with {@code name}, {@code
   * isCurrencyConvertible}.
   *
   * <ul>
   *   <li>When {@code [A-Za-z0-9-]+}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#of(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(String, boolean) with 'name', 'isCurrencyConvertible'; when '[A-Za-z0-9-]+'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMeasure ImmutableMeasure.of(String, boolean)"})
  void testOfWithNameIsCurrencyConvertible_whenAZaZ09_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableMeasure.of("[A-Za-z0-9-]+", true));
  }

  /**
   * Test {@link ImmutableMeasure#of(String, boolean)} with {@code name}, {@code
   * isCurrencyConvertible}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#of(String, boolean)}
   */
  @Test
  @DisplayName(
      "Test of(String, boolean) with 'name', 'isCurrencyConvertible'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMeasure ImmutableMeasure.of(String, boolean)"})
  void testOfWithNameIsCurrencyConvertible_whenName_thenReturnName() {
    // Arrange and Act
    ImmutableMeasure actualOfResult = ImmutableMeasure.of("Name", true);

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertTrue(actualOfResult.isCurrencyConvertible());
  }

  /**
   * Test {@link ImmutableMeasure#of(String)} with {@code name}.
   *
   * <ul>
   *   <li>When {@code [A-Za-z0-9-]+}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'name'; when '[A-Za-z0-9-]+'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMeasure ImmutableMeasure.of(String)"})
  void testOfWithName_whenAZaZ09_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ImmutableMeasure.of("[A-Za-z0-9-]+"));
  }

  /**
   * Test {@link ImmutableMeasure#of(String)} with {@code name}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'name'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMeasure ImmutableMeasure.of(String)"})
  void testOfWithName_whenName_thenReturnName() {
    // Arrange and Act
    ImmutableMeasure actualOfResult = ImmutableMeasure.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertTrue(actualOfResult.isCurrencyConvertible());
  }

  /**
   * Test {@link ImmutableMeasure#meta()}.
   *
   * <p>Method under test: {@link ImmutableMeasure#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableMeasure.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableMeasure.meta();

    // Assert
    MetaProperty<Boolean> currencyConvertibleResult = actualMetaResult.currencyConvertible();
    assertTrue(currencyConvertibleResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = actualMetaResult.name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("boolean", currencyConvertibleResult.propertyType().getName());
    assertEquals("currencyConvertible", currencyConvertibleResult.name());
    assertEquals("name", nameResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyConvertibleResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMeasure> expectedDeclaringTypeResult = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult, currencyConvertibleResult.declaringType());
    Class<ImmutableMeasure> expectedDeclaringTypeResult2 = ImmutableMeasure.class;
    assertEquals(expectedDeclaringTypeResult2, nameResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, nameResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyConvertibleResult.metaBean());
    assertSame(meta, nameResult.metaBean());
  }

  /**
   * Test {@link ImmutableMeasure#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableMeasure#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableMeasure.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ImmutableMeasure.of("Name").metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMeasure#toString()}
   *   <li>{@link ImmutableMeasure#getName()}
   *   <li>{@link ImmutableMeasure#isCurrencyConvertible()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String ImmutableMeasure.getName()",
    "boolean ImmutableMeasure.isCurrencyConvertible()",
    "String ImmutableMeasure.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableMeasure ofResult = ImmutableMeasure.of("Name");

    // Act
    String actualToStringResult = ofResult.toString();
    String actualName = ofResult.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", actualToStringResult);
    assertTrue(ofResult.isCurrencyConvertible());
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}, and {@link ImmutableMeasure#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMeasure#equals(Object)}
   *   <li>{@link ImmutableMeasure#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableMeasure ofResult = ImmutableMeasure.of("Name");
    ImmutableMeasure ofResult2 = ImmutableMeasure.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}, and {@link ImmutableMeasure#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableMeasure#equals(Object)}
   *   <li>{@link ImmutableMeasure#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableMeasure ofResult = ImmutableMeasure.of("Name");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ImmutableMeasure.of("Name"), 1);
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ImmutableMeasure ofResult = ImmutableMeasure.of("42");

    // Act and Assert
    assertNotEquals(ofResult, ImmutableMeasure.of("Name"));
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ImmutableMeasure ofResult = ImmutableMeasure.of("Name", false);

    // Act and Assert
    assertNotEquals(ofResult, ImmutableMeasure.of("Name"));
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ImmutableMeasure.of("Name"), null);
  }

  /**
   * Test {@link ImmutableMeasure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMeasure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableMeasure.equals(Object)", "int ImmutableMeasure.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ImmutableMeasure.of("Name"), "Different type to ImmutableMeasure");
  }
}
