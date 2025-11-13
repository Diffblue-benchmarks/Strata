package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoadedCurveNodeDiffblueTest {
  /**
   * Test {@link LoadedCurveNode#of(LocalDate, double, String)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#of(LocalDate, double, String)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double, String); when LocalDate with '1970' and one and one; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LoadedCurveNode LoadedCurveNode.of(LocalDate, double, String)"})
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnLabel() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LoadedCurveNode actualOfResult = LoadedCurveNode.of(date, 10.0d, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertEquals(10.0d, actualOfResult.getValue());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test {@link LoadedCurveNode#compareTo(LoadedCurveNode)} with {@code LoadedCurveNode}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#compareTo(LoadedCurveNode)}
   */
  @Test
  @DisplayName("Test compareTo(LoadedCurveNode) with 'LoadedCurveNode'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoadedCurveNode.compareTo(LoadedCurveNode)"})
  void testCompareToWithLoadedCurveNode_thenReturnMinusOne() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.ofYearDay(1, 1), 10.0d, "Label");

    // Act and Assert
    assertEquals(
        -1, ofResult.compareTo(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label")));
  }

  /**
   * Test {@link LoadedCurveNode#compareTo(LoadedCurveNode)} with {@code LoadedCurveNode}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#compareTo(LoadedCurveNode)}
   */
  @Test
  @DisplayName("Test compareTo(LoadedCurveNode) with 'LoadedCurveNode'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoadedCurveNode.compareTo(LoadedCurveNode)"})
  void testCompareToWithLoadedCurveNode_thenReturnZero() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label");

    // Act and Assert
    assertEquals(
        0, ofResult.compareTo(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label")));
  }

  /**
   * Test {@link LoadedCurveNode#meta()}.
   *
   * <p>Method under test: {@link LoadedCurveNode#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveNode.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<LoadedCurveNode> actualMetaResult = LoadedCurveNode.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("date"));
    assertTrue(metaPropertyMapResult.containsKey("label"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaResult.isBuildable());
    Class<LoadedCurveNode> expectedBeanTypeResult = LoadedCurveNode.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link LoadedCurveNode#metaBean()}.
   *
   * <p>Method under test: {@link LoadedCurveNode#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LoadedCurveNode.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<LoadedCurveNode> actualMetaBeanResult =
        LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label").metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("date"));
    assertTrue(metaPropertyMapResult.containsKey("label"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<LoadedCurveNode> expectedBeanTypeResult = LoadedCurveNode.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveNode#toString()}
   *   <li>{@link LoadedCurveNode#getDate()}
   *   <li>{@link LoadedCurveNode#getLabel()}
   *   <li>{@link LoadedCurveNode#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate LoadedCurveNode.getDate()",
    "String LoadedCurveNode.getLabel()",
    "double LoadedCurveNode.getValue()",
    "String LoadedCurveNode.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    LoadedCurveNode ofResult = LoadedCurveNode.of(date, 10.0d, "Label");

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualDate = ofResult.getDate();
    String actualLabel = ofResult.getLabel();

    // Assert
    assertEquals("1970-01-01", actualDate.toString());
    assertEquals("Label", actualLabel);
    assertEquals("LoadedCurveNode{date=1970-01-01, value=10.0, label=Label}", actualToStringResult);
    assertEquals(10.0d, ofResult.getValue());
    assertSame(date, actualDate);
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}, and {@link LoadedCurveNode#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveNode#equals(Object)}
   *   <li>{@link LoadedCurveNode#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label");
    LoadedCurveNode ofResult2 = LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}, and {@link LoadedCurveNode#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LoadedCurveNode#equals(Object)}
   *   <li>{@link LoadedCurveNode#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"), 1);
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.now(), 10.0d, "Label");

    // Act and Assert
    assertNotEquals(ofResult, LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"));
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LoadedCurveNode ofResult = LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 0.5d, "Label");

    // Act and Assert
    assertNotEquals(ofResult, LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"));
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    LoadedCurveNode ofResult =
        LoadedCurveNode.of(
            LocalDate.of(1970, 1, 1), 10.0d, "com.opengamma.strata.loader.csv.LoadedCurveNode");

    // Act and Assert
    assertNotEquals(ofResult, LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"));
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"), null);
  }

  /**
   * Test {@link LoadedCurveNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LoadedCurveNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoadedCurveNode.equals(Object)", "int LoadedCurveNode.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        LoadedCurveNode.of(LocalDate.of(1970, 1, 1), 10.0d, "Label"),
        "Different type to LoadedCurveNode");
  }
}
