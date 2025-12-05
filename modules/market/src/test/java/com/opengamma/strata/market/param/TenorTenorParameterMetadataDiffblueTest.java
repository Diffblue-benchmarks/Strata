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
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.market.param.TenorTenorParameterMetadata.Meta;
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

class TenorTenorParameterMetadataDiffblueTest {
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
    Class<? extends TenorTenorParameterMetadata> actualBeanTypeResult =
        TenorTenorParameterMetadata.meta().beanType();

    // Assert
    Class<TenorTenorParameterMetadata> expectedBeanTypeResult = TenorTenorParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#expiryTenor()}
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#underlyingTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.expiryTenor()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.underlyingTenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorTenorParameterMetadata.meta();

    // Act
    MetaProperty<Tenor> actualExpiryTenorResult = metaResult.expiryTenor();
    MetaProperty<String> actualLabelResult = metaResult.label();

    // Assert
    assertTrue(actualExpiryTenorResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingTenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiryTenor}.
   *   <li>Then return name is {@code expiryTenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'expiryTenor'; then return name is 'expiryTenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiryTenor_thenReturnNameIsExpiryTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorTenorParameterMetadata.meta().metaPropertyGet("expiryTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = ((Meta) metaBeanResult).underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("expiryTenor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryTenor());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, underlyingTenorResult.metaBean());
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
        TenorTenorParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Tenor> expiryTenorResult = ((Meta) metaBeanResult).expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = ((Meta) metaBeanResult).underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, expiryTenorResult.metaBean());
    assertSame(metaBeanResult, underlyingTenorResult.metaBean());
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
    assertNull(TenorTenorParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlyingTenor}.
   *   <li>Then return name is {@code underlyingTenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlyingTenor'; then return name is 'underlyingTenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlyingTenor_thenReturnNameIsUnderlyingTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorTenorParameterMetadata.meta().metaPropertyGet("underlyingTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Tenor> expiryTenorResult = ((Meta) metaBeanResult).expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("underlyingTenor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingTenor());
    assertSame(metaBeanResult, expiryTenorResult.metaBean());
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
        TenorTenorParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("expiryTenor");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("underlyingTenor");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("expiryTenor", getResult.name());
    assertEquals("label", getResult2.name());
    assertEquals("underlyingTenor", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Tenor> expectedPropertyTypeResult2 = Tenor.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult2 =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult3 =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<String> expectedPropertyTypeResult3 = String.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
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
        TenorTenorParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiryTenor}.
   *   <li>Then return ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'expiryTenor'; then return ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenExpiryTenor_thenReturnOfDaysOne() {
    // Arrange
    Meta metaResult = TenorTenorParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(
        expiryTenor,
        metaResult.propertyGet(
            TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)), "expiryTenor", true));
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
    Meta metaResult = TenorTenorParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code [1D, 1D]}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'label'; then return '[1D, 1D]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturn1d1d() {
    // Arrange
    Meta metaResult = TenorTenorParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertEquals(
        "[1D, 1D]",
        metaResult.propertyGet(
            TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)), "label", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingTenor}.
   *   <li>Then return ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'underlyingTenor'; then return ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnderlyingTenor_thenReturnOfDaysOne() {
    // Arrange
    Meta metaResult = TenorTenorParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(
        underlyingTenor,
        metaResult.propertyGet(
            TenorTenorParameterMetadata.of(expiryTenor, underlyingTenor), "underlyingTenor", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiryTenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiryTenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiryTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "expiryTenor", "New Value", true));
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
            TenorTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "expiryTenor", "New Value", false));
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
            TenorTenorParameterMetadata.meta()
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
            TenorTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingTenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlyingTenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlyingTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "underlyingTenor", "New Value", true));
  }

  /**
   * Test {@link TenorTenorParameterMetadata#of(Tenor, Tenor, String)} with {@code expiryTenor},
   * {@code underlyingTenor}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#of(Tenor, Tenor, String)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, Tenor, String) with 'expiryTenor', 'underlyingTenor', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorTenorParameterMetadata TenorTenorParameterMetadata.of(Tenor, Tenor, String)"
  })
  void testOfWithExpiryTenorUnderlyingTenorLabel_whenLabel_thenReturnLabel() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act
    TenorTenorParameterMetadata actualOfResult =
        TenorTenorParameterMetadata.of(expiryTenor, underlyingTenor, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    Pair<Tenor, Tenor> identifier = actualOfResult.getIdentifier();
    assertEquals(2, identifier.size());
    assertSame(expiryTenor, identifier.getFirst());
    assertSame(underlyingTenor, identifier.getSecond());
    assertSame(expiryTenor, actualOfResult.getExpiryTenor());
    assertSame(underlyingTenor, actualOfResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#of(Tenor, Tenor)} with {@code expiryTenor}, {@code
   * underlyingTenor}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then return Label is {@code [1D, 1D]}.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#of(Tenor, Tenor)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, Tenor) with 'expiryTenor', 'underlyingTenor'; when ofDays one; then return Label is '[1D, 1D]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorTenorParameterMetadata TenorTenorParameterMetadata.of(Tenor, Tenor)"})
  void testOfWithExpiryTenorUnderlyingTenor_whenOfDaysOne_thenReturnLabelIs1d1d() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act
    TenorTenorParameterMetadata actualOfResult =
        TenorTenorParameterMetadata.of(expiryTenor, underlyingTenor);

    // Assert
    assertEquals("[1D, 1D]", actualOfResult.getLabel());
    Pair<Tenor, Tenor> identifier = actualOfResult.getIdentifier();
    assertEquals(2, identifier.size());
    assertSame(expiryTenor, identifier.getFirst());
    assertSame(underlyingTenor, identifier.getSecond());
    assertSame(expiryTenor, actualOfResult.getExpiryTenor());
    assertSame(underlyingTenor, actualOfResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair TenorTenorParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act
    Pair<Tenor, Tenor> actualIdentifier =
        TenorTenorParameterMetadata.of(expiryTenor, underlyingTenor).getIdentifier();

    // Assert
    assertEquals(2, actualIdentifier.size());
    assertSame(expiryTenor, actualIdentifier.getFirst());
    assertSame(underlyingTenor, actualIdentifier.getSecond());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorTenorParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorTenorParameterMetadata.meta();

    // Assert
    MetaProperty<Tenor> expiryTenorResult = actualMetaResult.expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = actualMetaResult.underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("expiryTenor", expiryTenorResult.name());
    assertEquals("label", labelResult.name());
    assertEquals("underlyingTenor", underlyingTenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, expiryTenorResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingTenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, expiryTenorResult.propertyType());
    Class<Tenor> expectedPropertyTypeResult2 = Tenor.class;
    assertEquals(expectedPropertyTypeResult2, underlyingTenorResult.propertyType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, expiryTenorResult.declaringType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult2 =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, labelResult.declaringType());
    Class<TenorTenorParameterMetadata> expectedDeclaringTypeResult3 =
        TenorTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, underlyingTenorResult.declaringType());
    Class<String> expectedPropertyTypeResult3 = String.class;
    assertEquals(expectedPropertyTypeResult3, labelResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, expiryTenorResult.metaBean());
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, underlyingTenorResult.metaBean());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorTenorParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(
        Meta.INSTANCE, TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorParameterMetadata#toString()}
   *   <li>{@link TenorTenorParameterMetadata#getExpiryTenor()}
   *   <li>{@link TenorTenorParameterMetadata#getLabel()}
   *   <li>{@link TenorTenorParameterMetadata#getUnderlyingTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Tenor TenorTenorParameterMetadata.getExpiryTenor()",
    "String TenorTenorParameterMetadata.getLabel()",
    "Tenor TenorTenorParameterMetadata.getUnderlyingTenor()",
    "String TenorTenorParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, underlyingTenor);

    // Act
    String actualToStringResult = ofResult.toString();
    Tenor actualExpiryTenor = ofResult.getExpiryTenor();
    String actualLabel = ofResult.getLabel();

    // Assert
    assertEquals(
        "TenorTenorParameterMetadata{expiryTenor=1D, underlyingTenor=1D, label=[1D, 1D]}",
        actualToStringResult);
    assertEquals("[1D, 1D]", actualLabel);
    assertSame(expiryTenor, actualExpiryTenor);
    assertSame(underlyingTenor, ofResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}, and {@link
   * TenorTenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorParameterMetadata#equals(Object)}
   *   <li>{@link TenorTenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1));
    Tenor expiryTenor2 = Tenor.ofDays(1);
    TenorTenorParameterMetadata ofResult2 =
        TenorTenorParameterMetadata.of(expiryTenor2, Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}, and {@link
   * TenorTenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorParameterMetadata#equals(Object)}
   *   <li>{@link TenorTenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofMonths(1);
    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1));
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(ofResult, TenorTenorParameterMetadata.of(expiryTenor2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofMonths(1));
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(ofResult, TenorTenorParameterMetadata.of(expiryTenor2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorParameterMetadata ofResult =
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1), "Label");
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(ofResult, TenorTenorParameterMetadata.of(expiryTenor2, Tenor.ofDays(1)));
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)), null);
  }

  /**
   * Test {@link TenorTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorParameterMetadata.equals(Object)",
    "int TenorTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        TenorTenorParameterMetadata.of(expiryTenor, Tenor.ofDays(1)),
        "Different type to TenorTenorParameterMetadata");
  }
}
