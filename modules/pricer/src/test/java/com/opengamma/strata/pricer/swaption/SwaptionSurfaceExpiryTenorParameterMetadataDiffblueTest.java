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
import com.opengamma.strata.pricer.swaption.SwaptionSurfaceExpiryTenorParameterMetadata.Meta;
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

class SwaptionSurfaceExpiryTenorParameterMetadataDiffblueTest {
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
    Class<? extends SwaptionSurfaceExpiryTenorParameterMetadata> actualBeanTypeResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.meta().beanType();

    // Assert
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedBeanTypeResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
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
   *   <li>{@link Meta#yearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.label()",
    "MetaProperty Meta.tenor()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Double> actualTenorResult = metaResult.tenor();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualTenorResult instanceof DirectMetaProperty);
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
        SwaptionSurfaceExpiryTenorParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, tenorResult.metaBean());
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
    assertNull(SwaptionSurfaceExpiryTenorParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        SwaptionSurfaceExpiryTenorParameterMetadata.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = ((Meta) metaBeanResult).yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
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
        SwaptionSurfaceExpiryTenorParameterMetadata.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
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
        SwaptionSurfaceExpiryTenorParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("yearFraction");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("tenor");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult3.propertyType().getName());
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("label", getResult2.name());
    assertEquals("tenor", getResult3.name());
    assertEquals("yearFraction", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult2 =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult3 =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
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
        SwaptionSurfaceExpiryTenorParameterMetadata.meta()
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
    Meta metaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d),
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
    Meta metaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "[10.0, 10.0]",
        metaResult.propertyGet(
            SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d), "label", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'tenor'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTenor_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d), "tenor", true))
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
    Meta metaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d),
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
            SwaptionSurfaceExpiryTenorParameterMetadata.meta()
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
            SwaptionSurfaceExpiryTenorParameterMetadata.meta()
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
            SwaptionSurfaceExpiryTenorParameterMetadata.meta()
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
            SwaptionSurfaceExpiryTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "tenor", "New Value", true));
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
            SwaptionSurfaceExpiryTenorParameterMetadata.meta()
                .propertySet(mock(Bean.class), "yearFraction", "New Value", true));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#of(double, double)} with {@code
   * yearFraction}, {@code tenor}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double) with 'yearFraction', 'tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionSurfaceExpiryTenorParameterMetadata SwaptionSurfaceExpiryTenorParameterMetadata.of(double, double)"
  })
  void testOfWithYearFractionTenor() {
    // Arrange and Act
    SwaptionSurfaceExpiryTenorParameterMetadata actualOfResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Assert
    assertEquals("[10.0, 10.0]", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getTenor());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(10.0d, identifier.getSecond().doubleValue());
    assertEquals(2, identifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#of(double, double, String)} with {@code
   * yearFraction}, {@code tenor}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#of(double, double,
   * String)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, String) with 'yearFraction', 'tenor', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionSurfaceExpiryTenorParameterMetadata SwaptionSurfaceExpiryTenorParameterMetadata.of(double, double, String)"
  })
  void testOfWithYearFractionTenorLabel_whenLabel_thenReturnLabel() {
    // Arrange and Act
    SwaptionSurfaceExpiryTenorParameterMetadata actualOfResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getTenor());
    assertEquals(10.0d, actualOfResult.getYearFraction());
    Pair<Double, Double> identifier = actualOfResult.getIdentifier();
    assertEquals(10.0d, identifier.getFirst().doubleValue());
    assertEquals(10.0d, identifier.getSecond().doubleValue());
    assertEquals(2, identifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair SwaptionSurfaceExpiryTenorParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act
    Pair<Double, Double> actualIdentifier = ofResult.getIdentifier();

    // Assert
    assertEquals(10.0d, actualIdentifier.getFirst().doubleValue());
    assertEquals(10.0d, actualIdentifier.getSecond().doubleValue());
    assertEquals(2, actualIdentifier.size());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionSurfaceExpiryTenorParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SwaptionSurfaceExpiryTenorParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Double> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    MetaProperty<Double> yearFractionResult = actualMetaResult.yearFraction();
    assertTrue(yearFractionResult instanceof DirectMetaProperty);
    assertEquals("double", tenorResult.propertyType().getName());
    assertEquals("double", yearFractionResult.propertyType().getName());
    assertEquals("label", labelResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals("yearFraction", yearFractionResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, yearFractionResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult2 =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, tenorResult.declaringType());
    Class<SwaptionSurfaceExpiryTenorParameterMetadata> expectedDeclaringTypeResult3 =
        SwaptionSurfaceExpiryTenorParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, yearFractionResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, labelResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
    assertSame(meta, yearFractionResult.metaBean());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionSurfaceExpiryTenorParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#toString()}
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#getLabel()}
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#getTenor()}
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#getYearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String SwaptionSurfaceExpiryTenorParameterMetadata.getLabel()",
    "double SwaptionSurfaceExpiryTenorParameterMetadata.getTenor()",
    "double SwaptionSurfaceExpiryTenorParameterMetadata.getYearFraction()",
    "String SwaptionSurfaceExpiryTenorParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    String actualLabel = ofResult.getLabel();
    double actualTenor = ofResult.getTenor();

    // Assert
    assertEquals(
        "SwaptionSurfaceExpiryTenorParameterMetadata{yearFraction=10.0, tenor=10.0, label=[10.0, 10.0]}",
        actualToStringResult);
    assertEquals("[10.0, 10.0]", actualLabel);
    assertEquals(10.0d, actualTenor);
    assertEquals(10.0d, ofResult.getYearFraction());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}, and {@link
   * SwaptionSurfaceExpiryTenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult2 =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}, and {@link
   * SwaptionSurfaceExpiryTenorParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   *   <li>{@link SwaptionSurfaceExpiryTenorParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d, "Label");

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(0.5d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d));
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionSurfaceExpiryTenorParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SwaptionSurfaceExpiryTenorParameterMetadata.equals(Object)",
    "int SwaptionSurfaceExpiryTenorParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SwaptionSurfaceExpiryTenorParameterMetadata ofResult =
        SwaptionSurfaceExpiryTenorParameterMetadata.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to SwaptionSurfaceExpiryTenorParameterMetadata");
  }
}
