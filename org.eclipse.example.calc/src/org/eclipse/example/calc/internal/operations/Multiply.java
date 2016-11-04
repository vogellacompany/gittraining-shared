/*******************************************************************************
 * Copyright (C) 2010, Matthias Sohn <matthias.sohn@sap.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
<<<<<<< Upstream, based on d29c17eed24fe0c4ee27449cef7473ded5ddc186
<<<<<<< Upstream, based on d29c17eed24fe0c4ee27449cef7473ded5ddc186
 * Binary multiply operation
=======
 * Binary plus operation
>>>>>>> 5ce1189 First Implementation of Multiply
=======
 * Binary multiply operation
>>>>>>> b6bf6f9 Kommentar korrigiert
 */
public class Multiply extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 * arg2;
	}

	@Override
	public String getName() {
		return "*";
	}

}
