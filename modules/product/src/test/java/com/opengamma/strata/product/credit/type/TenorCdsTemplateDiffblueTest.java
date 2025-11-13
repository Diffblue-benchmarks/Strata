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
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.schedule.StubConvention;
import com.opengamma.strata.product.credit.PaymentOnDefault;
import com.opengamma.strata.product.credit.ProtectionStartOfDay;
import com.opengamma.strata.product.credit.type.TenorCdsTemplate.Meta;
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

class TenorCdsTemplateDiffblueTest {
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
    Class<? extends TenorCdsTemplate> actualBeanTypeResult = TenorCdsTemplate.meta().beanType();

    // Assert
    Class<TenorCdsTemplate> expectedBeanTypeResult = TenorCdsTemplate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualStart()}
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#tenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.accrualStart()",
    "MetaProperty Meta.convention()",
    "MetaProperty Meta.tenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorCdsTemplate.meta();

    // Act
    MetaProperty<AccrualStart> actualAccrualStartResult = metaResult.accrualStart();
    MetaProperty<CdsConvention> actualConventionResult = metaResult.convention();

    // Assert
    assertTrue(actualAccrualStartResult instanceof DirectMetaProperty);
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code accrualStart}.
   *   <li>Then return name is {@code accrualStart}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'accrualStart'; then return name is 'accrualStart'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAccrualStart_thenReturnNameIsAccrualStart() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorCdsTemplate.meta().metaPropertyGet("accrualStart");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CdsConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("accrualStart", actualMetaPropertyGetResult.name());
    Class<AccrualStart> expectedPropertyTypeResult = AccrualStart.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualStart());
    assertSame(metaBeanResult, conventionResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
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
        TenorCdsTemplate.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<AccrualStart> accrualStartResult = ((Meta) metaBeanResult).accrualStart();
    assertTrue(accrualStartResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    Class<CdsConvention> expectedPropertyTypeResult = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(metaBeanResult, accrualStartResult.metaBean());
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
    assertNull(TenorCdsTemplate.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = TenorCdsTemplate.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<AccrualStart> accrualStartResult = ((Meta) metaBeanResult).accrualStart();
    assertTrue(accrualStartResult instanceof DirectMetaProperty);
    MetaProperty<CdsConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
    assertSame(metaBeanResult, accrualStartResult.metaBean());
    assertSame(metaBeanResult, conventionResult.metaBean());
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
        TenorCdsTemplate.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("accrualStart");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("convention");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("tenor");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("accrualStart", getResult.name());
    assertEquals("convention", getResult2.name());
    assertEquals("tenor", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<AccrualStart> expectedPropertyTypeResult2 = AccrualStart.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<CdsConvention> expectedPropertyTypeResult3 = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult2 = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult3 = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = TenorCdsTemplate.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                TenorCdsTemplate.of(
                    AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualStart}.
   *   <li>Then return {@link AccrualStart}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'accrualStart'; then return AccrualStart")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAccrualStart_thenReturnAccrualStart() {
    // Arrange
    Meta metaResult = TenorCdsTemplate.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            TenorCdsTemplate.of(
                AccrualStart.NEXT_DAY, Tenor.ofDays(110246592), CdsConventions.EUR_GB_STANDARD),
            "accrualStart",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof AccrualStart);
    assertEquals(AccrualStart.NEXT_DAY, actualPropertyGetResult);
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
    assertNull(TenorCdsTemplate.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return {@link ImmutableCdsConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'convention'; then return ImmutableCdsConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenConvention_thenReturnImmutableCdsConvention() {
    // Arrange
    Meta metaResult = TenorCdsTemplate.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            TenorCdsTemplate.of(
                AccrualStart.NEXT_DAY, Tenor.ofDays(110246592), CdsConventions.EUR_GB_STANDARD),
            "convention",
            true);

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
   *   <li>When {@code tenor}.
   *   <li>Then return ofDays {@code 110246592}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'tenor'; then return ofDays '110246592'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTenor_thenReturnOfDays110246592() {
    // Arrange
    Meta metaResult = TenorCdsTemplate.meta();
    Tenor tenor = Tenor.ofDays(110246592);

    // Act and Assert
    assertSame(
        tenor,
        metaResult.propertyGet(
            TenorCdsTemplate.of(AccrualStart.NEXT_DAY, tenor, CdsConventions.EUR_GB_STANDARD),
            "tenor",
            true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualStart}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualStart'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualStart_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorCdsTemplate.meta()
                .propertySet(mock(Bean.class), "accrualStart", "New Value", true));
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
            TenorCdsTemplate.meta().propertySet(mock(Bean.class), "convention", "New Value", true));
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
            TenorCdsTemplate.meta()
                .propertySet(mock(Bean.class), "accrualStart", "New Value", false));
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
            TenorCdsTemplate.meta()
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
        () -> TenorCdsTemplate.meta().propertySet(mock(Bean.class), "tenor", "New Value", true));
  }

  /**
   * Test {@link TenorCdsTemplate#of(AccrualStart, Tenor, CdsConvention)} with {@code accrualStart},
   * {@code tenor}, {@code convention}.
   *
   * <ul>
   *   <li>Then return AccrualStart is {@code NEXT_DAY}.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#of(AccrualStart, Tenor, CdsConvention)}
   */
  @Test
  @DisplayName(
      "Test of(AccrualStart, Tenor, CdsConvention) with 'accrualStart', 'tenor', 'convention'; then return AccrualStart is 'NEXT_DAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorCdsTemplate TenorCdsTemplate.of(AccrualStart, Tenor, CdsConvention)"})
  void testOfWithAccrualStartTenorConvention_thenReturnAccrualStartIsNextDay() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);
    CdsConvention convention = CdsConventions.EUR_GB_STANDARD;

    // Act
    TenorCdsTemplate actualOfResult = TenorCdsTemplate.of(AccrualStart.NEXT_DAY, tenor, convention);

    // Assert
    assertEquals(AccrualStart.NEXT_DAY, actualOfResult.getAccrualStart());
    assertSame(tenor, actualOfResult.getTenor());
    assertSame(convention, actualOfResult.getConvention());
  }

  /**
   * Test {@link TenorCdsTemplate#of(Tenor, CdsConvention)} with {@code tenor}, {@code convention}.
   *
   * <ul>
   *   <li>When {@link CdsConventions#EUR_GB_STANDARD}.
   *   <li>Then return AccrualStart is {@code IMM_DATE}.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#of(Tenor, CdsConvention)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, CdsConvention) with 'tenor', 'convention'; when EUR_GB_STANDARD; then return AccrualStart is 'IMM_DATE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorCdsTemplate TenorCdsTemplate.of(Tenor, CdsConvention)"})
  void testOfWithTenorConvention_whenEur_gb_standard_thenReturnAccrualStartIsImmDate() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);
    CdsConvention convention = CdsConventions.EUR_GB_STANDARD;

    // Act
    TenorCdsTemplate actualOfResult = TenorCdsTemplate.of(tenor, convention);

    // Assert
    assertEquals(AccrualStart.IMM_DATE, actualOfResult.getAccrualStart());
    assertSame(tenor, actualOfResult.getTenor());
    assertSame(convention, actualOfResult.getConvention());
  }

  /**
   * Test {@link TenorCdsTemplate#meta()}.
   *
   * <p>Method under test: {@link TenorCdsTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorCdsTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorCdsTemplate.meta();

    // Assert
    MetaProperty<AccrualStart> accrualStartResult = actualMetaResult.accrualStart();
    assertTrue(accrualStartResult instanceof DirectMetaProperty);
    MetaProperty<CdsConvention> conventionResult = actualMetaResult.convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("accrualStart", accrualStartResult.name());
    assertEquals("convention", conventionResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, accrualStartResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<AccrualStart> expectedPropertyTypeResult2 = AccrualStart.class;
    assertEquals(expectedPropertyTypeResult2, accrualStartResult.propertyType());
    Class<CdsConvention> expectedPropertyTypeResult3 = CdsConvention.class;
    assertEquals(expectedPropertyTypeResult3, conventionResult.propertyType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult, accrualStartResult.declaringType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult2 = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, conventionResult.declaringType());
    Class<TenorCdsTemplate> expectedDeclaringTypeResult3 = TenorCdsTemplate.class;
    assertEquals(expectedDeclaringTypeResult3, tenorResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, accrualStartResult.metaBean());
    assertSame(meta, conventionResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
  }

  /**
   * Test {@link TenorCdsTemplate#metaBean()}.
   *
   * <p>Method under test: {@link TenorCdsTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorCdsTemplate.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD)
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorCdsTemplate#toString()}
   *   <li>{@link TenorCdsTemplate#getAccrualStart()}
   *   <li>{@link TenorCdsTemplate#getConvention()}
   *   <li>{@link TenorCdsTemplate#getTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AccrualStart TenorCdsTemplate.getAccrualStart()",
    "CdsConvention TenorCdsTemplate.getConvention()",
    "Tenor TenorCdsTemplate.getTenor()",
    "String TenorCdsTemplate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, tenor, CdsConventions.EUR_GB_STANDARD);

    // Act
    String actualToStringResult = ofResult.toString();
    AccrualStart actualAccrualStart = ofResult.getAccrualStart();
    CdsConvention actualConvention = ofResult.getConvention();

    // Assert
    assertTrue(actualConvention instanceof ImmutableCdsConvention);
    assertEquals(
        "TenorCdsTemplate{accrualStart=NextDay, tenor=1D, convention=EUR-GB-STANDARD}",
        actualToStringResult);
    assertEquals(AccrualStart.NEXT_DAY, actualAccrualStart);
    assertSame(tenor, ofResult.getTenor());
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}, and {@link TenorCdsTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorCdsTemplate#equals(Object)}
   *   <li>{@link TenorCdsTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD);
    TenorCdsTemplate ofResult2 =
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}, and {@link TenorCdsTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorCdsTemplate#equals(Object)}
   *   <li>{@link TenorCdsTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(
            AccrualStart.NEXT_DAY, Tenor.ofMonths(1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        TenorCdsTemplate.of(
            AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD));
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(AccrualStart.IMM_DATE, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        TenorCdsTemplate.of(
            AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD));
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    TenorCdsTemplate ofResult =
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_STANDARD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        TenorCdsTemplate.of(
            AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD));
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD),
        null);
  }

  /**
   * Test {@link TenorCdsTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorCdsTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TenorCdsTemplate.equals(Object)", "int TenorCdsTemplate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TenorCdsTemplate.of(AccrualStart.NEXT_DAY, Tenor.ofDays(1), CdsConventions.EUR_GB_STANDARD),
        "Different type to TenorCdsTemplate");
  }
}
