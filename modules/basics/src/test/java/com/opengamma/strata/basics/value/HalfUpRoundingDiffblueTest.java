package com.opengamma.strata.basics.value;

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
import com.opengamma.strata.basics.value.HalfUpRounding.Meta;
import java.math.BigDecimal;
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

class HalfUpRoundingDiffblueTest {
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
    Class<? extends HalfUpRounding> actualBeanTypeResult = HalfUpRounding.meta().beanType();

    // Assert
    Class<HalfUpRounding> expectedBeanTypeResult = HalfUpRounding.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#decimalPlaces()}
   *   <li>{@link Meta#fraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.decimalPlaces()", "MetaProperty Meta.fraction()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = HalfUpRounding.meta();

    // Act
    MetaProperty<Integer> actualDecimalPlacesResult = metaResult.decimalPlaces();

    // Assert
    assertTrue(actualDecimalPlacesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.fraction() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean decimalPlaces return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean decimalPlaces return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanDecimalPlacesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = HalfUpRounding.meta().metaPropertyGet("fraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> decimalPlacesResult = ((Meta) metaBeanResult).decimalPlaces();
    assertTrue(decimalPlacesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("decimalPlaces", decimalPlacesResult.name());
    assertEquals("fraction", actualMetaPropertyGetResult.name());
    assertEquals("int", decimalPlacesResult.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, decimalPlacesResult.style());
    Class<HalfUpRounding> expectedDeclaringTypeResult = HalfUpRounding.class;
    assertEquals(expectedDeclaringTypeResult, decimalPlacesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fraction());
    assertSame(Meta.INSTANCE, decimalPlacesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean fraction return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean fraction return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanFractionReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        HalfUpRounding.meta().metaPropertyGet("decimalPlaces");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> fractionResult = ((Meta) metaBeanResult).fraction();
    assertTrue(fractionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("decimalPlaces", actualMetaPropertyGetResult.name());
    assertEquals("fraction", fractionResult.name());
    assertEquals("int", fractionResult.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, fractionResult.style());
    Class<HalfUpRounding> expectedDeclaringTypeResult = HalfUpRounding.class;
    assertEquals(expectedDeclaringTypeResult, fractionResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).decimalPlaces());
    assertSame(Meta.INSTANCE, fractionResult.metaBean());
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
    assertNull(HalfUpRounding.meta().metaPropertyGet("Property Name"));
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
        HalfUpRounding.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("decimalPlaces");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("fraction");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("decimalPlaces", getResult.name());
    assertEquals("fraction", getResult2.name());
    assertEquals("int", getResult.propertyType().getName());
    assertEquals("int", getResult2.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<HalfUpRounding> expectedDeclaringTypeResult = HalfUpRounding.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<HalfUpRounding> expectedDeclaringTypeResult2 = HalfUpRounding.class;
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
    assertNull(HalfUpRounding.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code decimalPlaces}.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'decimalPlaces'; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDecimalPlaces_thenReturnIntValueIsOne() {
    // Arrange
    Meta metaResult = HalfUpRounding.meta();

    // Act and Assert
    assertEquals(
        1,
        ((Integer) metaResult.propertyGet(HalfUpRounding.ofDecimalPlaces(1), "decimalPlaces", true))
            .intValue());
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
    Meta metaResult = HalfUpRounding.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(HalfUpRounding.ofDecimalPlaces(1), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fraction}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fraction'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFraction_thenReturnIntValueIsZero() {
    // Arrange
    Meta metaResult = HalfUpRounding.meta();

    // Act and Assert
    assertEquals(
        0,
        ((Integer) metaResult.propertyGet(HalfUpRounding.ofDecimalPlaces(1), "fraction", true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code decimalPlaces}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'decimalPlaces'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDecimalPlaces_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            HalfUpRounding.meta()
                .propertySet(mock(Bean.class), "decimalPlaces", "New Value", true));
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
            HalfUpRounding.meta()
                .propertySet(mock(Bean.class), "decimalPlaces", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fraction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fraction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFraction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> HalfUpRounding.meta().propertySet(mock(Bean.class), "fraction", "New Value", true));
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
            HalfUpRounding.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link HalfUpRounding#ofDecimalPlaces(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName("Test ofDecimalPlaces(int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> HalfUpRounding.ofDecimalPlaces(-1));
  }

  /**
   * Test {@link HalfUpRounding#ofDecimalPlaces(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return DecimalPlaces is one.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName("Test ofDecimalPlaces(int); when one; then return DecimalPlaces is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces_whenOne_thenReturnDecimalPlacesIsOne() {
    // Arrange and Act
    HalfUpRounding actualOfDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Assert
    assertEquals(0, actualOfDecimalPlacesResult.getFraction());
    assertEquals(1, actualOfDecimalPlacesResult.getDecimalPlaces());
  }

  /**
   * Test {@link HalfUpRounding#ofDecimalPlaces(int)}.
   *
   * <ul>
   *   <li>When {@link Short#SIZE}.
   *   <li>Then return DecimalPlaces is {@link Short#SIZE}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName("Test ofDecimalPlaces(int); when SIZE; then return DecimalPlaces is SIZE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces_whenSize_thenReturnDecimalPlacesIsSize() {
    // Arrange and Act
    HalfUpRounding actualOfDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(Short.SIZE);

    // Assert
    assertEquals(0, actualOfDecimalPlacesResult.getFraction());
    assertEquals(Short.SIZE, actualOfDecimalPlacesResult.getDecimalPlaces());
  }

  /**
   * Test {@link HalfUpRounding#ofDecimalPlaces(int)}.
   *
   * <ul>
   *   <li>When two hundred fifty-six.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName(
      "Test ofDecimalPlaces(int); when two hundred fifty-six; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces_whenTwoHundredFiftySix_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> HalfUpRounding.ofDecimalPlaces(256));
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>Then return DecimalPlaces is zero.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); then return DecimalPlaces is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_thenReturnDecimalPlacesIsZero() {
    // Arrange and Act
    HalfUpRounding actualOfFractionalDecimalPlacesResult =
        HalfUpRounding.ofFractionalDecimalPlaces(0, 256);

    // Assert
    assertEquals(0, actualOfFractionalDecimalPlacesResult.getDecimalPlaces());
    assertEquals(256, actualOfFractionalDecimalPlacesResult.getFraction());
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName(
      "Test ofFractionalDecimalPlaces(int, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> HalfUpRounding.ofFractionalDecimalPlaces(0, -1));
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName(
      "Test ofFractionalDecimalPlaces(int, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> HalfUpRounding.ofFractionalDecimalPlaces(-1, 0));
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Fraction is zero.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); when one; then return Fraction is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenOne_thenReturnFractionIsZero() {
    // Arrange and Act
    HalfUpRounding actualOfFractionalDecimalPlacesResult =
        HalfUpRounding.ofFractionalDecimalPlaces(1, 1);

    // Assert
    assertEquals(0, actualOfFractionalDecimalPlacesResult.getFraction());
    assertEquals(1, actualOfFractionalDecimalPlacesResult.getDecimalPlaces());
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When two hundred fifty-seven.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); when two hundred fifty-seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenTwoHundredFiftySeven() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> HalfUpRounding.ofFractionalDecimalPlaces(0, 257));
  }

  /**
   * Test {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When two hundred fifty-six.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); when two hundred fifty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HalfUpRounding HalfUpRounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenTwoHundredFiftySix() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> HalfUpRounding.ofFractionalDecimalPlaces(256, 0));
  }

  /**
   * Test {@link HalfUpRounding#round(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>Given ofDecimalPlaces one.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#round(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test round(BigDecimal) with 'BigDecimal'; given ofDecimalPlaces one; then return BigDecimal(String) with '2.3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal HalfUpRounding.round(BigDecimal)"})
  void testRoundWithBigDecimal_givenOfDecimalPlacesOne_thenReturnBigDecimalWith23() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act
    BigDecimal actualRoundResult = ofDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link HalfUpRounding#round(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#round(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test round(BigDecimal) with 'BigDecimal'; then return BigDecimal(String) with '2.3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal HalfUpRounding.round(BigDecimal)"})
  void testRoundWithBigDecimal_thenReturnBigDecimalWith23() {
    // Arrange
    HalfUpRounding ofFractionalDecimalPlacesResult =
        HalfUpRounding.ofFractionalDecimalPlaces(1, 256);

    // Act
    BigDecimal actualRoundResult = ofFractionalDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link HalfUpRounding#round(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofDecimalPlaces one.
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#round(double)}
   */
  @Test
  @DisplayName(
      "Test round(double) with 'double'; given ofDecimalPlaces one; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double HalfUpRounding.round(double)"})
  void testRoundWithDouble_givenOfDecimalPlacesOne_whenTen_thenReturnTen() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertEquals(10.0d, ofDecimalPlacesResult.round(10.0d));
  }

  /**
   * Test {@link HalfUpRounding#round(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofFractionalDecimalPlaces one and two hundred fifty-six.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#round(double)}
   */
  @Test
  @DisplayName(
      "Test round(double) with 'double'; given ofFractionalDecimalPlaces one and two hundred fifty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double HalfUpRounding.round(double)"})
  void testRoundWithDouble_givenOfFractionalDecimalPlacesOneAndTwoHundredFiftySix() {
    // Arrange
    HalfUpRounding ofFractionalDecimalPlacesResult =
        HalfUpRounding.ofFractionalDecimalPlaces(1, 256);

    // Act and Assert
    assertEquals(10.0d, ofFractionalDecimalPlacesResult.round(10.0d));
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}, and {@link HalfUpRounding#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HalfUpRounding#equals(Object)}
   *   <li>{@link HalfUpRounding#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);
    HalfUpRounding ofDecimalPlacesResult2 = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertEquals(ofDecimalPlacesResult, ofDecimalPlacesResult2);
    assertEquals(ofDecimalPlacesResult.hashCode(), ofDecimalPlacesResult2.hashCode());
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}, and {@link HalfUpRounding#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HalfUpRounding#equals(Object)}
   *   <li>{@link HalfUpRounding#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HalfUpRounding ofFractionalDecimalPlacesResult = HalfUpRounding.ofFractionalDecimalPlaces(1, 1);
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertEquals(ofFractionalDecimalPlacesResult, ofDecimalPlacesResult);
    assertEquals(ofFractionalDecimalPlacesResult.hashCode(), ofDecimalPlacesResult.hashCode());
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}, and {@link HalfUpRounding#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HalfUpRounding#equals(Object)}
   *   <li>{@link HalfUpRounding#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertEquals(ofDecimalPlacesResult, ofDecimalPlacesResult);
    int expectedHashCodeResult = ofDecimalPlacesResult.hashCode();
    assertEquals(expectedHashCodeResult, ofDecimalPlacesResult.hashCode());
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(0);

    // Act and Assert
    assertNotEquals(ofDecimalPlacesResult, HalfUpRounding.ofDecimalPlaces(1));
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertNotEquals(ofDecimalPlacesResult, null);
  }

  /**
   * Test {@link HalfUpRounding#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HalfUpRounding.equals(Object)", "int HalfUpRounding.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertNotEquals(ofDecimalPlacesResult, "Different type to HalfUpRounding");
  }

  /**
   * Test {@link HalfUpRounding#toString()}.
   *
   * <ul>
   *   <li>Given ofDecimalPlaces one.
   *   <li>Then return {@code Round to 1dp}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#toString()}
   */
  @Test
  @DisplayName("Test toString(); given ofDecimalPlaces one; then return 'Round to 1dp'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String HalfUpRounding.toString()"})
  void testToString_givenOfDecimalPlacesOne_thenReturnRoundTo1dp() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertEquals("Round to 1dp", ofDecimalPlacesResult.toString());
  }

  /**
   * Test {@link HalfUpRounding#toString()}.
   *
   * <ul>
   *   <li>Then return {@code Round to 1/256 of 1dp}.
   * </ul>
   *
   * <p>Method under test: {@link HalfUpRounding#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'Round to 1/256 of 1dp'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String HalfUpRounding.toString()"})
  void testToString_thenReturnRoundTo1256Of1dp() {
    // Arrange
    HalfUpRounding ofFractionalDecimalPlacesResult =
        HalfUpRounding.ofFractionalDecimalPlaces(1, 256);

    // Act and Assert
    assertEquals("Round to 1/256 of 1dp", ofFractionalDecimalPlacesResult.toString());
  }

  /**
   * Test {@link HalfUpRounding#meta()}.
   *
   * <p>Method under test: {@link HalfUpRounding#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta HalfUpRounding.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = HalfUpRounding.meta();

    // Assert
    MetaProperty<Integer> decimalPlacesResult = actualMetaResult.decimalPlaces();
    assertTrue(decimalPlacesResult instanceof DirectMetaProperty);
    MetaProperty<Integer> fractionResult = actualMetaResult.fraction();
    assertTrue(fractionResult instanceof DirectMetaProperty);
    assertEquals("decimalPlaces", decimalPlacesResult.name());
    assertEquals("fraction", fractionResult.name());
    assertEquals("int", decimalPlacesResult.propertyType().getName());
    assertEquals("int", fractionResult.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, decimalPlacesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, fractionResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<HalfUpRounding> expectedDeclaringTypeResult = HalfUpRounding.class;
    assertEquals(expectedDeclaringTypeResult, decimalPlacesResult.declaringType());
    Class<HalfUpRounding> expectedDeclaringTypeResult2 = HalfUpRounding.class;
    assertEquals(expectedDeclaringTypeResult2, fractionResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, decimalPlacesResult.metaBean());
    assertSame(meta, fractionResult.metaBean());
  }

  /**
   * Test {@link HalfUpRounding#metaBean()}.
   *
   * <p>Method under test: {@link HalfUpRounding#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta HalfUpRounding.metaBean()"})
  void testMetaBean() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofDecimalPlacesResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HalfUpRounding#getDecimalPlaces()}
   *   <li>{@link HalfUpRounding#getFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int HalfUpRounding.getDecimalPlaces()", "int HalfUpRounding.getFraction()"})
  void testGettersAndSetters() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act
    int actualDecimalPlaces = ofDecimalPlacesResult.getDecimalPlaces();

    // Assert
    assertEquals(0, ofDecimalPlacesResult.getFraction());
    assertEquals(1, actualDecimalPlaces);
  }
}
