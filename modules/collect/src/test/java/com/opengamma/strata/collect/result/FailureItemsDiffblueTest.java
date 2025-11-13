package com.opengamma.strata.collect.result;

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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.result.FailureItems.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FailureItemsDiffblueTest {
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
    Class<? extends FailureItems> actualBeanTypeResult = FailureItems.meta().beanType();

    // Assert
    Class<FailureItems> expectedBeanTypeResult = FailureItems.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#failures()}.
   *
   * <p>Method under test: {@link Meta#failures()}
   */
  @Test
  @DisplayName("Test Meta failures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.failures()"})
  void testMetaFailures() {
    // Arrange, Act and Assert
    assertTrue(FailureItems.meta().failures() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code failures}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'failures'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFailures_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FailureItems.meta().metaPropertyGet("failures");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("failures", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FailureItems> expectedDeclaringTypeResult = FailureItems.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(FailureItems.meta().metaPropertyGet("Property Name"));
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
        FailureItems.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("failures");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("failures", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FailureItems> expectedDeclaringTypeResult = FailureItems.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    assertNull(FailureItems.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link FailureItems#EMPTY}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when EMPTY; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenReturnList() {
    // Arrange and Act
    Object actualPropertyGetResult =
        FailureItems.meta().propertyGet(FailureItems.EMPTY, "failures", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
        () -> FailureItems.meta().propertyGet(FailureItems.EMPTY, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code failures}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'failures'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFailures_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FailureItems.meta().propertySet(mock(Bean.class), "failures", "New Value", true));
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
        () -> FailureItems.meta().propertySet(mock(Bean.class), "failures", "New Value", false));
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
            FailureItems.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link FailureItems#of(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(FailureItem[])}
   */
  @Test
  @DisplayName("Test of(FailureItem[]) with 'FailureItem[]'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(FailureItem[])"})
  void testOfWithFailureItem_thenReturnEmpty() {
    // Arrange and Act
    FailureItems actualOfResult = FailureItems.of();

    // Assert
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.getFailures().isEmpty());
  }

  /**
   * Test {@link FailureItems#of(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(FailureItem[])}
   */
  @Test
  @DisplayName("Test of(FailureItem[]) with 'FailureItem[]'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(FailureItem[])"})
  void testOfWithFailureItem_thenReturnFailuresSizeIsOne() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    ImmutableList<FailureItem> failures = FailureItems.of(ofResult).getFailures();
    assertEquals(1, failures.size());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link FailureItems#of(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(FailureItem[])}
   */
  @Test
  @DisplayName("Test of(FailureItem[]) with 'FailureItem[]'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(FailureItem[])"})
  void testOfWithFailureItem_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");

    // Act
    FailureItems actualOfResult = FailureItems.of(ofResult, ofResult2);

    // Assert
    ImmutableList<FailureItem> failures = actualOfResult.getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult, failures.get(0));
    assertSame(ofResult2, failures.get(1));
  }

  /**
   * Test {@link FailureItems#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(List)"})
  void testOfWithList_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult);

    // Act
    FailureItems actualOfResult = FailureItems.of(failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(1, failures2.size());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItems#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(List)"})
  void testOfWithList_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult2);

    // Act
    FailureItems actualOfResult = FailureItems.of(failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItems#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.of(List)"})
  void testOfWithList_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();

    // Act
    FailureItems actualOfResult = FailureItems.of(failures);

    // Assert
    assertTrue(actualOfResult.isEmpty());
    assertEquals(failures, actualOfResult.getFailures());
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return {@link FailureItems#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItem[])}
   */
  @Test
  @DisplayName("Test combinedWith(FailureItem[]) with 'FailureItem[]'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItem[])"})
  void testCombinedWithWithFailureItem_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(FailureItems.EMPTY, FailureItems.EMPTY.combinedWith());
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FailureItem[]) with 'FailureItem[]'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItem[])"})
  void testCombinedWithWithFailureItem_thenReturnFailuresSizeIsOne() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    ImmutableList<FailureItem> failures = FailureItems.EMPTY.combinedWith(ofResult).getFailures();
    assertEquals(1, failures.size());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItem[])} with {@code FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FailureItem[]) with 'FailureItem[]'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItem[])"})
  void testCombinedWithWithFailureItem_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");

    // Act and Assert
    ImmutableList<FailureItem> failures =
        FailureItems.EMPTY.combinedWith(ofResult, ofResult2).getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult, failures.get(0));
    assertSame(ofResult2, failures.get(1));
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItems)} with {@code FailureItems}.
   *
   * <ul>
   *   <li>Given {@link FailureItems#EMPTY}.
   *   <li>When {@link FailureItems#EMPTY}.
   *   <li>Then return {@link FailureItems#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItems)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FailureItems) with 'FailureItems'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItems)"})
  void testCombinedWithWithFailureItems_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(FailureItems.EMPTY, FailureItems.EMPTY.combinedWith(FailureItems.EMPTY));
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItems)} with {@code FailureItems}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItems)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FailureItems) with 'FailureItems'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItems)"})
  void testCombinedWithWithFailureItems_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult);
    FailureItems ofResult2 = FailureItems.of(failures);

    // Act and Assert
    ImmutableList<FailureItem> failures2 = ofResult2.combinedWith(FailureItems.EMPTY).getFailures();
    assertEquals(1, failures2.size());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItems#combinedWith(FailureItems)} with {@code FailureItems}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(FailureItems)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(FailureItems) with 'FailureItems'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(FailureItems)"})
  void testCombinedWithWithFailureItems_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult2);
    FailureItems ofResult3 = FailureItems.of(failures);

    // Act and Assert
    ImmutableList<FailureItem> failures2 = ofResult3.combinedWith(FailureItems.EMPTY).getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItems#combinedWith(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(List)}
   */
  @Test
  @DisplayName("Test combinedWith(List) with 'List'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(List)"})
  void testCombinedWithWithList_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> otherFailures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    otherFailures.add(ofResult);

    // Act and Assert
    ImmutableList<FailureItem> failures =
        FailureItems.EMPTY.combinedWith(otherFailures).getFailures();
    assertEquals(1, failures.size());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link FailureItems#combinedWith(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(List)}
   */
  @Test
  @DisplayName("Test combinedWith(List) with 'List'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(List)"})
  void testCombinedWithWithList_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> otherFailures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    otherFailures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    otherFailures.add(ofResult2);

    // Act and Assert
    ImmutableList<FailureItem> failures =
        FailureItems.EMPTY.combinedWith(otherFailures).getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult2, failures.get(1));
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link FailureItems#combinedWith(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link FailureItems#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#combinedWith(List)}
   */
  @Test
  @DisplayName("Test combinedWith(List) with 'List'; when ArrayList(); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItems FailureItems.combinedWith(List)"})
  void testCombinedWithWithList_whenArrayList_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(FailureItems.EMPTY, FailureItems.EMPTY.combinedWith(new ArrayList<>()));
  }

  /**
   * Test {@link FailureItems#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link FailureItems#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(FailureItems.EMPTY.isEmpty());
  }

  /**
   * Test {@link FailureItems#isEmpty()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.isEmpty()"})
  void testIsEmpty_thenReturnFalse() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    failures.add(ofResult);
    FailureItems ofResult2 = FailureItems.of(failures);

    // Act and Assert
    assertFalse(ofResult2.isEmpty());
  }

  /**
   * Test {@link FailureItems#meta()}.
   *
   * <p>Method under test: {@link FailureItems#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FailureItems.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FailureItems.meta();

    // Assert
    MetaProperty<ImmutableList<FailureItem>> failuresResult = actualMetaResult.failures();
    assertTrue(failuresResult instanceof DirectMetaProperty);
    assertEquals("failures", failuresResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failuresResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, failuresResult.propertyType());
    Class<FailureItems> expectedDeclaringTypeResult = FailureItems.class;
    assertEquals(expectedDeclaringTypeResult, failuresResult.declaringType());
    assertSame(Meta.INSTANCE, failuresResult.metaBean());
  }

  /**
   * Test {@link FailureItems#FailureItems(List)}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#FailureItems(List)}
   */
  @Test
  @DisplayName("Test new FailureItems(List); then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureItems.<init>(List)"})
  void testNewFailureItems_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    failures.add(ofResult);

    // Act
    FailureItems actualFailureItems = new FailureItems(failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualFailureItems.getFailures();
    assertEquals(1, failures2.size());
    assertFalse(actualFailureItems.isEmpty());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link FailureItems#FailureItems(List)}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#FailureItems(List)}
   */
  @Test
  @DisplayName("Test new FailureItems(List); then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureItems.<init>(List)"})
  void testNewFailureItems_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "failures", "Message Args");
    failures.add(ofResult2);

    // Act and Assert
    ImmutableList<FailureItem> failures2 = new FailureItems(failures).getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
  }

  /**
   * Test {@link FailureItems#FailureItems(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#FailureItems(List)}
   */
  @Test
  @DisplayName("Test new FailureItems(List); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureItems.<init>(List)"})
  void testNewFailureItems_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();

    // Act
    FailureItems actualFailureItems = new FailureItems(failures);

    // Assert
    assertTrue(actualFailureItems.isEmpty());
    assertEquals(failures, actualFailureItems.getFailures());
  }

  /**
   * Test {@link FailureItems#metaBean()}.
   *
   * <p>Method under test: {@link FailureItems#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FailureItems.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FailureItems.EMPTY.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FailureItems#toString()}
   *   <li>{@link FailureItems#getFailures()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList FailureItems.getFailures()", "String FailureItems.toString()"})
  void testGettersAndSetters() {
    // Arrange
    FailureItems ofResult = FailureItems.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("FailureItems[]", actualToStringResult);
    assertTrue(ofResult.getFailures().isEmpty());
  }

  /**
   * Test {@link FailureItems#equals(Object)}, and {@link FailureItems#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FailureItems#equals(Object)}
   *   <li>{@link FailureItems#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FailureItems failureItems = FailureItems.EMPTY;
    FailureItems failureItems2 = FailureItems.EMPTY;

    // Act and Assert
    assertEquals(failureItems, failureItems2);
    assertEquals(failureItems.hashCode(), failureItems2.hashCode());
  }

  /**
   * Test {@link FailureItems#equals(Object)}, and {@link FailureItems#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FailureItems#equals(Object)}
   *   <li>{@link FailureItems#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FailureItems failureItems = new FailureItems(new ArrayList<>());
    FailureItems failureItems2 = FailureItems.EMPTY;

    // Act and Assert
    assertEquals(failureItems, failureItems2);
    assertEquals(failureItems.hashCode(), failureItems2.hashCode());
  }

  /**
   * Test {@link FailureItems#equals(Object)}, and {@link FailureItems#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FailureItems#equals(Object)}
   *   <li>{@link FailureItems#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FailureItems failureItems = FailureItems.EMPTY;

    // Act and Assert
    assertEquals(failureItems, failureItems);
    int expectedHashCodeResult = failureItems.hashCode();
    assertEquals(expectedHashCodeResult, failureItems.hashCode());
  }

  /**
   * Test {@link FailureItems#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FailureItems(new ArrayList<>()), null);
  }

  /**
   * Test {@link FailureItems#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FailureItems.EMPTY, null);
  }

  /**
   * Test {@link FailureItems#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItems#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItems.equals(Object)", "int FailureItems.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FailureItems.EMPTY, "Different type to FailureItems");
  }
}
