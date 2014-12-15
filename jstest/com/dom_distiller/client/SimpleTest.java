// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.dom_distiller.client;

public class SimpleTest extends JsTestCase {

    public void testSuccess() {
        assertTrue(true);
        assertTrue("Failure message", true);
    }

    public void testFailure() {
        assertTrue("Failure message", false);
    }

}