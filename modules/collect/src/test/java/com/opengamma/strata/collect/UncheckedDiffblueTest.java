package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.opengamma.strata.collect.function.CheckedBiConsumer;
import com.opengamma.strata.collect.function.CheckedBiFunction;
import com.opengamma.strata.collect.function.CheckedBiPredicate;
import com.opengamma.strata.collect.function.CheckedBinaryOperator;
import com.opengamma.strata.collect.function.CheckedConsumer;
import com.opengamma.strata.collect.function.CheckedFunction;
import com.opengamma.strata.collect.function.CheckedPredicate;
import com.opengamma.strata.collect.function.CheckedRunnable;
import com.opengamma.strata.collect.function.CheckedSupplier;
import com.opengamma.strata.collect.function.CheckedUnaryOperator;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UncheckedDiffblueTest {
  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName("Test wrap(CheckedRunnable) with 'CheckedRunnable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable() throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    doThrow(completionException).when(block).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName("Test wrap(CheckedRunnable) with 'CheckedRunnable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable2() throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    doThrow(executionException).when(block).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName("Test wrap(CheckedRunnable) with 'CheckedRunnable'; given IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_givenIOException() throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doThrow(new IOException()).when(block).run();

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedRunnable) with 'CheckedRunnable'; given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_givenInvocationTargetExceptionWithThrowableAndFoo()
      throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doThrow(new InvocationTargetException(new Throwable(), "foo")).when(block).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedRunnable} {@link CheckedRunnable#run()} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedRunnable) with 'CheckedRunnable'; given Throwable(); when CheckedRunnable run() throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_givenThrowable_whenCheckedRunnableRunThrowThrowable()
      throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doThrow(new Throwable()).when(block).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedRunnable) with 'CheckedRunnable'; given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doThrow(new UncheckedIOException(new IOException())).when(block).run();

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedRunnable) with 'CheckedRunnable'; then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_thenThrowUncheckedReflectiveOperationException()
      throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doThrow(new ReflectiveOperationException()).when(block).run();

    // Act and Assert
    assertThrows(UncheckedReflectiveOperationException.class, () -> Unchecked.wrap(block));
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedRunnable)} with {@code CheckedRunnable}.
   *
   * <ul>
   *   <li>When {@link CheckedRunnable} {@link CheckedRunnable#run()} does nothing.
   *   <li>Then calls {@link CheckedRunnable#run()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedRunnable) with 'CheckedRunnable'; when CheckedRunnable run() does nothing; then calls run()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Unchecked.wrap(CheckedRunnable)"})
  void testWrapWithCheckedRunnable_whenCheckedRunnableRunDoesNothing_thenCallsRun()
      throws Throwable {
    // Arrange
    CheckedRunnable block = mock(CheckedRunnable.class);
    doNothing().when(block).run();

    // Act
    Unchecked.wrap(block);

    // Assert
    verify(block).run();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test wrap(CheckedSupplier) with 'CheckedSupplier'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier() throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(block.get()).thenThrow(completionException);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test wrap(CheckedSupplier) with 'CheckedSupplier'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier2() throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(block.get()).thenThrow(executionException);

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test wrap(CheckedSupplier) with 'CheckedSupplier'; given 'Get'; then return 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_givenGet_thenReturnGet() throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenReturn("Get");

    // Act
    Object actualWrapResult = Unchecked.wrap(block);

    // Assert
    verify(block).get();
    assertEquals("Get", actualWrapResult);
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test wrap(CheckedSupplier) with 'CheckedSupplier'; given IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_givenIOException() throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenThrow(new IOException());

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedSupplier) with 'CheckedSupplier'; given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_givenInvocationTargetExceptionWithThrowableAndFoo()
      throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedSupplier} {@link CheckedSupplier#get()} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedSupplier) with 'CheckedSupplier'; given Throwable(); when CheckedSupplier get() throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_givenThrowable_whenCheckedSupplierGetThrowThrowable()
      throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenThrow(new Throwable());

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedSupplier) with 'CheckedSupplier'; given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenThrow(new UncheckedIOException(new IOException()));

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#wrap(CheckedSupplier)} with {@code CheckedSupplier}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#wrap(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test wrap(CheckedSupplier) with 'CheckedSupplier'; then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Unchecked.wrap(CheckedSupplier)"})
  void testWrapWithCheckedSupplier_thenThrowUncheckedReflectiveOperationException()
      throws Throwable {
    // Arrange
    CheckedSupplier<Object> block = mock(CheckedSupplier.class);
    when(block.get()).thenThrow(new ReflectiveOperationException());

    // Act and Assert
    assertThrows(UncheckedReflectiveOperationException.class, () -> Unchecked.wrap(block));
    verify(block).get();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    doThrow(completionException).when(runnable).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    doThrow(executionException).when(runnable).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedRunnable} {@link CheckedRunnable#run()} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given IOException(); when CheckedRunnable run() throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenIOException_whenCheckedRunnableRunThrowIOException() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doThrow(new IOException()).when(runnable).run();

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doThrow(new InvocationTargetException(new Throwable(), "foo")).when(runnable).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedRunnable} {@link CheckedRunnable#run()} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given Throwable(); when CheckedRunnable run() throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenThrowable_whenCheckedRunnableRunThrowThrowable() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doThrow(new Throwable()).when(runnable).run();

    // Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doThrow(new UncheckedIOException(new IOException())).when(runnable).run();

    // Act and Assert
    assertThrows(UncheckedIOException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName("Test runnable(CheckedRunnable); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doThrow(new ReflectiveOperationException()).when(runnable).run();

    // Act and Assert
    assertThrows(
        UncheckedReflectiveOperationException.class, () -> Unchecked.runnable(runnable).run());
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>When {@link CheckedRunnable} {@link CheckedRunnable#run()} does nothing.
   *   <li>Then calls {@link CheckedRunnable#run()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName(
      "Test runnable(CheckedRunnable); when CheckedRunnable run() does nothing; then calls run()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_whenCheckedRunnableRunDoesNothing_thenCallsRun() throws Throwable {
    // Arrange
    CheckedRunnable runnable = mock(CheckedRunnable.class);
    doNothing().when(runnable).run();

    // Act
    Unchecked.runnable(runnable).run();

    // Assert
    verify(runnable).run();
  }

  /**
   * Test {@link Unchecked#runnable(CheckedRunnable)}.
   *
   * <ul>
   *   <li>When {@link CheckedRunnable}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#runnable(CheckedRunnable)}
   */
  @Test
  @DisplayName("Test runnable(CheckedRunnable); when CheckedRunnable; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Runnable Unchecked.runnable(CheckedRunnable)"})
  void testRunnable_whenCheckedRunnable_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.runnable(mock(CheckedRunnable.class)));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return apply {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName("Test function(CheckedFunction); given 'Apply'; then return apply '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenApply_thenReturnApply42IsApply() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);
    Object actualApplyResult = actualFunctionResult.apply("42");

    // Assert
    verify(function).apply(isA(Object.class));
    assertEquals("Apply", actualApplyResult);
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any())).thenThrow(completionException);

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any())).thenThrow(executionException);

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedFunction} {@link CheckedFunction#apply(Object)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given IOException(); when CheckedFunction apply(Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenIOException_whenCheckedFunctionApplyThrowIOException() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedFunction} {@link CheckedFunction#apply(Object)} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given Throwable(); when CheckedFunction apply(Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenThrowable_whenCheckedFunctionApplyThrowThrowable() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName(
      "Test function(CheckedFunction); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName("Test function(CheckedFunction); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedFunction<Object, Object> function = mock(CheckedFunction.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new ReflectiveOperationException());

    // Act
    Function<Object, Object> actualFunctionResult = Unchecked.function(function);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class, () -> actualFunctionResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#function(CheckedFunction)}.
   *
   * <ul>
   *   <li>When {@link CheckedFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#function(CheckedFunction)}
   */
  @Test
  @DisplayName("Test function(CheckedFunction); when CheckedFunction; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Unchecked.function(CheckedFunction)"})
  void testFunction_whenCheckedFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.function(mock(CheckedFunction.class)));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return apply {@code 42} and {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given 'Apply'; then return apply '42' and '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenApply_thenReturnApply42And42IsApply() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);
    Object actualApplyResult = actualBiFunctionResult.apply("42", "42");

    // Assert
    verify(function).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult);
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(completionException);

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(executionException);

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedBiFunction} {@link CheckedBiFunction#apply(Object, Object)} throw
   *       {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given IOException(); when CheckedBiFunction apply(Object, Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenIOException_whenCheckedBiFunctionApplyThrowIOException()
      throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedBiFunction} {@link CheckedBiFunction#apply(Object, Object)} throw
   *       {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given Throwable(); when CheckedBiFunction apply(Object, Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenThrowable_whenCheckedBiFunctionApplyThrowThrowable() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName(
      "Test biFunction(CheckedBiFunction); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedBiFunction<Object, Object, Object> function = mock(CheckedBiFunction.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new ReflectiveOperationException());

    // Act
    BiFunction<Object, Object, Object> actualBiFunctionResult = Unchecked.biFunction(function);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class,
        () -> actualBiFunctionResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biFunction(CheckedBiFunction)}.
   *
   * <ul>
   *   <li>When {@link CheckedBiFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biFunction(CheckedBiFunction)}
   */
  @Test
  @DisplayName("Test biFunction(CheckedBiFunction); when CheckedBiFunction; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiFunction Unchecked.biFunction(CheckedBiFunction)"})
  void testBiFunction_whenCheckedBiFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.biFunction(mock(CheckedBiFunction.class)));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return apply {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given 'Apply'; then return apply '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenApply_thenReturnApply42IsApply() throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);
    Object actualApplyResult = actualUnaryOperatorResult.apply("42");

    // Assert
    verify(function).apply(isA(Object.class));
    assertEquals("Apply", actualApplyResult);
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenCompletionExceptionWithAnErrorOccurredAndThrowable()
      throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any())).thenThrow(completionException);

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any())).thenThrow(executionException);

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedUnaryOperator} {@link CheckedUnaryOperator#apply(Object)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given IOException(); when CheckedUnaryOperator apply(Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenIOException_whenCheckedUnaryOperatorApplyThrowIOException()
      throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedUnaryOperator} {@link CheckedUnaryOperator#apply(Object)} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given Throwable(); when CheckedUnaryOperator apply(Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenThrowable_whenCheckedUnaryOperatorApplyThrowThrowable()
      throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedUnaryOperator<Object> function = mock(CheckedUnaryOperator.class);
    when(function.apply(Mockito.<Object>any())).thenThrow(new ReflectiveOperationException());

    // Act
    UnaryOperator<Object> actualUnaryOperatorResult = Unchecked.unaryOperator(function);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class, () -> actualUnaryOperatorResult.apply("42"));
    verify(function).apply(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#unaryOperator(CheckedUnaryOperator)}.
   *
   * <ul>
   *   <li>When {@link CheckedUnaryOperator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#unaryOperator(CheckedUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test unaryOperator(CheckedUnaryOperator); when CheckedUnaryOperator; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnaryOperator Unchecked.unaryOperator(CheckedUnaryOperator)"})
  void testUnaryOperator_whenCheckedUnaryOperator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.unaryOperator(mock(CheckedUnaryOperator.class)));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return apply {@code 42} and {@code 42} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given 'Apply'; then return apply '42' and '42' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenApply_thenReturnApply42And42IsApply() throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);
    Object actualApplyResult = actualBinaryOperatorResult.apply("42", "42");

    // Assert
    verify(function).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult);
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenCompletionExceptionWithAnErrorOccurredAndThrowable()
      throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(completionException);

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenExecutionExceptionWithAnErrorOccurredAndThrowable()
      throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(executionException);

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName("Test binaryOperator(CheckedBinaryOperator); given IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenIOException() throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedBinaryOperator} {@link CheckedBinaryOperator#apply(Object, Object)}
   *       throw {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given Throwable(); when CheckedBinaryOperator apply(Object, Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenThrowable_whenCheckedBinaryOperatorApplyThrowThrowable()
      throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedBinaryOperator<Object> function = mock(CheckedBinaryOperator.class);
    when(function.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new ReflectiveOperationException());

    // Act
    BinaryOperator<Object> actualBinaryOperatorResult = Unchecked.binaryOperator(function);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class,
        () -> actualBinaryOperatorResult.apply("42", "42"));
    verify(function).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#binaryOperator(CheckedBinaryOperator)}.
   *
   * <ul>
   *   <li>When {@link CheckedBinaryOperator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#binaryOperator(CheckedBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test binaryOperator(CheckedBinaryOperator); when CheckedBinaryOperator; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Unchecked.binaryOperator(CheckedBinaryOperator)"})
  void testBinaryOperator_whenCheckedBinaryOperator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.binaryOperator(mock(CheckedBinaryOperator.class)));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(predicate.test(Mockito.<Object>any())).thenThrow(completionException);

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(predicate.test(Mockito.<Object>any())).thenThrow(executionException);

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link CheckedPredicate} {@link CheckedPredicate#test(Object)} return {@code false}.
   *   <li>Then return not test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given 'false'; when CheckedPredicate test(Object) return 'false'; then return not test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenFalse_whenCheckedPredicateTestReturnFalse_thenReturnNotTest42()
      throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);
    boolean actualTestResult = actualPredicateResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedPredicate} {@link CheckedPredicate#test(Object)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given IOException(); when CheckedPredicate test(Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenIOException_whenCheckedPredicateTestThrowIOException() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedPredicate} {@link CheckedPredicate#test(Object)} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given Throwable(); when CheckedPredicate test(Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenThrowable_whenCheckedPredicateTestThrowThrowable() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link CheckedPredicate} {@link CheckedPredicate#test(Object)} return {@code true}.
   *   <li>Then return test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given 'true'; when CheckedPredicate test(Object) return 'true'; then return test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenTrue_whenCheckedPredicateTestReturnTrue_thenReturnTest42()
      throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);
    boolean actualTestResult = actualPredicateResult.test("42");

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName(
      "Test predicate(CheckedPredicate); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName("Test predicate(CheckedPredicate); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedPredicate<Object> predicate = mock(CheckedPredicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new ReflectiveOperationException());

    // Act
    Predicate<Object> actualPredicateResult = Unchecked.predicate(predicate);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class, () -> actualPredicateResult.test("42"));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#predicate(CheckedPredicate)}.
   *
   * <ul>
   *   <li>When {@link CheckedPredicate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#predicate(CheckedPredicate)}
   */
  @Test
  @DisplayName("Test predicate(CheckedPredicate); when CheckedPredicate; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Unchecked.predicate(CheckedPredicate)"})
  void testPredicate_whenCheckedPredicate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.predicate(mock(CheckedPredicate.class)));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(completionException);

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(executionException);

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return not test {@code 42} and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given 'false'; then return not test '42' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenFalse_thenReturnNotTest42And42() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);
    boolean actualTestResult = actualBiPredicateResult.test("42", "42");

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedBiPredicate} {@link CheckedBiPredicate#test(Object, Object)} throw
   *       {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given IOException(); when CheckedBiPredicate test(Object, Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenIOException_whenCheckedBiPredicateTestThrowIOException()
      throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new IOException());

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedBiPredicate} {@link CheckedBiPredicate#test(Object, Object)} throw
   *       {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given Throwable(); when CheckedBiPredicate test(Object, Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenThrowable_whenCheckedBiPredicateTestThrowThrowable() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenThrow(new Throwable());

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return test {@code 42} and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName("Test biPredicate(CheckedBiPredicate); given 'true'; then return test '42' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenTrue_thenReturnTest42And42() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);
    boolean actualTestResult = actualBiPredicateResult.test("42", "42");

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new UncheckedIOException(new IOException()));

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName(
      "Test biPredicate(CheckedBiPredicate); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedBiPredicate<Object, Object> predicate = mock(CheckedBiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new ReflectiveOperationException());

    // Act
    BiPredicate<Object, Object> actualBiPredicateResult = Unchecked.biPredicate(predicate);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class,
        () -> actualBiPredicateResult.test("42", "42"));
    verify(predicate).test(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biPredicate(CheckedBiPredicate)}.
   *
   * <ul>
   *   <li>When {@link CheckedBiPredicate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biPredicate(CheckedBiPredicate)}
   */
  @Test
  @DisplayName("Test biPredicate(CheckedBiPredicate); when CheckedBiPredicate; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiPredicate Unchecked.biPredicate(CheckedBiPredicate)"})
  void testBiPredicate_whenCheckedBiPredicate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.biPredicate(mock(CheckedBiPredicate.class)));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    doThrow(completionException).when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    doThrow(executionException).when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedConsumer} {@link CheckedConsumer#accept(Object)} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given IOException(); when CheckedConsumer accept(Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenIOException_whenCheckedConsumerAcceptThrowIOException() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doThrow(new IOException()).when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doThrow(new InvocationTargetException(new Throwable(), "foo"))
        .when(consumer)
        .accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedConsumer} {@link CheckedConsumer#accept(Object)} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given Throwable(); when CheckedConsumer accept(Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenThrowable_whenCheckedConsumerAcceptThrowThrowable() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doThrow(new Throwable()).when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doThrow(new UncheckedIOException(new IOException()))
        .when(consumer)
        .accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName("Test consumer(CheckedConsumer); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doThrow(new ReflectiveOperationException()).when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class, () -> actualConsumerResult.accept("42"));
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>When {@link CheckedConsumer} {@link CheckedConsumer#accept(Object)} does nothing.
   *   <li>Then calls {@link CheckedConsumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName(
      "Test consumer(CheckedConsumer); when CheckedConsumer accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_whenCheckedConsumerAcceptDoesNothing_thenCallsAccept() throws Throwable {
    // Arrange
    CheckedConsumer<Object> consumer = mock(CheckedConsumer.class);
    doNothing().when(consumer).accept(Mockito.<Object>any());

    // Act
    Consumer<Object> actualConsumerResult = Unchecked.consumer(consumer);
    actualConsumerResult.accept("42");

    // Assert
    verify(consumer).accept(isA(Object.class));
  }

  /**
   * Test {@link Unchecked#consumer(CheckedConsumer)}.
   *
   * <ul>
   *   <li>When {@link CheckedConsumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#consumer(CheckedConsumer)}
   */
  @Test
  @DisplayName("Test consumer(CheckedConsumer); when CheckedConsumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Consumer Unchecked.consumer(CheckedConsumer)"})
  void testConsumer_whenCheckedConsumer_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.consumer(mock(CheckedConsumer.class)));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    doThrow(completionException)
        .when(consumer)
        .accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    doThrow(executionException).when(consumer).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedBiConsumer} {@link CheckedBiConsumer#accept(Object, Object)} throw
   *       {@link IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given IOException(); when CheckedBiConsumer accept(Object, Object) throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenIOException_whenCheckedBiConsumerAcceptThrowIOException()
      throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doThrow(new IOException()).when(consumer).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doThrow(new InvocationTargetException(new Throwable(), "foo"))
        .when(consumer)
        .accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedBiConsumer} {@link CheckedBiConsumer#accept(Object, Object)} throw
   *       {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given Throwable(); when CheckedBiConsumer accept(Object, Object) throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenThrowable_whenCheckedBiConsumerAcceptThrowThrowable() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doThrow(new Throwable()).when(consumer).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(RuntimeException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doThrow(new UncheckedIOException(new IOException()))
        .when(consumer)
        .accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doThrow(new ReflectiveOperationException())
        .when(consumer)
        .accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);

    // Assert
    assertThrows(
        UncheckedReflectiveOperationException.class,
        () -> actualBiConsumerResult.accept("42", "42"));
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>When {@link CheckedBiConsumer} {@link CheckedBiConsumer#accept(Object, Object)} does
   *       nothing.
   *   <li>Then calls {@link CheckedBiConsumer#accept(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName(
      "Test biConsumer(CheckedBiConsumer); when CheckedBiConsumer accept(Object, Object) does nothing; then calls accept(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_whenCheckedBiConsumerAcceptDoesNothing_thenCallsAccept() throws Throwable {
    // Arrange
    CheckedBiConsumer<Object, Object> consumer = mock(CheckedBiConsumer.class);
    doNothing().when(consumer).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    BiConsumer<Object, Object> actualBiConsumerResult = Unchecked.biConsumer(consumer);
    actualBiConsumerResult.accept("42", "42");

    // Assert
    verify(consumer).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link Unchecked#biConsumer(CheckedBiConsumer)}.
   *
   * <ul>
   *   <li>When {@link CheckedBiConsumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#biConsumer(CheckedBiConsumer)}
   */
  @Test
  @DisplayName("Test biConsumer(CheckedBiConsumer); when CheckedBiConsumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BiConsumer Unchecked.biConsumer(CheckedBiConsumer)"})
  void testBiConsumer_whenCheckedBiConsumer_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.biConsumer(mock(CheckedBiConsumer.class)));
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenCompletionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());
    when(supplier.get()).thenThrow(completionException);

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(RuntimeException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenExecutionExceptionWithAnErrorOccurredAndThrowable() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());
    when(supplier.get()).thenThrow(executionException);

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(RuntimeException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>When {@link CheckedSupplier} {@link CheckedSupplier#get()} return {@code Get}.
   *   <li>Then return {@link Supplier#get()} is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given 'Get'; when CheckedSupplier get() return 'Get'; then return get() is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenGet_whenCheckedSupplierGetReturnGet_thenReturnGetIsGet() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);
    Object actualGetResult = actualSupplierResult.get();

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualGetResult);
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link CheckedSupplier} {@link CheckedSupplier#get()} throw {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given IOException(); when CheckedSupplier get() throw IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenIOException_whenCheckedSupplierGetThrowIOException() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenThrow(new IOException());

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenInvocationTargetExceptionWithThrowableAndFoo() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenThrow(new InvocationTargetException(new Throwable(), "foo"));

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(RuntimeException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link Throwable#Throwable()}.
   *   <li>When {@link CheckedSupplier} {@link CheckedSupplier#get()} throw {@link
   *       Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given Throwable(); when CheckedSupplier get() throw Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenThrowable_whenCheckedSupplierGetThrowThrowable() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenThrow(new Throwable());

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(RuntimeException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Given {@link UncheckedIOException#UncheckedIOException(IOException)} with {@link
   *       IOException#IOException()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName(
      "Test supplier(CheckedSupplier); given UncheckedIOException(IOException) with IOException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_givenUncheckedIOExceptionWithIOException() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenThrow(new UncheckedIOException(new IOException()));

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(UncheckedIOException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test supplier(CheckedSupplier); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_thenThrowUncheckedReflectiveOperationException() throws Throwable {
    // Arrange
    CheckedSupplier<Object> supplier = mock(CheckedSupplier.class);
    when(supplier.get()).thenThrow(new ReflectiveOperationException());

    // Act
    Supplier<Object> actualSupplierResult = Unchecked.supplier(supplier);

    // Assert
    assertThrows(UncheckedReflectiveOperationException.class, () -> actualSupplierResult.get());
    verify(supplier).get();
  }

  /**
   * Test {@link Unchecked#supplier(CheckedSupplier)}.
   *
   * <ul>
   *   <li>When {@link CheckedSupplier}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#supplier(CheckedSupplier)}
   */
  @Test
  @DisplayName("Test supplier(CheckedSupplier); when CheckedSupplier; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Supplier Unchecked.supplier(CheckedSupplier)"})
  void testSupplier_whenCheckedSupplier_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Unchecked.supplier(mock(CheckedSupplier.class)));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName("Test propagate(Throwable); then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_thenThrowUncheckedIOException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            Unchecked.propagate(
                new InvocationTargetException(new InvocationTargetException(new IOException()))));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedReflectiveOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName("Test propagate(Throwable); then throw UncheckedReflectiveOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_thenThrowUncheckedReflectiveOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UncheckedReflectiveOperationException.class,
        () ->
            Unchecked.propagate(
                new InvocationTargetException(
                    new InvocationTargetException(new ReflectiveOperationException()))));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>When {@link CompletionException#CompletionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName(
      "Test propagate(Throwable); when CompletionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_whenCompletionExceptionWithAnErrorOccurredAndThrowable() {
    // Arrange
    CompletionException completionException =
        new CompletionException("An error occurred", new Throwable());

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            Unchecked.propagate(
                new InvocationTargetException(new InvocationTargetException(completionException))));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>When {@link ExecutionException#ExecutionException(String, Throwable)} with {@code An
   *       error occurred} and {@link Throwable#Throwable()}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName(
      "Test propagate(Throwable); when ExecutionException(String, Throwable) with 'An error occurred' and Throwable()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_whenExecutionExceptionWithAnErrorOccurredAndThrowable() {
    // Arrange
    ExecutionException executionException =
        new ExecutionException("An error occurred", new Throwable());

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            Unchecked.propagate(
                new InvocationTargetException(new InvocationTargetException(executionException))));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>When {@link InvocationTargetException#InvocationTargetException(Throwable, String)} with
   *       {@link Throwable#Throwable()} and {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName(
      "Test propagate(Throwable); when InvocationTargetException(Throwable, String) with Throwable() and 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_whenInvocationTargetExceptionWithThrowableAndFoo() {
    // Arrange, Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            Unchecked.propagate(
                new InvocationTargetException(
                    new InvocationTargetException(
                        new InvocationTargetException(new Throwable(), "foo")))));
  }

  /**
   * Test {@link Unchecked#propagate(Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link Unchecked#propagate(Throwable)}
   */
  @Test
  @DisplayName("Test propagate(Throwable); when Throwable(); then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RuntimeException Unchecked.propagate(Throwable)"})
  void testPropagate_whenThrowable_thenThrowRuntimeException() {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> Unchecked.propagate(new Throwable()));
  }
}
