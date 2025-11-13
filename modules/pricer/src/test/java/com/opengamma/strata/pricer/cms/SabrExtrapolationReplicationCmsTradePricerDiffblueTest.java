package com.opengamma.strata.pricer.cms;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.swaption.SabrSwaptionVolatilities;
import com.opengamma.strata.product.cms.ResolvedCms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SabrExtrapolationReplicationCmsTradePricerDiffblueTest {
  /**
   * Test {@link SabrExtrapolationReplicationCmsTradePricer#explainPresentValue(ResolvedCms,
   * RatesProvider, SabrSwaptionVolatilities)}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrExtrapolationReplicationCmsTradePricer#explainPresentValue(ResolvedCms, RatesProvider,
   * SabrSwaptionVolatilities)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedCms, RatesProvider, SabrSwaptionVolatilities); then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap SabrExtrapolationReplicationCmsTradePricer.explainPresentValue(ResolvedCms, RatesProvider, SabrSwaptionVolatilities)"
  })
  void testExplainPresentValue_thenReturnEmpty() {
    // Arrange
    SabrExtrapolationReplicationCmsProductPricer cmsProductPricer =
        mock(SabrExtrapolationReplicationCmsProductPricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(cmsProductPricer.explainPresentValue(
            Mockito.<ResolvedCms>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<SabrSwaptionVolatilities>any()))
        .thenReturn(emptyResult);
    SabrExtrapolationReplicationCmsTradePricer sabrExtrapolationReplicationCmsTradePricer =
        new SabrExtrapolationReplicationCmsTradePricer(cmsProductPricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        sabrExtrapolationReplicationCmsTradePricer.explainPresentValue(
            null, new MockRatesProvider(), null);

    // Assert
    verify(cmsProductPricer).explainPresentValue(isNull(), isA(RatesProvider.class), isNull());
    assertSame(emptyResult, actualExplainPresentValueResult);
  }
}
