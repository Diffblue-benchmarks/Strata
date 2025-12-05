package com.opengamma.strata.product.credit.type;

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
import com.opengamma.strata.basics.schedule.StubConvention;
import com.opengamma.strata.product.credit.PaymentOnDefault;
import com.opengamma.strata.product.credit.ProtectionStartOfDay;
import com.opengamma.strata.product.credit.type.DatesCdsTemplate.Meta;
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

class DatesCdsTemplateDiffblueTest {
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
    Class<? extends DatesCdsTemplate> actualBeanTypeResult = DatesCdsTemplate.meta().beanType();

    // Assert
    Class<DatesCdsTemplate> expectedBeanTypeResult = DatesCdsTemplate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#startDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.convention()",
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.startDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DatesCdsTemplate.meta();

    // Act
    MetaProperty<CdsConvention> actualConventionResult = metaResult.convention();
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();

    // Assert
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return name is {@code convention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'convention'; then return name is 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConvention_thenReturnNameIsConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DatesCdsTemplate.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    Class<CdsConvention> expectedPropertyTypeResult = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return name is {@code endDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'endDate'; then return name is 'endDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEndDate_thenReturnNameIsEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DatesCdsTemplate.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CdsConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
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
    assertNull(DatesCdsTemplate.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return name is {@code startDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startDate'; then return name is 'startDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartDate_thenReturnNameIsStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DatesCdsTemplate.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CdsConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, endDateResult.metaBean());
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
        DatesCdsTemplate.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("startDate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("convention");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("endDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("convention", getResult2.name());
    assertEquals("endDate", getResult3.name());
    assertEquals("startDate", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CdsConvention> expectedPropertyTypeResult = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult2 = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult3 = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
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
   *   <li>Then return {@link ImmutableCdsConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return ImmutableCdsConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnImmutableCdsConvention() {
    // Arrange
    Meta metaResult = DatesCdsTemplate.meta();
    DatesCdsTemplate bean =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "convention", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ImmutableCdsConvention);
    assertEquals("EUR-GB-STANDARD", ((ImmutableCdsConvention) actualPropertyGetResult).getName());
    assertEquals(
        StubConvention.SMART_INITIAL,
        ((ImmutableCdsConvention) actualPropertyGetResult).getStubConvention());
    assertEquals(
        PaymentOnDefault.ACCRUED_PREMIUM,
        ((ImmutableCdsConvention) actualPropertyGetResult).getPaymentOnDefault());
    assertEquals(
        ProtectionStartOfDay.BEGINNING,
        ((ImmutableCdsConvention) actualPropertyGetResult).getProtectionStart());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = DatesCdsTemplate.meta();
    LocalDate endDate = LocalDate.of(1970, 1, 1);
    DatesCdsTemplate bean =
        DatesCdsTemplate.of(LocalDate.ofYearDay(1, 1), endDate, CdsConventions.EUR_GB_STANDARD);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "endDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(endDate, actualPropertyGetResult);
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
    assertNull(DatesCdsTemplate.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> DatesCdsTemplate.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DatesCdsTemplate.meta().propertySet(mock(Bean.class), "convention", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DatesCdsTemplate.meta().propertySet(mock(Bean.class), "endDate", "New Value", true));
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
            DatesCdsTemplate.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", false));
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
            DatesCdsTemplate.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DatesCdsTemplate.meta().propertySet(mock(Bean.class), "startDate", "New Value", true));
  }

  /**
   * Test {@link DatesCdsTemplate#of(LocalDate, LocalDate, CdsConvention)}.
   *
   * <ul>
   *   <li>When ofYearDay four and four.
   *   <li>Then return EndDate is {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#of(LocalDate, LocalDate, CdsConvention)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, CdsConvention); when ofYearDay four and four; then return EndDate is LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DatesCdsTemplate DatesCdsTemplate.of(LocalDate, LocalDate, CdsConvention)"})
  void testOf_whenOfYearDayFourAndFour_thenReturnEndDateIsLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate startDate = LocalDate.ofYearDay(4, 4);
    LocalDate endDate = LocalDate.of(1970, 1, 1);
    CdsConvention convention = CdsConventions.EUR_GB_STANDARD;

    // Act
    DatesCdsTemplate actualOfResult = DatesCdsTemplate.of(startDate, endDate, convention);

    // Assert
    assertSame(endDate, actualOfResult.getEndDate());
    assertSame(startDate, actualOfResult.getStartDate());
    assertSame(convention, actualOfResult.getConvention());
  }

  /**
   * Test {@link DatesCdsTemplate#meta()}.
   *
   * <p>Method under test: {@link DatesCdsTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DatesCdsTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DatesCdsTemplate.meta();

    // Assert
    MetaProperty<CdsConvention> conventionResult = actualMetaResult.convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> endDateResult = actualMetaResult.endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = actualMetaResult.startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("convention", conventionResult.name());
    assertEquals("endDate", endDateResult.name());
    assertEquals("startDate", startDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, endDateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, startDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CdsConvention> expectedPropertyTypeResult = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult, conventionResult.propertyType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult, conventionResult.declaringType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult2 = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, endDateResult.declaringType());
    Class<DatesCdsTemplate> expectedDeclaringTypeResult3 = DatesCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult3, startDateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, endDateResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, startDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, conventionResult.metaBean());
    assertSame(meta, endDateResult.metaBean());
    assertSame(meta, startDateResult.metaBean());
  }

  /**
   * Test {@link DatesCdsTemplate#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DatesCdsTemplate.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    DatesCdsTemplate ofResult =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}, and {@link DatesCdsTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DatesCdsTemplate#equals(Object)}
   *   <li>{@link DatesCdsTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DatesCdsTemplate ofResult =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD);
    DatesCdsTemplate ofResult2 =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD),
        1);
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD),
        null);
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DatesCdsTemplate ofResult =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(0, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD));
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DatesCdsTemplate ofResult =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.now(), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD));
  }

  /**
   * Test {@link DatesCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DatesCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DatesCdsTemplate.equals(Object)", "int DatesCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    DatesCdsTemplate ofResult =
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        DatesCdsTemplate.of(
            LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1), CdsConventions.EUR_GB_STANDARD));
  }
}
