/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.enjekt.panda.blackvault.internal.beans;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.enjekt.panda.commons.api.BlackVaultDatastore;
import org.enjekt.panda.commons.models.FamilyId;
import org.enjekt.panda.commons.models.Pad;
import org.enjekt.panda.commons.models.Token;


/**
 * The Class PadRetrieveHandler.
 */
public class PadRetrieveHandler{

	public PadRetrieveHandler(){}
	
	public PadRetrieveHandler(BlackVaultDatastore datastore){
		this.datastore=datastore; 
	}
	
	/** The datastore used to store the token and its related pad. */
	private BlackVaultDatastore datastore;
	

	/**
	 * Gets the pad for token to be returned to the white vault
	 *
	 * @param token used to identify the pad to be returned.
	 * @return the pad associated with the token which is returned.
	 */
	public Pad getPadForToken(Token token) {
		return datastore.getPadForToken(token);
	}


	/**
	 * Gets the datastore.
	 *
	 * @return the datastore
	 */
	public BlackVaultDatastore getDatastore() {
		return datastore;
	}


	/**
	 * Sets the datastore.
	 *
	 * @param datastore the new datastore
	 */
	public void setDatastore(BlackVaultDatastore datastore) {
		this.datastore = datastore;
	}

}
