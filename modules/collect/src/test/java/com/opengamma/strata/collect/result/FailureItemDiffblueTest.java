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
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.result.FailureItem.Meta;
import java.util.HashMap;
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

class FailureItemDiffblueTest {
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
    Class<? extends FailureItem> actualBeanTypeResult = FailureItem.meta().beanType();

    // Assert
    Class<FailureItem> expectedBeanTypeResult = FailureItem.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#attributes()}
   *   <li>{@link Meta#causeType()}
   *   <li>{@link Meta#message()}
   *   <li>{@link Meta#reason()}
   *   <li>{@link Meta#stackTrace()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.attributes()",
    "MetaProperty Meta.causeType()",
    "MetaProperty Meta.message()",
    "MetaProperty Meta.reason()",
    "MetaProperty Meta.stackTrace()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FailureItem.meta();

    // Act
    MetaProperty<ImmutableMap<String, String>> actualAttributesResult = metaResult.attributes();
    MetaProperty<Class<? extends Throwable>> actualCauseTypeResult = metaResult.causeType();
    MetaProperty<String> actualMessageResult = metaResult.message();
    MetaProperty<FailureReason> actualReasonResult = metaResult.reason();

    // Assert
    assertTrue(actualAttributesResult instanceof DirectMetaProperty);
    assertTrue(actualCauseTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMessageResult instanceof DirectMetaProperty);
    assertTrue(actualReasonResult instanceof DirectMetaProperty);
    assertTrue(metaResult.stackTrace() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return name is {@code attributes}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'attributes'; then return name is 'attributes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAttributes_thenReturnNameIsAttributes() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FailureItem.meta().metaPropertyGet("attributes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Class<? extends Throwable>> causeTypeResult = ((Meta) metaBeanResult).causeType();
    assertTrue(causeTypeResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    MetaProperty<String> stackTraceResult = ((Meta) metaBeanResult).stackTrace();
    assertTrue(stackTraceResult instanceof DirectMetaProperty);
    assertEquals("attributes", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).attributes());
    assertSame(metaBeanResult, causeTypeResult.metaBean());
    assertSame(metaBeanResult, messageResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
    assertSame(metaBeanResult, stackTraceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code causeType}.
   *   <li>Then return name is {@code causeType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'causeType'; then return name is 'causeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCauseType_thenReturnNameIsCauseType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FailureItem.meta().metaPropertyGet("causeType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<String, String>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    MetaProperty<String> stackTraceResult = ((Meta) metaBeanResult).stackTrace();
    assertTrue(stackTraceResult instanceof DirectMetaProperty);
    assertEquals("causeType", actualMetaPropertyGetResult.name());
    Class<Class> expectedPropertyTypeResult = Class.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).causeType());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, messageResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
    assertSame(metaBeanResult, stackTraceResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = FailureItem.meta().metaPropertyGet("message");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<String, String>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<Class<? extends Throwable>> causeTypeResult = ((Meta) metaBeanResult).causeType();
    assertTrue(causeTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    MetaProperty<String> stackTraceResult = ((Meta) metaBeanResult).stackTrace();
    assertTrue(stackTraceResult instanceof DirectMetaProperty);
    assertEquals("message", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).message());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, causeTypeResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
    assertSame(metaBeanResult, stackTraceResult.metaBean());
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
    assertNull(FailureItem.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = FailureItem.meta().metaPropertyGet("reason");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<String, String>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<Class<? extends Throwable>> causeTypeResult = ((Meta) metaBeanResult).causeType();
    assertTrue(causeTypeResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> stackTraceResult = ((Meta) metaBeanResult).stackTrace();
    assertTrue(stackTraceResult instanceof DirectMetaProperty);
    assertEquals("reason", actualMetaPropertyGetResult.name());
    Class<FailureReason> expectedPropertyTypeResult = FailureReason.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).reason());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, causeTypeResult.metaBean());
    assertSame(metaBeanResult, messageResult.metaBean());
    assertSame(metaBeanResult, stackTraceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code stackTrace}.
   *   <li>Then return name is {@code stackTrace}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'stackTrace'; then return name is 'stackTrace'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStackTrace_thenReturnNameIsStackTrace() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = FailureItem.meta().metaPropertyGet("stackTrace");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<String, String>> attributesResult =
        ((Meta) metaBeanResult).attributes();
    assertTrue(attributesResult instanceof DirectMetaProperty);
    MetaProperty<Class<? extends Throwable>> causeTypeResult = ((Meta) metaBeanResult).causeType();
    assertTrue(causeTypeResult instanceof DirectMetaProperty);
    MetaProperty<String> messageResult = ((Meta) metaBeanResult).message();
    assertTrue(messageResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<FailureReason> reasonResult = ((Meta) metaBeanResult).reason();
    assertTrue(reasonResult instanceof DirectMetaProperty);
    assertEquals("stackTrace", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).stackTrace());
    assertSame(metaBeanResult, attributesResult.metaBean());
    assertSame(metaBeanResult, causeTypeResult.metaBean());
    assertSame(metaBeanResult, messageResult.metaBean());
    assertSame(metaBeanResult, reasonResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = FailureItem.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("attributes") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("causeType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("message") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("reason") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("stackTrace") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'attributes'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAttributes_thenReturnMap() {
    // Arrange
    Meta metaResult = FailureItem.meta();
    FailureItem bean =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "attributes", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertEquals(1, ((Map<String, String>) actualPropertyGetResult).size());
    assertEquals(
        "Throwable",
        ((Map<String, String>) actualPropertyGetResult)
            .get(FailureAttributeKeys.EXCEPTION_MESSAGE));
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
    assertNull(FailureItem.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code causeType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'causeType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCauseType_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = FailureItem.meta();
    FailureItem bean =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "causeType", true));
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
    Meta metaResult = FailureItem.meta();
    FailureItem bean =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
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
    Meta metaResult = FailureItem.meta();
    FailureItem bean =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertEquals(
        "Message Template - [Message Args]", metaResult.propertyGet(bean, "message", true));
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
    Meta metaResult = FailureItem.meta();
    FailureItem bean =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "reason", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof FailureReason);
    assertEquals(FailureReason.MULTIPLE, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'attributes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAttributes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FailureItem.meta().propertySet(mock(Bean.class), "attributes", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code causeType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'causeType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCauseType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FailureItem.meta().propertySet(mock(Bean.class), "causeType", "New Value", true));
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
        () -> FailureItem.meta().propertySet(mock(Bean.class), "attributes", "New Value", false));
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
        () -> FailureItem.meta().propertySet(mock(Bean.class), "message", "New Value", true));
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
        () -> FailureItem.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> FailureItem.meta().propertySet(mock(Bean.class), "reason", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code stackTrace}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'stackTrace'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStackTrace_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FailureItem.meta().propertySet(mock(Bean.class), "stackTrace", "New Value", true));
  }

  /**
   * Test {@link FailureItem#of(FailureReason, Throwable, String, Object[])} with {@code reason},
   * {@code cause}, {@code messageTemplate}, {@code messageArgs}.
   *
   * <p>Method under test: {@link FailureItem#of(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Throwable, String, Object[]) with 'reason', 'cause', 'messageTemplate', 'messageArgs'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.of(FailureReason, Throwable, String, Object[])"})
  void testOfWithReasonCauseMessageTemplateMessageArgs() {
    // Arrange and Act
    FailureItem actualOfResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    assertEquals("Message Args - [Message Args]", actualOfResult.getMessage());
    ImmutableMap<String, String> attributes = actualOfResult.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureItem.EXCEPTION_MESSAGE_ATTRIBUTE));
  }

  /**
   * Test {@link FailureItem#of(FailureReason, Throwable, String, Object[])} with {@code reason},
   * {@code cause}, {@code messageTemplate}, {@code messageArgs}.
   *
   * <ul>
   *   <li>Then return Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#of(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test of(FailureReason, Throwable, String, Object[]) with 'reason', 'cause', 'messageTemplate', 'messageArgs'; then return Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.of(FailureReason, Throwable, String, Object[])"})
  void testOfWithReasonCauseMessageTemplateMessageArgs_thenReturnMessageIsMessageArgs() {
    // Arrange and Act
    FailureItem actualOfResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Assert
    ImmutableMap<String, String> attributes = actualOfResult.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", actualOfResult.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureItem.EXCEPTION_MESSAGE_ATTRIBUTE));
  }

  /**
   * Test {@link FailureItem#getMessageTemplate()}.
   *
   * <p>Method under test: {@link FailureItem#getMessageTemplate()}
   */
  @Test
  @DisplayName("Test getMessageTemplate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FailureItem.getMessageTemplate()"})
  void testGetMessageTemplate() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "{exceptionMessage}", "Message Args");

    // Act and Assert
    assertEquals("{exceptionMessage}", ofResult.getMessageTemplate());
  }

  /**
   * Test {@link FailureItem#getMessageTemplate()}.
   *
   * <p>Method under test: {@link FailureItem#getMessageTemplate()}
   */
  @Test
  @DisplayName("Test getMessageTemplate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FailureItem.getMessageTemplate()"})
  void testGetMessageTemplate2() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE,
            new Throwable(),
            "{exceptionMessage}",
            "Message Args",
            "Message Args");

    // Act and Assert
    assertEquals("{exceptionMessage}", ofResult.getMessageTemplate());
  }

  /**
   * Test {@link FailureItem#getMessageTemplate()}.
   *
   * <ul>
   *   <li>Then return {@code Message Template - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#getMessageTemplate()}
   */
  @Test
  @DisplayName("Test getMessageTemplate(); then return 'Message Template - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FailureItem.getMessageTemplate()"})
  void testGetMessageTemplate_thenReturnMessageTemplateMessageArgs() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertEquals("Message Template - [Message Args]", ofResult.getMessageTemplate());
  }

  /**
   * Test {@link FailureItem#getMessageTemplate()}.
   *
   * <ul>
   *   <li>Then return {@code Not all who wander are lost - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#getMessageTemplate()}
   */
  @Test
  @DisplayName(
      "Test getMessageTemplate(); then return 'Not all who wander are lost - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FailureItem.getMessageTemplate()"})
  void testGetMessageTemplate_thenReturnNotAllWhoWanderAreLostMessageArgs() {
    // Arrange
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act and Assert
    assertEquals(
        "Not all who wander are lost - [Message Args]",
        ofAutoStackTraceResult.getMessageTemplate());
  }

  /**
   * Test {@link FailureItem#withAttribute(String, String)}.
   *
   * <ul>
   *   <li>Then return Attributes size is three.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#withAttribute(String, String)}
   */
  @Test
  @DisplayName("Test withAttribute(String, String); then return Attributes size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.withAttribute(String, String)"})
  void testWithAttribute_thenReturnAttributesSizeIsThree() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "{exceptionMessage}", "Message Args");

    // Act
    FailureItem actualWithAttributeResult = ofResult.withAttribute("Key", "42");

    // Assert
    ImmutableMap<String, String> attributes = actualWithAttributeResult.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get(FailureItem.EXCEPTION_MESSAGE_ATTRIBUTE));
    assertEquals("Message Args", actualWithAttributeResult.getMessage());
    assertEquals("exceptionMessage:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertEquals("{exceptionMessage}", actualWithAttributeResult.getMessageTemplate());
    assertTrue(attributes.containsKey("Key"));
  }

  /**
   * Test {@link FailureItem#withAttribute(String, String)}.
   *
   * <ul>
   *   <li>Then return Message is {@code Message Template - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#withAttribute(String, String)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(String, String); then return Message is 'Message Template - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.withAttribute(String, String)"})
  void testWithAttribute_thenReturnMessageIsMessageTemplateMessageArgs() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    FailureItem actualWithAttributeResult = ofResult.withAttribute("Key", "42");

    // Assert
    assertEquals("Message Template - [Message Args]", actualWithAttributeResult.getMessage());
    assertEquals(
        "Message Template - [Message Args]", actualWithAttributeResult.getMessageTemplate());
    ImmutableMap<String, String> attributes = actualWithAttributeResult.getAttributes();
    assertEquals(2, attributes.size());
    assertEquals("Throwable", attributes.get(FailureItem.EXCEPTION_MESSAGE_ATTRIBUTE));
    assertTrue(attributes.containsKey("Key"));
  }

  /**
   * Test {@link FailureItem#withAttributes(Map)}.
   *
   * <p>Method under test: {@link FailureItem#withAttributes(Map)}
   */
  @Test
  @DisplayName("Test withAttributes(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.withAttributes(Map)"})
  void testWithAttributes() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    FailureItem actualWithAttributesResult = ofResult.withAttributes(new HashMap<>());

    // Assert
    assertEquals(ofResult, actualWithAttributesResult);
  }

  /**
   * Test {@link FailureItem#withAttributes(Map)}.
   *
   * <p>Method under test: {@link FailureItem#withAttributes(Map)}
   */
  @Test
  @DisplayName("Test withAttributes(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItem.withAttributes(Map)"})
  void testWithAttributes2() {
    // Arrange
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act
    FailureItem actualWithAttributesResult = ofAutoStackTraceResult.withAttributes(new HashMap<>());

    // Assert
    assertEquals(ofAutoStackTraceResult, actualWithAttributesResult);
  }

  /**
   * Test {@link FailureItem#summarizeStackTrace()}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#summarizeStackTrace()}
   */
  @Test
  @DisplayName("Test summarizeStackTrace(); then return get() is 'java.lang.Throwable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FailureItem.summarizeStackTrace()"})
  void testSummarizeStackTrace_thenReturnGetIsJavaLangThrowable() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Optional<String> actualSummarizeStackTraceResult = ofResult.summarizeStackTrace();

    // Assert
    assertEquals("java.lang.Throwable", actualSummarizeStackTraceResult.get());
    assertTrue(actualSummarizeStackTraceResult.isPresent());
  }

  /**
   * Test {@link FailureItem#summarizeStackTrace()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#summarizeStackTrace()}
   */
  @Test
  @DisplayName("Test summarizeStackTrace(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FailureItem.summarizeStackTrace()"})
  void testSummarizeStackTrace_thenReturnNotPresent() {
    // Arrange
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            19, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act and Assert
    assertFalse(ofAutoStackTraceResult.summarizeStackTrace().isPresent());
  }

  /**
   * Test {@link FailureItem#meta()}.
   *
   * <p>Method under test: {@link FailureItem#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FailureItem.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FailureItem.meta();

    // Assert
    assertTrue(actualMetaResult.attributes() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.causeType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.message() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.reason() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.stackTrace() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link FailureItem#metaBean()}.
   *
   * <p>Method under test: {@link FailureItem#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FailureItem.metaBean()"})
  void testMetaBean() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link FailureItem#getCauseType()}.
   *
   * <p>Method under test: {@link FailureItem#getCauseType()}
   */
  @Test
  @DisplayName("Test getCauseType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FailureItem.getCauseType()"})
  void testGetCauseType() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Optional<Class<? extends Throwable>> actualCauseType = ofResult.getCauseType();

    // Assert
    assertTrue(actualCauseType.isPresent());
    Class<Throwable> expectedGetResult = Throwable.class;
    assertEquals(expectedGetResult, actualCauseType.get());
  }

  /**
   * Test {@link FailureItem#equals(Object)}, and {@link FailureItem#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FailureItem#equals(Object)}
   *   <li>{@link FailureItem#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act and Assert
    assertNotEquals(
        ofAutoStackTraceResult,
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"));
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(
        ofResult,
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"));
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE,
            new Throwable("Not all who wander are lost"),
            "Message Template",
            "Message Args");

    // Act and Assert
    assertNotEquals(
        ofResult,
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"));
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Throwable cause = new Throwable();
    cause.addSuppressed(new Throwable());
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, cause, "Message Template", "Message Args");

    // Act and Assert
    assertNotEquals(
        ofResult,
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"));
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"),
        null);
  }

  /**
   * Test {@link FailureItem#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FailureItem#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FailureItem.equals(Object)", "int FailureItem.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args"),
        "Different type to FailureItem");
  }
}
