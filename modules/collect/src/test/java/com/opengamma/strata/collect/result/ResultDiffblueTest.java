package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.result.Result.Meta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ResultDiffblueTest {
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act
    Class<? extends Result<Object>> actualBeanTypeResult = metaResultResult.beanType();

    // Assert
    Class<Result> expectedBeanTypeResult = Result.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#failure()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.failure()", "MetaProperty Meta.value()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Result.meta();

    // Act
    MetaProperty<Failure> actualFailureResult = metaResult.failure();

    // Assert
    assertTrue(actualFailureResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code failure}.
   *   <li>Then metaBean value return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'failure'; then metaBean value return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFailure_thenMetaBeanValueReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult = metaResultResult.metaPropertyGet("failure");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = ((Meta<Object>) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failure", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<Failure> expectedPropertyTypeResult = Failure.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<Result> expectedDeclaringTypeResult = Result.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).failure());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertNull(metaResultResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@link FailureAttributeKeys#VALUE}.
   *   <li>Then metaBean failure return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when VALUE; then metaBean failure return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenMetaBeanFailureReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaResultResult.metaPropertyGet(FailureAttributeKeys.VALUE);

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Failure> failureResult = ((Meta<Object>) metaBeanResult).failure();
    assertTrue(failureResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("failure", failureResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failureResult.style());
    Class<Failure> expectedPropertyTypeResult = Failure.class;
    assertEquals(expectedPropertyTypeResult, failureResult.propertyType());
    Class<Result> expectedDeclaringTypeResult = Result.class;
    assertEquals(expectedDeclaringTypeResult, failureResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).value());
    assertSame(Meta.INSTANCE, failureResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = metaResultResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get(FailureAttributeKeys.VALUE);
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("failure");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("failure", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Failure> expectedPropertyTypeResult = Failure.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<Result> expectedDeclaringTypeResult = Result.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<Result> expectedDeclaringTypeResult2 = Result.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, getResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnFailureWithItemIsFailureItem() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);
    Result<Object> bean = Result.failure(failure);

    // Act and Assert
    assertSame(failure, metaResultResult.propertyGet(bean, "failure", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertNull(metaResultResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> bean = Result.failure(Failure.of(item));

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResultResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code failure}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'failure'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFailure_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertDoesNotThrow(
        () -> metaResultResult.propertySet(mock(Bean.class), "failure", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> metaResultResult.propertySet(mock(Bean.class), "failure", "New Value", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResultResult.propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@link FailureAttributeKeys#VALUE}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when VALUE; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaResultResult = Result.metaResult(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaResultResult.propertySet(
                mock(Bean.class), FailureAttributeKeys.VALUE, "New Value", true));
  }

  /**
   * Test {@link Result#success(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#success(Object)}
   */
  @Test
  @DisplayName("Test success(Object); when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.success(Object)"})
  void testSuccess_whenValue_thenReturnValue() {
    // Arrange and Act
    Result<Object> actualSuccessResult = Result.success("Value");

    // Assert
    assertEquals("Value", actualSuccessResult.getValue());
    Optional<Object> getResult = actualSuccessResult.get();
    assertEquals("Value", getResult.get());
    assertFalse(actualSuccessResult.isFailure());
    assertTrue(actualSuccessResult.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link Result#failure(Exception, String, Object[])} with {@code Exception}, {@code
   * String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(Exception, String, Object[])}
   */
  @Test
  @DisplayName("Test failure(Exception, String, Object[]) with 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Exception, String, Object[])"})
  void testFailureWithExceptionStringObject() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(new Exception(), "{U}", "Message Args", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Message Args - [Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(Exception, String, Object[])} with {@code Exception}, {@code
   * String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return Failure Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(Exception, String, Object[]) with 'Exception', 'String', 'Object[]'; when '{U}'; then return Failure Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Exception, String, Object[])"})
  void testFailureWithExceptionStringObject_whenU_thenReturnFailureMessageIsMessageArgs() {
    // Arrange and Act
    Result<Object> actualFailureResult = Result.failure(new Exception(), "{U}", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    FailureItem firstItem = failure.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", failure.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(Failure)} with {@code Failure}.
   *
   * <p>Method under test: {@link Result#failure(Failure)}
   */
  @Test
  @DisplayName("Test failure(Failure) with 'Failure'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Failure)"})
  void testFailureWithFailure() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);

    // Act
    Result<Object> actualFailureResult = Result.failure(failure);

    // Assert
    assertFalse(actualFailureResult.isSuccess());
    assertFalse(actualFailureResult.get().isPresent());
    assertTrue(actualFailureResult.isFailure());
    assertSame(failure, actualFailureResult.getFailure());
  }

  /**
   * Test {@link Result#failure(FailureItem)} with {@code FailureItem}.
   *
   * <ul>
   *   <li>Then return Failure Message is {@code Message Template - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(FailureItem)}
   */
  @Test
  @DisplayName(
      "Test failure(FailureItem) with 'FailureItem'; then return Failure Message is 'Message Template - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureItem)"})
  void testFailureWithFailureItem_thenReturnFailureMessageIsMessageTemplateMessageArgs() {
    // Arrange
    FailureItem failureItem =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    Result<Object> actualFailureResult = Result.failure(failureItem);

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Message Template - [Message Args]", failure.getMessage());
    assertEquals(1, failure.getItems().size());
    assertEquals(FailureReason.MULTIPLE, failure.getReason());
    assertFalse(actualFailureResult.isSuccess());
    assertFalse(actualFailureResult.get().isPresent());
    assertTrue(actualFailureResult.isFailure());
    assertSame(failureItem, failure.getFirstItem());
  }

  /**
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(
            FailureReason.MULTIPLE, new Exception(), "Not all who wander are lost", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Not all who wander are lost - [Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Not all who wander are lost - [Message Args]", firstItem.getMessage());
    assertEquals("Not all who wander are lost - [Message Args]", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject2() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(FailureReason.MULTIPLE, new Exception(), "Not all who wander are lost");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Not all who wander are lost", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Not all who wander are lost", firstItem.getMessage());
    assertEquals("Not all who wander are lost", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject3() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(
            FailureReason.MULTIPLE,
            new Exception(),
            "Not all who wander are lost",
            "Message Args",
            "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals(
        "Not all who wander are lost - [Message Args, Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
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
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject4() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(FailureReason.MULTIPLE, new Exception(), "{U}", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    FailureItem firstItem = failure.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", failure.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject5() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(
            FailureReason.MULTIPLE, new Exception(), "{U}", "Message Args", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Message Args - [Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Exception, String, Object[])} with {@code
   * FailureReason}, {@code Exception}, {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>Then return Failure Message is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Exception, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Exception, String, Object[]) with 'FailureReason', 'Exception', 'String', 'Object[]'; then return Failure Message is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Exception, String, Object[])"})
  void testFailureWithFailureReasonExceptionStringObject_thenReturnFailureMessageIsU() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(FailureReason.MULTIPLE, new Exception(), "{U}");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("{U}", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("{U}", firstItem.getMessage());
    assertEquals("{U}", firstItem.getMessageTemplate());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Throwable)} with {@code FailureReason}, {@code
   * Throwable}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Throwable)}
   */
  @Test
  @DisplayName("Test failure(FailureReason, Throwable) with 'FailureReason', 'Throwable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Throwable)"})
  void testFailureWithFailureReasonThrowable() {
    // Arrange
    Throwable cause = new Throwable();
    StackTraceElement stackTraceElement = new StackTraceElement("{U}", "{U}", "foo.txt", 2);
    cause.setStackTrace(new StackTraceElement[] {stackTraceElement});

    // Act
    Result<Object> actualFailureResult = Result.failure(FailureReason.MULTIPLE, cause);

    // Assert
    Failure failure = actualFailureResult.getFailure();
    FailureItem firstItem = failure.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(1, attributes.size());
    assertEquals("Throwable", attributes.get(FailureAttributeKeys.EXCEPTION_MESSAGE));
    assertEquals("Throwable", failure.getMessage());
    assertEquals("Throwable", firstItem.getMessage());
    assertEquals("Throwable", firstItem.getMessageTemplate());
    assertEquals("java.lang.Throwable\n\tat {U}.{U}(foo.txt:2)\n", firstItem.getStackTrace());
  }

  /**
   * Test {@link Result#failure(FailureReason, Throwable, String, Object[])} with {@code
   * FailureReason}, {@code Throwable}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Throwable, String, Object[]) with 'FailureReason', 'Throwable', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Throwable, String, Object[])"})
  void testFailureWithFailureReasonThrowableStringObject() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    FailureItem firstItem = failure.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", failure.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(FailureReason, Throwable, String, Object[])} with {@code
   * FailureReason}, {@code Throwable}, {@code String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(FailureReason, Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(FailureReason, Throwable, String, Object[]) with 'FailureReason', 'Throwable', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(FailureReason, Throwable, String, Object[])"})
  void testFailureWithFailureReasonThrowableStringObject2() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(
            FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Message Args - [Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(Iterable)} with {@code Iterable}.
   *
   * <p>Method under test: {@link Result#failure(Iterable)}
   */
  @Test
  @DisplayName("Test failure(Iterable) with 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Iterable)"})
  void testFailureWithIterable() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "results", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "results", "Message Args");
    Result<?> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualFailureResult = Result.failure(results);

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("results - [Message Args], results - [Message Args]", failure.getMessage());
    assertEquals(2, failure.getItems().size());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#failure(Iterable)} with {@code Iterable}.
   *
   * <p>Method under test: {@link Result#failure(Iterable)}
   */
  @Test
  @DisplayName("Test failure(Iterable) with 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Iterable)"})
  void testFailureWithIterable2() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "items", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "results", "Message Args");
    Result<?> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualFailureResult = Result.failure(results);

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("items - [Message Args], results - [Message Args]", failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#failure(Iterable)} with {@code Iterable}.
   *
   * <p>Method under test: {@link Result#failure(Iterable)}
   */
  @Test
  @DisplayName("Test failure(Iterable) with 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Iterable)"})
  void testFailureWithIterable3() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "results", "Message Args");
    Result<?> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualFailureResult = Result.failure(results);

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals(
        "Not all who wander are lost - [Message Args], results - [Message Args]",
        failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#failure(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Iterable)}
   */
  @Test
  @DisplayName(
      "Test failure(Iterable) with 'Iterable'; given failure 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Iterable)"})
  void testFailureWithIterable_givenFailureNull_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    Result<?> failureResult = Result.failure((Failure) null);
    results.add(failureResult);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Result.failure(results));
  }

  /**
   * Test {@link Result#failure(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return failure {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Iterable)}
   */
  @Test
  @DisplayName(
      "Test failure(Iterable) with 'Iterable'; then return failure Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Iterable)"})
  void testFailureWithIterable_thenReturnFailureFailureWithItemIsFailureItem() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "results", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act
    Result<Object> actualFailureResult = Result.failure(results);

    // Assert
    assertEquals(failureResult, actualFailureResult);
  }

  /**
   * Test {@link Result#failure(Result, Result, Result[])} with {@code Result}, {@code Result},
   * {@code Result[]}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Result, Result, Result[])}
   */
  @Test
  @DisplayName(
      "Test failure(Result, Result, Result[]) with 'Result', 'Result', 'Result[]'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Result, Result, Result[])"})
  void testFailureWithResultResultResult_thenThrowIllegalArgumentException() {
    // Arrange
    Result<?> result1 = Result.failure((Failure) null);
    Result<?> result2 = Result.failure((Failure) null);
    Result<?> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Result.failure(result1, result2, failureResult));
  }

  /**
   * Test {@link Result#failure(Result, Result, Result[])} with {@code Result}, {@code Result},
   * {@code Result[]}.
   *
   * <ul>
   *   <li>When failure {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Result, Result, Result[])}
   */
  @Test
  @DisplayName(
      "Test failure(Result, Result, Result[]) with 'Result', 'Result', 'Result[]'; when failure 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Result, Result, Result[])"})
  void testFailureWithResultResultResult_whenFailureNull() {
    // Arrange
    Result<?> result1 = Result.failure((Failure) null);
    Result<?> result2 = Result.failure((Failure) null);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualFailureResult = Result.failure(result1, result2, failureResult);

    // Assert
    assertEquals(failureResult, actualFailureResult);
  }

  /**
   * Test {@link Result#failure(Result)} with {@code Result}.
   *
   * <ul>
   *   <li>Then return not Success.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Result)}
   */
  @Test
  @DisplayName("Test failure(Result) with 'Result'; then return not Success")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Result)"})
  void testFailureWithResult_thenReturnNotSuccess() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);
    Result<?> failureResult = Result.failure(failure);

    // Act
    Result<Object> actualFailureResult = Result.failure(failureResult);

    // Assert
    assertFalse(actualFailureResult.isSuccess());
    assertFalse(actualFailureResult.get().isPresent());
    assertTrue(actualFailureResult.isFailure());
    assertSame(failure, actualFailureResult.getFailure());
  }

  /**
   * Test {@link Result#failure(Throwable, String, Object[])} with {@code Throwable}, {@code
   * String}, {@code Object[]}.
   *
   * <p>Method under test: {@link Result#failure(Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test failure(Throwable, String, Object[]) with 'Throwable', 'String', 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Throwable, String, Object[])"})
  void testFailureWithThrowableStringObject() {
    // Arrange and Act
    Result<Object> actualFailureResult =
        Result.failure(new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    assertEquals("Message Args - [Message Args]", failure.getMessage());
    FailureItem firstItem = failure.getFirstItem();
    assertEquals("Message Args - [Message Args]", firstItem.getMessage());
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#failure(Throwable, String, Object[])} with {@code Throwable}, {@code
   * String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return Failure Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Result#failure(Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test failure(Throwable, String, Object[]) with 'Throwable', 'String', 'Object[]'; when '{U}'; then return Failure Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.failure(Throwable, String, Object[])"})
  void testFailureWithThrowableStringObject_whenU_thenReturnFailureMessageIsMessageArgs() {
    // Arrange and Act
    Result<Object> actualFailureResult = Result.failure(new Throwable(), "{U}", "Message Args");

    // Assert
    Failure failure = actualFailureResult.getFailure();
    FailureItem firstItem = failure.getFirstItem();
    ImmutableMap<String, String> attributes = firstItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("Message Args", attributes.get("U"));
    assertEquals("Message Args", failure.getMessage());
    assertEquals("Message Args", firstItem.getMessage());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link Result#ofNullable(Object, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofNullable(Object, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofNullable(Object, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofNullable(Object, FailureReason, String, Object[])"})
  void testOfNullableWithValueReasonMessageMessageArgs_whenValue_thenReturnValue() {
    // Arrange and Act
    Result<Object> actualOfNullableResult =
        Result.ofNullable(
            "Value", FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Assert
    assertEquals("Value", actualOfNullableResult.getValue());
    Optional<Object> getResult = actualOfNullableResult.get();
    assertEquals("Value", getResult.get());
    assertFalse(actualOfNullableResult.isFailure());
    assertTrue(actualOfNullableResult.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link Result#ofNullable(Object)} with {@code value}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofNullable(Object)}
   */
  @Test
  @DisplayName("Test ofNullable(Object) with 'value'; when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofNullable(Object)"})
  void testOfNullableWithValue_whenValue_thenReturnValue() {
    // Arrange and Act
    Result<Object> actualOfNullableResult = Result.ofNullable("Value");

    // Assert
    assertEquals("Value", actualOfNullableResult.getValue());
    Optional<Object> getResult = actualOfNullableResult.get();
    assertEquals("Value", getResult.get());
    assertFalse(actualOfNullableResult.isFailure());
    assertTrue(actualOfNullableResult.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs() {
    // Arrange
    Optional<Object> value = Optional.of("Value");
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(
            value, FailureReason.MULTIPLE, "Not all who wander are lost", failureResult);

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs2() {
    // Arrange
    Optional<Object> value = Optional.of("Value");
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(
            value, FailureReason.MULTIPLE, "Not all who wander are lost", failureResult);

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs3() {
    // Arrange
    Optional<Object> value = Optional.of("Value");
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(value, FailureReason.MULTIPLE, "{U}", failureResult);

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>Then return Value is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; then return Value is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_thenReturnValueIsU() {
    // Arrange
    Optional<Object> value = Optional.of("{U}");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(
            value, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Assert
    assertEquals("{U}", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code Message Args} and {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'Message Args' and 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenMessageArgsAndMessageArgs() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(
            value,
            FailureReason.MULTIPLE,
            "Not all who wander are lost",
            "Message Args",
            "Message Args");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code Message Args} and {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'Message Args' and 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenMessageArgsAndMessageArgs2() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(value, FailureReason.MULTIPLE, "{U}", "Message Args", "Message Args");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code Message Args}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'Message Args'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenMessageArgs_thenReturnValue() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(
            value, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenNotAllWhoWanderAreLost() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(value, FailureReason.MULTIPLE, "Not all who wander are lost");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when 'null'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenNull_thenReturnValue() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(value, FailureReason.MULTIPLE, "Not all who wander are lost", null);

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when '{U}'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenU_thenReturnValue() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult =
        Result.ofOptional(value, FailureReason.MULTIPLE, "{U}", "Message Args");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional, FailureReason, String, Object[])} with {@code value},
   * {@code reason}, {@code message}, {@code messageArgs}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional, FailureReason, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional, FailureReason, String, Object[]) with 'value', 'reason', 'message', 'messageArgs'; when '{U}'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional, FailureReason, String, Object[])"})
  void testOfOptionalWithValueReasonMessageMessageArgs_whenU_thenReturnValue2() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult = Result.ofOptional(value, FailureReason.MULTIPLE, "{U}");

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional)} with {@code value}.
   *
   * <ul>
   *   <li>When {@link Optional} with {@code {U}}.
   *   <li>Then return Value is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional)}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional) with 'value'; when Optional with '{U}'; then return Value is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional)"})
  void testOfOptionalWithValue_whenOptionalWithU_thenReturnValueIsU() {
    // Arrange
    Optional<Object> value = Optional.of("{U}");

    // Act
    Result<Object> actualOfOptionalResult = Result.ofOptional(value);

    // Assert
    assertEquals("{U}", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#ofOptional(Optional)} with {@code value}.
   *
   * <ul>
   *   <li>When {@link Optional} with {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ofOptional(Optional)}
   */
  @Test
  @DisplayName(
      "Test ofOptional(Optional) with 'value'; when Optional with 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.ofOptional(Optional)"})
  void testOfOptionalWithValue_whenOptionalWithValue_thenReturnValue() {
    // Arrange
    Optional<Object> value = Optional.of("Value");

    // Act
    Result<Object> actualOfOptionalResult = Result.ofOptional(value);

    // Assert
    assertEquals("Value", actualOfOptionalResult.getValue());
    assertFalse(actualOfOptionalResult.isFailure());
    assertTrue(actualOfOptionalResult.isSuccess());
    assertEquals(value, actualOfOptionalResult.get());
  }

  /**
   * Test {@link Result#of(Supplier)}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>When {@link Supplier} {@link Supplier#get()} return {@code Get}.
   *   <li>Then return Value is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Result#of(Supplier)}
   */
  @Test
  @DisplayName(
      "Test of(Supplier); given 'Get'; when Supplier get() return 'Get'; then return Value is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.of(Supplier)"})
  void testOf_givenGet_whenSupplierGetReturnGet_thenReturnValueIsGet() {
    // Arrange
    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Result<Object> actualOfResult = Result.of(supplier);

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualOfResult.getValue());
    Optional<Object> getResult = actualOfResult.get();
    assertEquals("Get", getResult.get());
    assertFalse(actualOfResult.isFailure());
    assertTrue(actualOfResult.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link Result#wrap(Supplier)}.
   *
   * <ul>
   *   <li>Then return Failure is {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#wrap(Supplier)}
   */
  @Test
  @DisplayName("Test wrap(Supplier); then return Failure is Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.wrap(Supplier)"})
  void testWrap_thenReturnFailureIsFailureWithItemIsFailureItem() {
    // Arrange
    Supplier<Result<Object>> supplier = mock(Supplier.class);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);
    Result<Object> failureResult = Result.failure(failure);
    when(supplier.get()).thenReturn(failureResult);

    // Act
    Result<Object> actualWrapResult = Result.wrap(supplier);

    // Assert
    verify(supplier).get();
    assertSame(failure, actualWrapResult.getFailure());
  }

  /**
   * Test {@link Result#allSuccessful(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#allSuccessful(Iterable)}
   */
  @Test
  @DisplayName("Test allSuccessful(Iterable) with 'Iterable'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.allSuccessful(Iterable)"})
  void testAllSuccessfulWithIterable_thenReturnFalse() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act and Assert
    assertFalse(Result.allSuccessful(results));
  }

  /**
   * Test {@link Result#allSuccessful(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Result#allSuccessful(Iterable)}
   */
  @Test
  @DisplayName("Test allSuccessful(Iterable) with 'Iterable'; when ArrayList(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.allSuccessful(Iterable)"})
  void testAllSuccessfulWithIterable_whenArrayList_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Result.allSuccessful(new ArrayList<>()));
  }

  /**
   * Test {@link Result#allSuccessful(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#allSuccessful(Result[])}
   */
  @Test
  @DisplayName("Test allSuccessful(Result[]) with 'Result[]'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.allSuccessful(Result[])"})
  void testAllSuccessfulWithResult_thenReturnFalse() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertFalse(Result.allSuccessful(failureResult));
  }

  /**
   * Test {@link Result#allSuccessful(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Result#allSuccessful(Result[])}
   */
  @Test
  @DisplayName("Test allSuccessful(Result[]) with 'Result[]'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.allSuccessful(Result[])"})
  void testAllSuccessfulWithResult_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Result.allSuccessful());
  }

  /**
   * Test {@link Result#anyFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add failure {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Iterable)}
   */
  @Test
  @DisplayName(
      "Test anyFailures(Iterable) with 'Iterable'; given failure 'null'; when ArrayList() add failure 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Iterable)"})
  void testAnyFailuresWithIterable_givenFailureNull_whenArrayListAddFailureNull() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    Result<?> failureResult = Result.failure((Failure) null);
    results.add(failureResult);

    // Act and Assert
    assertFalse(Result.anyFailures(results));
  }

  /**
   * Test {@link Result#anyFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Iterable)}
   */
  @Test
  @DisplayName("Test anyFailures(Iterable) with 'Iterable'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Iterable)"})
  void testAnyFailuresWithIterable_thenReturnTrue() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act and Assert
    assertTrue(Result.anyFailures(results));
  }

  /**
   * Test {@link Result#anyFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Iterable)}
   */
  @Test
  @DisplayName("Test anyFailures(Iterable) with 'Iterable'; when ArrayList(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Iterable)"})
  void testAnyFailuresWithIterable_whenArrayList_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Result.anyFailures(new ArrayList<>()));
  }

  /**
   * Test {@link Result#anyFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Result[])}
   */
  @Test
  @DisplayName("Test anyFailures(Result[]) with 'Result[]'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Result[])"})
  void testAnyFailuresWithResult_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Result.anyFailures());
  }

  /**
   * Test {@link Result#anyFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Result[])}
   */
  @Test
  @DisplayName("Test anyFailures(Result[]) with 'Result[]'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Result[])"})
  void testAnyFailuresWithResult_thenReturnTrue() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertTrue(Result.anyFailures(failureResult));
  }

  /**
   * Test {@link Result#anyFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>When failure {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#anyFailures(Result[])}
   */
  @Test
  @DisplayName(
      "Test anyFailures(Result[]) with 'Result[]'; when failure 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.anyFailures(Result[])"})
  void testAnyFailuresWithResult_whenFailureNull_thenReturnFalse() {
    // Arrange
    Result<?> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertFalse(Result.anyFailures(failureResult));
  }

  /**
   * Test {@link Result#countFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add failure {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Iterable)}
   */
  @Test
  @DisplayName(
      "Test countFailures(Iterable) with 'Iterable'; given failure 'null'; when ArrayList() add failure 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Iterable)"})
  void testCountFailuresWithIterable_givenFailureNull_whenArrayListAddFailureNull() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    Result<?> failureResult = Result.failure((Failure) null);
    results.add(failureResult);

    // Act and Assert
    assertEquals(0L, Result.countFailures(results));
  }

  /**
   * Test {@link Result#countFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Iterable)}
   */
  @Test
  @DisplayName("Test countFailures(Iterable) with 'Iterable'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Iterable)"})
  void testCountFailuresWithIterable_thenReturnOne() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act and Assert
    assertEquals(1L, Result.countFailures(results));
  }

  /**
   * Test {@link Result#countFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Iterable)}
   */
  @Test
  @DisplayName("Test countFailures(Iterable) with 'Iterable'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Iterable)"})
  void testCountFailuresWithIterable_thenReturnTwo() {
    // Arrange
    ArrayList<Result<?>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act and Assert
    assertEquals(2L, Result.countFailures(results));
  }

  /**
   * Test {@link Result#countFailures(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Iterable)}
   */
  @Test
  @DisplayName("Test countFailures(Iterable) with 'Iterable'; when ArrayList(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Iterable)"})
  void testCountFailuresWithIterable_whenArrayList_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, Result.countFailures(new ArrayList<>()));
  }

  /**
   * Test {@link Result#countFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Result[])}
   */
  @Test
  @DisplayName("Test countFailures(Result[]) with 'Result[]'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Result[])"})
  void testCountFailuresWithResult_thenReturnOne() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertEquals(1L, Result.countFailures(failureResult));
  }

  /**
   * Test {@link Result#countFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Result[])}
   */
  @Test
  @DisplayName("Test countFailures(Result[]) with 'Result[]'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Result[])"})
  void testCountFailuresWithResult_thenReturnTwo() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult = Result.failure(Failure.of(item));
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<?> failureResult2 = Result.failure(Failure.of(item2));

    // Act and Assert
    assertEquals(2L, Result.countFailures(failureResult, failureResult2));
  }

  /**
   * Test {@link Result#countFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Result[])}
   */
  @Test
  @DisplayName("Test countFailures(Result[]) with 'Result[]'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Result[])"})
  void testCountFailuresWithResult_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, Result.countFailures());
  }

  /**
   * Test {@link Result#countFailures(Result[])} with {@code Result[]}.
   *
   * <ul>
   *   <li>When failure {@code null}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Result#countFailures(Result[])}
   */
  @Test
  @DisplayName(
      "Test countFailures(Result[]) with 'Result[]'; when failure 'null'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Result.countFailures(Result[])"})
  void testCountFailuresWithResult_whenFailureNull_thenReturnZero() {
    // Arrange
    Result<?> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertEquals(0L, Result.countFailures(failureResult));
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test combine(Iterable, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            5, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualCombineResult = Result.combine(results, mock(Function.class));

    // Assert
    Failure failure = actualCombineResult.getFailure();
    assertEquals(
        "Not all who wander are lost - [Message Args], value - [Message Args]",
        failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test combine(Iterable, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine2() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(
            FailureReason.ERROR, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualCombineResult = Result.combine(results, mock(Function.class));

    // Assert
    Failure failure = actualCombineResult.getFailure();
    assertEquals("value - [Message Args], value - [Message Args]", failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test combine(Iterable, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine3() {
    // Arrange
    IOException cause = new IOException("An error occurred");
    cause.addSuppressed(new Throwable());
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, cause, FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    ArrayList<Result<Object>> results = new ArrayList<>();
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualCombineResult = Result.combine(results, mock(Function.class));

    // Assert
    assertSame(item, actualCombineResult.getFailure().getFirstItem());
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code Apply}.
   *   <li>Then return Value is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName(
      "Test combine(Iterable, Function); given 'Apply'; when Function apply(Object) return 'Apply'; then return Value is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine_givenApply_whenFunctionApplyReturnApply_thenReturnValueIsApply() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();

    Function<Stream<Object>, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Stream<Object>>any())).thenReturn("Apply");

    // Act
    Result<Object> actualCombineResult = Result.combine(results, function);

    // Assert
    verify(function).apply(isA(Stream.class));
    assertEquals("Apply", actualCombineResult.getValue());
    Optional<Object> getResult = actualCombineResult.get();
    assertEquals("Apply", getResult.get());
    assertFalse(actualCombineResult.isFailure());
    assertTrue(actualCombineResult.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()} initCause {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test combine(Iterable, Function); given Throwable() initCause Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine_givenThrowableInitCauseThrowable() {
    // Arrange
    Throwable cause = new Throwable();
    cause.initCause(new Throwable());
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, cause, FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    ArrayList<Result<Object>> results = new ArrayList<>();
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualCombineResult = Result.combine(results, mock(Function.class));

    // Assert
    Failure failure = actualCombineResult.getFailure();
    assertEquals("value - [Message Args], value - [Message Args]", failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#combine(Iterable, Function)}.
   *
   * <ul>
   *   <li>Then return failure {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#combine(Iterable, Function)}
   */
  @Test
  @DisplayName(
      "Test combine(Iterable, Function); then return failure Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combine(Iterable, Function)"})
  void testCombine_thenReturnFailureFailureWithItemIsFailureItem() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act
    Result<Object> actualCombineResult = Result.combine(results, mock(Function.class));

    // Assert
    assertEquals(failureResult, actualCombineResult);
  }

  /**
   * Test {@link Result#flatCombine(Iterable, Function)}.
   *
   * <p>Method under test: {@link Result#flatCombine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test flatCombine(Iterable, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.flatCombine(Iterable, Function)"})
  void testFlatCombine() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            5, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualFlatCombineResult = Result.flatCombine(results, mock(Function.class));

    // Assert
    Failure failure = actualFlatCombineResult.getFailure();
    assertEquals(
        "Not all who wander are lost - [Message Args], Message Template - [Message Args]",
        failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#flatCombine(Iterable, Function)}.
   *
   * <p>Method under test: {@link Result#flatCombine(Iterable, Function)}
   */
  @Test
  @DisplayName("Test flatCombine(Iterable, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.flatCombine(Iterable, Function)"})
  void testFlatCombine2() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);
    FailureItem item2 =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));
    results.add(failureResult2);

    // Act
    Result<Object> actualFlatCombineResult = Result.flatCombine(results, mock(Function.class));

    // Assert
    Failure failure = actualFlatCombineResult.getFailure();
    assertEquals(
        "Message Template - [Message Args], Message Template - [Message Args]",
        failure.getMessage());
    assertEquals(2, failure.getItems().size());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#flatCombine(Iterable, Function)}.
   *
   * <ul>
   *   <li>Then return failure {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#flatCombine(Iterable, Function)}
   */
  @Test
  @DisplayName(
      "Test flatCombine(Iterable, Function); then return failure Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.flatCombine(Iterable, Function)"})
  void testFlatCombine_thenReturnFailureFailureWithItemIsFailureItem() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    results.add(failureResult);

    // Act
    Result<Object> actualFlatCombineResult = Result.flatCombine(results, mock(Function.class));

    // Assert
    assertEquals(failureResult, actualFlatCombineResult);
  }

  /**
   * Test {@link Result#flatCombine(Iterable, Function)}.
   *
   * <ul>
   *   <li>Then return Failure is {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#flatCombine(Iterable, Function)}
   */
  @Test
  @DisplayName(
      "Test flatCombine(Iterable, Function); then return Failure is Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.flatCombine(Iterable, Function)"})
  void testFlatCombine_thenReturnFailureIsFailureWithItemIsFailureItem() {
    // Arrange
    ArrayList<Result<Object>> results = new ArrayList<>();

    Function<Stream<Object>, Result<Object>> function = mock(Function.class);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);
    Result<Object> failureResult = Result.failure(failure);
    when(function.apply(Mockito.<Stream<Object>>any())).thenReturn(failureResult);

    // Act
    Result<Object> actualFlatCombineResult = Result.flatCombine(results, function);

    // Assert
    verify(function).apply(isA(Stream.class));
    assertSame(failure, actualFlatCombineResult.getFailure());
  }

  /**
   * Test {@link Result#isSuccess()}.
   *
   * <p>Method under test: {@link Result#isSuccess()}
   */
  @Test
  @DisplayName("Test isSuccess()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.isSuccess()"})
  void testIsSuccess() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertFalse(failureResult.isSuccess());
  }

  /**
   * Test {@link Result#isFailure()}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Result#isFailure()}
   */
  @Test
  @DisplayName("Test isFailure(); given failure 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.isFailure()"})
  void testIsFailure_givenFailureNull_thenReturnFalse() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertFalse(failureResult.isFailure());
  }

  /**
   * Test {@link Result#isFailure()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Result#isFailure()}
   */
  @Test
  @DisplayName("Test isFailure(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.isFailure()"})
  void testIsFailure_thenReturnTrue() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertTrue(failureResult.isFailure());
  }

  /**
   * Test {@link Result#ifFailure(Consumer)}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>When {@link Consumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Result#ifFailure(Consumer)}
   */
  @Test
  @DisplayName("Test ifFailure(Consumer); given failure 'null'; when Consumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Result.ifFailure(Consumer)"})
  void testIfFailure_givenFailureNull_whenConsumer_thenDoesNotThrow() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertDoesNotThrow(() -> failureResult.ifFailure(mock(Consumer.class)));
  }

  /**
   * Test {@link Result#ifFailure(Consumer)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ifFailure(Consumer)}
   */
  @Test
  @DisplayName(
      "Test ifFailure(Consumer); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Result.ifFailure(Consumer)"})
  void testIfFailure_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    Consumer<Failure> consumer = mock(Consumer.class);
    doThrow(new IllegalArgumentException()).when(consumer).accept(Mockito.<Failure>any());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> failureResult.ifFailure(consumer));
    verify(consumer).accept(isA(Failure.class));
  }

  /**
   * Test {@link Result#ifFailure(Consumer)}.
   *
   * <ul>
   *   <li>When {@link Consumer} {@link Consumer#accept(Object)} does nothing.
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link Result#ifFailure(Consumer)}
   */
  @Test
  @DisplayName(
      "Test ifFailure(Consumer); when Consumer accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Result.ifFailure(Consumer)"})
  void testIfFailure_whenConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    Consumer<Failure> consumer = mock(Consumer.class);
    doNothing().when(consumer).accept(Mockito.<Failure>any());

    // Act
    failureResult.ifFailure(consumer);

    // Assert
    verify(consumer).accept(isA(Failure.class));
  }

  /**
   * Test {@link Result#get()}.
   *
   * <p>Method under test: {@link Result#get()}
   */
  @Test
  @DisplayName("Test get()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Result.get()"})
  void testGet() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertFalse(failureResult.get().isPresent());
  }

  /**
   * Test {@link Result#getValue()}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#getValue()}
   */
  @Test
  @DisplayName("Test getValue(); given failure 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Result.getValue()"})
  void testGetValue_givenFailureNull_thenReturnNull() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);

    // Act and Assert
    assertNull(failureResult.getValue());
  }

  /**
   * Test {@link Result#getValue()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#getValue()}
   */
  @Test
  @DisplayName("Test getValue(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Result.getValue()"})
  void testGetValue_thenThrowIllegalStateException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> failureResult.getValue());
  }

  /**
   * Test {@link Result#getValueOrElse(Object)}.
   *
   * <p>Method under test: {@link Result#getValueOrElse(Object)}
   */
  @Test
  @DisplayName("Test getValueOrElse(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Result.getValueOrElse(Object)"})
  void testGetValueOrElse() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertEquals("Default Value", failureResult.getValueOrElse("Default Value"));
  }

  /**
   * Test {@link Result#getValueOrElseApply(Function)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Result#getValueOrElseApply(Function)}
   */
  @Test
  @DisplayName(
      "Test getValueOrElseApply(Function); given 'Apply'; when Function apply(Object) return 'Apply'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Result.getValueOrElseApply(Function)"})
  void testGetValueOrElseApply_givenApply_whenFunctionApplyReturnApply_thenReturnApply() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    Function<Failure, Object> mapper = mock(Function.class);
    when(mapper.apply(Mockito.<Failure>any())).thenReturn("Apply");

    // Act
    Object actualValueOrElseApply = failureResult.getValueOrElseApply(mapper);

    // Assert
    verify(mapper).apply(isA(Failure.class));
    assertEquals("Apply", actualValueOrElseApply);
  }

  /**
   * Test {@link Result#getValueOrElseApply(Function)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#getValueOrElseApply(Function)}
   */
  @Test
  @DisplayName("Test getValueOrElseApply(Function); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Result.getValueOrElseApply(Function)"})
  void testGetValueOrElseApply_thenThrowIllegalArgumentException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    Function<Failure, Object> mapper = mock(Function.class);
    when(mapper.apply(Mockito.<Failure>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> failureResult.getValueOrElseApply(mapper));
    verify(mapper).apply(isA(Failure.class));
  }

  /**
   * Test {@link Result#getFailure()}.
   *
   * <p>Method under test: {@link Result#getFailure()}
   */
  @Test
  @DisplayName("Test getFailure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure Result.getFailure()"})
  void testGetFailure() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);
    Result<Object> failureResult = Result.failure(failure);

    // Act and Assert
    assertSame(failure, failureResult.getFailure());
  }

  /**
   * Test {@link Result#map(Function)}.
   *
   * <p>Method under test: {@link Result#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.map(Function)"})
  void testMap() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualMapResult = failureResult.map(mock(Function.class));

    // Assert
    assertSame(failureResult, actualMapResult);
  }

  /**
   * Test {@link Result#mapFailure(Function)}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>When {@link Function}.
   *   <li>Then return failure {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#mapFailure(Function)}
   */
  @Test
  @DisplayName(
      "Test mapFailure(Function); given failure 'null'; when Function; then return failure 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.mapFailure(Function)"})
  void testMapFailure_givenFailureNull_whenFunction_thenReturnFailureNull() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);

    // Act
    Result<Object> actualMapFailureResult = failureResult.mapFailure(mock(Function.class));

    // Assert
    assertSame(failureResult, actualMapFailureResult);
  }

  /**
   * Test {@link Result#mapFailureItems(Function)}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>When {@link Function}.
   *   <li>Then return failure {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Result#mapFailureItems(Function)}
   */
  @Test
  @DisplayName(
      "Test mapFailureItems(Function); given failure 'null'; when Function; then return failure 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.mapFailureItems(Function)"})
  void testMapFailureItems_givenFailureNull_whenFunction_thenReturnFailureNull() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);

    // Act
    Result<Object> actualMapFailureItemsResult =
        failureResult.mapFailureItems(mock(Function.class));

    // Assert
    assertSame(failureResult, actualMapFailureItemsResult);
  }

  /**
   * Test {@link Result#flatMap(Function)}.
   *
   * <p>Method under test: {@link Result#flatMap(Function)}
   */
  @Test
  @DisplayName("Test flatMap(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.flatMap(Function)"})
  void testFlatMap() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualFlatMapResult = failureResult.flatMap(mock(Function.class));

    // Assert
    assertSame(failureResult, actualFlatMapResult);
  }

  /**
   * Test {@link Result#combineWith(Result, BiFunction)}.
   *
   * <p>Method under test: {@link Result#combineWith(Result, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(Result, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combineWith(Result, BiFunction)"})
  void testCombineWith() {
    // Arrange
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> other = Result.failure(Failure.of(item2));

    // Act and Assert
    Failure failure = failureResult.combineWith(other, mock(BiFunction.class)).getFailure();
    assertEquals(
        "Not all who wander are lost - [Message Args], Message Template - [Message Args]",
        failure.getMessage());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#combineWith(Result, BiFunction)}.
   *
   * <p>Method under test: {@link Result#combineWith(Result, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(Result, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combineWith(Result, BiFunction)"})
  void testCombineWith2() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.ERROR, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> other = Result.failure(Failure.of(item2));

    // Act and Assert
    Failure failure = failureResult.combineWith(other, mock(BiFunction.class)).getFailure();
    assertEquals(
        "Message Template - [Message Args], Message Template - [Message Args]",
        failure.getMessage());
    assertEquals(2, failure.getItems().size());
    assertSame(item, failure.getFirstItem());
  }

  /**
   * Test {@link Result#combineWith(Result, BiFunction)}.
   *
   * <ul>
   *   <li>Given failure {@code null}.
   *   <li>Then return failure {@link Failure} with item is {@link FailureItem}.
   * </ul>
   *
   * <p>Method under test: {@link Result#combineWith(Result, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(Result, BiFunction); given failure 'null'; then return failure Failure with item is FailureItem")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combineWith(Result, BiFunction)"})
  void testCombineWith_givenFailureNull_thenReturnFailureFailureWithItemIsFailureItem() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> other = Result.failure(Failure.of(item));

    // Act
    Result<Object> actualCombineWithResult =
        failureResult.combineWith(other, mock(BiFunction.class));

    // Assert
    assertEquals(other, actualCombineWithResult);
  }

  /**
   * Test {@link Result#combineWith(Result, BiFunction)}.
   *
   * <ul>
   *   <li>When failure {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Result#combineWith(Result, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(Result, BiFunction); when failure 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result Result.combineWith(Result, BiFunction)"})
  void testCombineWith_whenFailureNull_thenThrowIllegalArgumentException() {
    // Arrange
    Result<Object> failureResult = Result.failure((Failure) null);
    Result<Object> other = Result.failure((Failure) null);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> failureResult.combineWith(other, mock(BiFunction.class)));
  }

  /**
   * Test {@link Result#stream()}.
   *
   * <p>Method under test: {@link Result#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Result.stream()"})
  void testStream() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act
    Stream<Object> actualStreamResult = failureResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Result#meta()}.
   *
   * <p>Method under test: {@link Result#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Result.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = Result.meta();

    // Assert
    MetaProperty<Failure> failureResult = actualMetaResult.failure();
    assertTrue(failureResult instanceof DirectMetaProperty);
    MetaProperty valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failure", failureResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failureResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Failure> expectedPropertyTypeResult = Failure.class;
    assertEquals(expectedPropertyTypeResult, failureResult.propertyType());
    Class<Result> expectedDeclaringTypeResult = Result.class;
    assertEquals(expectedDeclaringTypeResult, failureResult.declaringType());
    Class<Result> expectedDeclaringTypeResult2 = Result.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, failureResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link Result#metaResult(Class)}.
   *
   * <p>Method under test: {@link Result#metaResult(Class)}
   */
  @Test
  @DisplayName("Test metaResult(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Result.metaResult(Class)"})
  void testMetaResult() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaResultResult = Result.metaResult(cls);

    // Assert
    MetaProperty<Failure> failureResult = actualMetaResultResult.failure();
    assertTrue(failureResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = actualMetaResultResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failure", failureResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failureResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResultResult.isBuildable());
    Class<Failure> expectedPropertyTypeResult = Failure.class;
    assertEquals(expectedPropertyTypeResult, failureResult.propertyType());
    Class<Result> expectedDeclaringTypeResult = Result.class;
    assertEquals(expectedDeclaringTypeResult, failureResult.declaringType());
    Class<Result> expectedDeclaringTypeResult2 = Result.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, failureResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link Result#metaBean()}.
   *
   * <p>Method under test: {@link Result#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta Result.metaBean()"})
  void testMetaBean() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertSame(Meta.INSTANCE, failureResult.metaBean());
  }

  /**
   * Test {@link Result#equals(Object)}, and {@link Result#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Result#equals(Object)}
   *   <li>{@link Result#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.equals(Object)", "int Result.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertEquals(failureResult, failureResult);
    int expectedHashCodeResult = failureResult.hashCode();
    assertEquals(expectedHashCodeResult, failureResult.hashCode());
  }

  /**
   * Test {@link Result#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Result#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.equals(Object)", "int Result.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));
    FailureItem item2 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult2 = Result.failure(Failure.of(item2));

    // Act and Assert
    assertNotEquals(failureResult, failureResult2);
  }

  /**
   * Test {@link Result#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Result#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.equals(Object)", "int Result.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertNotEquals(failureResult, null);
  }

  /**
   * Test {@link Result#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Result#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Result.equals(Object)", "int Result.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertNotEquals(failureResult, "Different type to Result");
  }

  /**
   * Test {@link Result#toString()}.
   *
   * <p>Method under test: {@link Result#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Result.toString()"})
  void testToString() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Result<Object> failureResult = Result.failure(Failure.of(item));

    // Act and Assert
    assertEquals(
        "Result{value=null, failure=Failure{reason=MULTIPLE, message=Message Template - [Message Args],"
            + " items=[MULTIPLE: Message Template - [Message Args]: java.lang.Throwable]}}",
        failureResult.toString());
  }
}
