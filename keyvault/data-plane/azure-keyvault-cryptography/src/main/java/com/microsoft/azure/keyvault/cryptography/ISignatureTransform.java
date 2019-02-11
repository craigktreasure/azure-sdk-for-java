// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.keyvault.cryptography;

import java.security.GeneralSecurityException;

public interface ISignatureTransform {

    public byte[] sign(final byte[] digest) throws GeneralSecurityException;

    public boolean verify(final byte[] digest, final byte[] signature) throws GeneralSecurityException;
}
