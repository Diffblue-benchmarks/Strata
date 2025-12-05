package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.ImmutableHolidayCalendar.Meta;
import org.joda.beans.BeanBuilder;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.BufferingBeanBuilder;
import org.joda.beans.impl.StandaloneMetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableHolidayCalendarDeserializerDiffblueTest {
  /**
   * Test {@link ImmutableHolidayCalendarDeserializer#createBuilder(Class, MetaBean)}.
   *
   * <ul>
   *   <li>When {@link AdjustableDate.Meta#INSTANCE}.
   *   <li>Then return {@link BufferingBeanBuilder}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendarDeserializer#createBuilder(Class,
   * MetaBean)}
   */
  @Test
  @DisplayName(
      "Test createBuilder(Class, MetaBean); when INSTANCE; then return BufferingBeanBuilder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BeanBuilder ImmutableHolidayCalendarDeserializer.createBuilder(Class, MetaBean)"
  })
  void testCreateBuilder_whenInstance_thenReturnBufferingBeanBuilder() {
    // Arrange
    ImmutableHolidayCalendarDeserializer immutableHolidayCalendarDeserializer =
        new ImmutableHolidayCalendarDeserializer();
    Class<Object> beanType = Object.class;

    // Act
    BeanBuilder<?> actualCreateBuilderResult =
        immutableHolidayCalendarDeserializer.createBuilder(beanType, AdjustableDate.Meta.INSTANCE);

    // Assert
    assertTrue(actualCreateBuilderResult instanceof BufferingBeanBuilder);
    assertTrue(((BufferingBeanBuilder) actualCreateBuilderResult).getBuffer().isEmpty());
    assertSame(
        AdjustableDate.Meta.INSTANCE,
        ((BufferingBeanBuilder) actualCreateBuilderResult).getMetaBean());
  }

  /**
   * Test {@link ImmutableHolidayCalendarDeserializer#findMetaProperty(Class, MetaBean, String)}.
   *
   * <ul>
   *   <li>When {@code holidays}.
   *   <li>Then metaBean return {@link Meta}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendarDeserializer#findMetaProperty(Class,
   * MetaBean, String)}
   */
  @Test
  @DisplayName(
      "Test findMetaProperty(Class, MetaBean, String); when 'holidays'; then metaBean return Meta")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty ImmutableHolidayCalendarDeserializer.findMetaProperty(Class, MetaBean, String)"
  })
  void testFindMetaProperty_whenHolidays_thenMetaBeanReturnMeta() {
    // Arrange
    ImmutableHolidayCalendarDeserializer immutableHolidayCalendarDeserializer =
        new ImmutableHolidayCalendarDeserializer();
    Class<HolidayCalendarId> beanType = HolidayCalendarId.class;

    // Act
    MetaProperty<?> actualFindMetaPropertyResult =
        immutableHolidayCalendarDeserializer.findMetaProperty(
            beanType, AdjustableDate.Meta.INSTANCE, "holidays");

    // Assert
    MetaBean metaBeanResult = actualFindMetaPropertyResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualFindMetaPropertyResult instanceof StandaloneMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lookup() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).weekends() instanceof DirectMetaProperty);
    assertEquals("holidays", actualFindMetaPropertyResult.name());
    assertEquals(PropertyStyle.READ_WRITE, actualFindMetaPropertyResult.style());
    assertTrue(metaBeanResult.isBuildable());
  }
}
