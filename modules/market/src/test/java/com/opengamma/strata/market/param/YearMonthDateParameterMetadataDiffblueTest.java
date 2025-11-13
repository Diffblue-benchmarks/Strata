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
import com.opengamma.strata.market.param.YearMonthDateParameterMetadata.Meta;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
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

class YearMonthDateParameterMetadataDiffblueTest {
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
    Class<? extends YearMonthDateParameterMetadata> actualBeanTypeResult =
        YearMonthDateParameterMetadata.meta().beanType();

    // Assert
    Class<YearMonthDateParameterMetadata> expectedBeanTypeResult =
        YearMonthDateParameterMetadata.class;
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
   *   <li>{@link Meta#yearMonth()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.date()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.yearMonth()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = YearMonthDateParameterMetadata.meta();

    // Act
    MetaProperty<LocalDate> actualDateResult = metaResult.date();
    MetaProperty<String> actualLabelResult = metaResult.label();

    // Assert
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearMonth() instanceof DirectMetaProperty);
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
        YearMonthDateParameterMetadata.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<YearMonth> yearMonthResult = ((Meta) metaBeanResult).yearMonth();
    assertTrue(yearMonthResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, yearMonthResult.metaBean());
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
        YearMonthDateParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<YearMonth> yearMonthResult = ((Meta) metaBeanResult).yearMonth();
    assertTrue(yearMonthResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, dateResult.metaBean());
    assertSame(metaBeanResult, yearMonthResult.metaBean());
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
    assertNull(YearMonthDateParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearMonth}.
   *   <li>Then return name is {@code yearMonth}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearMonth'; then return name is 'yearMonth'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearMonth_thenReturnNameIsYearMonth() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        YearMonthDateParameterMetadata.meta().metaPropertyGet("yearMonth");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("yearMonth", actualMetaPropertyGetResult.name());
    Class<YearMonth> expectedPropertyTypeResult = YearMonth.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearMonth());
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
        YearMonthDateParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("date");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("yearMonth");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("date", getResult.name());
    assertEquals("label", getResult2.name());
    assertEquals("yearMonth", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult2 =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult3 =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<YearMonth> expectedPropertyTypeResult3 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
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
        YearMonthDateParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = YearMonthDateParameterMetadata.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            YearMonthDateParameterMetadata.of(date, YearMonth.of(1970, Month.JANUARY)),
            "date",
            true);

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
    Meta metaResult = YearMonthDateParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                YearMonthDateParameterMetadata.of(
                    LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY)),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code Jan70}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'label'; then return 'Jan70'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturnJan70() {
    // Arrange
    Meta metaResult = YearMonthDateParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "Jan70",
        metaResult.propertyGet(
            YearMonthDateParameterMetadata.of(
                LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY)),
            "label",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearMonth}.
   *   <li>Then return {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yearMonth'; then return YearMonth with '1970' and 'JANUARY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYearMonth_thenReturnYearMonthWith1970AndJanuary() {
    // Arrange
    Meta metaResult = YearMonthDateParameterMetadata.meta();
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act and Assert
    assertSame(
        yearMonth,
        metaResult.propertyGet(
            YearMonthDateParameterMetadata.of(LocalDate.of(1970, 1, 1), yearMonth),
            "yearMonth",
            true));
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
            YearMonthDateParameterMetadata.meta()
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
            YearMonthDateParameterMetadata.meta()
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
            YearMonthDateParameterMetadata.meta()
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
            YearMonthDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearMonth}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearMonth'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearMonth_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            YearMonthDateParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearMonth", "New Value", true));
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#of(LocalDate, YearMonth, String)} with {@code date},
   * {@code yearMonth}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#of(LocalDate, YearMonth, String)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, YearMonth, String) with 'date', 'yearMonth', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "YearMonthDateParameterMetadata YearMonthDateParameterMetadata.of(LocalDate, YearMonth, String)"
  })
  void testOfWithDateYearMonthLabel_whenLabel_thenReturnLabel() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    YearMonthDateParameterMetadata actualOfResult =
        YearMonthDateParameterMetadata.of(date, yearMonth, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertSame(date, actualOfResult.getDate());
    assertSame(yearMonth, actualOfResult.getIdentifier());
    assertSame(yearMonth, actualOfResult.getYearMonth());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#of(LocalDate, YearMonth)} with {@code date}, {@code
   * yearMonth}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Label is {@code Jan70}.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#of(LocalDate, YearMonth)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, YearMonth) with 'date', 'yearMonth'; when LocalDate with '1970' and one and one; then return Label is 'Jan70'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "YearMonthDateParameterMetadata YearMonthDateParameterMetadata.of(LocalDate, YearMonth)"
  })
  void testOfWithDateYearMonth_whenLocalDateWith1970AndOneAndOne_thenReturnLabelIsJan70() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    YearMonthDateParameterMetadata actualOfResult =
        YearMonthDateParameterMetadata.of(date, yearMonth);

    // Assert
    assertEquals("Jan70", actualOfResult.getLabel());
    assertSame(date, actualOfResult.getDate());
    assertSame(yearMonth, actualOfResult.getIdentifier());
    assertSame(yearMonth, actualOfResult.getYearMonth());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"YearMonth YearMonthDateParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(LocalDate.of(1970, 1, 1), yearMonth);

    // Act and Assert
    assertSame(yearMonth, ofResult.getIdentifier());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta YearMonthDateParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = YearMonthDateParameterMetadata.meta();

    // Assert
    MetaProperty<LocalDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<YearMonth> yearMonthResult = actualMetaResult.yearMonth();
    assertTrue(yearMonthResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("label", labelResult.name());
    assertEquals("yearMonth", yearMonthResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, yearMonthResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult2 =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, labelResult.declaringType());
    Class<YearMonthDateParameterMetadata> expectedDeclaringTypeResult3 =
        YearMonthDateParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, yearMonthResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, labelResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, dateResult.propertyType());
    Class<YearMonth> expectedPropertyTypeResult3 = YearMonth.class;
    assertEquals(expectedPropertyTypeResult3, yearMonthResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, yearMonthResult.metaBean());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta YearMonthDateParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link YearMonthDateParameterMetadata#toString()}
   *   <li>{@link YearMonthDateParameterMetadata#getDate()}
   *   <li>{@link YearMonthDateParameterMetadata#getLabel()}
   *   <li>{@link YearMonthDateParameterMetadata#getYearMonth()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate YearMonthDateParameterMetadata.getDate()",
    "String YearMonthDateParameterMetadata.getLabel()",
    "YearMonth YearMonthDateParameterMetadata.getYearMonth()",
    "String YearMonthDateParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    YearMonthDateParameterMetadata ofResult = YearMonthDateParameterMetadata.of(date, yearMonth);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualDate = ofResult.getDate();
    String actualLabel = ofResult.getLabel();

    // Assert
    assertEquals("1970-01-01", actualDate.toString());
    assertEquals("Jan70", actualLabel);
    assertEquals(
        "YearMonthDateParameterMetadata{date=1970-01-01, yearMonth=1970-01, label=Jan70}",
        actualToStringResult);
    assertSame(date, actualDate);
    assertSame(yearMonth, ofResult.getYearMonth());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}, and {@link
   * YearMonthDateParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link YearMonthDateParameterMetadata#equals(Object)}
   *   <li>{@link YearMonthDateParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));
    YearMonthDateParameterMetadata ofResult2 =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}, and {@link
   * YearMonthDateParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link YearMonthDateParameterMetadata#equals(Object)}
   *   <li>{@link YearMonthDateParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY), "Label");

    // Act and Assert
    assertNotEquals(
        ofResult,
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY)));
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(LocalDate.now(), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(
        ofResult,
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY)));
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(LocalDate.of(1970, 1, 1), YearMonth.now());

    // Act and Assert
    assertNotEquals(
        ofResult,
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY)));
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link YearMonthDateParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link YearMonthDateParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean YearMonthDateParameterMetadata.equals(Object)",
    "int YearMonthDateParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    YearMonthDateParameterMetadata ofResult =
        YearMonthDateParameterMetadata.of(
            LocalDate.of(1970, 1, 1), YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(ofResult, "Different type to YearMonthDateParameterMetadata");
  }
}
