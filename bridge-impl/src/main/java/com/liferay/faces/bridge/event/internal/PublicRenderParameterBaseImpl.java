/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.event.internal;

/**
 * @author  Neil Griffin
 */
public abstract class PublicRenderParameterBaseImpl implements PublicRenderParameter {

	// Protected Data Members
	protected boolean forThisPortlet;
	protected String modelEL;
	protected String originalRequestValue;

	public PublicRenderParameterBaseImpl(String prefix, String originalRequestValue, String originalModelEL,
		String portletName) {

		this.originalRequestValue = originalRequestValue;
		this.modelEL = originalModelEL;

		if (prefix == null) {
			this.forThisPortlet = true;
		}
		else {
			this.forThisPortlet = prefix.equals(portletName);
		}
	}
}
