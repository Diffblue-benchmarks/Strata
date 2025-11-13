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
import com.opengamma.strata.collect.tuple.Triple;
import com.opengamma.strata.market.param.TenorTenorStrikeParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TenorTenorStrikeParameterMetadataDiffblueTest {
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
    Class<? extends TenorTenorStrikeParameterMetadata> actualBeanTypeResult =
        TenorTenorStrikeParameterMetadata.meta().beanType();

    // Assert
    Class<TenorTenorStrikeParameterMetadata> expectedBeanTypeResult =
        TenorTenorStrikeParameterMetadata.class;
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
   *   <li>{@link Meta#strike()}
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
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.underlyingTenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();

    // Act
    MetaProperty<Tenor> actualExpiryTenorResult = metaResult.expiryTenor();
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Double> actualStrikeResult = metaResult.strike();

    // Assert
    assertTrue(actualExpiryTenorResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
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
        TenorTenorStrikeParameterMetadata.meta().metaPropertyGet("expiryTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = ((Meta) metaBeanResult).underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("expiryTenor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiryTenor());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
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
        TenorTenorStrikeParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Tenor> expiryTenorResult = ((Meta) metaBeanResult).expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = ((Meta) metaBeanResult).underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, expiryTenorResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
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
    assertNull(TenorTenorStrikeParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'strike'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStrike_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorTenorStrikeParameterMetadata.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Tenor> expiryTenorResult = ((Meta) metaBeanResult).expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> underlyingTenorResult = ((Meta) metaBeanResult).underlyingTenor();
    assertTrue(underlyingTenorResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("strike", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, expiryTenorResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, underlyingTenorResult.metaBean());
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
        TenorTenorStrikeParameterMetadata.meta().metaPropertyGet("underlyingTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Tenor> expiryTenorResult = ((Meta) metaBeanResult).expiryTenor();
    assertTrue(expiryTenorResult instanceof DirectMetaProperty);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("underlyingTenor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingTenor());
    assertSame(metaBeanResult, expiryTenorResult.metaBean());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
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
        TenorTenorStrikeParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("expiryTenor") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("label") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strike") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("underlyingTenor") instanceof DirectMetaProperty);
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
        TenorTenorStrikeParameterMetadata.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata bean =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertSame(expiryTenor, metaResult.propertyGet(bean, "expiryTenor", true));
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
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata bean =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code [1D, 1D, 10.0]}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'label'; then return '[1D, 1D, 10.0]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturn1d1d100() {
    // Arrange
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata bean =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertEquals("[1D, 1D, 10.0]", metaResult.propertyGet(bean, "label", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'strike'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStrike_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata bean =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "strike", true)).doubleValue());
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
    Meta metaResult = TenorTenorStrikeParameterMetadata.meta();
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    TenorTenorStrikeParameterMetadata bean =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, underlyingTenor, 10.0d);

    // Act and Assert
    assertSame(underlyingTenor, metaResult.propertyGet(bean, "underlyingTenor", true));
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
            TenorTenorStrikeParameterMetadata.meta()
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
            TenorTenorStrikeParameterMetadata.meta()
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
            TenorTenorStrikeParameterMetadata.meta()
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
            TenorTenorStrikeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strike'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrike_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorTenorStrikeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
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
            TenorTenorStrikeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "underlyingTenor", "New Value", true));
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#of(Tenor, Tenor, double, String)} with {@code
   * expiryTenor}, {@code underlyingTenor}, {@code strike}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#of(Tenor, Tenor, double,
   * String)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, Tenor, double, String) with 'expiryTenor', 'underlyingTenor', 'strike', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorTenorStrikeParameterMetadata TenorTenorStrikeParameterMetadata.of(Tenor, Tenor, double, String)"
  })
  void testOfWithExpiryTenorUnderlyingTenorStrikeLabel_whenLabel_thenReturnLabel() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act
    TenorTenorStrikeParameterMetadata actualOfResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, underlyingTenor, 10.0d, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getStrike());
    Triple<Tenor, Tenor, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getThird().doubleValue());
    assertEquals(3, identifier.size());
    assertSame(expiryTenor, identifier.getFirst());
    assertSame(underlyingTenor, identifier.getSecond());
    assertSame(expiryTenor, actualOfResult.getExpiryTenor());
    assertSame(underlyingTenor, actualOfResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#of(Tenor, Tenor, double)} with {@code
   * expiryTenor}, {@code underlyingTenor}, {@code strike}.
   *
   * <ul>
   *   <li>Then return Label is {@code [1D, 1D, 10.0]}.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#of(Tenor, Tenor, double)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, Tenor, double) with 'expiryTenor', 'underlyingTenor', 'strike'; then return Label is '[1D, 1D, 10.0]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorTenorStrikeParameterMetadata TenorTenorStrikeParameterMetadata.of(Tenor, Tenor, double)"
  })
  void testOfWithExpiryTenorUnderlyingTenorStrike_thenReturnLabelIs1d1d100() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    // Act
    TenorTenorStrikeParameterMetadata actualOfResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, underlyingTenor, 10.0d);

    // Assert
    assertEquals("[1D, 1D, 10.0]", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getStrike());
    Triple<Tenor, Tenor, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getThird().doubleValue());
    assertEquals(3, identifier.size());
    assertSame(expiryTenor, identifier.getFirst());
    assertSame(underlyingTenor, identifier.getSecond());
    assertSame(expiryTenor, actualOfResult.getExpiryTenor());
    assertSame(underlyingTenor, actualOfResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Triple TenorTenorStrikeParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, underlyingTenor, 10.0d);

    // Act
    Triple<Tenor, Tenor, Double> actualIdentifier = ofResult.getIdentifier();

    // Assert
    assertEquals(10.0d, actualIdentifier.getThird().doubleValue());
    assertEquals(3, actualIdentifier.size());
    assertSame(expiryTenor, actualIdentifier.getFirst());
    assertSame(underlyingTenor, actualIdentifier.getSecond());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorTenorStrikeParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorTenorStrikeParameterMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.expiryTenor() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.label() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.underlyingTenor() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorTenorStrikeParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorStrikeParameterMetadata#toString()}
   *   <li>{@link TenorTenorStrikeParameterMetadata#getExpiryTenor()}
   *   <li>{@link TenorTenorStrikeParameterMetadata#getLabel()}
   *   <li>{@link TenorTenorStrikeParameterMetadata#getStrike()}
   *   <li>{@link TenorTenorStrikeParameterMetadata#getUnderlyingTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Tenor TenorTenorStrikeParameterMetadata.getExpiryTenor()",
    "String TenorTenorStrikeParameterMetadata.getLabel()",
    "double TenorTenorStrikeParameterMetadata.getStrike()",
    "Tenor TenorTenorStrikeParameterMetadata.getUnderlyingTenor()",
    "String TenorTenorStrikeParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    Tenor underlyingTenor = Tenor.ofDays(1);

    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, underlyingTenor, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    Tenor actualExpiryTenor = ofResult.getExpiryTenor();
    String actualLabel = ofResult.getLabel();
    double actualStrike = ofResult.getStrike();

    // Assert
    assertEquals(
        "TenorTenorStrikeParameterMetadata{expiryTenor=1D, underlyingTenor=1D, strike=10.0, label=[1D,"
            + " 1D, 10.0]}",
        actualToStringResult);
    assertEquals("[1D, 1D, 10.0]", actualLabel);
    assertEquals(10.0d, actualStrike);
    assertSame(expiryTenor, actualExpiryTenor);
    assertSame(underlyingTenor, ofResult.getUnderlyingTenor());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}, and {@link
   * TenorTenorStrikeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorStrikeParameterMetadata#equals(Object)}
   *   <li>{@link TenorTenorStrikeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);
    Tenor expiryTenor2 = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult2 =
        TenorTenorStrikeParameterMetadata.of(expiryTenor2, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}, and {@link
   * TenorTenorStrikeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorTenorStrikeParameterMetadata#equals(Object)}
   *   <li>{@link TenorTenorStrikeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofMonths(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d);
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult, TenorTenorStrikeParameterMetadata.of(expiryTenor2, Tenor.ofDays(1), 10.0d));
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofMonths(1), 10.0d);
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult, TenorTenorStrikeParameterMetadata.of(expiryTenor2, Tenor.ofDays(1), 10.0d));
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d, "Label");
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult, TenorTenorStrikeParameterMetadata.of(expiryTenor2, Tenor.ofDays(1), 10.0d));
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);
    TenorTenorStrikeParameterMetadata ofResult =
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 0.5d);
    Tenor expiryTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult, TenorTenorStrikeParameterMetadata.of(expiryTenor2, Tenor.ofDays(1), 10.0d));
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d), null);
  }

  /**
   * Test {@link TenorTenorStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TenorTenorStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TenorTenorStrikeParameterMetadata.equals(Object)",
    "int TenorTenorStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Tenor expiryTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        TenorTenorStrikeParameterMetadata.of(expiryTenor, Tenor.ofDays(1), 10.0d),
        "Different type to TenorTenorStrikeParameterMetadata");
  }
}
