package com.opengamma.strata.basics.value;

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
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.value.ValueStepSequence.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueStepSequenceDiffblueTest {
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
    Class<? extends ValueStepSequence> actualBeanTypeResult = ValueStepSequence.meta().beanType();

    // Assert
    Class<ValueStepSequence> expectedBeanTypeResult = ValueStepSequence.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#adjustment()}
   *   <li>{@link Meta#firstStepDate()}
   *   <li>{@link Meta#frequency()}
   *   <li>{@link Meta#lastStepDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.adjustment()",
    "MetaProperty Meta.firstStepDate()",
    "MetaProperty Meta.frequency()",
    "MetaProperty Meta.lastStepDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValueStepSequence.meta();

    // Act
    MetaProperty<ValueAdjustment> actualAdjustmentResult = metaResult.adjustment();
    MetaProperty<LocalDate> actualFirstStepDateResult = metaResult.firstStepDate();
    MetaProperty<Frequency> actualFrequencyResult = metaResult.frequency();

    // Assert
    assertTrue(actualAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualFirstStepDateResult instanceof DirectMetaProperty);
    assertTrue(actualFrequencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.lastStepDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return name is {@code adjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'adjustment'; then return name is 'adjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAdjustment_thenReturnNameIsAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueStepSequence.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> firstStepDateResult = ((Meta) metaBeanResult).firstStepDate();
    assertTrue(firstStepDateResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> frequencyResult = ((Meta) metaBeanResult).frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastStepDateResult = ((Meta) metaBeanResult).lastStepDate();
    assertTrue(lastStepDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    Class<ValueAdjustment> expectedPropertyTypeResult = ValueAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustment());
    assertSame(metaBeanResult, firstStepDateResult.metaBean());
    assertSame(metaBeanResult, frequencyResult.metaBean());
    assertSame(metaBeanResult, lastStepDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code firstStepDate}.
   *   <li>Then return name is {@code firstStepDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'firstStepDate'; then return name is 'firstStepDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirstStepDate_thenReturnNameIsFirstStepDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueStepSequence.meta().metaPropertyGet("firstStepDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ValueAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> frequencyResult = ((Meta) metaBeanResult).frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastStepDateResult = ((Meta) metaBeanResult).lastStepDate();
    assertTrue(lastStepDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("firstStepDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstStepDate());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, frequencyResult.metaBean());
    assertSame(metaBeanResult, lastStepDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then return name is {@code frequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'frequency'; then return name is 'frequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFrequency_thenReturnNameIsFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueStepSequence.meta().metaPropertyGet("frequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ValueAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> firstStepDateResult = ((Meta) metaBeanResult).firstStepDate();
    assertTrue(firstStepDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> lastStepDateResult = ((Meta) metaBeanResult).lastStepDate();
    assertTrue(lastStepDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("frequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).frequency());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, firstStepDateResult.metaBean());
    assertSame(metaBeanResult, lastStepDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lastStepDate}.
   *   <li>Then return name is {@code lastStepDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lastStepDate'; then return name is 'lastStepDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLastStepDate_thenReturnNameIsLastStepDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueStepSequence.meta().metaPropertyGet("lastStepDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ValueAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> firstStepDateResult = ((Meta) metaBeanResult).firstStepDate();
    assertTrue(firstStepDateResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> frequencyResult = ((Meta) metaBeanResult).frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("lastStepDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastStepDate());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, firstStepDateResult.metaBean());
    assertSame(metaBeanResult, frequencyResult.metaBean());
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
    assertNull(ValueStepSequence.meta().metaPropertyGet("Property Name"));
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
        ValueStepSequence.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("adjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("firstStepDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("frequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastStepDate") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = ValueStepSequence.meta();
    ValueStepSequence bean =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "adjustment", true);

    // Assert
    ValueAdjustment valueAdjustment = ((ValueAdjustment) actualPropertyGetResult).NONE;
    assertSame(valueAdjustment, bean.getAdjustment());
    assertSame(valueAdjustment, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet2() {
    // Arrange
    Meta metaResult = ValueStepSequence.meta();
    ValueStepSequence bean =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "frequency", true);

    // Assert
    Frequency frequency = ((Frequency) actualPropertyGetResult).P12M;
    assertSame(frequency, bean.getFrequency());
    assertSame(frequency, actualPropertyGetResult);
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
    assertNull(ValueStepSequence.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = ValueStepSequence.meta();
    ValueStepSequence bean =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstStepDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'firstStepDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFirstStepDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = ValueStepSequence.meta();
    LocalDate firstStepDate = LocalDate.of(1970, 1, 1);
    ValueStepSequence bean =
        ValueStepSequence.of(
            firstStepDate, LocalDate.of(1970, 1, 1), Frequency.P12M, ValueAdjustment.NONE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "firstStepDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(firstStepDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastStepDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'lastStepDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLastStepDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = ValueStepSequence.meta();
    LocalDate lastStepDate = LocalDate.of(1970, 1, 1);
    ValueStepSequence bean =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1), lastStepDate, Frequency.P12M, ValueAdjustment.NONE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "lastStepDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(lastStepDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'adjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueStepSequence.meta()
                .propertySet(mock(Bean.class), "adjustment", "New Value", true));
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
            ValueStepSequence.meta()
                .propertySet(mock(Bean.class), "adjustment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstStepDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstStepDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstStepDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueStepSequence.meta()
                .propertySet(mock(Bean.class), "firstStepDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'frequency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFrequency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueStepSequence.meta().propertySet(mock(Bean.class), "frequency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastStepDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lastStepDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLastStepDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueStepSequence.meta()
                .propertySet(mock(Bean.class), "lastStepDate", "New Value", true));
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
            ValueStepSequence.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ValueStepSequence#of(LocalDate, LocalDate, Frequency, ValueAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then return FirstStepDate is {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#of(LocalDate, LocalDate, Frequency,
   * ValueAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, Frequency, ValueAdjustment); when P12M; then return FirstStepDate is LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueStepSequence ValueStepSequence.of(LocalDate, LocalDate, Frequency, ValueAdjustment)"
  })
  void testOf_whenP12m_thenReturnFirstStepDateIsLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate firstStepDate = LocalDate.of(1970, 1, 1);
    LocalDate lastStepDate = LocalDate.of(1970, 1, 1);

    // Act
    ValueStepSequence actualOfResult =
        ValueStepSequence.of(firstStepDate, lastStepDate, Frequency.P12M, ValueAdjustment.NONE);

    // Assert
    assertSame(firstStepDate, actualOfResult.getFirstStepDate());
    assertSame(lastStepDate, actualOfResult.getLastStepDate());
    assertSame(Frequency.P12M, actualOfResult.getFrequency());
    assertSame(ValueAdjustment.NONE, actualOfResult.getAdjustment());
  }

  /**
   * Test {@link ValueStepSequence#meta()}.
   *
   * <p>Method under test: {@link ValueStepSequence#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueStepSequence.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValueStepSequence.meta();

    // Assert
    assertTrue(actualMetaResult.adjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.firstStepDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.frequency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lastStepDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ValueStepSequence#metaBean()}.
   *
   * <p>Method under test: {@link ValueStepSequence#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueStepSequence.metaBean()"})
  void testMetaBean() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStepSequence#toString()}
   *   <li>{@link ValueStepSequence#getAdjustment()}
   *   <li>{@link ValueStepSequence#getFirstStepDate()}
   *   <li>{@link ValueStepSequence#getFrequency()}
   *   <li>{@link ValueStepSequence#getLastStepDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueAdjustment ValueStepSequence.getAdjustment()",
    "LocalDate ValueStepSequence.getFirstStepDate()",
    "Frequency ValueStepSequence.getFrequency()",
    "LocalDate ValueStepSequence.getLastStepDate()",
    "String ValueStepSequence.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate firstStepDate = LocalDate.of(1970, 1, 1);
    LocalDate lastStepDate = LocalDate.of(1970, 1, 1);

    ValueStepSequence ofResult =
        ValueStepSequence.of(firstStepDate, lastStepDate, Frequency.P12M, ValueAdjustment.NONE);

    // Act
    String actualToStringResult = ofResult.toString();
    ValueAdjustment actualAdjustment = ofResult.getAdjustment();
    LocalDate actualFirstStepDate = ofResult.getFirstStepDate();
    Frequency actualFrequency = ofResult.getFrequency();
    LocalDate actualLastStepDate = ofResult.getLastStepDate();

    // Assert
    assertEquals("1970-01-01", actualFirstStepDate.toString());
    assertEquals("1970-01-01", actualLastStepDate.toString());
    assertEquals(
        "ValueStepSequence{firstStepDate=1970-01-01, lastStepDate=1970-01-01, frequency=P12M, adjustment"
            + "=ValueAdjustment[result = input]}",
        actualToStringResult);
    assertSame(firstStepDate, actualFirstStepDate);
    assertSame(lastStepDate, actualLastStepDate);
    assertSame(Frequency.P12M, actualFrequency);
    assertSame(ValueAdjustment.NONE, actualAdjustment);
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}, and {@link ValueStepSequence#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStepSequence#equals(Object)}
   *   <li>{@link ValueStepSequence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);
    ValueStepSequence ofResult2 =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}, and {@link ValueStepSequence#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStepSequence#equals(Object)}
   *   <li>{@link ValueStepSequence#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE),
        1);
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.ofYearDay(1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1), LocalDate.now(), Frequency.P12M, ValueAdjustment.NONE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ValueStepSequence ofResult =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P13W,
            ValueAdjustment.NONE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    LocalDate firstStepDate = LocalDate.of(1970, 1, 1);
    LocalDate lastStepDate = LocalDate.of(1970, 1, 1);

    ValueStepSequence ofResult =
        ValueStepSequence.of(
            firstStepDate, lastStepDate, Frequency.P12M, ValueAdjustment.ofDeltaAmount(0.5d));

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE),
        null);
  }

  /**
   * Test {@link ValueStepSequence#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStepSequence#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValueStepSequence.equals(Object)",
    "int ValueStepSequence.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE),
        "Different type to ValueStepSequence");
  }
}
