package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.option.DeltaStrike;
import com.opengamma.strata.market.option.Strike;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.pricer.common.GenericVolatilitySurfaceYearFractionParameterMetadata;
import com.opengamma.strata.pricer.fxopt.InterpolatedStrikeSmileDeltaTermStructure.Meta;
import java.util.List;
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
import org.mockito.Mockito;

class InterpolatedStrikeSmileDeltaTermStructureDiffblueTest {
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
    Class<? extends InterpolatedStrikeSmileDeltaTermStructure> actualBeanTypeResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().beanType();

    // Assert
    Class<InterpolatedStrikeSmileDeltaTermStructure> expectedBeanTypeResult =
        InterpolatedStrikeSmileDeltaTermStructure.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#strikeExtrapolatorLeft()}
   *   <li>{@link Meta#strikeExtrapolatorRight()}
   *   <li>{@link Meta#strikeInterpolator()}
   *   <li>{@link Meta#timeExtrapolatorLeft()}
   *   <li>{@link Meta#timeExtrapolatorRight()}
   *   <li>{@link Meta#timeInterpolator()}
   *   <li>{@link Meta#volatilityTerm()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.strikeExtrapolatorLeft()",
    "MetaProperty Meta.strikeExtrapolatorRight()",
    "MetaProperty Meta.strikeInterpolator()",
    "MetaProperty Meta.timeExtrapolatorLeft()",
    "MetaProperty Meta.timeExtrapolatorRight()",
    "MetaProperty Meta.timeInterpolator()",
    "MetaProperty Meta.volatilityTerm()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InterpolatedStrikeSmileDeltaTermStructure.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<CurveExtrapolator> actualStrikeExtrapolatorLeftResult =
        metaResult.strikeExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualStrikeExtrapolatorRightResult =
        metaResult.strikeExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualStrikeInterpolatorResult =
        metaResult.strikeInterpolator();
    MetaProperty<CurveExtrapolator> actualTimeExtrapolatorLeftResult =
        metaResult.timeExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualTimeExtrapolatorRightResult =
        metaResult.timeExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualTimeInterpolatorResult = metaResult.timeInterpolator();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualTimeExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualTimeExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualTimeInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(metaResult.volatilityTerm() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("strikeExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("strikeExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("strikeExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("strikeExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("strikeInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("strikeInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("timeExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("timeExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("timeExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("timeExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
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
    assertNull(InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code timeInterpolator}.
   *   <li>Then return name is {@code timeInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'timeInterpolator'; then return name is 'timeInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTimeInterpolator_thenReturnNameIsTimeInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("timeInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).volatilityTerm() instanceof DirectMetaProperty);
    assertEquals("timeInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code volatilityTerm}.
   *   <li>Then return name is {@code volatilityTerm}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'volatilityTerm'; then return name is 'volatilityTerm'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenVolatilityTerm_thenReturnNameIsVolatilityTerm() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyGet("volatilityTerm");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("volatilityTerm", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatilityTerm());
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
        InterpolatedStrikeSmileDeltaTermStructure.meta().metaPropertyMap();

    // Assert
    assertEquals(8, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("strikeExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("strikeExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strikeInterpolator") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("timeExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("timeExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeInterpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("volatilityTerm") instanceof DirectMetaProperty);
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
        InterpolatedStrikeSmileDeltaTermStructure.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertyGet(
                    FxVolatilitySmileDataSet.getSmileDeltaTermStructure5(), "dayCount", true));
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
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertyGet(
                    FxVolatilitySmileDataSet.getSmileDeltaTermStructure5(),
                    "Property Name",
                    false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatilityTerm}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'volatilityTerm'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenVolatilityTerm_thenReturnList() {
    // Arrange and Act
    Object actualPropertyGetResult =
        InterpolatedStrikeSmileDeltaTermStructure.meta()
            .propertyGet(
                FxVolatilitySmileDataSet.getSmileDeltaTermStructure5(), "volatilityTerm", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertEquals(5, ((List<SmileDeltaParameters>) actualPropertyGetResult).size());
    SmileDeltaParameters getResult = ((List<SmileDeltaParameters>) actualPropertyGetResult).get(0);
    assertEquals(0.25205479452054796d, getResult.getExpiry());
    SmileDeltaParameters getResult2 = ((List<SmileDeltaParameters>) actualPropertyGetResult).get(1);
    assertEquals(0.5013698630136987d, getResult2.getExpiry());
    SmileDeltaParameters getResult3 = ((List<SmileDeltaParameters>) actualPropertyGetResult).get(2);
    assertEquals(1.0015120892282356d, getResult3.getExpiry());
    SmileDeltaParameters getResult4 = ((List<SmileDeltaParameters>) actualPropertyGetResult).get(3);
    assertEquals(2.0d, getResult4.getExpiry());
    assertEquals(5, getResult.getParameterCount());
    assertEquals(5, getResult2.getParameterCount());
    assertEquals(5, getResult3.getParameterCount());
    assertEquals(5, getResult4.getParameterCount());
    SmileDeltaParameters getResult5 = ((List<SmileDeltaParameters>) actualPropertyGetResult).get(4);
    assertEquals(5, getResult5.getParameterCount());
    assertEquals(5, getResult.getParameterMetadata().size());
    assertEquals(5, getResult2.getParameterMetadata().size());
    assertEquals(5, getResult3.getParameterMetadata().size());
    assertEquals(5, getResult4.getParameterMetadata().size());
    assertEquals(5, getResult5.getParameterMetadata().size());
    assertEquals(5.001512089228235d, getResult5.getExpiry());
    Optional<Tenor> expiryTenor = getResult.getExpiryTenor();
    assertFalse(expiryTenor.isPresent());
    assertSame(expiryTenor, getResult2.getExpiryTenor());
    assertSame(expiryTenor, getResult3.getExpiryTenor());
    assertSame(expiryTenor, getResult4.getExpiryTenor());
    assertSame(expiryTenor, getResult5.getExpiryTenor());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
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
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strikeExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strikeExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrikeExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "strikeExtrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strikeExtrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strikeExtrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrikeExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "strikeExtrapolatorRight", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strikeInterpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strikeInterpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrikeInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "strikeInterpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "timeExtrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeExtrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeExtrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "timeExtrapolatorRight", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeInterpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeInterpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedStrikeSmileDeltaTermStructure.meta()
                .propertySet(mock(Bean.class), "timeInterpolator", "New Value", true));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray, DoubleArray,
   * DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)} with {@code
   * expiries}, {@code delta}, {@code volatility}, {@code dayCount}, {@code strikeInterpolator},
   * {@code strikeExtrapolatorLeft}, {@code strikeExtrapolatorRight}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray,
   * DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(DoubleArray, DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator) with 'expiries', 'delta', 'volatility', 'dayCount', 'strikeInterpolator', 'strikeExtrapolatorLeft', 'strikeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.of(DoubleArray, DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void
      testOfWithExpiriesDeltaVolatilityDayCountStrikeInterpolatorStrikeExtrapolatorLeftStrikeExtrapolatorRight() {
    // Arrange
    DoubleArray expiries = DoubleArray.filled(3);
    DoubleArray delta = DoubleArray.of(0.5d);
    DayCount dayCount = mock(DayCount.class);
    CurveInterpolator strikeInterpolator = mock(CurveInterpolator.class);
    CurveExtrapolator strikeExtrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator strikeExtrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    InterpolatedStrikeSmileDeltaTermStructure actualOfResult =
        InterpolatedStrikeSmileDeltaTermStructure.of(
            expiries,
            delta,
            DoubleMatrix.identity(3),
            dayCount,
            strikeInterpolator,
            strikeExtrapolatorLeft,
            strikeExtrapolatorRight);

    // Assert
    assertEquals(3, actualOfResult.getSmileCount());
    assertEquals(3, actualOfResult.getStrikeCount());
    assertEquals(3, actualOfResult.getVolatilityTerm().size());
    assertEquals(3, actualOfResult.getExpiryTenors().size());
    assertEquals(9, actualOfResult.getParameterCount());
    assertSame(expiries, actualOfResult.getExpiries());
    assertSame(delta, actualOfResult.getDelta());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(strikeExtrapolatorLeft, actualOfResult.getStrikeExtrapolatorLeft());
    assertSame(strikeExtrapolatorRight, actualOfResult.getStrikeExtrapolatorRight());
    assertSame(strikeInterpolator, actualOfResult.getStrikeInterpolator());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray, DoubleArray,
   * DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator,
   * CurveInterpolator, CurveExtrapolator, CurveExtrapolator)} with {@code expiries}, {@code delta},
   * {@code volatility}, {@code dayCount}, {@code timeInterpolator}, {@code timeExtrapolatorLeft},
   * {@code timeExtrapolatorRight}, {@code strikeInterpolator}, {@code strikeExtrapolatorLeft},
   * {@code strikeExtrapolatorRight}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray,
   * DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator,
   * CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(DoubleArray, DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator) with 'expiries', 'delta', 'volatility', 'dayCount', 'timeInterpolator', 'timeExtrapolatorLeft', 'timeExtrapolatorRight', 'strikeInterpolator', 'strikeExtrapolatorLeft', 'strikeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.of(DoubleArray, DoubleArray, DoubleMatrix, DayCount, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void
      testOfWithExpiriesDeltaVolatilityDayCountTimeInterpolatorTimeExtrapolatorLeftTimeExtrapolatorRightStrikeInterpolatorStrikeExtrapolatorLeftStrikeExtrapolatorRight() {
    // Arrange
    DoubleArray expiries = DoubleArray.filled(3);
    DoubleArray delta = DoubleArray.of(0.5d);
    DayCount dayCount = mock(DayCount.class);
    CurveInterpolator timeInterpolator = mock(CurveInterpolator.class);
    CurveExtrapolator timeExtrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator timeExtrapolatorRight = mock(CurveExtrapolator.class);
    CurveInterpolator strikeInterpolator = mock(CurveInterpolator.class);
    CurveExtrapolator strikeExtrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator strikeExtrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    InterpolatedStrikeSmileDeltaTermStructure actualOfResult =
        InterpolatedStrikeSmileDeltaTermStructure.of(
            expiries,
            delta,
            DoubleMatrix.identity(3),
            dayCount,
            timeInterpolator,
            timeExtrapolatorLeft,
            timeExtrapolatorRight,
            strikeInterpolator,
            strikeExtrapolatorLeft,
            strikeExtrapolatorRight);

    // Assert
    assertEquals(3, actualOfResult.getSmileCount());
    assertEquals(3, actualOfResult.getStrikeCount());
    assertEquals(3, actualOfResult.getVolatilityTerm().size());
    assertEquals(3, actualOfResult.getExpiryTenors().size());
    assertEquals(9, actualOfResult.getParameterCount());
    assertSame(expiries, actualOfResult.getExpiries());
    assertSame(delta, actualOfResult.getDelta());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(strikeExtrapolatorLeft, actualOfResult.getStrikeExtrapolatorLeft());
    assertSame(strikeExtrapolatorRight, actualOfResult.getStrikeExtrapolatorRight());
    assertSame(timeExtrapolatorLeft, actualOfResult.getTimeExtrapolatorLeft());
    assertSame(timeExtrapolatorRight, actualOfResult.getTimeExtrapolatorRight());
    assertSame(strikeInterpolator, actualOfResult.getStrikeInterpolator());
    assertSame(timeInterpolator, actualOfResult.getTimeInterpolator());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray, DoubleArray,
   * DoubleMatrix, DayCount)} with {@code expiries}, {@code delta}, {@code volatility}, {@code
   * dayCount}.
   *
   * <ul>
   *   <li>Then return SmileCount is three.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#of(DoubleArray,
   * DoubleArray, DoubleMatrix, DayCount)}
   */
  @Test
  @DisplayName(
      "Test of(DoubleArray, DoubleArray, DoubleMatrix, DayCount) with 'expiries', 'delta', 'volatility', 'dayCount'; then return SmileCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.of(DoubleArray, DoubleArray, DoubleMatrix, DayCount)"
  })
  void testOfWithExpiriesDeltaVolatilityDayCount_thenReturnSmileCountIsThree() {
    // Arrange
    DoubleArray expiries = DoubleArray.filled(3);
    DoubleArray delta = DoubleArray.of(0.5d);
    DayCount dayCount = mock(DayCount.class);

    // Act
    InterpolatedStrikeSmileDeltaTermStructure actualOfResult =
        InterpolatedStrikeSmileDeltaTermStructure.of(
            expiries, delta, DoubleMatrix.identity(3), dayCount);

    // Assert
    assertEquals(3, actualOfResult.getSmileCount());
    assertEquals(3, actualOfResult.getStrikeCount());
    assertEquals(3, actualOfResult.getVolatilityTerm().size());
    assertEquals(3, actualOfResult.getExpiryTenors().size());
    assertEquals(9, actualOfResult.getParameterCount());
    assertSame(expiries, actualOfResult.getExpiries());
    assertSame(delta, actualOfResult.getDelta());
    assertSame(dayCount, actualOfResult.getDayCount());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getParameterCount()}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int InterpolatedStrikeSmileDeltaTermStructure.getParameterCount()"})
  void testGetParameterCount() {
    // Arrange, Act and Assert
    assertEquals(25, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getParameterCount());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getParameter(int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.218}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when five; then return '0.218'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InterpolatedStrikeSmileDeltaTermStructure.getParameter(int)"})
  void testGetParameter_whenFive_thenReturn0218() {
    // Arrange, Act and Assert
    assertEquals(0.218d, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getParameter(5));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getParameter(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.199}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when one; then return '0.199'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InterpolatedStrikeSmileDeltaTermStructure.getParameter(int)"})
  void testGetParameter_whenOne_thenReturn0199() {
    // Arrange, Act and Assert
    assertEquals(0.199d, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getParameter(1));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return Strike Label is {@code Delta=0.9}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); when five; then return Strike Label is 'Delta=0.9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterMetadata InterpolatedStrikeSmileDeltaTermStructure.getParameterMetadata(int)"
  })
  void testGetParameterMetadata_whenFive_thenReturnStrikeLabelIsDelta09() {
    // Arrange and Act
    ParameterMetadata actualParameterMetadata =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getParameterMetadata(5);

    // Assert
    Strike strike =
        ((GenericVolatilitySurfaceYearFractionParameterMetadata) actualParameterMetadata)
            .getStrike();
    assertTrue(strike instanceof DeltaStrike);
    assertTrue(
        actualParameterMetadata instanceof GenericVolatilitySurfaceYearFractionParameterMetadata);
    assertEquals("Delta=0.9", strike.getLabel());
    assertEquals("[0.5013698630136987, Delta=0.9]", actualParameterMetadata.getLabel());
    assertEquals(
        0.5013698630136987d,
        ((GenericVolatilitySurfaceYearFractionParameterMetadata) actualParameterMetadata)
            .getYearFraction());
    Object identifier = actualParameterMetadata.getIdentifier();
    assertEquals(0.5013698630136987d, ((Pair<Double, Strike>) identifier).getFirst().doubleValue());
    assertEquals(0.9d, strike.getValue());
    assertSame(strike, ((Pair<Double, Strike>) identifier).getSecond());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Strike Label is {@code Delta=0.75}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); when one; then return Strike Label is 'Delta=0.75'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterMetadata InterpolatedStrikeSmileDeltaTermStructure.getParameterMetadata(int)"
  })
  void testGetParameterMetadata_whenOne_thenReturnStrikeLabelIsDelta075() {
    // Arrange and Act
    ParameterMetadata actualParameterMetadata =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getParameterMetadata(1);

    // Assert
    Strike strike =
        ((GenericVolatilitySurfaceYearFractionParameterMetadata) actualParameterMetadata)
            .getStrike();
    assertTrue(strike instanceof DeltaStrike);
    assertTrue(
        actualParameterMetadata instanceof GenericVolatilitySurfaceYearFractionParameterMetadata);
    assertEquals("Delta=0.75", strike.getLabel());
    assertEquals("[0.25205479452054796, Delta=0.75]", actualParameterMetadata.getLabel());
    assertEquals(
        0.25205479452054796d,
        ((GenericVolatilitySurfaceYearFractionParameterMetadata) actualParameterMetadata)
            .getYearFraction());
    Object identifier = actualParameterMetadata.getIdentifier();
    assertEquals(
        0.25205479452054796d, ((Pair<Double, Strike>) identifier).getFirst().doubleValue());
    assertEquals(0.75d, strike.getValue());
    assertSame(strike, ((Pair<Double, Strike>) identifier).getSecond());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return ExpiryTenors size is five.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#withParameter(int,
   * double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); when five; then return ExpiryTenors size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.withParameter(int, double)"
  })
  void testWithParameter_whenFive_thenReturnExpiryTenorsSizeIsFive() {
    // Arrange and Act
    InterpolatedStrikeSmileDeltaTermStructure actualWithParameterResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().withParameter(5, 10.0d);

    // Assert
    List<Optional<Tenor>> expiryTenors = actualWithParameterResult.getExpiryTenors();
    assertEquals(5, expiryTenors.size());
    Optional<Tenor> getResult = expiryTenors.get(0);
    assertSame(getResult, expiryTenors.get(1));
    assertSame(getResult, expiryTenors.get(2));
    assertSame(getResult, expiryTenors.get(3));
    assertSame(getResult, expiryTenors.get(4));
    assertArrayEquals(
        new double[] {0.1d, 0.25d, 0.5d, 0.75d, 0.9d},
        actualWithParameterResult.getDeltaFull().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.25205479452054796d, 0.5013698630136987d, 1.0015120892282356d, 2.0d, 5.001512089228235d
        },
        actualWithParameterResult.getExpiries().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#withParameter(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ExpiryTenors size is five.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#withParameter(int,
   * double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); when one; then return ExpiryTenors size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.withParameter(int, double)"
  })
  void testWithParameter_whenOne_thenReturnExpiryTenorsSizeIsFive() {
    // Arrange and Act
    InterpolatedStrikeSmileDeltaTermStructure actualWithParameterResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().withParameter(1, 10.0d);

    // Assert
    List<Optional<Tenor>> expiryTenors = actualWithParameterResult.getExpiryTenors();
    assertEquals(5, expiryTenors.size());
    Optional<Tenor> getResult = expiryTenors.get(0);
    assertSame(getResult, expiryTenors.get(1));
    assertSame(getResult, expiryTenors.get(2));
    assertSame(getResult, expiryTenors.get(3));
    assertSame(getResult, expiryTenors.get(4));
    assertArrayEquals(
        new double[] {0.1d, 0.25d, 0.5d, 0.75d, 0.9d},
        actualWithParameterResult.getDeltaFull().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.25205479452054796d, 0.5013698630136987d, 1.0015120892282356d, 2.0d, 5.001512089228235d
        },
        actualWithParameterResult.getExpiries().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedStrikeSmileDeltaTermStructure InterpolatedStrikeSmileDeltaTermStructure.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation() {
    // Arrange
    InterpolatedStrikeSmileDeltaTermStructure smileDeltaTermStructure5 =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5();

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    InterpolatedStrikeSmileDeltaTermStructure actualWithPerturbationResult =
        smileDeltaTermStructure5.withPerturbation(perturbation);

    // Assert
    verify(perturbation, atLeast(1))
        .perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any());
    assertEquals(25, actualWithPerturbationResult.getParameterCount());
    assertEquals(5, actualWithPerturbationResult.getSmileCount());
    assertEquals(5, actualWithPerturbationResult.getStrikeCount());
    assertEquals(5, actualWithPerturbationResult.getVolatilityTerm().size());
    assertEquals(5, actualWithPerturbationResult.getExpiryTenors().size());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#getExpiryTenors()}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#getExpiryTenors()}
   */
  @Test
  @DisplayName("Test getExpiryTenors()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List InterpolatedStrikeSmileDeltaTermStructure.getExpiryTenors()"})
  void testGetExpiryTenors() {
    // Arrange and Act
    List<Optional<Tenor>> actualExpiryTenors =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().getExpiryTenors();

    // Assert
    assertEquals(5, actualExpiryTenors.size());
    Optional<Tenor> getResult = actualExpiryTenors.get(0);
    assertFalse(getResult.isPresent());
    assertSame(getResult, actualExpiryTenors.get(1));
    assertSame(getResult, actualExpiryTenors.get(2));
    assertSame(getResult, actualExpiryTenors.get(3));
    assertSame(getResult, actualExpiryTenors.get(4));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 5.001512089228235}.
   *   <li>Then return {@code 0.16512176117976243}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double); when '5.001512089228235'; then return '0.16512176117976243'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double InterpolatedStrikeSmileDeltaTermStructure.volatility(double, double, double)"
  })
  void testVolatility_when5001512089228235_thenReturn016512176117976243() {
    // Arrange, Act and Assert
    assertEquals(
        0.16512176117976243d,
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .volatility(5.001512089228235d, 10.0d, 10.0d));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.25205479452054796}.
   *   <li>Then return {@code 0.18593372309919004}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double); when '0.25205479452054796'; then return '0.18593372309919004'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double InterpolatedStrikeSmileDeltaTermStructure.volatility(double, double, double)"
  })
  void testVolatility_when025205479452054796_thenReturn018593372309919004() {
    // Arrange, Act and Assert
    assertEquals(
        0.18593372309919004d,
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .volatility(0.25205479452054796d, 10.0d, 10.0d));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.17212124603638712}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double); when one; then return '0.17212124603638712'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double InterpolatedStrikeSmileDeltaTermStructure.volatility(double, double, double)"
  })
  void testVolatility_whenOne_thenReturn017212124603638712() {
    // Arrange, Act and Assert
    assertEquals(
        0.17212124603638712d,
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().volatility(1.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.16753717323906187}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#volatility(double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double); when ten; then return '0.16753717323906187'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double InterpolatedStrikeSmileDeltaTermStructure.volatility(double, double, double)"
  })
  void testVolatility_whenTen_thenReturn016753717323906187() {
    // Arrange, Act and Assert
    assertEquals(
        0.16753717323906187d,
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().volatility(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double,
   * double, double)}.
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double, double, double)}
   */
  @Test
  @DisplayName("Test volatilityAndSensitivities(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityAndBucketedSensitivities InterpolatedStrikeSmileDeltaTermStructure.volatilityAndSensitivities(double, double, double)"
  })
  void testVolatilityAndSensitivities() {
    // Arrange, Act and Assert
    double[][] toArrayUnsafeResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .volatilityAndSensitivities(10.0d, 10.0d, 10.0d)
            .getSensitivities()
            .toArrayUnsafe();
    assertEquals(5, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.40741476967901935d, 0.5925852303209806d, 0.0d, 0.0d},
        toArrayUnsafeResult[4],
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return Sensitivities size is thirty.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAndSensitivities(double, double, double); then return Sensitivities size is thirty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityAndBucketedSensitivities InterpolatedStrikeSmileDeltaTermStructure.volatilityAndSensitivities(double, double, double)"
  })
  void testVolatilityAndSensitivities_thenReturnSensitivitiesSizeIsThirty() {
    // Arrange, Act and Assert
    DoubleMatrix sensitivities =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure6()
            .volatilityAndSensitivities(10.0d, 10.0d, 10.0d)
            .getSensitivities();
    assertEquals(30, sensitivities.size());
    double[][] toArrayUnsafeResult = sensitivities.toArrayUnsafe();
    assertEquals(6, toArrayUnsafeResult.length);
    assertFalse(sensitivities.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[4], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.40741476967901935d, 0.5925852303209806d, 0.0d, 0.0d},
        toArrayUnsafeResult[5],
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Volatility is {@code 0.201}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAndSensitivities(double, double, double); when one; then return Volatility is '0.201'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityAndBucketedSensitivities InterpolatedStrikeSmileDeltaTermStructure.volatilityAndSensitivities(double, double, double)"
  })
  void testVolatilityAndSensitivities_whenOne_thenReturnVolatilityIs0201() {
    // Arrange and Act
    VolatilityAndBucketedSensitivities actualVolatilityAndSensitivitiesResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .volatilityAndSensitivities(10.0d, 1.0d, 10.0d);

    // Assert
    assertEquals(0.201d, actualVolatilityAndSensitivitiesResult.getVolatility());
    double[][] toArrayUnsafeResult =
        actualVolatilityAndSensitivitiesResult.getSensitivities().toArrayUnsafe();
    assertEquals(5, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[4], 0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Volatility is {@code 0.17212124603638712}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#volatilityAndSensitivities(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAndSensitivities(double, double, double); when one; then return Volatility is '0.17212124603638712'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityAndBucketedSensitivities InterpolatedStrikeSmileDeltaTermStructure.volatilityAndSensitivities(double, double, double)"
  })
  void testVolatilityAndSensitivities_whenOne_thenReturnVolatilityIs017212124603638712() {
    // Arrange and Act
    VolatilityAndBucketedSensitivities actualVolatilityAndSensitivitiesResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .volatilityAndSensitivities(1.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.17212124603638712d, actualVolatilityAndSensitivitiesResult.getVolatility());
    DoubleMatrix sensitivities = actualVolatilityAndSensitivitiesResult.getSensitivities();
    assertEquals(0.9999975126177605d, sensitivities.total());
    double[][] toArrayUnsafeResult = sensitivities.toArrayUnsafe();
    assertEquals(5, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[4], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.12368253879823782d, 0.8747126615568592d, 0.0d, 0.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.9629736587997964E-4d, 0.0014060148967834966d, 0.0d, 0.0d},
        toArrayUnsafeResult[1],
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double,
   * double)}.
   *
   * <ul>
   *   <li>Given SmileDeltaTermStructure6.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test partialFirstDerivatives(double, double, double); given SmileDeltaTermStructure6")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives InterpolatedStrikeSmileDeltaTermStructure.partialFirstDerivatives(double, double, double)"
  })
  void testPartialFirstDerivatives_givenSmileDeltaTermStructure6() {
    // Arrange and Act
    ValueDerivatives actualPartialFirstDerivativesResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure6()
            .partialFirstDerivatives(10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualPartialFirstDerivativesResult.getDerivatives();
    assertEquals(-0.005099718804570219d, derivatives.sum());
    assertEquals(-0.005519595388014212d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.005519595388014212d, toListResult.get(1).doubleValue());
    assertEquals(0.16753717323906187d, actualPartialFirstDerivativesResult.getValue());
    assertEquals(4.1987658344399295E-4d, derivatives.max());
    assertEquals(4.1987658344399295E-4d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {4.1987658344399295E-4d, -0.005519595388014212d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double,
   * double)}.
   *
   * <ul>
   *   <li>Then return Derivatives max is {@code -0.009151596441120133}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test partialFirstDerivatives(double, double, double); then return Derivatives max is '-0.009151596441120133'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives InterpolatedStrikeSmileDeltaTermStructure.partialFirstDerivatives(double, double, double)"
  })
  void testPartialFirstDerivatives_thenReturnDerivativesMaxIs0009151596441120133() {
    // Arrange and Act
    ValueDerivatives actualPartialFirstDerivativesResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .partialFirstDerivatives(1.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualPartialFirstDerivativesResult.getDerivatives();
    assertEquals(-0.009151596441120133d, derivatives.max());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.009151596441120133d, toListResult.get(0).doubleValue());
    assertEquals(-0.014464220240672737d, derivatives.min());
    assertEquals(-0.014464220240672737d, toListResult.get(1).doubleValue());
    assertEquals(-0.02361581668179287d, derivatives.sum());
    assertEquals(0.17212124603638712d, actualPartialFirstDerivativesResult.getValue());
    assertArrayEquals(
        new double[] {-0.009151596441120133d, -0.014464220240672737d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double,
   * double)}.
   *
   * <ul>
   *   <li>Then return Derivatives sum is {@code -0.005099718804570219}.
   * </ul>
   *
   * <p>Method under test: {@link
   * InterpolatedStrikeSmileDeltaTermStructure#partialFirstDerivatives(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test partialFirstDerivatives(double, double, double); then return Derivatives sum is '-0.005099718804570219'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives InterpolatedStrikeSmileDeltaTermStructure.partialFirstDerivatives(double, double, double)"
  })
  void testPartialFirstDerivatives_thenReturnDerivativesSumIs0005099718804570219() {
    // Arrange and Act
    ValueDerivatives actualPartialFirstDerivativesResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5()
            .partialFirstDerivatives(10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualPartialFirstDerivativesResult.getDerivatives();
    assertEquals(-0.005099718804570219d, derivatives.sum());
    assertEquals(-0.005519595388014212d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.005519595388014212d, toListResult.get(1).doubleValue());
    assertEquals(0.16753717323906187d, actualPartialFirstDerivativesResult.getValue());
    assertEquals(4.1987658344399295E-4d, derivatives.max());
    assertEquals(4.1987658344399295E-4d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {4.1987658344399295E-4d, -0.005519595388014212d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#smileForExpiry(double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Volatility min is {@code 0.17001560311535627}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#smileForExpiry(double)}
   */
  @Test
  @DisplayName(
      "Test smileForExpiry(double); when one; then return Volatility min is '0.17001560311535627'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters InterpolatedStrikeSmileDeltaTermStructure.smileForExpiry(double)"
  })
  void testSmileForExpiry_whenOne_thenReturnVolatilityMinIs017001560311535627() {
    // Arrange and Act
    SmileDeltaParameters actualSmileForExpiryResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().smileForExpiry(1.0d);

    // Assert
    DoubleArray volatility = actualSmileForExpiryResult.getVolatility();
    assertEquals(0.17001560311535627d, volatility.min());
    assertEquals(0.20951314527024478d, volatility.max());
    assertEquals(0.9420714543237612d, volatility.sum());
    assertEquals(1.0d, actualSmileForExpiryResult.getExpiry());
    assertArrayEquals(
        new double[] {
          0.20951314527024478d,
          0.1870131766674156d,
          0.17001560311535627d,
          0.17901478162269632d,
          0.19651474764804827d
        },
        volatility.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#smileForExpiry(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Volatility min is {@code 0.16}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#smileForExpiry(double)}
   */
  @Test
  @DisplayName("Test smileForExpiry(double); when ten; then return Volatility min is '0.16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SmileDeltaParameters InterpolatedStrikeSmileDeltaTermStructure.smileForExpiry(double)"
  })
  void testSmileForExpiry_whenTen_thenReturnVolatilityMinIs016() {
    // Arrange and Act
    SmileDeltaParameters actualSmileForExpiryResult =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().smileForExpiry(10.0d);

    // Assert
    DoubleArray volatility = actualSmileForExpiryResult.getVolatility();
    assertEquals(0.16d, volatility.min());
    assertEquals(0.201d, volatility.max());
    assertEquals(0.8960000000000001d, volatility.sum());
    assertEquals(10.0d, actualSmileForExpiryResult.getExpiry());
    assertArrayEquals(
        new double[] {0.201d, 0.17850000000000002d, 0.16d, 0.1695d, 0.187d},
        volatility.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#meta()}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InterpolatedStrikeSmileDeltaTermStructure.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InterpolatedStrikeSmileDeltaTermStructure.meta();

    // Assert
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.volatilityTerm() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#metaBean()}.
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InterpolatedStrikeSmileDeltaTermStructure.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FxVolatilitySmileDataSet.getSmileDeltaTermStructure5().metaBean());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}, and {@link
   * InterpolatedStrikeSmileDeltaTermStructure#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}
   *   <li>{@link InterpolatedStrikeSmileDeltaTermStructure#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InterpolatedStrikeSmileDeltaTermStructure.equals(Object)",
    "int InterpolatedStrikeSmileDeltaTermStructure.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    InterpolatedStrikeSmileDeltaTermStructure smileDeltaTermStructure5 =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5();
    InterpolatedStrikeSmileDeltaTermStructure smileDeltaTermStructure52 =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5();

    // Act and Assert
    assertEquals(smileDeltaTermStructure5, smileDeltaTermStructure52);
    assertEquals(smileDeltaTermStructure5.hashCode(), smileDeltaTermStructure52.hashCode());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}, and {@link
   * InterpolatedStrikeSmileDeltaTermStructure#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}
   *   <li>{@link InterpolatedStrikeSmileDeltaTermStructure#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InterpolatedStrikeSmileDeltaTermStructure.equals(Object)",
    "int InterpolatedStrikeSmileDeltaTermStructure.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    InterpolatedStrikeSmileDeltaTermStructure smileDeltaTermStructure5 =
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5();

    // Act and Assert
    assertEquals(smileDeltaTermStructure5, smileDeltaTermStructure5);
    int expectedHashCodeResult = smileDeltaTermStructure5.hashCode();
    assertEquals(expectedHashCodeResult, smileDeltaTermStructure5.hashCode());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InterpolatedStrikeSmileDeltaTermStructure.equals(Object)",
    "int InterpolatedStrikeSmileDeltaTermStructure.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure6(),
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5());
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InterpolatedStrikeSmileDeltaTermStructure.equals(Object)",
    "int InterpolatedStrikeSmileDeltaTermStructure.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FxVolatilitySmileDataSet.getSmileDeltaTermStructure5(), null);
  }

  /**
   * Test {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedStrikeSmileDeltaTermStructure#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean InterpolatedStrikeSmileDeltaTermStructure.equals(Object)",
    "int InterpolatedStrikeSmileDeltaTermStructure.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FxVolatilitySmileDataSet.getSmileDeltaTermStructure5(),
        "Different type to InterpolatedStrikeSmileDeltaTermStructure");
  }
}
