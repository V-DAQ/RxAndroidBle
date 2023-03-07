// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal.connection;

import bleshadow.dagger.internal.Factory;
import bleshadow.dagger.internal.Preconditions;
import bleshadow.javax.inject.Provider;

public final class ConnectionModule_ProvideIllegalOperationHandlerFactory
    implements Factory<IllegalOperationHandler> {
  private final ConnectionModule module;

  private final Provider<LoggingIllegalOperationHandler> loggingIllegalOperationHandlerProvider;

  private final Provider<ThrowingIllegalOperationHandler> throwingIllegalOperationHandlerProvider;

  public ConnectionModule_ProvideIllegalOperationHandlerFactory(
      ConnectionModule module,
      Provider<LoggingIllegalOperationHandler> loggingIllegalOperationHandlerProvider,
      Provider<ThrowingIllegalOperationHandler> throwingIllegalOperationHandlerProvider) {
    this.module = module;
    this.loggingIllegalOperationHandlerProvider = loggingIllegalOperationHandlerProvider;
    this.throwingIllegalOperationHandlerProvider = throwingIllegalOperationHandlerProvider;
  }

  @Override
  public IllegalOperationHandler get() {
    return Preconditions.checkNotNull(
        module.provideIllegalOperationHandler(
            loggingIllegalOperationHandlerProvider, throwingIllegalOperationHandlerProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ConnectionModule_ProvideIllegalOperationHandlerFactory create(
      ConnectionModule module,
      Provider<LoggingIllegalOperationHandler> loggingIllegalOperationHandlerProvider,
      Provider<ThrowingIllegalOperationHandler> throwingIllegalOperationHandlerProvider) {
    return new ConnectionModule_ProvideIllegalOperationHandlerFactory(
        module, loggingIllegalOperationHandlerProvider, throwingIllegalOperationHandlerProvider);
  }

  public static IllegalOperationHandler proxyProvideIllegalOperationHandler(
      ConnectionModule instance,
      Provider<LoggingIllegalOperationHandler> loggingIllegalOperationHandlerProvider,
      Provider<ThrowingIllegalOperationHandler> throwingIllegalOperationHandlerProvider) {
    return Preconditions.checkNotNull(
        instance.provideIllegalOperationHandler(
            loggingIllegalOperationHandlerProvider, throwingIllegalOperationHandlerProvider),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
