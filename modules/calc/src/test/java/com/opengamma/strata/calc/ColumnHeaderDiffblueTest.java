package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.ColumnHeader.Meta;
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

class ColumnHeaderDiffblueTest {
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
    Class<? extends ColumnHeader> actualBeanTypeResult = ColumnHeader.meta().beanType();

    // Assert
    Class<ColumnHeader> expectedBeanTypeResult = ColumnHeader.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#measure()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.measure()",
    "MetaProperty Meta.name()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ColumnHeader.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<Measure> actualMeasureResult = metaResult.measure();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMeasureResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ColumnHeader.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Measure> measureResult = ((Meta) metaBeanResult).measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, measureResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return name is {@code measure}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'measure'; then return name is 'measure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMeasure_thenReturnNameIsMeasure() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ColumnHeader.meta().metaPropertyGet("measure");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("measure", actualMetaPropertyGetResult.name());
    Class<Measure> expectedPropertyTypeResult = Measure.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).measure());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ColumnHeader.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Measure> measureResult = ((Meta) metaBeanResult).measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<ColumnName> expectedPropertyTypeResult = ColumnName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, measureResult.metaBean());
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
    assertNull(ColumnHeader.meta().metaPropertyGet("Property Name"));
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
        ColumnHeader.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("name");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("currency");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("measure");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("currency", getResult2.name());
    assertEquals("measure", getResult3.name());
    assertEquals("name", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ColumnHeader> expectedDeclaringTypeResult = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ColumnHeader> expectedDeclaringTypeResult2 = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<ColumnHeader> expectedDeclaringTypeResult3 = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<ColumnName> expectedPropertyTypeResult2 = ColumnName.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<Measure> expectedPropertyTypeResult3 = Measure.class;
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
    assertNull(ColumnHeader.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrency_thenReturnNull() {
    // Arrange
    Meta metaResult = ColumnHeader.meta();
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertNull(
        metaResult.propertyGet(
            ColumnHeader.of(name, ImmutableMeasure.of("Name")), "currency", true));
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
    Meta metaResult = ColumnHeader.meta();
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ColumnHeader.of(name, ImmutableMeasure.of("Name")), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then return {@link ImmutableMeasure} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'measure'; then return ImmutableMeasure with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMeasure_thenReturnImmutableMeasureWithName() {
    // Arrange
    Meta metaResult = ColumnHeader.meta();
    ColumnName name = ColumnName.of("Name");
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act and Assert
    assertSame(measure, metaResult.propertyGet(ColumnHeader.of(name, measure), "measure", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link ColumnName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return ColumnName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnColumnNameWithName() {
    // Arrange
    Meta metaResult = ColumnHeader.meta();
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertSame(
        name,
        metaResult.propertyGet(ColumnHeader.of(name, ImmutableMeasure.of("Name")), "name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ColumnHeader.meta().propertySet(mock(Bean.class), "currency", "New Value", true));
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
        () -> ColumnHeader.meta().propertySet(mock(Bean.class), "currency", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code measure}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'measure'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMeasure_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ColumnHeader.meta().propertySet(mock(Bean.class), "measure", "New Value", true));
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
        () -> ColumnHeader.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            ColumnHeader.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ColumnHeader#of(ColumnName, Measure, Currency)} with {@code name}, {@code measure},
   * {@code currency}.
   *
   * <ul>
   *   <li>Then return not Currency Present.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#of(ColumnName, Measure, Currency)}
   */
  @Test
  @DisplayName(
      "Test of(ColumnName, Measure, Currency) with 'name', 'measure', 'currency'; then return not Currency Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnHeader ColumnHeader.of(ColumnName, Measure, Currency)"})
  void testOfWithNameMeasureCurrency_thenReturnNotCurrencyPresent() {
    // Arrange
    ColumnName name = ColumnName.of("Name");
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    ColumnHeader actualOfResult = ColumnHeader.of(name, measure, null);

    // Assert
    assertFalse(actualOfResult.getCurrency().isPresent());
    assertSame(name, actualOfResult.getName());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link ColumnHeader#of(ColumnName, Measure)} with {@code name}, {@code measure}.
   *
   * <ul>
   *   <li>When {@link ColumnName} with {@code Name}.
   *   <li>Then return not Currency Present.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#of(ColumnName, Measure)}
   */
  @Test
  @DisplayName(
      "Test of(ColumnName, Measure) with 'name', 'measure'; when ColumnName with 'Name'; then return not Currency Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ColumnHeader ColumnHeader.of(ColumnName, Measure)"})
  void testOfWithNameMeasure_whenColumnNameWithName_thenReturnNotCurrencyPresent() {
    // Arrange
    ColumnName name = ColumnName.of("Name");
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    // Act
    ColumnHeader actualOfResult = ColumnHeader.of(name, measure);

    // Assert
    assertFalse(actualOfResult.getCurrency().isPresent());
    assertSame(name, actualOfResult.getName());
    assertSame(measure, actualOfResult.getMeasure());
  }

  /**
   * Test {@link ColumnHeader#meta()}.
   *
   * <p>Method under test: {@link ColumnHeader#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ColumnHeader.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ColumnHeader.meta();

    // Assert
    MetaProperty<Currency> currencyResult = actualMetaResult.currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<Measure> measureResult = actualMetaResult.measure();
    assertTrue(measureResult instanceof DirectMetaProperty);
    MetaProperty<ColumnName> nameResult = actualMetaResult.name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("measure", measureResult.name());
    assertEquals("name", nameResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, measureResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<ColumnHeader> expectedDeclaringTypeResult = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<ColumnHeader> expectedDeclaringTypeResult2 = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult2, measureResult.declaringType());
    Class<ColumnHeader> expectedDeclaringTypeResult3 = ColumnHeader.class;
    assertEquals(expectedDeclaringTypeResult3, nameResult.declaringType());
    Class<ColumnName> expectedPropertyTypeResult2 = ColumnName.class;
    assertEquals(expectedPropertyTypeResult2, nameResult.propertyType());
    Class<Measure> expectedPropertyTypeResult3 = Measure.class;
    assertEquals(expectedPropertyTypeResult3, measureResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyResult.metaBean());
    assertSame(meta, measureResult.metaBean());
    assertSame(meta, nameResult.metaBean());
  }

  /**
   * Test {@link ColumnHeader#metaBean()}.
   *
   * <p>Method under test: {@link ColumnHeader#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ColumnHeader.metaBean()"})
  void testMetaBean() {
    // Arrange
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertSame(Meta.INSTANCE, ColumnHeader.of(name, ImmutableMeasure.of("Name")).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ColumnHeader#toString()}
   *   <li>{@link ColumnHeader#getMeasure()}
   *   <li>{@link ColumnHeader#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Measure ColumnHeader.getMeasure()",
    "ColumnName ColumnHeader.getName()",
    "String ColumnHeader.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ColumnName name = ColumnName.of("Name");
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    ColumnHeader ofResult = ColumnHeader.of(name, measure);

    // Act
    String actualToStringResult = ofResult.toString();
    Measure actualMeasure = ofResult.getMeasure();

    // Assert
    assertEquals("ColumnHeader{name=Name, measure=Name, currency=null}", actualToStringResult);
    assertSame(name, ofResult.getName());
    assertSame(measure, actualMeasure);
  }

  /**
   * Test {@link ColumnHeader#getCurrency()}.
   *
   * <p>Method under test: {@link ColumnHeader#getCurrency()}
   */
  @Test
  @DisplayName("Test getCurrency()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ColumnHeader.getCurrency()"})
  void testGetCurrency() {
    // Arrange
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertFalse(ColumnHeader.of(name, ImmutableMeasure.of("Name")).getCurrency().isPresent());
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}, and {@link ColumnHeader#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ColumnHeader#equals(Object)}
   *   <li>{@link ColumnHeader#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ColumnName name = ColumnName.of("Name");
    ColumnHeader ofResult = ColumnHeader.of(name, ImmutableMeasure.of("Name"));
    ColumnName name2 = ColumnName.of("Name");
    ColumnHeader ofResult2 = ColumnHeader.of(name2, ImmutableMeasure.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}, and {@link ColumnHeader#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ColumnHeader#equals(Object)}
   *   <li>{@link ColumnHeader#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ColumnName name = ColumnName.of("Name");
    ColumnHeader ofResult = ColumnHeader.of(name, ImmutableMeasure.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertNotEquals(ColumnHeader.of(name, ImmutableMeasure.of("Name")), 1);
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ColumnHeader ofResult = ColumnHeader.of(ColumnName.of("Name"), mock(Measure.class));
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertNotEquals(ofResult, ColumnHeader.of(name, ImmutableMeasure.of("Name")));
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ColumnName name = ColumnName.of("42");
    ColumnHeader ofResult = ColumnHeader.of(name, ImmutableMeasure.of("Name"));
    ColumnName name2 = ColumnName.of("Name");

    // Act and Assert
    assertNotEquals(ofResult, ColumnHeader.of(name2, ImmutableMeasure.of("Name")));
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertNotEquals(ColumnHeader.of(name, ImmutableMeasure.of("Name")), null);
  }

  /**
   * Test {@link ColumnHeader#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ColumnHeader#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ColumnHeader.equals(Object)", "int ColumnHeader.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ColumnName name = ColumnName.of("Name");

    // Act and Assert
    assertNotEquals(
        ColumnHeader.of(name, ImmutableMeasure.of("Name")), "Different type to ColumnHeader");
  }
}
