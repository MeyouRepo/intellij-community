// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.concurrency;

import org.jetbrains.annotations.NotNull;

final class AsyncFutureFactoryImpl extends AsyncFutureFactory {
  @Override
  public @NotNull <V> AsyncFutureResult<V> createAsyncFutureResult() {
    return new AsyncFutureResultImpl<>();
  }
}
