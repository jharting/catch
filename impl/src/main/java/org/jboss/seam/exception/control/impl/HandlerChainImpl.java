/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.jboss.seam.exception.control.impl;

import org.jboss.seam.exception.control.HandlerChain;

/**
 * Implementation of the {@link org.jboss.seam.exception.control.HandlerChain} interface. Provides a package private method to check if the chain needs to end.
 */
public class HandlerChainImpl implements HandlerChain
{
   private boolean chainEnd;

   /**
    * End execution of the chain. Calling this method will immediately stop executing the handler chain, leaving any handlers left
    * in the chain as uncalled.
    */
   public void end()
   {
      this.chainEnd = true;
   }

   /**
    * @return flag indicating if the chain should continue execution
    */
   boolean isChainEnd()
   {
      return this.chainEnd;
   }
}