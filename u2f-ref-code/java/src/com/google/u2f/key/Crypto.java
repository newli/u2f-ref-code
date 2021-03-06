// Copyright 2014 Google Inc. All rights reserved.
//
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file or at
// https://developers.google.com/open-source/licenses/bsd

package com.google.u2f.key;

import java.security.PrivateKey;

import com.google.u2f.U2FException;

public interface Crypto {
  byte[] sign(byte[] signedData, PrivateKey certificatePrivateKey) throws U2FException;
}
