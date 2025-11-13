package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilitiesTest.TestingIborCapletFloorletVolatilities;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilityIborCapFloorLegPricerDiffblueTest {
  /**
   * Test {@link
   * VolatilityIborCapFloorLegPricer#VolatilityIborCapFloorLegPricer(VolatilityIborCapletFloorletPeriodPricer)}.
   *
   * <p>Method under test: {@link
   * VolatilityIborCapFloorLegPricer#VolatilityIborCapFloorLegPricer(VolatilityIborCapletFloorletPeriodPricer)}
   */
  @Test
  @DisplayName("Test new VolatilityIborCapFloorLegPricer(VolatilityIborCapletFloorletPeriodPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilityIborCapFloorLegPricer.<init>(VolatilityIborCapletFloorletPeriodPricer)"
  })
  void testNewVolatilityIborCapFloorLegPricer() {
    // Arrange, Act and Assert
    VolatilityIborCapletFloorletPeriodPricer periodPricer =
        new VolatilityIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer.DEFAULT)
            .getPeriodPricer();
    assertTrue(periodPricer instanceof BlackIborCapletFloorletPeriodPricer);
    assertSame(BlackIborCapletFloorletPeriodPricer.DEFAULT, periodPricer);
  }

  /**
   * Test {@link VolatilityIborCapFloorLegPricer#getPeriodPricer()}.
   *
   * <p>Method under test: {@link VolatilityIborCapFloorLegPricer#getPeriodPricer()}
   */
  @Test
  @DisplayName("Test getPeriodPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityIborCapletFloorletPeriodPricer VolatilityIborCapFloorLegPricer.getPeriodPricer()"
  })
  void testGetPeriodPricer() {
    // Arrange, Act and Assert
    assertTrue(
        new VolatilityIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer.DEFAULT)
                .getPeriodPricer()
            instanceof BlackIborCapletFloorletPeriodPricer);
  }

  /**
   * Test {@link VolatilityIborCapFloorLegPricer#validate(RatesProvider,
   * IborCapletFloorletVolatilities)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then calls {@link TestingIborCapletFloorletVolatilities#getValuationDate()}.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityIborCapFloorLegPricer#validate(RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test validate(RatesProvider, IborCapletFloorletVolatilities); given LocalDate with '1970' and one and one; then calls getValuationDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilityIborCapFloorLegPricer.validate(RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testValidate_givenLocalDateWith1970AndOneAndOne_thenCallsGetValuationDate() {
    // Arrange
    MockRatesProvider ratesProvider = new MockRatesProvider(LocalDate.of(1970, 1, 1));

    TestingIborCapletFloorletVolatilities volatilities =
        mock(TestingIborCapletFloorletVolatilities.class);
    when(volatilities.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    // Act
    VolatilityIborCapFloorLegPricer.DEFAULT.validate(ratesProvider, volatilities);

    // Assert
    verify(volatilities).getValuationDate();
  }
}
