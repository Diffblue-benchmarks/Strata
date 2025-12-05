package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.product.swaption.SwaptionExerciseDates.Builder;
import com.opengamma.strata.product.swaption.SwaptionExerciseDates.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

class SwaptionExerciseDatesDiffblueTest {
  /**
   * Test Builder {@link Builder#dates(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dates(List)}
   */
  @Test
  @DisplayName("Test Builder dates(List) with 'List'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dates(List)"})
  void testBuilderDatesWithList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();

    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());

    // Act
    Builder actualDatesResult = builderResult.dates(dates);

    // Assert
    assertSame(builderResult, actualDatesResult);
  }

  /**
   * Test Builder {@link Builder#dates(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return not build AllDates.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dates(List)}
   */
  @Test
  @DisplayName("Test Builder dates(List) with 'List'; then return not build AllDates")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dates(List)"})
  void testBuilderDatesWithList_thenReturnNotBuildAllDates() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();

    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());

    // Act and Assert
    SwaptionExerciseDates swaptionExerciseDates = builderResult.dates(dates).build();
    assertFalse(swaptionExerciseDates.isAllDates());
    SwaptionExerciseDates swaptionExerciseDates2 = builderResult.build();
    assertFalse(swaptionExerciseDates2.isAllDates());
    assertFalse(swaptionExerciseDates.isAmerican());
    assertFalse(swaptionExerciseDates2.isAmerican());
    assertFalse(swaptionExerciseDates.isBermudan());
    assertFalse(swaptionExerciseDates2.isBermudan());
    assertTrue(swaptionExerciseDates.isEuropean());
    assertTrue(swaptionExerciseDates2.isEuropean());
    assertEquals(dates, swaptionExerciseDates.getDates());
    assertEquals(dates, swaptionExerciseDates2.getDates());
  }

  /**
   * Test Builder {@link Builder#dates(SwaptionExerciseDate[])} with {@code SwaptionExerciseDate[]}.
   *
   * <ul>
   *   <li>Then return build Dates size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dates(SwaptionExerciseDate[])}
   */
  @Test
  @DisplayName(
      "Test Builder dates(SwaptionExerciseDate[]) with 'SwaptionExerciseDate[]'; then return build Dates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dates(SwaptionExerciseDate[])"})
  void testBuilderDatesWithSwaptionExerciseDate_thenReturnBuildDatesSizeIsOne() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();
    SwaptionExerciseDate ofResult =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Act and Assert
    SwaptionExerciseDates swaptionExerciseDates = builderResult.dates(ofResult).build();
    ImmutableList<SwaptionExerciseDate> dates = swaptionExerciseDates.getDates();
    assertEquals(1, dates.size());
    assertFalse(swaptionExerciseDates.isAllDates());
    SwaptionExerciseDates swaptionExerciseDates2 = builderResult.build();
    assertFalse(swaptionExerciseDates2.isAllDates());
    assertFalse(swaptionExerciseDates.isAmerican());
    assertFalse(swaptionExerciseDates2.isAmerican());
    assertFalse(swaptionExerciseDates.isBermudan());
    assertFalse(swaptionExerciseDates2.isBermudan());
    assertTrue(swaptionExerciseDates.isEuropean());
    assertTrue(swaptionExerciseDates2.isEuropean());
    assertSame(ofResult, dates.get(0));
  }

  /**
   * Test Builder {@link Builder#dates(SwaptionExerciseDate[])} with {@code SwaptionExerciseDate[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dates(SwaptionExerciseDate[])}
   */
  @Test
  @DisplayName(
      "Test Builder dates(SwaptionExerciseDate[]) with 'SwaptionExerciseDate[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dates(SwaptionExerciseDate[])"})
  void testBuilderDatesWithSwaptionExerciseDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();
    SwaptionExerciseDate swaptionExerciseDate =
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act
    Builder actualDatesResult =
        builderResult.dates(
            swaptionExerciseDate,
            SwaptionExerciseDate.builder()
                .exerciseDate(LocalDate.of(1970, 1, 1))
                .swapStartDate(LocalDate.of(1970, 1, 1))
                .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
                .build());

    // Assert
    assertSame(builderResult, actualDatesResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dates'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDates_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = SwaptionExerciseDates.builder().get("dates");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> SwaptionExerciseDates.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SwaptionExerciseDates.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'dates'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDates_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();

    // Act
    Builder actualSetResult = builderResult.set("dates", new ArrayList<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SwaptionExerciseDates.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends SwaptionExerciseDates> actualBeanTypeResult =
        SwaptionExerciseDates.meta().beanType();

    // Assert
    Class<SwaptionExerciseDates> expectedBeanTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#allDates()}
   *   <li>{@link Meta#dates()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.allDates()", "MetaProperty Meta.dates()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SwaptionExerciseDates.meta();

    // Act
    MetaProperty<Boolean> actualAllDatesResult = metaResult.allDates();

    // Assert
    assertTrue(actualAllDatesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.dates() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code allDates}.
   *   <li>Then metaBean dates return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'allDates'; then metaBean dates return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAllDates_thenMetaBeanDatesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionExerciseDates.meta().metaPropertyGet("allDates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<SwaptionExerciseDate>> datesResult = ((Meta) metaBeanResult).dates();
    assertTrue(datesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("allDates", actualMetaPropertyGetResult.name());
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("dates", datesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, datesResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, datesResult.propertyType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult, datesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).allDates());
    assertSame(Meta.INSTANCE, datesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then metaBean allDates return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dates'; then metaBean allDates return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDates_thenMetaBeanAllDatesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionExerciseDates.meta().metaPropertyGet("dates");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> allDatesResult = ((Meta) metaBeanResult).allDates();
    assertTrue(allDatesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("allDates", allDatesResult.name());
    assertEquals("boolean", allDatesResult.propertyType().getName());
    assertEquals("dates", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, allDatesResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult, allDatesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dates());
    assertSame(Meta.INSTANCE, allDatesResult.metaBean());
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
    assertNull(SwaptionExerciseDates.meta().metaPropertyGet("Property Name"));
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
        SwaptionExerciseDates.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("dates");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("allDates");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("allDates", getResult2.name());
    assertEquals("boolean", getResult2.propertyType().getName());
    assertEquals("dates", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult2 = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
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
    assertNull(SwaptionExerciseDates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SwaptionExerciseDates.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code allDates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'allDates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAllDates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SwaptionExerciseDates.meta()
                .propertySet(mock(Bean.class), "allDates", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dates}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dates'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDates_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SwaptionExerciseDates.meta().propertySet(mock(Bean.class), "dates", "New Value", true));
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
            SwaptionExerciseDates.meta()
                .propertySet(mock(Bean.class), "allDates", "New Value", false));
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
            SwaptionExerciseDates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link SwaptionExerciseDates#ofEuropean(SwaptionExerciseDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Dates size is one.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#ofEuropean(SwaptionExerciseDate)}
   */
  @Test
  @DisplayName(
      "Test ofEuropean(SwaptionExerciseDate); when LocalDate with '1970' and one and one; then return Dates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionExerciseDates SwaptionExerciseDates.ofEuropean(SwaptionExerciseDate)"
  })
  void testOfEuropean_whenLocalDateWith1970AndOneAndOne_thenReturnDatesSizeIsOne() {
    // Arrange
    SwaptionExerciseDate exerciseDate =
        SwaptionExerciseDate.of(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Act
    SwaptionExerciseDates actualOfEuropeanResult = SwaptionExerciseDates.ofEuropean(exerciseDate);

    // Assert
    ImmutableList<SwaptionExerciseDate> dates = actualOfEuropeanResult.getDates();
    assertEquals(1, dates.size());
    assertFalse(actualOfEuropeanResult.isAllDates());
    assertFalse(actualOfEuropeanResult.isAmerican());
    assertFalse(actualOfEuropeanResult.isBermudan());
    assertTrue(actualOfEuropeanResult.isEuropean());
    assertSame(exerciseDate, dates.get(0));
  }

  /**
   * Test {@link SwaptionExerciseDates#isEuropean()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#isEuropean()}
   */
  @Test
  @DisplayName("Test isEuropean(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwaptionExerciseDates.isEuropean()"})
  void testIsEuropean_thenReturnFalse() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.ofYearDay(1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, false);

    // Act and Assert
    assertFalse(ofResult.isEuropean());
  }

  /**
   * Test {@link SwaptionExerciseDates#isEuropean()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#isEuropean()}
   */
  @Test
  @DisplayName("Test isEuropean(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwaptionExerciseDates.isEuropean()"})
  void testIsEuropean_thenReturnTrue() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, false);

    // Act and Assert
    assertTrue(ofResult.isEuropean());
  }

  /**
   * Test {@link SwaptionExerciseDates#isBermudan()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#isBermudan()}
   */
  @Test
  @DisplayName("Test isBermudan(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwaptionExerciseDates.isBermudan()"})
  void testIsBermudan_thenReturnFalse() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, false);

    // Act and Assert
    assertFalse(ofResult.isBermudan());
  }

  /**
   * Test {@link SwaptionExerciseDates#isBermudan()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#isBermudan()}
   */
  @Test
  @DisplayName("Test isBermudan(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwaptionExerciseDates.isBermudan()"})
  void testIsBermudan_thenReturnFalse2() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.ofYearDay(1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, true);

    // Act and Assert
    assertFalse(ofResult.isBermudan());
  }

  /**
   * Test {@link SwaptionExerciseDates#isBermudan()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#isBermudan()}
   */
  @Test
  @DisplayName("Test isBermudan(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwaptionExerciseDates.isBermudan()"})
  void testIsBermudan_thenReturnTrue() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.ofYearDay(1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, false);

    // Act and Assert
    assertTrue(ofResult.isBermudan());
  }

  /**
   * Test {@link SwaptionExerciseDates#meta()}.
   *
   * <p>Method under test: {@link SwaptionExerciseDates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionExerciseDates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SwaptionExerciseDates.meta();

    // Assert
    MetaProperty<Boolean> allDatesResult = actualMetaResult.allDates();
    assertTrue(allDatesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwaptionExerciseDate>> datesResult = actualMetaResult.dates();
    assertTrue(datesResult instanceof DirectMetaProperty);
    assertEquals("allDates", allDatesResult.name());
    assertEquals("boolean", allDatesResult.propertyType().getName());
    assertEquals("dates", datesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, allDatesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, datesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, datesResult.propertyType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult, allDatesResult.declaringType());
    Class<SwaptionExerciseDates> expectedDeclaringTypeResult2 = SwaptionExerciseDates.class;
    assertEquals(expectedDeclaringTypeResult2, datesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, allDatesResult.metaBean());
    assertSame(meta, datesResult.metaBean());
  }

  /**
   * Test {@link SwaptionExerciseDates#of(List, boolean)}.
   *
   * <ul>
   *   <li>Then return Dates size is two.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#of(List, boolean)}
   */
  @Test
  @DisplayName("Test of(List, boolean); then return Dates size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionExerciseDates SwaptionExerciseDates.of(List, boolean)"})
  void testOf_thenReturnDatesSizeIsTwo() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    LocalDate swapStartDate = LocalDate.ofYearDay(1, 1);
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(swapStartDate)
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    LocalDate exerciseDate = LocalDate.of(1970, 1, 1);
    LocalDate swapStartDate2 = LocalDate.of(1970, 1, 1);
    LocalDate unadjustedExerciseDate = LocalDate.of(1970, 1, 1);
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(exerciseDate)
            .swapStartDate(swapStartDate2)
            .unadjustedExerciseDate(unadjustedExerciseDate)
            .build());

    // Act
    SwaptionExerciseDates actualOfResult = SwaptionExerciseDates.of(dates, true);

    // Assert
    ImmutableList<SwaptionExerciseDate> dates2 = actualOfResult.getDates();
    assertEquals(2, dates2.size());
    LocalDate swapStartDate3 = dates2.get(0).getSwapStartDate();
    assertEquals("0001-01-01", swapStartDate3.toString());
    SwaptionExerciseDate getResult = dates2.get(1);
    LocalDate exerciseDate2 = getResult.getExerciseDate();
    assertEquals("1970-01-01", exerciseDate2.toString());
    LocalDate swapStartDate4 = getResult.getSwapStartDate();
    assertEquals("1970-01-01", swapStartDate4.toString());
    LocalDate unadjustedExerciseDate2 = getResult.getUnadjustedExerciseDate();
    assertEquals("1970-01-01", unadjustedExerciseDate2.toString());
    assertFalse(actualOfResult.isEuropean());
    assertTrue(actualOfResult.isAllDates());
    assertTrue(actualOfResult.isAmerican());
    assertSame(exerciseDate, exerciseDate2);
    assertSame(swapStartDate2, swapStartDate4);
    assertSame(unadjustedExerciseDate, unadjustedExerciseDate2);
    assertSame(swapStartDate, swapStartDate3);
  }

  /**
   * Test {@link SwaptionExerciseDates#of(List, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#of(List, boolean)}
   */
  @Test
  @DisplayName("Test of(List, boolean); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionExerciseDates SwaptionExerciseDates.of(List, boolean)"})
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> SwaptionExerciseDates.of(dates, true));
  }

  /**
   * Test {@link SwaptionExerciseDates#of(List, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return Dates size is one.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#of(List, boolean)}
   */
  @Test
  @DisplayName("Test of(List, boolean); when 'false'; then return Dates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionExerciseDates SwaptionExerciseDates.of(List, boolean)"})
  void testOf_whenFalse_thenReturnDatesSizeIsOne() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    LocalDate swapStartDate = LocalDate.of(1970, 1, 1);
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(swapStartDate)
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());

    // Act
    SwaptionExerciseDates actualOfResult = SwaptionExerciseDates.of(dates, false);

    // Assert
    ImmutableList<SwaptionExerciseDate> dates2 = actualOfResult.getDates();
    assertEquals(1, dates2.size());
    LocalDate swapStartDate2 = dates2.get(0).getSwapStartDate();
    assertEquals("1970-01-01", swapStartDate2.toString());
    assertFalse(actualOfResult.isAllDates());
    assertFalse(actualOfResult.isAmerican());
    assertTrue(actualOfResult.isEuropean());
    assertSame(swapStartDate, swapStartDate2);
  }

  /**
   * Test {@link SwaptionExerciseDates#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionExerciseDates#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionExerciseDates.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    ArrayList<SwaptionExerciseDate> dates = new ArrayList<>();
    dates.add(
        SwaptionExerciseDate.builder()
            .exerciseDate(LocalDate.of(1970, 1, 1))
            .swapStartDate(LocalDate.of(1970, 1, 1))
            .unadjustedExerciseDate(LocalDate.of(1970, 1, 1))
            .build());
    SwaptionExerciseDates ofResult = SwaptionExerciseDates.of(dates, false);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
