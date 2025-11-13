package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.market.curve.CurveNodeDate.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Supplier;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveNodeDateDiffblueTest {
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
    Class<? extends CurveNodeDate> actualBeanTypeResult = CurveNodeDate.meta().beanType();

    // Assert
    Class<CurveNodeDate> expectedBeanTypeResult = CurveNodeDate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#date()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.date()", "MetaProperty Meta.type()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurveNodeDate.meta();

    // Act
    MetaProperty<LocalDate> actualDateResult = metaResult.date();

    // Assert
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then metaBean type return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'date'; then metaBean type return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDate_thenMetaBeanTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CurveNodeDate.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveNodeDateType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    Class<CurveNodeDate> expectedDeclaringTypeResult = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult, typeResult.declaringType());
    Class<CurveNodeDateType> expectedPropertyTypeResult = CurveNodeDateType.class;
    assertEquals(expectedPropertyTypeResult, typeResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
    assertSame(Meta.INSTANCE, typeResult.metaBean());
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
    assertNull(CurveNodeDate.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then metaBean date return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'type'; then metaBean date return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenType_thenMetaBeanDateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CurveNodeDate.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("type", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    Class<CurveNodeDate> expectedDeclaringTypeResult = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<CurveNodeDateType> expectedPropertyTypeResult = CurveNodeDateType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
    assertSame(Meta.INSTANCE, dateResult.metaBean());
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
        CurveNodeDate.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("type");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("date");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("date", getResult2.name());
    assertEquals("type", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CurveNodeDate> expectedDeclaringTypeResult = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<CurveNodeDate> expectedDeclaringTypeResult2 = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<CurveNodeDateType> expectedPropertyTypeResult = CurveNodeDateType.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
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
    assertNull(CurveNodeDate.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'date'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CurveNodeDate.meta().propertyGet(CurveNodeDate.END, "date", true));
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
        () -> CurveNodeDate.meta().propertyGet(CurveNodeDate.END, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@link CurveNodeDateType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'type'; then return CurveNodeDateType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenType_thenReturnCurveNodeDateType() {
    // Arrange and Act
    Object actualPropertyGetResult =
        CurveNodeDate.meta().propertyGet(CurveNodeDate.END, "type", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CurveNodeDateType);
    assertEquals(CurveNodeDateType.END, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'date'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CurveNodeDate.meta().propertySet(mock(Bean.class), "date", "New Value", true));
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
        () -> CurveNodeDate.meta().propertySet(mock(Bean.class), "date", "New Value", false));
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
            CurveNodeDate.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CurveNodeDate.meta().propertySet(mock(Bean.class), "type", "New Value", true));
  }

  /**
   * Test {@link CurveNodeDate#of(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Type is {@code FIXED}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#of(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate); when LocalDate with '1970' and one and one; then return Type is 'FIXED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveNodeDate CurveNodeDate.of(LocalDate)"})
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnTypeIsFixed() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    CurveNodeDate actualOfResult = CurveNodeDate.of(date);

    // Assert
    assertEquals(CurveNodeDateType.FIXED, actualOfResult.getType());
    assertFalse(actualOfResult.isEnd());
    assertFalse(actualOfResult.isLastFixing());
    assertTrue(actualOfResult.isFixed());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test {@link CurveNodeDate#isEnd()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#END}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isEnd()}
   */
  @Test
  @DisplayName("Test isEnd(); given END; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isEnd()"})
  void testIsEnd_givenEnd_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurveNodeDate.END.isEnd());
  }

  /**
   * Test {@link CurveNodeDate#isEnd()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#LAST_FIXING}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isEnd()}
   */
  @Test
  @DisplayName("Test isEnd(); given LAST_FIXING; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isEnd()"})
  void testIsEnd_givenLast_fixing_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurveNodeDate.LAST_FIXING.isEnd());
  }

  /**
   * Test {@link CurveNodeDate#isLastFixing()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#END}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isLastFixing()}
   */
  @Test
  @DisplayName("Test isLastFixing(); given END; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isLastFixing()"})
  void testIsLastFixing_givenEnd_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurveNodeDate.END.isLastFixing());
  }

  /**
   * Test {@link CurveNodeDate#isLastFixing()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#LAST_FIXING}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isLastFixing()}
   */
  @Test
  @DisplayName("Test isLastFixing(); given LAST_FIXING; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isLastFixing()"})
  void testIsLastFixing_givenLast_fixing_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurveNodeDate.LAST_FIXING.isLastFixing());
  }

  /**
   * Test {@link CurveNodeDate#isFixed()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#END}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isFixed()}
   */
  @Test
  @DisplayName("Test isFixed(); given END; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isFixed()"})
  void testIsFixed_givenEnd_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurveNodeDate.END.isFixed());
  }

  /**
   * Test {@link CurveNodeDate#isFixed()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#isFixed()}
   */
  @Test
  @DisplayName("Test isFixed(); given LocalDate with '1970' and one and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.isFixed()"})
  void testIsFixed_givenLocalDateWith1970AndOneAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurveNodeDate.of(LocalDate.of(1970, 1, 1)).isFixed());
  }

  /**
   * Test {@link CurveNodeDate#getDate()}.
   *
   * <ul>
   *   <li>Given {@link CurveNodeDate#END}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#getDate()}
   */
  @Test
  @DisplayName("Test getDate(); given END; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CurveNodeDate.getDate()"})
  void testGetDate_givenEnd_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> CurveNodeDate.END.getDate());
  }

  /**
   * Test {@link CurveNodeDate#getDate()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#getDate()}
   */
  @Test
  @DisplayName(
      "Test getDate(); given LocalDate with '1970' and one and one; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CurveNodeDate.getDate()"})
  void testGetDate_givenLocalDateWith1970AndOneAndOne_thenReturnToStringIs19700101() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualDate = CurveNodeDate.of(date).getDate();

    // Assert
    assertEquals("1970-01-01", actualDate.toString());
    assertSame(date, actualDate);
  }

  /**
   * Test {@link CurveNodeDate#calculate(Supplier, Supplier)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#calculate(Supplier, Supplier)}
   */
  @Test
  @DisplayName(
      "Test calculate(Supplier, Supplier); given LocalDate with '1970' and one and one; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CurveNodeDate.calculate(Supplier, Supplier)"})
  void testCalculate_givenLocalDateWith1970AndOneAndOne_thenReturnToStringIs19700101() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    CurveNodeDate ofResult = CurveNodeDate.of(date);
    Supplier<LocalDate> endDateSupplier = ofResult::getDate;
    Supplier<LocalDate> lastFixingDateSupplier = ofResult::getDate;

    // Act
    LocalDate actualCalculateResult = ofResult.calculate(endDateSupplier, lastFixingDateSupplier);

    // Assert
    assertEquals("1970-01-01", actualCalculateResult.toString());
    assertSame(date, actualCalculateResult);
  }

  /**
   * Test {@link CurveNodeDate#meta()}.
   *
   * <p>Method under test: {@link CurveNodeDate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveNodeDate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurveNodeDate.meta();

    // Assert
    MetaProperty<LocalDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<CurveNodeDateType> typeResult = actualMetaResult.type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("type", typeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, typeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurveNodeDate> expectedDeclaringTypeResult = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<CurveNodeDate> expectedDeclaringTypeResult2 = CurveNodeDate.class;
    assertEquals(expectedDeclaringTypeResult2, typeResult.declaringType());
    Class<CurveNodeDateType> expectedPropertyTypeResult = CurveNodeDateType.class;
    assertEquals(expectedPropertyTypeResult, typeResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, typeResult.metaBean());
  }

  /**
   * Test {@link CurveNodeDate#metaBean()}.
   *
   * <p>Method under test: {@link CurveNodeDate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveNodeDate.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurveNodeDate.END.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDate#toString()}
   *   <li>{@link CurveNodeDate#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveNodeDateType CurveNodeDate.getType()",
    "String CurveNodeDate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveNodeDate ofResult = CurveNodeDate.of(LocalDate.of(1970, 1, 1));

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("CurveNodeDate{type=Fixed, date=1970-01-01}", actualToStringResult);
    assertEquals(CurveNodeDateType.FIXED, ofResult.getType());
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}, and {@link CurveNodeDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDate#equals(Object)}
   *   <li>{@link CurveNodeDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveNodeDate curveNodeDate = CurveNodeDate.END;
    CurveNodeDate curveNodeDate2 = CurveNodeDate.END;

    // Act and Assert
    assertEquals(curveNodeDate, curveNodeDate2);
    assertEquals(curveNodeDate.hashCode(), curveNodeDate2.hashCode());
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}, and {@link CurveNodeDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDate#equals(Object)}
   *   <li>{@link CurveNodeDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CurveNodeDate ofResult = CurveNodeDate.of(LocalDate.of(1970, 1, 1));
    CurveNodeDate ofResult2 = CurveNodeDate.of(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}, and {@link CurveNodeDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDate#equals(Object)}
   *   <li>{@link CurveNodeDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveNodeDate curveNodeDate = CurveNodeDate.END;

    // Act and Assert
    assertEquals(curveNodeDate, curveNodeDate);
    int expectedHashCodeResult = curveNodeDate.hashCode();
    assertEquals(expectedHashCodeResult, curveNodeDate.hashCode());
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveNodeDate.LAST_FIXING, CurveNodeDate.END);
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveNodeDate ofResult = CurveNodeDate.of(LocalDate.now());

    // Act and Assert
    assertNotEquals(ofResult, CurveNodeDate.of(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveNodeDate.END, null);
  }

  /**
   * Test {@link CurveNodeDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurveNodeDate.equals(Object)", "int CurveNodeDate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveNodeDate.END, "Different type to CurveNodeDate");
  }
}
