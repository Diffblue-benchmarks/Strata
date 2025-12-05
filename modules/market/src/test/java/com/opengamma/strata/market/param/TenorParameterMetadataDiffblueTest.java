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
import com.opengamma.strata.market.param.TenorParameterMetadata.Meta;
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

class TenorParameterMetadataDiffblueTest {
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
    Class<? extends TenorParameterMetadata> actualBeanTypeResult =
        TenorParameterMetadata.meta().beanType();

    // Assert
    Class<TenorParameterMetadata> expectedBeanTypeResult = TenorParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#tenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.label()", "MetaProperty Meta.tenor()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then metaBean tenor return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'label'; then metaBean tenor return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenMetaBeanTenorReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, tenorResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(Meta.INSTANCE, tenorResult.metaBean());
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
    assertNull(TenorParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then metaBean label return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'tenor'; then metaBean label return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTenor_thenMetaBeanLabelReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorParameterMetadata.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
    assertSame(Meta.INSTANCE, labelResult.metaBean());
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
        TenorParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("tenor");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("label", getResult2.name());
    assertEquals("tenor", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult2 = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
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
    assertNull(TenorParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = TenorParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                TenorParameterMetadata.of(Tenor.ofDays(1)), "Property Name", false));
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
    Meta metaResult = TenorParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "1D", metaResult.propertyGet(TenorParameterMetadata.of(Tenor.ofDays(1)), "label", true));
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
    Meta metaResult = TenorParameterMetadata.meta();
    Tenor tenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(tenor, metaResult.propertyGet(TenorParameterMetadata.of(tenor), "tenor", true));
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
            TenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "label", "New Value", false));
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
            TenorParameterMetadata.meta()
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
            TenorParameterMetadata.meta()
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
            TenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "tenor", "New Value", true));
  }

  /**
   * Test {@link TenorParameterMetadata#of(Tenor, String)} with {@code tenor}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#of(Tenor, String)}
   */
  @Test
  @DisplayName("Test of(Tenor, String) with 'tenor', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorParameterMetadata TenorParameterMetadata.of(Tenor, String)"})
  void testOfWithTenorLabel_whenLabel_thenReturnLabel() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorParameterMetadata actualOfResult = TenorParameterMetadata.of(tenor, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertSame(tenor, actualOfResult.getIdentifier());
    assertSame(tenor, actualOfResult.getTenor());
  }

  /**
   * Test {@link TenorParameterMetadata#of(Tenor)} with {@code tenor}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then return Label is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#of(Tenor)}
   */
  @Test
  @DisplayName("Test of(Tenor) with 'tenor'; when ofDays one; then return Label is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorParameterMetadata TenorParameterMetadata.of(Tenor)"})
  void testOfWithTenor_whenOfDaysOne_thenReturnLabelIs1d() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorParameterMetadata actualOfResult = TenorParameterMetadata.of(tenor);

    // Assert
    assertEquals("1D", actualOfResult.getLabel());
    assertSame(tenor, actualOfResult.getIdentifier());
    assertSame(tenor, actualOfResult.getTenor());
  }

  /**
   * Test {@link TenorParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link TenorParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor TenorParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(tenor, TenorParameterMetadata.of(tenor).getIdentifier());
  }

  /**
   * Test {@link TenorParameterMetadata#withTenor(Tenor)}.
   *
   * <ul>
   *   <li>Then return Label is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor); then return Label is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorParameterMetadata TenorParameterMetadata.withTenor(Tenor)"})
  void testWithTenor_thenReturnLabelIs1d() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofMonths(1));
    Tenor tenor = Tenor.ofDays(1);

    // Act
    TenorParameterMetadata actualWithTenorResult = ofResult.withTenor(tenor);

    // Assert
    assertEquals("1D", actualWithTenorResult.getLabel());
    assertSame(tenor, actualWithTenorResult.getIdentifier());
    assertSame(tenor, actualWithTenorResult.getTenor());
  }

  /**
   * Test {@link TenorParameterMetadata#withTenor(Tenor)}.
   *
   * <ul>
   *   <li>Then return {@link TenorParameterMetadata} with tenor is ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor); then return TenorParameterMetadata with tenor is ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorParameterMetadata TenorParameterMetadata.withTenor(Tenor)"})
  void testWithTenor_thenReturnTenorParameterMetadataWithTenorIsOfDaysOne() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofDays(1));

    // Act
    TenorParameterMetadata actualWithTenorResult = ofResult.withTenor(Tenor.ofDays(1));

    // Assert
    assertSame(ofResult, actualWithTenorResult);
  }

  /**
   * Test {@link TenorParameterMetadata#withTenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofMonths one.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#withTenor(Tenor)}
   */
  @Test
  @DisplayName("Test withTenor(Tenor); when ofMonths one; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorParameterMetadata TenorParameterMetadata.withTenor(Tenor)"})
  void testWithTenor_whenOfMonthsOne_thenReturnLabel() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofDays(1), "Label");
    Tenor tenor = Tenor.ofMonths(1);

    // Act
    TenorParameterMetadata actualWithTenorResult = ofResult.withTenor(tenor);

    // Assert
    assertEquals("Label", actualWithTenorResult.getLabel());
    assertSame(tenor, actualWithTenorResult.getIdentifier());
    assertSame(tenor, actualWithTenorResult.getTenor());
  }

  /**
   * Test {@link TenorParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link TenorParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<TenorParameterMetadata> expectedDeclaringTypeResult2 = TenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, tenorResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
  }

  /**
   * Test {@link TenorParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link TenorParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, TenorParameterMetadata.of(Tenor.ofDays(1)).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorParameterMetadata#toString()}
   *   <li>{@link TenorParameterMetadata#getLabel()}
   *   <li>{@link TenorParameterMetadata#getTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String TenorParameterMetadata.getLabel()",
    "Tenor TenorParameterMetadata.getTenor()",
    "String TenorParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(tenor);

    // Act
    String actualToStringResult = ofResult.toString();
    String actualLabel = ofResult.getLabel();

    // Assert
    assertEquals("1D", actualLabel);
    assertEquals("TenorParameterMetadata{tenor=1D, label=1D}", actualToStringResult);
    assertSame(tenor, ofResult.getTenor());
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}, and {@link
   * TenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorParameterMetadata#equals(Object)}
   *   <li>{@link TenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofDays(1));
    TenorParameterMetadata ofResult2 = TenorParameterMetadata.of(Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}, and {@link
   * TenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorParameterMetadata#equals(Object)}
   *   <li>{@link TenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofMonths(1));

    // Act and Assert
    assertNotEquals(ofResult, TenorParameterMetadata.of(Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    TenorParameterMetadata ofResult = TenorParameterMetadata.of(Tenor.ofDays(1), "Label");

    // Act and Assert
    assertNotEquals(ofResult, TenorParameterMetadata.of(Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(TenorParameterMetadata.of(Tenor.ofDays(1)), null);
  }

  /**
   * Test {@link TenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorParameterMetadata.equals(Object)",
    "int TenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        TenorParameterMetadata.of(Tenor.ofDays(1)), "Different type to TenorParameterMetadata");
  }
}
