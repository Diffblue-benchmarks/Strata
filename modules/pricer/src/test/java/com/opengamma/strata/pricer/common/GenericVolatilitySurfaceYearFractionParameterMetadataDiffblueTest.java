package com.opengamma.strata.pricer.common;

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
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.market.option.DeltaStrike;
import com.opengamma.strata.market.option.LogMoneynessStrike;
import com.opengamma.strata.market.option.Strike;
import com.opengamma.strata.pricer.common.GenericVolatilitySurfaceYearFractionParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GenericVolatilitySurfaceYearFractionParameterMetadataDiffblueTest {
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
    Class<? extends GenericVolatilitySurfaceYearFractionParameterMetadata> actualBeanTypeResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta().beanType();

    // Assert
    Class<GenericVolatilitySurfaceYearFractionParameterMetadata> expectedBeanTypeResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#strike()}
   *   <li>{@link Meta#yearFraction()}
   *   <li>{@link Meta#yearFractionTenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.label()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.yearFraction()",
    "MetaProperty Meta.yearFractionTenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Strike> actualStrikeResult = metaResult.strike();
    MetaProperty<Double> actualYearFractionResult = metaResult.yearFraction();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(actualYearFractionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFractionTenor() instanceof DirectMetaProperty);
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
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
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
    assertNull(
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
            .metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return name is {@code strike}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'strike'; then return name is 'strike'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStrike_thenReturnNameIsStrike() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    Class<Strike> expectedPropertyTypeResult = Strike.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFractionTenor}.
   *   <li>Then return name is {@code yearFractionTenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFractionTenor'; then return name is 'yearFractionTenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFractionTenor_thenReturnNameIsYearFractionTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
            .metaPropertyGet("yearFractionTenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("yearFractionTenor", actualMetaPropertyGetResult.name());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFractionTenor());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
            .metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> yearFractionTenorResult = ((Meta) metaBeanResult).yearFractionTenor();
    assertTrue(yearFractionTenorResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionTenorResult.metaBean());
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
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("label") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strike") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFractionTenor") instanceof DirectMetaProperty);
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
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata bean =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d));

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
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
        GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code [10.0, Delta=0.5]}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'label'; then return '[10.0, Delta=0.5]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturn100Delta05() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "[10.0, Delta=0.5]",
        metaResult.propertyGet(
            GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, DeltaStrike.of(0.5d)),
            "label",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return {@link DeltaStrike} with delta is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'strike'; then return DeltaStrike with delta is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStrike_thenReturnDeltaStrikeWithDeltaIs05() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act and Assert
    assertSame(
        strike,
        metaResult.propertyGet(
            GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, strike),
            "strike",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFractionTenor}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yearFractionTenor'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYearFractionTenor_thenReturnNull() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Act and Assert
    assertNull(
        metaResult.propertyGet(
            GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, DeltaStrike.of(0.5d)),
            "yearFractionTenor",
            true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yearFraction'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYearFraction_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    GenericVolatilitySurfaceYearFractionParameterMetadata.of(
                        10.0d, DeltaStrike.of(0.5d)),
                    "yearFraction",
                    true))
            .doubleValue());
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
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
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
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
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
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
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
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFractionTenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFractionTenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFractionTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFractionTenor", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yearFraction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYearFraction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericVolatilitySurfaceYearFractionParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double, Strike, String)}
   * with {@code yearFraction}, {@code strike}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double,
   * Strike, String)}
   */
  @Test
  @DisplayName(
      "Test of(double, Strike, String) with 'yearFraction', 'strike', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GenericVolatilitySurfaceYearFractionParameterMetadata GenericVolatilitySurfaceYearFractionParameterMetadata.of(double, Strike, String)"
  })
  void testOfWithYearFractionStrikeLabel_whenLabel_thenReturnLabel() {
    // Arrange
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act
    GenericVolatilitySurfaceYearFractionParameterMetadata actualOfResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, strike, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Strike> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(2, identifier.size());
    assertFalse(actualOfResult.getYearFractionTenor().isPresent());
    assertSame(strike, identifier.getSecond());
    assertSame(strike, actualOfResult.getStrike());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double, Strike)} with
   * {@code yearFraction}, {@code strike}.
   *
   * <ul>
   *   <li>Then return Label is {@code [10.0, Delta=0.5]}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double,
   * Strike)}
   */
  @Test
  @DisplayName(
      "Test of(double, Strike) with 'yearFraction', 'strike'; then return Label is '[10.0, Delta=0.5]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GenericVolatilitySurfaceYearFractionParameterMetadata GenericVolatilitySurfaceYearFractionParameterMetadata.of(double, Strike)"
  })
  void testOfWithYearFractionStrike_thenReturnLabelIs100Delta05() {
    // Arrange
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act
    GenericVolatilitySurfaceYearFractionParameterMetadata actualOfResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, strike);

    // Assert
    assertEquals("[10.0, Delta=0.5]", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Strike> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(2, identifier.size());
    assertFalse(actualOfResult.getYearFractionTenor().isPresent());
    assertSame(strike, identifier.getSecond());
    assertSame(strike, actualOfResult.getStrike());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double, Tenor, Strike,
   * String)} with {@code yearFraction}, {@code yearFractionTenor}, {@code strike}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double,
   * Tenor, Strike, String)}
   */
  @Test
  @DisplayName(
      "Test of(double, Tenor, Strike, String) with 'yearFraction', 'yearFractionTenor', 'strike', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GenericVolatilitySurfaceYearFractionParameterMetadata GenericVolatilitySurfaceYearFractionParameterMetadata.of(double, Tenor, Strike, String)"
  })
  void testOfWithYearFractionYearFractionTenorStrikeLabel_whenLabel_thenReturnLabel() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act
    GenericVolatilitySurfaceYearFractionParameterMetadata actualOfResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, strike, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Strike> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(2, identifier.size());
    Optional<Tenor> yearFractionTenor2 = actualOfResult.getYearFractionTenor();
    assertTrue(yearFractionTenor2.isPresent());
    assertSame(yearFractionTenor, yearFractionTenor2.get());
    assertSame(strike, identifier.getSecond());
    assertSame(strike, actualOfResult.getStrike());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double, Tenor, Strike)}
   * with {@code yearFraction}, {@code yearFractionTenor}, {@code strike}.
   *
   * <ul>
   *   <li>Then return Label is {@code [10.0, Delta=0.5]}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#of(double,
   * Tenor, Strike)}
   */
  @Test
  @DisplayName(
      "Test of(double, Tenor, Strike) with 'yearFraction', 'yearFractionTenor', 'strike'; then return Label is '[10.0, Delta=0.5]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GenericVolatilitySurfaceYearFractionParameterMetadata GenericVolatilitySurfaceYearFractionParameterMetadata.of(double, Tenor, Strike)"
  })
  void testOfWithYearFractionYearFractionTenorStrike_thenReturnLabelIs100Delta05() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act
    GenericVolatilitySurfaceYearFractionParameterMetadata actualOfResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, yearFractionTenor, strike);

    // Assert
    assertEquals("[10.0, Delta=0.5]", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Strike> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(2, identifier.size());
    Optional<Tenor> yearFractionTenor2 = actualOfResult.getYearFractionTenor();
    assertTrue(yearFractionTenor2.isPresent());
    assertSame(yearFractionTenor, yearFractionTenor2.get());
    assertSame(strike, identifier.getSecond());
    assertSame(strike, actualOfResult.getStrike());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair GenericVolatilitySurfaceYearFractionParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    DeltaStrike strike = DeltaStrike.of(0.5d);

    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, yearFractionTenor, strike);

    // Act
    Pair<Double, Strike> actualIdentifier = ofResult.getIdentifier();

    // Assert
    assertEquals(10.0d, actualIdentifier.getFirst().doubleValue());
    assertEquals(2, actualIdentifier.size());
    assertSame(strike, actualIdentifier.getSecond());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericVolatilitySurfaceYearFractionParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = GenericVolatilitySurfaceYearFractionParameterMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.label() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFractionTenor() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link GenericVolatilitySurfaceYearFractionParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericVolatilitySurfaceYearFractionParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#getYearFractionTenor()}.
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#getYearFractionTenor()}
   */
  @Test
  @DisplayName("Test getYearFractionTenor()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Optional GenericVolatilitySurfaceYearFractionParameterMetadata.getYearFractionTenor()"
  })
  void testGetYearFractionTenor() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d));

    // Act
    Optional<Tenor> actualYearFractionTenor = ofResult.getYearFractionTenor();

    // Assert
    assertTrue(actualYearFractionTenor.isPresent());
    assertSame(yearFractionTenor, actualYearFractionTenor.get());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#toString()}
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#getLabel()}
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#getStrike()}
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#getYearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String GenericVolatilitySurfaceYearFractionParameterMetadata.getLabel()",
    "Strike GenericVolatilitySurfaceYearFractionParameterMetadata.getStrike()",
    "double GenericVolatilitySurfaceYearFractionParameterMetadata.getYearFraction()",
    "String GenericVolatilitySurfaceYearFractionParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    DeltaStrike strike = DeltaStrike.of(0.5d);

    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, yearFractionTenor, strike);

    // Act
    String actualToStringResult = ofResult.toString();
    String actualLabel = ofResult.getLabel();
    Strike actualStrike = ofResult.getStrike();

    // Assert
    assertEquals(
        "GenericVolatilitySurfaceYearFractionParameterMetadata{yearFraction=10.0, yearFractionTenor=1D,"
            + " strike=DeltaStrike{value=0.5}, label=[10.0, Delta=0.5]}",
        actualToStringResult);
    assertEquals("[10.0, Delta=0.5]", actualLabel);
    assertEquals(10.0d, ofResult.getYearFraction());
    assertSame(strike, actualStrike);
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}, and {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d));
    Tenor yearFractionTenor2 = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult2 =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor2, DeltaStrike.of(0.5d));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}, and {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   *   <li>{@link GenericVolatilitySurfaceYearFractionParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(10.0d, null, DeltaStrike.of(0.5d));
    Tenor yearFractionTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d)));
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, LogMoneynessStrike.of(10.0d));
    Tenor yearFractionTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor2, DeltaStrike.of(0.5d)));
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d), "Label");
    Tenor yearFractionTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor2, DeltaStrike.of(0.5d)));
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);
    GenericVolatilitySurfaceYearFractionParameterMetadata ofResult =
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            0.5d, yearFractionTenor, DeltaStrike.of(0.5d));
    Tenor yearFractionTenor2 = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor2, DeltaStrike.of(0.5d)));
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d)),
        null);
  }

  /**
   * Test {@link GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * GenericVolatilitySurfaceYearFractionParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfaceYearFractionParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfaceYearFractionParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Tenor yearFractionTenor = Tenor.ofDays(1);

    // Act and Assert
    assertNotEquals(
        GenericVolatilitySurfaceYearFractionParameterMetadata.of(
            10.0d, yearFractionTenor, DeltaStrike.of(0.5d)),
        "Different type to GenericVolatilitySurfaceYearFractionParameterMetadata");
  }
}
