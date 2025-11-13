package com.opengamma.strata.pricer.swaption;

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
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.pricer.swaption.SwaptionSurfaceExpiryStrikeParameterMetadata.Meta;
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

class SwaptionSurfaceExpiryStrikeParameterMetadataDiffblueTest {
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
    Class<? extends SwaptionSurfaceExpiryStrikeParameterMetadata> actualBeanTypeResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().beanType();

    // Assert
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedBeanTypeResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
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
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.label()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Double> actualStrikeResult = metaResult.strike();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
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
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
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
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, yearFractionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return name is {@code yearFraction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return name is 'yearFraction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnNameIsYearFraction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
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
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("yearFraction");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("strike");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult3.propertyType().getName());
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("label", getResult2.name());
    assertEquals("strike", getResult3.name());
    assertEquals("yearFraction", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult2 =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult3 =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    assertNull(
        SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code [10.0, 10.0]}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'label'; then return '[10.0, 10.0]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturn100100() {
    // Arrange
    Meta metaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "[10.0, 10.0]",
        metaResult.propertyGet(
            SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d), "label", true));
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
    Meta metaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d), "strike", true))
            .doubleValue());
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
    Meta metaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d),
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
            SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
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
            SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
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
            SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
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
            SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
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
            SwaptionSurfaceExpiryStrikeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#of(double, double)} with {@code
   * yearFraction}, {@code strike}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double) with 'yearFraction', 'strike'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionSurfaceExpiryStrikeParameterMetadata SwaptionSurfaceExpiryStrikeParameterMetadata.of(double, double)"
  })
  void testOfWithYearFractionStrike() {
    // Arrange and Act
    SwaptionSurfaceExpiryStrikeParameterMetadata actualOfResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Assert
    assertEquals("[10.0, 10.0]", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getStrike());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(10.0d, identifier.getSecond().doubleValue());
    assertEquals(2, identifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#of(double, double, String)} with
   * {@code yearFraction}, {@code strike}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#of(double, double,
   * String)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, String) with 'yearFraction', 'strike', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionSurfaceExpiryStrikeParameterMetadata SwaptionSurfaceExpiryStrikeParameterMetadata.of(double, double, String)"
  })
  void testOfWithYearFractionStrikeLabel_whenLabel_thenReturnLabel() {
    // Arrange and Act
    SwaptionSurfaceExpiryStrikeParameterMetadata actualOfResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getStrike());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(10.0d, identifier.getSecond().doubleValue());
    assertEquals(2, identifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair SwaptionSurfaceExpiryStrikeParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act
    Pair<Double, Double> actualIdentifier = ofResult.getIdentifier();

    // Assert
    assertEquals(10.0d, actualIdentifier.getFirst().doubleValue());
    assertEquals(10.0d, actualIdentifier.getSecond().doubleValue());
    assertEquals(2, actualIdentifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionSurfaceExpiryStrikeParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SwaptionSurfaceExpiryStrikeParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = actualMetaResult.strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = actualMetaResult.yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("double", strikeResult.propertyType().getName());
    assertEquals("double", yearFractionResult.propertyType().getName());
    assertEquals("label", labelResult.name());
    assertEquals("strike", strikeResult.name());
    assertEquals("yearFraction", yearFractionResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, strikeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, yearFractionResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult2 =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, strikeResult.declaringType());
    Class<SwaptionSurfaceExpiryStrikeParameterMetadata> expectedDeclaringTypeResult3 =
        SwaptionSurfaceExpiryStrikeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, yearFractionResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, labelResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, strikeResult.metaBean());
    assertSame(meta, yearFractionResult.metaBean());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionSurfaceExpiryStrikeParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#toString()}
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#getLabel()}
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#getStrike()}
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#getYearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String SwaptionSurfaceExpiryStrikeParameterMetadata.getLabel()",
    "double SwaptionSurfaceExpiryStrikeParameterMetadata.getStrike()",
    "double SwaptionSurfaceExpiryStrikeParameterMetadata.getYearFraction()",
    "String SwaptionSurfaceExpiryStrikeParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    String actualLabel = ofResult.getLabel();
    double actualStrike = ofResult.getStrike();

    // Assert
    assertEquals(
        "SwaptionSurfaceExpiryStrikeParameterMetadata{yearFraction=10.0, strike=10.0, label=[10.0, 10.0]}",
        actualToStringResult);
    assertEquals("[10.0, 10.0]", actualLabel);
    assertEquals(10.0d, actualStrike);
    assertEquals(10.0d, ofResult.getYearFraction());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}, and {@link
   * SwaptionSurfaceExpiryStrikeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult2 =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}, and {@link
   * SwaptionSurfaceExpiryStrikeParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   *   <li>{@link SwaptionSurfaceExpiryStrikeParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d, "Label");

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(0.5d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryStrikeParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryStrikeParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryStrikeParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryStrikeParameterMetadata ofResult =
        SwaptionSurfaceExpiryStrikeParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to SwaptionSurfaceExpiryStrikeParameterMetadata");
  }
}
