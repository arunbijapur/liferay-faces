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
package com.liferay.faces.alloy.component.selectmanymenu;

import javax.faces.render.FacesRenderer;


/**
 * @author  Vernon Singleton
 */
@FacesRenderer(componentFamily = SelectManyMenu.COMPONENT_FAMILY, rendererType = SelectManyMenu.RENDERER_TYPE)
public class SelectManyMenuRenderer extends SelectManyMenuRendererBase {

	@Override
	public String getDelegateComponentFamily() {
		return SelectManyMenu.DELEGATE_COMPONENT_FAMILY;
	}

	@Override
	public String getDelegateRendererType() {
		return SelectManyMenu.DELEGATE_RENDERER_TYPE;
	}
}
