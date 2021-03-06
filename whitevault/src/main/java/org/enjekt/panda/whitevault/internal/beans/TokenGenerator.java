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
package org.enjekt.panda.whitevault.internal.beans;

import javax.inject.Named;
import javax.inject.Singleton;

import org.enjekt.panda.commons.models.Pad;
import org.enjekt.panda.commons.models.Pan;
import org.enjekt.panda.commons.models.Token;
import org.enjekt.panda.commons.utils.Utils;

/**
 * The Class TokenGenerator.
 */
@Singleton
@Named("TokenGenerator")
public class TokenGenerator {


	/**
	 * Generate token and make sure it does not pass a luhn check
	 * so it can't be confused with a real card.
	 *
	 * @param pan the pan
	 * @return the token
	 */
	public Token generateToken(Pan pan) {
		//System.out.println(pan + " in TokenGenerator");
		Boolean luhnValid = Boolean.TRUE;
		Token token;
		do {
			token = Utils.createToken(pan.getPan());
			luhnValid=Utils.luhnVerify(token);
		} while(luhnValid);
		//System.out.println("In generator: "+ token);
		return token;
	}
	
	public Pad generatePad(Pan pan){
		return Utils.createPad(pan.getPan());
	}



	
	

}
