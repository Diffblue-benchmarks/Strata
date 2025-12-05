package com.opengamma.strata.product.rate;

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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.product.rate.IborAveragedRateComputation.Meta;
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

class IborAveragedRateComputationDiffblueTest {
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
    Class<? extends IborAveragedRateComputation> actualBeanTypeResult =
        IborAveragedRateComputation.meta().beanType();

    // Assert
    Class<IborAveragedRateComputation> expectedBeanTypeResult = IborAveragedRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#fixings()}.
   *
   * <p>Method under test: {@link Meta#fixings()}
   */
  @Test
  @DisplayName("Test Meta fixings()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.fixings()"})
  void testMetaFixings() {
    // Arrange, Act and Assert
    assertTrue(IborAveragedRateComputation.meta().fixings() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixings}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'fixings'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixings_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborAveragedRateComputation.meta().metaPropertyGet("fixings");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixings", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<IborAveragedRateComputation> expectedDeclaringTypeResult =
        IborAveragedRateComputation.class;
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
    assertNull(IborAveragedRateComputation.meta().metaPropertyGet("Property Name"));
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
        IborAveragedRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("fixings");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("fixings", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<IborAveragedRateComputation> expectedDeclaringTypeResult =
        IborAveragedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnList() {
    // Arrange
    Meta metaResult = IborAveragedRateComputation.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(IborAveragedRateComputation.of(new ArrayList<>()), "fixings", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
        IborAveragedRateComputation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = IborAveragedRateComputation.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                IborAveragedRateComputation.of(new ArrayList<>()), "Property Name", false));
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
            IborAveragedRateComputation.meta()
                .propertySet(mock(Bean.class), "fixings", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixings}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixings'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixings_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborAveragedRateComputation.meta()
                .propertySet(mock(Bean.class), "fixings", "New Value", true));
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
            IborAveragedRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link IborAveragedRateComputation#of(List)}.
   *
   * <p>Method under test: {@link IborAveragedRateComputation#of(List)}
   */
  @Test
  @DisplayName("Test of(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborAveragedRateComputation IborAveragedRateComputation.of(List)"})
  void testOf() {
    // Arrange
    ArrayList<IborAveragedFixing> fixings = new ArrayList<>();

    // Act
    IborAveragedRateComputation actualOfResult = IborAveragedRateComputation.of(fixings);

    // Assert
    assertEquals(0.0d, actualOfResult.getTotalWeight());
    assertEquals(fixings, actualOfResult.getFixings());
  }

  /**
   * Test {@link IborAveragedRateComputation#meta()}.
   *
   * <p>Method under test: {@link IborAveragedRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborAveragedRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborAveragedRateComputation.meta();

    // Assert
    MetaProperty<ImmutableList<IborAveragedFixing>> fixingsResult = actualMetaResult.fixings();
    assertTrue(fixingsResult instanceof DirectMetaProperty);
    assertEquals("fixings", fixingsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixingsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, fixingsResult.propertyType());
    Class<IborAveragedRateComputation> expectedDeclaringTypeResult =
        IborAveragedRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, fixingsResult.declaringType());
    assertSame(Meta.INSTANCE, fixingsResult.metaBean());
  }

  /**
   * Test {@link IborAveragedRateComputation#metaBean()}.
   *
   * <p>Method under test: {@link IborAveragedRateComputation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborAveragedRateComputation.metaBean()"})
  void testMetaBean() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborAveragedRateComputation#toString()}
   *   <li>{@link IborAveragedRateComputation#getFixings()}
   *   <li>{@link IborAveragedRateComputation#getTotalWeight()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList IborAveragedRateComputation.getFixings()",
    "double IborAveragedRateComputation.getTotalWeight()",
    "String IborAveragedRateComputation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableList<IborAveragedFixing> actualFixings = ofResult.getFixings();

    // Assert
    assertEquals("IborAveragedRateComputation{fixings=[]}", actualToStringResult);
    assertEquals(0.0d, ofResult.getTotalWeight());
    assertTrue(actualFixings.isEmpty());
  }

  /**
   * Test {@link IborAveragedRateComputation#equals(Object)}, and {@link
   * IborAveragedRateComputation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborAveragedRateComputation#equals(Object)}
   *   <li>{@link IborAveragedRateComputation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborAveragedRateComputation.equals(Object)",
    "int IborAveragedRateComputation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());
    IborAveragedRateComputation ofResult2 = IborAveragedRateComputation.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborAveragedRateComputation#equals(Object)}, and {@link
   * IborAveragedRateComputation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborAveragedRateComputation#equals(Object)}
   *   <li>{@link IborAveragedRateComputation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborAveragedRateComputation.equals(Object)",
    "int IborAveragedRateComputation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IborAveragedRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborAveragedRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborAveragedRateComputation.equals(Object)",
    "int IborAveragedRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link IborAveragedRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborAveragedRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborAveragedRateComputation.equals(Object)",
    "int IborAveragedRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    IborAveragedRateComputation ofResult = IborAveragedRateComputation.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to IborAveragedRateComputation");
  }
}
