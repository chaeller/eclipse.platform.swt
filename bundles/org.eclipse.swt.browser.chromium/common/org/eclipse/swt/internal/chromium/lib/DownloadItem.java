/********************************************************************************
 * Copyright (c) 2021 Equo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Mauro Garcia, Equo - initial implementation
 ********************************************************************************/
package org.eclipse.swt.internal.chromium.lib;

public class DownloadItem {
	public int id;
	public int status;
	/** @field cast=(void*) */
	public long file;
	/** @field cast=(void*) */
	public long url;
	public long received;
	public long total;
	public long speed;
	public int percent;
}