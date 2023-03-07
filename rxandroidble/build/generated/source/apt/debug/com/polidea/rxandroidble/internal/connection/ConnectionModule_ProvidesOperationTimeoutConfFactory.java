// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal.connection;

import bleshadow.dagger.internal.Factory;
import bleshadow.dagger.internal.Preconditions;
import bleshadow.javax.inject.Provider;
import com.polidea.rxandroidble.internal.operations.TimeoutConfiguration;
import rx.Scheduler;

public final class ConnectionModule_ProvidesOperationTimeoutConfFactory
    implements Factory<TimeoutConfiguration> {
  private final ConnectionModule module;

  private final Provider<Scheduler> timeoutSchedulerProvider;

  public ConnectionModule_ProvidesOperationTimeoutConfFactory(
      ConnectionModule module, Provider<Scheduler> timeoutSchedulerProvider) {
    this.module = module;
    this.timeoutSchedulerProvider = timeoutSchedulerProvider;
  }

  @Override
  public TimeoutConfiguration get() {
    return Preconditions.checkNotNull(
        module.providesOperationTimeoutConf(timeoutSchedulerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ConnectionModule_ProvidesOperationTimeoutConfFactory create(
      ConnectionModule module, Provider<Scheduler> timeoutSchedulerProvider) {
    return new ConnectionModule_ProvidesOperationTimeoutConfFactory(
        module, timeoutSchedulerProvider);
  }

  public static TimeoutConfiguration proxyProvidesOperationTimeoutConf(
      ConnectionModule instance, Scheduler timeoutScheduler) {
    return Preconditions.checkNotNull(
        instance.providesOperationTimeoutConf(timeoutScheduler),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
