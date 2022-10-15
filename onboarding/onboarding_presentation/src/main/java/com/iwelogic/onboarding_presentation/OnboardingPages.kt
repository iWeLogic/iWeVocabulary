package com.iwelogic.onboarding_presentation

import com.iwelogic.core.R

enum class OnboardingPages(val pageIndex: Int, val imageId: Int, val indicatorImageId: Int, val title: Int, val text: Int) {
    FIRST(0, R.drawable.onboarding_1, R.drawable.indicator_1, R.string.onboarding_title_1, R.string.onboarding_text_1),
    SECOND(1, R.drawable.onboarding_2, R.drawable.indicator_2, R.string.onboarding_title_2, R.string.onboarding_text_2),
    THIRD(2, R.drawable.onboarding_3, R.drawable.indicator_3, R.string.onboarding_title_3, R.string.onboarding_text_3),
    FOURTH(3, R.drawable.onboarding_4, R.drawable.indicator_4, R.string.onboarding_title_4, R.string.onboarding_text_4),
    FIFTH(4, R.drawable.onboarding_5, R.drawable.indicator_5, R.string.onboarding_title_5, R.string.onboarding_text_5),
}