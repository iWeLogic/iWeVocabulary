@file:OptIn(ExperimentalPagerApi::class)

package com.iwelogic.onboarding_presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import com.iwelogic.core.R

@Composable
fun OnboardingScreen(navHostController: NavHostController, onClickOpenMain: () -> Unit) {
    OnboardingContent(navHostController, onClickOpenMain)
}

@Composable
fun OnboardingContent(navHostController: NavHostController, onClickOpenMain: () -> Unit) {

    Column {
        val scope = rememberCoroutineScope()
        val pagerState = rememberPagerState(0)

        HorizontalPager(
            count = OnboardingPages.values().size,
            state = pagerState,
            modifier = Modifier.weight(1.0f)
        ) { pageIndex ->
            Page(page = OnboardingPages.values().first { it.pageIndex == pageIndex })
        }

        IndicatorAndButton(pagerState, {
            onClickOpenMain.invoke()
        }, {
            scope.launch {
                if (pagerState.currentPage < OnboardingPages.values().size - 1)
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
            }
        })
    }
}

@Composable
@Preview
fun Page(page: OnboardingPages = OnboardingPages.FIRST) {
    Column(
        modifier = Modifier
            .padding(0.dp, 16.dp, 0.dp, 0.dp)
    ) {
        Image(
            modifier = Modifier
                .weight(10.0f)
                .padding(0.dp, 16.dp, 0.dp, 0.dp),
            painter = painterResource(id = page.imageId),
            contentDescription = "",
            contentScale = ContentScale.Inside
        )

        Text(
            text = stringResource(page.title),
            modifier = Modifier
                .weight(3.0f)
                .padding(32.dp, 16.dp, 32.dp, 0.dp)
                .align(CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h6
        )

        Text(
            text = AnnotatedString(text = stringResource(page.text)),
            modifier = Modifier.weight(5.0f).padding(32.dp, 16.dp, 32.dp, 0.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Composable
fun IndicatorAndButton(pagerState: PagerState, onClickContinue: () -> Unit, onClickSkip: () -> Unit) {

    val page = OnboardingPages.values().first { it.pageIndex == pagerState.currentPage }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(0.dp, 0.dp, 16.dp, 32.dp)
    ) {

        Image(
            painter = painterResource(id = page.indicatorImageId),
            contentDescription = "",
            contentScale = ContentScale.Inside
        )

        Spacer(modifier = Modifier.weight(1.0f))

        val isLastPage = page == OnboardingPages.FIFTH
        ClickableText(
            onClick = {
                if (isLastPage) onClickContinue.invoke() else onClickSkip.invoke()
            },
            text = AnnotatedString(stringResource(id = if (isLastPage) R.string.str_continue else R.string.skip)),
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.button
        )
    }
}