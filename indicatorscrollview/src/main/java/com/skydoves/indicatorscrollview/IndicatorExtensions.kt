/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.skydoves.indicatorscrollview

import android.content.Context
import android.view.View

/** creates an instance of [IndicatorItem] by [IndicatorItem.Builder] using kotlin dsl. */
@JvmSynthetic
@IndicatorItemDsl
fun indicatorItem(target: View, block: IndicatorItem.Builder.() -> Unit): IndicatorItem =
  IndicatorItem.Builder(target).apply(block).build()

/** creates an instance of [IndicatorView] by [IndicatorView.Builder] using kotlin dsl. */
@JvmSynthetic
@IndicatorViewDsl
fun indicatorView(context: Context, block: IndicatorView.Builder.() -> Unit): IndicatorView =
  IndicatorView.Builder(context).apply(block).build()
