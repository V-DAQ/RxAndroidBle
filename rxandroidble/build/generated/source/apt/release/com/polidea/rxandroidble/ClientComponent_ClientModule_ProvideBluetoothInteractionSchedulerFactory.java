// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble;

import bleshadow.dagger.internal.Factory;
import bleshadow.dagger.internal.Preconditions;
import bleshadow.javax.inject.Provider;
import java.util.concurrent.ExecutorService;
import rx.Scheduler;

public final class ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory
    implements Factory<Scheduler> {
  private final Provider<ExecutorService> serviceProvider;

  public ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory(
      Provider<ExecutorService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Scheduler get() {
    return Preconditions.checkNotNull(
        ClientComponent.ClientModule.provideBluetoothInteractionScheduler(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory create(
      Provider<ExecutorService> serviceProvider) {
    return new ClientComponent_ClientModule_ProvideBluetoothInteractionSchedulerFactory(
        serviceProvider);
  }

  public static Scheduler proxyProvideBluetoothInteractionScheduler(ExecutorService service) {
    return Preconditions.checkNotNull(
        ClientComponent.ClientModule.provideBluetoothInteractionScheduler(service),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
