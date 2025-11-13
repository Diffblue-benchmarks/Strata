package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.EmptyParameterMetadata.Meta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyParameterMetadataDiffblueTest {
  /**
   * Test {@link EmptyParameterMetadata#empty()}.
   *
   * <p>Method under test: {@link EmptyParameterMetadata#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EmptyParameterMetadata EmptyParameterMetadata.empty()"})
  void testEmpty() {
    // Arrange and Act
    EmptyParameterMetadata actualEmptyResult = EmptyParameterMetadata.empty();

    // Assert
    assertEquals("", actualEmptyResult.getIdentifier());
    assertEquals("", actualEmptyResult.getLabel());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EmptyParameterMetadata#toString()}
   *   <li>{@link EmptyParameterMetadata#getLabel()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String EmptyParameterMetadata.getLabel()",
    "String EmptyParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    EmptyParameterMetadata emptyResult = EmptyParameterMetadata.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("", emptyResult.getLabel());
    assertEquals("EmptyParameterMetadata{}", actualToStringResult);
  }

  /**
   * Test {@link EmptyParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link EmptyParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String EmptyParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange, Act and Assert
    assertEquals("", EmptyParameterMetadata.empty().getIdentifier());
  }

  /**
   * Test {@link EmptyParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link EmptyParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta EmptyParameterMetadata.meta()"})
  void testMeta() {
    // Arrange, Act and Assert
    assertTrue(EmptyParameterMetadata.meta().isBuildable());
  }

  /**
   * Test {@link EmptyParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link EmptyParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta EmptyParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    Meta actualMetaBeanResult = EmptyParameterMetadata.empty().metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.isBuildable());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link EmptyParameterMetadata#equals(Object)}, and {@link
   * EmptyParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EmptyParameterMetadata#equals(Object)}
   *   <li>{@link EmptyParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EmptyParameterMetadata.equals(Object)",
    "int EmptyParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    EmptyParameterMetadata emptyResult = EmptyParameterMetadata.empty();
    EmptyParameterMetadata emptyResult2 = EmptyParameterMetadata.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link EmptyParameterMetadata#equals(Object)}, and {@link
   * EmptyParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EmptyParameterMetadata#equals(Object)}
   *   <li>{@link EmptyParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EmptyParameterMetadata.equals(Object)",
    "int EmptyParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    EmptyParameterMetadata emptyResult = EmptyParameterMetadata.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link EmptyParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EmptyParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EmptyParameterMetadata.equals(Object)",
    "int EmptyParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EmptyParameterMetadata.empty(), 1);
  }

  /**
   * Test {@link EmptyParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EmptyParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EmptyParameterMetadata.equals(Object)",
    "int EmptyParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EmptyParameterMetadata.empty(), null);
  }

  /**
   * Test {@link EmptyParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EmptyParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EmptyParameterMetadata.equals(Object)",
    "int EmptyParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EmptyParameterMetadata.empty(), "Different type to EmptyParameterMetadata");
  }

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
    Class<? extends EmptyParameterMetadata> actualBeanTypeResult =
        EmptyParameterMetadata.meta().beanType();

    // Assert
    Class<EmptyParameterMetadata> expectedBeanTypeResult = EmptyParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
  @MethodsUnderTest({"java.util.Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange, Act and Assert
    assertTrue(EmptyParameterMetadata.meta().metaPropertyMap().isEmpty());
  }
}
