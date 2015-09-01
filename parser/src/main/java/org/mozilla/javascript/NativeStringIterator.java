/* -*- Mode: java; tab-width: 8; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.javascript;

public final class NativeStringIterator extends ES6Iterator {
    private static final long serialVersionUID = 1L;
    private static final String ITERATOR_TAG = "StringIterator";

    static void init(ScriptableObject scope, boolean sealed) {
        ES6Iterator.init(scope, sealed, new NativeStringIterator(), ITERATOR_TAG);
    }

    /**
     * Only for constructing the prototype object.
     */
    private NativeStringIterator() {
        super();
    }

    NativeStringIterator(Scriptable scope, Scriptable stringLike) {
        super(scope);
        this.index = 0;
        this.string  = ScriptRuntime.toString(stringLike);
    }

    @Override
    public String getClassName() {
        return "String Iterator";
    }

    @Override
    Object next(Context cx, Scriptable scope) {
        Object value = Undefined.instance;
        boolean done = index >= string.length();
        if (!done) {
            int newIndex = string.offsetByCodePoints(index, 1);
            value = string.substring(index, newIndex);
            index = newIndex;
        }
        return makeIteratorResult(cx, scope, done, value);
    }

    @Override
    String getTag() {
        return ITERATOR_TAG;
    }

    private String string;
    private int index;
}