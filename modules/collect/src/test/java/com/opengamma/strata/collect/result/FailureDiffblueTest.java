package com.opengamma.strata.collect.result;

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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.collect.result.Failure.Meta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FailureDiffblueTest {
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
    Class<? extends Failure> actualBeanTypeResult = Failure.meta().beanType();

    // Assert
    Class<Failure> expectedBeanTypeResult = Failure.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#items()}
   *   <li>{@link Meta#message()}
   *   <li>{@link Meta#reason()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.items()",
    "MetaProperty Meta.message()",
    "MetaProperty Meta.reason()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Failure.meta();

    // Act
    MetaProperty<ImmutableSet<FailureItem>> actualItemsResult = metaResult.items();
    MetaProperty<String> actualMessageResult = metaResult.message();

    // Assert
    assertTrue(actualItemsResult instanceof DirectMetaProperty);
    assertTrue(actualMessageResult instanceof DirectMetaProperty);
    assertTrue(metaResult.reason() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code items}.
   *   <li>Then return name is {@code items}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'items'; then return name is 'items'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenItems_thenReturnNameIsItems() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Failure.meta().metaPropertyGet("items");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    assertEquals("items", actualMetaPropertyGetResult.name());
    Class<ImmutableSet> expectedPropertyTypeResult = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).items());
    assertSame(metaBeanResult, messageResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code message}.
   *   <li>Then return name is {@code message}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'message'; then return name is 'message'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMessage_thenReturnNameIsMessage() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Failure.meta().metaPropertyGet("message");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableSet<FailureItem>> itemsResult = ((Meta) metaBeanResult).items();
    assertTrue(itemsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    assertEquals("message", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).message());
    assertSame(metaBeanResult, itemsResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
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
    assertNull(Failure.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code reason}.
   *   <li>Then return name is {@code reason}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'reason'; then return name is 'reason'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenReason_thenReturnNameIsReason() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Failure.meta().metaPropertyGet("reason");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableSet<FailureItem>> itemsResult = ((Meta) metaBeanResult).items();
    assertTrue(itemsResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("reason", actualMetaPropertyGetResult.name());
    Class<FailureReason> expectedPropertyTypeResult = FailureReason.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).reason());
    assertSame(metaBeanResult, itemsResult.metaBean());
    assertSame(metaBeanResult, messageResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Failure.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("reason");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("items");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("message");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("items", getResult2.name());
    assertEquals("message", getResult3.name());
    assertEquals("reason", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableSet> expectedPropertyTypeResult = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<Failure> expectedDeclaringTypeResult = Failure.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<Failure> expectedDeclaringTypeResult2 = Failure.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<Failure> expectedDeclaringTypeResult3 = Failure.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<FailureReason> expectedPropertyTypeResult2 = FailureReason.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<String> expectedPropertyTypeResult3 = String.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
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
    assertNull(Failure.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = Failure.meta();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(Failure.of(item), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code items}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'items'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenItems_thenReturnSet() {
    // Arrange
    Meta metaResult = Failure.meta();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(Failure.of(item), "items", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertEquals(1, ((Set<FailureItem>) actualPropertyGetResult).size());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code message}.
   *   <li>Then return {@code Message Template - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'message'; then return 'Message Template - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMessage_thenReturnMessageTemplateMessageArgs() {
    // Arrange
    Meta metaResult = Failure.meta();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertEquals(
        "Message Template - [Message Args]",
        metaResult.propertyGet(Failure.of(item), "message", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code reason}.
   *   <li>Then return {@link FailureReason}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'reason'; then return FailureReason")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenReason_thenReturnFailureReason() {
    // Arrange
    Meta metaResult = Failure.meta();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(Failure.of(item), "reason", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof FailureReason);
    assertEquals(FailureReason.MULTIPLE, actualPropertyGetResult);
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
        () -> Failure.meta().propertySet(mock(Bean.class), "items", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code items}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'items'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenItems_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Failure.meta().propertySet(mock(Bean.class), "items", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code message}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'message'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMessage_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Failure.meta().propertySet(mock(Bean.class), "message", "New Value", true));
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
        () -> Failure.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code reason}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'reason'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenReason_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Failure.meta().propertySet(mock(Bean.class), "reason", "New Value", true));
  }

  /**
   * Test {@link Failure#of(Collection)} with {@code Collection}.
   *
   * <p>Method under test: {@link Failure#of(Collection)}
   */
  @Test
  @DisplayName("Test of(Collection) with 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(Collection)"})
  void testOfWithCollection() {
    // Arrange
    ArrayList<FailureItem> items = new ArrayList<>();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    items.add(ofAutoStackTraceResult);
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    items.add(ofResult);

    // Act
    Failure actualOfResult = Failure.of(items);

    // Assert
    assertEquals(
        "Not all who wander are lost - [Message Args], items - [Message Args]",
        actualOfResult.getMessage());
    assertSame(ofAutoStackTraceResult, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return Message is {@code items - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Collection) with 'Collection'; then return Message is 'items - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(Collection)"})
  void testOfWithCollection_thenReturnMessageIsItemsMessageArgs() {
    // Arrange
    ArrayList<FailureItem> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    items.add(ofResult);

    // Act
    Failure actualOfResult = Failure.of(items);

    // Assert
    assertEquals("items - [Message Args]", actualOfResult.getMessage());
    assertEquals(1, actualOfResult.getItems().size());
    assertSame(ofResult, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return Message is {@code items - [Message Args], items - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Collection) with 'Collection'; then return Message is 'items - [Message Args], items - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(Collection)"})
  void testOfWithCollection_thenReturnMessageIsItemsMessageArgsItemsMessageArgs() {
    // Arrange
    ArrayList<FailureItem> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "items", "Message Args");
    items.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    items.add(ofResult2);

    // Act
    Failure actualOfResult = Failure.of(items);

    // Assert
    assertEquals("items - [Message Args], items - [Message Args]", actualOfResult.getMessage());
    assertEquals(2, actualOfResult.getItems().size());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals(FailureReason.ERROR, firstItem.getReason());
    assertSame(ofResult, firstItem);
  }

  /**
   * Test {@link Failure#of(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return Message is {@code , - [Message Args], items - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Collection) with 'Collection'; then return Message is ', - [Message Args], items - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(Collection)"})
  void testOfWithCollection_thenReturnMessageIsMessageArgsItemsMessageArgs() {
    // Arrange
    ArrayList<FailureItem> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), ", ", "Message Args");
    items.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    items.add(ofResult2);

    // Act
    Failure actualOfResult = Failure.of(items);

    // Assert
    assertEquals(",  - [Message Args], items - [Message Args]", actualOfResult.getMessage());
    assertSame(ofResult, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(Collection)} with {@code Collection}.
   *
   * <ul>
   *   <li>Then return Message is {@code reason - [Message Args], items - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Collection) with 'Collection'; then return Message is 'reason - [Message Args], items - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(Collection)"})
  void testOfWithCollection_thenReturnMessageIsReasonMessageArgsItemsMessageArgs() {
    // Arrange
    ArrayList<FailureItem> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "reason", "Message Args");
    items.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    items.add(ofResult2);

    // Act
    Failure actualOfResult = Failure.of(items);

    // Assert
    assertEquals("reason - [Message Args], items - [Message Args]", actualOfResult.getMessage());
    assertSame(ofResult, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(FailureItem, FailureItem[])} with {@code FailureItem}, {@code
   * FailureItem[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureItem, FailureItem[])}
   */
  @Test
  @DisplayName("Test of(FailureItem, FailureItem[]) with 'FailureItem', 'FailureItem[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureItem, FailureItem[])"})
  void testOfWithFailureItemFailureItem() {
    // Arrange
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            31, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Failure actualOfResult = Failure.of(item, ofResult);

    // Assert
    assertEquals(
        "Not all who wander are lost - [Message Args], Message Template - [Message Args]",
        actualOfResult.getMessage());
    assertSame(item, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(FailureItem, FailureItem[])} with {@code FailureItem}, {@code
   * FailureItem[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureItem, FailureItem[])}
   */
  @Test
  @DisplayName("Test of(FailureItem, FailureItem[]) with 'FailureItem', 'FailureItem[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureItem, FailureItem[])"})
  void testOfWithFailureItemFailureItem2() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "Message Template", "Message Args");
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Failure actualOfResult = Failure.of(item, ofResult);

    // Assert
    assertEquals(
        "Message Template - [Message Args], Message Template - [Message Args]",
        actualOfResult.getMessage());
    assertSame(item, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(FailureItem, FailureItem[])} with {@code FailureItem}, {@code
   * FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Message is a string.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(FailureItem, FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureItem, FailureItem[]) with 'FailureItem', 'FailureItem[]'; then return Message is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureItem, FailureItem[])"})
  void testOfWithFailureItemFailureItem_thenReturnMessageIsAString() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            31, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, cause, "Message Template", ofAutoStackTraceResult);
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Failure actualOfResult = Failure.of(item, ofResult);

    // Assert
    assertEquals(
        "Message Template - [MULTIPLE: Not all who wander are lost - [Message Args]], Message Template - [Message"
            + " Args]",
        actualOfResult.getMessage());
    assertSame(item, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(FailureItem)} with {@code FailureItem}.
   *
   * <ul>
   *   <li>Then return Message is {@code Message Template - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(FailureItem)}
   */
  @Test
  @DisplayName(
      "Test of(FailureItem) with 'FailureItem'; then return Message is 'Message Template - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureItem)"})
  void testOfWithFailureItem_thenReturnMessageIsMessageTemplateMessageArgs() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Failure actualOfResult = Failure.of(item);

    // Assert
    assertEquals("Message Template - [Message Args]", actualOfResult.getMessage());
    assertEquals(1, actualOfResult.getItems().size());
    assertEquals(FailureReason.MULTIPLE, actualOfResult.getReason());
    assertSame(item, actualOfResult.getFirstItem());
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(
            FailureReason.MULTIPLE, new Exception(), "Not all who wander are lost", "Message Args");

    // Assert
    assertEquals("Not all who wander are lost - [Message Args]", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals("Not all who wander are lost - [Message Args]", firstItem.getMessage());
    assertEquals("Not all who wander are lost - [Message Args]", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject2() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(FailureReason.MULTIPLE, new Exception(), "Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals("Not all who wander are lost", firstItem.getMessage());
    assertEquals("Not all who wander are lost", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject3() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(
            FailureReason.MULTIPLE,
            new Exception(),
            "Not all who wander are lost",
            "Message Args",
            "Message Args");

    // Assert
    assertEquals(
        "Not all who wander are lost - [Message Args, Message Args]", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals(
        "Not all who wander are lost - [Message Args, Message Args]", firstItem.getMessage());
    assertEquals(
        "Not all who wander are lost - [Message Args, Message Args]",
        firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject4() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(FailureReason.MULTIPLE, new Exception(), "{U}", "Message Args", "Message Args");

    // Assert
    assertEquals("Message Args - [Message Args]", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then return Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'; then return Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject_thenReturnMessageIsMessageArgs() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(FailureReason.MULTIPLE, new Exception(), "{U}", "Message Args");

    // Assert
    FailureItem firstItem = actualOfResult.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", actualOfResult.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Exception, String, Object[])} with {@code FailureReason},
   * {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return Message is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'; when '{U}'; then return Message is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Exception, String, Object[])"})
  void testOfWithFailureReasonExceptionStringObject_whenU_thenReturnMessageIsU() {
    // Arrange and Act
    Failure actualOfResult = Failure.of(FailureReason.MULTIPLE, new Exception(), "{U}");

    // Assert
    assertEquals("{U}", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals("{U}", firstItem.getMessage());
    assertEquals("{U}", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Throwable, String, Object[])} with {@code FailureReason},
   * {@code Throwable}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Throwable, String, Object[]) with 'FailureReason', 'Throwable', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Throwable, String, Object[])"})
  void testOfWithFailureReasonThrowableStringObject() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    assertEquals("Message Args - [Message Args]", actualOfResult.getMessage());
    FailureItem firstItem = actualOfResult.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#of(FailureReason, Throwable, String, Object[])} with {@code FailureReason},
   * {@code Throwable}, {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then return Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Failure#of(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Throwable, String, Object[]) with 'FailureReason', 'Throwable', 'String', 'Object[]'; then return Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Failure.of(FailureReason, Throwable, String, Object[])"})
  void testOfWithFailureReasonThrowableStringObject_thenReturnMessageIsMessageArgs() {
    // Arrange and Act
    Failure actualOfResult =
        Failure.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Assert
    FailureItem firstItem = actualOfResult.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", actualOfResult.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Failure#getFirstItem()}.
   *
   * <p>Method under test: {@link Failure#getFirstItem()}
   */
  @Test
  @DisplayName("Test getFirstItem()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem Failure.getFirstItem()"})
  void testGetFirstItem() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(item, Failure.of(item).getFirstItem());
  }

  /**
   * Test {@link Failure#meta()}.
   *
   * <p>Method under test: {@link Failure#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Failure.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Failure.meta();

    // Assert
    MetaProperty<ImmutableSet<FailureItem>> itemsResult = actualMetaResult.items();
    assertTrue(itemsResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = actualMetaResult.message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = actualMetaResult.reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    assertEquals("items", itemsResult.name());
    assertEquals("message", messageResult.name());
    assertEquals("reason", reasonResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, itemsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, messageResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, reasonResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableSet> expectedPropertyTypeResult = ImmutableSet.class;
    assertEquals(expectedPropertyTypeResult, itemsResult.propertyType());
    Class<Failure> expectedDeclaringTypeResult = Failure.class;
    assertEquals(expectedDeclaringTypeResult, itemsResult.declaringType());
    Class<Failure> expectedDeclaringTypeResult2 = Failure.class;
    assertEquals(expectedDeclaringTypeResult2, messageResult.declaringType());
    Class<Failure> expectedDeclaringTypeResult3 = Failure.class;
    assertEquals(expectedDeclaringTypeResult3, reasonResult.declaringType());
    Class<FailureReason> expectedPropertyTypeResult2 = FailureReason.class;
    assertEquals(expectedPropertyTypeResult2, reasonResult.propertyType());
    Class<String> expectedPropertyTypeResult3 = String.class;
    assertEquals(expectedPropertyTypeResult3, messageResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, itemsResult.metaBean());
    assertSame(meta, messageResult.metaBean());
    assertSame(meta, reasonResult.metaBean());
  }

  /**
   * Test {@link Failure#metaBean()}.
   *
   * <p>Method under test: {@link Failure#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Failure.metaBean()"})
  void testMetaBean() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(Meta.INSTANCE, Failure.of(item).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Failure#toString()}
   *   <li>{@link Failure#getItems()}
   *   <li>{@link Failure#getMessage()}
   *   <li>{@link Failure#getReason()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet Failure.getItems()",
    "String Failure.getMessage()",
    "FailureReason Failure.getReason()",
    "String Failure.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure ofResult = Failure.of(item);

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableSet<FailureItem> actualItems = ofResult.getItems();
    String actualMessage = ofResult.getMessage();

    // Assert
    assertEquals(
        "Failure{reason=MULTIPLE, message=Message Template - [Message Args], items=[MULTIPLE: Message Template"
            + " - [Message Args]: java.lang.Throwable]}",
        actualToStringResult);
    assertEquals("Message Template - [Message Args]", actualMessage);
    assertEquals(1, actualItems.size());
    assertEquals(FailureReason.MULTIPLE, ofResult.getReason());
  }

  /**
   * Test {@link Failure#equals(Object)}, and {@link Failure#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Failure#equals(Object)}
   *   <li>{@link Failure#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure ofResult = Failure.of(item);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link Failure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Failure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Failure ofResult = Failure.of(item);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(ofResult, Failure.of(item2));
  }

  /**
   * Test {@link Failure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Failure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "Message Template", "Message Args");
    Failure ofResult = Failure.of(item);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(ofResult, Failure.of(item2));
  }

  /**
   * Test {@link Failure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Failure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FailureItem item =
        FailureItem.of(
            FailureReason.MULTIPLE,
            new Throwable("Not all who wander are lost"),
            "Message Template",
            "Message Args");
    Failure ofResult = Failure.of(item);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(ofResult, Failure.of(item2));
  }

  /**
   * Test {@link Failure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Failure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(Failure.of(item), null);
  }

  /**
   * Test {@link Failure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Failure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Failure.equals(Object)", "int Failure.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(Failure.of(item), "Different type to Failure");
  }
}
