package eu.inn.biometric.signature.crypto;

/*
 * #%L
 * BioSignIn (Biometric Signature Interface) Core [http://www.biosignin.org]
 * ICryptoProvider.java is part of BioSignIn project
 * %%
 * Copyright (C) 2014 Innovery SpA
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */


import java.util.List;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
public interface ICryptoProvider {

	byte[] encrypt(byte[] data, List<X509Certificate> certs, Integer maxKeyLength) throws Exception;
	byte[] decrypt(byte[] data, PrivateKey key);
	byte[] b64Encode(byte[] data);
	byte[] b64Decode(byte[] data);
	void addProvider();
}
