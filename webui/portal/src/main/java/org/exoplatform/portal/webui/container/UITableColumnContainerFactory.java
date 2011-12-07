/*
 * Copyright (C) 2011 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.portal.webui.container;

import org.exoplatform.webui.application.WebuiApplication;
import org.exoplatform.webui.application.WebuiRequestContext;

/**
 * This factory simply creates UIContainer objects, it is required because a factory-id named TableColumnContainer
 * had been introduced in Gatein code base
 *
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date 12/7/11
 */
public class UITableColumnContainerFactory extends UIContainerFactory
{

   @Override
   public String getFactoryID()
   {
      return UIContainer.TABLE_COLUMN_CONTAINER;
   }

   @Override
   public UIContainer createContainer(WebuiRequestContext requestContext) throws Exception
   {
      WebuiApplication app = (WebuiApplication)requestContext.getApplication();
      return app.createUIComponent(UIContainer.class, null, null, requestContext);
   }
}