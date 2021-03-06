/*******************************************************************************
 * Copyright (c) 2020 Equo
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Guillermo Zunino, Equo - initial implementation
 *******************************************************************************/

/* Note: This file was auto-generated by org.eclipse.swt.tools.internal.JNIGenerator */
/* DO NOT EDIT - your changes will be lost. */

#include "swt.h"
#include "chromiumlib_stats.h"

#ifdef NATIVE_STATS

char * ChromiumLib_nativeFunctionNames[] = {
	"cef_1app_1t_1sizeof",
	"cef_1browser_1process_1handler_1t_1sizeof",
	"cef_1client_1t_1sizeof",
	"cef_1context_1menu_1handler_1t_1sizeof",
	"cef_1cookie_1visitor_1t_1sizeof",
	"cef_1display_1handler_1t_1sizeof",
	"cef_1focus_1handler_1t_1sizeof",
	"cef_1jsdialog_1handler_1t_1sizeof",
	"cef_1life_1span_1handler_1t_1sizeof",
	"cef_1load_1handler_1t_1sizeof",
	"cef_1popup_1features_1t_1sizeof",
	"cef_1request_1handler_1t_1sizeof",
	"cef_1string_1visitor_1t_1sizeof",
	"cefswt_1auth_1callback",
	"cefswt_1cefstring_1to_1java",
	"cefswt_1close_1browser",
	"cefswt_1context_1menu_1cancel",
	"cefswt_1cookie_1to_1java",
	"cefswt_1cookie_1value",
	"cefswt_1create_1browser",
	"cefswt_1cstring_1to_1java",
	"cefswt_1delete_1cookies",
	"cefswt_1dialog_1close",
	"cefswt_1do_1message_1loop_1work",
	"cefswt_1eval",
	"cefswt_1execute",
	"cefswt_1free",
	"cefswt_1function",
	"cefswt_1function_1arg",
	"cefswt_1function_1id",
	"cefswt_1function_1return",
	"cefswt_1get_1cookie",
	"cefswt_1get_1id",
	"cefswt_1get_1text",
	"cefswt_1get_1url",
	"cefswt_1go_1back",
	"cefswt_1go_1forward",
	"cefswt_1init",
	"cefswt_1is_1main_1frame",
	"cefswt_1is_1same",
	"cefswt_1load_1url",
	"cefswt_1reload",
	"cefswt_1request_1to_1java",
	"cefswt_1resized",
	"cefswt_1set_1cookie",
	"cefswt_1set_1focus",
	"cefswt_1set_1window_1info_1parent",
	"cefswt_1shutdown",
	"cefswt_1stop",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1app_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1browser_1process_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1client_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1context_1menu_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1cookie_1visitor_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1display_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1focus_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1jsdialog_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1life_1span_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1load_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1request_1handler_1t_2I",
	"memmove__JLorg_eclipse_swt_internal_chromium_lib_cef_1string_1visitor_1t_2I",
	"memmove__Lorg_eclipse_swt_internal_chromium_lib_cef_1popup_1features_1t_2JI",
};
#define NATIVE_FUNCTION_COUNT sizeof(ChromiumLib_nativeFunctionNames) / sizeof(char*)
int ChromiumLib_nativeFunctionCount = NATIVE_FUNCTION_COUNT;
int ChromiumLib_nativeFunctionCallCount[NATIVE_FUNCTION_COUNT];

#define STATS_NATIVE(func) Java_org_eclipse_swt_tools_internal_NativeStats_##func

JNIEXPORT jint JNICALL STATS_NATIVE(ChromiumLib_1GetFunctionCount)
	(JNIEnv *env, jclass that)
{
	return ChromiumLib_nativeFunctionCount;
}

JNIEXPORT jstring JNICALL STATS_NATIVE(ChromiumLib_1GetFunctionName)
	(JNIEnv *env, jclass that, jint index)
{
	return (*env)->NewStringUTF(env, ChromiumLib_nativeFunctionNames[index]);
}

JNIEXPORT jint JNICALL STATS_NATIVE(ChromiumLib_1GetFunctionCallCount)
	(JNIEnv *env, jclass that, jint index)
{
	return ChromiumLib_nativeFunctionCallCount[index];
}

#endif
