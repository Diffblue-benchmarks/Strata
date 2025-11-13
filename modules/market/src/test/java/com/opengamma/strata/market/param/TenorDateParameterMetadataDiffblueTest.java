package com.opengamma.strata.market.param;

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
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.market.param.TenorDateParameterMetadata.Meta;
import java.time.LocalDate;
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

class TenorDateParameterMetadataDiffblueTest {
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
    Class<? extends TenorDateParameterMetadata> actualBeanTypeResult =
        TenorDateParameterMetadata.meta().beanType();

    // Assert
    Class<TenorDateParameterMetadata> expectedBeanTypeResult = TenorDateParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#date()}
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#tenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.date()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.tenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorDateParameterMetadata.meta();

    // Act
    MetaProperty<LocalDate> actualDateResult = metaResult.date();
    MetaProperty<String> actualLabelResult = metaResult.label();

    // Assert
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return name is {@code date}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'date'; then return name is 'date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDate_thenReturnNameIsDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorDateParameterMetadata.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return name is {@code label}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'label'; then return name is 'label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenReturnNameIsLabel() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorDateParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, dateResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
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
    assertNull(TenorDateParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then return name is {@code tenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'tenor'; then return name is 'tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTenor_thenReturnNameIsTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorDateParameterMetadata.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
    assertSame(metaBeanResult, dateResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
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
        TenorDateParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("date");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("tenor");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("date", getResult.name());
    assertEquals("label", getResult2.name());
    assertEquals("tenor", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult2 =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult3 =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
        TenorDateParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'date'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = TenorDateParameterMetadata.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(TenorDateParameterMetadata.of(date, Tenor.ofDays(1)), "date", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(date, actualPropertyGetResult);
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
    Meta metaResult = TenorDateParameterMetadata.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                TenorDateParameterMetadata.of(date, Tenor.ofDays(1)), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'label'; then return '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturn1d() {
    // Arrange
    Meta metaResult = TenorDateParameterMetadata.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "1D",
        metaResult.propertyGet(
            TenorDateParameterMetadata.of(date, Tenor.ofDays(1)), "label", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then return ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'tenor'; then return ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTenor_thenReturnOfDaysOne() {
    // Arrange
    Meta metaResult = TenorDateParameterMetadata.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);
    Tenor tenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(
        tenor, metaResult.propertyGet(TenorDateParameterMetadata.of(date, tenor), "tenor", true));
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
        () ->
            TenorDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "date", "New Value", true));
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
            TenorDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "date", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'label'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLabel_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "label", "New Value", true));
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
            TenorDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "tenor", "New Value", true));
  }

  /**
   * Test {@link TenorDateParameterMetadata#of(LocalDate, Tenor, String)} with {@code date}, {@code
   * tenor}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#of(LocalDate, Tenor, String)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Tenor, String) with 'date', 'tenor', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorDateParameterMetadata TenorDateParameterMetadata.of(LocalDate, Tenor, String)"
  })
  void testOfWithDateTenorLabel_whenLabel_thenReturnLabel() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorDateParameterMetadata actualOfResult = TenorDateParameterMetadata.of(date, tenor, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertSame(tenor, actualOfResult.getIdentifier());
    assertSame(tenor, actualOfResult.getTenor());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test {@link TenorDateParameterMetadata#of(LocalDate, Tenor)} with {@code date}, {@code tenor}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Label is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#of(LocalDate, Tenor)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Tenor) with 'date', 'tenor'; when LocalDate with '1970' and one and one; then return Label is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorDateParameterMetadata TenorDateParameterMetadata.of(LocalDate, Tenor)"})
  void testOfWithDateTenor_whenLocalDateWith1970AndOneAndOne_thenReturnLabelIs1d() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorDateParameterMetadata actualOfResult = TenorDateParameterMetadata.of(date, tenor);

    // Assert
    assertEquals("1D", actualOfResult.getLabel());
    assertSame(tenor, actualOfResult.getIdentifier());
    assertSame(tenor, actualOfResult.getTenor());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test {@link TenorDateParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor TenorDateParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    Tenor tenor = Tenor.ofDays(1);

    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, tenor);

    // Act and Assert
    assertSame(tenor, ofResult.getIdentifier());
  }

  /**
   * Test {@link TenorDateParameterMetadata#withTenor(Tenor)}.
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorDateParameterMetadata TenorDateParameterMetadata.withTenor(Tenor)"})
  void testWithTenor() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));

    // Act
    TenorDateParameterMetadata actualWithTenorResult = ofResult.withTenor(Tenor.ofDays(1));

    // Assert
    assertSame(ofResult, actualWithTenorResult);
  }

  /**
   * Test {@link TenorDateParameterMetadata#withTenor(Tenor)}.
   *
   * <ul>
   *   <li>Then return Label is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor); then return Label is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorDateParameterMetadata TenorDateParameterMetadata.withTenor(Tenor)"})
  void testWithTenor_thenReturnLabelIs1d() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofMonths(1));
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorDateParameterMetadata actualWithTenorResult = ofResult.withTenor(tenor);

    // Assert
    assertEquals("1D", actualWithTenorResult.getLabel());
    assertSame(tenor, actualWithTenorResult.getIdentifier());
    assertSame(tenor, actualWithTenorResult.getTenor());
  }

  /**
   * Test {@link TenorDateParameterMetadata#withTenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofMonths one.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor); when ofMonths one; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorDateParameterMetadata TenorDateParameterMetadata.withTenor(Tenor)"})
  void testWithTenor_whenOfMonthsOne_thenReturnLabel() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult =
        TenorDateParameterMetadata.of(date, Tenor.ofDays(1), "Label");
    Tenor tenor = Tenor.ofMonths(1);

    // Act
    TenorDateParameterMetadata actualWithTenorResult = ofResult.withTenor(tenor);

    // Assert
    assertEquals("Label", actualWithTenorResult.getLabel());
    assertSame(tenor, actualWithTenorResult.getIdentifier());
    assertSame(tenor, actualWithTenorResult.getTenor());
  }

  /**
   * Test {@link TenorDateParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorDateParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorDateParameterMetadata.meta();

    // Assert
    MetaProperty<LocalDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("label", labelResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult2 =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, labelResult.declaringType());
    Class<TenorDateParameterMetadata> expectedDeclaringTypeResult3 =
        TenorDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, tenorResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, dateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
  }

  /**
   * Test {@link TenorDateParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorDateParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorDateParameterMetadata#toString()}
   *   <li>{@link TenorDateParameterMetadata#getDate()}
   *   <li>{@link TenorDateParameterMetadata#getLabel()}
   *   <li>{@link TenorDateParameterMetadata#getTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate TenorDateParameterMetadata.getDate()",
    "String TenorDateParameterMetadata.getLabel()",
    "Tenor TenorDateParameterMetadata.getTenor()",
    "String TenorDateParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    Tenor tenor = Tenor.ofDays(1);

    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, tenor);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualDate = ofResult.getDate();
    String actualLabel = ofResult.getLabel();

    // Assert
    assertEquals("1970-01-01", actualDate.toString());
    assertEquals("1D", actualLabel);
    assertEquals(
        "TenorDateParameterMetadata{date=1970-01-01, tenor=1D, label=1D}", actualToStringResult);
    assertSame(tenor, ofResult.getTenor());
    assertSame(date, actualDate);
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}, and {@link
   * TenorDateParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorDateParameterMetadata#equals(Object)}
   *   <li>{@link TenorDateParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));
    LocalDate date2 = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult2 = TenorDateParameterMetadata.of(date2, Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}, and {@link
   * TenorDateParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorDateParameterMetadata#equals(Object)}
   *   <li>{@link TenorDateParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofMonths(1));
    LocalDate date2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ofResult, TenorDateParameterMetadata.of(date2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult =
        TenorDateParameterMetadata.of(date, Tenor.ofDays(1), "Label");
    LocalDate date2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ofResult, TenorDateParameterMetadata.of(date2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LocalDate date = LocalDate.now();
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));
    LocalDate date2 = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertNotEquals(ofResult, TenorDateParameterMetadata.of(date2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link TenorDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorDateParameterMetadata.equals(Object)",
    "int TenorDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    TenorDateParameterMetadata ofResult = TenorDateParameterMetadata.of(date, Tenor.ofDays(1));

    // Act and Assert
    assertNotEquals(ofResult, "Different type to TenorDateParameterMetadata");
  }
}
