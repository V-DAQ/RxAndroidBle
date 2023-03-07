// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal;

import bleshadow.dagger.internal.Factory;
import bleshadow.dagger.internal.Preconditions;

public final class DeviceModule_ProvideMacAddressFactory implements Factory<String> {
  private final DeviceModule module;

  public DeviceModule_ProvideMacAddressFactory(DeviceModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideMacAddress(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DeviceModule_ProvideMacAddressFactory create(DeviceModule module) {
    return new DeviceModule_ProvideMacAddressFactory(module);
  }

  public static String proxyProvideMacAddress(DeviceModule instance) {
    return Preconditions.checkNotNull(
        instance.provideMacAddress(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
